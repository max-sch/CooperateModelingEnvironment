package de.cooperateproject.modeling.transformation.transformations.impl;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.m2m.internal.qvt.oml.evaluator.QVTEvaluationOptions;
import org.eclipse.m2m.internal.qvt.oml.expressions.DirectionKind;
import org.eclipse.m2m.internal.qvt.oml.expressions.OperationalTransformation;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.m2m.qvt.oml.util.Trace;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import de.cooperateproject.modeling.transformation.transformations.Activator;

public abstract class DomainIndependentTransformationBase {

	private final Map<URI, QVTOResource> specialMappings = Maps.newHashMap();
	private final ResourceSet rs;

	protected DomainIndependentTransformationBase(ResourceSet rs) {
		this.rs = rs;
	}
	
	protected IStatus transform(URI transformationURI, Collection<URI> parameterURIs) throws IOException {
		return transform(transformationURI, Optional.empty(), parameterURIs);
	}
	
	protected IStatus transform(URI transformationURI, URI traceURI, Collection<URI> parameterURIs) throws IOException {
		return transform(transformationURI, Optional.of(traceURI), parameterURIs);
	}

	private IStatus transform(URI transformationURI, Optional<URI> traceURI, Collection<URI> parameterURIs) throws IOException {
		final Optional<Trace> transformationTrace = createTrace(traceURI);
		final List<Pair<ModelExtent, Resource>> transformationResources = Lists.newArrayList();
		for (URI parameterURI : parameterURIs) {
			transformationResources.add(createPair(createModelExtent(parameterURI), createResource(parameterURI)));
		}
		final Collection<ModelExtent> transformationParameters = transformationResources.stream().map(r -> r.getFirst())
				.collect(Collectors.toList());

		IStatus transformationResult = transform(transformationURI, transformationParameters, transformationTrace);
		if (transformationResult.getSeverity() == IStatus.OK) {
			saveTransformationResources(transformationURI, transformationResources);
			saveTraceModel(traceURI, transformationTrace);
		}
		return transformationResult;
	}

	private IStatus transform(URI transformationURI, Collection<ModelExtent> transformationParameters,
			Optional<Trace> transformationTrace) {

		ExecutionContextImpl context = new ExecutionContextImpl();
		if (transformationTrace.isPresent()) {
			context.getSessionData().setValue(QVTEvaluationOptions.INCREMENTAL_UPDATE_TRACE, transformationTrace.get());
		}
		context.setConfigProperty("keepModeling", true);

		TransformationExecutor executor = new TransformationExecutor(transformationURI);
		ExecutionDiagnostic result = executor.execute(context, transformationParameters.toArray(new ModelExtent[0]));

		if (result.getSeverity() != Diagnostic.OK) {
			IStatus status = BasicDiagnostic.toIStatus(result);
			Activator.getDefault().getLog().log(status);
		}

		return BasicDiagnostic.toIStatus(result);
	}

	private void saveTransformationResources(URI transformationURI,
			List<Pair<ModelExtent, Resource>> transformationResources) throws IOException {
		List<Integer> indicesToSave = determineParameterIndicesToSave(transformationURI);
		List<Pair<ModelExtent, Resource>> resourcesToSave = indicesToSave.stream()
				.map(i -> transformationResources.get(i)).collect(Collectors.toList());
		save(resourcesToSave);
	}

	private List<Integer> determineParameterIndicesToSave(URI transformationURI) throws IOException {
		QVTOResource resource = getQVTOResource(transformationURI);
		OperationalTransformation transformation = resource.getFirstTransformation();
		List<Integer> saveIndices = transformation.getModelParameter().stream()
				.filter(p -> p.getKind() != DirectionKind.IN).map(p -> transformation.getModelParameter().indexOf(p))
				.collect(Collectors.toList());
		return saveIndices;
	}

	private void save(List<Pair<ModelExtent, Resource>> transformationResources) throws IOException {
		for (Pair<ModelExtent, Resource> transformationResource : transformationResources) {
			save(transformationResource);
		}
	}

	private void save(Pair<ModelExtent, Resource> transformationResource) throws IOException {
		Resource resource = transformationResource.getSecond();
		ModelExtent transformationResult = transformationResource.getFirst();

		if (transformationResult.getContents().stream().anyMatch(o -> !resource.equals(o.eResource()))) {
			resource.getContents().clear();
			resource.getContents().addAll(transformationResource.getFirst().getContents());
		}

		resource.save(Collections.emptyMap());
	}

	private Optional<Trace> createTrace(Optional<URI> traceURI) {
		if (!traceURI.isPresent()) {
			return Optional.empty();
		}
		Trace traceModel = Trace.createEmptyTrace();
		if (rs.getURIConverter().exists(traceURI.get(), Collections.emptyMap())) {
			Resource traceResource = rs.getResource(traceURI.get(), true);
			traceModel = new Trace(traceResource.getContents());
		} else {
			Resource traceResource = rs.createResource(traceURI.get());
			traceResource.getContents().addAll(traceModel.getTraceContent());
		}
		return Optional.of(traceModel);
	}

	private void saveTraceModel(Optional<URI> traceURI, Optional<Trace> traceModel) throws IOException {
		if (!traceModel.isPresent() || !traceURI.isPresent()) {
			return;
		}

		Resource traceResource = rs.getResource(traceURI.get(), true);
		if (traceResource == null) {
			traceResource = rs.createResource(traceURI.get());
		}
		traceResource.getContents().clear();
		traceResource.getContents().addAll(traceModel.get().getTraceContent());
		traceResource.save(Collections.emptyMap());
	}

	private Resource createResource(URI uri) throws IOException {
		if ("qvto".equals(uri.fileExtension())) {
			return getQVTOResource(uri);
		} else if (rs.getURIConverter().exists(uri, Collections.emptyMap())) {
			return rs.getResource(uri.trimFragment().trimQuery(), false);
		} else {
			return rs.createResource(uri);
		}
	}
	
	private QVTOResource getQVTOResource(URI uri) throws IOException {
		if (!specialMappings.containsKey(uri)) {
			specialMappings.put(uri, new QVTOResource(uri, rs.getPackageRegistry()));
		}
		return specialMappings.get(uri);
	}

	private ModelExtent createModelExtent(URI uri) throws IOException {
		EObject rootObject = null;
		if ("qvto".equals(uri.fileExtension())) {
			rootObject = getQVTOResource(uri).getFirstTransformation();
		} else if (uri.hasFragment()) {
			rootObject = rs.getEObject(uri, false);
		} else {
			Resource r = rs.getResource(uri, false);
			rootObject = r != null ? r.getContents().get(0) : null;
		}
		return createModelExtent(rootObject);
	}

	private static ModelExtent createModelExtent(EObject rootElement) {
		BasicModelExtent modelExtent = new BasicModelExtent();
		if (rootElement != null) {
			modelExtent.add(rootElement);			
		}
		return modelExtent;
	}

	private static <T, S> Pair<T, S> createPair(T first, S second) {
		return new Pair<T, S>(first, second);
	}

	protected static class Pair<T, S> {
		private final T first;
		private final S second;

		public Pair(T first, S second) {
			super();
			this.first = first;
			this.second = second;
		}

		public T getFirst() {
			return first;
		}

		public S getSecond() {
			return second;
		}
	}

}
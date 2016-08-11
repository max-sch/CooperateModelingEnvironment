package de.cooperateproject.modeling.transformation.transformations.tests.transforms.plain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Function;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.utils.EMFComparePrettyPrinter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.ocl.uml.OCL;
import org.eclipse.papyrus.infra.viewpoints.style.StylePackage;
import org.junit.Before;
import org.junit.BeforeClass;

import de.cooperateproject.modeling.transformation.transformations.Activator;
import de.cooperateproject.modeling.transformation.transformations.tests.Constants;
import de.cooperateproject.modeling.transformation.transformations.tests.util.Log4JLogger;
import de.cooperateproject.modeling.transformation.transformations.tests.util.ModelComparator;


public abstract class PlainTransformationTestBase {

	private static final Logger LOGGER = Logger.getLogger(PlainTransformationTestBase.class);
	private static final URI UML_PRIMITIVE_TYPES = URI.createURI("pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml");
	private ResourceSet resourceSet;
	
	@BeforeClass
	public static void init() throws Exception {
		BasicConfigurator.resetConfiguration();
		BasicConfigurator.configure(new ConsoleAppender(new PatternLayout("%m%n")));
		
		if (!isPluginEnvironment()) {
			EcorePlugin.getPlatformResourceMap().put(Activator.PLUGIN_ID, determinePluginUri(Activator.PLUGIN_ID, Activator.class));
			EcorePlugin.getPlatformResourceMap().put(Constants.PLUGIN_ID, determinePluginUri(Constants.PLUGIN_ID, Constants.class));			

			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
			OCL.initialize(null);
			NotationPackage.eINSTANCE.eClass();
			StylePackage.eINSTANCE.eClass();
		}
	}
	
	private static URI determinePluginUri(String pluginId, Class<?> classOfPlugin) throws URISyntaxException {
		Path p = Paths.get(classOfPlugin.getProtectionDomain().getCodeSource().getLocation().toURI());
		while (p.getParent() != null && !p.getFileName().toString().equals(pluginId)) {
			p = p.getParent();
		}
		return URI.createFileURI(p.toAbsolutePath().toFile().toString() + "/");
	}
	
	@Before
	public void setup() throws Exception {
		resourceSet = new ResourceSetImpl();
	}
	
	protected ResourceSet getResourceSet() {
		return resourceSet;
	}
	
	protected ModelExtent runTransformation(URI transformationURI, URI sourceModelURI, URI umlModelURI) throws IOException {
		ModelExtent source = createModelExtent(createResource(resourceSet, sourceModelURI));
		ModelExtent uml = createModelExtent(createResource(resourceSet, umlModelURI));
		ModelExtent umlPrimitives = createModelExtent(createResource(resourceSet, UML_PRIMITIVE_TYPES));
		ModelExtent destination = new BasicModelExtent();
		

		TransformationExecutor executor = new TransformationExecutor(transformationURI);
		ExecutionContextImpl ctx = new ExecutionContextImpl();
		ctx.setLog(new Log4JLogger(LOGGER, Level.INFO));		
		ExecutionDiagnostic result = executor.execute(ctx, new ModelExtent[] {source, destination, uml, umlPrimitives});
		assertEquals(ExecutionDiagnostic.OK, result.getSeverity());

		URI virtualResultModelURI = umlModelURI.trimFileExtension().trimFragment().trimQuery().trimSegments(1).appendSegment("resultModel").appendFileExtension("xmi");
		Resource resultResource = createResource(resourceSet, virtualResultModelURI);
		resultResource.getContents().addAll(destination.getContents());
		
		return destination;
	}
	
	protected EObject getRootElement(URI modelUri) throws IOException {
		Resource r = createResource(getResourceSet(), modelUri);
		return r.getContents().get(0);
	}
	
	protected void assertModelEquals(EObject expected, EObject actual) throws UnsupportedEncodingException {
		assertModelEquals(expected, actual, (c -> Collections.emptyList()));
	}
	
	protected static void assertModelEquals(EObject expected, EObject actual,
			Function<Collection<Diff>, Collection<Diff>> diffProcessor) throws UnsupportedEncodingException {
		Comparison result = ModelComparator.compare(expected, actual);
		Collection<Diff> ignoredDiffs = diffProcessor.apply(result.getDifferences());
		ignoredDiffs.stream().forEach(PlainTransformationTestBase::removeDifference);
		assertTrue(prettyPrint(result), result.getDifferences().isEmpty());
	}
	

	
	// Utility methods
	
	public static URI createTransformationURI(String filename) {
		String pathName = String.format("/%s/transforms/%s", Activator.PLUGIN_ID, filename);
		return createPlatformURI(pathName);
	}
	
	public static URI createResourceModelURI(String filename) {
		String pathName = String.format("/%s/models/%s", Constants.PLUGIN_ID, filename);
		return createPlatformURI(pathName);
	}
	
	public static boolean isPluginEnvironment() {
		return ResourcesPlugin.getPlugin() != null;
	}
	
	private static String prettyPrint(Comparison comparison) throws UnsupportedEncodingException {
		ByteArrayOutputStream baos = null;
		PrintStream ps = null;
		try {
			baos = new ByteArrayOutputStream();
			ps = new PrintStream(baos);
			EMFComparePrettyPrinter.printDifferences(comparison, ps);
			return new String(baos.toByteArray(), "UTF-8");
		} finally {
			IOUtils.closeQuietly(ps);
			IOUtils.closeQuietly(baos);
		}
	}
	
	private static URI createPlatformURI(String pathName) {
		if (!isPluginEnvironment()) {
			return URI.createPlatformResourceURI(pathName, true);			
		} else {
			return URI.createPlatformPluginURI(pathName, true);
		}
	}
	
	private static Resource createResource(ResourceSet resourceSet, URI modelUri) throws IOException {
		Resource resource = resourceSet.getResource(modelUri, false);
		if (resource == null) {
			resource = resourceSet.createResource(modelUri);
		}
		if (resourceSet.getURIConverter().exists(modelUri, Collections.emptyMap())) {
			resource.load(Collections.emptyMap());			
		}
		return resource;
	}
	
	private static ModelExtent createModelExtent(Resource r) {
		return new BasicModelExtent(r.getContents());
	}
	
	private static void removeDifference(Diff difference) {
		difference.getMatch().getDifferences().remove(difference);
	}
}

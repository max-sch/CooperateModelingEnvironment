package de.cooperateproject.modeling.textual.xtext.runtime.generator;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.StreamSupport;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IDerivedStateComputer;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public abstract class AbstractDerivedStateGenerator implements IDerivedStateComputer {

    @Inject
    @Named(IDerivedStateElementProcessor.DERIVED_STATE_PROCESSOR_MAIN_PROCESSOR)
    private IDerivedStateElementProcessor derivedStateElementProcessor;

    @Override
    public void installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
        if (preLinkingPhase) {
            return;
        }

        if (resource.getContents().isEmpty() || resource.getContents().get(0).eResource() != resource) {
            // prohibits the derived state calculator from calculating stuff before the contained elements belong to the
            // resource
            return;
        }

        EObject rootObject = resource.getContents().get(0);
        installDerivedState(rootObject);
    }

    public void installDerivedState(EObject object) {
        StreamSupport.stream(Spliterators.spliteratorUnknownSize(object.eAllContents(), Spliterator.ORDERED), false)
                .sorted(getContentComparator()).forEach(derivedStateElementProcessor::processElement);
    }

    @Override
    public void discardDerivedState(DerivedStateAwareResource resource) {
    }

    abstract protected Comparator<EObject> getContentComparator();
}

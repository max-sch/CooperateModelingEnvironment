package de.cooperateproject.modeling.textual.cls.derivedstate.remover;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.cls.cls.XtextAssociation;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability;

/**
 * State remover for Xtext associations.
 */
@Applicability(applicabilities = DerivedStateProcessorApplicability.CLEANING)
public class XtextAssociationRemover extends AtomicDerivedStateProcessorBase<XtextAssociation> {

    /**
     * Constructs the state remover.
     */
    public XtextAssociationRemover() {
        super(XtextAssociation.class);
    }

    @Override
    protected void applyTyped(XtextAssociation object) {
        object.getMemberEndCardinalities().clear();
        object.getMemberEndNames().clear();
        object.getMemberEndNavigabilities().clear();
        object.getMemberEndTypes().clear();
    }

    @Override
    public Collection<Class<? extends EObject>> getRequirements() {
        return Arrays.asList(UMLReferencingElement.class);
    }

}
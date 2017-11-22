/*
 * generated by Xtext 2.10.0
 */
package de.cooperateproject.modeling.textual.usecase.ui.labeling

import com.google.inject.Inject
import de.cooperateproject.modeling.textual.usecase.usecase.Actor
import de.cooperateproject.modeling.textual.usecase.usecase.Association
import de.cooperateproject.modeling.textual.usecase.usecase.Extend
import de.cooperateproject.modeling.textual.usecase.usecase.ExtensionPoint
import de.cooperateproject.modeling.textual.usecase.usecase.Generalization
import de.cooperateproject.modeling.textual.usecase.usecase.Include
import de.cooperateproject.modeling.textual.usecase.usecase.RootPackage
import de.cooperateproject.modeling.textual.usecase.usecase.System
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import de.cooperateproject.modeling.textual.usecase.usecase.UseCase
import de.cooperateproject.modeling.textual.usecase.usecase.UseCaseDiagram
import de.cooperateproject.modeling.textual.common.outline.CooperateOutlineLabelProvider
import de.cooperateproject.modeling.textual.common.outline.UMLImage
import java.util.Optional
import de.cooperateproject.modeling.textual.usecase.usecase.Relationship
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement

/**
 * Provides labels for Usecase EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
class UsecaseLabelProvider extends CooperateOutlineLabelProvider {

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}
	
	def image(UseCaseDiagram element) {
	    UMLImage.MODEL.image
	}

	def image(Actor element) {
		UMLImage.ACTOR.image
	}
	
	def image(Association element) {
		UMLImage.ASSOCIATION.image
	}
	
	def image(System element) {
		UMLImage.COMPONENT.image
	}
	
	def image(Extend element) {
		UMLImage.EXTEND.image
	}
	
	def image(ExtensionPoint element) {
		UMLImage.EXTENSIONPOINT.image
	}
	
	def image(Include element) {
		UMLImage.INCLUDE.image
	}
	
	def image(UseCase element) {
		UMLImage.USECASE.image
	}
	
	def image(RootPackage element) {
		UMLImage.PACKAGE.image
	}
	
    def image(Generalization element) {
        UMLImage.GENERALIZATION.image
    }
    
    def text(RootPackage element) {
    	Optional.ofNullable(element.name).orElseGet([element.referencedElement.name])
    }
    
    def text(Actor element) {
    	"act " + Optional.ofNullable(element.alias).orElse(element.name)
    }
    
    def text (Relationship element) {
    	element.toString
    }
    
    def text (Association element) {
    	"iac (" + element.actor.name + ", " + element.usecase.name + ") "
    }
    
    def text(UseCaseDiagram element) {
    	element.title
    }

	def text(ExtensionPoint element) {
		"ep " + element.name
	}

	def text(Generalization element) {
        val general = element.general as NamedElement;
        val specific = element.specific as NamedElement;
        "isa (" + specific.name + ", " + general.name + ")"
    }
    
    def text(Extend element) {
        "ext (" + element.extension.name + ", " + element.extendedCase.name + ") ep[" + element.extensionLocation.name + "]"
    }
    
    def text(Include element) {
    	"inc (" + element.includingCase.name + ", " + element.addition.name + ")"
    }
    
    def text(System element) {
    	"sys " + element.name
    }
    
    def text(UseCase element) {
    	"uc " + element.name
    }   

}

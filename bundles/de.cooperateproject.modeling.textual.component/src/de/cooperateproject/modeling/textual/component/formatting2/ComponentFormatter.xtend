/*
 * generated by Xtext 2.11.0
 */
package de.cooperateproject.modeling.textual.component.formatting2

import com.google.inject.Inject
import de.cooperateproject.modeling.textual.component.metamodel.component.ComponentDiagram
import de.cooperateproject.modeling.textual.component.metamodel.component.Classifier
import de.cooperateproject.modeling.textual.component.metamodel.component.ClassifierRelation
import de.cooperateproject.modeling.textual.component.metamodel.component.RootPackage
import de.cooperateproject.modeling.textual.component.services.ComponentGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class ComponentFormatter extends AbstractFormatter2 {
	
	@Inject extension ComponentGrammarAccess

	def dispatch void format(ComponentDiagram componentDiagram, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		componentDiagram.getRootpackage.format;
	}

	def dispatch void format(RootPackage rootPackage, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (ClassifierRelation elementRelation : rootPackage.getRelation()) {
			elementRelation.format;
		}
		for (Classifier elementContent : rootPackage.getClassifier()) {
			elementContent.format;
		}
	}
	
	// TODO: implement for Component, Interface, Method
}

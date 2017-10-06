/*
 * generated by Xtext 
 */
package de.cooperateproject.modeling.textual.cls.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import de.cooperateproject.modeling.textual.cls.cls.Package
import org.eclipse.uml2.uml.NamedElement
import org.eclipse.emf.ecore.EClass
import org.eclipse.uml2.uml.UMLPackage
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement

/**
 * This class provides content assist in our editor. It offeres suggestions for code completion.
 */
class ClsProposalProvider extends AbstractClsProposalProvider {

	def addProposalsFromUML(EObject model, EClass type, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		 // compute the name proposal from package
		  // compute the name proposal from package
 		 if(model instanceof UMLReferencingElement<?>) {
 		 	val umlContainer = model.referencedElement
 		 	for(element : umlContainer.allOwnedElements.filter[eClass == type].filter(NamedElement)) {
 		 		if(!model.eContents.filter(de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement)
 		 		.exists[name == element.name]) {
 		 			acceptor.accept(createCompletionProposal(element.name, context))
 		 		}
 		 	}
 		 }
 		 //TODO: Clean up
// 		 if(model instanceof Package) {
// 		 	val umlPackage = model.referencedElement as org.eclipse.uml2.uml.Package
//
// 		 	for(element : umlPackage.allOwnedElements.filter[eClass == type].filter(NamedElement)) {
// 		 		if(!model.classifiers.exists[name == element.name] && 
// 		 			!model.connectors.filter(NamedElement).exists[name == element.name]
// 		 		)
// 		 			acceptor.accept(createCompletionProposal(element.name, context))
// 		 	}
// 		 }
		
	}
	
	
	
	override completeClass_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeClass_Name(model, assignment, context, acceptor)
 		addProposalsFromUML(model, UMLPackage.eINSTANCE.class_, context, acceptor)
	}
	
	override completeInterface_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeInterface_Name(model, assignment, context, acceptor)
 		addProposalsFromUML(model, UMLPackage.eINSTANCE.interface, context, acceptor)
	}
	
	override completePackage_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completePackage_Name(model, assignment, context, acceptor)
 		addProposalsFromUML(model, UMLPackage.eINSTANCE.package, context, acceptor)
	}
	
	
}

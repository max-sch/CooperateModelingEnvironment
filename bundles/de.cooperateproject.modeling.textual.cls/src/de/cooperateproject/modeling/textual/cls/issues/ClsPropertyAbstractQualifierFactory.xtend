package de.cooperateproject.modeling.textual.cls.issues

import de.cooperateproject.modeling.textual.cls.cls.ClsPackage
import de.cooperateproject.modeling.textual.cls.cls.Method
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement
import org.eclipse.emf.ecore.EObject
import org.eclipse.uml2.uml.Element
import static extension de.cooperateproject.modeling.textual.common.issues.CommonIssueResolutionUtilities.*

class ClsPropertyAbstractQualifierFactory extends ClsAutomatedIssueResolutionFactoryBase<UMLReferencingElement<Element>> {

	public static val ISSUE_CODE = "mismatchingAbstractQualifier";

	new() {
		super(ISSUE_CODE, [isResolvable], UMLReferencingElement as Class<?> as Class<UMLReferencingElement<Element>>)
	}
	
	private static def isResolvable(UMLReferencingElement<Element> element) {
		element.hasReferencedElement
	}

	override protected createInternal(UMLReferencingElement<Element> element) {
		return new ClsPropertyAbstractQualifierResolution(element, resolvableChecker)
	}

	override protected getIssueDescriptionInternal(UMLReferencingElement<Element> element) {
		return "The abstractness of the element is different to the abstractness used in UML."
	}

	override protected getIssueFeatureInternal(UMLReferencingElement<Element> element) {
	    new IssueLocator(element.getIssueFeatureTyped, element)
	}

	private def dispatch getIssueFeatureTyped(de.cooperateproject.modeling.textual.cls.cls.Class clz) {
		return ClsPackage.Literals.CLASS__ABSTRACT
	}

	private def dispatch getIssueFeatureTyped(Method clz) {
		return ClsPackage.Literals.METHOD__ABSTRACT
	}
	
	override protected getResolutionNameInternal(UMLReferencingElement<Element> element) {
		return "Set abstract modifier in UML to the modifier currently used."
	}

	override protected hasIssueInternal(UMLReferencingElement<Element> element) {
		if (!element.hasReferencedElement) {
			return false
		}
		return element.hasIssueTyped
	}

	private def dispatch hasIssueTyped(de.cooperateproject.modeling.textual.cls.cls.Class clz) {
		val umlClassAbstract = clz.referencedElement.abstract
		val clsClassAbstract = clz.abstract
		return umlClassAbstract != clsClassAbstract
	}

	private def dispatch hasIssueTyped(Method method) {
		val umlMethodAbstract = method.referencedElement.abstract
		val clsMethodAbstract = method.abstract
		return umlMethodAbstract != clsMethodAbstract
	}

	private def dispatch hasIssueTyped(EObject element) {
		return false
	}

}

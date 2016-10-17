/*
 * generated by Xtext 
 */
package de.cooperateproject.modeling.textual.cls.ui.quickfix

import de.cooperateproject.modeling.textual.cls.cls.Attribute
import de.cooperateproject.modeling.textual.cls.cls.ClsFactory
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage
import de.cooperateproject.modeling.textual.cls.cls.DataTypeReference
import de.cooperateproject.modeling.textual.cls.cls.Member
import de.cooperateproject.modeling.textual.cls.cls.Method
import de.cooperateproject.modeling.textual.cls.cls.Property
import de.cooperateproject.modeling.textual.cls.cls.UMLTypeReference
import de.cooperateproject.modeling.textual.cls.validation.ClsValidator
import de.cooperateproject.modeling.textual.cls.validation.TypeConverter
import java.util.Collection
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.uml2.uml.Class
import org.eclipse.uml2.uml.Classifier
import org.eclipse.uml2.uml.Interface
import org.eclipse.uml2.uml.NamedElement
import org.eclipse.uml2.uml.Operation
import org.eclipse.uml2.uml.Package
import org.eclipse.uml2.uml.Parameter
import org.eclipse.uml2.uml.PrimitiveType
import org.eclipse.uml2.uml.Type
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue
import java.util.Collections

class ClsQuickfixProvider extends DefaultQuickfixProvider {

	/**
	 * Quickfix for missing Class in the UML-diagram.
	 */
	@Fix(ClsValidator::NO_CLASS_REFERENCE)
	def createMissingUMLClass(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Create Class', 'Create the Class into the UML Diagram', null) [ element, context |
			element.fixMissingClassifier(issue, context)
		]
	}

	/**
	 * Quickfix for missing Interface in the UML-diagram.
	 */
	@Fix(ClsValidator::NO_INTERFACE_REFERENCE)
	def createMissingUMLInterface(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Create Interface', 'Create the Interface into the UML Diagram', null) [ element, context |
			element.fixMissingClassifier(issue, context)
		]
	}
	
	/**
	 * Quickfix for missing Property in the UML-diagram.
	 */
	@Fix(ClsValidator::NO_PROPERTY_REFERENCE)
	def createMissingUMLProperty(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Create Property', 'Create the Property into the UML Diagram', null) [ element, context |
			element.fixMissingMember(issue, context)
		]
	}
	
	/**
	 * Quickfix for wrong Property type in the Cls-model.
	 */
	@Fix(ClsValidator::WRONG_PROPERTY_TYPE)
	def wrongPropertyType(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Change Type', 'Change the property type into the right one', null) [ element, context |
			if (element instanceof Property) {
				element.fixWrongType(issue, context)
			}
		]
	}
	
	/**
	 * Quickfix for missing Operation in the UML-diagram.
	 */
	@Fix(ClsValidator::NO_OPERATION_REFERENCE)
	def createMissingUMLOperation(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Create Operation', 'Create the Operation into the UML Diagram', null) [ element, context |
			if (element instanceof Method) {
				element.fixMissingMember(issue, context)
			}
		]
	}
	
	private static def fixMissingClassifier(EObject element, Issue issue, IModificationContext context) {
		var name = context.xtextDocument.get(issue.offset, issue.length)
		val brokenClassifier = element as de.cooperateproject.modeling.textual.cls.cls.Classifier<? extends Classifier>
		val parentPackage = brokenClassifier.nearestPackage
		val umlPackage = parentPackage.referencedElement
		if (umlPackage == null) {
			return
		}
		brokenClassifier.fixCreate(umlPackage, name)
	}
	
	private static def dispatch void fixCreate(de.cooperateproject.modeling.textual.cls.cls.Class brokenClassifier, Package parentPackage, String name) {
		val umlClass = parentPackage.createOwnedClass(name, brokenClassifier.abstract);
		parentPackage.save
		brokenClassifier.referencedElement = umlClass;
	}
	
	private static def dispatch void fixCreate(de.cooperateproject.modeling.textual.cls.cls.Interface brokenClassifier, Package parentPackage, String name) {
		val umlInterface = parentPackage.createOwnedInterface(name);
		parentPackage.save
		brokenClassifier.referencedElement = umlInterface;
	}
	
	private static def fixWrongType(Property<? extends NamedElement> property, Issue issue, IModificationContext context) {
		val umlElement = property.referencedElement
		val umlType = umlElement?.getType
		property.type = getClsType(umlType)
	}
	
	private static def dispatch Type getType(Operation umlOperation) {
		return umlOperation.type
	}
	
	private static def dispatch Type getType(org.eclipse.uml2.uml.Property umlAttribute) {
		return umlAttribute.type
	}
	
	private static def dispatch Type getType(Parameter umlParameter) {
		return umlParameter.type
	}

	private def fixMissingMember(EObject element, Issue issue, IModificationContext context) {
		val name = context.xtextDocument.get(issue.offset, issue.length)
		val brokenMember = element as Member<?>
		val classifier = brokenMember.owner
		val umlClassifier = classifier.referencedElement
		if (umlClassifier == null) {
			return
		}
		brokenMember.fixCreate(umlClassifier, name)
	}
		
	private static def dispatch void fixCreate(Attribute brokenAttribute, Class umlClassifier, String name) {
		val umlType = getUMLType(brokenAttribute.type)
		val umlAttribute = umlClassifier.createOwnedAttribute(name, umlType)
		umlClassifier.save
		brokenAttribute.referencedElement = umlAttribute
	}
	
	private static def dispatch void fixCreate(Attribute brokenAttribute, Interface umlClassifier, String name) {
		val umlType = getUMLType(brokenAttribute.type)
		val umlAttribute = umlClassifier.createOwnedAttribute(name, umlType)
		umlClassifier.save
		brokenAttribute.referencedElement = umlAttribute
	}
	
	private static def dispatch void fixCreate(Method brokenMethod, Class umlClassifier, String name) {
		brokenMethod.fixCreate[paramNames, paramTypes, returnType | 
			val umlOperation = umlClassifier.createOwnedOperation(name, paramNames, paramTypes, returnType)
			umlClassifier.save
			brokenMethod.referencedElement = umlOperation
		]
	}
	
	private static def dispatch void fixCreate(Method brokenMethod, Interface umlClassifier, String name) {
		brokenMethod.fixCreate[paramNames, paramTypes, returnType | 
			val umlOperation = umlClassifier.createOwnedOperation(name, paramNames, paramTypes, returnType)
			umlClassifier.save
			brokenMethod.referencedElement = umlOperation
		]
	}
	
	private interface MethodCreateFixer {
		def void fix(EList<String> parameterNames, EList<Type> parameterTypes, Type returnType)
	}
	
	private static def void fixCreate(Method brokenMethod, MethodCreateFixer fixer) {
		val parameterNames = brokenMethod.parameters.map[p | NodeModelUtils.findNodesForFeature(p, ClsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT).map[n | NodeModelUtils.getTokenText(n)].findFirst[true]]
		val parameterTypes = brokenMethod.parameters.map[p | p.type.getUMLType]
		val returnType = brokenMethod.type.getUMLType
		
		if (parameterNames.size != parameterTypes.size) {
			return
		}
		
		fixer.fix(parameterNames.encapsulate, parameterTypes.encapsulate, returnType)
	}
	
	private static def <T> EList<T> encapsulate(Collection<T> elements) {
		return new BasicEList<T>(elements)
	}
	
	private static def dispatch getClsType(PrimitiveType type) {
		val primitiveType = TypeConverter.getPrimitive(type)
		if (primitiveType == null) {
			return null
		}
		val dataTypeReference = ClsFactory.eINSTANCE.createDataTypeReference
		dataTypeReference.type = primitiveType
		return dataTypeReference
	}
	
	private static def dispatch getClsType(Type type) {
		if (type == null) {
			return null
		}
		val umlTypeReference = ClsFactory.eINSTANCE.createUMLTypeReference
		umlTypeReference.type = type
		return umlTypeReference
	}
	
	private static def dispatch getClsType(Void type) {
		return null
	}
	
	private static def dispatch getUMLType(DataTypeReference type) {
		return TypeConverter.getType(type.type, type.eResource.resourceSet)
	}
	
	private static def dispatch getUMLType(UMLTypeReference type) {
		return type.type
	}
	
	private static def dispatch getUMLType(Void type) {
		return null
	}
	
	private static def save (EObject o) {
		o.eResource.save(Collections.emptyMap)
	}

}

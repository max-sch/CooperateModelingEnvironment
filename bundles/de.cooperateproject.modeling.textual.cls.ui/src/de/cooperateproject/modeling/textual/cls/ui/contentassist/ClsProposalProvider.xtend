/*
 * generated by Xtext 
 */
package de.cooperateproject.modeling.textual.cls.ui.contentassist

import com.google.inject.Inject
import de.cooperateproject.modeling.textual.cls.cls.Classifier
import de.cooperateproject.modeling.textual.cls.cls.ClsFactory
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage
import de.cooperateproject.modeling.textual.cls.cls.Package
import de.cooperateproject.modeling.textual.cls.cls.TypeReference
import de.cooperateproject.modeling.textual.cls.cls.Visibility
import de.cooperateproject.modeling.textual.cls.validation.TypeConverter
import org.eclipse.emf.ecore.EObject
import org.eclipse.uml2.uml.Class
import org.eclipse.uml2.uml.Interface
import org.eclipse.uml2.uml.Operation
import org.eclipse.uml2.uml.PrimitiveType
import org.eclipse.uml2.uml.Property
import org.eclipse.uml2.uml.Type
import org.eclipse.uml2.uml.VisibilityKind
import org.eclipse.uml2.uml.util.UMLSwitch
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.xtext.serializer.ISerializer
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import com.google.common.base.Strings

/**
 * This class provides content assist in our editor. It offeres suggestions for code completion.
 */
class ClsProposalProvider extends AbstractClsProposalProvider {
	@Inject IScopeProvider scope
	@Inject ISerializer serializer

	/**
	 * Content assist for creating classes into the text editor from the uml file.
	 */
	override complete_Classifier(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {

		var scope = scope.getScope(model, ClsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT);

		var elements = scope.allElements
		var classes = elements.map[x|x.EObjectOrProxy].filter(Class)
		var interfaces = elements.map[x|x.EObjectOrProxy].filter(Interface)
		for (class : classes) {
			var c = createClass(class)
			var m = model as Package
			m.classifiers.add(c)

			createAcceptor(c, acceptor, context)
		}
		
		for (iface : interfaces) {
			var i = createInterface(iface)
			var m = model as Package
			m.classifiers.add(i)
			
			createAcceptor(i, acceptor, context)
		}
	}
	
	private def createAcceptor(Classifier classifier, ICompletionProposalAcceptor acceptor, ContentAssistContext context) {
		acceptor.accept(createCompletionProposal(serializer.serialize(classifier), classifier.name, null, context))
	}
	
	/**
	 * Creates an Cls Class out of a UML Class.
	 */
	private def createClass(Class refClass) {
		var c = ClsFactory.eINSTANCE.createClass
		c.referencedElement = refClass

		for (member : refClass.members) {
			val createdMember = createMember(member)
			if (createdMember != null) {
				c.members.add(createdMember)
			}
		}

		//m.classifiers.add(c)
		return c
	}
	
	private def createInterface(Interface refInterface) {
		var iface = ClsFactory.eINSTANCE.createInterface
		iface.referencedElement = refInterface

		/*for (attribute : refInterface.attributes) {
			class.members.add(createAttributes(attribute))
		}*/
		for (operation : refInterface.operations) {
			iface.members.add(createMember(operation))
		}
		//m.classifiers.add(iface)
		return iface
	}

	/**
	 * Creates an Cls Method out of an UML Operation.
	 */
	private def dispatch createMember(Operation refOperation) {
		if (refOperation == null) {
			return null
		}
		var operation = ClsFactory.eINSTANCE.createMethod
		operation.visibility = getVisibility(refOperation.visibility)
		operation.referencedElement = refOperation

		operation.type = getType(refOperation.type)
		var parameters = refOperation.getOwnedParameters
		
		for (parameter : parameters) {
			if (parameter.name != null) {
				var param = ClsFactory.eINSTANCE.createParameter
				param.referencedElement = parameter
				param.type = getType(parameter.type)
				operation.parameters.add(param)
			}
		}

		return operation
	}

	/**
	 * Creates an Cls Attribute out of an UML Property.
	 */
	private def dispatch createMember(Property refAttribute) {
		if (refAttribute == null || Strings.isNullOrEmpty(refAttribute.name)) {
			return null
		}
		var attribute = ClsFactory.eINSTANCE.createAttribute

		attribute.visibility = getVisibility(refAttribute.visibility)
		attribute.referencedElement = refAttribute

		/*var typeSwitch = new TypeSwitch
		 * attribute.type = typeSwitch.doSwitch(refAttribute.type)
		 typeSwitch = null*/
		attribute.type = getType(refAttribute.type)

		return attribute
	}

	private def getType(Type type) {
		if (type == null) {
			return null
		}
		var typeSwitch = new TypeSwitch
		var t = typeSwitch.doSwitch(type)
		typeSwitch = null

		return t
	}

	/**
	 * Converts a VisibilityKind into a Cls Visibility.
	 */
	private def getVisibility(VisibilityKind visibility) {
		if (visibility == null) {
			return Visibility.UNDEFINED
		}
		Visibility.get(visibility.literal.toUpperCase)
	}

	private static class TypeSwitch extends UMLSwitch<TypeReference> {
		/*private TypeConverter typeConverter
		
		new() {
			typeConverter = new TypeConverter()
		} */

		override casePrimitiveType(PrimitiveType primitiveType) {
			var dataType = ClsFactory.eINSTANCE.createDataTypeReference
			dataType.type = TypeConverter.getPrimitive(primitiveType)
			return dataType
		}

		override caseClass(Class classifier) {
			var dataType = ClsFactory.eINSTANCE.createUMLTypeReference
			dataType.type = classifier
			return dataType
		}

		override caseInterface(Interface classifier) {
			var dataType = ClsFactory.eINSTANCE.createUMLTypeReference
			dataType.type = classifier
			return dataType
		}
	}

}

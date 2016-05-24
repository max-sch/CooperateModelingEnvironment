/*
 * generated by Xtext 2.9.0
 */
package de.cooperateproject.modeling.language.usecase.validation

import de.cooperateproject.modeling.language.usecase.usecase.ExtensionPoint
import de.cooperateproject.modeling.language.usecase.usecase.Multiplicity
import de.cooperateproject.modeling.language.usecase.usecase.UsecasePackage
import org.eclipse.xtext.validation.Check
import de.cooperateproject.modeling.language.usecase.usecase.Modifier

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class UseCaseValidator extends AbstractUseCaseValidator {

//  public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					UseCasePackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
	@Check
	def checkMultiplicity(Multiplicity multiplicity) {
		if (multiplicity.upperBound == null) {
			return
		}

		if (multiplicity.upperBound.intValue < 0) {
			return
		}

		if (multiplicity.lowerBound.intValue < 0 ||
			multiplicity.lowerBound.intValue > multiplicity.upperBound.intValue) {
			warning('The lower bound of the multiplicity must not be bigger than the upper bound.',
				UsecasePackage.Literals.MULTIPLICITY__UPPER_BOUND, 'invalidUpperBound')
		}
	}

	@Check
	def checkExtensionPoint(ExtensionPoint extensionPoint) {
		val invalidModifiers = extensionPoint.modifiers.toSet
		invalidModifiers.remove(Modifier.LEAF)
		for (modifier : invalidModifiers) {
			error('The modifier ' + modifier.getName + ' cannot be used for ' + ExtensionPoint.simpleName,
				UsecasePackage.Literals.EXTENSION_POINT__MODIFIERS, 'invalidModifier')
		}
	}

}
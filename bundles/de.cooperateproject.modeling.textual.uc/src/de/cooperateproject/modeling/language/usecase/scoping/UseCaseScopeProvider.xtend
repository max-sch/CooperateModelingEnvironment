/*
 * generated by Xtext 2.9.0
 */
package de.cooperateproject.modeling.language.usecase.scoping

import com.google.common.base.Function
import com.google.common.collect.Iterables
import com.google.inject.Inject
import de.cooperateproject.modeling.language.usecase.usecase.Actor
import de.cooperateproject.modeling.language.usecase.usecase.Test
import de.cooperateproject.modeling.language.usecase.usecase.UsecasePackage
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.uml2.uml.UMLPackage
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.IScope

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class UseCaseScopeProvider extends AbstractUseCaseScopeProvider {

	@Inject
	private var UseCaseImportUriGlobalScopeProvider importUriScopeProvider;

	override getScope(EObject object, EReference reference) {

//		if (object instanceof Test && reference.EType == UsecasePackage.eINSTANCE.actor) {
//			val standardProposals = super.getScope(object, reference)
//			val externalElements = importUriScopeProvider.findElements(object.eResource, UMLPackage.eINSTANCE.actor)
//			val combined = Iterables.concat(standardProposals.allElements.map[EObjectOrProxy], externalElements.
//				allElements.map[EObjectOrProxy])
//			return Scopes.scopeFor(
//				combined,
//				new Function<EObject, QualifiedName>() {
//					override apply(EObject input) {
//						if (input instanceof Actor) {
//							return QualifiedName.create((input as Actor).name)
//						}
//						if (input instanceof org.eclipse.uml2.uml.Actor) {
//							return QualifiedName.create("dummy")
//							//return QualifiedName.create((input as org.eclipse.uml2.uml.Actor).name)
//						}
//						throw new IllegalArgumentException();
//					}
//
//				}
//			, IScope.NULLSCOPE);
//		}

//		if (reference.EType instanceof EClass &&
//			UsecasePackage.eINSTANCE.actor.isSuperTypeOf(reference.EType as EClass)) {
//			val root = EcoreUtil.getRootContainer(object, true);
//			val candidates = EcoreUtil2.getAllContentsOfType(root, Actor)
//			return Scopes.scopeFor(candidates, new Function<Actor, QualifiedName>() {
//				override apply(Actor input) {
//					QualifiedName.create(input.name)
//				}
//			}, IScope.NULLSCOPE)
//		}
		return super.getScope(object, reference);
	}

}
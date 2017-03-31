package de.cooperateproject.modeling.textual.cls.issues

import com.google.inject.Inject
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage
import de.cooperateproject.modeling.textual.cls.cls.Package
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IGlobalScopeTypeQueryProvider
import org.eclipse.xtext.naming.IQualifiedNameProvider
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IResolvableChecker

class ClsRootPackageMissingFactory extends ClsAutomatedIssueResolutionFactoryBase<Package> {
	
	private static class ClsRootPackageMissingFactoryResolvableChecker implements IResolvableChecker<Package> {
		
		var IQualifiedNameProvider qualifiedNameProvider
		var IGlobalScopeTypeQueryProvider typeQueryProvider
		
		def setQualifiedNameProvider(IQualifiedNameProvider qualifiedNameProvider) {
			this.qualifiedNameProvider = qualifiedNameProvider
		}
		
		def setTypeQueryProvider(IGlobalScopeTypeQueryProvider typeQueryProvider) {
			this.typeQueryProvider = typeQueryProvider
		}
		
		override isResolvable(Package element) {
			if (preconditionHoldsFor(element)) {
				val fqn = qualifiedNameProvider.getFullyQualifiedName(element)
				val umlRootPackage = ClsRootPackageMissingResolution.findUMLRootPackage(typeQueryProvider, element)
				if (umlRootPackage !== null && fqn.firstSegment == umlRootPackage.name) {
					var currentPackage = umlRootPackage
					for (segment : fqn.segments.subList(1, -1)) {
						val candidates = currentPackage.nestedPackages.filter[name == segment]
						if (candidates.size > 1) {
							return false
						} else if (candidates.empty) {
							return true
						} else {
							currentPackage = candidates.findFirst[true]
						}
					}
					return true
				}
			}
				
			return false
		}
		
	} 
	
	static val ISSUE_CODE = "missingUMLReferenceRootPackage"
	
	var IQualifiedNameProvider qualifiedNameProvider

	var IGlobalScopeTypeQueryProvider typeQueryProvider
	
	new() {
		super(ISSUE_CODE, new ClsRootPackageMissingFactoryResolvableChecker() , Package)
	}
	
	@Inject
	def void setQualifiedNameProvider(IQualifiedNameProvider qnp) {
		(resolvableChecker as ClsRootPackageMissingFactoryResolvableChecker).qualifiedNameProvider = qnp
		qualifiedNameProvider = qnp
	}
	
	@Inject
	def void setTypeQueryProvider(IGlobalScopeTypeQueryProvider tqp) {
		(resolvableChecker as ClsRootPackageMissingFactoryResolvableChecker).typeQueryProvider = tqp
		this.typeQueryProvider = tqp
	}
	
	private static def preconditionHoldsFor(Package problematicElement) {
		return 
			problematicElement.referencedElement === null &&
			problematicElement.classifiers.isEmpty &&
			problematicElement.connectors.isEmpty &&
			problematicElement.packageImports.isEmpty &&
			problematicElement.packages.isEmpty
	}
	
	override protected createInternal(Package element) {
		return new ClsRootPackageMissingResolution(element, resolvableChecker, qualifiedNameProvider, typeQueryProvider)
	}
	
	override protected getIssueDescriptionInternal(Package element) {
		return "The root package does not exist yet."
	}
	
	override protected getIssueFeatureInternal(Package element) {
		return ClsPackage.Literals.CLASS_DIAGRAM__ROOT_PACKAGE
	}
	
	override protected getResolutionNameInternal(Package element) {
		return "Create root package in UML."
	}
	
	override protected hasIssueInternal(Package element) {
		return element.owningPackage === null && preconditionHoldsFor(element);
	}
	
}
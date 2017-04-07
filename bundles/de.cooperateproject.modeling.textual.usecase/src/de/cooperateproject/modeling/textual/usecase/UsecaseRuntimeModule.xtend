/*
 * generated by Xtext 2.10.0
 */
package de.cooperateproject.modeling.textual.usecase

import com.google.inject.Binder
import com.google.inject.multibindings.Multibinder
import com.google.inject.name.Names
import de.cooperateproject.modeling.textual.usecase.generator.UsecaseDerivedStateElementProcessor
import de.cooperateproject.modeling.textual.usecase.generator.UsecaseDerivedStateGenerator
import de.cooperateproject.modeling.textual.usecase.scoping.UseCaseImportedNamespaceAwareLocalScopeProvider
import de.cooperateproject.modeling.textual.xtext.runtime.cdotext.TextualStateCalculator
import de.cooperateproject.modeling.textual.xtext.runtime.generator.CommonDerivedStateModuleExtension
import de.cooperateproject.modeling.textual.xtext.runtime.generator.IDerivedStateElementProcessor
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.CommonQualifiedNameProvider
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.CooperateGlobalScopeProvider
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IGlobalScopeTypeQueryProvider
import net.winklerweb.cdoxtext.runtime.ICDOResourceStateCalculator
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.resource.DerivedStateAwareResourceDescriptionManager
import org.eclipse.xtext.resource.IDerivedStateComputer
import org.eclipse.xtext.resource.IResourceDescription
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.xtext.serializer.sequencer.ITransientValueService
import de.cooperateproject.modeling.textual.xtext.runtime.services.BasicCooperateTransientValueService

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class UsecaseRuntimeModule extends AbstractUsecaseRuntimeModule implements CommonDerivedStateModuleExtension {

	override void configureIScopeProviderDelegate(Binder binder) {
		binder.bind(IScopeProvider).annotatedWith(Names.named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE)).to(
			UseCaseImportedNamespaceAwareLocalScopeProvider)
	}

//	override Class<? extends IGlobalScopeProvider> bindIGlobalScopeProvider() {
//		return UseCaseGlobalScopeProvider
//	}

	override Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return CommonQualifiedNameProvider;
	}
	
	
	override bindITransientValueService() {
		BasicCooperateTransientValueService
	}
	
	def configureITransientValueService(Binder binder) {
		binder.bind(ITransientValueService).to(BasicCooperateTransientValueService)
	}

	// derived state
	def Class<? extends IDerivedStateComputer> bindIDerivedStateComputer() {
		return UsecaseDerivedStateGenerator;
	}

	override Class<? extends XtextResource> bindXtextResource() {
		return DerivedStateAwareResource;
	}

	def Class<? extends IResourceDescription.Manager> bindIResourceDescriptionManager() {
		return DerivedStateAwareResourceDescriptionManager;
	}
	
	def Class<? extends IGlobalScopeTypeQueryProvider> bindIGlobalScopeTypeQueryProvider() {
		return CooperateGlobalScopeProvider
	}
	
	def configureUseCaseDerivedStateElementProcessor(Binder binder) {
		val mb = Multibinder.newSetBinder(binder, IDerivedStateElementProcessor, Names.named("processor"));
		mb.addBinding().to(UsecaseDerivedStateElementProcessor);
	}
	
	override Class<? extends ICDOResourceStateCalculator> bindICDOResourceStateCalculator() {
		TextualStateCalculator;
	}
	

}

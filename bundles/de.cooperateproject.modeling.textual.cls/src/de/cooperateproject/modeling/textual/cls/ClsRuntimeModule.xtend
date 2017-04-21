/*
 * generated by Xtext 2.10.0
 */
package de.cooperateproject.modeling.textual.cls

import com.google.inject.Binder
import com.google.inject.multibindings.Multibinder
import com.google.inject.name.Names
import de.cooperateproject.modeling.textual.cls.generator.ClsDerivedStateComputer
import de.cooperateproject.modeling.textual.cls.generator.ClsDerivedStateElementProcessor
import de.cooperateproject.modeling.textual.cls.services.ClsLazyLinker
import de.cooperateproject.modeling.textual.cls.services.ClsTransientValueService
import de.cooperateproject.modeling.textual.cls.services.ClsValueConverter
import de.cooperateproject.modeling.textual.common.generator.CommonDerivedStateModuleExtension
import de.cooperateproject.modeling.textual.common.scoping.CooperateImportedNamespaceAwareLocalScopeProvider
import de.cooperateproject.modeling.textual.xtext.runtime.generator.IDerivedStateElementProcessor
import net.winklerweb.cdoxtext.runtime.ICDOResourceStateCalculator
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.resource.IDerivedStateComputer
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.xtext.serializer.sequencer.ITransientValueService
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IGlobalScopeTypeQueryProvider
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.CooperateGlobalScopeProvider
import de.cooperateproject.modeling.textual.xtext.runtime.cdotext.TextualStateCalculator

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class ClsRuntimeModule extends AbstractClsRuntimeModule implements CommonDerivedStateModuleExtension {
		
	override bindILinker() {
		return ClsLazyLinker
	}
	
	override bindITransientValueService() {
		ClsTransientValueService
	}
	
	def configureITransientValueService(Binder binder) {
		binder.bind(ITransientValueService).to(ClsTransientValueService)
	}
	
    override configureIScopeProviderDelegate(Binder binder) {
        binder.bind(IScopeProvider)
                .annotatedWith(Names
                        .named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE))
                .to(CooperateImportedNamespaceAwareLocalScopeProvider);
    }
    
    override Class<? extends XtextResource> bindXtextResource() {
		return DerivedStateAwareResource;
	}
    
    def Class<? extends IDerivedStateComputer> bindIDerivedStateComputer() {
		return ClsDerivedStateComputer;
	}
	
	def Class<? extends IGlobalScopeTypeQueryProvider> bindIGlobalScopeTypeQueryProvider() {
		return CooperateGlobalScopeProvider
	}
	
	override bindIValueConverterService() {
        return ClsValueConverter;
    }
    
    def configureClsDerivedStateElementProcessor(Binder binder) {
		val mb = Multibinder.newSetBinder(binder, IDerivedStateElementProcessor, 
		    Names.named(IDerivedStateElementProcessor.DERIVED_STATE_PROCESSOR_CONTRIBUTING_PROCESSOR));
		mb.addBinding().to(ClsDerivedStateElementProcessor);
	}
    
    override Class<? extends ICDOResourceStateCalculator> bindICDOResourceStateCalculator() {
		TextualStateCalculator;
	}

}

/*
 * generated by Xtext
 */
package de.cooperateproject.modeling.textual.cls;

import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.linking.ILinkingService;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;

import com.google.inject.Binder;

import de.cooperateproject.modeling.textual.cls.scoping.ClsCooperateSimpleScopeProvider;
import de.cooperateproject.modeling.textual.cls.scoping.ClsQualifiedNameProvider;
import de.cooperateproject.modeling.textual.cls.services.ClsLinkingService;
import de.cooperateproject.modeling.textual.cls.services.ClsValueConverter;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.CooperateGlobalScopeProvider;

/**
 * Use this class to register components to be used at runtime / without the
 * Equinox extension registry.
 */
public class ClsRuntimeModule extends de.cooperateproject.modeling.textual.cls.AbstractClsRuntimeModule {

	public Class<? extends IGlobalScopeProvider> bindIGlobalScopeProvider() {
		return CooperateGlobalScopeProvider.class;
	}

	@Override
	public void configureIScopeProviderDelegate(Binder binder) {
		binder.bind(org.eclipse.xtext.scoping.IScopeProvider.class)
				.annotatedWith(com.google.inject.name.Names
						.named(org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider.NAMED_DELEGATE))
				.to(ClsCooperateSimpleScopeProvider.class);
	}

	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return ClsValueConverter.class;
	}

	@Override
	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return ClsQualifiedNameProvider.class;
	}

	@Override
	public Class<? extends ILinkingService> bindILinkingService() {
		return ClsLinkingService.class;
	}

	
}

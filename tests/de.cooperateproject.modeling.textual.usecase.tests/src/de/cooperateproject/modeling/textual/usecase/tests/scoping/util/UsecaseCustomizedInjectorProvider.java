/*
 * generated by Xtext 2.12.0
 */
package de.cooperateproject.modeling.textual.usecase.tests.scoping.util;

import de.cooperateproject.modeling.textual.usecase.UsecaseRuntimeModule;
import de.cooperateproject.modeling.textual.usecase.tests.UsecaseInjectorProvider;

public class UsecaseCustomizedInjectorProvider extends UsecaseInjectorProvider
{

	public static class DefaultProvider extends UsecaseCustomizedInjectorProvider {
		public DefaultProvider() {
		      	super(UsecaseCustomizedRuntimeModule.class);
		}
	}	

	private final UsecaseRuntimeModule module;

	public UsecaseCustomizedInjectorProvider(UsecaseRuntimeModule module) {
		this.module = module;
	}

	public UsecaseCustomizedInjectorProvider(Class<? extends UsecaseRuntimeModule> moduleClass) {
	    try {
			this.module = moduleClass.newInstance();
			  } catch (InstantiationException | IllegalAccessException e) {
			      throw new RuntimeException(e);
		}
	}

	@Override
	protected UsecaseRuntimeModule createRuntimeModule() {
	    return module;
	}

}

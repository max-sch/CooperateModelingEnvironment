/*
 * generated by Xtext 2.10.0
 */
package de.cooperateproject.modeling.textual.usecase.ui.tests;

import com.google.inject.Injector;
import de.cooperateproject.modeling.textual.usecase.ui.internal.UsecaseActivator;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class UsecaseUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return UsecaseActivator.getInstance().getInjector("de.cooperateproject.modeling.textual.usecase.Usecase");
	}

}

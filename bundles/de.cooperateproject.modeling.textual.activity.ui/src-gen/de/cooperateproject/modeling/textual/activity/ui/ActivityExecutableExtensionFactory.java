/*
 * generated by Xtext
 */
package de.cooperateproject.modeling.textual.activity.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import de.cooperateproject.modeling.textual.activity.ui.internal.ActivityActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ActivityExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return ActivityActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return ActivityActivator.getInstance().getInjector(ActivityActivator.DE_COOPERATEPROJECT_MODELING_TEXTUAL_ACTIVITY_ACTIVITY);
	}
	
}
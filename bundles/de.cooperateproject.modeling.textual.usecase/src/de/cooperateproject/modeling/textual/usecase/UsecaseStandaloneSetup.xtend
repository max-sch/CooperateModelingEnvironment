/*
 * generated by Xtext 2.10.0
 */
package de.cooperateproject.modeling.textual.usecase


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class UsecaseStandaloneSetup extends UsecaseStandaloneSetupGenerated {

	def static void doSetup() {
		new UsecaseStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}

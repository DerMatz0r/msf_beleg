/*
 * generated by Xtext 2.30.0
 */
package de.htwdd.sf.beleg.s85769s88750;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class MyDslStandaloneSetup extends MyDslStandaloneSetupGenerated {

	public static void doSetup() {
		new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

/*
* generated by Xtext
*/
package eu.quanticol;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class CASPAStandaloneSetup extends CASPAStandaloneSetupGenerated{

	public static void doSetup() {
		new CASPAStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}


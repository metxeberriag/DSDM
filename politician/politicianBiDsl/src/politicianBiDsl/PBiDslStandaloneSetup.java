/*
* generated by Xtext
*/
package politicianBiDsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class PBiDslStandaloneSetup extends PBiDslStandaloneSetupGenerated{

	public static void doSetup() {
		new PBiDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}


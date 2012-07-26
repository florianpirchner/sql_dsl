
package org.lunifera.metamodel.dsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SqlDSLStandaloneSetup extends SqlDSLStandaloneSetupGenerated{

	public static void doSetup() {
		new SqlDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}


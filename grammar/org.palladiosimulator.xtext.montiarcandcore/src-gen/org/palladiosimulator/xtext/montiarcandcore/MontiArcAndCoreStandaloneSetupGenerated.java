/*
 * generated by Xtext 2.34.0
 */
package org.palladiosimulator.xtext.montiarcandcore;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.common.TerminalsStandaloneSetup;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MontiArcAndCorePackage;

@SuppressWarnings("all")
public class MontiArcAndCoreStandaloneSetupGenerated implements ISetup {

	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		TerminalsStandaloneSetup.doSetup();

		Injector injector = createInjector();
		register(injector);
		return injector;
	}
	
	public Injector createInjector() {
		return Guice.createInjector(new MontiArcAndCoreRuntimeModule());
	}
	
	public void register(Injector injector) {
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.palladiosimulator.org/xtext/montiarcandcore/MontiArcAndCore")) {
			EPackage.Registry.INSTANCE.put("http://www.palladiosimulator.org/xtext/montiarcandcore/MontiArcAndCore", MontiArcAndCorePackage.eINSTANCE);
		}
		IResourceFactory resourceFactory = injector.getInstance(IResourceFactory.class);
		IResourceServiceProvider serviceProvider = injector.getInstance(IResourceServiceProvider.class);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("montiarcandcore", resourceFactory);
		IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("montiarcandcore", serviceProvider);
	}
}

/*
 * generated by Xtext 2.34.0
 */
package org.palladiosimulator.xtext.montiarcandcore.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractMontiArcAndCoreValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MontiArcAndCorePackage.eINSTANCE);
		return result;
	}
}

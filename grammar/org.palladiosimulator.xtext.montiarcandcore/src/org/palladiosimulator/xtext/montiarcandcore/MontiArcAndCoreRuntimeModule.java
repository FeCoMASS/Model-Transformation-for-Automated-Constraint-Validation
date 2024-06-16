/*
 * generated by Xtext 2.34.0
 */
package org.palladiosimulator.xtext.montiarcandcore;

import org.eclipse.xtext.formatting2.FormatterPreferenceValuesProvider;
import org.eclipse.xtext.formatting2.FormatterPreferences;
import org.eclipse.xtext.formatting2.IFormatter2;
import org.eclipse.xtext.preferences.IPreferenceValuesProvider;
import org.palladiosimulator.xtext.montiarcandcore.formatting2.MontiArcAndCoreFormatter;

import com.google.inject.Binder;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class MontiArcAndCoreRuntimeModule extends AbstractMontiArcAndCoreRuntimeModule {
	
	// contributed by org.eclipse.xtext.xtext.generator.formatting.Formatter2Fragment2
	public Class<? extends IFormatter2> bindIFormatter2() {
		return MontiArcAndCoreFormatter.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.formatting.Formatter2Fragment2
	public void configureFormatterPreferences(Binder binder) {
		binder.bind(IPreferenceValuesProvider.class).annotatedWith(FormatterPreferences.class).to(FormatterPreferenceValuesProvider.class);
	}
	
}
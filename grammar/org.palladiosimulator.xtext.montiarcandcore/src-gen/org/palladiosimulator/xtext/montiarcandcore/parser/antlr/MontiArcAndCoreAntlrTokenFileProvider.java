/*
 * generated by Xtext 2.34.0
 */
package org.palladiosimulator.xtext.montiarcandcore.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MontiArcAndCoreAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/palladiosimulator/xtext/montiarcandcore/parser/antlr/internal/InternalMontiArcAndCore.tokens");
	}
}

/*
 * generated by Xtext 2.34.0
 */
package org.palladiosimulator.xtext.montiarcandcore.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.palladiosimulator.xtext.montiarcandcore.ide.contentassist.antlr.internal.InternalMontiArcAndCoreParser;
import org.palladiosimulator.xtext.montiarcandcore.services.MontiArcAndCoreGrammarAccess;

public class MontiArcAndCoreParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MontiArcAndCoreGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MontiArcAndCoreGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getPackageAccess().getNameAlternatives_1_0(), "rule__Package__NameAlternatives_1_0");
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getMCPrimitiveTypeAccess().getTypeAlternatives_0(), "rule__MCPrimitiveType__TypeAlternatives_0");
			builder.put(grammarAccess.getMCObjectTypeAccess().getTypeAlternatives_0(), "rule__MCObjectType__TypeAlternatives_0");
			builder.put(grammarAccess.getMCCollectionTypeAccess().getCollectionAlternatives_0_0(), "rule__MCCollectionType__CollectionAlternatives_0_0");
			builder.put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
			builder.put(grammarAccess.getLiteralExpressionAccess().getAlternatives(), "rule__LiteralExpression__Alternatives");
			builder.put(grammarAccess.getNameExpressionAccess().getAlternatives(), "rule__NameExpression__Alternatives");
			builder.put(grammarAccess.getBinaryExpressionAccess().getLiteral1Alternatives_0_0(), "rule__BinaryExpression__Literal1Alternatives_0_0");
			builder.put(grammarAccess.getBinaryExpressionAccess().getLiteral2Alternatives_2_0(), "rule__BinaryExpression__Literal2Alternatives_2_0");
			builder.put(grammarAccess.getCDDefinitionAccess().getAlternatives(), "rule__CDDefinition__Alternatives");
			builder.put(grammarAccess.getMemberAccess().getTypeAlternatives_0_0(), "rule__Member__TypeAlternatives_0_0");
			builder.put(grammarAccess.getArcElementAccess().getAlternatives(), "rule__ArcElement__Alternatives");
			builder.put(grammarAccess.getConnectorAccess().getSourceAlternatives_0_0(), "rule__Connector__SourceAlternatives_0_0");
			builder.put(grammarAccess.getConnectorAccess().getTargetAlternatives_2_0(), "rule__Connector__TargetAlternatives_2_0");
			builder.put(grammarAccess.getPortAccess().getAlternatives_2(), "rule__Port__Alternatives_2");
			builder.put(grammarAccess.getPortAccess().getAlternatives_3(), "rule__Port__Alternatives_3");
			builder.put(grammarAccess.getPortAccess().getNameAlternatives_4_0(), "rule__Port__NameAlternatives_4_0");
			builder.put(grammarAccess.getNamesAccess().getNamesAlternatives_0_0(), "rule__Names__NamesAlternatives_0_0");
			builder.put(grammarAccess.getNamesAccess().getNamesAlternatives_1_1_0(), "rule__Names__NamesAlternatives_1_1_0");
			builder.put(grammarAccess.getVariableAccess().getNameAlternatives_1_0(), "rule__Variable__NameAlternatives_1_0");
			builder.put(grammarAccess.getAutomatonAccess().getAlternatives_5(), "rule__Automaton__Alternatives_5");
			builder.put(grammarAccess.getStateAccess().getAlternatives(), "rule__State__Alternatives");
			builder.put(grammarAccess.getBlockStatementAccess().getAlternatives(), "rule__BlockStatement__Alternatives");
			builder.put(grammarAccess.getOperatorAccess().getAlternatives(), "rule__Operator__Alternatives");
			builder.put(grammarAccess.getSCModifierAccess().getAlternatives(), "rule__SCModifier__Alternatives");
			builder.put(grammarAccess.getMontiArcAndCoreAccess().getGroup(), "rule__MontiArcAndCore__Group__0");
			builder.put(grammarAccess.getImportStatementsAccess().getGroup(), "rule__ImportStatements__Group__0");
			builder.put(grammarAccess.getPackageAccess().getGroup(), "rule__Package__Group__0");
			builder.put(grammarAccess.getMCCollectionTypeAccess().getGroup(), "rule__MCCollectionType__Group__0");
			builder.put(grammarAccess.getMCArrayTypeAccess().getGroup(), "rule__MCArrayType__Group__0");
			builder.put(grammarAccess.getBinaryExpressionAccess().getGroup(), "rule__BinaryExpression__Group__0");
			builder.put(grammarAccess.getArgumentsAccess().getGroup(), "rule__Arguments__Group__0");
			builder.put(grammarAccess.getArgumentsAccess().getGroup_2(), "rule__Arguments__Group_2__0");
			builder.put(grammarAccess.getArgumentAccess().getGroup(), "rule__Argument__Group__0");
			builder.put(grammarAccess.getClassDiagramCompilationUnitAccess().getGroup(), "rule__ClassDiagramCompilationUnit__Group__0");
			builder.put(grammarAccess.getClassDiagramAccess().getGroup(), "rule__ClassDiagram__Group__0");
			builder.put(grammarAccess.getCDClassAccess().getGroup(), "rule__CDClass__Group__0");
			builder.put(grammarAccess.getCDClassAccess().getGroup_3(), "rule__CDClass__Group_3__0");
			builder.put(grammarAccess.getCDClassAccess().getGroup_4(), "rule__CDClass__Group_4__0");
			builder.put(grammarAccess.getCDClassAccess().getGroup_4_2(), "rule__CDClass__Group_4_2__0");
			builder.put(grammarAccess.getCDEnumAccess().getGroup(), "rule__CDEnum__Group__0");
			builder.put(grammarAccess.getMemberAccess().getGroup(), "rule__Member__Group__0");
			builder.put(grammarAccess.getMACompilationUnitAccess().getGroup(), "rule__MACompilationUnit__Group__0");
			builder.put(grammarAccess.getComponentAccess().getGroup(), "rule__Component__Group__0");
			builder.put(grammarAccess.getSignatureAccess().getGroup(), "rule__Signature__Group__0");
			builder.put(grammarAccess.getSignatureAccess().getGroup_2(), "rule__Signature__Group_2__0");
			builder.put(grammarAccess.getParametersAccess().getGroup(), "rule__Parameters__Group__0");
			builder.put(grammarAccess.getParametersAccess().getGroup_1(), "rule__Parameters__Group_1__0");
			builder.put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
			builder.put(grammarAccess.getParameterAccess().getGroup_2(), "rule__Parameter__Group_2__0");
			builder.put(grammarAccess.getSubComponentAccess().getGroup(), "rule__SubComponent__Group__0");
			builder.put(grammarAccess.getConnectorAccess().getGroup(), "rule__Connector__Group__0");
			builder.put(grammarAccess.getPortsAccess().getGroup(), "rule__Ports__Group__0");
			builder.put(grammarAccess.getPortsAccess().getGroup_2(), "rule__Ports__Group_2__0");
			builder.put(grammarAccess.getPortAccess().getGroup(), "rule__Port__Group__0");
			builder.put(grammarAccess.getConditionAccess().getGroup(), "rule__Condition__Group__0");
			builder.put(grammarAccess.getNamesAccess().getGroup(), "rule__Names__Group__0");
			builder.put(grammarAccess.getNamesAccess().getGroup_1(), "rule__Names__Group_1__0");
			builder.put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
			builder.put(grammarAccess.getAutomatonAccess().getGroup(), "rule__Automaton__Group__0");
			builder.put(grammarAccess.getSCStateAccess().getGroup(), "rule__SCState__Group__0");
			builder.put(grammarAccess.getInvStateAccess().getGroup(), "rule__InvState__Group__0");
			builder.put(grammarAccess.getSCSAnteAccess().getGroup(), "rule__SCSAnte__Group__0");
			builder.put(grammarAccess.getTransitionAccess().getGroup(), "rule__Transition__Group__0");
			builder.put(grammarAccess.getTransitionAccess().getGroup_1(), "rule__Transition__Group_1__0");
			builder.put(grammarAccess.getTransitionAccess().getGroup_2(), "rule__Transition__Group_2__0");
			builder.put(grammarAccess.getTransitionAccess().getGroup_3(), "rule__Transition__Group_3__0");
			builder.put(grammarAccess.getBlockAccess().getGroup(), "rule__Block__Group__0");
			builder.put(grammarAccess.getSimpleExpressionAccess().getGroup(), "rule__SimpleExpression__Group__0");
			builder.put(grammarAccess.getSimpleInitAccess().getGroup(), "rule__SimpleInit__Group__0");
			builder.put(grammarAccess.getMontiArcAndCoreAccess().getClassdiagramAssignment_0(), "rule__MontiArcAndCore__ClassdiagramAssignment_0");
			builder.put(grammarAccess.getMontiArcAndCoreAccess().getMontiarcdslAssignment_1(), "rule__MontiArcAndCore__MontiarcdslAssignment_1");
			builder.put(grammarAccess.getImportStatementsAccess().getImportUriAssignment_1(), "rule__ImportStatements__ImportUriAssignment_1");
			builder.put(grammarAccess.getImportStatementsAccess().getStarAssignment_2(), "rule__ImportStatements__StarAssignment_2");
			builder.put(grammarAccess.getPackageAccess().getNameAssignment_1(), "rule__Package__NameAssignment_1");
			builder.put(grammarAccess.getMCPrimitiveTypeAccess().getTypeAssignment(), "rule__MCPrimitiveType__TypeAssignment");
			builder.put(grammarAccess.getMCObjectTypeAccess().getTypeAssignment(), "rule__MCObjectType__TypeAssignment");
			builder.put(grammarAccess.getMCVoidTypeAccess().getTypeAssignment(), "rule__MCVoidType__TypeAssignment");
			builder.put(grammarAccess.getMCCollectionTypeAccess().getCollectionAssignment_0(), "rule__MCCollectionType__CollectionAssignment_0");
			builder.put(grammarAccess.getMCCollectionTypeAccess().getInnerTypeAssignment_2(), "rule__MCCollectionType__InnerTypeAssignment_2");
			builder.put(grammarAccess.getNumberLiteralAccess().getLiteralAssignment(), "rule__NumberLiteral__LiteralAssignment");
			builder.put(grammarAccess.getStringLiteralAccess().getLiteralAssignment(), "rule__StringLiteral__LiteralAssignment");
			builder.put(grammarAccess.getNameExpressionAccess().getNameAssignment_0(), "rule__NameExpression__NameAssignment_0");
			builder.put(grammarAccess.getNameExpressionAccess().getQualifiednameAssignment_1(), "rule__NameExpression__QualifiednameAssignment_1");
			builder.put(grammarAccess.getBinaryExpressionAccess().getLiteral1Assignment_0(), "rule__BinaryExpression__Literal1Assignment_0");
			builder.put(grammarAccess.getBinaryExpressionAccess().getOpAssignment_1(), "rule__BinaryExpression__OpAssignment_1");
			builder.put(grammarAccess.getBinaryExpressionAccess().getLiteral2Assignment_2(), "rule__BinaryExpression__Literal2Assignment_2");
			builder.put(grammarAccess.getArgumentsAccess().getArgumentsAssignment_1(), "rule__Arguments__ArgumentsAssignment_1");
			builder.put(grammarAccess.getArgumentsAccess().getArgumentsAssignment_2_1(), "rule__Arguments__ArgumentsAssignment_2_1");
			builder.put(grammarAccess.getArgumentAccess().getNameAssignment_0(), "rule__Argument__NameAssignment_0");
			builder.put(grammarAccess.getArgumentAccess().getExpressionAssignment_1(), "rule__Argument__ExpressionAssignment_1");
			builder.put(grammarAccess.getClassDiagramCompilationUnitAccess().getPackageAssignment_0(), "rule__ClassDiagramCompilationUnit__PackageAssignment_0");
			builder.put(grammarAccess.getClassDiagramCompilationUnitAccess().getImportStatementsAssignment_1(), "rule__ClassDiagramCompilationUnit__ImportStatementsAssignment_1");
			builder.put(grammarAccess.getClassDiagramCompilationUnitAccess().getDiagramAssignment_2(), "rule__ClassDiagramCompilationUnit__DiagramAssignment_2");
			builder.put(grammarAccess.getClassDiagramAccess().getNameAssignment_1(), "rule__ClassDiagram__NameAssignment_1");
			builder.put(grammarAccess.getClassDiagramAccess().getCdElementsAssignment_3(), "rule__ClassDiagram__CdElementsAssignment_3");
			builder.put(grammarAccess.getCDClassAccess().getPublicAssignment_0(), "rule__CDClass__PublicAssignment_0");
			builder.put(grammarAccess.getCDClassAccess().getNameAssignment_2(), "rule__CDClass__NameAssignment_2");
			builder.put(grammarAccess.getCDClassAccess().getExtendsAssignment_3_1(), "rule__CDClass__ExtendsAssignment_3_1");
			builder.put(grammarAccess.getCDClassAccess().getImplementsAssignment_4_1(), "rule__CDClass__ImplementsAssignment_4_1");
			builder.put(grammarAccess.getCDClassAccess().getImplementsAssignment_4_2_1(), "rule__CDClass__ImplementsAssignment_4_2_1");
			builder.put(grammarAccess.getCDClassAccess().getMembersAssignment_6(), "rule__CDClass__MembersAssignment_6");
			builder.put(grammarAccess.getCDEnumAccess().getPublicAssignment_0(), "rule__CDEnum__PublicAssignment_0");
			builder.put(grammarAccess.getCDEnumAccess().getNameAssignment_2(), "rule__CDEnum__NameAssignment_2");
			builder.put(grammarAccess.getCDEnumAccess().getValuesAssignment_4(), "rule__CDEnum__ValuesAssignment_4");
			builder.put(grammarAccess.getMemberAccess().getTypeAssignment_0(), "rule__Member__TypeAssignment_0");
			builder.put(grammarAccess.getMemberAccess().getNameAssignment_1(), "rule__Member__NameAssignment_1");
			builder.put(grammarAccess.getMACompilationUnitAccess().getPackageAssignment_0(), "rule__MACompilationUnit__PackageAssignment_0");
			builder.put(grammarAccess.getMACompilationUnitAccess().getImportStatementsAssignment_1(), "rule__MACompilationUnit__ImportStatementsAssignment_1");
			builder.put(grammarAccess.getMACompilationUnitAccess().getComponentAssignment_2(), "rule__MACompilationUnit__ComponentAssignment_2");
			builder.put(grammarAccess.getComponentAccess().getNameAssignment_1(), "rule__Component__NameAssignment_1");
			builder.put(grammarAccess.getComponentAccess().getArcElementsAssignment_3(), "rule__Component__ArcElementsAssignment_3");
			builder.put(grammarAccess.getSignatureAccess().getParametersAssignment_1(), "rule__Signature__ParametersAssignment_1");
			builder.put(grammarAccess.getSignatureAccess().getTypeAssignment_2_1(), "rule__Signature__TypeAssignment_2_1");
			builder.put(grammarAccess.getParametersAccess().getParametersAssignment_0(), "rule__Parameters__ParametersAssignment_0");
			builder.put(grammarAccess.getParametersAccess().getParametersAssignment_1_1(), "rule__Parameters__ParametersAssignment_1_1");
			builder.put(grammarAccess.getComponentTypeAccess().getTypeAssignment(), "rule__ComponentType__TypeAssignment");
			builder.put(grammarAccess.getParameterAccess().getTypeAssignment_0(), "rule__Parameter__TypeAssignment_0");
			builder.put(grammarAccess.getParameterAccess().getNameAssignment_1(), "rule__Parameter__NameAssignment_1");
			builder.put(grammarAccess.getParameterAccess().getExpressionAssignment_2_1(), "rule__Parameter__ExpressionAssignment_2_1");
			builder.put(grammarAccess.getSubComponentAccess().getTypeAssignment_1(), "rule__SubComponent__TypeAssignment_1");
			builder.put(grammarAccess.getSubComponentAccess().getArgumentsAssignment_2(), "rule__SubComponent__ArgumentsAssignment_2");
			builder.put(grammarAccess.getSubComponentAccess().getInstancesAssignment_3(), "rule__SubComponent__InstancesAssignment_3");
			builder.put(grammarAccess.getConnectorAccess().getSourceAssignment_0(), "rule__Connector__SourceAssignment_0");
			builder.put(grammarAccess.getConnectorAccess().getTargetAssignment_2(), "rule__Connector__TargetAssignment_2");
			builder.put(grammarAccess.getPortsAccess().getPortsAssignment_1(), "rule__Ports__PortsAssignment_1");
			builder.put(grammarAccess.getPortsAccess().getPortsAssignment_2_1(), "rule__Ports__PortsAssignment_2_1");
			builder.put(grammarAccess.getPortAccess().getConditionAssignment_1(), "rule__Port__ConditionAssignment_1");
			builder.put(grammarAccess.getPortAccess().getInAssignment_2_0(), "rule__Port__InAssignment_2_0");
			builder.put(grammarAccess.getPortAccess().getOutAssignment_2_1(), "rule__Port__OutAssignment_2_1");
			builder.put(grammarAccess.getPortAccess().getTypeAssignment_3_0(), "rule__Port__TypeAssignment_3_0");
			builder.put(grammarAccess.getPortAccess().getDataTypeAssignment_3_1(), "rule__Port__DataTypeAssignment_3_1");
			builder.put(grammarAccess.getPortAccess().getNameAssignment_4(), "rule__Port__NameAssignment_4");
			builder.put(grammarAccess.getConditionAccess().getDelayedAssignment_1(), "rule__Condition__DelayedAssignment_1");
			builder.put(grammarAccess.getConditionAccess().getConditionAssignment_4(), "rule__Condition__ConditionAssignment_4");
			builder.put(grammarAccess.getNamesAccess().getNamesAssignment_0(), "rule__Names__NamesAssignment_0");
			builder.put(grammarAccess.getNamesAccess().getNamesAssignment_1_1(), "rule__Names__NamesAssignment_1_1");
			builder.put(grammarAccess.getVariableAccess().getTypeAssignment_0(), "rule__Variable__TypeAssignment_0");
			builder.put(grammarAccess.getVariableAccess().getNameAssignment_1(), "rule__Variable__NameAssignment_1");
			builder.put(grammarAccess.getAutomatonAccess().getSyncAssignment_1(), "rule__Automaton__SyncAssignment_1");
			builder.put(grammarAccess.getAutomatonAccess().getNameAssignment_3(), "rule__Automaton__NameAssignment_3");
			builder.put(grammarAccess.getAutomatonAccess().getStatesAssignment_5_0(), "rule__Automaton__StatesAssignment_5_0");
			builder.put(grammarAccess.getAutomatonAccess().getTransitionsAssignment_5_1(), "rule__Automaton__TransitionsAssignment_5_1");
			builder.put(grammarAccess.getSCStateAccess().getModifierAssignment_0(), "rule__SCState__ModifierAssignment_0");
			builder.put(grammarAccess.getSCStateAccess().getAnteAssignment_1(), "rule__SCState__AnteAssignment_1");
			builder.put(grammarAccess.getSCStateAccess().getNameAssignment_3(), "rule__SCState__NameAssignment_3");
			builder.put(grammarAccess.getInvStateAccess().getModifierAssignment_0(), "rule__InvState__ModifierAssignment_0");
			builder.put(grammarAccess.getInvStateAccess().getNameAssignment_2(), "rule__InvState__NameAssignment_2");
			builder.put(grammarAccess.getInvStateAccess().getExpressionAssignment_4(), "rule__InvState__ExpressionAssignment_4");
			builder.put(grammarAccess.getSCSAnteAccess().getBlockAssignment_1(), "rule__SCSAnte__BlockAssignment_1");
			builder.put(grammarAccess.getTransitionAccess().getSourceAssignment_0(), "rule__Transition__SourceAssignment_0");
			builder.put(grammarAccess.getTransitionAccess().getTargetAssignment_1_1(), "rule__Transition__TargetAssignment_1_1");
			builder.put(grammarAccess.getTransitionAccess().getExpressionAssignment_2_1(), "rule__Transition__ExpressionAssignment_2_1");
			builder.put(grammarAccess.getTransitionAccess().getReactionAssignment_3_1(), "rule__Transition__ReactionAssignment_3_1");
			builder.put(grammarAccess.getBlockAccess().getBlocksAssignment_2(), "rule__Block__BlocksAssignment_2");
			builder.put(grammarAccess.getSimpleExpressionAccess().getExpressionAssignment_0(), "rule__SimpleExpression__ExpressionAssignment_0");
			builder.put(grammarAccess.getSimpleInitAccess().getNameAssignment_0(), "rule__SimpleInit__NameAssignment_0");
			builder.put(grammarAccess.getSimpleInitAccess().getExpressionsAssignment_2(), "rule__SimpleInit__ExpressionsAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MontiArcAndCoreGrammarAccess grammarAccess;

	@Override
	protected InternalMontiArcAndCoreParser createParser() {
		InternalMontiArcAndCoreParser result = new InternalMontiArcAndCoreParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MontiArcAndCoreGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MontiArcAndCoreGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}

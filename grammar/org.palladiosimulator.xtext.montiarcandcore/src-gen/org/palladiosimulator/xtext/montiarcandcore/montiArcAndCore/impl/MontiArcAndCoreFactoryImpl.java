/**
 * generated by Xtext 2.34.0
 */
package org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.ArcElement;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Argument;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Arguments;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Automaton;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.BinaryExpression;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Block;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.BlockStatement;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.CDClass;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.CDDefinition;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.CDEnum;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.ClassDiagram;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.ClassDiagramCompilationUnit;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Component;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.ComponentType;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Condition;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Connector;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Expression;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.ImportStatements;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.InvState;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.LiteralExpression;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MACompilationUnit;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MCArrayType;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MCCollectionType;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MCObjectType;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MCPrimitiveType;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MCVoidType;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Member;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MontiArcAndCore;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MontiArcAndCoreFactory;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MontiArcAndCorePackage;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.NameExpression;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Names;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.NumberLiteral;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Operator;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Parameter;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Parameters;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Port;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Ports;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.SCModifier;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.SCSAnte;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.SCState;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Signature;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.SimpleExpression;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.SimpleInit;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.State;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.StringLiteral;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.SubComponent;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Transition;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Type;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MontiArcAndCoreFactoryImpl extends EFactoryImpl implements MontiArcAndCoreFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MontiArcAndCoreFactory init()
  {
    try
    {
      MontiArcAndCoreFactory theMontiArcAndCoreFactory = (MontiArcAndCoreFactory)EPackage.Registry.INSTANCE.getEFactory(MontiArcAndCorePackage.eNS_URI);
      if (theMontiArcAndCoreFactory != null)
      {
        return theMontiArcAndCoreFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MontiArcAndCoreFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MontiArcAndCoreFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MontiArcAndCorePackage.MONTI_ARC_AND_CORE: return createMontiArcAndCore();
      case MontiArcAndCorePackage.IMPORT_STATEMENTS: return createImportStatements();
      case MontiArcAndCorePackage.PACKAGE: return createPackage();
      case MontiArcAndCorePackage.TYPE: return createType();
      case MontiArcAndCorePackage.MC_PRIMITIVE_TYPE: return createMCPrimitiveType();
      case MontiArcAndCorePackage.MC_OBJECT_TYPE: return createMCObjectType();
      case MontiArcAndCorePackage.MC_VOID_TYPE: return createMCVoidType();
      case MontiArcAndCorePackage.MC_COLLECTION_TYPE: return createMCCollectionType();
      case MontiArcAndCorePackage.MC_ARRAY_TYPE: return createMCArrayType();
      case MontiArcAndCorePackage.EXPRESSION: return createExpression();
      case MontiArcAndCorePackage.LITERAL_EXPRESSION: return createLiteralExpression();
      case MontiArcAndCorePackage.NUMBER_LITERAL: return createNumberLiteral();
      case MontiArcAndCorePackage.STRING_LITERAL: return createStringLiteral();
      case MontiArcAndCorePackage.NAME_EXPRESSION: return createNameExpression();
      case MontiArcAndCorePackage.BINARY_EXPRESSION: return createBinaryExpression();
      case MontiArcAndCorePackage.ARGUMENTS: return createArguments();
      case MontiArcAndCorePackage.ARGUMENT: return createArgument();
      case MontiArcAndCorePackage.CLASS_DIAGRAM_COMPILATION_UNIT: return createClassDiagramCompilationUnit();
      case MontiArcAndCorePackage.CLASS_DIAGRAM: return createClassDiagram();
      case MontiArcAndCorePackage.CD_DEFINITION: return createCDDefinition();
      case MontiArcAndCorePackage.CD_CLASS: return createCDClass();
      case MontiArcAndCorePackage.CD_ENUM: return createCDEnum();
      case MontiArcAndCorePackage.MEMBER: return createMember();
      case MontiArcAndCorePackage.MA_COMPILATION_UNIT: return createMACompilationUnit();
      case MontiArcAndCorePackage.COMPONENT: return createComponent();
      case MontiArcAndCorePackage.SIGNATURE: return createSignature();
      case MontiArcAndCorePackage.PARAMETERS: return createParameters();
      case MontiArcAndCorePackage.COMPONENT_TYPE: return createComponentType();
      case MontiArcAndCorePackage.PARAMETER: return createParameter();
      case MontiArcAndCorePackage.ARC_ELEMENT: return createArcElement();
      case MontiArcAndCorePackage.SUB_COMPONENT: return createSubComponent();
      case MontiArcAndCorePackage.CONNECTOR: return createConnector();
      case MontiArcAndCorePackage.PORTS: return createPorts();
      case MontiArcAndCorePackage.PORT: return createPort();
      case MontiArcAndCorePackage.CONDITION: return createCondition();
      case MontiArcAndCorePackage.NAMES: return createNames();
      case MontiArcAndCorePackage.VARIABLE: return createVariable();
      case MontiArcAndCorePackage.AUTOMATON: return createAutomaton();
      case MontiArcAndCorePackage.STATE: return createState();
      case MontiArcAndCorePackage.SC_STATE: return createSCState();
      case MontiArcAndCorePackage.INV_STATE: return createInvState();
      case MontiArcAndCorePackage.SCS_ANTE: return createSCSAnte();
      case MontiArcAndCorePackage.TRANSITION: return createTransition();
      case MontiArcAndCorePackage.BLOCK: return createBlock();
      case MontiArcAndCorePackage.BLOCK_STATEMENT: return createBlockStatement();
      case MontiArcAndCorePackage.SIMPLE_EXPRESSION: return createSimpleExpression();
      case MontiArcAndCorePackage.SIMPLE_INIT: return createSimpleInit();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MontiArcAndCorePackage.OPERATOR:
        return createOperatorFromString(eDataType, initialValue);
      case MontiArcAndCorePackage.SC_MODIFIER:
        return createSCModifierFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MontiArcAndCorePackage.OPERATOR:
        return convertOperatorToString(eDataType, instanceValue);
      case MontiArcAndCorePackage.SC_MODIFIER:
        return convertSCModifierToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MontiArcAndCore createMontiArcAndCore()
  {
    MontiArcAndCoreImpl montiArcAndCore = new MontiArcAndCoreImpl();
    return montiArcAndCore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ImportStatements createImportStatements()
  {
    ImportStatementsImpl importStatements = new ImportStatementsImpl();
    return importStatements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Package createPackage()
  {
    PackageImpl package_ = new PackageImpl();
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MCPrimitiveType createMCPrimitiveType()
  {
    MCPrimitiveTypeImpl mcPrimitiveType = new MCPrimitiveTypeImpl();
    return mcPrimitiveType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MCObjectType createMCObjectType()
  {
    MCObjectTypeImpl mcObjectType = new MCObjectTypeImpl();
    return mcObjectType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MCVoidType createMCVoidType()
  {
    MCVoidTypeImpl mcVoidType = new MCVoidTypeImpl();
    return mcVoidType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MCCollectionType createMCCollectionType()
  {
    MCCollectionTypeImpl mcCollectionType = new MCCollectionTypeImpl();
    return mcCollectionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MCArrayType createMCArrayType()
  {
    MCArrayTypeImpl mcArrayType = new MCArrayTypeImpl();
    return mcArrayType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LiteralExpression createLiteralExpression()
  {
    LiteralExpressionImpl literalExpression = new LiteralExpressionImpl();
    return literalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NumberLiteral createNumberLiteral()
  {
    NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
    return numberLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NameExpression createNameExpression()
  {
    NameExpressionImpl nameExpression = new NameExpressionImpl();
    return nameExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BinaryExpression createBinaryExpression()
  {
    BinaryExpressionImpl binaryExpression = new BinaryExpressionImpl();
    return binaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Arguments createArguments()
  {
    ArgumentsImpl arguments = new ArgumentsImpl();
    return arguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Argument createArgument()
  {
    ArgumentImpl argument = new ArgumentImpl();
    return argument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ClassDiagramCompilationUnit createClassDiagramCompilationUnit()
  {
    ClassDiagramCompilationUnitImpl classDiagramCompilationUnit = new ClassDiagramCompilationUnitImpl();
    return classDiagramCompilationUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ClassDiagram createClassDiagram()
  {
    ClassDiagramImpl classDiagram = new ClassDiagramImpl();
    return classDiagram;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CDDefinition createCDDefinition()
  {
    CDDefinitionImpl cdDefinition = new CDDefinitionImpl();
    return cdDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CDClass createCDClass()
  {
    CDClassImpl cdClass = new CDClassImpl();
    return cdClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CDEnum createCDEnum()
  {
    CDEnumImpl cdEnum = new CDEnumImpl();
    return cdEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Member createMember()
  {
    MemberImpl member = new MemberImpl();
    return member;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MACompilationUnit createMACompilationUnit()
  {
    MACompilationUnitImpl maCompilationUnit = new MACompilationUnitImpl();
    return maCompilationUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Component createComponent()
  {
    ComponentImpl component = new ComponentImpl();
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Signature createSignature()
  {
    SignatureImpl signature = new SignatureImpl();
    return signature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parameters createParameters()
  {
    ParametersImpl parameters = new ParametersImpl();
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ComponentType createComponentType()
  {
    ComponentTypeImpl componentType = new ComponentTypeImpl();
    return componentType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArcElement createArcElement()
  {
    ArcElementImpl arcElement = new ArcElementImpl();
    return arcElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SubComponent createSubComponent()
  {
    SubComponentImpl subComponent = new SubComponentImpl();
    return subComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Connector createConnector()
  {
    ConnectorImpl connector = new ConnectorImpl();
    return connector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Ports createPorts()
  {
    PortsImpl ports = new PortsImpl();
    return ports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Port createPort()
  {
    PortImpl port = new PortImpl();
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Names createNames()
  {
    NamesImpl names = new NamesImpl();
    return names;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Automaton createAutomaton()
  {
    AutomatonImpl automaton = new AutomatonImpl();
    return automaton;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SCState createSCState()
  {
    SCStateImpl scState = new SCStateImpl();
    return scState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InvState createInvState()
  {
    InvStateImpl invState = new InvStateImpl();
    return invState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SCSAnte createSCSAnte()
  {
    SCSAnteImpl scsAnte = new SCSAnteImpl();
    return scsAnte;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Transition createTransition()
  {
    TransitionImpl transition = new TransitionImpl();
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Block createBlock()
  {
    BlockImpl block = new BlockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BlockStatement createBlockStatement()
  {
    BlockStatementImpl blockStatement = new BlockStatementImpl();
    return blockStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SimpleExpression createSimpleExpression()
  {
    SimpleExpressionImpl simpleExpression = new SimpleExpressionImpl();
    return simpleExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SimpleInit createSimpleInit()
  {
    SimpleInitImpl simpleInit = new SimpleInitImpl();
    return simpleInit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operator createOperatorFromString(EDataType eDataType, String initialValue)
  {
    Operator result = Operator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SCModifier createSCModifierFromString(EDataType eDataType, String initialValue)
  {
    SCModifier result = SCModifier.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSCModifierToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MontiArcAndCorePackage getMontiArcAndCorePackage()
  {
    return (MontiArcAndCorePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MontiArcAndCorePackage getPackage()
  {
    return MontiArcAndCorePackage.eINSTANCE;
  }

} //MontiArcAndCoreFactoryImpl

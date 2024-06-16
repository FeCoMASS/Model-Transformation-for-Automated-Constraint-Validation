/**
 * generated by Xtext 2.34.0
 */
package org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Port#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Port#isIn <em>In</em>}</li>
 *   <li>{@link org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Port#isOut <em>Out</em>}</li>
 *   <li>{@link org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Port#getType <em>Type</em>}</li>
 *   <li>{@link org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Port#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Port#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MontiArcAndCorePackage#getPort()
 * @model
 * @generated
 */
public interface Port extends ArcElement
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Condition)
   * @see org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MontiArcAndCorePackage#getPort_Condition()
   * @model containment="true"
   * @generated
   */
  Condition getCondition();

  /**
   * Sets the value of the '{@link org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Port#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Condition value);

  /**
   * Returns the value of the '<em><b>In</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>In</em>' attribute.
   * @see #setIn(boolean)
   * @see org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MontiArcAndCorePackage#getPort_In()
   * @model
   * @generated
   */
  boolean isIn();

  /**
   * Sets the value of the '{@link org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Port#isIn <em>In</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>In</em>' attribute.
   * @see #isIn()
   * @generated
   */
  void setIn(boolean value);

  /**
   * Returns the value of the '<em><b>Out</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Out</em>' attribute.
   * @see #setOut(boolean)
   * @see org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MontiArcAndCorePackage#getPort_Out()
   * @model
   * @generated
   */
  boolean isOut();

  /**
   * Sets the value of the '{@link org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Port#isOut <em>Out</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Out</em>' attribute.
   * @see #isOut()
   * @generated
   */
  void setOut(boolean value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MontiArcAndCorePackage#getPort_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Port#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Data Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Type</em>' reference.
   * @see #setDataType(CDDefinition)
   * @see org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MontiArcAndCorePackage#getPort_DataType()
   * @model
   * @generated
   */
  CDDefinition getDataType();

  /**
   * Sets the value of the '{@link org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Port#getDataType <em>Data Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Type</em>' reference.
   * @see #getDataType()
   * @generated
   */
  void setDataType(CDDefinition value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MontiArcAndCorePackage#getPort_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Port#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Port
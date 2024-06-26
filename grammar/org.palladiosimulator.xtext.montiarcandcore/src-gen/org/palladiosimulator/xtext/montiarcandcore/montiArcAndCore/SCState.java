/**
 * generated by Xtext 2.34.0
 */
package org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SC State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.SCState#getAnte <em>Ante</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MontiArcAndCorePackage#getSCState()
 * @model
 * @generated
 */
public interface SCState extends State
{
  /**
   * Returns the value of the '<em><b>Ante</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ante</em>' containment reference.
   * @see #setAnte(SCSAnte)
   * @see org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MontiArcAndCorePackage#getSCState_Ante()
   * @model containment="true"
   * @generated
   */
  SCSAnte getAnte();

  /**
   * Sets the value of the '{@link org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.SCState#getAnte <em>Ante</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ante</em>' containment reference.
   * @see #getAnte()
   * @generated
   */
  void setAnte(SCSAnte value);

} // SCState

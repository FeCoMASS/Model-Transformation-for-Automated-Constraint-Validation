/**
 * generated by Xtext 2.34.0
 */
package org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Component#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Component#getArcElements <em>Arc Elements</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MontiArcAndCorePackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends ArcElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MontiArcAndCorePackage#getComponent_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Component#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Arc Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.ArcElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arc Elements</em>' containment reference list.
   * @see org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MontiArcAndCorePackage#getComponent_ArcElements()
   * @model containment="true"
   * @generated
   */
  EList<ArcElement> getArcElements();

} // Component
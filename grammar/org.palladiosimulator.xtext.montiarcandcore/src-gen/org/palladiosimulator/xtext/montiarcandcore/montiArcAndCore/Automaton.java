/**
 * generated by Xtext 2.34.0
 */
package org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Automaton</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Automaton#isSync <em>Sync</em>}</li>
 *   <li>{@link org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Automaton#isName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Automaton#getStates <em>States</em>}</li>
 *   <li>{@link org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Automaton#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MontiArcAndCorePackage#getAutomaton()
 * @model
 * @generated
 */
public interface Automaton extends ArcElement
{
  /**
   * Returns the value of the '<em><b>Sync</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sync</em>' attribute.
   * @see #setSync(boolean)
   * @see org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MontiArcAndCorePackage#getAutomaton_Sync()
   * @model
   * @generated
   */
  boolean isSync();

  /**
   * Sets the value of the '{@link org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Automaton#isSync <em>Sync</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sync</em>' attribute.
   * @see #isSync()
   * @generated
   */
  void setSync(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(boolean)
   * @see org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MontiArcAndCorePackage#getAutomaton_Name()
   * @model
   * @generated
   */
  boolean isName();

  /**
   * Sets the value of the '{@link org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Automaton#isName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #isName()
   * @generated
   */
  void setName(boolean value);

  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.State}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MontiArcAndCorePackage#getAutomaton_States()
   * @model containment="true"
   * @generated
   */
  EList<State> getStates();

  /**
   * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
   * The list contents are of type {@link org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Transition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transitions</em>' containment reference list.
   * @see org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MontiArcAndCorePackage#getAutomaton_Transitions()
   * @model containment="true"
   * @generated
   */
  EList<Transition> getTransitions();

} // Automaton

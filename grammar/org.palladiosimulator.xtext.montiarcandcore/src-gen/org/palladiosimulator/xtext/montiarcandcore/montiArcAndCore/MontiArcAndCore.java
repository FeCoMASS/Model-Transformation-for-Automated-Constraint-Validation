/**
 * generated by Xtext 2.34.0
 */
package org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monti Arc And Core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MontiArcAndCore#getClassdiagram <em>Classdiagram</em>}</li>
 *   <li>{@link org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MontiArcAndCore#getMontiarcdsl <em>Montiarcdsl</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MontiArcAndCorePackage#getMontiArcAndCore()
 * @model
 * @generated
 */
public interface MontiArcAndCore extends EObject
{
  /**
   * Returns the value of the '<em><b>Classdiagram</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classdiagram</em>' containment reference.
   * @see #setClassdiagram(ClassDiagramCompilationUnit)
   * @see org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MontiArcAndCorePackage#getMontiArcAndCore_Classdiagram()
   * @model containment="true"
   * @generated
   */
  ClassDiagramCompilationUnit getClassdiagram();

  /**
   * Sets the value of the '{@link org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MontiArcAndCore#getClassdiagram <em>Classdiagram</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Classdiagram</em>' containment reference.
   * @see #getClassdiagram()
   * @generated
   */
  void setClassdiagram(ClassDiagramCompilationUnit value);

  /**
   * Returns the value of the '<em><b>Montiarcdsl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Montiarcdsl</em>' containment reference.
   * @see #setMontiarcdsl(MACompilationUnit)
   * @see org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MontiArcAndCorePackage#getMontiArcAndCore_Montiarcdsl()
   * @model containment="true"
   * @generated
   */
  MACompilationUnit getMontiarcdsl();

  /**
   * Sets the value of the '{@link org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MontiArcAndCore#getMontiarcdsl <em>Montiarcdsl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Montiarcdsl</em>' containment reference.
   * @see #getMontiarcdsl()
   * @generated
   */
  void setMontiarcdsl(MACompilationUnit value);

} // MontiArcAndCore

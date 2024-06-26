/**
 * generated by Xtext 2.34.0
 */
package org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.ClassDiagramCompilationUnit;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MACompilationUnit;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MontiArcAndCore;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MontiArcAndCorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monti Arc And Core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.impl.MontiArcAndCoreImpl#getClassdiagram <em>Classdiagram</em>}</li>
 *   <li>{@link org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.impl.MontiArcAndCoreImpl#getMontiarcdsl <em>Montiarcdsl</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MontiArcAndCoreImpl extends MinimalEObjectImpl.Container implements MontiArcAndCore
{
  /**
   * The cached value of the '{@link #getClassdiagram() <em>Classdiagram</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassdiagram()
   * @generated
   * @ordered
   */
  protected ClassDiagramCompilationUnit classdiagram;

  /**
   * The cached value of the '{@link #getMontiarcdsl() <em>Montiarcdsl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMontiarcdsl()
   * @generated
   * @ordered
   */
  protected MACompilationUnit montiarcdsl;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MontiArcAndCoreImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MontiArcAndCorePackage.Literals.MONTI_ARC_AND_CORE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ClassDiagramCompilationUnit getClassdiagram()
  {
    return classdiagram;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClassdiagram(ClassDiagramCompilationUnit newClassdiagram, NotificationChain msgs)
  {
    ClassDiagramCompilationUnit oldClassdiagram = classdiagram;
    classdiagram = newClassdiagram;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MontiArcAndCorePackage.MONTI_ARC_AND_CORE__CLASSDIAGRAM, oldClassdiagram, newClassdiagram);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setClassdiagram(ClassDiagramCompilationUnit newClassdiagram)
  {
    if (newClassdiagram != classdiagram)
    {
      NotificationChain msgs = null;
      if (classdiagram != null)
        msgs = ((InternalEObject)classdiagram).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MontiArcAndCorePackage.MONTI_ARC_AND_CORE__CLASSDIAGRAM, null, msgs);
      if (newClassdiagram != null)
        msgs = ((InternalEObject)newClassdiagram).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MontiArcAndCorePackage.MONTI_ARC_AND_CORE__CLASSDIAGRAM, null, msgs);
      msgs = basicSetClassdiagram(newClassdiagram, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MontiArcAndCorePackage.MONTI_ARC_AND_CORE__CLASSDIAGRAM, newClassdiagram, newClassdiagram));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MACompilationUnit getMontiarcdsl()
  {
    return montiarcdsl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMontiarcdsl(MACompilationUnit newMontiarcdsl, NotificationChain msgs)
  {
    MACompilationUnit oldMontiarcdsl = montiarcdsl;
    montiarcdsl = newMontiarcdsl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MontiArcAndCorePackage.MONTI_ARC_AND_CORE__MONTIARCDSL, oldMontiarcdsl, newMontiarcdsl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMontiarcdsl(MACompilationUnit newMontiarcdsl)
  {
    if (newMontiarcdsl != montiarcdsl)
    {
      NotificationChain msgs = null;
      if (montiarcdsl != null)
        msgs = ((InternalEObject)montiarcdsl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MontiArcAndCorePackage.MONTI_ARC_AND_CORE__MONTIARCDSL, null, msgs);
      if (newMontiarcdsl != null)
        msgs = ((InternalEObject)newMontiarcdsl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MontiArcAndCorePackage.MONTI_ARC_AND_CORE__MONTIARCDSL, null, msgs);
      msgs = basicSetMontiarcdsl(newMontiarcdsl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MontiArcAndCorePackage.MONTI_ARC_AND_CORE__MONTIARCDSL, newMontiarcdsl, newMontiarcdsl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MontiArcAndCorePackage.MONTI_ARC_AND_CORE__CLASSDIAGRAM:
        return basicSetClassdiagram(null, msgs);
      case MontiArcAndCorePackage.MONTI_ARC_AND_CORE__MONTIARCDSL:
        return basicSetMontiarcdsl(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MontiArcAndCorePackage.MONTI_ARC_AND_CORE__CLASSDIAGRAM:
        return getClassdiagram();
      case MontiArcAndCorePackage.MONTI_ARC_AND_CORE__MONTIARCDSL:
        return getMontiarcdsl();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MontiArcAndCorePackage.MONTI_ARC_AND_CORE__CLASSDIAGRAM:
        setClassdiagram((ClassDiagramCompilationUnit)newValue);
        return;
      case MontiArcAndCorePackage.MONTI_ARC_AND_CORE__MONTIARCDSL:
        setMontiarcdsl((MACompilationUnit)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MontiArcAndCorePackage.MONTI_ARC_AND_CORE__CLASSDIAGRAM:
        setClassdiagram((ClassDiagramCompilationUnit)null);
        return;
      case MontiArcAndCorePackage.MONTI_ARC_AND_CORE__MONTIARCDSL:
        setMontiarcdsl((MACompilationUnit)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MontiArcAndCorePackage.MONTI_ARC_AND_CORE__CLASSDIAGRAM:
        return classdiagram != null;
      case MontiArcAndCorePackage.MONTI_ARC_AND_CORE__MONTIARCDSL:
        return montiarcdsl != null;
    }
    return super.eIsSet(featureID);
  }

} //MontiArcAndCoreImpl

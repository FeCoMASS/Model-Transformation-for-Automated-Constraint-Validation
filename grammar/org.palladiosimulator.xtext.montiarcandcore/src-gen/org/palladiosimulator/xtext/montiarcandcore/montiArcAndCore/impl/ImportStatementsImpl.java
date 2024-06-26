/**
 * generated by Xtext 2.34.0
 */
package org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.ImportStatements;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MontiArcAndCorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import Statements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.impl.ImportStatementsImpl#getImportUri <em>Import Uri</em>}</li>
 *   <li>{@link org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.impl.ImportStatementsImpl#isStar <em>Star</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportStatementsImpl extends MinimalEObjectImpl.Container implements ImportStatements
{
  /**
   * The default value of the '{@link #getImportUri() <em>Import Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportUri()
   * @generated
   * @ordered
   */
  protected static final String IMPORT_URI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImportUri() <em>Import Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportUri()
   * @generated
   * @ordered
   */
  protected String importUri = IMPORT_URI_EDEFAULT;

  /**
   * The default value of the '{@link #isStar() <em>Star</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStar()
   * @generated
   * @ordered
   */
  protected static final boolean STAR_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isStar() <em>Star</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStar()
   * @generated
   * @ordered
   */
  protected boolean star = STAR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImportStatementsImpl()
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
    return MontiArcAndCorePackage.Literals.IMPORT_STATEMENTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getImportUri()
  {
    return importUri;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setImportUri(String newImportUri)
  {
    String oldImportUri = importUri;
    importUri = newImportUri;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MontiArcAndCorePackage.IMPORT_STATEMENTS__IMPORT_URI, oldImportUri, importUri));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isStar()
  {
    return star;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStar(boolean newStar)
  {
    boolean oldStar = star;
    star = newStar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MontiArcAndCorePackage.IMPORT_STATEMENTS__STAR, oldStar, star));
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
      case MontiArcAndCorePackage.IMPORT_STATEMENTS__IMPORT_URI:
        return getImportUri();
      case MontiArcAndCorePackage.IMPORT_STATEMENTS__STAR:
        return isStar();
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
      case MontiArcAndCorePackage.IMPORT_STATEMENTS__IMPORT_URI:
        setImportUri((String)newValue);
        return;
      case MontiArcAndCorePackage.IMPORT_STATEMENTS__STAR:
        setStar((Boolean)newValue);
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
      case MontiArcAndCorePackage.IMPORT_STATEMENTS__IMPORT_URI:
        setImportUri(IMPORT_URI_EDEFAULT);
        return;
      case MontiArcAndCorePackage.IMPORT_STATEMENTS__STAR:
        setStar(STAR_EDEFAULT);
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
      case MontiArcAndCorePackage.IMPORT_STATEMENTS__IMPORT_URI:
        return IMPORT_URI_EDEFAULT == null ? importUri != null : !IMPORT_URI_EDEFAULT.equals(importUri);
      case MontiArcAndCorePackage.IMPORT_STATEMENTS__STAR:
        return star != STAR_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (importUri: ");
    result.append(importUri);
    result.append(", star: ");
    result.append(star);
    result.append(')');
    return result.toString();
  }

} //ImportStatementsImpl

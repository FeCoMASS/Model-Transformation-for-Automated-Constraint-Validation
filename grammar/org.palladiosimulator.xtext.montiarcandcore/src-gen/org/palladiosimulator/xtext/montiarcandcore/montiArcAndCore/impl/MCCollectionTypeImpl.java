/**
 * generated by Xtext 2.34.0
 */
package org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MCCollectionType;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MontiArcAndCorePackage;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MC Collection Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.impl.MCCollectionTypeImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.impl.MCCollectionTypeImpl#getInnerType <em>Inner Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MCCollectionTypeImpl extends TypeImpl implements MCCollectionType
{
  /**
   * The default value of the '{@link #getCollection() <em>Collection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCollection()
   * @generated
   * @ordered
   */
  protected static final String COLLECTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCollection() <em>Collection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCollection()
   * @generated
   * @ordered
   */
  protected String collection = COLLECTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getInnerType() <em>Inner Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInnerType()
   * @generated
   * @ordered
   */
  protected Type innerType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MCCollectionTypeImpl()
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
    return MontiArcAndCorePackage.Literals.MC_COLLECTION_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCollection()
  {
    return collection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCollection(String newCollection)
  {
    String oldCollection = collection;
    collection = newCollection;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MontiArcAndCorePackage.MC_COLLECTION_TYPE__COLLECTION, oldCollection, collection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Type getInnerType()
  {
    return innerType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInnerType(Type newInnerType, NotificationChain msgs)
  {
    Type oldInnerType = innerType;
    innerType = newInnerType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MontiArcAndCorePackage.MC_COLLECTION_TYPE__INNER_TYPE, oldInnerType, newInnerType);
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
  public void setInnerType(Type newInnerType)
  {
    if (newInnerType != innerType)
    {
      NotificationChain msgs = null;
      if (innerType != null)
        msgs = ((InternalEObject)innerType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MontiArcAndCorePackage.MC_COLLECTION_TYPE__INNER_TYPE, null, msgs);
      if (newInnerType != null)
        msgs = ((InternalEObject)newInnerType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MontiArcAndCorePackage.MC_COLLECTION_TYPE__INNER_TYPE, null, msgs);
      msgs = basicSetInnerType(newInnerType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MontiArcAndCorePackage.MC_COLLECTION_TYPE__INNER_TYPE, newInnerType, newInnerType));
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
      case MontiArcAndCorePackage.MC_COLLECTION_TYPE__INNER_TYPE:
        return basicSetInnerType(null, msgs);
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
      case MontiArcAndCorePackage.MC_COLLECTION_TYPE__COLLECTION:
        return getCollection();
      case MontiArcAndCorePackage.MC_COLLECTION_TYPE__INNER_TYPE:
        return getInnerType();
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
      case MontiArcAndCorePackage.MC_COLLECTION_TYPE__COLLECTION:
        setCollection((String)newValue);
        return;
      case MontiArcAndCorePackage.MC_COLLECTION_TYPE__INNER_TYPE:
        setInnerType((Type)newValue);
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
      case MontiArcAndCorePackage.MC_COLLECTION_TYPE__COLLECTION:
        setCollection(COLLECTION_EDEFAULT);
        return;
      case MontiArcAndCorePackage.MC_COLLECTION_TYPE__INNER_TYPE:
        setInnerType((Type)null);
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
      case MontiArcAndCorePackage.MC_COLLECTION_TYPE__COLLECTION:
        return COLLECTION_EDEFAULT == null ? collection != null : !COLLECTION_EDEFAULT.equals(collection);
      case MontiArcAndCorePackage.MC_COLLECTION_TYPE__INNER_TYPE:
        return innerType != null;
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
    result.append(" (collection: ");
    result.append(collection);
    result.append(')');
    return result.toString();
  }

} //MCCollectionTypeImpl

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

import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Block;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Expression;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.MontiArcAndCorePackage;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.State;
import org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.impl.TransitionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.palladiosimulator.xtext.montiarcandcore.montiArcAndCore.impl.TransitionImpl#getReaction <em>Reaction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition
{
  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected State source;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected State target;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

  /**
   * The cached value of the '{@link #getReaction() <em>Reaction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReaction()
   * @generated
   * @ordered
   */
  protected Block reaction;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransitionImpl()
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
    return MontiArcAndCorePackage.Literals.TRANSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public State getSource()
  {
    if (source != null && source.eIsProxy())
    {
      InternalEObject oldSource = (InternalEObject)source;
      source = (State)eResolveProxy(oldSource);
      if (source != oldSource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MontiArcAndCorePackage.TRANSITION__SOURCE, oldSource, source));
      }
    }
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSource(State newSource)
  {
    State oldSource = source;
    source = newSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MontiArcAndCorePackage.TRANSITION__SOURCE, oldSource, source));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public State getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (State)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MontiArcAndCorePackage.TRANSITION__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTarget(State newTarget)
  {
    State oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MontiArcAndCorePackage.TRANSITION__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MontiArcAndCorePackage.TRANSITION__EXPRESSION, oldExpression, newExpression);
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
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MontiArcAndCorePackage.TRANSITION__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MontiArcAndCorePackage.TRANSITION__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MontiArcAndCorePackage.TRANSITION__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Block getReaction()
  {
    return reaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReaction(Block newReaction, NotificationChain msgs)
  {
    Block oldReaction = reaction;
    reaction = newReaction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MontiArcAndCorePackage.TRANSITION__REACTION, oldReaction, newReaction);
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
  public void setReaction(Block newReaction)
  {
    if (newReaction != reaction)
    {
      NotificationChain msgs = null;
      if (reaction != null)
        msgs = ((InternalEObject)reaction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MontiArcAndCorePackage.TRANSITION__REACTION, null, msgs);
      if (newReaction != null)
        msgs = ((InternalEObject)newReaction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MontiArcAndCorePackage.TRANSITION__REACTION, null, msgs);
      msgs = basicSetReaction(newReaction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MontiArcAndCorePackage.TRANSITION__REACTION, newReaction, newReaction));
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
      case MontiArcAndCorePackage.TRANSITION__EXPRESSION:
        return basicSetExpression(null, msgs);
      case MontiArcAndCorePackage.TRANSITION__REACTION:
        return basicSetReaction(null, msgs);
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
      case MontiArcAndCorePackage.TRANSITION__SOURCE:
        if (resolve) return getSource();
        return basicGetSource();
      case MontiArcAndCorePackage.TRANSITION__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case MontiArcAndCorePackage.TRANSITION__EXPRESSION:
        return getExpression();
      case MontiArcAndCorePackage.TRANSITION__REACTION:
        return getReaction();
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
      case MontiArcAndCorePackage.TRANSITION__SOURCE:
        setSource((State)newValue);
        return;
      case MontiArcAndCorePackage.TRANSITION__TARGET:
        setTarget((State)newValue);
        return;
      case MontiArcAndCorePackage.TRANSITION__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case MontiArcAndCorePackage.TRANSITION__REACTION:
        setReaction((Block)newValue);
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
      case MontiArcAndCorePackage.TRANSITION__SOURCE:
        setSource((State)null);
        return;
      case MontiArcAndCorePackage.TRANSITION__TARGET:
        setTarget((State)null);
        return;
      case MontiArcAndCorePackage.TRANSITION__EXPRESSION:
        setExpression((Expression)null);
        return;
      case MontiArcAndCorePackage.TRANSITION__REACTION:
        setReaction((Block)null);
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
      case MontiArcAndCorePackage.TRANSITION__SOURCE:
        return source != null;
      case MontiArcAndCorePackage.TRANSITION__TARGET:
        return target != null;
      case MontiArcAndCorePackage.TRANSITION__EXPRESSION:
        return expression != null;
      case MontiArcAndCorePackage.TRANSITION__REACTION:
        return reaction != null;
    }
    return super.eIsSet(featureID);
  }

} //TransitionImpl
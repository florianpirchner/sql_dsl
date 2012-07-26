/**
 */
package org.lunifera.metamodel.dsl.sqlDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.lunifera.metamodel.dsl.sqlDSL.SExtDeclaredSQLType;
import org.lunifera.metamodel.dsl.sqlDSL.SInlinedSQLType;
import org.lunifera.metamodel.dsl.sqlDSL.SProperty;
import org.lunifera.metamodel.dsl.sqlDSL.SSimpleTypes;
import org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SProperty</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.impl.SPropertyImpl#getExtType <em>Ext Type</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.impl.SPropertyImpl#getInlinedType <em>Inlined Type</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.impl.SPropertyImpl#getSimpleType <em>Simple Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SPropertyImpl extends SEntityMemberImpl implements SProperty
{
  /**
   * The cached value of the '{@link #getExtType() <em>Ext Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtType()
   * @generated
   * @ordered
   */
  protected SExtDeclaredSQLType extType;

  /**
   * The cached value of the '{@link #getInlinedType() <em>Inlined Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInlinedType()
   * @generated
   * @ordered
   */
  protected SInlinedSQLType inlinedType;

  /**
   * The default value of the '{@link #getSimpleType() <em>Simple Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimpleType()
   * @generated
   * @ordered
   */
  protected static final SSimpleTypes SIMPLE_TYPE_EDEFAULT = SSimpleTypes.INT;

  /**
   * The cached value of the '{@link #getSimpleType() <em>Simple Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimpleType()
   * @generated
   * @ordered
   */
  protected SSimpleTypes simpleType = SIMPLE_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SPropertyImpl()
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
    return SqlDSLPackage.Literals.SPROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SExtDeclaredSQLType getExtType()
  {
    if (extType != null && extType.eIsProxy())
    {
      InternalEObject oldExtType = (InternalEObject)extType;
      extType = (SExtDeclaredSQLType)eResolveProxy(oldExtType);
      if (extType != oldExtType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SqlDSLPackage.SPROPERTY__EXT_TYPE, oldExtType, extType));
      }
    }
    return extType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SExtDeclaredSQLType basicGetExtType()
  {
    return extType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtType(SExtDeclaredSQLType newExtType)
  {
    SExtDeclaredSQLType oldExtType = extType;
    extType = newExtType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlDSLPackage.SPROPERTY__EXT_TYPE, oldExtType, extType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SInlinedSQLType getInlinedType()
  {
    return inlinedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInlinedType(SInlinedSQLType newInlinedType, NotificationChain msgs)
  {
    SInlinedSQLType oldInlinedType = inlinedType;
    inlinedType = newInlinedType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlDSLPackage.SPROPERTY__INLINED_TYPE, oldInlinedType, newInlinedType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInlinedType(SInlinedSQLType newInlinedType)
  {
    if (newInlinedType != inlinedType)
    {
      NotificationChain msgs = null;
      if (inlinedType != null)
        msgs = ((InternalEObject)inlinedType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlDSLPackage.SPROPERTY__INLINED_TYPE, null, msgs);
      if (newInlinedType != null)
        msgs = ((InternalEObject)newInlinedType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlDSLPackage.SPROPERTY__INLINED_TYPE, null, msgs);
      msgs = basicSetInlinedType(newInlinedType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlDSLPackage.SPROPERTY__INLINED_TYPE, newInlinedType, newInlinedType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SSimpleTypes getSimpleType()
  {
    return simpleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSimpleType(SSimpleTypes newSimpleType)
  {
    SSimpleTypes oldSimpleType = simpleType;
    simpleType = newSimpleType == null ? SIMPLE_TYPE_EDEFAULT : newSimpleType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlDSLPackage.SPROPERTY__SIMPLE_TYPE, oldSimpleType, simpleType));
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
      case SqlDSLPackage.SPROPERTY__INLINED_TYPE:
        return basicSetInlinedType(null, msgs);
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
      case SqlDSLPackage.SPROPERTY__EXT_TYPE:
        if (resolve) return getExtType();
        return basicGetExtType();
      case SqlDSLPackage.SPROPERTY__INLINED_TYPE:
        return getInlinedType();
      case SqlDSLPackage.SPROPERTY__SIMPLE_TYPE:
        return getSimpleType();
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
      case SqlDSLPackage.SPROPERTY__EXT_TYPE:
        setExtType((SExtDeclaredSQLType)newValue);
        return;
      case SqlDSLPackage.SPROPERTY__INLINED_TYPE:
        setInlinedType((SInlinedSQLType)newValue);
        return;
      case SqlDSLPackage.SPROPERTY__SIMPLE_TYPE:
        setSimpleType((SSimpleTypes)newValue);
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
      case SqlDSLPackage.SPROPERTY__EXT_TYPE:
        setExtType((SExtDeclaredSQLType)null);
        return;
      case SqlDSLPackage.SPROPERTY__INLINED_TYPE:
        setInlinedType((SInlinedSQLType)null);
        return;
      case SqlDSLPackage.SPROPERTY__SIMPLE_TYPE:
        setSimpleType(SIMPLE_TYPE_EDEFAULT);
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
      case SqlDSLPackage.SPROPERTY__EXT_TYPE:
        return extType != null;
      case SqlDSLPackage.SPROPERTY__INLINED_TYPE:
        return inlinedType != null;
      case SqlDSLPackage.SPROPERTY__SIMPLE_TYPE:
        return simpleType != SIMPLE_TYPE_EDEFAULT;
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (simpleType: ");
    result.append(simpleType);
    result.append(')');
    return result.toString();
  }

} //SPropertyImpl

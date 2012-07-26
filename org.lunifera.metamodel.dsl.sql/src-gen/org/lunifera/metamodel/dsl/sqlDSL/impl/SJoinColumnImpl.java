/**
 */
package org.lunifera.metamodel.dsl.sqlDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.lunifera.metamodel.dsl.sqlDSL.SJoinColumn;
import org.lunifera.metamodel.dsl.sqlDSL.STable;
import org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SJoin Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.impl.SJoinColumnImpl#getReferencedType <em>Referenced Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SJoinColumnImpl extends STableMemberImpl implements SJoinColumn
{
  /**
   * The cached value of the '{@link #getReferencedType() <em>Referenced Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferencedType()
   * @generated
   * @ordered
   */
  protected STable referencedType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SJoinColumnImpl()
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
    return SqlDSLPackage.Literals.SJOIN_COLUMN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public STable getReferencedType()
  {
    if (referencedType != null && referencedType.eIsProxy())
    {
      InternalEObject oldReferencedType = (InternalEObject)referencedType;
      referencedType = (STable)eResolveProxy(oldReferencedType);
      if (referencedType != oldReferencedType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SqlDSLPackage.SJOIN_COLUMN__REFERENCED_TYPE, oldReferencedType, referencedType));
      }
    }
    return referencedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public STable basicGetReferencedType()
  {
    return referencedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReferencedType(STable newReferencedType)
  {
    STable oldReferencedType = referencedType;
    referencedType = newReferencedType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlDSLPackage.SJOIN_COLUMN__REFERENCED_TYPE, oldReferencedType, referencedType));
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
      case SqlDSLPackage.SJOIN_COLUMN__REFERENCED_TYPE:
        if (resolve) return getReferencedType();
        return basicGetReferencedType();
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
      case SqlDSLPackage.SJOIN_COLUMN__REFERENCED_TYPE:
        setReferencedType((STable)newValue);
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
      case SqlDSLPackage.SJOIN_COLUMN__REFERENCED_TYPE:
        setReferencedType((STable)null);
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
      case SqlDSLPackage.SJOIN_COLUMN__REFERENCED_TYPE:
        return referencedType != null;
    }
    return super.eIsSet(featureID);
  }

} //SJoinColumnImpl

/**
 */
package org.lunifera.metamodel.dsl.sqlDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.lunifera.metamodel.dsl.sqlDSL.SEntityMember;
import org.lunifera.metamodel.dsl.sqlDSL.STable;
import org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>STable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.impl.STableImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.impl.STableImpl#getEntityMembers <em>Entity Members</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class STableImpl extends SArtifactImpl implements STable
{
  /**
   * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefix()
   * @generated
   * @ordered
   */
  protected static final String PREFIX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefix()
   * @generated
   * @ordered
   */
  protected String prefix = PREFIX_EDEFAULT;

  /**
   * The cached value of the '{@link #getEntityMembers() <em>Entity Members</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntityMembers()
   * @generated
   * @ordered
   */
  protected EList<SEntityMember> entityMembers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected STableImpl()
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
    return SqlDSLPackage.Literals.STABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPrefix()
  {
    return prefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrefix(String newPrefix)
  {
    String oldPrefix = prefix;
    prefix = newPrefix;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlDSLPackage.STABLE__PREFIX, oldPrefix, prefix));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SEntityMember> getEntityMembers()
  {
    if (entityMembers == null)
    {
      entityMembers = new EObjectContainmentEList<SEntityMember>(SEntityMember.class, this, SqlDSLPackage.STABLE__ENTITY_MEMBERS);
    }
    return entityMembers;
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
      case SqlDSLPackage.STABLE__ENTITY_MEMBERS:
        return ((InternalEList<?>)getEntityMembers()).basicRemove(otherEnd, msgs);
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
      case SqlDSLPackage.STABLE__PREFIX:
        return getPrefix();
      case SqlDSLPackage.STABLE__ENTITY_MEMBERS:
        return getEntityMembers();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SqlDSLPackage.STABLE__PREFIX:
        setPrefix((String)newValue);
        return;
      case SqlDSLPackage.STABLE__ENTITY_MEMBERS:
        getEntityMembers().clear();
        getEntityMembers().addAll((Collection<? extends SEntityMember>)newValue);
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
      case SqlDSLPackage.STABLE__PREFIX:
        setPrefix(PREFIX_EDEFAULT);
        return;
      case SqlDSLPackage.STABLE__ENTITY_MEMBERS:
        getEntityMembers().clear();
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
      case SqlDSLPackage.STABLE__PREFIX:
        return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
      case SqlDSLPackage.STABLE__ENTITY_MEMBERS:
        return entityMembers != null && !entityMembers.isEmpty();
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
    result.append(" (prefix: ");
    result.append(prefix);
    result.append(')');
    return result.toString();
  }

} //STableImpl

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

import org.lunifera.metamodel.dsl.sqlDSL.SSettings;
import org.lunifera.metamodel.dsl.sqlDSL.STable;
import org.lunifera.metamodel.dsl.sqlDSL.STableMember;
import org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>STable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.impl.STableImpl#getSettings <em>Settings</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.impl.STableImpl#getEntityname <em>Entityname</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.impl.STableImpl#isCached <em>Cached</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.impl.STableImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.impl.STableImpl#getColumns <em>Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class STableImpl extends SArtifactImpl implements STable
{
  /**
   * The cached value of the '{@link #getSettings() <em>Settings</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSettings()
   * @generated
   * @ordered
   */
  protected SSettings settings;

  /**
   * The default value of the '{@link #getEntityname() <em>Entityname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntityname()
   * @generated
   * @ordered
   */
  protected static final String ENTITYNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEntityname() <em>Entityname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntityname()
   * @generated
   * @ordered
   */
  protected String entityname = ENTITYNAME_EDEFAULT;

  /**
   * The default value of the '{@link #isCached() <em>Cached</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCached()
   * @generated
   * @ordered
   */
  protected static final boolean CACHED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCached() <em>Cached</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCached()
   * @generated
   * @ordered
   */
  protected boolean cached = CACHED_EDEFAULT;

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
   * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumns()
   * @generated
   * @ordered
   */
  protected EList<STableMember> columns;

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
  public SSettings getSettings()
  {
    return settings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSettings(SSettings newSettings, NotificationChain msgs)
  {
    SSettings oldSettings = settings;
    settings = newSettings;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlDSLPackage.STABLE__SETTINGS, oldSettings, newSettings);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSettings(SSettings newSettings)
  {
    if (newSettings != settings)
    {
      NotificationChain msgs = null;
      if (settings != null)
        msgs = ((InternalEObject)settings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlDSLPackage.STABLE__SETTINGS, null, msgs);
      if (newSettings != null)
        msgs = ((InternalEObject)newSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlDSLPackage.STABLE__SETTINGS, null, msgs);
      msgs = basicSetSettings(newSettings, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlDSLPackage.STABLE__SETTINGS, newSettings, newSettings));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEntityname()
  {
    return entityname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntityname(String newEntityname)
  {
    String oldEntityname = entityname;
    entityname = newEntityname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlDSLPackage.STABLE__ENTITYNAME, oldEntityname, entityname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCached()
  {
    return cached;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCached(boolean newCached)
  {
    boolean oldCached = cached;
    cached = newCached;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlDSLPackage.STABLE__CACHED, oldCached, cached));
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
  public EList<STableMember> getColumns()
  {
    if (columns == null)
    {
      columns = new EObjectContainmentEList<STableMember>(STableMember.class, this, SqlDSLPackage.STABLE__COLUMNS);
    }
    return columns;
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
      case SqlDSLPackage.STABLE__SETTINGS:
        return basicSetSettings(null, msgs);
      case SqlDSLPackage.STABLE__COLUMNS:
        return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
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
      case SqlDSLPackage.STABLE__SETTINGS:
        return getSettings();
      case SqlDSLPackage.STABLE__ENTITYNAME:
        return getEntityname();
      case SqlDSLPackage.STABLE__CACHED:
        return isCached();
      case SqlDSLPackage.STABLE__PREFIX:
        return getPrefix();
      case SqlDSLPackage.STABLE__COLUMNS:
        return getColumns();
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
      case SqlDSLPackage.STABLE__SETTINGS:
        setSettings((SSettings)newValue);
        return;
      case SqlDSLPackage.STABLE__ENTITYNAME:
        setEntityname((String)newValue);
        return;
      case SqlDSLPackage.STABLE__CACHED:
        setCached((Boolean)newValue);
        return;
      case SqlDSLPackage.STABLE__PREFIX:
        setPrefix((String)newValue);
        return;
      case SqlDSLPackage.STABLE__COLUMNS:
        getColumns().clear();
        getColumns().addAll((Collection<? extends STableMember>)newValue);
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
      case SqlDSLPackage.STABLE__SETTINGS:
        setSettings((SSettings)null);
        return;
      case SqlDSLPackage.STABLE__ENTITYNAME:
        setEntityname(ENTITYNAME_EDEFAULT);
        return;
      case SqlDSLPackage.STABLE__CACHED:
        setCached(CACHED_EDEFAULT);
        return;
      case SqlDSLPackage.STABLE__PREFIX:
        setPrefix(PREFIX_EDEFAULT);
        return;
      case SqlDSLPackage.STABLE__COLUMNS:
        getColumns().clear();
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
      case SqlDSLPackage.STABLE__SETTINGS:
        return settings != null;
      case SqlDSLPackage.STABLE__ENTITYNAME:
        return ENTITYNAME_EDEFAULT == null ? entityname != null : !ENTITYNAME_EDEFAULT.equals(entityname);
      case SqlDSLPackage.STABLE__CACHED:
        return cached != CACHED_EDEFAULT;
      case SqlDSLPackage.STABLE__PREFIX:
        return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
      case SqlDSLPackage.STABLE__COLUMNS:
        return columns != null && !columns.isEmpty();
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
    result.append(" (entityname: ");
    result.append(entityname);
    result.append(", cached: ");
    result.append(cached);
    result.append(", prefix: ");
    result.append(prefix);
    result.append(')');
    return result.toString();
  }

} //STableImpl

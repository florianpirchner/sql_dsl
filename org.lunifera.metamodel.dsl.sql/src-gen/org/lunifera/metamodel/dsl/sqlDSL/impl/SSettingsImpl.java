/**
 */
package org.lunifera.metamodel.dsl.sqlDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.lunifera.metamodel.dsl.sqlDSL.SDBEngine;
import org.lunifera.metamodel.dsl.sqlDSL.SSettings;
import org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SSettings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.impl.SSettingsImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.impl.SSettingsImpl#getEngine <em>Engine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SSettingsImpl extends MinimalEObjectImpl.Container implements SSettings
{
  /**
   * The default value of the '{@link #getSchema() <em>Schema</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSchema()
   * @generated
   * @ordered
   */
  protected static final String SCHEMA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSchema() <em>Schema</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSchema()
   * @generated
   * @ordered
   */
  protected String schema = SCHEMA_EDEFAULT;

  /**
   * The default value of the '{@link #getEngine() <em>Engine</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEngine()
   * @generated
   * @ordered
   */
  protected static final SDBEngine ENGINE_EDEFAULT = SDBEngine.INNODB;

  /**
   * The cached value of the '{@link #getEngine() <em>Engine</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEngine()
   * @generated
   * @ordered
   */
  protected SDBEngine engine = ENGINE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SSettingsImpl()
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
    return SqlDSLPackage.Literals.SSETTINGS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSchema()
  {
    return schema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSchema(String newSchema)
  {
    String oldSchema = schema;
    schema = newSchema;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlDSLPackage.SSETTINGS__SCHEMA, oldSchema, schema));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SDBEngine getEngine()
  {
    return engine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEngine(SDBEngine newEngine)
  {
    SDBEngine oldEngine = engine;
    engine = newEngine == null ? ENGINE_EDEFAULT : newEngine;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlDSLPackage.SSETTINGS__ENGINE, oldEngine, engine));
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
      case SqlDSLPackage.SSETTINGS__SCHEMA:
        return getSchema();
      case SqlDSLPackage.SSETTINGS__ENGINE:
        return getEngine();
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
      case SqlDSLPackage.SSETTINGS__SCHEMA:
        setSchema((String)newValue);
        return;
      case SqlDSLPackage.SSETTINGS__ENGINE:
        setEngine((SDBEngine)newValue);
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
      case SqlDSLPackage.SSETTINGS__SCHEMA:
        setSchema(SCHEMA_EDEFAULT);
        return;
      case SqlDSLPackage.SSETTINGS__ENGINE:
        setEngine(ENGINE_EDEFAULT);
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
      case SqlDSLPackage.SSETTINGS__SCHEMA:
        return SCHEMA_EDEFAULT == null ? schema != null : !SCHEMA_EDEFAULT.equals(schema);
      case SqlDSLPackage.SSETTINGS__ENGINE:
        return engine != ENGINE_EDEFAULT;
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
    result.append(" (schema: ");
    result.append(schema);
    result.append(", engine: ");
    result.append(engine);
    result.append(')');
    return result.toString();
  }

} //SSettingsImpl

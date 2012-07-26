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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.lunifera.metamodel.dsl.sqlDSL.SArtifact;
import org.lunifera.metamodel.dsl.sqlDSL.SModel;
import org.lunifera.metamodel.dsl.sqlDSL.SSettings;
import org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SModel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.impl.SModelImpl#getSettings <em>Settings</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.impl.SModelImpl#getArtifact <em>Artifact</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SModelImpl extends MinimalEObjectImpl.Container implements SModel
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
   * The cached value of the '{@link #getArtifact() <em>Artifact</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtifact()
   * @generated
   * @ordered
   */
  protected EList<SArtifact> artifact;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SModelImpl()
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
    return SqlDSLPackage.Literals.SMODEL;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlDSLPackage.SMODEL__SETTINGS, oldSettings, newSettings);
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
        msgs = ((InternalEObject)settings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlDSLPackage.SMODEL__SETTINGS, null, msgs);
      if (newSettings != null)
        msgs = ((InternalEObject)newSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlDSLPackage.SMODEL__SETTINGS, null, msgs);
      msgs = basicSetSettings(newSettings, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlDSLPackage.SMODEL__SETTINGS, newSettings, newSettings));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SArtifact> getArtifact()
  {
    if (artifact == null)
    {
      artifact = new EObjectContainmentEList<SArtifact>(SArtifact.class, this, SqlDSLPackage.SMODEL__ARTIFACT);
    }
    return artifact;
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
      case SqlDSLPackage.SMODEL__SETTINGS:
        return basicSetSettings(null, msgs);
      case SqlDSLPackage.SMODEL__ARTIFACT:
        return ((InternalEList<?>)getArtifact()).basicRemove(otherEnd, msgs);
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
      case SqlDSLPackage.SMODEL__SETTINGS:
        return getSettings();
      case SqlDSLPackage.SMODEL__ARTIFACT:
        return getArtifact();
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
      case SqlDSLPackage.SMODEL__SETTINGS:
        setSettings((SSettings)newValue);
        return;
      case SqlDSLPackage.SMODEL__ARTIFACT:
        getArtifact().clear();
        getArtifact().addAll((Collection<? extends SArtifact>)newValue);
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
      case SqlDSLPackage.SMODEL__SETTINGS:
        setSettings((SSettings)null);
        return;
      case SqlDSLPackage.SMODEL__ARTIFACT:
        getArtifact().clear();
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
      case SqlDSLPackage.SMODEL__SETTINGS:
        return settings != null;
      case SqlDSLPackage.SMODEL__ARTIFACT:
        return artifact != null && !artifact.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SModelImpl

/**
 */
package org.lunifera.metamodel.dsl.sqlDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.lunifera.metamodel.dsl.sqlDSL.SColumnProps;
import org.lunifera.metamodel.dsl.sqlDSL.SIndex;
import org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SColumn Props</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.impl.SColumnPropsImpl#isNullable <em>Nullable</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.impl.SColumnPropsImpl#isAes <em>Aes</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.impl.SColumnPropsImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.impl.SColumnPropsImpl#getJavacolumn <em>Javacolumn</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SColumnPropsImpl extends MinimalEObjectImpl.Container implements SColumnProps
{
  /**
   * The default value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNullable()
   * @generated
   * @ordered
   */
  protected static final boolean NULLABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNullable()
   * @generated
   * @ordered
   */
  protected boolean nullable = NULLABLE_EDEFAULT;

  /**
   * The default value of the '{@link #isAes() <em>Aes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAes()
   * @generated
   * @ordered
   */
  protected static final boolean AES_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAes() <em>Aes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAes()
   * @generated
   * @ordered
   */
  protected boolean aes = AES_EDEFAULT;

  /**
   * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
  protected static final SIndex INDEX_EDEFAULT = SIndex.NO;

  /**
   * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
  protected SIndex index = INDEX_EDEFAULT;

  /**
   * The default value of the '{@link #getJavacolumn() <em>Javacolumn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJavacolumn()
   * @generated
   * @ordered
   */
  protected static final String JAVACOLUMN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getJavacolumn() <em>Javacolumn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJavacolumn()
   * @generated
   * @ordered
   */
  protected String javacolumn = JAVACOLUMN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SColumnPropsImpl()
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
    return SqlDSLPackage.Literals.SCOLUMN_PROPS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNullable()
  {
    return nullable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNullable(boolean newNullable)
  {
    boolean oldNullable = nullable;
    nullable = newNullable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlDSLPackage.SCOLUMN_PROPS__NULLABLE, oldNullable, nullable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAes()
  {
    return aes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAes(boolean newAes)
  {
    boolean oldAes = aes;
    aes = newAes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlDSLPackage.SCOLUMN_PROPS__AES, oldAes, aes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SIndex getIndex()
  {
    return index;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndex(SIndex newIndex)
  {
    SIndex oldIndex = index;
    index = newIndex == null ? INDEX_EDEFAULT : newIndex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlDSLPackage.SCOLUMN_PROPS__INDEX, oldIndex, index));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getJavacolumn()
  {
    return javacolumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJavacolumn(String newJavacolumn)
  {
    String oldJavacolumn = javacolumn;
    javacolumn = newJavacolumn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlDSLPackage.SCOLUMN_PROPS__JAVACOLUMN, oldJavacolumn, javacolumn));
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
      case SqlDSLPackage.SCOLUMN_PROPS__NULLABLE:
        return isNullable();
      case SqlDSLPackage.SCOLUMN_PROPS__AES:
        return isAes();
      case SqlDSLPackage.SCOLUMN_PROPS__INDEX:
        return getIndex();
      case SqlDSLPackage.SCOLUMN_PROPS__JAVACOLUMN:
        return getJavacolumn();
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
      case SqlDSLPackage.SCOLUMN_PROPS__NULLABLE:
        setNullable((Boolean)newValue);
        return;
      case SqlDSLPackage.SCOLUMN_PROPS__AES:
        setAes((Boolean)newValue);
        return;
      case SqlDSLPackage.SCOLUMN_PROPS__INDEX:
        setIndex((SIndex)newValue);
        return;
      case SqlDSLPackage.SCOLUMN_PROPS__JAVACOLUMN:
        setJavacolumn((String)newValue);
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
      case SqlDSLPackage.SCOLUMN_PROPS__NULLABLE:
        setNullable(NULLABLE_EDEFAULT);
        return;
      case SqlDSLPackage.SCOLUMN_PROPS__AES:
        setAes(AES_EDEFAULT);
        return;
      case SqlDSLPackage.SCOLUMN_PROPS__INDEX:
        setIndex(INDEX_EDEFAULT);
        return;
      case SqlDSLPackage.SCOLUMN_PROPS__JAVACOLUMN:
        setJavacolumn(JAVACOLUMN_EDEFAULT);
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
      case SqlDSLPackage.SCOLUMN_PROPS__NULLABLE:
        return nullable != NULLABLE_EDEFAULT;
      case SqlDSLPackage.SCOLUMN_PROPS__AES:
        return aes != AES_EDEFAULT;
      case SqlDSLPackage.SCOLUMN_PROPS__INDEX:
        return index != INDEX_EDEFAULT;
      case SqlDSLPackage.SCOLUMN_PROPS__JAVACOLUMN:
        return JAVACOLUMN_EDEFAULT == null ? javacolumn != null : !JAVACOLUMN_EDEFAULT.equals(javacolumn);
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
    result.append(" (nullable: ");
    result.append(nullable);
    result.append(", aes: ");
    result.append(aes);
    result.append(", index: ");
    result.append(index);
    result.append(", javacolumn: ");
    result.append(javacolumn);
    result.append(')');
    return result.toString();
  }

} //SColumnPropsImpl

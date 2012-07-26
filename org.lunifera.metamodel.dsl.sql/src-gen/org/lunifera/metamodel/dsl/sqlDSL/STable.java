/**
 */
package org.lunifera.metamodel.dsl.sqlDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>STable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.STable#getSettings <em>Settings</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.STable#getEntityname <em>Entityname</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.STable#isCached <em>Cached</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.STable#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.STable#getColumns <em>Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage#getSTable()
 * @model
 * @generated
 */
public interface STable extends SArtifact
{
  /**
   * Returns the value of the '<em><b>Settings</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Settings</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Settings</em>' containment reference.
   * @see #setSettings(SSettings)
   * @see org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage#getSTable_Settings()
   * @model containment="true"
   * @generated
   */
  SSettings getSettings();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.sqlDSL.STable#getSettings <em>Settings</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Settings</em>' containment reference.
   * @see #getSettings()
   * @generated
   */
  void setSettings(SSettings value);

  /**
   * Returns the value of the '<em><b>Entityname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entityname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entityname</em>' attribute.
   * @see #setEntityname(String)
   * @see org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage#getSTable_Entityname()
   * @model
   * @generated
   */
  String getEntityname();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.sqlDSL.STable#getEntityname <em>Entityname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entityname</em>' attribute.
   * @see #getEntityname()
   * @generated
   */
  void setEntityname(String value);

  /**
   * Returns the value of the '<em><b>Cached</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cached</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cached</em>' attribute.
   * @see #setCached(boolean)
   * @see org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage#getSTable_Cached()
   * @model
   * @generated
   */
  boolean isCached();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.sqlDSL.STable#isCached <em>Cached</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cached</em>' attribute.
   * @see #isCached()
   * @generated
   */
  void setCached(boolean value);

  /**
   * Returns the value of the '<em><b>Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prefix</em>' attribute.
   * @see #setPrefix(String)
   * @see org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage#getSTable_Prefix()
   * @model
   * @generated
   */
  String getPrefix();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.sqlDSL.STable#getPrefix <em>Prefix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prefix</em>' attribute.
   * @see #getPrefix()
   * @generated
   */
  void setPrefix(String value);

  /**
   * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
   * The list contents are of type {@link org.lunifera.metamodel.dsl.sqlDSL.STableMember}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns</em>' containment reference list.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage#getSTable_Columns()
   * @model containment="true"
   * @generated
   */
  EList<STableMember> getColumns();

} // STable

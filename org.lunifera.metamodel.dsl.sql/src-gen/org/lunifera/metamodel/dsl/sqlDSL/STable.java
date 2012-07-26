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
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.STable#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.STable#getEntityMembers <em>Entity Members</em>}</li>
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
   * Returns the value of the '<em><b>Entity Members</b></em>' containment reference list.
   * The list contents are of type {@link org.lunifera.metamodel.dsl.sqlDSL.SEntityMember}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity Members</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity Members</em>' containment reference list.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage#getSTable_EntityMembers()
   * @model containment="true"
   * @generated
   */
  EList<SEntityMember> getEntityMembers();

} // STable

/**
 */
package org.lunifera.metamodel.dsl.sqlDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SModel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.SModel#getGeneratedFile <em>Generated File</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.SModel#getSettings <em>Settings</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.SModel#getArtifact <em>Artifact</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage#getSModel()
 * @model
 * @generated
 */
public interface SModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Generated File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generated File</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generated File</em>' attribute.
   * @see #setGeneratedFile(String)
   * @see org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage#getSModel_GeneratedFile()
   * @model
   * @generated
   */
  String getGeneratedFile();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.sqlDSL.SModel#getGeneratedFile <em>Generated File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Generated File</em>' attribute.
   * @see #getGeneratedFile()
   * @generated
   */
  void setGeneratedFile(String value);

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
   * @see org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage#getSModel_Settings()
   * @model containment="true"
   * @generated
   */
  SSettings getSettings();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.sqlDSL.SModel#getSettings <em>Settings</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Settings</em>' containment reference.
   * @see #getSettings()
   * @generated
   */
  void setSettings(SSettings value);

  /**
   * Returns the value of the '<em><b>Artifact</b></em>' containment reference list.
   * The list contents are of type {@link org.lunifera.metamodel.dsl.sqlDSL.SArtifact}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Artifact</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Artifact</em>' containment reference list.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage#getSModel_Artifact()
   * @model containment="true"
   * @generated
   */
  EList<SArtifact> getArtifact();

} // SModel

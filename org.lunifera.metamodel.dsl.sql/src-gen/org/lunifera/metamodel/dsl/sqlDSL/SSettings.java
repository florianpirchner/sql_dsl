/**
 */
package org.lunifera.metamodel.dsl.sqlDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SSettings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.SSettings#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.SSettings#getJavapackage <em>Javapackage</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.SSettings#getEngine <em>Engine</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage#getSSettings()
 * @model
 * @generated
 */
public interface SSettings extends EObject
{
  /**
   * Returns the value of the '<em><b>Schema</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Schema</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Schema</em>' attribute.
   * @see #setSchema(String)
   * @see org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage#getSSettings_Schema()
   * @model
   * @generated
   */
  String getSchema();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.sqlDSL.SSettings#getSchema <em>Schema</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Schema</em>' attribute.
   * @see #getSchema()
   * @generated
   */
  void setSchema(String value);

  /**
   * Returns the value of the '<em><b>Javapackage</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Javapackage</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Javapackage</em>' attribute.
   * @see #setJavapackage(String)
   * @see org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage#getSSettings_Javapackage()
   * @model
   * @generated
   */
  String getJavapackage();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.sqlDSL.SSettings#getJavapackage <em>Javapackage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Javapackage</em>' attribute.
   * @see #getJavapackage()
   * @generated
   */
  void setJavapackage(String value);

  /**
   * Returns the value of the '<em><b>Engine</b></em>' attribute.
   * The literals are from the enumeration {@link org.lunifera.metamodel.dsl.sqlDSL.SDBEngine}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Engine</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Engine</em>' attribute.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SDBEngine
   * @see #setEngine(SDBEngine)
   * @see org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage#getSSettings_Engine()
   * @model
   * @generated
   */
  SDBEngine getEngine();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.sqlDSL.SSettings#getEngine <em>Engine</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Engine</em>' attribute.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SDBEngine
   * @see #getEngine()
   * @generated
   */
  void setEngine(SDBEngine value);

} // SSettings

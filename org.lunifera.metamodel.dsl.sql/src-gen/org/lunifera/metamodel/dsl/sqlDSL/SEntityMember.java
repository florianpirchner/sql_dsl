/**
 */
package org.lunifera.metamodel.dsl.sqlDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SEntity Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.SEntityMember#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.SEntityMember#getProps <em>Props</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage#getSEntityMember()
 * @model
 * @generated
 */
public interface SEntityMember extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage#getSEntityMember_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.sqlDSL.SEntityMember#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Props</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Props</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Props</em>' containment reference.
   * @see #setProps(SColumnProps)
   * @see org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage#getSEntityMember_Props()
   * @model containment="true"
   * @generated
   */
  SColumnProps getProps();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.sqlDSL.SEntityMember#getProps <em>Props</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Props</em>' containment reference.
   * @see #getProps()
   * @generated
   */
  void setProps(SColumnProps value);

} // SEntityMember

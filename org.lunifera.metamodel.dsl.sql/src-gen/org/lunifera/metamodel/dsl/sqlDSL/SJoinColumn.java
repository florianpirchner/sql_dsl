/**
 */
package org.lunifera.metamodel.dsl.sqlDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SJoin Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.SJoinColumn#getReferencedType <em>Referenced Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage#getSJoinColumn()
 * @model
 * @generated
 */
public interface SJoinColumn extends STableMember
{
  /**
   * Returns the value of the '<em><b>Referenced Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referenced Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Referenced Type</em>' reference.
   * @see #setReferencedType(STable)
   * @see org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage#getSJoinColumn_ReferencedType()
   * @model
   * @generated
   */
  STable getReferencedType();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.sqlDSL.SJoinColumn#getReferencedType <em>Referenced Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Referenced Type</em>' reference.
   * @see #getReferencedType()
   * @generated
   */
  void setReferencedType(STable value);

} // SJoinColumn

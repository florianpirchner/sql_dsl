/**
 */
package org.lunifera.metamodel.dsl.sqlDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SEnum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.SEnum#getLiterals <em>Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage#getSEnum()
 * @model
 * @generated
 */
public interface SEnum extends SArtifact, SExtDeclaredSQLType
{
  /**
   * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
   * The list contents are of type {@link org.lunifera.metamodel.dsl.sqlDSL.SEnumLiteral}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literals</em>' containment reference list.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage#getSEnum_Literals()
   * @model containment="true"
   * @generated
   */
  EList<SEnumLiteral> getLiterals();

} // SEnum

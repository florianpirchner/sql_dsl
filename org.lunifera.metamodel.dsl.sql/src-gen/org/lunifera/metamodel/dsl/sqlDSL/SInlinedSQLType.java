/**
 */
package org.lunifera.metamodel.dsl.sqlDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SInlined SQL Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.SInlinedSQLType#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage#getSInlinedSQLType()
 * @model
 * @generated
 */
public interface SInlinedSQLType extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage#getSInlinedSQLType_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.sqlDSL.SInlinedSQLType#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // SInlinedSQLType

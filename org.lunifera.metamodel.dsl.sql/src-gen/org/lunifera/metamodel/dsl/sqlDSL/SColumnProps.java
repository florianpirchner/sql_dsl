/**
 */
package org.lunifera.metamodel.dsl.sqlDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SColumn Props</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.SColumnProps#isNullable <em>Nullable</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.SColumnProps#isAes <em>Aes</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.SColumnProps#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage#getSColumnProps()
 * @model
 * @generated
 */
public interface SColumnProps extends EObject
{
  /**
   * Returns the value of the '<em><b>Nullable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nullable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nullable</em>' attribute.
   * @see #setNullable(boolean)
   * @see org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage#getSColumnProps_Nullable()
   * @model
   * @generated
   */
  boolean isNullable();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.sqlDSL.SColumnProps#isNullable <em>Nullable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nullable</em>' attribute.
   * @see #isNullable()
   * @generated
   */
  void setNullable(boolean value);

  /**
   * Returns the value of the '<em><b>Aes</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aes</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aes</em>' attribute.
   * @see #setAes(boolean)
   * @see org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage#getSColumnProps_Aes()
   * @model
   * @generated
   */
  boolean isAes();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.sqlDSL.SColumnProps#isAes <em>Aes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aes</em>' attribute.
   * @see #isAes()
   * @generated
   */
  void setAes(boolean value);

  /**
   * Returns the value of the '<em><b>Index</b></em>' attribute.
   * The literals are from the enumeration {@link org.lunifera.metamodel.dsl.sqlDSL.SIndex}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Index</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' attribute.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SIndex
   * @see #setIndex(SIndex)
   * @see org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage#getSColumnProps_Index()
   * @model
   * @generated
   */
  SIndex getIndex();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.sqlDSL.SColumnProps#getIndex <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' attribute.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SIndex
   * @see #getIndex()
   * @generated
   */
  void setIndex(SIndex value);

} // SColumnProps

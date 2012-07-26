/**
 */
package org.lunifera.metamodel.dsl.sqlDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SProperty</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.SProperty#getExtType <em>Ext Type</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.SProperty#getInlinedType <em>Inlined Type</em>}</li>
 *   <li>{@link org.lunifera.metamodel.dsl.sqlDSL.SProperty#getSimpleType <em>Simple Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage#getSProperty()
 * @model
 * @generated
 */
public interface SProperty extends SEntityMember
{
  /**
   * Returns the value of the '<em><b>Ext Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ext Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ext Type</em>' reference.
   * @see #setExtType(SExtDeclaredSQLType)
   * @see org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage#getSProperty_ExtType()
   * @model
   * @generated
   */
  SExtDeclaredSQLType getExtType();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.sqlDSL.SProperty#getExtType <em>Ext Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ext Type</em>' reference.
   * @see #getExtType()
   * @generated
   */
  void setExtType(SExtDeclaredSQLType value);

  /**
   * Returns the value of the '<em><b>Inlined Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inlined Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inlined Type</em>' containment reference.
   * @see #setInlinedType(SInlinedSQLType)
   * @see org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage#getSProperty_InlinedType()
   * @model containment="true"
   * @generated
   */
  SInlinedSQLType getInlinedType();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.sqlDSL.SProperty#getInlinedType <em>Inlined Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inlined Type</em>' containment reference.
   * @see #getInlinedType()
   * @generated
   */
  void setInlinedType(SInlinedSQLType value);

  /**
   * Returns the value of the '<em><b>Simple Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.lunifera.metamodel.dsl.sqlDSL.SSimpleTypes}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Simple Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simple Type</em>' attribute.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SSimpleTypes
   * @see #setSimpleType(SSimpleTypes)
   * @see org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage#getSProperty_SimpleType()
   * @model
   * @generated
   */
  SSimpleTypes getSimpleType();

  /**
   * Sets the value of the '{@link org.lunifera.metamodel.dsl.sqlDSL.SProperty#getSimpleType <em>Simple Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Simple Type</em>' attribute.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SSimpleTypes
   * @see #getSimpleType()
   * @generated
   */
  void setSimpleType(SSimpleTypes value);

} // SProperty

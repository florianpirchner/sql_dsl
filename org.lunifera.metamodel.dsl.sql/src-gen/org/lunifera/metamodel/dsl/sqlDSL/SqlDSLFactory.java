/**
 */
package org.lunifera.metamodel.dsl.sqlDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage
 * @generated
 */
public interface SqlDSLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SqlDSLFactory eINSTANCE = org.lunifera.metamodel.dsl.sqlDSL.impl.SqlDSLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>SModel</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SModel</em>'.
   * @generated
   */
  SModel createSModel();

  /**
   * Returns a new object of class '<em>SSettings</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SSettings</em>'.
   * @generated
   */
  SSettings createSSettings();

  /**
   * Returns a new object of class '<em>SArtifact</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SArtifact</em>'.
   * @generated
   */
  SArtifact createSArtifact();

  /**
   * Returns a new object of class '<em>STable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>STable</em>'.
   * @generated
   */
  STable createSTable();

  /**
   * Returns a new object of class '<em>SEntity Member</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SEntity Member</em>'.
   * @generated
   */
  SEntityMember createSEntityMember();

  /**
   * Returns a new object of class '<em>SProperty</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SProperty</em>'.
   * @generated
   */
  SProperty createSProperty();

  /**
   * Returns a new object of class '<em>SJoin Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SJoin Property</em>'.
   * @generated
   */
  SJoinProperty createSJoinProperty();

  /**
   * Returns a new object of class '<em>SColumn Props</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SColumn Props</em>'.
   * @generated
   */
  SColumnProps createSColumnProps();

  /**
   * Returns a new object of class '<em>SExt Declared SQL Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SExt Declared SQL Type</em>'.
   * @generated
   */
  SExtDeclaredSQLType createSExtDeclaredSQLType();

  /**
   * Returns a new object of class '<em>SInlined SQL Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SInlined SQL Type</em>'.
   * @generated
   */
  SInlinedSQLType createSInlinedSQLType();

  /**
   * Returns a new object of class '<em>SEnum</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SEnum</em>'.
   * @generated
   */
  SEnum createSEnum();

  /**
   * Returns a new object of class '<em>SEnum Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SEnum Literal</em>'.
   * @generated
   */
  SEnumLiteral createSEnumLiteral();

  /**
   * Returns a new object of class '<em>SString</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SString</em>'.
   * @generated
   */
  SString createSString();

  /**
   * Returns a new object of class '<em>SDecimal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SDecimal</em>'.
   * @generated
   */
  SDecimal createSDecimal();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SqlDSLPackage getSqlDSLPackage();

} //SqlDSLFactory

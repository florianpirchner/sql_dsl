/**
 */
package org.lunifera.metamodel.dsl.sqlDSL.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.lunifera.metamodel.dsl.sqlDSL.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage
 * @generated
 */
public class SqlDSLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SqlDSLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SqlDSLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SqlDSLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SqlDSLPackage.SMODEL:
      {
        SModel sModel = (SModel)theEObject;
        T result = caseSModel(sModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqlDSLPackage.SSETTINGS:
      {
        SSettings sSettings = (SSettings)theEObject;
        T result = caseSSettings(sSettings);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqlDSLPackage.SARTIFACT:
      {
        SArtifact sArtifact = (SArtifact)theEObject;
        T result = caseSArtifact(sArtifact);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqlDSLPackage.STABLE:
      {
        STable sTable = (STable)theEObject;
        T result = caseSTable(sTable);
        if (result == null) result = caseSArtifact(sTable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqlDSLPackage.STABLE_MEMBER:
      {
        STableMember sTableMember = (STableMember)theEObject;
        T result = caseSTableMember(sTableMember);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqlDSLPackage.SCOLUMN:
      {
        SColumn sColumn = (SColumn)theEObject;
        T result = caseSColumn(sColumn);
        if (result == null) result = caseSTableMember(sColumn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqlDSLPackage.SJOIN_COLUMN:
      {
        SJoinColumn sJoinColumn = (SJoinColumn)theEObject;
        T result = caseSJoinColumn(sJoinColumn);
        if (result == null) result = caseSTableMember(sJoinColumn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqlDSLPackage.SCOLUMN_PROPS:
      {
        SColumnProps sColumnProps = (SColumnProps)theEObject;
        T result = caseSColumnProps(sColumnProps);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqlDSLPackage.SEXT_DECLARED_SQL_TYPE:
      {
        SExtDeclaredSQLType sExtDeclaredSQLType = (SExtDeclaredSQLType)theEObject;
        T result = caseSExtDeclaredSQLType(sExtDeclaredSQLType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqlDSLPackage.SINLINED_SQL_TYPE:
      {
        SInlinedSQLType sInlinedSQLType = (SInlinedSQLType)theEObject;
        T result = caseSInlinedSQLType(sInlinedSQLType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqlDSLPackage.SENUM:
      {
        SEnum sEnum = (SEnum)theEObject;
        T result = caseSEnum(sEnum);
        if (result == null) result = caseSArtifact(sEnum);
        if (result == null) result = caseSExtDeclaredSQLType(sEnum);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqlDSLPackage.SENUM_LITERAL:
      {
        SEnumLiteral sEnumLiteral = (SEnumLiteral)theEObject;
        T result = caseSEnumLiteral(sEnumLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqlDSLPackage.SSTRING:
      {
        SString sString = (SString)theEObject;
        T result = caseSString(sString);
        if (result == null) result = caseSInlinedSQLType(sString);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SqlDSLPackage.SDECIMAL:
      {
        SDecimal sDecimal = (SDecimal)theEObject;
        T result = caseSDecimal(sDecimal);
        if (result == null) result = caseSInlinedSQLType(sDecimal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SModel</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SModel</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSModel(SModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SSettings</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SSettings</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSSettings(SSettings object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SArtifact</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SArtifact</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSArtifact(SArtifact object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>STable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>STable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSTable(STable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>STable Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>STable Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSTableMember(STableMember object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SColumn</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SColumn</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSColumn(SColumn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SJoin Column</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SJoin Column</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSJoinColumn(SJoinColumn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SColumn Props</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SColumn Props</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSColumnProps(SColumnProps object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SExt Declared SQL Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SExt Declared SQL Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSExtDeclaredSQLType(SExtDeclaredSQLType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SInlined SQL Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SInlined SQL Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSInlinedSQLType(SInlinedSQLType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SEnum</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SEnum</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSEnum(SEnum object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SEnum Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SEnum Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSEnumLiteral(SEnumLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SString</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SString</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSString(SString object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SDecimal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SDecimal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSDecimal(SDecimal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SqlDSLSwitch

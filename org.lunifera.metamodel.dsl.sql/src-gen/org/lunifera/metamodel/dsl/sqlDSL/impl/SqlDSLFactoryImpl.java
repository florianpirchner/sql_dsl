/**
 */
package org.lunifera.metamodel.dsl.sqlDSL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.lunifera.metamodel.dsl.sqlDSL.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SqlDSLFactoryImpl extends EFactoryImpl implements SqlDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SqlDSLFactory init()
  {
    try
    {
      SqlDSLFactory theSqlDSLFactory = (SqlDSLFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.lunifera.org/metamodel/dsl/SqlDSL"); 
      if (theSqlDSLFactory != null)
      {
        return theSqlDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SqlDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SqlDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SqlDSLPackage.SMODEL: return createSModel();
      case SqlDSLPackage.SSETTINGS: return createSSettings();
      case SqlDSLPackage.SARTIFACT: return createSArtifact();
      case SqlDSLPackage.STABLE: return createSTable();
      case SqlDSLPackage.SENTITY_MEMBER: return createSEntityMember();
      case SqlDSLPackage.SPROPERTY: return createSProperty();
      case SqlDSLPackage.SJOIN_PROPERTY: return createSJoinProperty();
      case SqlDSLPackage.SCOLUMN_PROPS: return createSColumnProps();
      case SqlDSLPackage.SEXT_DECLARED_SQL_TYPE: return createSExtDeclaredSQLType();
      case SqlDSLPackage.SINLINED_SQL_TYPE: return createSInlinedSQLType();
      case SqlDSLPackage.SENUM: return createSEnum();
      case SqlDSLPackage.SENUM_LITERAL: return createSEnumLiteral();
      case SqlDSLPackage.SSTRING: return createSString();
      case SqlDSLPackage.SDECIMAL: return createSDecimal();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SqlDSLPackage.SDB_ENGINE:
        return createSDBEngineFromString(eDataType, initialValue);
      case SqlDSLPackage.SSIMPLE_TYPES:
        return createSSimpleTypesFromString(eDataType, initialValue);
      case SqlDSLPackage.SINDEX:
        return createSIndexFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SqlDSLPackage.SDB_ENGINE:
        return convertSDBEngineToString(eDataType, instanceValue);
      case SqlDSLPackage.SSIMPLE_TYPES:
        return convertSSimpleTypesToString(eDataType, instanceValue);
      case SqlDSLPackage.SINDEX:
        return convertSIndexToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SModel createSModel()
  {
    SModelImpl sModel = new SModelImpl();
    return sModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SSettings createSSettings()
  {
    SSettingsImpl sSettings = new SSettingsImpl();
    return sSettings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SArtifact createSArtifact()
  {
    SArtifactImpl sArtifact = new SArtifactImpl();
    return sArtifact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public STable createSTable()
  {
    STableImpl sTable = new STableImpl();
    return sTable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SEntityMember createSEntityMember()
  {
    SEntityMemberImpl sEntityMember = new SEntityMemberImpl();
    return sEntityMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SProperty createSProperty()
  {
    SPropertyImpl sProperty = new SPropertyImpl();
    return sProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SJoinProperty createSJoinProperty()
  {
    SJoinPropertyImpl sJoinProperty = new SJoinPropertyImpl();
    return sJoinProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SColumnProps createSColumnProps()
  {
    SColumnPropsImpl sColumnProps = new SColumnPropsImpl();
    return sColumnProps;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SExtDeclaredSQLType createSExtDeclaredSQLType()
  {
    SExtDeclaredSQLTypeImpl sExtDeclaredSQLType = new SExtDeclaredSQLTypeImpl();
    return sExtDeclaredSQLType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SInlinedSQLType createSInlinedSQLType()
  {
    SInlinedSQLTypeImpl sInlinedSQLType = new SInlinedSQLTypeImpl();
    return sInlinedSQLType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SEnum createSEnum()
  {
    SEnumImpl sEnum = new SEnumImpl();
    return sEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SEnumLiteral createSEnumLiteral()
  {
    SEnumLiteralImpl sEnumLiteral = new SEnumLiteralImpl();
    return sEnumLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SString createSString()
  {
    SStringImpl sString = new SStringImpl();
    return sString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SDecimal createSDecimal()
  {
    SDecimalImpl sDecimal = new SDecimalImpl();
    return sDecimal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SDBEngine createSDBEngineFromString(EDataType eDataType, String initialValue)
  {
    SDBEngine result = SDBEngine.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSDBEngineToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SSimpleTypes createSSimpleTypesFromString(EDataType eDataType, String initialValue)
  {
    SSimpleTypes result = SSimpleTypes.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSSimpleTypesToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SIndex createSIndexFromString(EDataType eDataType, String initialValue)
  {
    SIndex result = SIndex.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSIndexToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SqlDSLPackage getSqlDSLPackage()
  {
    return (SqlDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SqlDSLPackage getPackage()
  {
    return SqlDSLPackage.eINSTANCE;
  }

} //SqlDSLFactoryImpl

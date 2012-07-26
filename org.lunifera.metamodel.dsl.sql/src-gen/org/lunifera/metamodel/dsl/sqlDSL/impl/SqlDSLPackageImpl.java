/**
 */
package org.lunifera.metamodel.dsl.sqlDSL.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.lunifera.metamodel.dsl.sqlDSL.SArtifact;
import org.lunifera.metamodel.dsl.sqlDSL.SColumnProps;
import org.lunifera.metamodel.dsl.sqlDSL.SDBEngine;
import org.lunifera.metamodel.dsl.sqlDSL.SDecimal;
import org.lunifera.metamodel.dsl.sqlDSL.SEntityMember;
import org.lunifera.metamodel.dsl.sqlDSL.SEnum;
import org.lunifera.metamodel.dsl.sqlDSL.SEnumLiteral;
import org.lunifera.metamodel.dsl.sqlDSL.SExtDeclaredSQLType;
import org.lunifera.metamodel.dsl.sqlDSL.SIndex;
import org.lunifera.metamodel.dsl.sqlDSL.SInlinedSQLType;
import org.lunifera.metamodel.dsl.sqlDSL.SJoinProperty;
import org.lunifera.metamodel.dsl.sqlDSL.SModel;
import org.lunifera.metamodel.dsl.sqlDSL.SProperty;
import org.lunifera.metamodel.dsl.sqlDSL.SSettings;
import org.lunifera.metamodel.dsl.sqlDSL.SSimpleTypes;
import org.lunifera.metamodel.dsl.sqlDSL.SString;
import org.lunifera.metamodel.dsl.sqlDSL.STable;
import org.lunifera.metamodel.dsl.sqlDSL.SqlDSLFactory;
import org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SqlDSLPackageImpl extends EPackageImpl implements SqlDSLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sSettingsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sArtifactEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sTableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sEntityMemberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sJoinPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sColumnPropsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sExtDeclaredSQLTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sInlinedSQLTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sEnumEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sEnumLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sStringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sDecimalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum sdbEngineEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum sSimpleTypesEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum sIndexEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SqlDSLPackageImpl()
  {
    super(eNS_URI, SqlDSLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SqlDSLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SqlDSLPackage init()
  {
    if (isInited) return (SqlDSLPackage)EPackage.Registry.INSTANCE.getEPackage(SqlDSLPackage.eNS_URI);

    // Obtain or create and register package
    SqlDSLPackageImpl theSqlDSLPackage = (SqlDSLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SqlDSLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SqlDSLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSqlDSLPackage.createPackageContents();

    // Initialize created meta-data
    theSqlDSLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSqlDSLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SqlDSLPackage.eNS_URI, theSqlDSLPackage);
    return theSqlDSLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSModel()
  {
    return sModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSModel_Settings()
  {
    return (EReference)sModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSModel_Artifact()
  {
    return (EReference)sModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSSettings()
  {
    return sSettingsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSSettings_Schema()
  {
    return (EAttribute)sSettingsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSSettings_Engine()
  {
    return (EAttribute)sSettingsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSArtifact()
  {
    return sArtifactEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSArtifact_Name()
  {
    return (EAttribute)sArtifactEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSTable()
  {
    return sTableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSTable_Settings()
  {
    return (EReference)sTableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSTable_Prefix()
  {
    return (EAttribute)sTableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSTable_EntityMembers()
  {
    return (EReference)sTableEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSEntityMember()
  {
    return sEntityMemberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSEntityMember_Name()
  {
    return (EAttribute)sEntityMemberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSEntityMember_Props()
  {
    return (EReference)sEntityMemberEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSProperty()
  {
    return sPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSProperty_ExtType()
  {
    return (EReference)sPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSProperty_InlinedType()
  {
    return (EReference)sPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSProperty_SimpleType()
  {
    return (EAttribute)sPropertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSJoinProperty()
  {
    return sJoinPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSJoinProperty_Type()
  {
    return (EReference)sJoinPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSColumnProps()
  {
    return sColumnPropsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSColumnProps_Nullable()
  {
    return (EAttribute)sColumnPropsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSColumnProps_Aes()
  {
    return (EAttribute)sColumnPropsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSColumnProps_Index()
  {
    return (EAttribute)sColumnPropsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSExtDeclaredSQLType()
  {
    return sExtDeclaredSQLTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSInlinedSQLType()
  {
    return sInlinedSQLTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSInlinedSQLType_Value()
  {
    return (EAttribute)sInlinedSQLTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSEnum()
  {
    return sEnumEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSEnum_Literals()
  {
    return (EReference)sEnumEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSEnumLiteral()
  {
    return sEnumLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSEnumLiteral_Name()
  {
    return (EAttribute)sEnumLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSEnumLiteral_Value()
  {
    return (EAttribute)sEnumLiteralEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSString()
  {
    return sStringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSDecimal()
  {
    return sDecimalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSDBEngine()
  {
    return sdbEngineEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSSimpleTypes()
  {
    return sSimpleTypesEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSIndex()
  {
    return sIndexEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SqlDSLFactory getSqlDSLFactory()
  {
    return (SqlDSLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    sModelEClass = createEClass(SMODEL);
    createEReference(sModelEClass, SMODEL__SETTINGS);
    createEReference(sModelEClass, SMODEL__ARTIFACT);

    sSettingsEClass = createEClass(SSETTINGS);
    createEAttribute(sSettingsEClass, SSETTINGS__SCHEMA);
    createEAttribute(sSettingsEClass, SSETTINGS__ENGINE);

    sArtifactEClass = createEClass(SARTIFACT);
    createEAttribute(sArtifactEClass, SARTIFACT__NAME);

    sTableEClass = createEClass(STABLE);
    createEReference(sTableEClass, STABLE__SETTINGS);
    createEAttribute(sTableEClass, STABLE__PREFIX);
    createEReference(sTableEClass, STABLE__ENTITY_MEMBERS);

    sEntityMemberEClass = createEClass(SENTITY_MEMBER);
    createEAttribute(sEntityMemberEClass, SENTITY_MEMBER__NAME);
    createEReference(sEntityMemberEClass, SENTITY_MEMBER__PROPS);

    sPropertyEClass = createEClass(SPROPERTY);
    createEReference(sPropertyEClass, SPROPERTY__EXT_TYPE);
    createEReference(sPropertyEClass, SPROPERTY__INLINED_TYPE);
    createEAttribute(sPropertyEClass, SPROPERTY__SIMPLE_TYPE);

    sJoinPropertyEClass = createEClass(SJOIN_PROPERTY);
    createEReference(sJoinPropertyEClass, SJOIN_PROPERTY__TYPE);

    sColumnPropsEClass = createEClass(SCOLUMN_PROPS);
    createEAttribute(sColumnPropsEClass, SCOLUMN_PROPS__NULLABLE);
    createEAttribute(sColumnPropsEClass, SCOLUMN_PROPS__AES);
    createEAttribute(sColumnPropsEClass, SCOLUMN_PROPS__INDEX);

    sExtDeclaredSQLTypeEClass = createEClass(SEXT_DECLARED_SQL_TYPE);

    sInlinedSQLTypeEClass = createEClass(SINLINED_SQL_TYPE);
    createEAttribute(sInlinedSQLTypeEClass, SINLINED_SQL_TYPE__VALUE);

    sEnumEClass = createEClass(SENUM);
    createEReference(sEnumEClass, SENUM__LITERALS);

    sEnumLiteralEClass = createEClass(SENUM_LITERAL);
    createEAttribute(sEnumLiteralEClass, SENUM_LITERAL__NAME);
    createEAttribute(sEnumLiteralEClass, SENUM_LITERAL__VALUE);

    sStringEClass = createEClass(SSTRING);

    sDecimalEClass = createEClass(SDECIMAL);

    // Create enums
    sdbEngineEEnum = createEEnum(SDB_ENGINE);
    sSimpleTypesEEnum = createEEnum(SSIMPLE_TYPES);
    sIndexEEnum = createEEnum(SINDEX);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    sTableEClass.getESuperTypes().add(this.getSArtifact());
    sPropertyEClass.getESuperTypes().add(this.getSEntityMember());
    sJoinPropertyEClass.getESuperTypes().add(this.getSEntityMember());
    sEnumEClass.getESuperTypes().add(this.getSArtifact());
    sEnumEClass.getESuperTypes().add(this.getSExtDeclaredSQLType());
    sStringEClass.getESuperTypes().add(this.getSInlinedSQLType());
    sDecimalEClass.getESuperTypes().add(this.getSInlinedSQLType());

    // Initialize classes and features; add operations and parameters
    initEClass(sModelEClass, SModel.class, "SModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSModel_Settings(), this.getSSettings(), null, "settings", null, 0, 1, SModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSModel_Artifact(), this.getSArtifact(), null, "artifact", null, 0, -1, SModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sSettingsEClass, SSettings.class, "SSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSSettings_Schema(), ecorePackage.getEString(), "schema", null, 0, 1, SSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSSettings_Engine(), this.getSDBEngine(), "engine", null, 0, 1, SSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sArtifactEClass, SArtifact.class, "SArtifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSArtifact_Name(), ecorePackage.getEString(), "name", null, 0, 1, SArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sTableEClass, STable.class, "STable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSTable_Settings(), this.getSSettings(), null, "settings", null, 0, 1, STable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSTable_Prefix(), ecorePackage.getEString(), "prefix", null, 0, 1, STable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSTable_EntityMembers(), this.getSEntityMember(), null, "entityMembers", null, 0, -1, STable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sEntityMemberEClass, SEntityMember.class, "SEntityMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSEntityMember_Name(), ecorePackage.getEString(), "name", null, 0, 1, SEntityMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSEntityMember_Props(), this.getSColumnProps(), null, "props", null, 0, 1, SEntityMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sPropertyEClass, SProperty.class, "SProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSProperty_ExtType(), this.getSExtDeclaredSQLType(), null, "extType", null, 0, 1, SProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSProperty_InlinedType(), this.getSInlinedSQLType(), null, "inlinedType", null, 0, 1, SProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSProperty_SimpleType(), this.getSSimpleTypes(), "simpleType", null, 0, 1, SProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sJoinPropertyEClass, SJoinProperty.class, "SJoinProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSJoinProperty_Type(), this.getSTable(), null, "type", null, 0, 1, SJoinProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sColumnPropsEClass, SColumnProps.class, "SColumnProps", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSColumnProps_Nullable(), ecorePackage.getEBoolean(), "nullable", null, 0, 1, SColumnProps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSColumnProps_Aes(), ecorePackage.getEBoolean(), "aes", null, 0, 1, SColumnProps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSColumnProps_Index(), this.getSIndex(), "index", null, 0, 1, SColumnProps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sExtDeclaredSQLTypeEClass, SExtDeclaredSQLType.class, "SExtDeclaredSQLType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sInlinedSQLTypeEClass, SInlinedSQLType.class, "SInlinedSQLType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSInlinedSQLType_Value(), ecorePackage.getEInt(), "value", null, 0, 1, SInlinedSQLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sEnumEClass, SEnum.class, "SEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSEnum_Literals(), this.getSEnumLiteral(), null, "literals", null, 0, -1, SEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sEnumLiteralEClass, SEnumLiteral.class, "SEnumLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSEnumLiteral_Name(), ecorePackage.getEString(), "name", null, 0, 1, SEnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSEnumLiteral_Value(), ecorePackage.getEInt(), "value", null, 0, 1, SEnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sStringEClass, SString.class, "SString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sDecimalEClass, SDecimal.class, "SDecimal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Initialize enums and add enum literals
    initEEnum(sdbEngineEEnum, SDBEngine.class, "SDBEngine");
    addEEnumLiteral(sdbEngineEEnum, SDBEngine.INNODB);
    addEEnumLiteral(sdbEngineEEnum, SDBEngine.MYISAM);

    initEEnum(sSimpleTypesEEnum, SSimpleTypes.class, "SSimpleTypes");
    addEEnumLiteral(sSimpleTypesEEnum, SSimpleTypes.INT);
    addEEnumLiteral(sSimpleTypesEEnum, SSimpleTypes.TINY_INT);
    addEEnumLiteral(sSimpleTypesEEnum, SSimpleTypes.SMALL_INT);
    addEEnumLiteral(sSimpleTypesEEnum, SSimpleTypes.MEDIUM_INT);
    addEEnumLiteral(sSimpleTypesEEnum, SSimpleTypes.BOOLEAN);
    addEEnumLiteral(sSimpleTypesEEnum, SSimpleTypes.BLOB);
    addEEnumLiteral(sSimpleTypesEEnum, SSimpleTypes.DATETIME);
    addEEnumLiteral(sSimpleTypesEEnum, SSimpleTypes.DATE);
    addEEnumLiteral(sSimpleTypesEEnum, SSimpleTypes.TIME);
    addEEnumLiteral(sSimpleTypesEEnum, SSimpleTypes.POLYGON);
    addEEnumLiteral(sSimpleTypesEEnum, SSimpleTypes.POINT);
    addEEnumLiteral(sSimpleTypesEEnum, SSimpleTypes.FOTO);
    addEEnumLiteral(sSimpleTypesEEnum, SSimpleTypes.CURRENCY);
    addEEnumLiteral(sSimpleTypesEEnum, SSimpleTypes.COORDINATE);

    initEEnum(sIndexEEnum, SIndex.class, "SIndex");
    addEEnumLiteral(sIndexEEnum, SIndex.NO);
    addEEnumLiteral(sIndexEEnum, SIndex.YES);
    addEEnumLiteral(sIndexEEnum, SIndex.UNIQUE);
    addEEnumLiteral(sIndexEEnum, SIndex.SPATIAL);

    // Create resource
    createResource(eNS_URI);
  }

} //SqlDSLPackageImpl

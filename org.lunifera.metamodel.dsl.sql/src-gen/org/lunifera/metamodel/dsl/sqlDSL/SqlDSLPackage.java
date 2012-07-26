/**
 */
package org.lunifera.metamodel.dsl.sqlDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.lunifera.metamodel.dsl.sqlDSL.SqlDSLFactory
 * @model kind="package"
 * @generated
 */
public interface SqlDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sqlDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.lunifera.org/metamodel/dsl/SqlDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sqlDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SqlDSLPackage eINSTANCE = org.lunifera.metamodel.dsl.sqlDSL.impl.SqlDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.sqlDSL.impl.SModelImpl <em>SModel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SModelImpl
   * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SqlDSLPackageImpl#getSModel()
   * @generated
   */
  int SMODEL = 0;

  /**
   * The feature id for the '<em><b>Generated File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMODEL__GENERATED_FILE = 0;

  /**
   * The feature id for the '<em><b>Settings</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMODEL__SETTINGS = 1;

  /**
   * The feature id for the '<em><b>Artifact</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMODEL__ARTIFACT = 2;

  /**
   * The number of structural features of the '<em>SModel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.sqlDSL.impl.SSettingsImpl <em>SSettings</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SSettingsImpl
   * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SqlDSLPackageImpl#getSSettings()
   * @generated
   */
  int SSETTINGS = 1;

  /**
   * The feature id for the '<em><b>Schema</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SSETTINGS__SCHEMA = 0;

  /**
   * The feature id for the '<em><b>Javapackage</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SSETTINGS__JAVAPACKAGE = 1;

  /**
   * The feature id for the '<em><b>Engine</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SSETTINGS__ENGINE = 2;

  /**
   * The number of structural features of the '<em>SSettings</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SSETTINGS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.sqlDSL.impl.SArtifactImpl <em>SArtifact</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SArtifactImpl
   * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SqlDSLPackageImpl#getSArtifact()
   * @generated
   */
  int SARTIFACT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SARTIFACT__NAME = 0;

  /**
   * The number of structural features of the '<em>SArtifact</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SARTIFACT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.sqlDSL.impl.STableImpl <em>STable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.sqlDSL.impl.STableImpl
   * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SqlDSLPackageImpl#getSTable()
   * @generated
   */
  int STABLE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STABLE__NAME = SARTIFACT__NAME;

  /**
   * The feature id for the '<em><b>Settings</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STABLE__SETTINGS = SARTIFACT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Entityname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STABLE__ENTITYNAME = SARTIFACT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Cached</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STABLE__CACHED = SARTIFACT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STABLE__PREFIX = SARTIFACT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Columns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STABLE__COLUMNS = SARTIFACT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>STable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STABLE_FEATURE_COUNT = SARTIFACT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.sqlDSL.impl.STableMemberImpl <em>STable Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.sqlDSL.impl.STableMemberImpl
   * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SqlDSLPackageImpl#getSTableMember()
   * @generated
   */
  int STABLE_MEMBER = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STABLE_MEMBER__NAME = 0;

  /**
   * The feature id for the '<em><b>Props</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STABLE_MEMBER__PROPS = 1;

  /**
   * The number of structural features of the '<em>STable Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STABLE_MEMBER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.sqlDSL.impl.SColumnImpl <em>SColumn</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SColumnImpl
   * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SqlDSLPackageImpl#getSColumn()
   * @generated
   */
  int SCOLUMN = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOLUMN__NAME = STABLE_MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Props</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOLUMN__PROPS = STABLE_MEMBER__PROPS;

  /**
   * The feature id for the '<em><b>Ext Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOLUMN__EXT_TYPE = STABLE_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Inlined Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOLUMN__INLINED_TYPE = STABLE_MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Simple Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOLUMN__SIMPLE_TYPE = STABLE_MEMBER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>SColumn</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOLUMN_FEATURE_COUNT = STABLE_MEMBER_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.sqlDSL.impl.SJoinColumnImpl <em>SJoin Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SJoinColumnImpl
   * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SqlDSLPackageImpl#getSJoinColumn()
   * @generated
   */
  int SJOIN_COLUMN = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJOIN_COLUMN__NAME = STABLE_MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Props</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJOIN_COLUMN__PROPS = STABLE_MEMBER__PROPS;

  /**
   * The feature id for the '<em><b>Referenced Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJOIN_COLUMN__REFERENCED_TYPE = STABLE_MEMBER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>SJoin Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SJOIN_COLUMN_FEATURE_COUNT = STABLE_MEMBER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.sqlDSL.impl.SColumnPropsImpl <em>SColumn Props</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SColumnPropsImpl
   * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SqlDSLPackageImpl#getSColumnProps()
   * @generated
   */
  int SCOLUMN_PROPS = 7;

  /**
   * The feature id for the '<em><b>Nullable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOLUMN_PROPS__NULLABLE = 0;

  /**
   * The feature id for the '<em><b>Aes</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOLUMN_PROPS__AES = 1;

  /**
   * The feature id for the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOLUMN_PROPS__INDEX = 2;

  /**
   * The feature id for the '<em><b>Javacolumn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOLUMN_PROPS__JAVACOLUMN = 3;

  /**
   * The number of structural features of the '<em>SColumn Props</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOLUMN_PROPS_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.sqlDSL.impl.SExtDeclaredSQLTypeImpl <em>SExt Declared SQL Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SExtDeclaredSQLTypeImpl
   * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SqlDSLPackageImpl#getSExtDeclaredSQLType()
   * @generated
   */
  int SEXT_DECLARED_SQL_TYPE = 8;

  /**
   * The number of structural features of the '<em>SExt Declared SQL Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEXT_DECLARED_SQL_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.sqlDSL.impl.SInlinedSQLTypeImpl <em>SInlined SQL Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SInlinedSQLTypeImpl
   * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SqlDSLPackageImpl#getSInlinedSQLType()
   * @generated
   */
  int SINLINED_SQL_TYPE = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINLINED_SQL_TYPE__VALUE = 0;

  /**
   * The number of structural features of the '<em>SInlined SQL Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINLINED_SQL_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.sqlDSL.impl.SEnumImpl <em>SEnum</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SEnumImpl
   * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SqlDSLPackageImpl#getSEnum()
   * @generated
   */
  int SENUM = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENUM__NAME = SARTIFACT__NAME;

  /**
   * The feature id for the '<em><b>Literals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENUM__LITERALS = SARTIFACT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>SEnum</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENUM_FEATURE_COUNT = SARTIFACT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.sqlDSL.impl.SEnumLiteralImpl <em>SEnum Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SEnumLiteralImpl
   * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SqlDSLPackageImpl#getSEnumLiteral()
   * @generated
   */
  int SENUM_LITERAL = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENUM_LITERAL__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENUM_LITERAL__VALUE = 1;

  /**
   * The number of structural features of the '<em>SEnum Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENUM_LITERAL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.sqlDSL.impl.SStringImpl <em>SString</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SStringImpl
   * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SqlDSLPackageImpl#getSString()
   * @generated
   */
  int SSTRING = 12;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SSTRING__VALUE = SINLINED_SQL_TYPE__VALUE;

  /**
   * The number of structural features of the '<em>SString</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SSTRING_FEATURE_COUNT = SINLINED_SQL_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.sqlDSL.impl.SDecimalImpl <em>SDecimal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SDecimalImpl
   * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SqlDSLPackageImpl#getSDecimal()
   * @generated
   */
  int SDECIMAL = 13;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SDECIMAL__VALUE = SINLINED_SQL_TYPE__VALUE;

  /**
   * The number of structural features of the '<em>SDecimal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SDECIMAL_FEATURE_COUNT = SINLINED_SQL_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.sqlDSL.SDBEngine <em>SDB Engine</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.sqlDSL.SDBEngine
   * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SqlDSLPackageImpl#getSDBEngine()
   * @generated
   */
  int SDB_ENGINE = 14;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.sqlDSL.SSimpleTypes <em>SSimple Types</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.sqlDSL.SSimpleTypes
   * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SqlDSLPackageImpl#getSSimpleTypes()
   * @generated
   */
  int SSIMPLE_TYPES = 15;

  /**
   * The meta object id for the '{@link org.lunifera.metamodel.dsl.sqlDSL.SIndex <em>SIndex</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.metamodel.dsl.sqlDSL.SIndex
   * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SqlDSLPackageImpl#getSIndex()
   * @generated
   */
  int SINDEX = 16;


  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.sqlDSL.SModel <em>SModel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SModel</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SModel
   * @generated
   */
  EClass getSModel();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.sqlDSL.SModel#getGeneratedFile <em>Generated File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Generated File</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SModel#getGeneratedFile()
   * @see #getSModel()
   * @generated
   */
  EAttribute getSModel_GeneratedFile();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.sqlDSL.SModel#getSettings <em>Settings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Settings</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SModel#getSettings()
   * @see #getSModel()
   * @generated
   */
  EReference getSModel_Settings();

  /**
   * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.dsl.sqlDSL.SModel#getArtifact <em>Artifact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Artifact</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SModel#getArtifact()
   * @see #getSModel()
   * @generated
   */
  EReference getSModel_Artifact();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.sqlDSL.SSettings <em>SSettings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SSettings</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SSettings
   * @generated
   */
  EClass getSSettings();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.sqlDSL.SSettings#getSchema <em>Schema</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Schema</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SSettings#getSchema()
   * @see #getSSettings()
   * @generated
   */
  EAttribute getSSettings_Schema();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.sqlDSL.SSettings#getJavapackage <em>Javapackage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Javapackage</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SSettings#getJavapackage()
   * @see #getSSettings()
   * @generated
   */
  EAttribute getSSettings_Javapackage();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.sqlDSL.SSettings#getEngine <em>Engine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Engine</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SSettings#getEngine()
   * @see #getSSettings()
   * @generated
   */
  EAttribute getSSettings_Engine();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.sqlDSL.SArtifact <em>SArtifact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SArtifact</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SArtifact
   * @generated
   */
  EClass getSArtifact();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.sqlDSL.SArtifact#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SArtifact#getName()
   * @see #getSArtifact()
   * @generated
   */
  EAttribute getSArtifact_Name();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.sqlDSL.STable <em>STable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>STable</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.STable
   * @generated
   */
  EClass getSTable();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.sqlDSL.STable#getSettings <em>Settings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Settings</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.STable#getSettings()
   * @see #getSTable()
   * @generated
   */
  EReference getSTable_Settings();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.sqlDSL.STable#getEntityname <em>Entityname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Entityname</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.STable#getEntityname()
   * @see #getSTable()
   * @generated
   */
  EAttribute getSTable_Entityname();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.sqlDSL.STable#isCached <em>Cached</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cached</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.STable#isCached()
   * @see #getSTable()
   * @generated
   */
  EAttribute getSTable_Cached();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.sqlDSL.STable#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prefix</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.STable#getPrefix()
   * @see #getSTable()
   * @generated
   */
  EAttribute getSTable_Prefix();

  /**
   * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.dsl.sqlDSL.STable#getColumns <em>Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Columns</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.STable#getColumns()
   * @see #getSTable()
   * @generated
   */
  EReference getSTable_Columns();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.sqlDSL.STableMember <em>STable Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>STable Member</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.STableMember
   * @generated
   */
  EClass getSTableMember();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.sqlDSL.STableMember#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.STableMember#getName()
   * @see #getSTableMember()
   * @generated
   */
  EAttribute getSTableMember_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.sqlDSL.STableMember#getProps <em>Props</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Props</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.STableMember#getProps()
   * @see #getSTableMember()
   * @generated
   */
  EReference getSTableMember_Props();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.sqlDSL.SColumn <em>SColumn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SColumn</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SColumn
   * @generated
   */
  EClass getSColumn();

  /**
   * Returns the meta object for the reference '{@link org.lunifera.metamodel.dsl.sqlDSL.SColumn#getExtType <em>Ext Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ext Type</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SColumn#getExtType()
   * @see #getSColumn()
   * @generated
   */
  EReference getSColumn_ExtType();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.metamodel.dsl.sqlDSL.SColumn#getInlinedType <em>Inlined Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inlined Type</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SColumn#getInlinedType()
   * @see #getSColumn()
   * @generated
   */
  EReference getSColumn_InlinedType();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.sqlDSL.SColumn#getSimpleType <em>Simple Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Simple Type</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SColumn#getSimpleType()
   * @see #getSColumn()
   * @generated
   */
  EAttribute getSColumn_SimpleType();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.sqlDSL.SJoinColumn <em>SJoin Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SJoin Column</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SJoinColumn
   * @generated
   */
  EClass getSJoinColumn();

  /**
   * Returns the meta object for the reference '{@link org.lunifera.metamodel.dsl.sqlDSL.SJoinColumn#getReferencedType <em>Referenced Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Referenced Type</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SJoinColumn#getReferencedType()
   * @see #getSJoinColumn()
   * @generated
   */
  EReference getSJoinColumn_ReferencedType();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.sqlDSL.SColumnProps <em>SColumn Props</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SColumn Props</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SColumnProps
   * @generated
   */
  EClass getSColumnProps();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.sqlDSL.SColumnProps#isNullable <em>Nullable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nullable</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SColumnProps#isNullable()
   * @see #getSColumnProps()
   * @generated
   */
  EAttribute getSColumnProps_Nullable();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.sqlDSL.SColumnProps#isAes <em>Aes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Aes</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SColumnProps#isAes()
   * @see #getSColumnProps()
   * @generated
   */
  EAttribute getSColumnProps_Aes();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.sqlDSL.SColumnProps#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Index</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SColumnProps#getIndex()
   * @see #getSColumnProps()
   * @generated
   */
  EAttribute getSColumnProps_Index();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.sqlDSL.SColumnProps#getJavacolumn <em>Javacolumn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Javacolumn</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SColumnProps#getJavacolumn()
   * @see #getSColumnProps()
   * @generated
   */
  EAttribute getSColumnProps_Javacolumn();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.sqlDSL.SExtDeclaredSQLType <em>SExt Declared SQL Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SExt Declared SQL Type</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SExtDeclaredSQLType
   * @generated
   */
  EClass getSExtDeclaredSQLType();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.sqlDSL.SInlinedSQLType <em>SInlined SQL Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SInlined SQL Type</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SInlinedSQLType
   * @generated
   */
  EClass getSInlinedSQLType();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.sqlDSL.SInlinedSQLType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SInlinedSQLType#getValue()
   * @see #getSInlinedSQLType()
   * @generated
   */
  EAttribute getSInlinedSQLType_Value();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.sqlDSL.SEnum <em>SEnum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SEnum</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SEnum
   * @generated
   */
  EClass getSEnum();

  /**
   * Returns the meta object for the containment reference list '{@link org.lunifera.metamodel.dsl.sqlDSL.SEnum#getLiterals <em>Literals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Literals</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SEnum#getLiterals()
   * @see #getSEnum()
   * @generated
   */
  EReference getSEnum_Literals();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.sqlDSL.SEnumLiteral <em>SEnum Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SEnum Literal</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SEnumLiteral
   * @generated
   */
  EClass getSEnumLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.sqlDSL.SEnumLiteral#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SEnumLiteral#getName()
   * @see #getSEnumLiteral()
   * @generated
   */
  EAttribute getSEnumLiteral_Name();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.metamodel.dsl.sqlDSL.SEnumLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SEnumLiteral#getValue()
   * @see #getSEnumLiteral()
   * @generated
   */
  EAttribute getSEnumLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.sqlDSL.SString <em>SString</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SString</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SString
   * @generated
   */
  EClass getSString();

  /**
   * Returns the meta object for class '{@link org.lunifera.metamodel.dsl.sqlDSL.SDecimal <em>SDecimal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SDecimal</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SDecimal
   * @generated
   */
  EClass getSDecimal();

  /**
   * Returns the meta object for enum '{@link org.lunifera.metamodel.dsl.sqlDSL.SDBEngine <em>SDB Engine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>SDB Engine</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SDBEngine
   * @generated
   */
  EEnum getSDBEngine();

  /**
   * Returns the meta object for enum '{@link org.lunifera.metamodel.dsl.sqlDSL.SSimpleTypes <em>SSimple Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>SSimple Types</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SSimpleTypes
   * @generated
   */
  EEnum getSSimpleTypes();

  /**
   * Returns the meta object for enum '{@link org.lunifera.metamodel.dsl.sqlDSL.SIndex <em>SIndex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>SIndex</em>'.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SIndex
   * @generated
   */
  EEnum getSIndex();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SqlDSLFactory getSqlDSLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.sqlDSL.impl.SModelImpl <em>SModel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SModelImpl
     * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SqlDSLPackageImpl#getSModel()
     * @generated
     */
    EClass SMODEL = eINSTANCE.getSModel();

    /**
     * The meta object literal for the '<em><b>Generated File</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SMODEL__GENERATED_FILE = eINSTANCE.getSModel_GeneratedFile();

    /**
     * The meta object literal for the '<em><b>Settings</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMODEL__SETTINGS = eINSTANCE.getSModel_Settings();

    /**
     * The meta object literal for the '<em><b>Artifact</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMODEL__ARTIFACT = eINSTANCE.getSModel_Artifact();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.sqlDSL.impl.SSettingsImpl <em>SSettings</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SSettingsImpl
     * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SqlDSLPackageImpl#getSSettings()
     * @generated
     */
    EClass SSETTINGS = eINSTANCE.getSSettings();

    /**
     * The meta object literal for the '<em><b>Schema</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SSETTINGS__SCHEMA = eINSTANCE.getSSettings_Schema();

    /**
     * The meta object literal for the '<em><b>Javapackage</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SSETTINGS__JAVAPACKAGE = eINSTANCE.getSSettings_Javapackage();

    /**
     * The meta object literal for the '<em><b>Engine</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SSETTINGS__ENGINE = eINSTANCE.getSSettings_Engine();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.sqlDSL.impl.SArtifactImpl <em>SArtifact</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SArtifactImpl
     * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SqlDSLPackageImpl#getSArtifact()
     * @generated
     */
    EClass SARTIFACT = eINSTANCE.getSArtifact();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SARTIFACT__NAME = eINSTANCE.getSArtifact_Name();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.sqlDSL.impl.STableImpl <em>STable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.sqlDSL.impl.STableImpl
     * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SqlDSLPackageImpl#getSTable()
     * @generated
     */
    EClass STABLE = eINSTANCE.getSTable();

    /**
     * The meta object literal for the '<em><b>Settings</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STABLE__SETTINGS = eINSTANCE.getSTable_Settings();

    /**
     * The meta object literal for the '<em><b>Entityname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STABLE__ENTITYNAME = eINSTANCE.getSTable_Entityname();

    /**
     * The meta object literal for the '<em><b>Cached</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STABLE__CACHED = eINSTANCE.getSTable_Cached();

    /**
     * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STABLE__PREFIX = eINSTANCE.getSTable_Prefix();

    /**
     * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STABLE__COLUMNS = eINSTANCE.getSTable_Columns();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.sqlDSL.impl.STableMemberImpl <em>STable Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.sqlDSL.impl.STableMemberImpl
     * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SqlDSLPackageImpl#getSTableMember()
     * @generated
     */
    EClass STABLE_MEMBER = eINSTANCE.getSTableMember();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STABLE_MEMBER__NAME = eINSTANCE.getSTableMember_Name();

    /**
     * The meta object literal for the '<em><b>Props</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STABLE_MEMBER__PROPS = eINSTANCE.getSTableMember_Props();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.sqlDSL.impl.SColumnImpl <em>SColumn</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SColumnImpl
     * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SqlDSLPackageImpl#getSColumn()
     * @generated
     */
    EClass SCOLUMN = eINSTANCE.getSColumn();

    /**
     * The meta object literal for the '<em><b>Ext Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCOLUMN__EXT_TYPE = eINSTANCE.getSColumn_ExtType();

    /**
     * The meta object literal for the '<em><b>Inlined Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCOLUMN__INLINED_TYPE = eINSTANCE.getSColumn_InlinedType();

    /**
     * The meta object literal for the '<em><b>Simple Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCOLUMN__SIMPLE_TYPE = eINSTANCE.getSColumn_SimpleType();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.sqlDSL.impl.SJoinColumnImpl <em>SJoin Column</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SJoinColumnImpl
     * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SqlDSLPackageImpl#getSJoinColumn()
     * @generated
     */
    EClass SJOIN_COLUMN = eINSTANCE.getSJoinColumn();

    /**
     * The meta object literal for the '<em><b>Referenced Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SJOIN_COLUMN__REFERENCED_TYPE = eINSTANCE.getSJoinColumn_ReferencedType();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.sqlDSL.impl.SColumnPropsImpl <em>SColumn Props</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SColumnPropsImpl
     * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SqlDSLPackageImpl#getSColumnProps()
     * @generated
     */
    EClass SCOLUMN_PROPS = eINSTANCE.getSColumnProps();

    /**
     * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCOLUMN_PROPS__NULLABLE = eINSTANCE.getSColumnProps_Nullable();

    /**
     * The meta object literal for the '<em><b>Aes</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCOLUMN_PROPS__AES = eINSTANCE.getSColumnProps_Aes();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCOLUMN_PROPS__INDEX = eINSTANCE.getSColumnProps_Index();

    /**
     * The meta object literal for the '<em><b>Javacolumn</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCOLUMN_PROPS__JAVACOLUMN = eINSTANCE.getSColumnProps_Javacolumn();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.sqlDSL.impl.SExtDeclaredSQLTypeImpl <em>SExt Declared SQL Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SExtDeclaredSQLTypeImpl
     * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SqlDSLPackageImpl#getSExtDeclaredSQLType()
     * @generated
     */
    EClass SEXT_DECLARED_SQL_TYPE = eINSTANCE.getSExtDeclaredSQLType();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.sqlDSL.impl.SInlinedSQLTypeImpl <em>SInlined SQL Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SInlinedSQLTypeImpl
     * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SqlDSLPackageImpl#getSInlinedSQLType()
     * @generated
     */
    EClass SINLINED_SQL_TYPE = eINSTANCE.getSInlinedSQLType();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SINLINED_SQL_TYPE__VALUE = eINSTANCE.getSInlinedSQLType_Value();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.sqlDSL.impl.SEnumImpl <em>SEnum</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SEnumImpl
     * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SqlDSLPackageImpl#getSEnum()
     * @generated
     */
    EClass SENUM = eINSTANCE.getSEnum();

    /**
     * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SENUM__LITERALS = eINSTANCE.getSEnum_Literals();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.sqlDSL.impl.SEnumLiteralImpl <em>SEnum Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SEnumLiteralImpl
     * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SqlDSLPackageImpl#getSEnumLiteral()
     * @generated
     */
    EClass SENUM_LITERAL = eINSTANCE.getSEnumLiteral();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SENUM_LITERAL__NAME = eINSTANCE.getSEnumLiteral_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SENUM_LITERAL__VALUE = eINSTANCE.getSEnumLiteral_Value();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.sqlDSL.impl.SStringImpl <em>SString</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SStringImpl
     * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SqlDSLPackageImpl#getSString()
     * @generated
     */
    EClass SSTRING = eINSTANCE.getSString();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.sqlDSL.impl.SDecimalImpl <em>SDecimal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SDecimalImpl
     * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SqlDSLPackageImpl#getSDecimal()
     * @generated
     */
    EClass SDECIMAL = eINSTANCE.getSDecimal();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.sqlDSL.SDBEngine <em>SDB Engine</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.sqlDSL.SDBEngine
     * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SqlDSLPackageImpl#getSDBEngine()
     * @generated
     */
    EEnum SDB_ENGINE = eINSTANCE.getSDBEngine();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.sqlDSL.SSimpleTypes <em>SSimple Types</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.sqlDSL.SSimpleTypes
     * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SqlDSLPackageImpl#getSSimpleTypes()
     * @generated
     */
    EEnum SSIMPLE_TYPES = eINSTANCE.getSSimpleTypes();

    /**
     * The meta object literal for the '{@link org.lunifera.metamodel.dsl.sqlDSL.SIndex <em>SIndex</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.metamodel.dsl.sqlDSL.SIndex
     * @see org.lunifera.metamodel.dsl.sqlDSL.impl.SqlDSLPackageImpl#getSIndex()
     * @generated
     */
    EEnum SINDEX = eINSTANCE.getSIndex();

  }

} //SqlDSLPackage

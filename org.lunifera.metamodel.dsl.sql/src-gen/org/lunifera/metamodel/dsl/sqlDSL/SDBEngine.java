/**
 */
package org.lunifera.metamodel.dsl.sqlDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SDB Engine</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage#getSDBEngine()
 * @model
 * @generated
 */
public enum SDBEngine implements Enumerator
{
  /**
   * The '<em><b>INNODB</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INNODB_VALUE
   * @generated
   * @ordered
   */
  INNODB(0, "INNODB", "InnoDB"),

  /**
   * The '<em><b>MYISAM</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MYISAM_VALUE
   * @generated
   * @ordered
   */
  MYISAM(1, "MYISAM", "MyISAM");

  /**
   * The '<em><b>INNODB</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INNODB</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INNODB
   * @model literal="InnoDB"
   * @generated
   * @ordered
   */
  public static final int INNODB_VALUE = 0;

  /**
   * The '<em><b>MYISAM</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MYISAM</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MYISAM
   * @model literal="MyISAM"
   * @generated
   * @ordered
   */
  public static final int MYISAM_VALUE = 1;

  /**
   * An array of all the '<em><b>SDB Engine</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final SDBEngine[] VALUES_ARRAY =
    new SDBEngine[]
    {
      INNODB,
      MYISAM,
    };

  /**
   * A public read-only list of all the '<em><b>SDB Engine</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<SDBEngine> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>SDB Engine</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SDBEngine get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      SDBEngine result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>SDB Engine</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SDBEngine getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      SDBEngine result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>SDB Engine</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SDBEngine get(int value)
  {
    switch (value)
    {
      case INNODB_VALUE: return INNODB;
      case MYISAM_VALUE: return MYISAM;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private SDBEngine(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //SDBEngine

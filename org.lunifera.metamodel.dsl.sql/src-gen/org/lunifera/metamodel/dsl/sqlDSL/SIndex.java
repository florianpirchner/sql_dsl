/**
 */
package org.lunifera.metamodel.dsl.sqlDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SIndex</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage#getSIndex()
 * @model
 * @generated
 */
public enum SIndex implements Enumerator
{
  /**
   * The '<em><b>NO</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NO_VALUE
   * @generated
   * @ordered
   */
  NO(0, "NO", "No"),

  /**
   * The '<em><b>YES</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #YES_VALUE
   * @generated
   * @ordered
   */
  YES(1, "YES", "Yes"),

  /**
   * The '<em><b>UNIQUE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNIQUE_VALUE
   * @generated
   * @ordered
   */
  UNIQUE(2, "UNIQUE", "Unique"),

  /**
   * The '<em><b>SPATIAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SPATIAL_VALUE
   * @generated
   * @ordered
   */
  SPATIAL(3, "SPATIAL", "Spatial");

  /**
   * The '<em><b>NO</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NO</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NO
   * @model literal="No"
   * @generated
   * @ordered
   */
  public static final int NO_VALUE = 0;

  /**
   * The '<em><b>YES</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>YES</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #YES
   * @model literal="Yes"
   * @generated
   * @ordered
   */
  public static final int YES_VALUE = 1;

  /**
   * The '<em><b>UNIQUE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>UNIQUE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UNIQUE
   * @model literal="Unique"
   * @generated
   * @ordered
   */
  public static final int UNIQUE_VALUE = 2;

  /**
   * The '<em><b>SPATIAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SPATIAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SPATIAL
   * @model literal="Spatial"
   * @generated
   * @ordered
   */
  public static final int SPATIAL_VALUE = 3;

  /**
   * An array of all the '<em><b>SIndex</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final SIndex[] VALUES_ARRAY =
    new SIndex[]
    {
      NO,
      YES,
      UNIQUE,
      SPATIAL,
    };

  /**
   * A public read-only list of all the '<em><b>SIndex</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<SIndex> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>SIndex</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SIndex get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      SIndex result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>SIndex</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SIndex getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      SIndex result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>SIndex</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SIndex get(int value)
  {
    switch (value)
    {
      case NO_VALUE: return NO;
      case YES_VALUE: return YES;
      case UNIQUE_VALUE: return UNIQUE;
      case SPATIAL_VALUE: return SPATIAL;
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
  private SIndex(int value, String name, String literal)
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
  
} //SIndex

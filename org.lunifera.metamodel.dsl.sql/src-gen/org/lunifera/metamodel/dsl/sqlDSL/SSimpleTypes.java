/**
 */
package org.lunifera.metamodel.dsl.sqlDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SSimple Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage#getSSimpleTypes()
 * @model
 * @generated
 */
public enum SSimpleTypes implements Enumerator
{
  /**
   * The '<em><b>INT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INT_VALUE
   * @generated
   * @ordered
   */
  INT(0, "INT", "Int"),

  /**
   * The '<em><b>TINY INT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TINY_INT_VALUE
   * @generated
   * @ordered
   */
  TINY_INT(1, "TINY_INT", "Tinyint"),

  /**
   * The '<em><b>SMALL INT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SMALL_INT_VALUE
   * @generated
   * @ordered
   */
  SMALL_INT(2, "SMALL_INT", "Smallint"),

  /**
   * The '<em><b>MEDIUM INT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MEDIUM_INT_VALUE
   * @generated
   * @ordered
   */
  MEDIUM_INT(3, "MEDIUM_INT", "Mediumint"),

  /**
   * The '<em><b>BOOLEAN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BOOLEAN_VALUE
   * @generated
   * @ordered
   */
  BOOLEAN(4, "BOOLEAN", "Boolean"),

  /**
   * The '<em><b>BLOB</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BLOB_VALUE
   * @generated
   * @ordered
   */
  BLOB(5, "BLOB", "Blob"),

  /**
   * The '<em><b>DATETIME</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DATETIME_VALUE
   * @generated
   * @ordered
   */
  DATETIME(6, "DATETIME", "Datetime"),

  /**
   * The '<em><b>DATE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DATE_VALUE
   * @generated
   * @ordered
   */
  DATE(7, "DATE", "Date"),

  /**
   * The '<em><b>TIME</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TIME_VALUE
   * @generated
   * @ordered
   */
  TIME(8, "TIME", "Time"),

  /**
   * The '<em><b>POLYGON</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #POLYGON_VALUE
   * @generated
   * @ordered
   */
  POLYGON(9, "POLYGON", "Polygon"),

  /**
   * The '<em><b>POINT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #POINT_VALUE
   * @generated
   * @ordered
   */
  POINT(10, "POINT", "Point"),

  /**
   * The '<em><b>FOTO</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FOTO_VALUE
   * @generated
   * @ordered
   */
  FOTO(11, "FOTO", "Foto"),

  /**
   * The '<em><b>Currency</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CURRENCY_VALUE
   * @generated
   * @ordered
   */
  CURRENCY(12, "Currency", "Currency"),

  /**
   * The '<em><b>Coordinate</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COORDINATE_VALUE
   * @generated
   * @ordered
   */
  COORDINATE(13, "Coordinate", "Coordinate");

  /**
   * The '<em><b>INT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INT
   * @model literal="Int"
   * @generated
   * @ordered
   */
  public static final int INT_VALUE = 0;

  /**
   * The '<em><b>TINY INT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TINY INT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TINY_INT
   * @model literal="Tinyint"
   * @generated
   * @ordered
   */
  public static final int TINY_INT_VALUE = 1;

  /**
   * The '<em><b>SMALL INT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SMALL INT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SMALL_INT
   * @model literal="Smallint"
   * @generated
   * @ordered
   */
  public static final int SMALL_INT_VALUE = 2;

  /**
   * The '<em><b>MEDIUM INT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MEDIUM INT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MEDIUM_INT
   * @model literal="Mediumint"
   * @generated
   * @ordered
   */
  public static final int MEDIUM_INT_VALUE = 3;

  /**
   * The '<em><b>BOOLEAN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BOOLEAN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BOOLEAN
   * @model literal="Boolean"
   * @generated
   * @ordered
   */
  public static final int BOOLEAN_VALUE = 4;

  /**
   * The '<em><b>BLOB</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BLOB</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BLOB
   * @model literal="Blob"
   * @generated
   * @ordered
   */
  public static final int BLOB_VALUE = 5;

  /**
   * The '<em><b>DATETIME</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DATETIME</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DATETIME
   * @model literal="Datetime"
   * @generated
   * @ordered
   */
  public static final int DATETIME_VALUE = 6;

  /**
   * The '<em><b>DATE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DATE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DATE
   * @model literal="Date"
   * @generated
   * @ordered
   */
  public static final int DATE_VALUE = 7;

  /**
   * The '<em><b>TIME</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TIME</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TIME
   * @model literal="Time"
   * @generated
   * @ordered
   */
  public static final int TIME_VALUE = 8;

  /**
   * The '<em><b>POLYGON</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>POLYGON</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #POLYGON
   * @model literal="Polygon"
   * @generated
   * @ordered
   */
  public static final int POLYGON_VALUE = 9;

  /**
   * The '<em><b>POINT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>POINT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #POINT
   * @model literal="Point"
   * @generated
   * @ordered
   */
  public static final int POINT_VALUE = 10;

  /**
   * The '<em><b>FOTO</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>FOTO</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FOTO
   * @model literal="Foto"
   * @generated
   * @ordered
   */
  public static final int FOTO_VALUE = 11;

  /**
   * The '<em><b>Currency</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Currency</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CURRENCY
   * @model name="Currency"
   * @generated
   * @ordered
   */
  public static final int CURRENCY_VALUE = 12;

  /**
   * The '<em><b>Coordinate</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Coordinate</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COORDINATE
   * @model name="Coordinate"
   * @generated
   * @ordered
   */
  public static final int COORDINATE_VALUE = 13;

  /**
   * An array of all the '<em><b>SSimple Types</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final SSimpleTypes[] VALUES_ARRAY =
    new SSimpleTypes[]
    {
      INT,
      TINY_INT,
      SMALL_INT,
      MEDIUM_INT,
      BOOLEAN,
      BLOB,
      DATETIME,
      DATE,
      TIME,
      POLYGON,
      POINT,
      FOTO,
      CURRENCY,
      COORDINATE,
    };

  /**
   * A public read-only list of all the '<em><b>SSimple Types</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<SSimpleTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>SSimple Types</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SSimpleTypes get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      SSimpleTypes result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>SSimple Types</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SSimpleTypes getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      SSimpleTypes result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>SSimple Types</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SSimpleTypes get(int value)
  {
    switch (value)
    {
      case INT_VALUE: return INT;
      case TINY_INT_VALUE: return TINY_INT;
      case SMALL_INT_VALUE: return SMALL_INT;
      case MEDIUM_INT_VALUE: return MEDIUM_INT;
      case BOOLEAN_VALUE: return BOOLEAN;
      case BLOB_VALUE: return BLOB;
      case DATETIME_VALUE: return DATETIME;
      case DATE_VALUE: return DATE;
      case TIME_VALUE: return TIME;
      case POLYGON_VALUE: return POLYGON;
      case POINT_VALUE: return POINT;
      case FOTO_VALUE: return FOTO;
      case CURRENCY_VALUE: return CURRENCY;
      case COORDINATE_VALUE: return COORDINATE;
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
  private SSimpleTypes(int value, String name, String literal)
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
  
} //SSimpleTypes

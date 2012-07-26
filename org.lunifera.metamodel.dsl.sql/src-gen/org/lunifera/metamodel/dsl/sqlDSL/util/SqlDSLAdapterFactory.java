/**
 */
package org.lunifera.metamodel.dsl.sqlDSL.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.lunifera.metamodel.dsl.sqlDSL.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage
 * @generated
 */
public class SqlDSLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SqlDSLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SqlDSLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SqlDSLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SqlDSLSwitch<Adapter> modelSwitch =
    new SqlDSLSwitch<Adapter>()
    {
      @Override
      public Adapter caseSModel(SModel object)
      {
        return createSModelAdapter();
      }
      @Override
      public Adapter caseSSettings(SSettings object)
      {
        return createSSettingsAdapter();
      }
      @Override
      public Adapter caseSArtifact(SArtifact object)
      {
        return createSArtifactAdapter();
      }
      @Override
      public Adapter caseSTable(STable object)
      {
        return createSTableAdapter();
      }
      @Override
      public Adapter caseSTableMember(STableMember object)
      {
        return createSTableMemberAdapter();
      }
      @Override
      public Adapter caseSColumn(SColumn object)
      {
        return createSColumnAdapter();
      }
      @Override
      public Adapter caseSJoinColumn(SJoinColumn object)
      {
        return createSJoinColumnAdapter();
      }
      @Override
      public Adapter caseSColumnProps(SColumnProps object)
      {
        return createSColumnPropsAdapter();
      }
      @Override
      public Adapter caseSExtDeclaredSQLType(SExtDeclaredSQLType object)
      {
        return createSExtDeclaredSQLTypeAdapter();
      }
      @Override
      public Adapter caseSInlinedSQLType(SInlinedSQLType object)
      {
        return createSInlinedSQLTypeAdapter();
      }
      @Override
      public Adapter caseSEnum(SEnum object)
      {
        return createSEnumAdapter();
      }
      @Override
      public Adapter caseSEnumLiteral(SEnumLiteral object)
      {
        return createSEnumLiteralAdapter();
      }
      @Override
      public Adapter caseSString(SString object)
      {
        return createSStringAdapter();
      }
      @Override
      public Adapter caseSDecimal(SDecimal object)
      {
        return createSDecimalAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.sqlDSL.SModel <em>SModel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SModel
   * @generated
   */
  public Adapter createSModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.sqlDSL.SSettings <em>SSettings</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SSettings
   * @generated
   */
  public Adapter createSSettingsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.sqlDSL.SArtifact <em>SArtifact</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SArtifact
   * @generated
   */
  public Adapter createSArtifactAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.sqlDSL.STable <em>STable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.sqlDSL.STable
   * @generated
   */
  public Adapter createSTableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.sqlDSL.STableMember <em>STable Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.sqlDSL.STableMember
   * @generated
   */
  public Adapter createSTableMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.sqlDSL.SColumn <em>SColumn</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SColumn
   * @generated
   */
  public Adapter createSColumnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.sqlDSL.SJoinColumn <em>SJoin Column</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SJoinColumn
   * @generated
   */
  public Adapter createSJoinColumnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.sqlDSL.SColumnProps <em>SColumn Props</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SColumnProps
   * @generated
   */
  public Adapter createSColumnPropsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.sqlDSL.SExtDeclaredSQLType <em>SExt Declared SQL Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SExtDeclaredSQLType
   * @generated
   */
  public Adapter createSExtDeclaredSQLTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.sqlDSL.SInlinedSQLType <em>SInlined SQL Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SInlinedSQLType
   * @generated
   */
  public Adapter createSInlinedSQLTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.sqlDSL.SEnum <em>SEnum</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SEnum
   * @generated
   */
  public Adapter createSEnumAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.sqlDSL.SEnumLiteral <em>SEnum Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SEnumLiteral
   * @generated
   */
  public Adapter createSEnumLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.sqlDSL.SString <em>SString</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SString
   * @generated
   */
  public Adapter createSStringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.metamodel.dsl.sqlDSL.SDecimal <em>SDecimal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.metamodel.dsl.sqlDSL.SDecimal
   * @generated
   */
  public Adapter createSDecimalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SqlDSLAdapterFactory

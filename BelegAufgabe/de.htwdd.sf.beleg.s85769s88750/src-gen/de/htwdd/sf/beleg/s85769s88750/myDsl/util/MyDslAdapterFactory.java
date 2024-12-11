/**
 * generated by Xtext 2.30.0
 */
package de.htwdd.sf.beleg.s85769s88750.myDsl.util;

import de.htwdd.sf.beleg.s85769s88750.myDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.htwdd.sf.beleg.s85769s88750.myDsl.MyDslPackage
 * @generated
 */
public class MyDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MyDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MyDslPackage.eINSTANCE;
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
  protected MyDslSwitch<Adapter> modelSwitch =
    new MyDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseUser_Stories(User_Stories object)
      {
        return createUser_StoriesAdapter();
      }
      @Override
      public Adapter caseUser_Story(User_Story object)
      {
        return createUser_StoryAdapter();
      }
      @Override
      public Adapter caseTitle(Title object)
      {
        return createTitleAdapter();
      }
      @Override
      public Adapter caseNutzen(Nutzen object)
      {
        return createNutzenAdapter();
      }
      @Override
      public Adapter caseRolle(Rolle object)
      {
        return createRolleAdapter();
      }
      @Override
      public Adapter caseZiel_Wunsch(Ziel_Wunsch object)
      {
        return createZiel_WunschAdapter();
      }
      @Override
      public Adapter caseInfinitiv(Infinitiv object)
      {
        return createInfinitivAdapter();
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
   * Creates a new adapter for an object of class '{@link de.htwdd.sf.beleg.s85769s88750.myDsl.User_Stories <em>User Stories</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.htwdd.sf.beleg.s85769s88750.myDsl.User_Stories
   * @generated
   */
  public Adapter createUser_StoriesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.htwdd.sf.beleg.s85769s88750.myDsl.User_Story <em>User Story</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.htwdd.sf.beleg.s85769s88750.myDsl.User_Story
   * @generated
   */
  public Adapter createUser_StoryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.htwdd.sf.beleg.s85769s88750.myDsl.Title <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.htwdd.sf.beleg.s85769s88750.myDsl.Title
   * @generated
   */
  public Adapter createTitleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.htwdd.sf.beleg.s85769s88750.myDsl.Nutzen <em>Nutzen</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.htwdd.sf.beleg.s85769s88750.myDsl.Nutzen
   * @generated
   */
  public Adapter createNutzenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.htwdd.sf.beleg.s85769s88750.myDsl.Rolle <em>Rolle</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.htwdd.sf.beleg.s85769s88750.myDsl.Rolle
   * @generated
   */
  public Adapter createRolleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.htwdd.sf.beleg.s85769s88750.myDsl.Ziel_Wunsch <em>Ziel Wunsch</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.htwdd.sf.beleg.s85769s88750.myDsl.Ziel_Wunsch
   * @generated
   */
  public Adapter createZiel_WunschAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.htwdd.sf.beleg.s85769s88750.myDsl.Infinitiv <em>Infinitiv</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.htwdd.sf.beleg.s85769s88750.myDsl.Infinitiv
   * @generated
   */
  public Adapter createInfinitivAdapter()
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

} //MyDslAdapterFactory

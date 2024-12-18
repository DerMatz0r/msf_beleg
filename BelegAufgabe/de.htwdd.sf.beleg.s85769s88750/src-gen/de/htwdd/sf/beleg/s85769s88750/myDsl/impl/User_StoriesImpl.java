/**
 * generated by Xtext 2.30.0
 */
package de.htwdd.sf.beleg.s85769s88750.myDsl.impl;

import de.htwdd.sf.beleg.s85769s88750.myDsl.MyDslPackage;
import de.htwdd.sf.beleg.s85769s88750.myDsl.User_Stories;
import de.htwdd.sf.beleg.s85769s88750.myDsl.User_Story;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Stories</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.htwdd.sf.beleg.s85769s88750.myDsl.impl.User_StoriesImpl#getUser_story <em>User story</em>}</li>
 * </ul>
 *
 * @generated
 */
public class User_StoriesImpl extends MinimalEObjectImpl.Container implements User_Stories
{
  /**
   * The cached value of the '{@link #getUser_story() <em>User story</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUser_story()
   * @generated
   * @ordered
   */
  protected EList<User_Story> user_story;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected User_StoriesImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.USER_STORIES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<User_Story> getUser_story()
  {
    if (user_story == null)
    {
      user_story = new EObjectContainmentEList<User_Story>(User_Story.class, this, MyDslPackage.USER_STORIES__USER_STORY);
    }
    return user_story;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.USER_STORIES__USER_STORY:
        return ((InternalEList<?>)getUser_story()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.USER_STORIES__USER_STORY:
        return getUser_story();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.USER_STORIES__USER_STORY:
        getUser_story().clear();
        getUser_story().addAll((Collection<? extends User_Story>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.USER_STORIES__USER_STORY:
        getUser_story().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.USER_STORIES__USER_STORY:
        return user_story != null && !user_story.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //User_StoriesImpl

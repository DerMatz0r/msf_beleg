/**
 * generated by Xtext 2.30.0
 */
package de.htwdd.sf.beleg.s85769s88750.myDsl.impl;

import de.htwdd.sf.beleg.s85769s88750.myDsl.MyDslPackage;
import de.htwdd.sf.beleg.s85769s88750.myDsl.Nutzen;
import de.htwdd.sf.beleg.s85769s88750.myDsl.Rolle;
import de.htwdd.sf.beleg.s85769s88750.myDsl.Title;
import de.htwdd.sf.beleg.s85769s88750.myDsl.User_Story;
import de.htwdd.sf.beleg.s85769s88750.myDsl.Ziel_Wunsch;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Story</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.htwdd.sf.beleg.s85769s88750.myDsl.impl.User_StoryImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link de.htwdd.sf.beleg.s85769s88750.myDsl.impl.User_StoryImpl#getNutzen <em>Nutzen</em>}</li>
 *   <li>{@link de.htwdd.sf.beleg.s85769s88750.myDsl.impl.User_StoryImpl#getRolle <em>Rolle</em>}</li>
 *   <li>{@link de.htwdd.sf.beleg.s85769s88750.myDsl.impl.User_StoryImpl#getZiel_wunsch <em>Ziel wunsch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class User_StoryImpl extends MinimalEObjectImpl.Container implements User_Story
{
  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected Title title;

  /**
   * The cached value of the '{@link #getNutzen() <em>Nutzen</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNutzen()
   * @generated
   * @ordered
   */
  protected Nutzen nutzen;

  /**
   * The cached value of the '{@link #getRolle() <em>Rolle</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRolle()
   * @generated
   * @ordered
   */
  protected Rolle rolle;

  /**
   * The cached value of the '{@link #getZiel_wunsch() <em>Ziel wunsch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getZiel_wunsch()
   * @generated
   * @ordered
   */
  protected Ziel_Wunsch ziel_wunsch;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected User_StoryImpl()
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
    return MyDslPackage.Literals.USER_STORY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Title getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTitle(Title newTitle, NotificationChain msgs)
  {
    Title oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.USER_STORY__TITLE, oldTitle, newTitle);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTitle(Title newTitle)
  {
    if (newTitle != title)
    {
      NotificationChain msgs = null;
      if (title != null)
        msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.USER_STORY__TITLE, null, msgs);
      if (newTitle != null)
        msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.USER_STORY__TITLE, null, msgs);
      msgs = basicSetTitle(newTitle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.USER_STORY__TITLE, newTitle, newTitle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Nutzen getNutzen()
  {
    return nutzen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNutzen(Nutzen newNutzen, NotificationChain msgs)
  {
    Nutzen oldNutzen = nutzen;
    nutzen = newNutzen;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.USER_STORY__NUTZEN, oldNutzen, newNutzen);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNutzen(Nutzen newNutzen)
  {
    if (newNutzen != nutzen)
    {
      NotificationChain msgs = null;
      if (nutzen != null)
        msgs = ((InternalEObject)nutzen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.USER_STORY__NUTZEN, null, msgs);
      if (newNutzen != null)
        msgs = ((InternalEObject)newNutzen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.USER_STORY__NUTZEN, null, msgs);
      msgs = basicSetNutzen(newNutzen, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.USER_STORY__NUTZEN, newNutzen, newNutzen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Rolle getRolle()
  {
    return rolle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRolle(Rolle newRolle, NotificationChain msgs)
  {
    Rolle oldRolle = rolle;
    rolle = newRolle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.USER_STORY__ROLLE, oldRolle, newRolle);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRolle(Rolle newRolle)
  {
    if (newRolle != rolle)
    {
      NotificationChain msgs = null;
      if (rolle != null)
        msgs = ((InternalEObject)rolle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.USER_STORY__ROLLE, null, msgs);
      if (newRolle != null)
        msgs = ((InternalEObject)newRolle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.USER_STORY__ROLLE, null, msgs);
      msgs = basicSetRolle(newRolle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.USER_STORY__ROLLE, newRolle, newRolle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Ziel_Wunsch getZiel_wunsch()
  {
    return ziel_wunsch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetZiel_wunsch(Ziel_Wunsch newZiel_wunsch, NotificationChain msgs)
  {
    Ziel_Wunsch oldZiel_wunsch = ziel_wunsch;
    ziel_wunsch = newZiel_wunsch;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.USER_STORY__ZIEL_WUNSCH, oldZiel_wunsch, newZiel_wunsch);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setZiel_wunsch(Ziel_Wunsch newZiel_wunsch)
  {
    if (newZiel_wunsch != ziel_wunsch)
    {
      NotificationChain msgs = null;
      if (ziel_wunsch != null)
        msgs = ((InternalEObject)ziel_wunsch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.USER_STORY__ZIEL_WUNSCH, null, msgs);
      if (newZiel_wunsch != null)
        msgs = ((InternalEObject)newZiel_wunsch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.USER_STORY__ZIEL_WUNSCH, null, msgs);
      msgs = basicSetZiel_wunsch(newZiel_wunsch, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.USER_STORY__ZIEL_WUNSCH, newZiel_wunsch, newZiel_wunsch));
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
      case MyDslPackage.USER_STORY__TITLE:
        return basicSetTitle(null, msgs);
      case MyDslPackage.USER_STORY__NUTZEN:
        return basicSetNutzen(null, msgs);
      case MyDslPackage.USER_STORY__ROLLE:
        return basicSetRolle(null, msgs);
      case MyDslPackage.USER_STORY__ZIEL_WUNSCH:
        return basicSetZiel_wunsch(null, msgs);
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
      case MyDslPackage.USER_STORY__TITLE:
        return getTitle();
      case MyDslPackage.USER_STORY__NUTZEN:
        return getNutzen();
      case MyDslPackage.USER_STORY__ROLLE:
        return getRolle();
      case MyDslPackage.USER_STORY__ZIEL_WUNSCH:
        return getZiel_wunsch();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.USER_STORY__TITLE:
        setTitle((Title)newValue);
        return;
      case MyDslPackage.USER_STORY__NUTZEN:
        setNutzen((Nutzen)newValue);
        return;
      case MyDslPackage.USER_STORY__ROLLE:
        setRolle((Rolle)newValue);
        return;
      case MyDslPackage.USER_STORY__ZIEL_WUNSCH:
        setZiel_wunsch((Ziel_Wunsch)newValue);
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
      case MyDslPackage.USER_STORY__TITLE:
        setTitle((Title)null);
        return;
      case MyDslPackage.USER_STORY__NUTZEN:
        setNutzen((Nutzen)null);
        return;
      case MyDslPackage.USER_STORY__ROLLE:
        setRolle((Rolle)null);
        return;
      case MyDslPackage.USER_STORY__ZIEL_WUNSCH:
        setZiel_wunsch((Ziel_Wunsch)null);
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
      case MyDslPackage.USER_STORY__TITLE:
        return title != null;
      case MyDslPackage.USER_STORY__NUTZEN:
        return nutzen != null;
      case MyDslPackage.USER_STORY__ROLLE:
        return rolle != null;
      case MyDslPackage.USER_STORY__ZIEL_WUNSCH:
        return ziel_wunsch != null;
    }
    return super.eIsSet(featureID);
  }

} //User_StoryImpl
/**
 * generated by Xtext 2.30.0
 */
package de.htwdd.sf.beleg.s85769s88750.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Story</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.htwdd.sf.beleg.s85769s88750.myDsl.User_Story#getTitle <em>Title</em>}</li>
 *   <li>{@link de.htwdd.sf.beleg.s85769s88750.myDsl.User_Story#getNutzen <em>Nutzen</em>}</li>
 *   <li>{@link de.htwdd.sf.beleg.s85769s88750.myDsl.User_Story#getRolle <em>Rolle</em>}</li>
 *   <li>{@link de.htwdd.sf.beleg.s85769s88750.myDsl.User_Story#getZiel_wunsch <em>Ziel wunsch</em>}</li>
 * </ul>
 *
 * @see de.htwdd.sf.beleg.s85769s88750.myDsl.MyDslPackage#getUser_Story()
 * @model
 * @generated
 */
public interface User_Story extends EObject
{
  /**
   * Returns the value of the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' containment reference.
   * @see #setTitle(Title)
   * @see de.htwdd.sf.beleg.s85769s88750.myDsl.MyDslPackage#getUser_Story_Title()
   * @model containment="true"
   * @generated
   */
  Title getTitle();

  /**
   * Sets the value of the '{@link de.htwdd.sf.beleg.s85769s88750.myDsl.User_Story#getTitle <em>Title</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' containment reference.
   * @see #getTitle()
   * @generated
   */
  void setTitle(Title value);

  /**
   * Returns the value of the '<em><b>Nutzen</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nutzen</em>' containment reference.
   * @see #setNutzen(Nutzen)
   * @see de.htwdd.sf.beleg.s85769s88750.myDsl.MyDslPackage#getUser_Story_Nutzen()
   * @model containment="true"
   * @generated
   */
  Nutzen getNutzen();

  /**
   * Sets the value of the '{@link de.htwdd.sf.beleg.s85769s88750.myDsl.User_Story#getNutzen <em>Nutzen</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nutzen</em>' containment reference.
   * @see #getNutzen()
   * @generated
   */
  void setNutzen(Nutzen value);

  /**
   * Returns the value of the '<em><b>Rolle</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rolle</em>' containment reference.
   * @see #setRolle(Rolle)
   * @see de.htwdd.sf.beleg.s85769s88750.myDsl.MyDslPackage#getUser_Story_Rolle()
   * @model containment="true"
   * @generated
   */
  Rolle getRolle();

  /**
   * Sets the value of the '{@link de.htwdd.sf.beleg.s85769s88750.myDsl.User_Story#getRolle <em>Rolle</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rolle</em>' containment reference.
   * @see #getRolle()
   * @generated
   */
  void setRolle(Rolle value);

  /**
   * Returns the value of the '<em><b>Ziel wunsch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ziel wunsch</em>' containment reference.
   * @see #setZiel_wunsch(Ziel_Wunsch)
   * @see de.htwdd.sf.beleg.s85769s88750.myDsl.MyDslPackage#getUser_Story_Ziel_wunsch()
   * @model containment="true"
   * @generated
   */
  Ziel_Wunsch getZiel_wunsch();

  /**
   * Sets the value of the '{@link de.htwdd.sf.beleg.s85769s88750.myDsl.User_Story#getZiel_wunsch <em>Ziel wunsch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ziel wunsch</em>' containment reference.
   * @see #getZiel_wunsch()
   * @generated
   */
  void setZiel_wunsch(Ziel_Wunsch value);

} // User_Story

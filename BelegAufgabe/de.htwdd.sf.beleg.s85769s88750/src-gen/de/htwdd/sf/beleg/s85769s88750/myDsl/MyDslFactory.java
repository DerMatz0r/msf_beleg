/**
 * generated by Xtext 2.30.0
 */
package de.htwdd.sf.beleg.s85769s88750.myDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.htwdd.sf.beleg.s85769s88750.myDsl.MyDslPackage
 * @generated
 */
public interface MyDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslFactory eINSTANCE = de.htwdd.sf.beleg.s85769s88750.myDsl.impl.MyDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>User Stories</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>User Stories</em>'.
   * @generated
   */
  User_Stories createUser_Stories();

  /**
   * Returns a new object of class '<em>User Story</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>User Story</em>'.
   * @generated
   */
  User_Story createUser_Story();

  /**
   * Returns a new object of class '<em>Title</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Title</em>'.
   * @generated
   */
  Title createTitle();

  /**
   * Returns a new object of class '<em>Nutzen</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Nutzen</em>'.
   * @generated
   */
  Nutzen createNutzen();

  /**
   * Returns a new object of class '<em>Rolle</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rolle</em>'.
   * @generated
   */
  Rolle createRolle();

  /**
   * Returns a new object of class '<em>Ziel Wunsch</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ziel Wunsch</em>'.
   * @generated
   */
  Ziel_Wunsch createZiel_Wunsch();

  /**
   * Returns a new object of class '<em>Infinitiv</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Infinitiv</em>'.
   * @generated
   */
  Infinitiv createInfinitiv();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MyDslPackage getMyDslPackage();

} //MyDslFactory

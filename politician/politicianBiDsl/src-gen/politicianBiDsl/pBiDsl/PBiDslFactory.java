/**
 */
package politicianBiDsl.pBiDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see politicianBiDsl.pBiDsl.PBiDslPackage
 * @generated
 */
public interface PBiDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PBiDslFactory eINSTANCE = politicianBiDsl.pBiDsl.impl.PBiDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>City</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>City</em>'.
   * @generated
   */
  City createCity();

  /**
   * Returns a new object of class '<em>Party</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Party</em>'.
   * @generated
   */
  Party createParty();

  /**
   * Returns a new object of class '<em>Politician</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Politician</em>'.
   * @generated
   */
  Politician createPolitician();

  /**
   * Returns a new object of class '<em>Public Office</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Public Office</em>'.
   * @generated
   */
  PublicOffice createPublicOffice();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PBiDslPackage getPBiDslPackage();

} //PBiDslFactory

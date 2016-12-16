/**
 */
package politicianBiDsl.pBiDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>City</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link politicianBiDsl.pBiDsl.City#getName <em>Name</em>}</li>
 *   <li>{@link politicianBiDsl.pBiDsl.City#getParties <em>Parties</em>}</li>
 *   <li>{@link politicianBiDsl.pBiDsl.City#getIndeps <em>Indeps</em>}</li>
 * </ul>
 * </p>
 *
 * @see politicianBiDsl.pBiDsl.PBiDslPackage#getCity()
 * @model
 * @generated
 */
public interface City extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see politicianBiDsl.pBiDsl.PBiDslPackage#getCity_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link politicianBiDsl.pBiDsl.City#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parties</b></em>' containment reference list.
   * The list contents are of type {@link politicianBiDsl.pBiDsl.Party}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parties</em>' containment reference list.
   * @see politicianBiDsl.pBiDsl.PBiDslPackage#getCity_Parties()
   * @model containment="true"
   * @generated
   */
  EList<Party> getParties();

  /**
   * Returns the value of the '<em><b>Indeps</b></em>' containment reference list.
   * The list contents are of type {@link politicianBiDsl.pBiDsl.Politician}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Indeps</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Indeps</em>' containment reference list.
   * @see politicianBiDsl.pBiDsl.PBiDslPackage#getCity_Indeps()
   * @model containment="true"
   * @generated
   */
  EList<Politician> getIndeps();

} // City

/**
 */
package politicianBiDsl.pBiDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link politicianBiDsl.pBiDsl.Party#getName <em>Name</em>}</li>
 *   <li>{@link politicianBiDsl.pBiDsl.Party#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link politicianBiDsl.pBiDsl.Party#getPresident <em>President</em>}</li>
 *   <li>{@link politicianBiDsl.pBiDsl.Party#getPols <em>Pols</em>}</li>
 * </ul>
 * </p>
 *
 * @see politicianBiDsl.pBiDsl.PBiDslPackage#getParty()
 * @model
 * @generated
 */
public interface Party extends EObject
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
   * @see politicianBiDsl.pBiDsl.PBiDslPackage#getParty_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link politicianBiDsl.pBiDsl.Party#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Acronym</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Acronym</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Acronym</em>' attribute.
   * @see #setAcronym(String)
   * @see politicianBiDsl.pBiDsl.PBiDslPackage#getParty_Acronym()
   * @model
   * @generated
   */
  String getAcronym();

  /**
   * Sets the value of the '{@link politicianBiDsl.pBiDsl.Party#getAcronym <em>Acronym</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Acronym</em>' attribute.
   * @see #getAcronym()
   * @generated
   */
  void setAcronym(String value);

  /**
   * Returns the value of the '<em><b>President</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>President</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>President</em>' reference.
   * @see #setPresident(Politician)
   * @see politicianBiDsl.pBiDsl.PBiDslPackage#getParty_President()
   * @model
   * @generated
   */
  Politician getPresident();

  /**
   * Sets the value of the '{@link politicianBiDsl.pBiDsl.Party#getPresident <em>President</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>President</em>' reference.
   * @see #getPresident()
   * @generated
   */
  void setPresident(Politician value);

  /**
   * Returns the value of the '<em><b>Pols</b></em>' containment reference list.
   * The list contents are of type {@link politicianBiDsl.pBiDsl.Politician}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pols</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pols</em>' containment reference list.
   * @see politicianBiDsl.pBiDsl.PBiDslPackage#getParty_Pols()
   * @model containment="true"
   * @generated
   */
  EList<Politician> getPols();

} // Party

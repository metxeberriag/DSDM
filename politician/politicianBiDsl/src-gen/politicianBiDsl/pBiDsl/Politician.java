/**
 */
package politicianBiDsl.pBiDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Politician</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link politicianBiDsl.pBiDsl.Politician#getName <em>Name</em>}</li>
 *   <li>{@link politicianBiDsl.pBiDsl.Politician#getAge <em>Age</em>}</li>
 *   <li>{@link politicianBiDsl.pBiDsl.Politician#getSex <em>Sex</em>}</li>
 * </ul>
 * </p>
 *
 * @see politicianBiDsl.pBiDsl.PBiDslPackage#getPolitician()
 * @model
 * @generated
 */
public interface Politician extends EObject
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
   * @see politicianBiDsl.pBiDsl.PBiDslPackage#getPolitician_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link politicianBiDsl.pBiDsl.Politician#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Age</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Age</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Age</em>' attribute.
   * @see #setAge(int)
   * @see politicianBiDsl.pBiDsl.PBiDslPackage#getPolitician_Age()
   * @model
   * @generated
   */
  int getAge();

  /**
   * Sets the value of the '{@link politicianBiDsl.pBiDsl.Politician#getAge <em>Age</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Age</em>' attribute.
   * @see #getAge()
   * @generated
   */
  void setAge(int value);

  /**
   * Returns the value of the '<em><b>Sex</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sex</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sex</em>' attribute.
   * @see #setSex(String)
   * @see politicianBiDsl.pBiDsl.PBiDslPackage#getPolitician_Sex()
   * @model
   * @generated
   */
  String getSex();

  /**
   * Sets the value of the '{@link politicianBiDsl.pBiDsl.Politician#getSex <em>Sex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sex</em>' attribute.
   * @see #getSex()
   * @generated
   */
  void setSex(String value);

} // Politician

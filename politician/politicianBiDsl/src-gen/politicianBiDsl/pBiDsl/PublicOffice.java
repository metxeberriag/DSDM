/**
 */
package politicianBiDsl.pBiDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Public Office</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link politicianBiDsl.pBiDsl.PublicOffice#getInstName <em>Inst Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see politicianBiDsl.pBiDsl.PBiDslPackage#getPublicOffice()
 * @model
 * @generated
 */
public interface PublicOffice extends Politician
{
  /**
   * Returns the value of the '<em><b>Inst Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inst Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inst Name</em>' attribute.
   * @see #setInstName(String)
   * @see politicianBiDsl.pBiDsl.PBiDslPackage#getPublicOffice_InstName()
   * @model
   * @generated
   */
  String getInstName();

  /**
   * Sets the value of the '{@link politicianBiDsl.pBiDsl.PublicOffice#getInstName <em>Inst Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inst Name</em>' attribute.
   * @see #getInstName()
   * @generated
   */
  void setInstName(String value);

} // PublicOffice

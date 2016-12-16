/**
 */
package politicianBiDsl.pBiDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import politicianBiDsl.pBiDsl.PBiDslPackage;
import politicianBiDsl.pBiDsl.PublicOffice;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Public Office</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link politicianBiDsl.pBiDsl.impl.PublicOfficeImpl#getInstName <em>Inst Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PublicOfficeImpl extends PoliticianImpl implements PublicOffice
{
  /**
   * The default value of the '{@link #getInstName() <em>Inst Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstName()
   * @generated
   * @ordered
   */
  protected static final String INST_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInstName() <em>Inst Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstName()
   * @generated
   * @ordered
   */
  protected String instName = INST_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PublicOfficeImpl()
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
    return PBiDslPackage.Literals.PUBLIC_OFFICE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInstName()
  {
    return instName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInstName(String newInstName)
  {
    String oldInstName = instName;
    instName = newInstName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PBiDslPackage.PUBLIC_OFFICE__INST_NAME, oldInstName, instName));
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
      case PBiDslPackage.PUBLIC_OFFICE__INST_NAME:
        return getInstName();
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
      case PBiDslPackage.PUBLIC_OFFICE__INST_NAME:
        setInstName((String)newValue);
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
      case PBiDslPackage.PUBLIC_OFFICE__INST_NAME:
        setInstName(INST_NAME_EDEFAULT);
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
      case PBiDslPackage.PUBLIC_OFFICE__INST_NAME:
        return INST_NAME_EDEFAULT == null ? instName != null : !INST_NAME_EDEFAULT.equals(instName);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (instName: ");
    result.append(instName);
    result.append(')');
    return result.toString();
  }

} //PublicOfficeImpl

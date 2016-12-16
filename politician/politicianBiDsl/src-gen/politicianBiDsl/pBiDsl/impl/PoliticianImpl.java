/**
 */
package politicianBiDsl.pBiDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import politicianBiDsl.pBiDsl.PBiDslPackage;
import politicianBiDsl.pBiDsl.Politician;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Politician</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link politicianBiDsl.pBiDsl.impl.PoliticianImpl#getName <em>Name</em>}</li>
 *   <li>{@link politicianBiDsl.pBiDsl.impl.PoliticianImpl#getAge <em>Age</em>}</li>
 *   <li>{@link politicianBiDsl.pBiDsl.impl.PoliticianImpl#getSex <em>Sex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PoliticianImpl extends MinimalEObjectImpl.Container implements Politician
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAge()
   * @generated
   * @ordered
   */
  protected static final int AGE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAge()
   * @generated
   * @ordered
   */
  protected int age = AGE_EDEFAULT;

  /**
   * The default value of the '{@link #getSex() <em>Sex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSex()
   * @generated
   * @ordered
   */
  protected static final String SEX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSex() <em>Sex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSex()
   * @generated
   * @ordered
   */
  protected String sex = SEX_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PoliticianImpl()
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
    return PBiDslPackage.Literals.POLITICIAN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PBiDslPackage.POLITICIAN__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getAge()
  {
    return age;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAge(int newAge)
  {
    int oldAge = age;
    age = newAge;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PBiDslPackage.POLITICIAN__AGE, oldAge, age));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSex()
  {
    return sex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSex(String newSex)
  {
    String oldSex = sex;
    sex = newSex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PBiDslPackage.POLITICIAN__SEX, oldSex, sex));
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
      case PBiDslPackage.POLITICIAN__NAME:
        return getName();
      case PBiDslPackage.POLITICIAN__AGE:
        return getAge();
      case PBiDslPackage.POLITICIAN__SEX:
        return getSex();
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
      case PBiDslPackage.POLITICIAN__NAME:
        setName((String)newValue);
        return;
      case PBiDslPackage.POLITICIAN__AGE:
        setAge((Integer)newValue);
        return;
      case PBiDslPackage.POLITICIAN__SEX:
        setSex((String)newValue);
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
      case PBiDslPackage.POLITICIAN__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PBiDslPackage.POLITICIAN__AGE:
        setAge(AGE_EDEFAULT);
        return;
      case PBiDslPackage.POLITICIAN__SEX:
        setSex(SEX_EDEFAULT);
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
      case PBiDslPackage.POLITICIAN__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PBiDslPackage.POLITICIAN__AGE:
        return age != AGE_EDEFAULT;
      case PBiDslPackage.POLITICIAN__SEX:
        return SEX_EDEFAULT == null ? sex != null : !SEX_EDEFAULT.equals(sex);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", age: ");
    result.append(age);
    result.append(", sex: ");
    result.append(sex);
    result.append(')');
    return result.toString();
  }

} //PoliticianImpl

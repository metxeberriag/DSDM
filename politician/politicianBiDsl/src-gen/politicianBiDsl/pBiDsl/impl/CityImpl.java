/**
 */
package politicianBiDsl.pBiDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import politicianBiDsl.pBiDsl.City;
import politicianBiDsl.pBiDsl.PBiDslPackage;
import politicianBiDsl.pBiDsl.Party;
import politicianBiDsl.pBiDsl.Politician;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>City</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link politicianBiDsl.pBiDsl.impl.CityImpl#getName <em>Name</em>}</li>
 *   <li>{@link politicianBiDsl.pBiDsl.impl.CityImpl#getParties <em>Parties</em>}</li>
 *   <li>{@link politicianBiDsl.pBiDsl.impl.CityImpl#getIndeps <em>Indeps</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CityImpl extends MinimalEObjectImpl.Container implements City
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
   * The cached value of the '{@link #getParties() <em>Parties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParties()
   * @generated
   * @ordered
   */
  protected EList<Party> parties;

  /**
   * The cached value of the '{@link #getIndeps() <em>Indeps</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndeps()
   * @generated
   * @ordered
   */
  protected EList<Politician> indeps;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CityImpl()
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
    return PBiDslPackage.Literals.CITY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PBiDslPackage.CITY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Party> getParties()
  {
    if (parties == null)
    {
      parties = new EObjectContainmentEList<Party>(Party.class, this, PBiDslPackage.CITY__PARTIES);
    }
    return parties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Politician> getIndeps()
  {
    if (indeps == null)
    {
      indeps = new EObjectContainmentEList<Politician>(Politician.class, this, PBiDslPackage.CITY__INDEPS);
    }
    return indeps;
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
      case PBiDslPackage.CITY__PARTIES:
        return ((InternalEList<?>)getParties()).basicRemove(otherEnd, msgs);
      case PBiDslPackage.CITY__INDEPS:
        return ((InternalEList<?>)getIndeps()).basicRemove(otherEnd, msgs);
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
      case PBiDslPackage.CITY__NAME:
        return getName();
      case PBiDslPackage.CITY__PARTIES:
        return getParties();
      case PBiDslPackage.CITY__INDEPS:
        return getIndeps();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PBiDslPackage.CITY__NAME:
        setName((String)newValue);
        return;
      case PBiDslPackage.CITY__PARTIES:
        getParties().clear();
        getParties().addAll((Collection<? extends Party>)newValue);
        return;
      case PBiDslPackage.CITY__INDEPS:
        getIndeps().clear();
        getIndeps().addAll((Collection<? extends Politician>)newValue);
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
      case PBiDslPackage.CITY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PBiDslPackage.CITY__PARTIES:
        getParties().clear();
        return;
      case PBiDslPackage.CITY__INDEPS:
        getIndeps().clear();
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
      case PBiDslPackage.CITY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PBiDslPackage.CITY__PARTIES:
        return parties != null && !parties.isEmpty();
      case PBiDslPackage.CITY__INDEPS:
        return indeps != null && !indeps.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //CityImpl

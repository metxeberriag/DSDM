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

import politicianBiDsl.pBiDsl.PBiDslPackage;
import politicianBiDsl.pBiDsl.Party;
import politicianBiDsl.pBiDsl.Politician;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link politicianBiDsl.pBiDsl.impl.PartyImpl#getName <em>Name</em>}</li>
 *   <li>{@link politicianBiDsl.pBiDsl.impl.PartyImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link politicianBiDsl.pBiDsl.impl.PartyImpl#getPresident <em>President</em>}</li>
 *   <li>{@link politicianBiDsl.pBiDsl.impl.PartyImpl#getPols <em>Pols</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartyImpl extends MinimalEObjectImpl.Container implements Party
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
   * The default value of the '{@link #getAcronym() <em>Acronym</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAcronym()
   * @generated
   * @ordered
   */
  protected static final String ACRONYM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAcronym() <em>Acronym</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAcronym()
   * @generated
   * @ordered
   */
  protected String acronym = ACRONYM_EDEFAULT;

  /**
   * The cached value of the '{@link #getPresident() <em>President</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPresident()
   * @generated
   * @ordered
   */
  protected Politician president;

  /**
   * The cached value of the '{@link #getPols() <em>Pols</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPols()
   * @generated
   * @ordered
   */
  protected EList<Politician> pols;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PartyImpl()
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
    return PBiDslPackage.Literals.PARTY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PBiDslPackage.PARTY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAcronym()
  {
    return acronym;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAcronym(String newAcronym)
  {
    String oldAcronym = acronym;
    acronym = newAcronym;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PBiDslPackage.PARTY__ACRONYM, oldAcronym, acronym));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Politician getPresident()
  {
    if (president != null && president.eIsProxy())
    {
      InternalEObject oldPresident = (InternalEObject)president;
      president = (Politician)eResolveProxy(oldPresident);
      if (president != oldPresident)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PBiDslPackage.PARTY__PRESIDENT, oldPresident, president));
      }
    }
    return president;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Politician basicGetPresident()
  {
    return president;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPresident(Politician newPresident)
  {
    Politician oldPresident = president;
    president = newPresident;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PBiDslPackage.PARTY__PRESIDENT, oldPresident, president));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Politician> getPols()
  {
    if (pols == null)
    {
      pols = new EObjectContainmentEList<Politician>(Politician.class, this, PBiDslPackage.PARTY__POLS);
    }
    return pols;
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
      case PBiDslPackage.PARTY__POLS:
        return ((InternalEList<?>)getPols()).basicRemove(otherEnd, msgs);
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
      case PBiDslPackage.PARTY__NAME:
        return getName();
      case PBiDslPackage.PARTY__ACRONYM:
        return getAcronym();
      case PBiDslPackage.PARTY__PRESIDENT:
        if (resolve) return getPresident();
        return basicGetPresident();
      case PBiDslPackage.PARTY__POLS:
        return getPols();
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
      case PBiDslPackage.PARTY__NAME:
        setName((String)newValue);
        return;
      case PBiDslPackage.PARTY__ACRONYM:
        setAcronym((String)newValue);
        return;
      case PBiDslPackage.PARTY__PRESIDENT:
        setPresident((Politician)newValue);
        return;
      case PBiDslPackage.PARTY__POLS:
        getPols().clear();
        getPols().addAll((Collection<? extends Politician>)newValue);
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
      case PBiDslPackage.PARTY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PBiDslPackage.PARTY__ACRONYM:
        setAcronym(ACRONYM_EDEFAULT);
        return;
      case PBiDslPackage.PARTY__PRESIDENT:
        setPresident((Politician)null);
        return;
      case PBiDslPackage.PARTY__POLS:
        getPols().clear();
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
      case PBiDslPackage.PARTY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PBiDslPackage.PARTY__ACRONYM:
        return ACRONYM_EDEFAULT == null ? acronym != null : !ACRONYM_EDEFAULT.equals(acronym);
      case PBiDslPackage.PARTY__PRESIDENT:
        return president != null;
      case PBiDslPackage.PARTY__POLS:
        return pols != null && !pols.isEmpty();
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
    result.append(", acronym: ");
    result.append(acronym);
    result.append(')');
    return result.toString();
  }

} //PartyImpl

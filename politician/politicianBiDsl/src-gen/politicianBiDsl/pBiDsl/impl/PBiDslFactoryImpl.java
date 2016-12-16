/**
 */
package politicianBiDsl.pBiDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import politicianBiDsl.pBiDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PBiDslFactoryImpl extends EFactoryImpl implements PBiDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PBiDslFactory init()
  {
    try
    {
      PBiDslFactory thePBiDslFactory = (PBiDslFactory)EPackage.Registry.INSTANCE.getEFactory(PBiDslPackage.eNS_URI);
      if (thePBiDslFactory != null)
      {
        return thePBiDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PBiDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PBiDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PBiDslPackage.CITY: return createCity();
      case PBiDslPackage.PARTY: return createParty();
      case PBiDslPackage.POLITICIAN: return createPolitician();
      case PBiDslPackage.PUBLIC_OFFICE: return createPublicOffice();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public City createCity()
  {
    CityImpl city = new CityImpl();
    return city;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Party createParty()
  {
    PartyImpl party = new PartyImpl();
    return party;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Politician createPolitician()
  {
    PoliticianImpl politician = new PoliticianImpl();
    return politician;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PublicOffice createPublicOffice()
  {
    PublicOfficeImpl publicOffice = new PublicOfficeImpl();
    return publicOffice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PBiDslPackage getPBiDslPackage()
  {
    return (PBiDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PBiDslPackage getPackage()
  {
    return PBiDslPackage.eINSTANCE;
  }

} //PBiDslFactoryImpl

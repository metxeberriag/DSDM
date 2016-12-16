/**
 */
package politicianBiDsl.pBiDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see politicianBiDsl.pBiDsl.PBiDslFactory
 * @model kind="package"
 * @generated
 */
public interface PBiDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "pBiDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.PBiDsl.politicianBiDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "pBiDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PBiDslPackage eINSTANCE = politicianBiDsl.pBiDsl.impl.PBiDslPackageImpl.init();

  /**
   * The meta object id for the '{@link politicianBiDsl.pBiDsl.impl.CityImpl <em>City</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see politicianBiDsl.pBiDsl.impl.CityImpl
   * @see politicianBiDsl.pBiDsl.impl.PBiDslPackageImpl#getCity()
   * @generated
   */
  int CITY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Parties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CITY__PARTIES = 1;

  /**
   * The feature id for the '<em><b>Indeps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CITY__INDEPS = 2;

  /**
   * The number of structural features of the '<em>City</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CITY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link politicianBiDsl.pBiDsl.impl.PartyImpl <em>Party</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see politicianBiDsl.pBiDsl.impl.PartyImpl
   * @see politicianBiDsl.pBiDsl.impl.PBiDslPackageImpl#getParty()
   * @generated
   */
  int PARTY = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTY__NAME = 0;

  /**
   * The feature id for the '<em><b>Acronym</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTY__ACRONYM = 1;

  /**
   * The feature id for the '<em><b>President</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTY__PRESIDENT = 2;

  /**
   * The feature id for the '<em><b>Pols</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTY__POLS = 3;

  /**
   * The number of structural features of the '<em>Party</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link politicianBiDsl.pBiDsl.impl.PoliticianImpl <em>Politician</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see politicianBiDsl.pBiDsl.impl.PoliticianImpl
   * @see politicianBiDsl.pBiDsl.impl.PBiDslPackageImpl#getPolitician()
   * @generated
   */
  int POLITICIAN = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLITICIAN__NAME = 0;

  /**
   * The feature id for the '<em><b>Age</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLITICIAN__AGE = 1;

  /**
   * The feature id for the '<em><b>Sex</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLITICIAN__SEX = 2;

  /**
   * The number of structural features of the '<em>Politician</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLITICIAN_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link politicianBiDsl.pBiDsl.impl.PublicOfficeImpl <em>Public Office</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see politicianBiDsl.pBiDsl.impl.PublicOfficeImpl
   * @see politicianBiDsl.pBiDsl.impl.PBiDslPackageImpl#getPublicOffice()
   * @generated
   */
  int PUBLIC_OFFICE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUBLIC_OFFICE__NAME = POLITICIAN__NAME;

  /**
   * The feature id for the '<em><b>Age</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUBLIC_OFFICE__AGE = POLITICIAN__AGE;

  /**
   * The feature id for the '<em><b>Sex</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUBLIC_OFFICE__SEX = POLITICIAN__SEX;

  /**
   * The feature id for the '<em><b>Inst Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUBLIC_OFFICE__INST_NAME = POLITICIAN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Public Office</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUBLIC_OFFICE_FEATURE_COUNT = POLITICIAN_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link politicianBiDsl.pBiDsl.City <em>City</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>City</em>'.
   * @see politicianBiDsl.pBiDsl.City
   * @generated
   */
  EClass getCity();

  /**
   * Returns the meta object for the attribute '{@link politicianBiDsl.pBiDsl.City#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see politicianBiDsl.pBiDsl.City#getName()
   * @see #getCity()
   * @generated
   */
  EAttribute getCity_Name();

  /**
   * Returns the meta object for the containment reference list '{@link politicianBiDsl.pBiDsl.City#getParties <em>Parties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parties</em>'.
   * @see politicianBiDsl.pBiDsl.City#getParties()
   * @see #getCity()
   * @generated
   */
  EReference getCity_Parties();

  /**
   * Returns the meta object for the containment reference list '{@link politicianBiDsl.pBiDsl.City#getIndeps <em>Indeps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Indeps</em>'.
   * @see politicianBiDsl.pBiDsl.City#getIndeps()
   * @see #getCity()
   * @generated
   */
  EReference getCity_Indeps();

  /**
   * Returns the meta object for class '{@link politicianBiDsl.pBiDsl.Party <em>Party</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Party</em>'.
   * @see politicianBiDsl.pBiDsl.Party
   * @generated
   */
  EClass getParty();

  /**
   * Returns the meta object for the attribute '{@link politicianBiDsl.pBiDsl.Party#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see politicianBiDsl.pBiDsl.Party#getName()
   * @see #getParty()
   * @generated
   */
  EAttribute getParty_Name();

  /**
   * Returns the meta object for the attribute '{@link politicianBiDsl.pBiDsl.Party#getAcronym <em>Acronym</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Acronym</em>'.
   * @see politicianBiDsl.pBiDsl.Party#getAcronym()
   * @see #getParty()
   * @generated
   */
  EAttribute getParty_Acronym();

  /**
   * Returns the meta object for the reference '{@link politicianBiDsl.pBiDsl.Party#getPresident <em>President</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>President</em>'.
   * @see politicianBiDsl.pBiDsl.Party#getPresident()
   * @see #getParty()
   * @generated
   */
  EReference getParty_President();

  /**
   * Returns the meta object for the containment reference list '{@link politicianBiDsl.pBiDsl.Party#getPols <em>Pols</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pols</em>'.
   * @see politicianBiDsl.pBiDsl.Party#getPols()
   * @see #getParty()
   * @generated
   */
  EReference getParty_Pols();

  /**
   * Returns the meta object for class '{@link politicianBiDsl.pBiDsl.Politician <em>Politician</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Politician</em>'.
   * @see politicianBiDsl.pBiDsl.Politician
   * @generated
   */
  EClass getPolitician();

  /**
   * Returns the meta object for the attribute '{@link politicianBiDsl.pBiDsl.Politician#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see politicianBiDsl.pBiDsl.Politician#getName()
   * @see #getPolitician()
   * @generated
   */
  EAttribute getPolitician_Name();

  /**
   * Returns the meta object for the attribute '{@link politicianBiDsl.pBiDsl.Politician#getAge <em>Age</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Age</em>'.
   * @see politicianBiDsl.pBiDsl.Politician#getAge()
   * @see #getPolitician()
   * @generated
   */
  EAttribute getPolitician_Age();

  /**
   * Returns the meta object for the attribute '{@link politicianBiDsl.pBiDsl.Politician#getSex <em>Sex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sex</em>'.
   * @see politicianBiDsl.pBiDsl.Politician#getSex()
   * @see #getPolitician()
   * @generated
   */
  EAttribute getPolitician_Sex();

  /**
   * Returns the meta object for class '{@link politicianBiDsl.pBiDsl.PublicOffice <em>Public Office</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Public Office</em>'.
   * @see politicianBiDsl.pBiDsl.PublicOffice
   * @generated
   */
  EClass getPublicOffice();

  /**
   * Returns the meta object for the attribute '{@link politicianBiDsl.pBiDsl.PublicOffice#getInstName <em>Inst Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inst Name</em>'.
   * @see politicianBiDsl.pBiDsl.PublicOffice#getInstName()
   * @see #getPublicOffice()
   * @generated
   */
  EAttribute getPublicOffice_InstName();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PBiDslFactory getPBiDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link politicianBiDsl.pBiDsl.impl.CityImpl <em>City</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see politicianBiDsl.pBiDsl.impl.CityImpl
     * @see politicianBiDsl.pBiDsl.impl.PBiDslPackageImpl#getCity()
     * @generated
     */
    EClass CITY = eINSTANCE.getCity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CITY__NAME = eINSTANCE.getCity_Name();

    /**
     * The meta object literal for the '<em><b>Parties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CITY__PARTIES = eINSTANCE.getCity_Parties();

    /**
     * The meta object literal for the '<em><b>Indeps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CITY__INDEPS = eINSTANCE.getCity_Indeps();

    /**
     * The meta object literal for the '{@link politicianBiDsl.pBiDsl.impl.PartyImpl <em>Party</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see politicianBiDsl.pBiDsl.impl.PartyImpl
     * @see politicianBiDsl.pBiDsl.impl.PBiDslPackageImpl#getParty()
     * @generated
     */
    EClass PARTY = eINSTANCE.getParty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARTY__NAME = eINSTANCE.getParty_Name();

    /**
     * The meta object literal for the '<em><b>Acronym</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARTY__ACRONYM = eINSTANCE.getParty_Acronym();

    /**
     * The meta object literal for the '<em><b>President</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARTY__PRESIDENT = eINSTANCE.getParty_President();

    /**
     * The meta object literal for the '<em><b>Pols</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARTY__POLS = eINSTANCE.getParty_Pols();

    /**
     * The meta object literal for the '{@link politicianBiDsl.pBiDsl.impl.PoliticianImpl <em>Politician</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see politicianBiDsl.pBiDsl.impl.PoliticianImpl
     * @see politicianBiDsl.pBiDsl.impl.PBiDslPackageImpl#getPolitician()
     * @generated
     */
    EClass POLITICIAN = eINSTANCE.getPolitician();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POLITICIAN__NAME = eINSTANCE.getPolitician_Name();

    /**
     * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POLITICIAN__AGE = eINSTANCE.getPolitician_Age();

    /**
     * The meta object literal for the '<em><b>Sex</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POLITICIAN__SEX = eINSTANCE.getPolitician_Sex();

    /**
     * The meta object literal for the '{@link politicianBiDsl.pBiDsl.impl.PublicOfficeImpl <em>Public Office</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see politicianBiDsl.pBiDsl.impl.PublicOfficeImpl
     * @see politicianBiDsl.pBiDsl.impl.PBiDslPackageImpl#getPublicOffice()
     * @generated
     */
    EClass PUBLIC_OFFICE = eINSTANCE.getPublicOffice();

    /**
     * The meta object literal for the '<em><b>Inst Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PUBLIC_OFFICE__INST_NAME = eINSTANCE.getPublicOffice_InstName();

  }

} //PBiDslPackage

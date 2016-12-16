/**
 */
package politicianBiDsl.pBiDsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import politicianBiDsl.pBiDsl.City;
import politicianBiDsl.pBiDsl.PBiDslFactory;
import politicianBiDsl.pBiDsl.PBiDslPackage;
import politicianBiDsl.pBiDsl.Party;
import politicianBiDsl.pBiDsl.Politician;
import politicianBiDsl.pBiDsl.PublicOffice;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PBiDslPackageImpl extends EPackageImpl implements PBiDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass partyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass politicianEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass publicOfficeEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see politicianBiDsl.pBiDsl.PBiDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private PBiDslPackageImpl()
  {
    super(eNS_URI, PBiDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link PBiDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static PBiDslPackage init()
  {
    if (isInited) return (PBiDslPackage)EPackage.Registry.INSTANCE.getEPackage(PBiDslPackage.eNS_URI);

    // Obtain or create and register package
    PBiDslPackageImpl thePBiDslPackage = (PBiDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PBiDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PBiDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    thePBiDslPackage.createPackageContents();

    // Initialize created meta-data
    thePBiDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePBiDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(PBiDslPackage.eNS_URI, thePBiDslPackage);
    return thePBiDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCity()
  {
    return cityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCity_Name()
  {
    return (EAttribute)cityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCity_Parties()
  {
    return (EReference)cityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCity_Indeps()
  {
    return (EReference)cityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParty()
  {
    return partyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParty_Name()
  {
    return (EAttribute)partyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParty_Acronym()
  {
    return (EAttribute)partyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParty_President()
  {
    return (EReference)partyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParty_Pols()
  {
    return (EReference)partyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPolitician()
  {
    return politicianEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPolitician_Name()
  {
    return (EAttribute)politicianEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPolitician_Age()
  {
    return (EAttribute)politicianEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPolitician_Sex()
  {
    return (EAttribute)politicianEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPublicOffice()
  {
    return publicOfficeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPublicOffice_InstName()
  {
    return (EAttribute)publicOfficeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PBiDslFactory getPBiDslFactory()
  {
    return (PBiDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    cityEClass = createEClass(CITY);
    createEAttribute(cityEClass, CITY__NAME);
    createEReference(cityEClass, CITY__PARTIES);
    createEReference(cityEClass, CITY__INDEPS);

    partyEClass = createEClass(PARTY);
    createEAttribute(partyEClass, PARTY__NAME);
    createEAttribute(partyEClass, PARTY__ACRONYM);
    createEReference(partyEClass, PARTY__PRESIDENT);
    createEReference(partyEClass, PARTY__POLS);

    politicianEClass = createEClass(POLITICIAN);
    createEAttribute(politicianEClass, POLITICIAN__NAME);
    createEAttribute(politicianEClass, POLITICIAN__AGE);
    createEAttribute(politicianEClass, POLITICIAN__SEX);

    publicOfficeEClass = createEClass(PUBLIC_OFFICE);
    createEAttribute(publicOfficeEClass, PUBLIC_OFFICE__INST_NAME);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    publicOfficeEClass.getESuperTypes().add(this.getPolitician());

    // Initialize classes and features; add operations and parameters
    initEClass(cityEClass, City.class, "City", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCity_Name(), ecorePackage.getEString(), "name", null, 0, 1, City.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCity_Parties(), this.getParty(), null, "parties", null, 0, -1, City.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCity_Indeps(), this.getPolitician(), null, "indeps", null, 0, -1, City.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(partyEClass, Party.class, "Party", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParty_Name(), ecorePackage.getEString(), "name", null, 0, 1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParty_Acronym(), ecorePackage.getEString(), "acronym", null, 0, 1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParty_President(), this.getPolitician(), null, "president", null, 0, 1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParty_Pols(), this.getPolitician(), null, "pols", null, 0, -1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(politicianEClass, Politician.class, "Politician", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPolitician_Name(), ecorePackage.getEString(), "name", null, 0, 1, Politician.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPolitician_Age(), ecorePackage.getEInt(), "age", null, 0, 1, Politician.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPolitician_Sex(), ecorePackage.getEString(), "sex", null, 0, 1, Politician.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(publicOfficeEClass, PublicOffice.class, "PublicOffice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPublicOffice_InstName(), ecorePackage.getEString(), "instName", null, 0, 1, PublicOffice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //PBiDslPackageImpl

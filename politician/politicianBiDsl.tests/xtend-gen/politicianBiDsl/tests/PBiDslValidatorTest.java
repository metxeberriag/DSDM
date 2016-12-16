package politicianBiDsl.tests;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;
import org.junit.runner.RunWith;
import politicianBiDsl.PBiDslInjectorProvider;
import politicianBiDsl.pBiDsl.City;
import politicianBiDsl.pBiDsl.PBiDslPackage;
import politicianBiDsl.validation.PBiDslValidator;

@RunWith(XtextRunner.class)
@InjectWith(PBiDslInjectorProvider.class)
@SuppressWarnings("all")
public class PBiDslValidatorTest {
  @Inject
  @Extension
  private ParseHelper<City> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testDuplicatePoliticiansInDifferentCitiesOK() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("city MyCity {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("MyCity Politician;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("party MyCity2 {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("MyCity2 Politician;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final City model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDuplicatePartiesInDifferentCitiesOK() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("city MyCity {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("MyCity Party;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("city MyCity2 {");
      _builder.newLine();
      _builder.append("   \t");
      _builder.append("MyCity2 Party;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final City model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testPoliticianIndepOrParty() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("party MyParty {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("MyParty Politician;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("MyParty MyCity;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("city MyCity {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("MyCity Politician;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final City model = this._parseHelper.parse(_builder);
      EClass _politician = PBiDslPackage.eINSTANCE.getPolitician();
      this._validationTestHelper.assertError(model, _politician, null, 
        "The same Politician \'politician\' can be independent and on a party in the same city");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDuplicateCities() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("city MyCity {}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("city MyCity {}");
      _builder.newLine();
      final City model = this._parseHelper.parse(_builder);
      EClass _city = PBiDslPackage.eINSTANCE.getCity();
      this._validationTestHelper.assertError(model, _city, null, 
        "Duplicate city \'MyCity\'");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDuplicateParties() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("party MyParty {}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("party MyParty {}");
      _builder.newLine();
      final City model = this._parseHelper.parse(_builder);
      EClass _party = PBiDslPackage.eINSTANCE.getParty();
      this._validationTestHelper.assertError(model, _party, null, 
        "Duplicate party \'MyParty\'");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDuplicatePoliticians() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("party MyParty {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("MyParty Politician;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("MyParty Politician2;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("MyParty Politician;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("city MyCity {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("MyCity Politician;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("MyCity Politician2;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("MyCity Politician;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final City model = this._parseHelper.parse(_builder);
      EClass _politician = PBiDslPackage.eINSTANCE.getPolitician();
      this._validationTestHelper.assertError(model, _politician, null, 
        "Duplicate Politician \'politician\'");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testPartyWithTheSameNameOfAnPoliticianOK() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("party MyParty {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("MyParty MyParty;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final City model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * EZ DA BEHAR!
   * @Test
   * def void testEntityExtendsItself() {
   * '''
   * entity MyEntity extends MyEntity {
   * 
   * }
   * '''.parse.assertError(EntitateakPackage::eINSTANCE.entity,
   * EntitateakValidator::HIERARCHY_CYCLE,
   * "cycle in hierarchy of entity 'MyEntity'"
   * )
   * }
   * 
   * EZ DA BEHAR!
   * @Test
   * def void testCycleInEntityHierarchy() {
   * val model = '''
   * entity A extends B {}
   * entity B extends C {}
   * entity C extends A {}
   * '''.parse
   * 
   * model.assertError(EntitateakPackage::eINSTANCE.entity,
   * EntitateakValidator::HIERARCHY_CYCLE,
   * "cycle in hierarchy of entity 'A'"
   * )
   * model.assertError(EntitateakPackage::eINSTANCE.entity,
   * EntitateakValidator::HIERARCHY_CYCLE,
   * "cycle in hierarchy of entity 'B'"
   * )
   * model.assertError(EntitateakPackage::eINSTANCE.entity,
   * EntitateakValidator::HIERARCHY_CYCLE,
   * "cycle in hierarchy of entity 'C'"
   * )
   * }
   */
  @Test
  public void testCityName() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("city MyCity {} ");
      City _parse = this._parseHelper.parse(_builder);
      EClass _city = PBiDslPackage.eINSTANCE.getCity();
      this._validationTestHelper.assertWarning(_parse, _city, 
        PBiDslValidator.INVALID_ENTITY_NAME, 
        "Entity name should start with a capital");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}

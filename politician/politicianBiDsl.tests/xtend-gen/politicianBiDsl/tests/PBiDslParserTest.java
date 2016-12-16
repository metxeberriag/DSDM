package politicianBiDsl.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import politicianBiDsl.PBiDslInjectorProvider;
import politicianBiDsl.pBiDsl.City;
import politicianBiDsl.pBiDsl.Party;
import politicianBiDsl.pBiDsl.Politician;

@RunWith(XtextRunner.class)
@InjectWith(PBiDslInjectorProvider.class)
@SuppressWarnings("all")
public class PBiDslParserTest {
  @Inject
  @Extension
  private ParseHelper<City> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testCorrectParsing() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("city MyCity {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("MyCity indep;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("party MyParty {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("MyParty president;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("MyParty politician;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      City _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParsing() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("city MyCity {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("MyCity indep;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("party MyParty {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("MyParty president;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("MyParty politician;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final City model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(model);
      final String city = model.getName();
      Assert.assertEquals("MyCity", city);
      EList<Politician> _indeps = model.getIndeps();
      final Politician indep = _indeps.get(0);
      String _name = indep.getName();
      Assert.assertEquals("indep", _name);
      EList<Party> _parties = model.getParties();
      final Party party = _parties.get(0);
      String _name_1 = party.getName();
      Assert.assertEquals("MyParty", _name_1);
      EList<Politician> _pols = party.getPols();
      final Politician pol = _pols.get(0);
      String _name_2 = pol.getName();
      Assert.assertEquals("politician", _name_2);
      final Politician president = party.getPresident();
      String _name_3 = president.getName();
      Assert.assertEquals("president", _name_3);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParsingAndLinking() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("party MyParty {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("MyParty2 Politician;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("entity MyParty2 {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("MyParty Politician;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      City _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}

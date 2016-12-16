package politicianBiDsl.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import politicianBiDsl.PBiDslInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(PBiDslInjectorProvider.class)
@SuppressWarnings("all")
public class PBiDslGeneratorTest {
  @Inject
  @Extension
  private CompilationTestHelper _compilationTestHelper;
  
  @Inject
  @Extension
  private ReflectExtensions _reflectExtensions;
  
  @Test
  public void testGenerateCity() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("city MyCity {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("string name;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Politician[] indeps;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Party[] parties;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package City;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("public class MyCity {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("private String cityName;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("private Party[] parties;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("private Politican[] indeps;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public String getCityName() {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("return cityName;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public Party[] getParties() {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("return parties;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public Politician[] getIndeps() {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("return indeps;\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public void setCityName(String _arg) {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("this.cityName = _arg;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public void setParties(Party[] _arg) {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("this.parties = _arg;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public void setIndeps(Politician[] _arg) {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("this.indeps = _arg;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      this._compilationTestHelper.assertCompilesTo(_builder, _builder_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGenerateParty() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("party Party {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("string partyName;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("string acronym;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Politician president;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Politician[] pols;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package Party;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("public class Myparty {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("private String name;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("private String acronym;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("private Politician president;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("private Politican[] pols;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public String getName() {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("return name;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public String getAcronym() {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("return partyAconym;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public Politician getPresident() {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("return president;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public Politician[] getPols() {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("return pols;\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public void setName(String _arg) {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("this.name = _arg;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public void setAcronym(String _arg) {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("this.acronym = _arg;");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public void setPresident(Politician _arg) {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("this.parties = _arg;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public void setPols(Politician[] _arg) {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("this.pols = _arg;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      this._compilationTestHelper.assertCompilesTo(_builder, _builder_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGeneratePolitician() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Politician MyPol {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("string name;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("int age;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("string sex;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package Politician;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("public class MyPol {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("private String name;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("private int age;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("private String sex;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public String getName() {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("return name;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public Integer getAge() {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("return age;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public String getSex() {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("return sex;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public void setName(String _arg) {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("this.name = _arg;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public void setAge(int _arg) {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("this.age = _arg;");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public void setSex(String _arg) {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("this.sex = _arg;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      this._compilationTestHelper.assertCompilesTo(_builder, _builder_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void testGeneratePublicOffice() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Politician MyPol {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("string name;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("int age;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("string sex;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("string instName;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package Politician;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("public class MyPol {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("private String name;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("private int age;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("private String sex;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("private String instName;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public String getName() {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("return name;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public Integer getAge() {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("return age;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public String getSex() {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("return sex;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public String getInstName() {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("return instName;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public void setName(String _arg) {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("this.name = _arg;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public void setAge(int _arg) {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("this.age = _arg;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public void setSex(String _arg) {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("this.sex = _arg;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public void setInstName(String _arg) {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("this.instName = _arg;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("}\t");
      _builder_1.newLine();
      this._compilationTestHelper.assertCompilesTo(_builder, _builder_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testTwoCompiledClasses() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("party MyParty {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("string name;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("string acronym;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Politician MyPol;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Politician[] pols;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Politician MyPol {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("string name1;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("int age;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("string sex;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final IAcceptor<CompilationTestHelper.Result> _function = new IAcceptor<CompilationTestHelper.Result>() {
        public void accept(final CompilationTestHelper.Result it) {
          Class<?> _compiledClass = it.getCompiledClass("party.MyParty");
          Assert.assertNotNull(_compiledClass);
          Class<?> _compiledClass_1 = it.getCompiledClass("politician.MyPol");
          Assert.assertNotNull(_compiledClass_1);
        }
      };
      this._compilationTestHelper.compile(_builder, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGeneratedJavaCode() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("city MyCity {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("string name;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final IAcceptor<CompilationTestHelper.Result> _function = new IAcceptor<CompilationTestHelper.Result>() {
        public void accept(final CompilationTestHelper.Result it) {
          try {
            Class<?> _compiledClass = it.getCompiledClass();
            Object _newInstance = _compiledClass.newInstance();
            final Procedure1<Object> _function = new Procedure1<Object>() {
              public void apply(final Object it) {
                try {
                  Object _invoke = PBiDslGeneratorTest.this._reflectExtensions.invoke(it, "getName");
                  Assert.assertNull(_invoke);
                  PBiDslGeneratorTest.this._reflectExtensions.invoke(it, "setName", "testvalue");
                  Object _invoke_1 = PBiDslGeneratorTest.this._reflectExtensions.invoke(it, "getName");
                  Assert.assertEquals("testvalue", _invoke_1);
                } catch (Throwable _e) {
                  throw Exceptions.sneakyThrow(_e);
                }
              }
            };
            ObjectExtensions.<Object>operator_doubleArrow(_newInstance, _function);
          } catch (Throwable _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        }
      };
      this._compilationTestHelper.compile(_builder, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}

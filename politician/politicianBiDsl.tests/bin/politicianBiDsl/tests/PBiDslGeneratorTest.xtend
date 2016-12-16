package politicianBiDsl.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions

import org.junit.Test
import org.junit.runner.RunWith


import static extension org.junit.Assert.*
import politicianBiDsl.PBiDslInjectorProvider
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(PBiDslInjectorProvider))
class PBiDslGeneratorTest {
	
//	@Rule
//	@Inject public TemporaryFolder temporaryFolder
	
	@Inject extension CompilationTestHelper
	@Inject extension ReflectExtensions

	@Test
	def void testGenerateCity() {
		'''
		city MyCity {
			string name;
			Politician[] indeps;
			Party[] parties;
		}
		'''.assertCompilesTo(
		'''
package City;

public class MyCity {
	private String cityName;
	private Party[] parties;
	private Politican[] indeps;

	public String getCityName() {
		return cityName;
	}
	
	public Party[] getParties() {
		return parties;
	}
	
	public Politician[] getIndeps() {
		return indeps;	
	}
	
	public void setCityName(String _arg) {
		this.cityName = _arg;
	}
	
	public void setParties(Party[] _arg) {
			this.parties = _arg;
	}
	
	public void setIndeps(Politician[] _arg) {
			this.indeps = _arg;
	}
	
}
		''')
	}
	
	@Test
	def void testGenerateParty() {
		'''
		party Party {
			string partyName;
			string acronym;
			Politician president;
			Politician[] pols;
		}
		'''.assertCompilesTo(
		'''
package Party;

public class Myparty {
	private String name;
	private String acronym;
	private Politician president;
	private Politican[] pols;

	public String getName() {
		return name;
	}
	
	public String getAcronym() {
		return partyAconym;
	}
	
	public Politician getPresident() {
		return president;
	}
	
	public Politician[] getPols() {
		return pols;	
	}
	
	public void setName(String _arg) {
		this.name = _arg;
	}
	
	public void setAcronym(String _arg) {
			this.acronym = _arg;
		}
	
	public void setPresident(Politician _arg) {
			this.parties = _arg;
	}
	
	public void setPols(Politician[] _arg) {
			this.pols = _arg;
	}
	
}
		''')
	}
	
			@Test
	def void testGeneratePolitician() {
		'''
		Politician MyPol {
			string name;
			int age;
			string sex;
		}
		'''.assertCompilesTo(
		'''
package Politician;

public class MyPol {
	private String name;
	private int age;
	private String sex;

	public String getName() {
		return name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setName(String _arg) {
		this.name = _arg;
	}
	
	public void setAge(int _arg) {
			this.age = _arg;
		}
	
	public void setSex(String _arg) {
			this.sex = _arg;
	}
	
}
		''')
	}
	
	def void testGeneratePublicOffice() {
		'''
		Politician MyPol {
			string name;
			int age;
			string sex;
			string instName;
		}
		'''.assertCompilesTo(
		'''
package Politician;

public class MyPol {
	private String name;
	private int age;
	private String sex;
	private String instName;

	public String getName() {
		return name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public String getSex() {
		return sex;
	}
	
	public String getInstName() {
		return instName;
	}
	
	public void setName(String _arg) {
		this.name = _arg;
	}
	
	public void setAge(int _arg) {
		this.age = _arg;
	}
	
	public void setSex(String _arg) {
		this.sex = _arg;
	}
	
	public void setInstName(String _arg) {
		this.instName = _arg;
	}
	
}	
		''')
	}


	@Test
	def void testTwoCompiledClasses() {
		'''
		party MyParty {
			string name;
			string acronym;
			Politician MyPol;
			Politician[] pols;
		}
		
		Politician MyPol {
			string name1;
			int age;
			string sex;
		}
		'''.compile[
			getCompiledClass("party.MyParty").assertNotNull
			getCompiledClass("politician.MyPol").assertNotNull
		]
		// check that it is valid Java code
	}


	@Test
	def void testGeneratedJavaCode() {
		'''
		city MyCity {
			string name;
		}
		'''.compile[
			compiledClass.newInstance => [
				assertNull(it.invoke("getName"))
				it.invoke("setName", "testvalue")
				assertEquals("testvalue", it.invoke("getName"))
			]
		]
	}
}
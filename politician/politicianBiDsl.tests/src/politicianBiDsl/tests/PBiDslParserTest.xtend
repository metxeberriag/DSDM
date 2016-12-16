package politicianBiDsl.tests

import com.google.inject.Inject
import org.eclipse.ui.internal.Model
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import politicianBiDsl.PBiDslInjectorProvider
import politicianBiDsl.pBiDsl.City
import politicianBiDsl.pBiDsl.PublicOffice
import politicianBiDsl.pBiDsl.Party
import politicianBiDsl.pBiDsl.Politician

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(PBiDslInjectorProvider))
class PBiDslParserTest {
	
	@Inject extension ParseHelper<City>
	@Inject extension ValidationTestHelper

	@Test
	def void testCorrectParsing() {
		'''
			city MyCity {
				MyCity indep;
			}
						
			party MyParty {
				MyParty president;
				MyParty politician;
			}
		'''.parse.assertNoErrors
	}

	@Test
	def void testParsing() {
		val model = '''
			city MyCity {
				MyCity indep;
			}
			
			party MyParty {
				MyParty president;
				MyParty politician;
			}
		'''.parse
		model.assertNoErrors
		
		val city = model.name
		Assert::assertEquals("MyCity", city);
		
		val indep = model.indeps.get(0)
		Assert::assertEquals("indep", indep.name);
				
		val party = model.parties.get(0)
		Assert::assertEquals("MyParty", party.name);
		
		val pol = party.pols.get(0)
		Assert::assertEquals("politician", pol.name);
		
		val president = party.president
		Assert::assertEquals("president", president.name);
			
	}
	
	@Test
	def void testParsingAndLinking() {
		'''
			party MyParty {
			    MyParty2 Politician;
			}
			
			entity MyParty2 {
			    MyParty Politician;
			}
		'''.parse.assertNoErrors
	}
}
package politicianBiDsl.tests

import com.google.inject.Inject
import org.eclipse.ui.internal.Model
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import politicianBiDsl.PBiDslInjectorProvider
import politicianBiDsl.pBiDsl.City
import politicianBiDsl.pBiDsl.PBiDslPackage
import politicianBiDsl.validation.PBiDslValidator

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(PBiDslInjectorProvider))
class PBiDslValidatorTest {
	
	@Inject extension ParseHelper<City>
	@Inject extension ValidationTestHelper
	
	//Politician berdinak City desberdinetan.
	@Test
	def void testDuplicatePoliticiansInDifferentCitiesOK() {
		val model = '''
			city MyCity {
			    MyCity Politician;
			}
			
			party MyCity2 {
			    MyCity2 Politician;
			}
		'''.parse
		
		model.assertNoErrors
	}
	
	//City desberdinetan Party berdinak.
	@Test
	def void testDuplicatePartiesInDifferentCitiesOK() {
		val model = '''
			city MyCity {
			    MyCity Party;
			}
			
			city MyCity2 {
			   	MyCity2 Party;
			}
		'''.parse
		
		model.assertNoErrors
	}
	
	@Test
	def void testPoliticianIndepOrParty() {
		val model = '''
			party MyParty {
				MyParty Politician;
				MyParty MyCity;
			}
			
			city MyCity {
				MyCity Politician;
			}
		'''.parse
		
		model.assertError(PBiDslPackage::eINSTANCE.politician, null,
			"The same Politician 'politician' can be independent and on a party in the same city"
		)
	}
	
	@Test
	def void testDuplicateCities() {
		val model = '''
			city MyCity {}
			
			city MyCity {}
		'''.parse
		
		model.assertError(PBiDslPackage::eINSTANCE.city, null,
			"Duplicate city 'MyCity'"
		)
	}
	
	@Test
	def void testDuplicateParties() {
		val model = '''
			party MyParty {}
			
			party MyParty {}
		'''.parse
		
		model.assertError(PBiDslPackage::eINSTANCE.party, null,
			"Duplicate party 'MyParty'"
		)
	}
	
	//Politician Party eta City-tik daude zintzilik.
	@Test
	def void testDuplicatePoliticians() {
		val model = '''
			party MyParty {
			    MyParty Politician;
			    MyParty Politician2;
			    MyParty Politician;
			}
			
			city MyCity {
				MyCity Politician;
				MyCity Politician2;
				MyCity Politician;
			}
		'''.parse
		
		model.assertError(PBiDslPackage::eINSTANCE.politician, null,
			"Duplicate Politician 'politician'"
		)

	}

	@Test
	def void testPartyWithTheSameNameOfAnPoliticianOK() {
		val model = '''
			party MyParty {
			    MyParty MyParty;
			}
		'''.parse
		
		model.assertNoErrors
	}
	
	

	/* 
	
	EZ DA BEHAR!
	@Test
	def void testEntityExtendsItself() {
		'''
			entity MyEntity extends MyEntity {
			    
			}
		'''.parse.assertError(EntitateakPackage::eINSTANCE.entity,
			EntitateakValidator::HIERARCHY_CYCLE,
			"cycle in hierarchy of entity 'MyEntity'"
		)
	}

	EZ DA BEHAR!
	@Test
	def void testCycleInEntityHierarchy() {
		val model = '''
			entity A extends B {}
			entity B extends C {}
			entity C extends A {}
		'''.parse
		
		model.assertError(EntitateakPackage::eINSTANCE.entity,
			EntitateakValidator::HIERARCHY_CYCLE,
			"cycle in hierarchy of entity 'A'"
		)
		model.assertError(EntitateakPackage::eINSTANCE.entity,
			EntitateakValidator::HIERARCHY_CYCLE,
			"cycle in hierarchy of entity 'B'"
		)
		model.assertError(EntitateakPackage::eINSTANCE.entity,
			EntitateakValidator::HIERARCHY_CYCLE,
			"cycle in hierarchy of entity 'C'"
		)
	}
	*/

	@Test
	def void testCityName() {
		'''city MyCity {} '''.parse.
			assertWarning(
				PBiDslPackage::eINSTANCE.city,
				PBiDslValidator::INVALID_ENTITY_NAME,
				"Entity name should start with a capital"
			)
	}
	
	/* 
	@Test
	def void testAttributeName() {
		'''entity MyEntity { string S; } '''.parse.
			assertWarning(
				EntitateakPackage::eINSTANCE.attribute,
				EntitateakValidator::INVALID_ATTRIBUTE_NAME,
				"Attribute name should start with a lowercase"
			)
	} */
}
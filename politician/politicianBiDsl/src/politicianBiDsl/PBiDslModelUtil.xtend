package politicianBiDsl

import politicianBiDsl.pBiDsl.City
import politicianBiDsl.pBiDsl.PBiDslFactory

class PBiDslModelUtil {
	
	def static addPartyOnACity(City city, String nameOfPartyToAdd) {
		val model = city.eContainer as City
		PBiDslFactory::eINSTANCE.createParty() => [
			name = nameOfPartyToAdd
			model.parties.add(model.parties.indexOf(city)+1, it)
		]
	}

}

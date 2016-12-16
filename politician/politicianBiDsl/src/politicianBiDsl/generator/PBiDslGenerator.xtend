
package politicianBiDsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess

import politicianBiDsl.pBiDsl.City
import politicianBiDsl.pBiDsl.Party

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class PBiDslGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		fsa.generateFile('politicians.txt', resource.compile) 
	}
	
	def City getCity(Resource r) {
		return r.allContents.toList().filter(typeof(City)).head();
	}
	
	def Iterable<Party> getParties(Resource r) {
		return r.allContents.toList().filter(typeof(Party));
	}
  	
	def compile (Resource resource) '''
	«resource.getCity.name»:
		Independents ->«FOR i : resource.getCity.indeps  SEPARATOR ','» «i.name» («i.age») «ENDFOR» 
		«FOR p : resource.getParties» 
		«p.acronym» («p.name») ->«FOR pol : p.pols  SEPARATOR ','» «pol.name» («pol.age») «ENDFOR» 
		«ENDFOR»
    '''
	
}

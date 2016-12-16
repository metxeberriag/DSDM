package politicianBiDsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import politicianBiDsl.pBiDsl.City;
import politicianBiDsl.pBiDsl.PBiDslPackage;
import politicianBiDsl.pBiDsl.Party;
import politicianBiDsl.pBiDsl.Politician;
import politicianBiDsl.pBiDsl.PublicOffice;
import politicianBiDsl.services.PBiDslGrammarAccess;

@SuppressWarnings("all")
public class PBiDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PBiDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PBiDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PBiDslPackage.CITY:
				if(context == grammarAccess.getCityRule()) {
					sequence_City(context, (City) semanticObject); 
					return; 
				}
				else break;
			case PBiDslPackage.PARTY:
				if(context == grammarAccess.getPartyRule()) {
					sequence_Party(context, (Party) semanticObject); 
					return; 
				}
				else break;
			case PBiDslPackage.POLITICIAN:
				if(context == grammarAccess.getPoliticianRule() ||
				   context == grammarAccess.getPolitician_ImplRule()) {
					sequence_Politician_Impl(context, (Politician) semanticObject); 
					return; 
				}
				else break;
			case PBiDslPackage.PUBLIC_OFFICE:
				if(context == grammarAccess.getPoliticianRule() ||
				   context == grammarAccess.getPublicOfficeRule()) {
					sequence_PublicOffice(context, (PublicOffice) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=STRING (parties+=Party parties+=Party*)? indeps+=Politician indeps+=Politician*)
	 */
	protected void sequence_City(EObject context, City semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING acronym=STRING president=[Politician|ID] pols+=Politician pols+=Politician*)
	 */
	protected void sequence_Party(EObject context, Party semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING age=INT sex=STRING)
	 */
	protected void sequence_Politician_Impl(EObject context, Politician semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PBiDslPackage.Literals.POLITICIAN__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PBiDslPackage.Literals.POLITICIAN__NAME));
			if(transientValues.isValueTransient(semanticObject, PBiDslPackage.Literals.POLITICIAN__AGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PBiDslPackage.Literals.POLITICIAN__AGE));
			if(transientValues.isValueTransient(semanticObject, PBiDslPackage.Literals.POLITICIAN__SEX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PBiDslPackage.Literals.POLITICIAN__SEX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPolitician_ImplAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPolitician_ImplAccess().getAgeINTTerminalRuleCall_4_0(), semanticObject.getAge());
		feeder.accept(grammarAccess.getPolitician_ImplAccess().getSexSTRINGTerminalRuleCall_6_0(), semanticObject.getSex());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING age=INT sex=STRING instName=STRING)
	 */
	protected void sequence_PublicOffice(EObject context, PublicOffice semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PBiDslPackage.Literals.POLITICIAN__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PBiDslPackage.Literals.POLITICIAN__NAME));
			if(transientValues.isValueTransient(semanticObject, PBiDslPackage.Literals.POLITICIAN__AGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PBiDslPackage.Literals.POLITICIAN__AGE));
			if(transientValues.isValueTransient(semanticObject, PBiDslPackage.Literals.POLITICIAN__SEX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PBiDslPackage.Literals.POLITICIAN__SEX));
			if(transientValues.isValueTransient(semanticObject, PBiDslPackage.Literals.PUBLIC_OFFICE__INST_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PBiDslPackage.Literals.PUBLIC_OFFICE__INST_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPublicOfficeAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPublicOfficeAccess().getAgeINTTerminalRuleCall_4_0(), semanticObject.getAge());
		feeder.accept(grammarAccess.getPublicOfficeAccess().getSexSTRINGTerminalRuleCall_6_0(), semanticObject.getSex());
		feeder.accept(grammarAccess.getPublicOfficeAccess().getInstNameSTRINGTerminalRuleCall_8_0(), semanticObject.getInstName());
		feeder.finish();
	}
}

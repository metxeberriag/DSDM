/*
* generated by Xtext
*/
grammar InternalPBiDsl;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package politicianBiDsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package politicianBiDsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import politicianBiDsl.services.PBiDslGrammarAccess;

}

@parser::members {
 
 	private PBiDslGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(PBiDslGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleCity
entryRuleCity 
:
{ before(grammarAccess.getCityRule()); }
	 ruleCity
{ after(grammarAccess.getCityRule()); } 
	 EOF 
;

// Rule City
ruleCity
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getCityAccess().getGroup()); }
(rule__City__Group__0)
{ after(grammarAccess.getCityAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleParty
entryRuleParty 
:
{ before(grammarAccess.getPartyRule()); }
	 ruleParty
{ after(grammarAccess.getPartyRule()); } 
	 EOF 
;

// Rule Party
ruleParty
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPartyAccess().getGroup()); }
(rule__Party__Group__0)
{ after(grammarAccess.getPartyAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePolitician
entryRulePolitician 
:
{ before(grammarAccess.getPoliticianRule()); }
	 rulePolitician
{ after(grammarAccess.getPoliticianRule()); } 
	 EOF 
;

// Rule Politician
rulePolitician
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPoliticianAccess().getAlternatives()); }
(rule__Politician__Alternatives)
{ after(grammarAccess.getPoliticianAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePolitician_Impl
entryRulePolitician_Impl 
:
{ before(grammarAccess.getPolitician_ImplRule()); }
	 rulePolitician_Impl
{ after(grammarAccess.getPolitician_ImplRule()); } 
	 EOF 
;

// Rule Politician_Impl
rulePolitician_Impl
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPolitician_ImplAccess().getGroup()); }
(rule__Politician_Impl__Group__0)
{ after(grammarAccess.getPolitician_ImplAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePublicOffice
entryRulePublicOffice 
:
{ before(grammarAccess.getPublicOfficeRule()); }
	 rulePublicOffice
{ after(grammarAccess.getPublicOfficeRule()); } 
	 EOF 
;

// Rule PublicOffice
rulePublicOffice
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPublicOfficeAccess().getGroup()); }
(rule__PublicOffice__Group__0)
{ after(grammarAccess.getPublicOfficeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__Politician__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPoliticianAccess().getPolitician_ImplParserRuleCall_0()); }
	rulePolitician_Impl
{ after(grammarAccess.getPoliticianAccess().getPolitician_ImplParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getPoliticianAccess().getPublicOfficeParserRuleCall_1()); }
	rulePublicOffice
{ after(grammarAccess.getPoliticianAccess().getPublicOfficeParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__City__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__City__Group__0__Impl
	rule__City__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__City__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCityAccess().getCityKeyword_0()); }

	'City' 

{ after(grammarAccess.getCityAccess().getCityKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__City__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__City__Group__1__Impl
	rule__City__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__City__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCityAccess().getNameAssignment_1()); }
(rule__City__NameAssignment_1)
{ after(grammarAccess.getCityAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__City__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__City__Group__2__Impl
	rule__City__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__City__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCityAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getCityAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__City__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__City__Group__3__Impl
	rule__City__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__City__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCityAccess().getGroup_3()); }
(rule__City__Group_3__0)?
{ after(grammarAccess.getCityAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__City__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__City__Group__4__Impl
	rule__City__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__City__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCityAccess().getIndepsKeyword_4()); }

	'indeps' 

{ after(grammarAccess.getCityAccess().getIndepsKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__City__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__City__Group__5__Impl
	rule__City__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__City__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCityAccess().getLeftCurlyBracketKeyword_5()); }

	'{' 

{ after(grammarAccess.getCityAccess().getLeftCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__City__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__City__Group__6__Impl
	rule__City__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__City__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCityAccess().getIndepsAssignment_6()); }
(rule__City__IndepsAssignment_6)
{ after(grammarAccess.getCityAccess().getIndepsAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__City__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__City__Group__7__Impl
	rule__City__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__City__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCityAccess().getGroup_7()); }
(rule__City__Group_7__0)*
{ after(grammarAccess.getCityAccess().getGroup_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__City__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__City__Group__8__Impl
	rule__City__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__City__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCityAccess().getRightCurlyBracketKeyword_8()); }

	'}' 

{ after(grammarAccess.getCityAccess().getRightCurlyBracketKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__City__Group__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__City__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__City__Group__9__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCityAccess().getRightCurlyBracketKeyword_9()); }

	'}' 

{ after(grammarAccess.getCityAccess().getRightCurlyBracketKeyword_9()); }
)

;
finally {
	restoreStackSize(stackSize);
}






















rule__City__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__City__Group_3__0__Impl
	rule__City__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__City__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCityAccess().getPartiesKeyword_3_0()); }

	'parties' 

{ after(grammarAccess.getCityAccess().getPartiesKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__City__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__City__Group_3__1__Impl
	rule__City__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__City__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCityAccess().getLeftCurlyBracketKeyword_3_1()); }

	'{' 

{ after(grammarAccess.getCityAccess().getLeftCurlyBracketKeyword_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__City__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__City__Group_3__2__Impl
	rule__City__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__City__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCityAccess().getPartiesAssignment_3_2()); }
(rule__City__PartiesAssignment_3_2)
{ after(grammarAccess.getCityAccess().getPartiesAssignment_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__City__Group_3__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__City__Group_3__3__Impl
	rule__City__Group_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__City__Group_3__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCityAccess().getGroup_3_3()); }
(rule__City__Group_3_3__0)*
{ after(grammarAccess.getCityAccess().getGroup_3_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__City__Group_3__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__City__Group_3__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__City__Group_3__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCityAccess().getRightCurlyBracketKeyword_3_4()); }

	'}' 

{ after(grammarAccess.getCityAccess().getRightCurlyBracketKeyword_3_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__City__Group_3_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__City__Group_3_3__0__Impl
	rule__City__Group_3_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__City__Group_3_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCityAccess().getCommaKeyword_3_3_0()); }

	',' 

{ after(grammarAccess.getCityAccess().getCommaKeyword_3_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__City__Group_3_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__City__Group_3_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__City__Group_3_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCityAccess().getPartiesAssignment_3_3_1()); }
(rule__City__PartiesAssignment_3_3_1)
{ after(grammarAccess.getCityAccess().getPartiesAssignment_3_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__City__Group_7__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__City__Group_7__0__Impl
	rule__City__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__City__Group_7__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCityAccess().getCommaKeyword_7_0()); }

	',' 

{ after(grammarAccess.getCityAccess().getCommaKeyword_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__City__Group_7__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__City__Group_7__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__City__Group_7__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCityAccess().getIndepsAssignment_7_1()); }
(rule__City__IndepsAssignment_7_1)
{ after(grammarAccess.getCityAccess().getIndepsAssignment_7_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Party__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Party__Group__0__Impl
	rule__Party__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Party__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPartyAccess().getPartyKeyword_0()); }

	'Party' 

{ after(grammarAccess.getPartyAccess().getPartyKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Party__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Party__Group__1__Impl
	rule__Party__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Party__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPartyAccess().getNameAssignment_1()); }
(rule__Party__NameAssignment_1)
{ after(grammarAccess.getPartyAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Party__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Party__Group__2__Impl
	rule__Party__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Party__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPartyAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getPartyAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Party__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Party__Group__3__Impl
	rule__Party__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Party__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPartyAccess().getAcronymKeyword_3()); }

	'acronym' 

{ after(grammarAccess.getPartyAccess().getAcronymKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Party__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Party__Group__4__Impl
	rule__Party__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Party__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPartyAccess().getAcronymAssignment_4()); }
(rule__Party__AcronymAssignment_4)
{ after(grammarAccess.getPartyAccess().getAcronymAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Party__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Party__Group__5__Impl
	rule__Party__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Party__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPartyAccess().getPresidentKeyword_5()); }

	'president' 

{ after(grammarAccess.getPartyAccess().getPresidentKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Party__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Party__Group__6__Impl
	rule__Party__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Party__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPartyAccess().getPresidentAssignment_6()); }
(rule__Party__PresidentAssignment_6)
{ after(grammarAccess.getPartyAccess().getPresidentAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Party__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Party__Group__7__Impl
	rule__Party__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Party__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPartyAccess().getPolsKeyword_7()); }

	'pols' 

{ after(grammarAccess.getPartyAccess().getPolsKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Party__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Party__Group__8__Impl
	rule__Party__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Party__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPartyAccess().getLeftSquareBracketKeyword_8()); }

	'[' 

{ after(grammarAccess.getPartyAccess().getLeftSquareBracketKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Party__Group__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Party__Group__9__Impl
	rule__Party__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__Party__Group__9__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPartyAccess().getPolsAssignment_9()); }
(rule__Party__PolsAssignment_9)
{ after(grammarAccess.getPartyAccess().getPolsAssignment_9()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Party__Group__10
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Party__Group__10__Impl
	rule__Party__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__Party__Group__10__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPartyAccess().getGroup_10()); }
(rule__Party__Group_10__0)*
{ after(grammarAccess.getPartyAccess().getGroup_10()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Party__Group__11
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Party__Group__11__Impl
	rule__Party__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__Party__Group__11__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPartyAccess().getRightSquareBracketKeyword_11()); }

	']' 

{ after(grammarAccess.getPartyAccess().getRightSquareBracketKeyword_11()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Party__Group__12
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Party__Group__12__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Party__Group__12__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPartyAccess().getRightCurlyBracketKeyword_12()); }

	'}' 

{ after(grammarAccess.getPartyAccess().getRightCurlyBracketKeyword_12()); }
)

;
finally {
	restoreStackSize(stackSize);
}




























rule__Party__Group_10__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Party__Group_10__0__Impl
	rule__Party__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Party__Group_10__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPartyAccess().getCommaKeyword_10_0()); }

	',' 

{ after(grammarAccess.getPartyAccess().getCommaKeyword_10_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Party__Group_10__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Party__Group_10__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Party__Group_10__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPartyAccess().getPolsAssignment_10_1()); }
(rule__Party__PolsAssignment_10_1)
{ after(grammarAccess.getPartyAccess().getPolsAssignment_10_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Politician_Impl__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Politician_Impl__Group__0__Impl
	rule__Politician_Impl__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Politician_Impl__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPolitician_ImplAccess().getPoliticianKeyword_0()); }

	'Politician' 

{ after(grammarAccess.getPolitician_ImplAccess().getPoliticianKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Politician_Impl__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Politician_Impl__Group__1__Impl
	rule__Politician_Impl__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Politician_Impl__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPolitician_ImplAccess().getNameAssignment_1()); }
(rule__Politician_Impl__NameAssignment_1)
{ after(grammarAccess.getPolitician_ImplAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Politician_Impl__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Politician_Impl__Group__2__Impl
	rule__Politician_Impl__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Politician_Impl__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPolitician_ImplAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getPolitician_ImplAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Politician_Impl__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Politician_Impl__Group__3__Impl
	rule__Politician_Impl__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Politician_Impl__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPolitician_ImplAccess().getAgeKeyword_3()); }

	'age' 

{ after(grammarAccess.getPolitician_ImplAccess().getAgeKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Politician_Impl__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Politician_Impl__Group__4__Impl
	rule__Politician_Impl__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Politician_Impl__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPolitician_ImplAccess().getAgeAssignment_4()); }
(rule__Politician_Impl__AgeAssignment_4)
{ after(grammarAccess.getPolitician_ImplAccess().getAgeAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Politician_Impl__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Politician_Impl__Group__5__Impl
	rule__Politician_Impl__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Politician_Impl__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPolitician_ImplAccess().getSexKeyword_5()); }

	'sex' 

{ after(grammarAccess.getPolitician_ImplAccess().getSexKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Politician_Impl__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Politician_Impl__Group__6__Impl
	rule__Politician_Impl__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Politician_Impl__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPolitician_ImplAccess().getSexAssignment_6()); }
(rule__Politician_Impl__SexAssignment_6)
{ after(grammarAccess.getPolitician_ImplAccess().getSexAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Politician_Impl__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Politician_Impl__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Politician_Impl__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPolitician_ImplAccess().getRightCurlyBracketKeyword_7()); }

	'}' 

{ after(grammarAccess.getPolitician_ImplAccess().getRightCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__PublicOffice__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PublicOffice__Group__0__Impl
	rule__PublicOffice__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOffice__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPublicOfficeAccess().getPublicOfficeKeyword_0()); }

	'PublicOffice' 

{ after(grammarAccess.getPublicOfficeAccess().getPublicOfficeKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PublicOffice__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PublicOffice__Group__1__Impl
	rule__PublicOffice__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOffice__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPublicOfficeAccess().getNameAssignment_1()); }
(rule__PublicOffice__NameAssignment_1)
{ after(grammarAccess.getPublicOfficeAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PublicOffice__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PublicOffice__Group__2__Impl
	rule__PublicOffice__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOffice__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPublicOfficeAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getPublicOfficeAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PublicOffice__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PublicOffice__Group__3__Impl
	rule__PublicOffice__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOffice__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPublicOfficeAccess().getAgeKeyword_3()); }

	'age' 

{ after(grammarAccess.getPublicOfficeAccess().getAgeKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PublicOffice__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PublicOffice__Group__4__Impl
	rule__PublicOffice__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOffice__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPublicOfficeAccess().getAgeAssignment_4()); }
(rule__PublicOffice__AgeAssignment_4)
{ after(grammarAccess.getPublicOfficeAccess().getAgeAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PublicOffice__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PublicOffice__Group__5__Impl
	rule__PublicOffice__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOffice__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPublicOfficeAccess().getSexKeyword_5()); }

	'sex' 

{ after(grammarAccess.getPublicOfficeAccess().getSexKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PublicOffice__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PublicOffice__Group__6__Impl
	rule__PublicOffice__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOffice__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPublicOfficeAccess().getSexAssignment_6()); }
(rule__PublicOffice__SexAssignment_6)
{ after(grammarAccess.getPublicOfficeAccess().getSexAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PublicOffice__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PublicOffice__Group__7__Impl
	rule__PublicOffice__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOffice__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPublicOfficeAccess().getInstNameKeyword_7()); }

	'instName' 

{ after(grammarAccess.getPublicOfficeAccess().getInstNameKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PublicOffice__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PublicOffice__Group__8__Impl
	rule__PublicOffice__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOffice__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPublicOfficeAccess().getInstNameAssignment_8()); }
(rule__PublicOffice__InstNameAssignment_8)
{ after(grammarAccess.getPublicOfficeAccess().getInstNameAssignment_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PublicOffice__Group__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PublicOffice__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOffice__Group__9__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPublicOfficeAccess().getRightCurlyBracketKeyword_9()); }

	'}' 

{ after(grammarAccess.getPublicOfficeAccess().getRightCurlyBracketKeyword_9()); }
)

;
finally {
	restoreStackSize(stackSize);
}























rule__City__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCityAccess().getNameSTRINGTerminalRuleCall_1_0()); }
	RULE_STRING{ after(grammarAccess.getCityAccess().getNameSTRINGTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__City__PartiesAssignment_3_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCityAccess().getPartiesPartyParserRuleCall_3_2_0()); }
	ruleParty{ after(grammarAccess.getCityAccess().getPartiesPartyParserRuleCall_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__City__PartiesAssignment_3_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCityAccess().getPartiesPartyParserRuleCall_3_3_1_0()); }
	ruleParty{ after(grammarAccess.getCityAccess().getPartiesPartyParserRuleCall_3_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__City__IndepsAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCityAccess().getIndepsPoliticianParserRuleCall_6_0()); }
	rulePolitician{ after(grammarAccess.getCityAccess().getIndepsPoliticianParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__City__IndepsAssignment_7_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCityAccess().getIndepsPoliticianParserRuleCall_7_1_0()); }
	rulePolitician{ after(grammarAccess.getCityAccess().getIndepsPoliticianParserRuleCall_7_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Party__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPartyAccess().getNameSTRINGTerminalRuleCall_1_0()); }
	RULE_STRING{ after(grammarAccess.getPartyAccess().getNameSTRINGTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Party__AcronymAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPartyAccess().getAcronymSTRINGTerminalRuleCall_4_0()); }
	RULE_STRING{ after(grammarAccess.getPartyAccess().getAcronymSTRINGTerminalRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Party__PresidentAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPartyAccess().getPresidentPoliticianCrossReference_6_0()); }
(
{ before(grammarAccess.getPartyAccess().getPresidentPoliticianIDTerminalRuleCall_6_0_1()); }
	RULE_ID{ after(grammarAccess.getPartyAccess().getPresidentPoliticianIDTerminalRuleCall_6_0_1()); }
)
{ after(grammarAccess.getPartyAccess().getPresidentPoliticianCrossReference_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Party__PolsAssignment_9
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPartyAccess().getPolsPoliticianParserRuleCall_9_0()); }
	rulePolitician{ after(grammarAccess.getPartyAccess().getPolsPoliticianParserRuleCall_9_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Party__PolsAssignment_10_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPartyAccess().getPolsPoliticianParserRuleCall_10_1_0()); }
	rulePolitician{ after(grammarAccess.getPartyAccess().getPolsPoliticianParserRuleCall_10_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Politician_Impl__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPolitician_ImplAccess().getNameSTRINGTerminalRuleCall_1_0()); }
	RULE_STRING{ after(grammarAccess.getPolitician_ImplAccess().getNameSTRINGTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Politician_Impl__AgeAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPolitician_ImplAccess().getAgeINTTerminalRuleCall_4_0()); }
	RULE_INT{ after(grammarAccess.getPolitician_ImplAccess().getAgeINTTerminalRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Politician_Impl__SexAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPolitician_ImplAccess().getSexSTRINGTerminalRuleCall_6_0()); }
	RULE_STRING{ after(grammarAccess.getPolitician_ImplAccess().getSexSTRINGTerminalRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOffice__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPublicOfficeAccess().getNameSTRINGTerminalRuleCall_1_0()); }
	RULE_STRING{ after(grammarAccess.getPublicOfficeAccess().getNameSTRINGTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOffice__AgeAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPublicOfficeAccess().getAgeINTTerminalRuleCall_4_0()); }
	RULE_INT{ after(grammarAccess.getPublicOfficeAccess().getAgeINTTerminalRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOffice__SexAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPublicOfficeAccess().getSexSTRINGTerminalRuleCall_6_0()); }
	RULE_STRING{ after(grammarAccess.getPublicOfficeAccess().getSexSTRINGTerminalRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PublicOffice__InstNameAssignment_8
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPublicOfficeAccess().getInstNameSTRINGTerminalRuleCall_8_0()); }
	RULE_STRING{ after(grammarAccess.getPublicOfficeAccess().getInstNameSTRINGTerminalRuleCall_8_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


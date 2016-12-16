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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPBiDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'City'", "'{'", "'indeps'", "'}'", "'parties'", "','", "'Party'", "'acronym'", "'president'", "'pols'", "'['", "']'", "'Politician'", "'age'", "'sex'", "'PublicOffice'", "'instName'"
    };
    public static final int RULE_ID=5;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalPBiDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPBiDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPBiDslParser.tokenNames; }
    public String getGrammarFileName() { return "../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g"; }


     
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




    // $ANTLR start "entryRuleCity"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:60:1: entryRuleCity : ruleCity EOF ;
    public final void entryRuleCity() throws RecognitionException {
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:61:1: ( ruleCity EOF )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:62:1: ruleCity EOF
            {
             before(grammarAccess.getCityRule()); 
            pushFollow(FOLLOW_ruleCity_in_entryRuleCity61);
            ruleCity();

            state._fsp--;

             after(grammarAccess.getCityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCity68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCity"


    // $ANTLR start "ruleCity"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:69:1: ruleCity : ( ( rule__City__Group__0 ) ) ;
    public final void ruleCity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:73:2: ( ( ( rule__City__Group__0 ) ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:74:1: ( ( rule__City__Group__0 ) )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:74:1: ( ( rule__City__Group__0 ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:75:1: ( rule__City__Group__0 )
            {
             before(grammarAccess.getCityAccess().getGroup()); 
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:76:1: ( rule__City__Group__0 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:76:2: rule__City__Group__0
            {
            pushFollow(FOLLOW_rule__City__Group__0_in_ruleCity94);
            rule__City__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCity"


    // $ANTLR start "entryRuleParty"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:88:1: entryRuleParty : ruleParty EOF ;
    public final void entryRuleParty() throws RecognitionException {
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:89:1: ( ruleParty EOF )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:90:1: ruleParty EOF
            {
             before(grammarAccess.getPartyRule()); 
            pushFollow(FOLLOW_ruleParty_in_entryRuleParty121);
            ruleParty();

            state._fsp--;

             after(grammarAccess.getPartyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParty128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParty"


    // $ANTLR start "ruleParty"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:97:1: ruleParty : ( ( rule__Party__Group__0 ) ) ;
    public final void ruleParty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:101:2: ( ( ( rule__Party__Group__0 ) ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:102:1: ( ( rule__Party__Group__0 ) )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:102:1: ( ( rule__Party__Group__0 ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:103:1: ( rule__Party__Group__0 )
            {
             before(grammarAccess.getPartyAccess().getGroup()); 
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:104:1: ( rule__Party__Group__0 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:104:2: rule__Party__Group__0
            {
            pushFollow(FOLLOW_rule__Party__Group__0_in_ruleParty154);
            rule__Party__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPartyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParty"


    // $ANTLR start "entryRulePolitician"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:116:1: entryRulePolitician : rulePolitician EOF ;
    public final void entryRulePolitician() throws RecognitionException {
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:117:1: ( rulePolitician EOF )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:118:1: rulePolitician EOF
            {
             before(grammarAccess.getPoliticianRule()); 
            pushFollow(FOLLOW_rulePolitician_in_entryRulePolitician181);
            rulePolitician();

            state._fsp--;

             after(grammarAccess.getPoliticianRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePolitician188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePolitician"


    // $ANTLR start "rulePolitician"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:125:1: rulePolitician : ( ( rule__Politician__Alternatives ) ) ;
    public final void rulePolitician() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:129:2: ( ( ( rule__Politician__Alternatives ) ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:130:1: ( ( rule__Politician__Alternatives ) )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:130:1: ( ( rule__Politician__Alternatives ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:131:1: ( rule__Politician__Alternatives )
            {
             before(grammarAccess.getPoliticianAccess().getAlternatives()); 
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:132:1: ( rule__Politician__Alternatives )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:132:2: rule__Politician__Alternatives
            {
            pushFollow(FOLLOW_rule__Politician__Alternatives_in_rulePolitician214);
            rule__Politician__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPoliticianAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePolitician"


    // $ANTLR start "entryRulePolitician_Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:144:1: entryRulePolitician_Impl : rulePolitician_Impl EOF ;
    public final void entryRulePolitician_Impl() throws RecognitionException {
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:145:1: ( rulePolitician_Impl EOF )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:146:1: rulePolitician_Impl EOF
            {
             before(grammarAccess.getPolitician_ImplRule()); 
            pushFollow(FOLLOW_rulePolitician_Impl_in_entryRulePolitician_Impl241);
            rulePolitician_Impl();

            state._fsp--;

             after(grammarAccess.getPolitician_ImplRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePolitician_Impl248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePolitician_Impl"


    // $ANTLR start "rulePolitician_Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:153:1: rulePolitician_Impl : ( ( rule__Politician_Impl__Group__0 ) ) ;
    public final void rulePolitician_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:157:2: ( ( ( rule__Politician_Impl__Group__0 ) ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:158:1: ( ( rule__Politician_Impl__Group__0 ) )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:158:1: ( ( rule__Politician_Impl__Group__0 ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:159:1: ( rule__Politician_Impl__Group__0 )
            {
             before(grammarAccess.getPolitician_ImplAccess().getGroup()); 
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:160:1: ( rule__Politician_Impl__Group__0 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:160:2: rule__Politician_Impl__Group__0
            {
            pushFollow(FOLLOW_rule__Politician_Impl__Group__0_in_rulePolitician_Impl274);
            rule__Politician_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPolitician_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePolitician_Impl"


    // $ANTLR start "entryRulePublicOffice"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:172:1: entryRulePublicOffice : rulePublicOffice EOF ;
    public final void entryRulePublicOffice() throws RecognitionException {
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:173:1: ( rulePublicOffice EOF )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:174:1: rulePublicOffice EOF
            {
             before(grammarAccess.getPublicOfficeRule()); 
            pushFollow(FOLLOW_rulePublicOffice_in_entryRulePublicOffice301);
            rulePublicOffice();

            state._fsp--;

             after(grammarAccess.getPublicOfficeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePublicOffice308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePublicOffice"


    // $ANTLR start "rulePublicOffice"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:181:1: rulePublicOffice : ( ( rule__PublicOffice__Group__0 ) ) ;
    public final void rulePublicOffice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:185:2: ( ( ( rule__PublicOffice__Group__0 ) ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:186:1: ( ( rule__PublicOffice__Group__0 ) )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:186:1: ( ( rule__PublicOffice__Group__0 ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:187:1: ( rule__PublicOffice__Group__0 )
            {
             before(grammarAccess.getPublicOfficeAccess().getGroup()); 
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:188:1: ( rule__PublicOffice__Group__0 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:188:2: rule__PublicOffice__Group__0
            {
            pushFollow(FOLLOW_rule__PublicOffice__Group__0_in_rulePublicOffice334);
            rule__PublicOffice__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPublicOfficeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePublicOffice"


    // $ANTLR start "rule__Politician__Alternatives"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:200:1: rule__Politician__Alternatives : ( ( rulePolitician_Impl ) | ( rulePublicOffice ) );
    public final void rule__Politician__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:204:1: ( ( rulePolitician_Impl ) | ( rulePublicOffice ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==23) ) {
                alt1=1;
            }
            else if ( (LA1_0==26) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:205:1: ( rulePolitician_Impl )
                    {
                    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:205:1: ( rulePolitician_Impl )
                    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:206:1: rulePolitician_Impl
                    {
                     before(grammarAccess.getPoliticianAccess().getPolitician_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePolitician_Impl_in_rule__Politician__Alternatives370);
                    rulePolitician_Impl();

                    state._fsp--;

                     after(grammarAccess.getPoliticianAccess().getPolitician_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:211:6: ( rulePublicOffice )
                    {
                    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:211:6: ( rulePublicOffice )
                    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:212:1: rulePublicOffice
                    {
                     before(grammarAccess.getPoliticianAccess().getPublicOfficeParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePublicOffice_in_rule__Politician__Alternatives387);
                    rulePublicOffice();

                    state._fsp--;

                     after(grammarAccess.getPoliticianAccess().getPublicOfficeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Politician__Alternatives"


    // $ANTLR start "rule__City__Group__0"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:224:1: rule__City__Group__0 : rule__City__Group__0__Impl rule__City__Group__1 ;
    public final void rule__City__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:228:1: ( rule__City__Group__0__Impl rule__City__Group__1 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:229:2: rule__City__Group__0__Impl rule__City__Group__1
            {
            pushFollow(FOLLOW_rule__City__Group__0__Impl_in_rule__City__Group__0417);
            rule__City__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__City__Group__1_in_rule__City__Group__0420);
            rule__City__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__0"


    // $ANTLR start "rule__City__Group__0__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:236:1: rule__City__Group__0__Impl : ( 'City' ) ;
    public final void rule__City__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:240:1: ( ( 'City' ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:241:1: ( 'City' )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:241:1: ( 'City' )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:242:1: 'City'
            {
             before(grammarAccess.getCityAccess().getCityKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__City__Group__0__Impl448); 
             after(grammarAccess.getCityAccess().getCityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__0__Impl"


    // $ANTLR start "rule__City__Group__1"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:255:1: rule__City__Group__1 : rule__City__Group__1__Impl rule__City__Group__2 ;
    public final void rule__City__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:259:1: ( rule__City__Group__1__Impl rule__City__Group__2 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:260:2: rule__City__Group__1__Impl rule__City__Group__2
            {
            pushFollow(FOLLOW_rule__City__Group__1__Impl_in_rule__City__Group__1479);
            rule__City__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__City__Group__2_in_rule__City__Group__1482);
            rule__City__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__1"


    // $ANTLR start "rule__City__Group__1__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:267:1: rule__City__Group__1__Impl : ( ( rule__City__NameAssignment_1 ) ) ;
    public final void rule__City__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:271:1: ( ( ( rule__City__NameAssignment_1 ) ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:272:1: ( ( rule__City__NameAssignment_1 ) )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:272:1: ( ( rule__City__NameAssignment_1 ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:273:1: ( rule__City__NameAssignment_1 )
            {
             before(grammarAccess.getCityAccess().getNameAssignment_1()); 
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:274:1: ( rule__City__NameAssignment_1 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:274:2: rule__City__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__City__NameAssignment_1_in_rule__City__Group__1__Impl509);
            rule__City__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__1__Impl"


    // $ANTLR start "rule__City__Group__2"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:284:1: rule__City__Group__2 : rule__City__Group__2__Impl rule__City__Group__3 ;
    public final void rule__City__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:288:1: ( rule__City__Group__2__Impl rule__City__Group__3 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:289:2: rule__City__Group__2__Impl rule__City__Group__3
            {
            pushFollow(FOLLOW_rule__City__Group__2__Impl_in_rule__City__Group__2539);
            rule__City__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__City__Group__3_in_rule__City__Group__2542);
            rule__City__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__2"


    // $ANTLR start "rule__City__Group__2__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:296:1: rule__City__Group__2__Impl : ( '{' ) ;
    public final void rule__City__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:300:1: ( ( '{' ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:301:1: ( '{' )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:301:1: ( '{' )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:302:1: '{'
            {
             before(grammarAccess.getCityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__City__Group__2__Impl570); 
             after(grammarAccess.getCityAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__2__Impl"


    // $ANTLR start "rule__City__Group__3"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:315:1: rule__City__Group__3 : rule__City__Group__3__Impl rule__City__Group__4 ;
    public final void rule__City__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:319:1: ( rule__City__Group__3__Impl rule__City__Group__4 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:320:2: rule__City__Group__3__Impl rule__City__Group__4
            {
            pushFollow(FOLLOW_rule__City__Group__3__Impl_in_rule__City__Group__3601);
            rule__City__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__City__Group__4_in_rule__City__Group__3604);
            rule__City__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__3"


    // $ANTLR start "rule__City__Group__3__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:327:1: rule__City__Group__3__Impl : ( ( rule__City__Group_3__0 )? ) ;
    public final void rule__City__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:331:1: ( ( ( rule__City__Group_3__0 )? ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:332:1: ( ( rule__City__Group_3__0 )? )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:332:1: ( ( rule__City__Group_3__0 )? )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:333:1: ( rule__City__Group_3__0 )?
            {
             before(grammarAccess.getCityAccess().getGroup_3()); 
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:334:1: ( rule__City__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:334:2: rule__City__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__City__Group_3__0_in_rule__City__Group__3__Impl631);
                    rule__City__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCityAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__3__Impl"


    // $ANTLR start "rule__City__Group__4"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:344:1: rule__City__Group__4 : rule__City__Group__4__Impl rule__City__Group__5 ;
    public final void rule__City__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:348:1: ( rule__City__Group__4__Impl rule__City__Group__5 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:349:2: rule__City__Group__4__Impl rule__City__Group__5
            {
            pushFollow(FOLLOW_rule__City__Group__4__Impl_in_rule__City__Group__4662);
            rule__City__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__City__Group__5_in_rule__City__Group__4665);
            rule__City__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__4"


    // $ANTLR start "rule__City__Group__4__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:356:1: rule__City__Group__4__Impl : ( 'indeps' ) ;
    public final void rule__City__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:360:1: ( ( 'indeps' ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:361:1: ( 'indeps' )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:361:1: ( 'indeps' )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:362:1: 'indeps'
            {
             before(grammarAccess.getCityAccess().getIndepsKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__City__Group__4__Impl693); 
             after(grammarAccess.getCityAccess().getIndepsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__4__Impl"


    // $ANTLR start "rule__City__Group__5"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:375:1: rule__City__Group__5 : rule__City__Group__5__Impl rule__City__Group__6 ;
    public final void rule__City__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:379:1: ( rule__City__Group__5__Impl rule__City__Group__6 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:380:2: rule__City__Group__5__Impl rule__City__Group__6
            {
            pushFollow(FOLLOW_rule__City__Group__5__Impl_in_rule__City__Group__5724);
            rule__City__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__City__Group__6_in_rule__City__Group__5727);
            rule__City__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__5"


    // $ANTLR start "rule__City__Group__5__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:387:1: rule__City__Group__5__Impl : ( '{' ) ;
    public final void rule__City__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:391:1: ( ( '{' ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:392:1: ( '{' )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:392:1: ( '{' )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:393:1: '{'
            {
             before(grammarAccess.getCityAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,12,FOLLOW_12_in_rule__City__Group__5__Impl755); 
             after(grammarAccess.getCityAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__5__Impl"


    // $ANTLR start "rule__City__Group__6"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:406:1: rule__City__Group__6 : rule__City__Group__6__Impl rule__City__Group__7 ;
    public final void rule__City__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:410:1: ( rule__City__Group__6__Impl rule__City__Group__7 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:411:2: rule__City__Group__6__Impl rule__City__Group__7
            {
            pushFollow(FOLLOW_rule__City__Group__6__Impl_in_rule__City__Group__6786);
            rule__City__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__City__Group__7_in_rule__City__Group__6789);
            rule__City__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__6"


    // $ANTLR start "rule__City__Group__6__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:418:1: rule__City__Group__6__Impl : ( ( rule__City__IndepsAssignment_6 ) ) ;
    public final void rule__City__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:422:1: ( ( ( rule__City__IndepsAssignment_6 ) ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:423:1: ( ( rule__City__IndepsAssignment_6 ) )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:423:1: ( ( rule__City__IndepsAssignment_6 ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:424:1: ( rule__City__IndepsAssignment_6 )
            {
             before(grammarAccess.getCityAccess().getIndepsAssignment_6()); 
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:425:1: ( rule__City__IndepsAssignment_6 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:425:2: rule__City__IndepsAssignment_6
            {
            pushFollow(FOLLOW_rule__City__IndepsAssignment_6_in_rule__City__Group__6__Impl816);
            rule__City__IndepsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCityAccess().getIndepsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__6__Impl"


    // $ANTLR start "rule__City__Group__7"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:435:1: rule__City__Group__7 : rule__City__Group__7__Impl rule__City__Group__8 ;
    public final void rule__City__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:439:1: ( rule__City__Group__7__Impl rule__City__Group__8 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:440:2: rule__City__Group__7__Impl rule__City__Group__8
            {
            pushFollow(FOLLOW_rule__City__Group__7__Impl_in_rule__City__Group__7846);
            rule__City__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__City__Group__8_in_rule__City__Group__7849);
            rule__City__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__7"


    // $ANTLR start "rule__City__Group__7__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:447:1: rule__City__Group__7__Impl : ( ( rule__City__Group_7__0 )* ) ;
    public final void rule__City__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:451:1: ( ( ( rule__City__Group_7__0 )* ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:452:1: ( ( rule__City__Group_7__0 )* )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:452:1: ( ( rule__City__Group_7__0 )* )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:453:1: ( rule__City__Group_7__0 )*
            {
             before(grammarAccess.getCityAccess().getGroup_7()); 
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:454:1: ( rule__City__Group_7__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:454:2: rule__City__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__City__Group_7__0_in_rule__City__Group__7__Impl876);
            	    rule__City__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getCityAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__7__Impl"


    // $ANTLR start "rule__City__Group__8"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:464:1: rule__City__Group__8 : rule__City__Group__8__Impl rule__City__Group__9 ;
    public final void rule__City__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:468:1: ( rule__City__Group__8__Impl rule__City__Group__9 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:469:2: rule__City__Group__8__Impl rule__City__Group__9
            {
            pushFollow(FOLLOW_rule__City__Group__8__Impl_in_rule__City__Group__8907);
            rule__City__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__City__Group__9_in_rule__City__Group__8910);
            rule__City__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__8"


    // $ANTLR start "rule__City__Group__8__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:476:1: rule__City__Group__8__Impl : ( '}' ) ;
    public final void rule__City__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:480:1: ( ( '}' ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:481:1: ( '}' )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:481:1: ( '}' )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:482:1: '}'
            {
             before(grammarAccess.getCityAccess().getRightCurlyBracketKeyword_8()); 
            match(input,14,FOLLOW_14_in_rule__City__Group__8__Impl938); 
             after(grammarAccess.getCityAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__8__Impl"


    // $ANTLR start "rule__City__Group__9"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:495:1: rule__City__Group__9 : rule__City__Group__9__Impl ;
    public final void rule__City__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:499:1: ( rule__City__Group__9__Impl )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:500:2: rule__City__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__City__Group__9__Impl_in_rule__City__Group__9969);
            rule__City__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__9"


    // $ANTLR start "rule__City__Group__9__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:506:1: rule__City__Group__9__Impl : ( '}' ) ;
    public final void rule__City__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:510:1: ( ( '}' ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:511:1: ( '}' )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:511:1: ( '}' )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:512:1: '}'
            {
             before(grammarAccess.getCityAccess().getRightCurlyBracketKeyword_9()); 
            match(input,14,FOLLOW_14_in_rule__City__Group__9__Impl997); 
             after(grammarAccess.getCityAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__9__Impl"


    // $ANTLR start "rule__City__Group_3__0"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:545:1: rule__City__Group_3__0 : rule__City__Group_3__0__Impl rule__City__Group_3__1 ;
    public final void rule__City__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:549:1: ( rule__City__Group_3__0__Impl rule__City__Group_3__1 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:550:2: rule__City__Group_3__0__Impl rule__City__Group_3__1
            {
            pushFollow(FOLLOW_rule__City__Group_3__0__Impl_in_rule__City__Group_3__01048);
            rule__City__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__City__Group_3__1_in_rule__City__Group_3__01051);
            rule__City__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_3__0"


    // $ANTLR start "rule__City__Group_3__0__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:557:1: rule__City__Group_3__0__Impl : ( 'parties' ) ;
    public final void rule__City__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:561:1: ( ( 'parties' ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:562:1: ( 'parties' )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:562:1: ( 'parties' )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:563:1: 'parties'
            {
             before(grammarAccess.getCityAccess().getPartiesKeyword_3_0()); 
            match(input,15,FOLLOW_15_in_rule__City__Group_3__0__Impl1079); 
             after(grammarAccess.getCityAccess().getPartiesKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_3__0__Impl"


    // $ANTLR start "rule__City__Group_3__1"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:576:1: rule__City__Group_3__1 : rule__City__Group_3__1__Impl rule__City__Group_3__2 ;
    public final void rule__City__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:580:1: ( rule__City__Group_3__1__Impl rule__City__Group_3__2 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:581:2: rule__City__Group_3__1__Impl rule__City__Group_3__2
            {
            pushFollow(FOLLOW_rule__City__Group_3__1__Impl_in_rule__City__Group_3__11110);
            rule__City__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__City__Group_3__2_in_rule__City__Group_3__11113);
            rule__City__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_3__1"


    // $ANTLR start "rule__City__Group_3__1__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:588:1: rule__City__Group_3__1__Impl : ( '{' ) ;
    public final void rule__City__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:592:1: ( ( '{' ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:593:1: ( '{' )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:593:1: ( '{' )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:594:1: '{'
            {
             before(grammarAccess.getCityAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,12,FOLLOW_12_in_rule__City__Group_3__1__Impl1141); 
             after(grammarAccess.getCityAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_3__1__Impl"


    // $ANTLR start "rule__City__Group_3__2"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:607:1: rule__City__Group_3__2 : rule__City__Group_3__2__Impl rule__City__Group_3__3 ;
    public final void rule__City__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:611:1: ( rule__City__Group_3__2__Impl rule__City__Group_3__3 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:612:2: rule__City__Group_3__2__Impl rule__City__Group_3__3
            {
            pushFollow(FOLLOW_rule__City__Group_3__2__Impl_in_rule__City__Group_3__21172);
            rule__City__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__City__Group_3__3_in_rule__City__Group_3__21175);
            rule__City__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_3__2"


    // $ANTLR start "rule__City__Group_3__2__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:619:1: rule__City__Group_3__2__Impl : ( ( rule__City__PartiesAssignment_3_2 ) ) ;
    public final void rule__City__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:623:1: ( ( ( rule__City__PartiesAssignment_3_2 ) ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:624:1: ( ( rule__City__PartiesAssignment_3_2 ) )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:624:1: ( ( rule__City__PartiesAssignment_3_2 ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:625:1: ( rule__City__PartiesAssignment_3_2 )
            {
             before(grammarAccess.getCityAccess().getPartiesAssignment_3_2()); 
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:626:1: ( rule__City__PartiesAssignment_3_2 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:626:2: rule__City__PartiesAssignment_3_2
            {
            pushFollow(FOLLOW_rule__City__PartiesAssignment_3_2_in_rule__City__Group_3__2__Impl1202);
            rule__City__PartiesAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getCityAccess().getPartiesAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_3__2__Impl"


    // $ANTLR start "rule__City__Group_3__3"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:636:1: rule__City__Group_3__3 : rule__City__Group_3__3__Impl rule__City__Group_3__4 ;
    public final void rule__City__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:640:1: ( rule__City__Group_3__3__Impl rule__City__Group_3__4 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:641:2: rule__City__Group_3__3__Impl rule__City__Group_3__4
            {
            pushFollow(FOLLOW_rule__City__Group_3__3__Impl_in_rule__City__Group_3__31232);
            rule__City__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__City__Group_3__4_in_rule__City__Group_3__31235);
            rule__City__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_3__3"


    // $ANTLR start "rule__City__Group_3__3__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:648:1: rule__City__Group_3__3__Impl : ( ( rule__City__Group_3_3__0 )* ) ;
    public final void rule__City__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:652:1: ( ( ( rule__City__Group_3_3__0 )* ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:653:1: ( ( rule__City__Group_3_3__0 )* )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:653:1: ( ( rule__City__Group_3_3__0 )* )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:654:1: ( rule__City__Group_3_3__0 )*
            {
             before(grammarAccess.getCityAccess().getGroup_3_3()); 
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:655:1: ( rule__City__Group_3_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:655:2: rule__City__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_rule__City__Group_3_3__0_in_rule__City__Group_3__3__Impl1262);
            	    rule__City__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getCityAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_3__3__Impl"


    // $ANTLR start "rule__City__Group_3__4"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:665:1: rule__City__Group_3__4 : rule__City__Group_3__4__Impl ;
    public final void rule__City__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:669:1: ( rule__City__Group_3__4__Impl )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:670:2: rule__City__Group_3__4__Impl
            {
            pushFollow(FOLLOW_rule__City__Group_3__4__Impl_in_rule__City__Group_3__41293);
            rule__City__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_3__4"


    // $ANTLR start "rule__City__Group_3__4__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:676:1: rule__City__Group_3__4__Impl : ( '}' ) ;
    public final void rule__City__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:680:1: ( ( '}' ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:681:1: ( '}' )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:681:1: ( '}' )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:682:1: '}'
            {
             before(grammarAccess.getCityAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,14,FOLLOW_14_in_rule__City__Group_3__4__Impl1321); 
             after(grammarAccess.getCityAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_3__4__Impl"


    // $ANTLR start "rule__City__Group_3_3__0"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:705:1: rule__City__Group_3_3__0 : rule__City__Group_3_3__0__Impl rule__City__Group_3_3__1 ;
    public final void rule__City__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:709:1: ( rule__City__Group_3_3__0__Impl rule__City__Group_3_3__1 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:710:2: rule__City__Group_3_3__0__Impl rule__City__Group_3_3__1
            {
            pushFollow(FOLLOW_rule__City__Group_3_3__0__Impl_in_rule__City__Group_3_3__01362);
            rule__City__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__City__Group_3_3__1_in_rule__City__Group_3_3__01365);
            rule__City__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_3_3__0"


    // $ANTLR start "rule__City__Group_3_3__0__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:717:1: rule__City__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__City__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:721:1: ( ( ',' ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:722:1: ( ',' )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:722:1: ( ',' )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:723:1: ','
            {
             before(grammarAccess.getCityAccess().getCommaKeyword_3_3_0()); 
            match(input,16,FOLLOW_16_in_rule__City__Group_3_3__0__Impl1393); 
             after(grammarAccess.getCityAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_3_3__0__Impl"


    // $ANTLR start "rule__City__Group_3_3__1"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:736:1: rule__City__Group_3_3__1 : rule__City__Group_3_3__1__Impl ;
    public final void rule__City__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:740:1: ( rule__City__Group_3_3__1__Impl )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:741:2: rule__City__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_rule__City__Group_3_3__1__Impl_in_rule__City__Group_3_3__11424);
            rule__City__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_3_3__1"


    // $ANTLR start "rule__City__Group_3_3__1__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:747:1: rule__City__Group_3_3__1__Impl : ( ( rule__City__PartiesAssignment_3_3_1 ) ) ;
    public final void rule__City__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:751:1: ( ( ( rule__City__PartiesAssignment_3_3_1 ) ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:752:1: ( ( rule__City__PartiesAssignment_3_3_1 ) )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:752:1: ( ( rule__City__PartiesAssignment_3_3_1 ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:753:1: ( rule__City__PartiesAssignment_3_3_1 )
            {
             before(grammarAccess.getCityAccess().getPartiesAssignment_3_3_1()); 
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:754:1: ( rule__City__PartiesAssignment_3_3_1 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:754:2: rule__City__PartiesAssignment_3_3_1
            {
            pushFollow(FOLLOW_rule__City__PartiesAssignment_3_3_1_in_rule__City__Group_3_3__1__Impl1451);
            rule__City__PartiesAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCityAccess().getPartiesAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_3_3__1__Impl"


    // $ANTLR start "rule__City__Group_7__0"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:768:1: rule__City__Group_7__0 : rule__City__Group_7__0__Impl rule__City__Group_7__1 ;
    public final void rule__City__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:772:1: ( rule__City__Group_7__0__Impl rule__City__Group_7__1 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:773:2: rule__City__Group_7__0__Impl rule__City__Group_7__1
            {
            pushFollow(FOLLOW_rule__City__Group_7__0__Impl_in_rule__City__Group_7__01485);
            rule__City__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__City__Group_7__1_in_rule__City__Group_7__01488);
            rule__City__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_7__0"


    // $ANTLR start "rule__City__Group_7__0__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:780:1: rule__City__Group_7__0__Impl : ( ',' ) ;
    public final void rule__City__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:784:1: ( ( ',' ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:785:1: ( ',' )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:785:1: ( ',' )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:786:1: ','
            {
             before(grammarAccess.getCityAccess().getCommaKeyword_7_0()); 
            match(input,16,FOLLOW_16_in_rule__City__Group_7__0__Impl1516); 
             after(grammarAccess.getCityAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_7__0__Impl"


    // $ANTLR start "rule__City__Group_7__1"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:799:1: rule__City__Group_7__1 : rule__City__Group_7__1__Impl ;
    public final void rule__City__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:803:1: ( rule__City__Group_7__1__Impl )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:804:2: rule__City__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__City__Group_7__1__Impl_in_rule__City__Group_7__11547);
            rule__City__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_7__1"


    // $ANTLR start "rule__City__Group_7__1__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:810:1: rule__City__Group_7__1__Impl : ( ( rule__City__IndepsAssignment_7_1 ) ) ;
    public final void rule__City__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:814:1: ( ( ( rule__City__IndepsAssignment_7_1 ) ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:815:1: ( ( rule__City__IndepsAssignment_7_1 ) )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:815:1: ( ( rule__City__IndepsAssignment_7_1 ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:816:1: ( rule__City__IndepsAssignment_7_1 )
            {
             before(grammarAccess.getCityAccess().getIndepsAssignment_7_1()); 
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:817:1: ( rule__City__IndepsAssignment_7_1 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:817:2: rule__City__IndepsAssignment_7_1
            {
            pushFollow(FOLLOW_rule__City__IndepsAssignment_7_1_in_rule__City__Group_7__1__Impl1574);
            rule__City__IndepsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getCityAccess().getIndepsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_7__1__Impl"


    // $ANTLR start "rule__Party__Group__0"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:831:1: rule__Party__Group__0 : rule__Party__Group__0__Impl rule__Party__Group__1 ;
    public final void rule__Party__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:835:1: ( rule__Party__Group__0__Impl rule__Party__Group__1 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:836:2: rule__Party__Group__0__Impl rule__Party__Group__1
            {
            pushFollow(FOLLOW_rule__Party__Group__0__Impl_in_rule__Party__Group__01608);
            rule__Party__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Party__Group__1_in_rule__Party__Group__01611);
            rule__Party__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__0"


    // $ANTLR start "rule__Party__Group__0__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:843:1: rule__Party__Group__0__Impl : ( 'Party' ) ;
    public final void rule__Party__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:847:1: ( ( 'Party' ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:848:1: ( 'Party' )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:848:1: ( 'Party' )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:849:1: 'Party'
            {
             before(grammarAccess.getPartyAccess().getPartyKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Party__Group__0__Impl1639); 
             after(grammarAccess.getPartyAccess().getPartyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__0__Impl"


    // $ANTLR start "rule__Party__Group__1"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:862:1: rule__Party__Group__1 : rule__Party__Group__1__Impl rule__Party__Group__2 ;
    public final void rule__Party__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:866:1: ( rule__Party__Group__1__Impl rule__Party__Group__2 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:867:2: rule__Party__Group__1__Impl rule__Party__Group__2
            {
            pushFollow(FOLLOW_rule__Party__Group__1__Impl_in_rule__Party__Group__11670);
            rule__Party__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Party__Group__2_in_rule__Party__Group__11673);
            rule__Party__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__1"


    // $ANTLR start "rule__Party__Group__1__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:874:1: rule__Party__Group__1__Impl : ( ( rule__Party__NameAssignment_1 ) ) ;
    public final void rule__Party__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:878:1: ( ( ( rule__Party__NameAssignment_1 ) ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:879:1: ( ( rule__Party__NameAssignment_1 ) )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:879:1: ( ( rule__Party__NameAssignment_1 ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:880:1: ( rule__Party__NameAssignment_1 )
            {
             before(grammarAccess.getPartyAccess().getNameAssignment_1()); 
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:881:1: ( rule__Party__NameAssignment_1 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:881:2: rule__Party__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Party__NameAssignment_1_in_rule__Party__Group__1__Impl1700);
            rule__Party__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPartyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__1__Impl"


    // $ANTLR start "rule__Party__Group__2"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:891:1: rule__Party__Group__2 : rule__Party__Group__2__Impl rule__Party__Group__3 ;
    public final void rule__Party__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:895:1: ( rule__Party__Group__2__Impl rule__Party__Group__3 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:896:2: rule__Party__Group__2__Impl rule__Party__Group__3
            {
            pushFollow(FOLLOW_rule__Party__Group__2__Impl_in_rule__Party__Group__21730);
            rule__Party__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Party__Group__3_in_rule__Party__Group__21733);
            rule__Party__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__2"


    // $ANTLR start "rule__Party__Group__2__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:903:1: rule__Party__Group__2__Impl : ( '{' ) ;
    public final void rule__Party__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:907:1: ( ( '{' ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:908:1: ( '{' )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:908:1: ( '{' )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:909:1: '{'
            {
             before(grammarAccess.getPartyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Party__Group__2__Impl1761); 
             after(grammarAccess.getPartyAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__2__Impl"


    // $ANTLR start "rule__Party__Group__3"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:922:1: rule__Party__Group__3 : rule__Party__Group__3__Impl rule__Party__Group__4 ;
    public final void rule__Party__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:926:1: ( rule__Party__Group__3__Impl rule__Party__Group__4 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:927:2: rule__Party__Group__3__Impl rule__Party__Group__4
            {
            pushFollow(FOLLOW_rule__Party__Group__3__Impl_in_rule__Party__Group__31792);
            rule__Party__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Party__Group__4_in_rule__Party__Group__31795);
            rule__Party__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__3"


    // $ANTLR start "rule__Party__Group__3__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:934:1: rule__Party__Group__3__Impl : ( 'acronym' ) ;
    public final void rule__Party__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:938:1: ( ( 'acronym' ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:939:1: ( 'acronym' )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:939:1: ( 'acronym' )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:940:1: 'acronym'
            {
             before(grammarAccess.getPartyAccess().getAcronymKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__Party__Group__3__Impl1823); 
             after(grammarAccess.getPartyAccess().getAcronymKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__3__Impl"


    // $ANTLR start "rule__Party__Group__4"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:953:1: rule__Party__Group__4 : rule__Party__Group__4__Impl rule__Party__Group__5 ;
    public final void rule__Party__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:957:1: ( rule__Party__Group__4__Impl rule__Party__Group__5 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:958:2: rule__Party__Group__4__Impl rule__Party__Group__5
            {
            pushFollow(FOLLOW_rule__Party__Group__4__Impl_in_rule__Party__Group__41854);
            rule__Party__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Party__Group__5_in_rule__Party__Group__41857);
            rule__Party__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__4"


    // $ANTLR start "rule__Party__Group__4__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:965:1: rule__Party__Group__4__Impl : ( ( rule__Party__AcronymAssignment_4 ) ) ;
    public final void rule__Party__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:969:1: ( ( ( rule__Party__AcronymAssignment_4 ) ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:970:1: ( ( rule__Party__AcronymAssignment_4 ) )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:970:1: ( ( rule__Party__AcronymAssignment_4 ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:971:1: ( rule__Party__AcronymAssignment_4 )
            {
             before(grammarAccess.getPartyAccess().getAcronymAssignment_4()); 
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:972:1: ( rule__Party__AcronymAssignment_4 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:972:2: rule__Party__AcronymAssignment_4
            {
            pushFollow(FOLLOW_rule__Party__AcronymAssignment_4_in_rule__Party__Group__4__Impl1884);
            rule__Party__AcronymAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPartyAccess().getAcronymAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__4__Impl"


    // $ANTLR start "rule__Party__Group__5"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:982:1: rule__Party__Group__5 : rule__Party__Group__5__Impl rule__Party__Group__6 ;
    public final void rule__Party__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:986:1: ( rule__Party__Group__5__Impl rule__Party__Group__6 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:987:2: rule__Party__Group__5__Impl rule__Party__Group__6
            {
            pushFollow(FOLLOW_rule__Party__Group__5__Impl_in_rule__Party__Group__51914);
            rule__Party__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Party__Group__6_in_rule__Party__Group__51917);
            rule__Party__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__5"


    // $ANTLR start "rule__Party__Group__5__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:994:1: rule__Party__Group__5__Impl : ( 'president' ) ;
    public final void rule__Party__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:998:1: ( ( 'president' ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:999:1: ( 'president' )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:999:1: ( 'president' )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1000:1: 'president'
            {
             before(grammarAccess.getPartyAccess().getPresidentKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__Party__Group__5__Impl1945); 
             after(grammarAccess.getPartyAccess().getPresidentKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__5__Impl"


    // $ANTLR start "rule__Party__Group__6"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1013:1: rule__Party__Group__6 : rule__Party__Group__6__Impl rule__Party__Group__7 ;
    public final void rule__Party__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1017:1: ( rule__Party__Group__6__Impl rule__Party__Group__7 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1018:2: rule__Party__Group__6__Impl rule__Party__Group__7
            {
            pushFollow(FOLLOW_rule__Party__Group__6__Impl_in_rule__Party__Group__61976);
            rule__Party__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Party__Group__7_in_rule__Party__Group__61979);
            rule__Party__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__6"


    // $ANTLR start "rule__Party__Group__6__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1025:1: rule__Party__Group__6__Impl : ( ( rule__Party__PresidentAssignment_6 ) ) ;
    public final void rule__Party__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1029:1: ( ( ( rule__Party__PresidentAssignment_6 ) ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1030:1: ( ( rule__Party__PresidentAssignment_6 ) )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1030:1: ( ( rule__Party__PresidentAssignment_6 ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1031:1: ( rule__Party__PresidentAssignment_6 )
            {
             before(grammarAccess.getPartyAccess().getPresidentAssignment_6()); 
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1032:1: ( rule__Party__PresidentAssignment_6 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1032:2: rule__Party__PresidentAssignment_6
            {
            pushFollow(FOLLOW_rule__Party__PresidentAssignment_6_in_rule__Party__Group__6__Impl2006);
            rule__Party__PresidentAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPartyAccess().getPresidentAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__6__Impl"


    // $ANTLR start "rule__Party__Group__7"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1042:1: rule__Party__Group__7 : rule__Party__Group__7__Impl rule__Party__Group__8 ;
    public final void rule__Party__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1046:1: ( rule__Party__Group__7__Impl rule__Party__Group__8 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1047:2: rule__Party__Group__7__Impl rule__Party__Group__8
            {
            pushFollow(FOLLOW_rule__Party__Group__7__Impl_in_rule__Party__Group__72036);
            rule__Party__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Party__Group__8_in_rule__Party__Group__72039);
            rule__Party__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__7"


    // $ANTLR start "rule__Party__Group__7__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1054:1: rule__Party__Group__7__Impl : ( 'pols' ) ;
    public final void rule__Party__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1058:1: ( ( 'pols' ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1059:1: ( 'pols' )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1059:1: ( 'pols' )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1060:1: 'pols'
            {
             before(grammarAccess.getPartyAccess().getPolsKeyword_7()); 
            match(input,20,FOLLOW_20_in_rule__Party__Group__7__Impl2067); 
             after(grammarAccess.getPartyAccess().getPolsKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__7__Impl"


    // $ANTLR start "rule__Party__Group__8"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1073:1: rule__Party__Group__8 : rule__Party__Group__8__Impl rule__Party__Group__9 ;
    public final void rule__Party__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1077:1: ( rule__Party__Group__8__Impl rule__Party__Group__9 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1078:2: rule__Party__Group__8__Impl rule__Party__Group__9
            {
            pushFollow(FOLLOW_rule__Party__Group__8__Impl_in_rule__Party__Group__82098);
            rule__Party__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Party__Group__9_in_rule__Party__Group__82101);
            rule__Party__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__8"


    // $ANTLR start "rule__Party__Group__8__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1085:1: rule__Party__Group__8__Impl : ( '[' ) ;
    public final void rule__Party__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1089:1: ( ( '[' ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1090:1: ( '[' )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1090:1: ( '[' )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1091:1: '['
            {
             before(grammarAccess.getPartyAccess().getLeftSquareBracketKeyword_8()); 
            match(input,21,FOLLOW_21_in_rule__Party__Group__8__Impl2129); 
             after(grammarAccess.getPartyAccess().getLeftSquareBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__8__Impl"


    // $ANTLR start "rule__Party__Group__9"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1104:1: rule__Party__Group__9 : rule__Party__Group__9__Impl rule__Party__Group__10 ;
    public final void rule__Party__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1108:1: ( rule__Party__Group__9__Impl rule__Party__Group__10 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1109:2: rule__Party__Group__9__Impl rule__Party__Group__10
            {
            pushFollow(FOLLOW_rule__Party__Group__9__Impl_in_rule__Party__Group__92160);
            rule__Party__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Party__Group__10_in_rule__Party__Group__92163);
            rule__Party__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__9"


    // $ANTLR start "rule__Party__Group__9__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1116:1: rule__Party__Group__9__Impl : ( ( rule__Party__PolsAssignment_9 ) ) ;
    public final void rule__Party__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1120:1: ( ( ( rule__Party__PolsAssignment_9 ) ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1121:1: ( ( rule__Party__PolsAssignment_9 ) )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1121:1: ( ( rule__Party__PolsAssignment_9 ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1122:1: ( rule__Party__PolsAssignment_9 )
            {
             before(grammarAccess.getPartyAccess().getPolsAssignment_9()); 
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1123:1: ( rule__Party__PolsAssignment_9 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1123:2: rule__Party__PolsAssignment_9
            {
            pushFollow(FOLLOW_rule__Party__PolsAssignment_9_in_rule__Party__Group__9__Impl2190);
            rule__Party__PolsAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getPartyAccess().getPolsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__9__Impl"


    // $ANTLR start "rule__Party__Group__10"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1133:1: rule__Party__Group__10 : rule__Party__Group__10__Impl rule__Party__Group__11 ;
    public final void rule__Party__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1137:1: ( rule__Party__Group__10__Impl rule__Party__Group__11 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1138:2: rule__Party__Group__10__Impl rule__Party__Group__11
            {
            pushFollow(FOLLOW_rule__Party__Group__10__Impl_in_rule__Party__Group__102220);
            rule__Party__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Party__Group__11_in_rule__Party__Group__102223);
            rule__Party__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__10"


    // $ANTLR start "rule__Party__Group__10__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1145:1: rule__Party__Group__10__Impl : ( ( rule__Party__Group_10__0 )* ) ;
    public final void rule__Party__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1149:1: ( ( ( rule__Party__Group_10__0 )* ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1150:1: ( ( rule__Party__Group_10__0 )* )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1150:1: ( ( rule__Party__Group_10__0 )* )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1151:1: ( rule__Party__Group_10__0 )*
            {
             before(grammarAccess.getPartyAccess().getGroup_10()); 
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1152:1: ( rule__Party__Group_10__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1152:2: rule__Party__Group_10__0
            	    {
            	    pushFollow(FOLLOW_rule__Party__Group_10__0_in_rule__Party__Group__10__Impl2250);
            	    rule__Party__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getPartyAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__10__Impl"


    // $ANTLR start "rule__Party__Group__11"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1162:1: rule__Party__Group__11 : rule__Party__Group__11__Impl rule__Party__Group__12 ;
    public final void rule__Party__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1166:1: ( rule__Party__Group__11__Impl rule__Party__Group__12 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1167:2: rule__Party__Group__11__Impl rule__Party__Group__12
            {
            pushFollow(FOLLOW_rule__Party__Group__11__Impl_in_rule__Party__Group__112281);
            rule__Party__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Party__Group__12_in_rule__Party__Group__112284);
            rule__Party__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__11"


    // $ANTLR start "rule__Party__Group__11__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1174:1: rule__Party__Group__11__Impl : ( ']' ) ;
    public final void rule__Party__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1178:1: ( ( ']' ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1179:1: ( ']' )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1179:1: ( ']' )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1180:1: ']'
            {
             before(grammarAccess.getPartyAccess().getRightSquareBracketKeyword_11()); 
            match(input,22,FOLLOW_22_in_rule__Party__Group__11__Impl2312); 
             after(grammarAccess.getPartyAccess().getRightSquareBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__11__Impl"


    // $ANTLR start "rule__Party__Group__12"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1193:1: rule__Party__Group__12 : rule__Party__Group__12__Impl ;
    public final void rule__Party__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1197:1: ( rule__Party__Group__12__Impl )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1198:2: rule__Party__Group__12__Impl
            {
            pushFollow(FOLLOW_rule__Party__Group__12__Impl_in_rule__Party__Group__122343);
            rule__Party__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__12"


    // $ANTLR start "rule__Party__Group__12__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1204:1: rule__Party__Group__12__Impl : ( '}' ) ;
    public final void rule__Party__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1208:1: ( ( '}' ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1209:1: ( '}' )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1209:1: ( '}' )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1210:1: '}'
            {
             before(grammarAccess.getPartyAccess().getRightCurlyBracketKeyword_12()); 
            match(input,14,FOLLOW_14_in_rule__Party__Group__12__Impl2371); 
             after(grammarAccess.getPartyAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__12__Impl"


    // $ANTLR start "rule__Party__Group_10__0"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1249:1: rule__Party__Group_10__0 : rule__Party__Group_10__0__Impl rule__Party__Group_10__1 ;
    public final void rule__Party__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1253:1: ( rule__Party__Group_10__0__Impl rule__Party__Group_10__1 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1254:2: rule__Party__Group_10__0__Impl rule__Party__Group_10__1
            {
            pushFollow(FOLLOW_rule__Party__Group_10__0__Impl_in_rule__Party__Group_10__02428);
            rule__Party__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Party__Group_10__1_in_rule__Party__Group_10__02431);
            rule__Party__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group_10__0"


    // $ANTLR start "rule__Party__Group_10__0__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1261:1: rule__Party__Group_10__0__Impl : ( ',' ) ;
    public final void rule__Party__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1265:1: ( ( ',' ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1266:1: ( ',' )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1266:1: ( ',' )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1267:1: ','
            {
             before(grammarAccess.getPartyAccess().getCommaKeyword_10_0()); 
            match(input,16,FOLLOW_16_in_rule__Party__Group_10__0__Impl2459); 
             after(grammarAccess.getPartyAccess().getCommaKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group_10__0__Impl"


    // $ANTLR start "rule__Party__Group_10__1"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1280:1: rule__Party__Group_10__1 : rule__Party__Group_10__1__Impl ;
    public final void rule__Party__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1284:1: ( rule__Party__Group_10__1__Impl )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1285:2: rule__Party__Group_10__1__Impl
            {
            pushFollow(FOLLOW_rule__Party__Group_10__1__Impl_in_rule__Party__Group_10__12490);
            rule__Party__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group_10__1"


    // $ANTLR start "rule__Party__Group_10__1__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1291:1: rule__Party__Group_10__1__Impl : ( ( rule__Party__PolsAssignment_10_1 ) ) ;
    public final void rule__Party__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1295:1: ( ( ( rule__Party__PolsAssignment_10_1 ) ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1296:1: ( ( rule__Party__PolsAssignment_10_1 ) )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1296:1: ( ( rule__Party__PolsAssignment_10_1 ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1297:1: ( rule__Party__PolsAssignment_10_1 )
            {
             before(grammarAccess.getPartyAccess().getPolsAssignment_10_1()); 
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1298:1: ( rule__Party__PolsAssignment_10_1 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1298:2: rule__Party__PolsAssignment_10_1
            {
            pushFollow(FOLLOW_rule__Party__PolsAssignment_10_1_in_rule__Party__Group_10__1__Impl2517);
            rule__Party__PolsAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getPartyAccess().getPolsAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group_10__1__Impl"


    // $ANTLR start "rule__Politician_Impl__Group__0"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1312:1: rule__Politician_Impl__Group__0 : rule__Politician_Impl__Group__0__Impl rule__Politician_Impl__Group__1 ;
    public final void rule__Politician_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1316:1: ( rule__Politician_Impl__Group__0__Impl rule__Politician_Impl__Group__1 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1317:2: rule__Politician_Impl__Group__0__Impl rule__Politician_Impl__Group__1
            {
            pushFollow(FOLLOW_rule__Politician_Impl__Group__0__Impl_in_rule__Politician_Impl__Group__02551);
            rule__Politician_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Politician_Impl__Group__1_in_rule__Politician_Impl__Group__02554);
            rule__Politician_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Politician_Impl__Group__0"


    // $ANTLR start "rule__Politician_Impl__Group__0__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1324:1: rule__Politician_Impl__Group__0__Impl : ( 'Politician' ) ;
    public final void rule__Politician_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1328:1: ( ( 'Politician' ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1329:1: ( 'Politician' )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1329:1: ( 'Politician' )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1330:1: 'Politician'
            {
             before(grammarAccess.getPolitician_ImplAccess().getPoliticianKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Politician_Impl__Group__0__Impl2582); 
             after(grammarAccess.getPolitician_ImplAccess().getPoliticianKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Politician_Impl__Group__0__Impl"


    // $ANTLR start "rule__Politician_Impl__Group__1"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1343:1: rule__Politician_Impl__Group__1 : rule__Politician_Impl__Group__1__Impl rule__Politician_Impl__Group__2 ;
    public final void rule__Politician_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1347:1: ( rule__Politician_Impl__Group__1__Impl rule__Politician_Impl__Group__2 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1348:2: rule__Politician_Impl__Group__1__Impl rule__Politician_Impl__Group__2
            {
            pushFollow(FOLLOW_rule__Politician_Impl__Group__1__Impl_in_rule__Politician_Impl__Group__12613);
            rule__Politician_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Politician_Impl__Group__2_in_rule__Politician_Impl__Group__12616);
            rule__Politician_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Politician_Impl__Group__1"


    // $ANTLR start "rule__Politician_Impl__Group__1__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1355:1: rule__Politician_Impl__Group__1__Impl : ( ( rule__Politician_Impl__NameAssignment_1 ) ) ;
    public final void rule__Politician_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1359:1: ( ( ( rule__Politician_Impl__NameAssignment_1 ) ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1360:1: ( ( rule__Politician_Impl__NameAssignment_1 ) )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1360:1: ( ( rule__Politician_Impl__NameAssignment_1 ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1361:1: ( rule__Politician_Impl__NameAssignment_1 )
            {
             before(grammarAccess.getPolitician_ImplAccess().getNameAssignment_1()); 
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1362:1: ( rule__Politician_Impl__NameAssignment_1 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1362:2: rule__Politician_Impl__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Politician_Impl__NameAssignment_1_in_rule__Politician_Impl__Group__1__Impl2643);
            rule__Politician_Impl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPolitician_ImplAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Politician_Impl__Group__1__Impl"


    // $ANTLR start "rule__Politician_Impl__Group__2"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1372:1: rule__Politician_Impl__Group__2 : rule__Politician_Impl__Group__2__Impl rule__Politician_Impl__Group__3 ;
    public final void rule__Politician_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1376:1: ( rule__Politician_Impl__Group__2__Impl rule__Politician_Impl__Group__3 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1377:2: rule__Politician_Impl__Group__2__Impl rule__Politician_Impl__Group__3
            {
            pushFollow(FOLLOW_rule__Politician_Impl__Group__2__Impl_in_rule__Politician_Impl__Group__22673);
            rule__Politician_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Politician_Impl__Group__3_in_rule__Politician_Impl__Group__22676);
            rule__Politician_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Politician_Impl__Group__2"


    // $ANTLR start "rule__Politician_Impl__Group__2__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1384:1: rule__Politician_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__Politician_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1388:1: ( ( '{' ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1389:1: ( '{' )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1389:1: ( '{' )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1390:1: '{'
            {
             before(grammarAccess.getPolitician_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Politician_Impl__Group__2__Impl2704); 
             after(grammarAccess.getPolitician_ImplAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Politician_Impl__Group__2__Impl"


    // $ANTLR start "rule__Politician_Impl__Group__3"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1403:1: rule__Politician_Impl__Group__3 : rule__Politician_Impl__Group__3__Impl rule__Politician_Impl__Group__4 ;
    public final void rule__Politician_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1407:1: ( rule__Politician_Impl__Group__3__Impl rule__Politician_Impl__Group__4 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1408:2: rule__Politician_Impl__Group__3__Impl rule__Politician_Impl__Group__4
            {
            pushFollow(FOLLOW_rule__Politician_Impl__Group__3__Impl_in_rule__Politician_Impl__Group__32735);
            rule__Politician_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Politician_Impl__Group__4_in_rule__Politician_Impl__Group__32738);
            rule__Politician_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Politician_Impl__Group__3"


    // $ANTLR start "rule__Politician_Impl__Group__3__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1415:1: rule__Politician_Impl__Group__3__Impl : ( 'age' ) ;
    public final void rule__Politician_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1419:1: ( ( 'age' ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1420:1: ( 'age' )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1420:1: ( 'age' )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1421:1: 'age'
            {
             before(grammarAccess.getPolitician_ImplAccess().getAgeKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Politician_Impl__Group__3__Impl2766); 
             after(grammarAccess.getPolitician_ImplAccess().getAgeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Politician_Impl__Group__3__Impl"


    // $ANTLR start "rule__Politician_Impl__Group__4"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1434:1: rule__Politician_Impl__Group__4 : rule__Politician_Impl__Group__4__Impl rule__Politician_Impl__Group__5 ;
    public final void rule__Politician_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1438:1: ( rule__Politician_Impl__Group__4__Impl rule__Politician_Impl__Group__5 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1439:2: rule__Politician_Impl__Group__4__Impl rule__Politician_Impl__Group__5
            {
            pushFollow(FOLLOW_rule__Politician_Impl__Group__4__Impl_in_rule__Politician_Impl__Group__42797);
            rule__Politician_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Politician_Impl__Group__5_in_rule__Politician_Impl__Group__42800);
            rule__Politician_Impl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Politician_Impl__Group__4"


    // $ANTLR start "rule__Politician_Impl__Group__4__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1446:1: rule__Politician_Impl__Group__4__Impl : ( ( rule__Politician_Impl__AgeAssignment_4 ) ) ;
    public final void rule__Politician_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1450:1: ( ( ( rule__Politician_Impl__AgeAssignment_4 ) ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1451:1: ( ( rule__Politician_Impl__AgeAssignment_4 ) )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1451:1: ( ( rule__Politician_Impl__AgeAssignment_4 ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1452:1: ( rule__Politician_Impl__AgeAssignment_4 )
            {
             before(grammarAccess.getPolitician_ImplAccess().getAgeAssignment_4()); 
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1453:1: ( rule__Politician_Impl__AgeAssignment_4 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1453:2: rule__Politician_Impl__AgeAssignment_4
            {
            pushFollow(FOLLOW_rule__Politician_Impl__AgeAssignment_4_in_rule__Politician_Impl__Group__4__Impl2827);
            rule__Politician_Impl__AgeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPolitician_ImplAccess().getAgeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Politician_Impl__Group__4__Impl"


    // $ANTLR start "rule__Politician_Impl__Group__5"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1463:1: rule__Politician_Impl__Group__5 : rule__Politician_Impl__Group__5__Impl rule__Politician_Impl__Group__6 ;
    public final void rule__Politician_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1467:1: ( rule__Politician_Impl__Group__5__Impl rule__Politician_Impl__Group__6 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1468:2: rule__Politician_Impl__Group__5__Impl rule__Politician_Impl__Group__6
            {
            pushFollow(FOLLOW_rule__Politician_Impl__Group__5__Impl_in_rule__Politician_Impl__Group__52857);
            rule__Politician_Impl__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Politician_Impl__Group__6_in_rule__Politician_Impl__Group__52860);
            rule__Politician_Impl__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Politician_Impl__Group__5"


    // $ANTLR start "rule__Politician_Impl__Group__5__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1475:1: rule__Politician_Impl__Group__5__Impl : ( 'sex' ) ;
    public final void rule__Politician_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1479:1: ( ( 'sex' ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1480:1: ( 'sex' )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1480:1: ( 'sex' )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1481:1: 'sex'
            {
             before(grammarAccess.getPolitician_ImplAccess().getSexKeyword_5()); 
            match(input,25,FOLLOW_25_in_rule__Politician_Impl__Group__5__Impl2888); 
             after(grammarAccess.getPolitician_ImplAccess().getSexKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Politician_Impl__Group__5__Impl"


    // $ANTLR start "rule__Politician_Impl__Group__6"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1494:1: rule__Politician_Impl__Group__6 : rule__Politician_Impl__Group__6__Impl rule__Politician_Impl__Group__7 ;
    public final void rule__Politician_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1498:1: ( rule__Politician_Impl__Group__6__Impl rule__Politician_Impl__Group__7 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1499:2: rule__Politician_Impl__Group__6__Impl rule__Politician_Impl__Group__7
            {
            pushFollow(FOLLOW_rule__Politician_Impl__Group__6__Impl_in_rule__Politician_Impl__Group__62919);
            rule__Politician_Impl__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Politician_Impl__Group__7_in_rule__Politician_Impl__Group__62922);
            rule__Politician_Impl__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Politician_Impl__Group__6"


    // $ANTLR start "rule__Politician_Impl__Group__6__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1506:1: rule__Politician_Impl__Group__6__Impl : ( ( rule__Politician_Impl__SexAssignment_6 ) ) ;
    public final void rule__Politician_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1510:1: ( ( ( rule__Politician_Impl__SexAssignment_6 ) ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1511:1: ( ( rule__Politician_Impl__SexAssignment_6 ) )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1511:1: ( ( rule__Politician_Impl__SexAssignment_6 ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1512:1: ( rule__Politician_Impl__SexAssignment_6 )
            {
             before(grammarAccess.getPolitician_ImplAccess().getSexAssignment_6()); 
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1513:1: ( rule__Politician_Impl__SexAssignment_6 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1513:2: rule__Politician_Impl__SexAssignment_6
            {
            pushFollow(FOLLOW_rule__Politician_Impl__SexAssignment_6_in_rule__Politician_Impl__Group__6__Impl2949);
            rule__Politician_Impl__SexAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPolitician_ImplAccess().getSexAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Politician_Impl__Group__6__Impl"


    // $ANTLR start "rule__Politician_Impl__Group__7"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1523:1: rule__Politician_Impl__Group__7 : rule__Politician_Impl__Group__7__Impl ;
    public final void rule__Politician_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1527:1: ( rule__Politician_Impl__Group__7__Impl )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1528:2: rule__Politician_Impl__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Politician_Impl__Group__7__Impl_in_rule__Politician_Impl__Group__72979);
            rule__Politician_Impl__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Politician_Impl__Group__7"


    // $ANTLR start "rule__Politician_Impl__Group__7__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1534:1: rule__Politician_Impl__Group__7__Impl : ( '}' ) ;
    public final void rule__Politician_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1538:1: ( ( '}' ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1539:1: ( '}' )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1539:1: ( '}' )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1540:1: '}'
            {
             before(grammarAccess.getPolitician_ImplAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_14_in_rule__Politician_Impl__Group__7__Impl3007); 
             after(grammarAccess.getPolitician_ImplAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Politician_Impl__Group__7__Impl"


    // $ANTLR start "rule__PublicOffice__Group__0"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1569:1: rule__PublicOffice__Group__0 : rule__PublicOffice__Group__0__Impl rule__PublicOffice__Group__1 ;
    public final void rule__PublicOffice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1573:1: ( rule__PublicOffice__Group__0__Impl rule__PublicOffice__Group__1 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1574:2: rule__PublicOffice__Group__0__Impl rule__PublicOffice__Group__1
            {
            pushFollow(FOLLOW_rule__PublicOffice__Group__0__Impl_in_rule__PublicOffice__Group__03054);
            rule__PublicOffice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PublicOffice__Group__1_in_rule__PublicOffice__Group__03057);
            rule__PublicOffice__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOffice__Group__0"


    // $ANTLR start "rule__PublicOffice__Group__0__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1581:1: rule__PublicOffice__Group__0__Impl : ( 'PublicOffice' ) ;
    public final void rule__PublicOffice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1585:1: ( ( 'PublicOffice' ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1586:1: ( 'PublicOffice' )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1586:1: ( 'PublicOffice' )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1587:1: 'PublicOffice'
            {
             before(grammarAccess.getPublicOfficeAccess().getPublicOfficeKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__PublicOffice__Group__0__Impl3085); 
             after(grammarAccess.getPublicOfficeAccess().getPublicOfficeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOffice__Group__0__Impl"


    // $ANTLR start "rule__PublicOffice__Group__1"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1600:1: rule__PublicOffice__Group__1 : rule__PublicOffice__Group__1__Impl rule__PublicOffice__Group__2 ;
    public final void rule__PublicOffice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1604:1: ( rule__PublicOffice__Group__1__Impl rule__PublicOffice__Group__2 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1605:2: rule__PublicOffice__Group__1__Impl rule__PublicOffice__Group__2
            {
            pushFollow(FOLLOW_rule__PublicOffice__Group__1__Impl_in_rule__PublicOffice__Group__13116);
            rule__PublicOffice__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PublicOffice__Group__2_in_rule__PublicOffice__Group__13119);
            rule__PublicOffice__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOffice__Group__1"


    // $ANTLR start "rule__PublicOffice__Group__1__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1612:1: rule__PublicOffice__Group__1__Impl : ( ( rule__PublicOffice__NameAssignment_1 ) ) ;
    public final void rule__PublicOffice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1616:1: ( ( ( rule__PublicOffice__NameAssignment_1 ) ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1617:1: ( ( rule__PublicOffice__NameAssignment_1 ) )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1617:1: ( ( rule__PublicOffice__NameAssignment_1 ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1618:1: ( rule__PublicOffice__NameAssignment_1 )
            {
             before(grammarAccess.getPublicOfficeAccess().getNameAssignment_1()); 
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1619:1: ( rule__PublicOffice__NameAssignment_1 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1619:2: rule__PublicOffice__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PublicOffice__NameAssignment_1_in_rule__PublicOffice__Group__1__Impl3146);
            rule__PublicOffice__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPublicOfficeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOffice__Group__1__Impl"


    // $ANTLR start "rule__PublicOffice__Group__2"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1629:1: rule__PublicOffice__Group__2 : rule__PublicOffice__Group__2__Impl rule__PublicOffice__Group__3 ;
    public final void rule__PublicOffice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1633:1: ( rule__PublicOffice__Group__2__Impl rule__PublicOffice__Group__3 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1634:2: rule__PublicOffice__Group__2__Impl rule__PublicOffice__Group__3
            {
            pushFollow(FOLLOW_rule__PublicOffice__Group__2__Impl_in_rule__PublicOffice__Group__23176);
            rule__PublicOffice__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PublicOffice__Group__3_in_rule__PublicOffice__Group__23179);
            rule__PublicOffice__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOffice__Group__2"


    // $ANTLR start "rule__PublicOffice__Group__2__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1641:1: rule__PublicOffice__Group__2__Impl : ( '{' ) ;
    public final void rule__PublicOffice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1645:1: ( ( '{' ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1646:1: ( '{' )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1646:1: ( '{' )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1647:1: '{'
            {
             before(grammarAccess.getPublicOfficeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__PublicOffice__Group__2__Impl3207); 
             after(grammarAccess.getPublicOfficeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOffice__Group__2__Impl"


    // $ANTLR start "rule__PublicOffice__Group__3"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1660:1: rule__PublicOffice__Group__3 : rule__PublicOffice__Group__3__Impl rule__PublicOffice__Group__4 ;
    public final void rule__PublicOffice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1664:1: ( rule__PublicOffice__Group__3__Impl rule__PublicOffice__Group__4 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1665:2: rule__PublicOffice__Group__3__Impl rule__PublicOffice__Group__4
            {
            pushFollow(FOLLOW_rule__PublicOffice__Group__3__Impl_in_rule__PublicOffice__Group__33238);
            rule__PublicOffice__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PublicOffice__Group__4_in_rule__PublicOffice__Group__33241);
            rule__PublicOffice__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOffice__Group__3"


    // $ANTLR start "rule__PublicOffice__Group__3__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1672:1: rule__PublicOffice__Group__3__Impl : ( 'age' ) ;
    public final void rule__PublicOffice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1676:1: ( ( 'age' ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1677:1: ( 'age' )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1677:1: ( 'age' )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1678:1: 'age'
            {
             before(grammarAccess.getPublicOfficeAccess().getAgeKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__PublicOffice__Group__3__Impl3269); 
             after(grammarAccess.getPublicOfficeAccess().getAgeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOffice__Group__3__Impl"


    // $ANTLR start "rule__PublicOffice__Group__4"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1691:1: rule__PublicOffice__Group__4 : rule__PublicOffice__Group__4__Impl rule__PublicOffice__Group__5 ;
    public final void rule__PublicOffice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1695:1: ( rule__PublicOffice__Group__4__Impl rule__PublicOffice__Group__5 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1696:2: rule__PublicOffice__Group__4__Impl rule__PublicOffice__Group__5
            {
            pushFollow(FOLLOW_rule__PublicOffice__Group__4__Impl_in_rule__PublicOffice__Group__43300);
            rule__PublicOffice__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PublicOffice__Group__5_in_rule__PublicOffice__Group__43303);
            rule__PublicOffice__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOffice__Group__4"


    // $ANTLR start "rule__PublicOffice__Group__4__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1703:1: rule__PublicOffice__Group__4__Impl : ( ( rule__PublicOffice__AgeAssignment_4 ) ) ;
    public final void rule__PublicOffice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1707:1: ( ( ( rule__PublicOffice__AgeAssignment_4 ) ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1708:1: ( ( rule__PublicOffice__AgeAssignment_4 ) )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1708:1: ( ( rule__PublicOffice__AgeAssignment_4 ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1709:1: ( rule__PublicOffice__AgeAssignment_4 )
            {
             before(grammarAccess.getPublicOfficeAccess().getAgeAssignment_4()); 
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1710:1: ( rule__PublicOffice__AgeAssignment_4 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1710:2: rule__PublicOffice__AgeAssignment_4
            {
            pushFollow(FOLLOW_rule__PublicOffice__AgeAssignment_4_in_rule__PublicOffice__Group__4__Impl3330);
            rule__PublicOffice__AgeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPublicOfficeAccess().getAgeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOffice__Group__4__Impl"


    // $ANTLR start "rule__PublicOffice__Group__5"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1720:1: rule__PublicOffice__Group__5 : rule__PublicOffice__Group__5__Impl rule__PublicOffice__Group__6 ;
    public final void rule__PublicOffice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1724:1: ( rule__PublicOffice__Group__5__Impl rule__PublicOffice__Group__6 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1725:2: rule__PublicOffice__Group__5__Impl rule__PublicOffice__Group__6
            {
            pushFollow(FOLLOW_rule__PublicOffice__Group__5__Impl_in_rule__PublicOffice__Group__53360);
            rule__PublicOffice__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PublicOffice__Group__6_in_rule__PublicOffice__Group__53363);
            rule__PublicOffice__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOffice__Group__5"


    // $ANTLR start "rule__PublicOffice__Group__5__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1732:1: rule__PublicOffice__Group__5__Impl : ( 'sex' ) ;
    public final void rule__PublicOffice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1736:1: ( ( 'sex' ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1737:1: ( 'sex' )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1737:1: ( 'sex' )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1738:1: 'sex'
            {
             before(grammarAccess.getPublicOfficeAccess().getSexKeyword_5()); 
            match(input,25,FOLLOW_25_in_rule__PublicOffice__Group__5__Impl3391); 
             after(grammarAccess.getPublicOfficeAccess().getSexKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOffice__Group__5__Impl"


    // $ANTLR start "rule__PublicOffice__Group__6"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1751:1: rule__PublicOffice__Group__6 : rule__PublicOffice__Group__6__Impl rule__PublicOffice__Group__7 ;
    public final void rule__PublicOffice__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1755:1: ( rule__PublicOffice__Group__6__Impl rule__PublicOffice__Group__7 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1756:2: rule__PublicOffice__Group__6__Impl rule__PublicOffice__Group__7
            {
            pushFollow(FOLLOW_rule__PublicOffice__Group__6__Impl_in_rule__PublicOffice__Group__63422);
            rule__PublicOffice__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PublicOffice__Group__7_in_rule__PublicOffice__Group__63425);
            rule__PublicOffice__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOffice__Group__6"


    // $ANTLR start "rule__PublicOffice__Group__6__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1763:1: rule__PublicOffice__Group__6__Impl : ( ( rule__PublicOffice__SexAssignment_6 ) ) ;
    public final void rule__PublicOffice__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1767:1: ( ( ( rule__PublicOffice__SexAssignment_6 ) ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1768:1: ( ( rule__PublicOffice__SexAssignment_6 ) )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1768:1: ( ( rule__PublicOffice__SexAssignment_6 ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1769:1: ( rule__PublicOffice__SexAssignment_6 )
            {
             before(grammarAccess.getPublicOfficeAccess().getSexAssignment_6()); 
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1770:1: ( rule__PublicOffice__SexAssignment_6 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1770:2: rule__PublicOffice__SexAssignment_6
            {
            pushFollow(FOLLOW_rule__PublicOffice__SexAssignment_6_in_rule__PublicOffice__Group__6__Impl3452);
            rule__PublicOffice__SexAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPublicOfficeAccess().getSexAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOffice__Group__6__Impl"


    // $ANTLR start "rule__PublicOffice__Group__7"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1780:1: rule__PublicOffice__Group__7 : rule__PublicOffice__Group__7__Impl rule__PublicOffice__Group__8 ;
    public final void rule__PublicOffice__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1784:1: ( rule__PublicOffice__Group__7__Impl rule__PublicOffice__Group__8 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1785:2: rule__PublicOffice__Group__7__Impl rule__PublicOffice__Group__8
            {
            pushFollow(FOLLOW_rule__PublicOffice__Group__7__Impl_in_rule__PublicOffice__Group__73482);
            rule__PublicOffice__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PublicOffice__Group__8_in_rule__PublicOffice__Group__73485);
            rule__PublicOffice__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOffice__Group__7"


    // $ANTLR start "rule__PublicOffice__Group__7__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1792:1: rule__PublicOffice__Group__7__Impl : ( 'instName' ) ;
    public final void rule__PublicOffice__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1796:1: ( ( 'instName' ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1797:1: ( 'instName' )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1797:1: ( 'instName' )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1798:1: 'instName'
            {
             before(grammarAccess.getPublicOfficeAccess().getInstNameKeyword_7()); 
            match(input,27,FOLLOW_27_in_rule__PublicOffice__Group__7__Impl3513); 
             after(grammarAccess.getPublicOfficeAccess().getInstNameKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOffice__Group__7__Impl"


    // $ANTLR start "rule__PublicOffice__Group__8"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1811:1: rule__PublicOffice__Group__8 : rule__PublicOffice__Group__8__Impl rule__PublicOffice__Group__9 ;
    public final void rule__PublicOffice__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1815:1: ( rule__PublicOffice__Group__8__Impl rule__PublicOffice__Group__9 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1816:2: rule__PublicOffice__Group__8__Impl rule__PublicOffice__Group__9
            {
            pushFollow(FOLLOW_rule__PublicOffice__Group__8__Impl_in_rule__PublicOffice__Group__83544);
            rule__PublicOffice__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PublicOffice__Group__9_in_rule__PublicOffice__Group__83547);
            rule__PublicOffice__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOffice__Group__8"


    // $ANTLR start "rule__PublicOffice__Group__8__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1823:1: rule__PublicOffice__Group__8__Impl : ( ( rule__PublicOffice__InstNameAssignment_8 ) ) ;
    public final void rule__PublicOffice__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1827:1: ( ( ( rule__PublicOffice__InstNameAssignment_8 ) ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1828:1: ( ( rule__PublicOffice__InstNameAssignment_8 ) )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1828:1: ( ( rule__PublicOffice__InstNameAssignment_8 ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1829:1: ( rule__PublicOffice__InstNameAssignment_8 )
            {
             before(grammarAccess.getPublicOfficeAccess().getInstNameAssignment_8()); 
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1830:1: ( rule__PublicOffice__InstNameAssignment_8 )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1830:2: rule__PublicOffice__InstNameAssignment_8
            {
            pushFollow(FOLLOW_rule__PublicOffice__InstNameAssignment_8_in_rule__PublicOffice__Group__8__Impl3574);
            rule__PublicOffice__InstNameAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getPublicOfficeAccess().getInstNameAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOffice__Group__8__Impl"


    // $ANTLR start "rule__PublicOffice__Group__9"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1840:1: rule__PublicOffice__Group__9 : rule__PublicOffice__Group__9__Impl ;
    public final void rule__PublicOffice__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1844:1: ( rule__PublicOffice__Group__9__Impl )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1845:2: rule__PublicOffice__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__PublicOffice__Group__9__Impl_in_rule__PublicOffice__Group__93604);
            rule__PublicOffice__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOffice__Group__9"


    // $ANTLR start "rule__PublicOffice__Group__9__Impl"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1851:1: rule__PublicOffice__Group__9__Impl : ( '}' ) ;
    public final void rule__PublicOffice__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1855:1: ( ( '}' ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1856:1: ( '}' )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1856:1: ( '}' )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1857:1: '}'
            {
             before(grammarAccess.getPublicOfficeAccess().getRightCurlyBracketKeyword_9()); 
            match(input,14,FOLLOW_14_in_rule__PublicOffice__Group__9__Impl3632); 
             after(grammarAccess.getPublicOfficeAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOffice__Group__9__Impl"


    // $ANTLR start "rule__City__NameAssignment_1"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1891:1: rule__City__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__City__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1895:1: ( ( RULE_STRING ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1896:1: ( RULE_STRING )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1896:1: ( RULE_STRING )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1897:1: RULE_STRING
            {
             before(grammarAccess.getCityAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__City__NameAssignment_13688); 
             after(grammarAccess.getCityAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__NameAssignment_1"


    // $ANTLR start "rule__City__PartiesAssignment_3_2"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1906:1: rule__City__PartiesAssignment_3_2 : ( ruleParty ) ;
    public final void rule__City__PartiesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1910:1: ( ( ruleParty ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1911:1: ( ruleParty )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1911:1: ( ruleParty )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1912:1: ruleParty
            {
             before(grammarAccess.getCityAccess().getPartiesPartyParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleParty_in_rule__City__PartiesAssignment_3_23719);
            ruleParty();

            state._fsp--;

             after(grammarAccess.getCityAccess().getPartiesPartyParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__PartiesAssignment_3_2"


    // $ANTLR start "rule__City__PartiesAssignment_3_3_1"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1921:1: rule__City__PartiesAssignment_3_3_1 : ( ruleParty ) ;
    public final void rule__City__PartiesAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1925:1: ( ( ruleParty ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1926:1: ( ruleParty )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1926:1: ( ruleParty )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1927:1: ruleParty
            {
             before(grammarAccess.getCityAccess().getPartiesPartyParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_ruleParty_in_rule__City__PartiesAssignment_3_3_13750);
            ruleParty();

            state._fsp--;

             after(grammarAccess.getCityAccess().getPartiesPartyParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__PartiesAssignment_3_3_1"


    // $ANTLR start "rule__City__IndepsAssignment_6"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1936:1: rule__City__IndepsAssignment_6 : ( rulePolitician ) ;
    public final void rule__City__IndepsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1940:1: ( ( rulePolitician ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1941:1: ( rulePolitician )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1941:1: ( rulePolitician )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1942:1: rulePolitician
            {
             before(grammarAccess.getCityAccess().getIndepsPoliticianParserRuleCall_6_0()); 
            pushFollow(FOLLOW_rulePolitician_in_rule__City__IndepsAssignment_63781);
            rulePolitician();

            state._fsp--;

             after(grammarAccess.getCityAccess().getIndepsPoliticianParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__IndepsAssignment_6"


    // $ANTLR start "rule__City__IndepsAssignment_7_1"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1951:1: rule__City__IndepsAssignment_7_1 : ( rulePolitician ) ;
    public final void rule__City__IndepsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1955:1: ( ( rulePolitician ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1956:1: ( rulePolitician )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1956:1: ( rulePolitician )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1957:1: rulePolitician
            {
             before(grammarAccess.getCityAccess().getIndepsPoliticianParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_rulePolitician_in_rule__City__IndepsAssignment_7_13812);
            rulePolitician();

            state._fsp--;

             after(grammarAccess.getCityAccess().getIndepsPoliticianParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__IndepsAssignment_7_1"


    // $ANTLR start "rule__Party__NameAssignment_1"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1966:1: rule__Party__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Party__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1970:1: ( ( RULE_STRING ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1971:1: ( RULE_STRING )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1971:1: ( RULE_STRING )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1972:1: RULE_STRING
            {
             before(grammarAccess.getPartyAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Party__NameAssignment_13843); 
             after(grammarAccess.getPartyAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__NameAssignment_1"


    // $ANTLR start "rule__Party__AcronymAssignment_4"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1981:1: rule__Party__AcronymAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Party__AcronymAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1985:1: ( ( RULE_STRING ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1986:1: ( RULE_STRING )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1986:1: ( RULE_STRING )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1987:1: RULE_STRING
            {
             before(grammarAccess.getPartyAccess().getAcronymSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Party__AcronymAssignment_43874); 
             after(grammarAccess.getPartyAccess().getAcronymSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__AcronymAssignment_4"


    // $ANTLR start "rule__Party__PresidentAssignment_6"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:1996:1: rule__Party__PresidentAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Party__PresidentAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2000:1: ( ( ( RULE_ID ) ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2001:1: ( ( RULE_ID ) )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2001:1: ( ( RULE_ID ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2002:1: ( RULE_ID )
            {
             before(grammarAccess.getPartyAccess().getPresidentPoliticianCrossReference_6_0()); 
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2003:1: ( RULE_ID )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2004:1: RULE_ID
            {
             before(grammarAccess.getPartyAccess().getPresidentPoliticianIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Party__PresidentAssignment_63909); 
             after(grammarAccess.getPartyAccess().getPresidentPoliticianIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getPartyAccess().getPresidentPoliticianCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__PresidentAssignment_6"


    // $ANTLR start "rule__Party__PolsAssignment_9"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2015:1: rule__Party__PolsAssignment_9 : ( rulePolitician ) ;
    public final void rule__Party__PolsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2019:1: ( ( rulePolitician ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2020:1: ( rulePolitician )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2020:1: ( rulePolitician )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2021:1: rulePolitician
            {
             before(grammarAccess.getPartyAccess().getPolsPoliticianParserRuleCall_9_0()); 
            pushFollow(FOLLOW_rulePolitician_in_rule__Party__PolsAssignment_93944);
            rulePolitician();

            state._fsp--;

             after(grammarAccess.getPartyAccess().getPolsPoliticianParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__PolsAssignment_9"


    // $ANTLR start "rule__Party__PolsAssignment_10_1"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2030:1: rule__Party__PolsAssignment_10_1 : ( rulePolitician ) ;
    public final void rule__Party__PolsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2034:1: ( ( rulePolitician ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2035:1: ( rulePolitician )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2035:1: ( rulePolitician )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2036:1: rulePolitician
            {
             before(grammarAccess.getPartyAccess().getPolsPoliticianParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_rulePolitician_in_rule__Party__PolsAssignment_10_13975);
            rulePolitician();

            state._fsp--;

             after(grammarAccess.getPartyAccess().getPolsPoliticianParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__PolsAssignment_10_1"


    // $ANTLR start "rule__Politician_Impl__NameAssignment_1"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2045:1: rule__Politician_Impl__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Politician_Impl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2049:1: ( ( RULE_STRING ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2050:1: ( RULE_STRING )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2050:1: ( RULE_STRING )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2051:1: RULE_STRING
            {
             before(grammarAccess.getPolitician_ImplAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Politician_Impl__NameAssignment_14006); 
             after(grammarAccess.getPolitician_ImplAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Politician_Impl__NameAssignment_1"


    // $ANTLR start "rule__Politician_Impl__AgeAssignment_4"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2060:1: rule__Politician_Impl__AgeAssignment_4 : ( RULE_INT ) ;
    public final void rule__Politician_Impl__AgeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2064:1: ( ( RULE_INT ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2065:1: ( RULE_INT )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2065:1: ( RULE_INT )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2066:1: RULE_INT
            {
             before(grammarAccess.getPolitician_ImplAccess().getAgeINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Politician_Impl__AgeAssignment_44037); 
             after(grammarAccess.getPolitician_ImplAccess().getAgeINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Politician_Impl__AgeAssignment_4"


    // $ANTLR start "rule__Politician_Impl__SexAssignment_6"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2075:1: rule__Politician_Impl__SexAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Politician_Impl__SexAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2079:1: ( ( RULE_STRING ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2080:1: ( RULE_STRING )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2080:1: ( RULE_STRING )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2081:1: RULE_STRING
            {
             before(grammarAccess.getPolitician_ImplAccess().getSexSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Politician_Impl__SexAssignment_64068); 
             after(grammarAccess.getPolitician_ImplAccess().getSexSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Politician_Impl__SexAssignment_6"


    // $ANTLR start "rule__PublicOffice__NameAssignment_1"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2090:1: rule__PublicOffice__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__PublicOffice__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2094:1: ( ( RULE_STRING ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2095:1: ( RULE_STRING )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2095:1: ( RULE_STRING )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2096:1: RULE_STRING
            {
             before(grammarAccess.getPublicOfficeAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PublicOffice__NameAssignment_14099); 
             after(grammarAccess.getPublicOfficeAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOffice__NameAssignment_1"


    // $ANTLR start "rule__PublicOffice__AgeAssignment_4"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2105:1: rule__PublicOffice__AgeAssignment_4 : ( RULE_INT ) ;
    public final void rule__PublicOffice__AgeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2109:1: ( ( RULE_INT ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2110:1: ( RULE_INT )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2110:1: ( RULE_INT )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2111:1: RULE_INT
            {
             before(grammarAccess.getPublicOfficeAccess().getAgeINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__PublicOffice__AgeAssignment_44130); 
             after(grammarAccess.getPublicOfficeAccess().getAgeINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOffice__AgeAssignment_4"


    // $ANTLR start "rule__PublicOffice__SexAssignment_6"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2120:1: rule__PublicOffice__SexAssignment_6 : ( RULE_STRING ) ;
    public final void rule__PublicOffice__SexAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2124:1: ( ( RULE_STRING ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2125:1: ( RULE_STRING )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2125:1: ( RULE_STRING )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2126:1: RULE_STRING
            {
             before(grammarAccess.getPublicOfficeAccess().getSexSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PublicOffice__SexAssignment_64161); 
             after(grammarAccess.getPublicOfficeAccess().getSexSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOffice__SexAssignment_6"


    // $ANTLR start "rule__PublicOffice__InstNameAssignment_8"
    // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2135:1: rule__PublicOffice__InstNameAssignment_8 : ( RULE_STRING ) ;
    public final void rule__PublicOffice__InstNameAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2139:1: ( ( RULE_STRING ) )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2140:1: ( RULE_STRING )
            {
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2140:1: ( RULE_STRING )
            // ../politicianBiDsl.ui/src-gen/politicianBiDsl/ui/contentassist/antlr/internal/InternalPBiDsl.g:2141:1: RULE_STRING
            {
             before(grammarAccess.getPublicOfficeAccess().getInstNameSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PublicOffice__InstNameAssignment_84192); 
             after(grammarAccess.getPublicOfficeAccess().getInstNameSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOffice__InstNameAssignment_8"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleCity_in_entryRuleCity61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCity68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__City__Group__0_in_ruleCity94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParty_in_entryRuleParty121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParty128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Party__Group__0_in_ruleParty154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolitician_in_entryRulePolitician181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePolitician188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Politician__Alternatives_in_rulePolitician214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolitician_Impl_in_entryRulePolitician_Impl241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePolitician_Impl248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Politician_Impl__Group__0_in_rulePolitician_Impl274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePublicOffice_in_entryRulePublicOffice301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePublicOffice308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublicOffice__Group__0_in_rulePublicOffice334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolitician_Impl_in_rule__Politician__Alternatives370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePublicOffice_in_rule__Politician__Alternatives387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__City__Group__0__Impl_in_rule__City__Group__0417 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__City__Group__1_in_rule__City__Group__0420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__City__Group__0__Impl448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__City__Group__1__Impl_in_rule__City__Group__1479 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__City__Group__2_in_rule__City__Group__1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__City__NameAssignment_1_in_rule__City__Group__1__Impl509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__City__Group__2__Impl_in_rule__City__Group__2539 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__City__Group__3_in_rule__City__Group__2542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__City__Group__2__Impl570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__City__Group__3__Impl_in_rule__City__Group__3601 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__City__Group__4_in_rule__City__Group__3604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__City__Group_3__0_in_rule__City__Group__3__Impl631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__City__Group__4__Impl_in_rule__City__Group__4662 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__City__Group__5_in_rule__City__Group__4665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__City__Group__4__Impl693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__City__Group__5__Impl_in_rule__City__Group__5724 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_rule__City__Group__6_in_rule__City__Group__5727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__City__Group__5__Impl755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__City__Group__6__Impl_in_rule__City__Group__6786 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__City__Group__7_in_rule__City__Group__6789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__City__IndepsAssignment_6_in_rule__City__Group__6__Impl816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__City__Group__7__Impl_in_rule__City__Group__7846 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__City__Group__8_in_rule__City__Group__7849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__City__Group_7__0_in_rule__City__Group__7__Impl876 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__City__Group__8__Impl_in_rule__City__Group__8907 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__City__Group__9_in_rule__City__Group__8910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__City__Group__8__Impl938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__City__Group__9__Impl_in_rule__City__Group__9969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__City__Group__9__Impl997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__City__Group_3__0__Impl_in_rule__City__Group_3__01048 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__City__Group_3__1_in_rule__City__Group_3__01051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__City__Group_3__0__Impl1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__City__Group_3__1__Impl_in_rule__City__Group_3__11110 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__City__Group_3__2_in_rule__City__Group_3__11113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__City__Group_3__1__Impl1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__City__Group_3__2__Impl_in_rule__City__Group_3__21172 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__City__Group_3__3_in_rule__City__Group_3__21175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__City__PartiesAssignment_3_2_in_rule__City__Group_3__2__Impl1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__City__Group_3__3__Impl_in_rule__City__Group_3__31232 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__City__Group_3__4_in_rule__City__Group_3__31235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__City__Group_3_3__0_in_rule__City__Group_3__3__Impl1262 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__City__Group_3__4__Impl_in_rule__City__Group_3__41293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__City__Group_3__4__Impl1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__City__Group_3_3__0__Impl_in_rule__City__Group_3_3__01362 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__City__Group_3_3__1_in_rule__City__Group_3_3__01365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__City__Group_3_3__0__Impl1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__City__Group_3_3__1__Impl_in_rule__City__Group_3_3__11424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__City__PartiesAssignment_3_3_1_in_rule__City__Group_3_3__1__Impl1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__City__Group_7__0__Impl_in_rule__City__Group_7__01485 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_rule__City__Group_7__1_in_rule__City__Group_7__01488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__City__Group_7__0__Impl1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__City__Group_7__1__Impl_in_rule__City__Group_7__11547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__City__IndepsAssignment_7_1_in_rule__City__Group_7__1__Impl1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Party__Group__0__Impl_in_rule__Party__Group__01608 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Party__Group__1_in_rule__Party__Group__01611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Party__Group__0__Impl1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Party__Group__1__Impl_in_rule__Party__Group__11670 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Party__Group__2_in_rule__Party__Group__11673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Party__NameAssignment_1_in_rule__Party__Group__1__Impl1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Party__Group__2__Impl_in_rule__Party__Group__21730 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Party__Group__3_in_rule__Party__Group__21733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Party__Group__2__Impl1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Party__Group__3__Impl_in_rule__Party__Group__31792 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Party__Group__4_in_rule__Party__Group__31795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Party__Group__3__Impl1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Party__Group__4__Impl_in_rule__Party__Group__41854 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Party__Group__5_in_rule__Party__Group__41857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Party__AcronymAssignment_4_in_rule__Party__Group__4__Impl1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Party__Group__5__Impl_in_rule__Party__Group__51914 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Party__Group__6_in_rule__Party__Group__51917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Party__Group__5__Impl1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Party__Group__6__Impl_in_rule__Party__Group__61976 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Party__Group__7_in_rule__Party__Group__61979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Party__PresidentAssignment_6_in_rule__Party__Group__6__Impl2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Party__Group__7__Impl_in_rule__Party__Group__72036 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Party__Group__8_in_rule__Party__Group__72039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Party__Group__7__Impl2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Party__Group__8__Impl_in_rule__Party__Group__82098 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_rule__Party__Group__9_in_rule__Party__Group__82101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Party__Group__8__Impl2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Party__Group__9__Impl_in_rule__Party__Group__92160 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_rule__Party__Group__10_in_rule__Party__Group__92163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Party__PolsAssignment_9_in_rule__Party__Group__9__Impl2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Party__Group__10__Impl_in_rule__Party__Group__102220 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_rule__Party__Group__11_in_rule__Party__Group__102223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Party__Group_10__0_in_rule__Party__Group__10__Impl2250 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Party__Group__11__Impl_in_rule__Party__Group__112281 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Party__Group__12_in_rule__Party__Group__112284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Party__Group__11__Impl2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Party__Group__12__Impl_in_rule__Party__Group__122343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Party__Group__12__Impl2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Party__Group_10__0__Impl_in_rule__Party__Group_10__02428 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_rule__Party__Group_10__1_in_rule__Party__Group_10__02431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Party__Group_10__0__Impl2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Party__Group_10__1__Impl_in_rule__Party__Group_10__12490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Party__PolsAssignment_10_1_in_rule__Party__Group_10__1__Impl2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Politician_Impl__Group__0__Impl_in_rule__Politician_Impl__Group__02551 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Politician_Impl__Group__1_in_rule__Politician_Impl__Group__02554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Politician_Impl__Group__0__Impl2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Politician_Impl__Group__1__Impl_in_rule__Politician_Impl__Group__12613 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Politician_Impl__Group__2_in_rule__Politician_Impl__Group__12616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Politician_Impl__NameAssignment_1_in_rule__Politician_Impl__Group__1__Impl2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Politician_Impl__Group__2__Impl_in_rule__Politician_Impl__Group__22673 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Politician_Impl__Group__3_in_rule__Politician_Impl__Group__22676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Politician_Impl__Group__2__Impl2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Politician_Impl__Group__3__Impl_in_rule__Politician_Impl__Group__32735 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Politician_Impl__Group__4_in_rule__Politician_Impl__Group__32738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Politician_Impl__Group__3__Impl2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Politician_Impl__Group__4__Impl_in_rule__Politician_Impl__Group__42797 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Politician_Impl__Group__5_in_rule__Politician_Impl__Group__42800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Politician_Impl__AgeAssignment_4_in_rule__Politician_Impl__Group__4__Impl2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Politician_Impl__Group__5__Impl_in_rule__Politician_Impl__Group__52857 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Politician_Impl__Group__6_in_rule__Politician_Impl__Group__52860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Politician_Impl__Group__5__Impl2888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Politician_Impl__Group__6__Impl_in_rule__Politician_Impl__Group__62919 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Politician_Impl__Group__7_in_rule__Politician_Impl__Group__62922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Politician_Impl__SexAssignment_6_in_rule__Politician_Impl__Group__6__Impl2949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Politician_Impl__Group__7__Impl_in_rule__Politician_Impl__Group__72979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Politician_Impl__Group__7__Impl3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublicOffice__Group__0__Impl_in_rule__PublicOffice__Group__03054 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PublicOffice__Group__1_in_rule__PublicOffice__Group__03057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PublicOffice__Group__0__Impl3085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublicOffice__Group__1__Impl_in_rule__PublicOffice__Group__13116 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__PublicOffice__Group__2_in_rule__PublicOffice__Group__13119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublicOffice__NameAssignment_1_in_rule__PublicOffice__Group__1__Impl3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublicOffice__Group__2__Impl_in_rule__PublicOffice__Group__23176 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__PublicOffice__Group__3_in_rule__PublicOffice__Group__23179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__PublicOffice__Group__2__Impl3207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublicOffice__Group__3__Impl_in_rule__PublicOffice__Group__33238 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__PublicOffice__Group__4_in_rule__PublicOffice__Group__33241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__PublicOffice__Group__3__Impl3269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublicOffice__Group__4__Impl_in_rule__PublicOffice__Group__43300 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__PublicOffice__Group__5_in_rule__PublicOffice__Group__43303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublicOffice__AgeAssignment_4_in_rule__PublicOffice__Group__4__Impl3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublicOffice__Group__5__Impl_in_rule__PublicOffice__Group__53360 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PublicOffice__Group__6_in_rule__PublicOffice__Group__53363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__PublicOffice__Group__5__Impl3391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublicOffice__Group__6__Impl_in_rule__PublicOffice__Group__63422 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__PublicOffice__Group__7_in_rule__PublicOffice__Group__63425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublicOffice__SexAssignment_6_in_rule__PublicOffice__Group__6__Impl3452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublicOffice__Group__7__Impl_in_rule__PublicOffice__Group__73482 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PublicOffice__Group__8_in_rule__PublicOffice__Group__73485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__PublicOffice__Group__7__Impl3513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublicOffice__Group__8__Impl_in_rule__PublicOffice__Group__83544 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__PublicOffice__Group__9_in_rule__PublicOffice__Group__83547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublicOffice__InstNameAssignment_8_in_rule__PublicOffice__Group__8__Impl3574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublicOffice__Group__9__Impl_in_rule__PublicOffice__Group__93604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__PublicOffice__Group__9__Impl3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__City__NameAssignment_13688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParty_in_rule__City__PartiesAssignment_3_23719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParty_in_rule__City__PartiesAssignment_3_3_13750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolitician_in_rule__City__IndepsAssignment_63781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolitician_in_rule__City__IndepsAssignment_7_13812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Party__NameAssignment_13843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Party__AcronymAssignment_43874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Party__PresidentAssignment_63909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolitician_in_rule__Party__PolsAssignment_93944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolitician_in_rule__Party__PolsAssignment_10_13975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Politician_Impl__NameAssignment_14006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Politician_Impl__AgeAssignment_44037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Politician_Impl__SexAssignment_64068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PublicOffice__NameAssignment_14099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__PublicOffice__AgeAssignment_44130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PublicOffice__SexAssignment_64161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PublicOffice__InstNameAssignment_84192 = new BitSet(new long[]{0x0000000000000002L});

}
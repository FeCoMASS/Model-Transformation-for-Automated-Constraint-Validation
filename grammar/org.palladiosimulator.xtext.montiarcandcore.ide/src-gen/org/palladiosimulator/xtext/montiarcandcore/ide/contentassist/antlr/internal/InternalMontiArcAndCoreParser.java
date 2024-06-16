package org.palladiosimulator.xtext.montiarcandcore.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.palladiosimulator.xtext.montiarcandcore.services.MontiArcAndCoreGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMontiArcAndCoreParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_MCQUALIFIEDNAME", "RULE_ID", "RULE_DOTSTAR", "RULE_INT", "RULE_STRING", "RULE_SYNC", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'boolean'", "'byte'", "'short'", "'int'", "'long'", "'char'", "'float'", "'double'", "'Boolean'", "'Byte'", "'Integer'", "'Long'", "'Char'", "'Double'", "'String'", "'Set'", "'List'", "'Map'", "'Optional'", "'>'", "'<'", "'=='", "'&&'", "'+'", "'-'", "'/'", "'*'", "'initial'", "'final'", "'import'", "';'", "'package'", "'['", "']'", "'('", "')'", "','", "'classdiagram'", "'{'", "'}'", "'class'", "'extends'", "'implements'", "'enum'", "'component'", "'='", "'->'", "'port'", "'<<'", "'condition'", "'>>'", "'automaton'", "'state'", "'public'", "'in'", "'out'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int RULE_MCQUALIFIEDNAME=4;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_SYNC=9;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_DOTSTAR=6;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMontiArcAndCoreParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMontiArcAndCoreParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMontiArcAndCoreParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMontiArcAndCore.g"; }


    	private MontiArcAndCoreGrammarAccess grammarAccess;

    	public void setGrammarAccess(MontiArcAndCoreGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleMontiArcAndCore"
    // InternalMontiArcAndCore.g:53:1: entryRuleMontiArcAndCore : ruleMontiArcAndCore EOF ;
    public final void entryRuleMontiArcAndCore() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:54:1: ( ruleMontiArcAndCore EOF )
            // InternalMontiArcAndCore.g:55:1: ruleMontiArcAndCore EOF
            {
             before(grammarAccess.getMontiArcAndCoreRule()); 
            pushFollow(FOLLOW_1);
            ruleMontiArcAndCore();

            state._fsp--;

             after(grammarAccess.getMontiArcAndCoreRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMontiArcAndCore"


    // $ANTLR start "ruleMontiArcAndCore"
    // InternalMontiArcAndCore.g:62:1: ruleMontiArcAndCore : ( ( rule__MontiArcAndCore__Group__0 ) ) ;
    public final void ruleMontiArcAndCore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:66:2: ( ( ( rule__MontiArcAndCore__Group__0 ) ) )
            // InternalMontiArcAndCore.g:67:2: ( ( rule__MontiArcAndCore__Group__0 ) )
            {
            // InternalMontiArcAndCore.g:67:2: ( ( rule__MontiArcAndCore__Group__0 ) )
            // InternalMontiArcAndCore.g:68:3: ( rule__MontiArcAndCore__Group__0 )
            {
             before(grammarAccess.getMontiArcAndCoreAccess().getGroup()); 
            // InternalMontiArcAndCore.g:69:3: ( rule__MontiArcAndCore__Group__0 )
            // InternalMontiArcAndCore.g:69:4: rule__MontiArcAndCore__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MontiArcAndCore__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMontiArcAndCoreAccess().getGroup()); 

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
    // $ANTLR end "ruleMontiArcAndCore"


    // $ANTLR start "entryRuleImportStatements"
    // InternalMontiArcAndCore.g:78:1: entryRuleImportStatements : ruleImportStatements EOF ;
    public final void entryRuleImportStatements() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:79:1: ( ruleImportStatements EOF )
            // InternalMontiArcAndCore.g:80:1: ruleImportStatements EOF
            {
             before(grammarAccess.getImportStatementsRule()); 
            pushFollow(FOLLOW_1);
            ruleImportStatements();

            state._fsp--;

             after(grammarAccess.getImportStatementsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImportStatements"


    // $ANTLR start "ruleImportStatements"
    // InternalMontiArcAndCore.g:87:1: ruleImportStatements : ( ( rule__ImportStatements__Group__0 ) ) ;
    public final void ruleImportStatements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:91:2: ( ( ( rule__ImportStatements__Group__0 ) ) )
            // InternalMontiArcAndCore.g:92:2: ( ( rule__ImportStatements__Group__0 ) )
            {
            // InternalMontiArcAndCore.g:92:2: ( ( rule__ImportStatements__Group__0 ) )
            // InternalMontiArcAndCore.g:93:3: ( rule__ImportStatements__Group__0 )
            {
             before(grammarAccess.getImportStatementsAccess().getGroup()); 
            // InternalMontiArcAndCore.g:94:3: ( rule__ImportStatements__Group__0 )
            // InternalMontiArcAndCore.g:94:4: rule__ImportStatements__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImportStatements__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportStatementsAccess().getGroup()); 

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
    // $ANTLR end "ruleImportStatements"


    // $ANTLR start "entryRulePackage"
    // InternalMontiArcAndCore.g:103:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:104:1: ( rulePackage EOF )
            // InternalMontiArcAndCore.g:105:1: rulePackage EOF
            {
             before(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalMontiArcAndCore.g:112:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:116:2: ( ( ( rule__Package__Group__0 ) ) )
            // InternalMontiArcAndCore.g:117:2: ( ( rule__Package__Group__0 ) )
            {
            // InternalMontiArcAndCore.g:117:2: ( ( rule__Package__Group__0 ) )
            // InternalMontiArcAndCore.g:118:3: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // InternalMontiArcAndCore.g:119:3: ( rule__Package__Group__0 )
            // InternalMontiArcAndCore.g:119:4: rule__Package__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getGroup()); 

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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleType"
    // InternalMontiArcAndCore.g:128:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:129:1: ( ruleType EOF )
            // InternalMontiArcAndCore.g:130:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMontiArcAndCore.g:137:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:141:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMontiArcAndCore.g:142:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMontiArcAndCore.g:142:2: ( ( rule__Type__Alternatives ) )
            // InternalMontiArcAndCore.g:143:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalMontiArcAndCore.g:144:3: ( rule__Type__Alternatives )
            // InternalMontiArcAndCore.g:144:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleMCPrimitiveType"
    // InternalMontiArcAndCore.g:153:1: entryRuleMCPrimitiveType : ruleMCPrimitiveType EOF ;
    public final void entryRuleMCPrimitiveType() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:154:1: ( ruleMCPrimitiveType EOF )
            // InternalMontiArcAndCore.g:155:1: ruleMCPrimitiveType EOF
            {
             before(grammarAccess.getMCPrimitiveTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleMCPrimitiveType();

            state._fsp--;

             after(grammarAccess.getMCPrimitiveTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMCPrimitiveType"


    // $ANTLR start "ruleMCPrimitiveType"
    // InternalMontiArcAndCore.g:162:1: ruleMCPrimitiveType : ( ( rule__MCPrimitiveType__TypeAssignment ) ) ;
    public final void ruleMCPrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:166:2: ( ( ( rule__MCPrimitiveType__TypeAssignment ) ) )
            // InternalMontiArcAndCore.g:167:2: ( ( rule__MCPrimitiveType__TypeAssignment ) )
            {
            // InternalMontiArcAndCore.g:167:2: ( ( rule__MCPrimitiveType__TypeAssignment ) )
            // InternalMontiArcAndCore.g:168:3: ( rule__MCPrimitiveType__TypeAssignment )
            {
             before(grammarAccess.getMCPrimitiveTypeAccess().getTypeAssignment()); 
            // InternalMontiArcAndCore.g:169:3: ( rule__MCPrimitiveType__TypeAssignment )
            // InternalMontiArcAndCore.g:169:4: rule__MCPrimitiveType__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__MCPrimitiveType__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMCPrimitiveTypeAccess().getTypeAssignment()); 

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
    // $ANTLR end "ruleMCPrimitiveType"


    // $ANTLR start "entryRuleMCObjectType"
    // InternalMontiArcAndCore.g:178:1: entryRuleMCObjectType : ruleMCObjectType EOF ;
    public final void entryRuleMCObjectType() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:179:1: ( ruleMCObjectType EOF )
            // InternalMontiArcAndCore.g:180:1: ruleMCObjectType EOF
            {
             before(grammarAccess.getMCObjectTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleMCObjectType();

            state._fsp--;

             after(grammarAccess.getMCObjectTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMCObjectType"


    // $ANTLR start "ruleMCObjectType"
    // InternalMontiArcAndCore.g:187:1: ruleMCObjectType : ( ( rule__MCObjectType__TypeAssignment ) ) ;
    public final void ruleMCObjectType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:191:2: ( ( ( rule__MCObjectType__TypeAssignment ) ) )
            // InternalMontiArcAndCore.g:192:2: ( ( rule__MCObjectType__TypeAssignment ) )
            {
            // InternalMontiArcAndCore.g:192:2: ( ( rule__MCObjectType__TypeAssignment ) )
            // InternalMontiArcAndCore.g:193:3: ( rule__MCObjectType__TypeAssignment )
            {
             before(grammarAccess.getMCObjectTypeAccess().getTypeAssignment()); 
            // InternalMontiArcAndCore.g:194:3: ( rule__MCObjectType__TypeAssignment )
            // InternalMontiArcAndCore.g:194:4: rule__MCObjectType__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__MCObjectType__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMCObjectTypeAccess().getTypeAssignment()); 

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
    // $ANTLR end "ruleMCObjectType"


    // $ANTLR start "entryRuleMCCollectionType"
    // InternalMontiArcAndCore.g:203:1: entryRuleMCCollectionType : ruleMCCollectionType EOF ;
    public final void entryRuleMCCollectionType() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:204:1: ( ruleMCCollectionType EOF )
            // InternalMontiArcAndCore.g:205:1: ruleMCCollectionType EOF
            {
             before(grammarAccess.getMCCollectionTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleMCCollectionType();

            state._fsp--;

             after(grammarAccess.getMCCollectionTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMCCollectionType"


    // $ANTLR start "ruleMCCollectionType"
    // InternalMontiArcAndCore.g:212:1: ruleMCCollectionType : ( ( rule__MCCollectionType__Group__0 ) ) ;
    public final void ruleMCCollectionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:216:2: ( ( ( rule__MCCollectionType__Group__0 ) ) )
            // InternalMontiArcAndCore.g:217:2: ( ( rule__MCCollectionType__Group__0 ) )
            {
            // InternalMontiArcAndCore.g:217:2: ( ( rule__MCCollectionType__Group__0 ) )
            // InternalMontiArcAndCore.g:218:3: ( rule__MCCollectionType__Group__0 )
            {
             before(grammarAccess.getMCCollectionTypeAccess().getGroup()); 
            // InternalMontiArcAndCore.g:219:3: ( rule__MCCollectionType__Group__0 )
            // InternalMontiArcAndCore.g:219:4: rule__MCCollectionType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MCCollectionType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMCCollectionTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleMCCollectionType"


    // $ANTLR start "entryRuleMCArrayType"
    // InternalMontiArcAndCore.g:228:1: entryRuleMCArrayType : ruleMCArrayType EOF ;
    public final void entryRuleMCArrayType() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:229:1: ( ruleMCArrayType EOF )
            // InternalMontiArcAndCore.g:230:1: ruleMCArrayType EOF
            {
             before(grammarAccess.getMCArrayTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleMCArrayType();

            state._fsp--;

             after(grammarAccess.getMCArrayTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMCArrayType"


    // $ANTLR start "ruleMCArrayType"
    // InternalMontiArcAndCore.g:237:1: ruleMCArrayType : ( ( rule__MCArrayType__Group__0 ) ) ;
    public final void ruleMCArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:241:2: ( ( ( rule__MCArrayType__Group__0 ) ) )
            // InternalMontiArcAndCore.g:242:2: ( ( rule__MCArrayType__Group__0 ) )
            {
            // InternalMontiArcAndCore.g:242:2: ( ( rule__MCArrayType__Group__0 ) )
            // InternalMontiArcAndCore.g:243:3: ( rule__MCArrayType__Group__0 )
            {
             before(grammarAccess.getMCArrayTypeAccess().getGroup()); 
            // InternalMontiArcAndCore.g:244:3: ( rule__MCArrayType__Group__0 )
            // InternalMontiArcAndCore.g:244:4: rule__MCArrayType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MCArrayType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMCArrayTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleMCArrayType"


    // $ANTLR start "entryRuleExpression"
    // InternalMontiArcAndCore.g:253:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:254:1: ( ruleExpression EOF )
            // InternalMontiArcAndCore.g:255:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMontiArcAndCore.g:262:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:266:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalMontiArcAndCore.g:267:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalMontiArcAndCore.g:267:2: ( ( rule__Expression__Alternatives ) )
            // InternalMontiArcAndCore.g:268:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalMontiArcAndCore.g:269:3: ( rule__Expression__Alternatives )
            // InternalMontiArcAndCore.g:269:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleLiteralExpression"
    // InternalMontiArcAndCore.g:278:1: entryRuleLiteralExpression : ruleLiteralExpression EOF ;
    public final void entryRuleLiteralExpression() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:279:1: ( ruleLiteralExpression EOF )
            // InternalMontiArcAndCore.g:280:1: ruleLiteralExpression EOF
            {
             before(grammarAccess.getLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteralExpression();

            state._fsp--;

             after(grammarAccess.getLiteralExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLiteralExpression"


    // $ANTLR start "ruleLiteralExpression"
    // InternalMontiArcAndCore.g:287:1: ruleLiteralExpression : ( ( rule__LiteralExpression__Alternatives ) ) ;
    public final void ruleLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:291:2: ( ( ( rule__LiteralExpression__Alternatives ) ) )
            // InternalMontiArcAndCore.g:292:2: ( ( rule__LiteralExpression__Alternatives ) )
            {
            // InternalMontiArcAndCore.g:292:2: ( ( rule__LiteralExpression__Alternatives ) )
            // InternalMontiArcAndCore.g:293:3: ( rule__LiteralExpression__Alternatives )
            {
             before(grammarAccess.getLiteralExpressionAccess().getAlternatives()); 
            // InternalMontiArcAndCore.g:294:3: ( rule__LiteralExpression__Alternatives )
            // InternalMontiArcAndCore.g:294:4: rule__LiteralExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LiteralExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLiteralExpression"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalMontiArcAndCore.g:303:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:304:1: ( ruleNumberLiteral EOF )
            // InternalMontiArcAndCore.g:305:1: ruleNumberLiteral EOF
            {
             before(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberLiteral();

            state._fsp--;

             after(grammarAccess.getNumberLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalMontiArcAndCore.g:312:1: ruleNumberLiteral : ( ( rule__NumberLiteral__LiteralAssignment ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:316:2: ( ( ( rule__NumberLiteral__LiteralAssignment ) ) )
            // InternalMontiArcAndCore.g:317:2: ( ( rule__NumberLiteral__LiteralAssignment ) )
            {
            // InternalMontiArcAndCore.g:317:2: ( ( rule__NumberLiteral__LiteralAssignment ) )
            // InternalMontiArcAndCore.g:318:3: ( rule__NumberLiteral__LiteralAssignment )
            {
             before(grammarAccess.getNumberLiteralAccess().getLiteralAssignment()); 
            // InternalMontiArcAndCore.g:319:3: ( rule__NumberLiteral__LiteralAssignment )
            // InternalMontiArcAndCore.g:319:4: rule__NumberLiteral__LiteralAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__LiteralAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberLiteralAccess().getLiteralAssignment()); 

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
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalMontiArcAndCore.g:328:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:329:1: ( ruleStringLiteral EOF )
            // InternalMontiArcAndCore.g:330:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalMontiArcAndCore.g:337:1: ruleStringLiteral : ( ( rule__StringLiteral__LiteralAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:341:2: ( ( ( rule__StringLiteral__LiteralAssignment ) ) )
            // InternalMontiArcAndCore.g:342:2: ( ( rule__StringLiteral__LiteralAssignment ) )
            {
            // InternalMontiArcAndCore.g:342:2: ( ( rule__StringLiteral__LiteralAssignment ) )
            // InternalMontiArcAndCore.g:343:3: ( rule__StringLiteral__LiteralAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getLiteralAssignment()); 
            // InternalMontiArcAndCore.g:344:3: ( rule__StringLiteral__LiteralAssignment )
            // InternalMontiArcAndCore.g:344:4: rule__StringLiteral__LiteralAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteral__LiteralAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getLiteralAssignment()); 

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleNameExpression"
    // InternalMontiArcAndCore.g:353:1: entryRuleNameExpression : ruleNameExpression EOF ;
    public final void entryRuleNameExpression() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:354:1: ( ruleNameExpression EOF )
            // InternalMontiArcAndCore.g:355:1: ruleNameExpression EOF
            {
             before(grammarAccess.getNameExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleNameExpression();

            state._fsp--;

             after(grammarAccess.getNameExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNameExpression"


    // $ANTLR start "ruleNameExpression"
    // InternalMontiArcAndCore.g:362:1: ruleNameExpression : ( ( rule__NameExpression__Alternatives ) ) ;
    public final void ruleNameExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:366:2: ( ( ( rule__NameExpression__Alternatives ) ) )
            // InternalMontiArcAndCore.g:367:2: ( ( rule__NameExpression__Alternatives ) )
            {
            // InternalMontiArcAndCore.g:367:2: ( ( rule__NameExpression__Alternatives ) )
            // InternalMontiArcAndCore.g:368:3: ( rule__NameExpression__Alternatives )
            {
             before(grammarAccess.getNameExpressionAccess().getAlternatives()); 
            // InternalMontiArcAndCore.g:369:3: ( rule__NameExpression__Alternatives )
            // InternalMontiArcAndCore.g:369:4: rule__NameExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NameExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNameExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNameExpression"


    // $ANTLR start "entryRuleBinaryExpression"
    // InternalMontiArcAndCore.g:378:1: entryRuleBinaryExpression : ruleBinaryExpression EOF ;
    public final void entryRuleBinaryExpression() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:379:1: ( ruleBinaryExpression EOF )
            // InternalMontiArcAndCore.g:380:1: ruleBinaryExpression EOF
            {
             before(grammarAccess.getBinaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleBinaryExpression();

            state._fsp--;

             after(grammarAccess.getBinaryExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBinaryExpression"


    // $ANTLR start "ruleBinaryExpression"
    // InternalMontiArcAndCore.g:387:1: ruleBinaryExpression : ( ( rule__BinaryExpression__Group__0 ) ) ;
    public final void ruleBinaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:391:2: ( ( ( rule__BinaryExpression__Group__0 ) ) )
            // InternalMontiArcAndCore.g:392:2: ( ( rule__BinaryExpression__Group__0 ) )
            {
            // InternalMontiArcAndCore.g:392:2: ( ( rule__BinaryExpression__Group__0 ) )
            // InternalMontiArcAndCore.g:393:3: ( rule__BinaryExpression__Group__0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getGroup()); 
            // InternalMontiArcAndCore.g:394:3: ( rule__BinaryExpression__Group__0 )
            // InternalMontiArcAndCore.g:394:4: rule__BinaryExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleBinaryExpression"


    // $ANTLR start "entryRuleArguments"
    // InternalMontiArcAndCore.g:403:1: entryRuleArguments : ruleArguments EOF ;
    public final void entryRuleArguments() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:404:1: ( ruleArguments EOF )
            // InternalMontiArcAndCore.g:405:1: ruleArguments EOF
            {
             before(grammarAccess.getArgumentsRule()); 
            pushFollow(FOLLOW_1);
            ruleArguments();

            state._fsp--;

             after(grammarAccess.getArgumentsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleArguments"


    // $ANTLR start "ruleArguments"
    // InternalMontiArcAndCore.g:412:1: ruleArguments : ( ( rule__Arguments__Group__0 ) ) ;
    public final void ruleArguments() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:416:2: ( ( ( rule__Arguments__Group__0 ) ) )
            // InternalMontiArcAndCore.g:417:2: ( ( rule__Arguments__Group__0 ) )
            {
            // InternalMontiArcAndCore.g:417:2: ( ( rule__Arguments__Group__0 ) )
            // InternalMontiArcAndCore.g:418:3: ( rule__Arguments__Group__0 )
            {
             before(grammarAccess.getArgumentsAccess().getGroup()); 
            // InternalMontiArcAndCore.g:419:3: ( rule__Arguments__Group__0 )
            // InternalMontiArcAndCore.g:419:4: rule__Arguments__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Arguments__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArgumentsAccess().getGroup()); 

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
    // $ANTLR end "ruleArguments"


    // $ANTLR start "entryRuleArgument"
    // InternalMontiArcAndCore.g:428:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:429:1: ( ruleArgument EOF )
            // InternalMontiArcAndCore.g:430:1: ruleArgument EOF
            {
             before(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_1);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getArgumentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // InternalMontiArcAndCore.g:437:1: ruleArgument : ( ( rule__Argument__Group__0 ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:441:2: ( ( ( rule__Argument__Group__0 ) ) )
            // InternalMontiArcAndCore.g:442:2: ( ( rule__Argument__Group__0 ) )
            {
            // InternalMontiArcAndCore.g:442:2: ( ( rule__Argument__Group__0 ) )
            // InternalMontiArcAndCore.g:443:3: ( rule__Argument__Group__0 )
            {
             before(grammarAccess.getArgumentAccess().getGroup()); 
            // InternalMontiArcAndCore.g:444:3: ( rule__Argument__Group__0 )
            // InternalMontiArcAndCore.g:444:4: rule__Argument__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Argument__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getGroup()); 

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
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleClassDiagramCompilationUnit"
    // InternalMontiArcAndCore.g:453:1: entryRuleClassDiagramCompilationUnit : ruleClassDiagramCompilationUnit EOF ;
    public final void entryRuleClassDiagramCompilationUnit() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:454:1: ( ruleClassDiagramCompilationUnit EOF )
            // InternalMontiArcAndCore.g:455:1: ruleClassDiagramCompilationUnit EOF
            {
             before(grammarAccess.getClassDiagramCompilationUnitRule()); 
            pushFollow(FOLLOW_1);
            ruleClassDiagramCompilationUnit();

            state._fsp--;

             after(grammarAccess.getClassDiagramCompilationUnitRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClassDiagramCompilationUnit"


    // $ANTLR start "ruleClassDiagramCompilationUnit"
    // InternalMontiArcAndCore.g:462:1: ruleClassDiagramCompilationUnit : ( ( rule__ClassDiagramCompilationUnit__Group__0 ) ) ;
    public final void ruleClassDiagramCompilationUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:466:2: ( ( ( rule__ClassDiagramCompilationUnit__Group__0 ) ) )
            // InternalMontiArcAndCore.g:467:2: ( ( rule__ClassDiagramCompilationUnit__Group__0 ) )
            {
            // InternalMontiArcAndCore.g:467:2: ( ( rule__ClassDiagramCompilationUnit__Group__0 ) )
            // InternalMontiArcAndCore.g:468:3: ( rule__ClassDiagramCompilationUnit__Group__0 )
            {
             before(grammarAccess.getClassDiagramCompilationUnitAccess().getGroup()); 
            // InternalMontiArcAndCore.g:469:3: ( rule__ClassDiagramCompilationUnit__Group__0 )
            // InternalMontiArcAndCore.g:469:4: rule__ClassDiagramCompilationUnit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassDiagramCompilationUnit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassDiagramCompilationUnitAccess().getGroup()); 

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
    // $ANTLR end "ruleClassDiagramCompilationUnit"


    // $ANTLR start "entryRuleClassDiagram"
    // InternalMontiArcAndCore.g:478:1: entryRuleClassDiagram : ruleClassDiagram EOF ;
    public final void entryRuleClassDiagram() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:479:1: ( ruleClassDiagram EOF )
            // InternalMontiArcAndCore.g:480:1: ruleClassDiagram EOF
            {
             before(grammarAccess.getClassDiagramRule()); 
            pushFollow(FOLLOW_1);
            ruleClassDiagram();

            state._fsp--;

             after(grammarAccess.getClassDiagramRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClassDiagram"


    // $ANTLR start "ruleClassDiagram"
    // InternalMontiArcAndCore.g:487:1: ruleClassDiagram : ( ( rule__ClassDiagram__Group__0 ) ) ;
    public final void ruleClassDiagram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:491:2: ( ( ( rule__ClassDiagram__Group__0 ) ) )
            // InternalMontiArcAndCore.g:492:2: ( ( rule__ClassDiagram__Group__0 ) )
            {
            // InternalMontiArcAndCore.g:492:2: ( ( rule__ClassDiagram__Group__0 ) )
            // InternalMontiArcAndCore.g:493:3: ( rule__ClassDiagram__Group__0 )
            {
             before(grammarAccess.getClassDiagramAccess().getGroup()); 
            // InternalMontiArcAndCore.g:494:3: ( rule__ClassDiagram__Group__0 )
            // InternalMontiArcAndCore.g:494:4: rule__ClassDiagram__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassDiagram__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassDiagramAccess().getGroup()); 

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
    // $ANTLR end "ruleClassDiagram"


    // $ANTLR start "entryRuleCDDefinition"
    // InternalMontiArcAndCore.g:503:1: entryRuleCDDefinition : ruleCDDefinition EOF ;
    public final void entryRuleCDDefinition() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:504:1: ( ruleCDDefinition EOF )
            // InternalMontiArcAndCore.g:505:1: ruleCDDefinition EOF
            {
             before(grammarAccess.getCDDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleCDDefinition();

            state._fsp--;

             after(grammarAccess.getCDDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCDDefinition"


    // $ANTLR start "ruleCDDefinition"
    // InternalMontiArcAndCore.g:512:1: ruleCDDefinition : ( ( rule__CDDefinition__Alternatives ) ) ;
    public final void ruleCDDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:516:2: ( ( ( rule__CDDefinition__Alternatives ) ) )
            // InternalMontiArcAndCore.g:517:2: ( ( rule__CDDefinition__Alternatives ) )
            {
            // InternalMontiArcAndCore.g:517:2: ( ( rule__CDDefinition__Alternatives ) )
            // InternalMontiArcAndCore.g:518:3: ( rule__CDDefinition__Alternatives )
            {
             before(grammarAccess.getCDDefinitionAccess().getAlternatives()); 
            // InternalMontiArcAndCore.g:519:3: ( rule__CDDefinition__Alternatives )
            // InternalMontiArcAndCore.g:519:4: rule__CDDefinition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CDDefinition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCDDefinitionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCDDefinition"


    // $ANTLR start "entryRuleCDClass"
    // InternalMontiArcAndCore.g:528:1: entryRuleCDClass : ruleCDClass EOF ;
    public final void entryRuleCDClass() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:529:1: ( ruleCDClass EOF )
            // InternalMontiArcAndCore.g:530:1: ruleCDClass EOF
            {
             before(grammarAccess.getCDClassRule()); 
            pushFollow(FOLLOW_1);
            ruleCDClass();

            state._fsp--;

             after(grammarAccess.getCDClassRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCDClass"


    // $ANTLR start "ruleCDClass"
    // InternalMontiArcAndCore.g:537:1: ruleCDClass : ( ( rule__CDClass__Group__0 ) ) ;
    public final void ruleCDClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:541:2: ( ( ( rule__CDClass__Group__0 ) ) )
            // InternalMontiArcAndCore.g:542:2: ( ( rule__CDClass__Group__0 ) )
            {
            // InternalMontiArcAndCore.g:542:2: ( ( rule__CDClass__Group__0 ) )
            // InternalMontiArcAndCore.g:543:3: ( rule__CDClass__Group__0 )
            {
             before(grammarAccess.getCDClassAccess().getGroup()); 
            // InternalMontiArcAndCore.g:544:3: ( rule__CDClass__Group__0 )
            // InternalMontiArcAndCore.g:544:4: rule__CDClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CDClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCDClassAccess().getGroup()); 

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
    // $ANTLR end "ruleCDClass"


    // $ANTLR start "entryRuleCDEnum"
    // InternalMontiArcAndCore.g:553:1: entryRuleCDEnum : ruleCDEnum EOF ;
    public final void entryRuleCDEnum() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:554:1: ( ruleCDEnum EOF )
            // InternalMontiArcAndCore.g:555:1: ruleCDEnum EOF
            {
             before(grammarAccess.getCDEnumRule()); 
            pushFollow(FOLLOW_1);
            ruleCDEnum();

            state._fsp--;

             after(grammarAccess.getCDEnumRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCDEnum"


    // $ANTLR start "ruleCDEnum"
    // InternalMontiArcAndCore.g:562:1: ruleCDEnum : ( ( rule__CDEnum__Group__0 ) ) ;
    public final void ruleCDEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:566:2: ( ( ( rule__CDEnum__Group__0 ) ) )
            // InternalMontiArcAndCore.g:567:2: ( ( rule__CDEnum__Group__0 ) )
            {
            // InternalMontiArcAndCore.g:567:2: ( ( rule__CDEnum__Group__0 ) )
            // InternalMontiArcAndCore.g:568:3: ( rule__CDEnum__Group__0 )
            {
             before(grammarAccess.getCDEnumAccess().getGroup()); 
            // InternalMontiArcAndCore.g:569:3: ( rule__CDEnum__Group__0 )
            // InternalMontiArcAndCore.g:569:4: rule__CDEnum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CDEnum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCDEnumAccess().getGroup()); 

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
    // $ANTLR end "ruleCDEnum"


    // $ANTLR start "entryRuleMember"
    // InternalMontiArcAndCore.g:578:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:579:1: ( ruleMember EOF )
            // InternalMontiArcAndCore.g:580:1: ruleMember EOF
            {
             before(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_1);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getMemberRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalMontiArcAndCore.g:587:1: ruleMember : ( ( rule__Member__Group__0 ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:591:2: ( ( ( rule__Member__Group__0 ) ) )
            // InternalMontiArcAndCore.g:592:2: ( ( rule__Member__Group__0 ) )
            {
            // InternalMontiArcAndCore.g:592:2: ( ( rule__Member__Group__0 ) )
            // InternalMontiArcAndCore.g:593:3: ( rule__Member__Group__0 )
            {
             before(grammarAccess.getMemberAccess().getGroup()); 
            // InternalMontiArcAndCore.g:594:3: ( rule__Member__Group__0 )
            // InternalMontiArcAndCore.g:594:4: rule__Member__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Member__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getGroup()); 

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
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleMACompilationUnit"
    // InternalMontiArcAndCore.g:603:1: entryRuleMACompilationUnit : ruleMACompilationUnit EOF ;
    public final void entryRuleMACompilationUnit() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:604:1: ( ruleMACompilationUnit EOF )
            // InternalMontiArcAndCore.g:605:1: ruleMACompilationUnit EOF
            {
             before(grammarAccess.getMACompilationUnitRule()); 
            pushFollow(FOLLOW_1);
            ruleMACompilationUnit();

            state._fsp--;

             after(grammarAccess.getMACompilationUnitRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMACompilationUnit"


    // $ANTLR start "ruleMACompilationUnit"
    // InternalMontiArcAndCore.g:612:1: ruleMACompilationUnit : ( ( rule__MACompilationUnit__Group__0 ) ) ;
    public final void ruleMACompilationUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:616:2: ( ( ( rule__MACompilationUnit__Group__0 ) ) )
            // InternalMontiArcAndCore.g:617:2: ( ( rule__MACompilationUnit__Group__0 ) )
            {
            // InternalMontiArcAndCore.g:617:2: ( ( rule__MACompilationUnit__Group__0 ) )
            // InternalMontiArcAndCore.g:618:3: ( rule__MACompilationUnit__Group__0 )
            {
             before(grammarAccess.getMACompilationUnitAccess().getGroup()); 
            // InternalMontiArcAndCore.g:619:3: ( rule__MACompilationUnit__Group__0 )
            // InternalMontiArcAndCore.g:619:4: rule__MACompilationUnit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MACompilationUnit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMACompilationUnitAccess().getGroup()); 

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
    // $ANTLR end "ruleMACompilationUnit"


    // $ANTLR start "entryRuleComponent"
    // InternalMontiArcAndCore.g:628:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:629:1: ( ruleComponent EOF )
            // InternalMontiArcAndCore.g:630:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalMontiArcAndCore.g:637:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:641:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalMontiArcAndCore.g:642:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalMontiArcAndCore.g:642:2: ( ( rule__Component__Group__0 ) )
            // InternalMontiArcAndCore.g:643:3: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalMontiArcAndCore.g:644:3: ( rule__Component__Group__0 )
            // InternalMontiArcAndCore.g:644:4: rule__Component__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getGroup()); 

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleParameters"
    // InternalMontiArcAndCore.g:653:1: entryRuleParameters : ruleParameters EOF ;
    public final void entryRuleParameters() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:654:1: ( ruleParameters EOF )
            // InternalMontiArcAndCore.g:655:1: ruleParameters EOF
            {
             before(grammarAccess.getParametersRule()); 
            pushFollow(FOLLOW_1);
            ruleParameters();

            state._fsp--;

             after(grammarAccess.getParametersRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameters"


    // $ANTLR start "ruleParameters"
    // InternalMontiArcAndCore.g:662:1: ruleParameters : ( ( rule__Parameters__Group__0 ) ) ;
    public final void ruleParameters() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:666:2: ( ( ( rule__Parameters__Group__0 ) ) )
            // InternalMontiArcAndCore.g:667:2: ( ( rule__Parameters__Group__0 ) )
            {
            // InternalMontiArcAndCore.g:667:2: ( ( rule__Parameters__Group__0 ) )
            // InternalMontiArcAndCore.g:668:3: ( rule__Parameters__Group__0 )
            {
             before(grammarAccess.getParametersAccess().getGroup()); 
            // InternalMontiArcAndCore.g:669:3: ( rule__Parameters__Group__0 )
            // InternalMontiArcAndCore.g:669:4: rule__Parameters__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameters__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParametersAccess().getGroup()); 

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
    // $ANTLR end "ruleParameters"


    // $ANTLR start "entryRuleParameter"
    // InternalMontiArcAndCore.g:678:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:679:1: ( ruleParameter EOF )
            // InternalMontiArcAndCore.g:680:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalMontiArcAndCore.g:687:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:691:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalMontiArcAndCore.g:692:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalMontiArcAndCore.g:692:2: ( ( rule__Parameter__Group__0 ) )
            // InternalMontiArcAndCore.g:693:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalMontiArcAndCore.g:694:3: ( rule__Parameter__Group__0 )
            // InternalMontiArcAndCore.g:694:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleArcElement"
    // InternalMontiArcAndCore.g:703:1: entryRuleArcElement : ruleArcElement EOF ;
    public final void entryRuleArcElement() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:704:1: ( ruleArcElement EOF )
            // InternalMontiArcAndCore.g:705:1: ruleArcElement EOF
            {
             before(grammarAccess.getArcElementRule()); 
            pushFollow(FOLLOW_1);
            ruleArcElement();

            state._fsp--;

             after(grammarAccess.getArcElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleArcElement"


    // $ANTLR start "ruleArcElement"
    // InternalMontiArcAndCore.g:712:1: ruleArcElement : ( ( rule__ArcElement__Alternatives ) ) ;
    public final void ruleArcElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:716:2: ( ( ( rule__ArcElement__Alternatives ) ) )
            // InternalMontiArcAndCore.g:717:2: ( ( rule__ArcElement__Alternatives ) )
            {
            // InternalMontiArcAndCore.g:717:2: ( ( rule__ArcElement__Alternatives ) )
            // InternalMontiArcAndCore.g:718:3: ( rule__ArcElement__Alternatives )
            {
             before(grammarAccess.getArcElementAccess().getAlternatives()); 
            // InternalMontiArcAndCore.g:719:3: ( rule__ArcElement__Alternatives )
            // InternalMontiArcAndCore.g:719:4: rule__ArcElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ArcElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArcElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleArcElement"


    // $ANTLR start "entryRuleSubComponent"
    // InternalMontiArcAndCore.g:728:1: entryRuleSubComponent : ruleSubComponent EOF ;
    public final void entryRuleSubComponent() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:729:1: ( ruleSubComponent EOF )
            // InternalMontiArcAndCore.g:730:1: ruleSubComponent EOF
            {
             before(grammarAccess.getSubComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleSubComponent();

            state._fsp--;

             after(grammarAccess.getSubComponentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSubComponent"


    // $ANTLR start "ruleSubComponent"
    // InternalMontiArcAndCore.g:737:1: ruleSubComponent : ( ( rule__SubComponent__Group__0 ) ) ;
    public final void ruleSubComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:741:2: ( ( ( rule__SubComponent__Group__0 ) ) )
            // InternalMontiArcAndCore.g:742:2: ( ( rule__SubComponent__Group__0 ) )
            {
            // InternalMontiArcAndCore.g:742:2: ( ( rule__SubComponent__Group__0 ) )
            // InternalMontiArcAndCore.g:743:3: ( rule__SubComponent__Group__0 )
            {
             before(grammarAccess.getSubComponentAccess().getGroup()); 
            // InternalMontiArcAndCore.g:744:3: ( rule__SubComponent__Group__0 )
            // InternalMontiArcAndCore.g:744:4: rule__SubComponent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubComponent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubComponentAccess().getGroup()); 

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
    // $ANTLR end "ruleSubComponent"


    // $ANTLR start "entryRuleConnector"
    // InternalMontiArcAndCore.g:753:1: entryRuleConnector : ruleConnector EOF ;
    public final void entryRuleConnector() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:754:1: ( ruleConnector EOF )
            // InternalMontiArcAndCore.g:755:1: ruleConnector EOF
            {
             before(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_1);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getConnectorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConnector"


    // $ANTLR start "ruleConnector"
    // InternalMontiArcAndCore.g:762:1: ruleConnector : ( ( rule__Connector__Group__0 ) ) ;
    public final void ruleConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:766:2: ( ( ( rule__Connector__Group__0 ) ) )
            // InternalMontiArcAndCore.g:767:2: ( ( rule__Connector__Group__0 ) )
            {
            // InternalMontiArcAndCore.g:767:2: ( ( rule__Connector__Group__0 ) )
            // InternalMontiArcAndCore.g:768:3: ( rule__Connector__Group__0 )
            {
             before(grammarAccess.getConnectorAccess().getGroup()); 
            // InternalMontiArcAndCore.g:769:3: ( rule__Connector__Group__0 )
            // InternalMontiArcAndCore.g:769:4: rule__Connector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Connector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getGroup()); 

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
    // $ANTLR end "ruleConnector"


    // $ANTLR start "entryRulePort"
    // InternalMontiArcAndCore.g:778:1: entryRulePort : rulePort EOF ;
    public final void entryRulePort() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:779:1: ( rulePort EOF )
            // InternalMontiArcAndCore.g:780:1: rulePort EOF
            {
             before(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_1);
            rulePort();

            state._fsp--;

             after(grammarAccess.getPortRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalMontiArcAndCore.g:787:1: rulePort : ( ( rule__Port__Group__0 ) ) ;
    public final void rulePort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:791:2: ( ( ( rule__Port__Group__0 ) ) )
            // InternalMontiArcAndCore.g:792:2: ( ( rule__Port__Group__0 ) )
            {
            // InternalMontiArcAndCore.g:792:2: ( ( rule__Port__Group__0 ) )
            // InternalMontiArcAndCore.g:793:3: ( rule__Port__Group__0 )
            {
             before(grammarAccess.getPortAccess().getGroup()); 
            // InternalMontiArcAndCore.g:794:3: ( rule__Port__Group__0 )
            // InternalMontiArcAndCore.g:794:4: rule__Port__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Port__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getGroup()); 

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
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleCondition"
    // InternalMontiArcAndCore.g:803:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:804:1: ( ruleCondition EOF )
            // InternalMontiArcAndCore.g:805:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalMontiArcAndCore.g:812:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:816:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalMontiArcAndCore.g:817:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalMontiArcAndCore.g:817:2: ( ( rule__Condition__Group__0 ) )
            // InternalMontiArcAndCore.g:818:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalMontiArcAndCore.g:819:3: ( rule__Condition__Group__0 )
            // InternalMontiArcAndCore.g:819:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleNames"
    // InternalMontiArcAndCore.g:828:1: entryRuleNames : ruleNames EOF ;
    public final void entryRuleNames() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:829:1: ( ruleNames EOF )
            // InternalMontiArcAndCore.g:830:1: ruleNames EOF
            {
             before(grammarAccess.getNamesRule()); 
            pushFollow(FOLLOW_1);
            ruleNames();

            state._fsp--;

             after(grammarAccess.getNamesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNames"


    // $ANTLR start "ruleNames"
    // InternalMontiArcAndCore.g:837:1: ruleNames : ( ( rule__Names__Group__0 ) ) ;
    public final void ruleNames() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:841:2: ( ( ( rule__Names__Group__0 ) ) )
            // InternalMontiArcAndCore.g:842:2: ( ( rule__Names__Group__0 ) )
            {
            // InternalMontiArcAndCore.g:842:2: ( ( rule__Names__Group__0 ) )
            // InternalMontiArcAndCore.g:843:3: ( rule__Names__Group__0 )
            {
             before(grammarAccess.getNamesAccess().getGroup()); 
            // InternalMontiArcAndCore.g:844:3: ( rule__Names__Group__0 )
            // InternalMontiArcAndCore.g:844:4: rule__Names__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Names__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamesAccess().getGroup()); 

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
    // $ANTLR end "ruleNames"


    // $ANTLR start "entryRuleVariable"
    // InternalMontiArcAndCore.g:853:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:854:1: ( ruleVariable EOF )
            // InternalMontiArcAndCore.g:855:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMontiArcAndCore.g:862:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:866:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalMontiArcAndCore.g:867:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalMontiArcAndCore.g:867:2: ( ( rule__Variable__Group__0 ) )
            // InternalMontiArcAndCore.g:868:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalMontiArcAndCore.g:869:3: ( rule__Variable__Group__0 )
            // InternalMontiArcAndCore.g:869:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleAutomaton"
    // InternalMontiArcAndCore.g:878:1: entryRuleAutomaton : ruleAutomaton EOF ;
    public final void entryRuleAutomaton() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:879:1: ( ruleAutomaton EOF )
            // InternalMontiArcAndCore.g:880:1: ruleAutomaton EOF
            {
             before(grammarAccess.getAutomatonRule()); 
            pushFollow(FOLLOW_1);
            ruleAutomaton();

            state._fsp--;

             after(grammarAccess.getAutomatonRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAutomaton"


    // $ANTLR start "ruleAutomaton"
    // InternalMontiArcAndCore.g:887:1: ruleAutomaton : ( ( rule__Automaton__Group__0 ) ) ;
    public final void ruleAutomaton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:891:2: ( ( ( rule__Automaton__Group__0 ) ) )
            // InternalMontiArcAndCore.g:892:2: ( ( rule__Automaton__Group__0 ) )
            {
            // InternalMontiArcAndCore.g:892:2: ( ( rule__Automaton__Group__0 ) )
            // InternalMontiArcAndCore.g:893:3: ( rule__Automaton__Group__0 )
            {
             before(grammarAccess.getAutomatonAccess().getGroup()); 
            // InternalMontiArcAndCore.g:894:3: ( rule__Automaton__Group__0 )
            // InternalMontiArcAndCore.g:894:4: rule__Automaton__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Automaton__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAutomatonAccess().getGroup()); 

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
    // $ANTLR end "ruleAutomaton"


    // $ANTLR start "entryRuleState"
    // InternalMontiArcAndCore.g:903:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:904:1: ( ruleState EOF )
            // InternalMontiArcAndCore.g:905:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalMontiArcAndCore.g:912:1: ruleState : ( ( rule__State__Alternatives ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:916:2: ( ( ( rule__State__Alternatives ) ) )
            // InternalMontiArcAndCore.g:917:2: ( ( rule__State__Alternatives ) )
            {
            // InternalMontiArcAndCore.g:917:2: ( ( rule__State__Alternatives ) )
            // InternalMontiArcAndCore.g:918:3: ( rule__State__Alternatives )
            {
             before(grammarAccess.getStateAccess().getAlternatives()); 
            // InternalMontiArcAndCore.g:919:3: ( rule__State__Alternatives )
            // InternalMontiArcAndCore.g:919:4: rule__State__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__State__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getAlternatives()); 

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleSCState"
    // InternalMontiArcAndCore.g:928:1: entryRuleSCState : ruleSCState EOF ;
    public final void entryRuleSCState() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:929:1: ( ruleSCState EOF )
            // InternalMontiArcAndCore.g:930:1: ruleSCState EOF
            {
             before(grammarAccess.getSCStateRule()); 
            pushFollow(FOLLOW_1);
            ruleSCState();

            state._fsp--;

             after(grammarAccess.getSCStateRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSCState"


    // $ANTLR start "ruleSCState"
    // InternalMontiArcAndCore.g:937:1: ruleSCState : ( ( rule__SCState__Group__0 ) ) ;
    public final void ruleSCState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:941:2: ( ( ( rule__SCState__Group__0 ) ) )
            // InternalMontiArcAndCore.g:942:2: ( ( rule__SCState__Group__0 ) )
            {
            // InternalMontiArcAndCore.g:942:2: ( ( rule__SCState__Group__0 ) )
            // InternalMontiArcAndCore.g:943:3: ( rule__SCState__Group__0 )
            {
             before(grammarAccess.getSCStateAccess().getGroup()); 
            // InternalMontiArcAndCore.g:944:3: ( rule__SCState__Group__0 )
            // InternalMontiArcAndCore.g:944:4: rule__SCState__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SCState__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSCStateAccess().getGroup()); 

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
    // $ANTLR end "ruleSCState"


    // $ANTLR start "entryRuleInvState"
    // InternalMontiArcAndCore.g:953:1: entryRuleInvState : ruleInvState EOF ;
    public final void entryRuleInvState() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:954:1: ( ruleInvState EOF )
            // InternalMontiArcAndCore.g:955:1: ruleInvState EOF
            {
             before(grammarAccess.getInvStateRule()); 
            pushFollow(FOLLOW_1);
            ruleInvState();

            state._fsp--;

             after(grammarAccess.getInvStateRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInvState"


    // $ANTLR start "ruleInvState"
    // InternalMontiArcAndCore.g:962:1: ruleInvState : ( ( rule__InvState__Group__0 ) ) ;
    public final void ruleInvState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:966:2: ( ( ( rule__InvState__Group__0 ) ) )
            // InternalMontiArcAndCore.g:967:2: ( ( rule__InvState__Group__0 ) )
            {
            // InternalMontiArcAndCore.g:967:2: ( ( rule__InvState__Group__0 ) )
            // InternalMontiArcAndCore.g:968:3: ( rule__InvState__Group__0 )
            {
             before(grammarAccess.getInvStateAccess().getGroup()); 
            // InternalMontiArcAndCore.g:969:3: ( rule__InvState__Group__0 )
            // InternalMontiArcAndCore.g:969:4: rule__InvState__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InvState__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInvStateAccess().getGroup()); 

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
    // $ANTLR end "ruleInvState"


    // $ANTLR start "entryRuleSCSAnte"
    // InternalMontiArcAndCore.g:978:1: entryRuleSCSAnte : ruleSCSAnte EOF ;
    public final void entryRuleSCSAnte() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:979:1: ( ruleSCSAnte EOF )
            // InternalMontiArcAndCore.g:980:1: ruleSCSAnte EOF
            {
             before(grammarAccess.getSCSAnteRule()); 
            pushFollow(FOLLOW_1);
            ruleSCSAnte();

            state._fsp--;

             after(grammarAccess.getSCSAnteRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSCSAnte"


    // $ANTLR start "ruleSCSAnte"
    // InternalMontiArcAndCore.g:987:1: ruleSCSAnte : ( ( rule__SCSAnte__Group__0 ) ) ;
    public final void ruleSCSAnte() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:991:2: ( ( ( rule__SCSAnte__Group__0 ) ) )
            // InternalMontiArcAndCore.g:992:2: ( ( rule__SCSAnte__Group__0 ) )
            {
            // InternalMontiArcAndCore.g:992:2: ( ( rule__SCSAnte__Group__0 ) )
            // InternalMontiArcAndCore.g:993:3: ( rule__SCSAnte__Group__0 )
            {
             before(grammarAccess.getSCSAnteAccess().getGroup()); 
            // InternalMontiArcAndCore.g:994:3: ( rule__SCSAnte__Group__0 )
            // InternalMontiArcAndCore.g:994:4: rule__SCSAnte__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SCSAnte__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSCSAnteAccess().getGroup()); 

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
    // $ANTLR end "ruleSCSAnte"


    // $ANTLR start "entryRuleTransition"
    // InternalMontiArcAndCore.g:1003:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:1004:1: ( ruleTransition EOF )
            // InternalMontiArcAndCore.g:1005:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalMontiArcAndCore.g:1012:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1016:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalMontiArcAndCore.g:1017:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalMontiArcAndCore.g:1017:2: ( ( rule__Transition__Group__0 ) )
            // InternalMontiArcAndCore.g:1018:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalMontiArcAndCore.g:1019:3: ( rule__Transition__Group__0 )
            // InternalMontiArcAndCore.g:1019:4: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleBlock"
    // InternalMontiArcAndCore.g:1028:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:1029:1: ( ruleBlock EOF )
            // InternalMontiArcAndCore.g:1030:1: ruleBlock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getBlockRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalMontiArcAndCore.g:1037:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1041:2: ( ( ( rule__Block__Group__0 ) ) )
            // InternalMontiArcAndCore.g:1042:2: ( ( rule__Block__Group__0 ) )
            {
            // InternalMontiArcAndCore.g:1042:2: ( ( rule__Block__Group__0 ) )
            // InternalMontiArcAndCore.g:1043:3: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // InternalMontiArcAndCore.g:1044:3: ( rule__Block__Group__0 )
            // InternalMontiArcAndCore.g:1044:4: rule__Block__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getGroup()); 

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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleBlockStatement"
    // InternalMontiArcAndCore.g:1053:1: entryRuleBlockStatement : ruleBlockStatement EOF ;
    public final void entryRuleBlockStatement() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:1054:1: ( ruleBlockStatement EOF )
            // InternalMontiArcAndCore.g:1055:1: ruleBlockStatement EOF
            {
             before(grammarAccess.getBlockStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleBlockStatement();

            state._fsp--;

             after(grammarAccess.getBlockStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBlockStatement"


    // $ANTLR start "ruleBlockStatement"
    // InternalMontiArcAndCore.g:1062:1: ruleBlockStatement : ( ( rule__BlockStatement__Alternatives ) ) ;
    public final void ruleBlockStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1066:2: ( ( ( rule__BlockStatement__Alternatives ) ) )
            // InternalMontiArcAndCore.g:1067:2: ( ( rule__BlockStatement__Alternatives ) )
            {
            // InternalMontiArcAndCore.g:1067:2: ( ( rule__BlockStatement__Alternatives ) )
            // InternalMontiArcAndCore.g:1068:3: ( rule__BlockStatement__Alternatives )
            {
             before(grammarAccess.getBlockStatementAccess().getAlternatives()); 
            // InternalMontiArcAndCore.g:1069:3: ( rule__BlockStatement__Alternatives )
            // InternalMontiArcAndCore.g:1069:4: rule__BlockStatement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BlockStatement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBlockStatementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBlockStatement"


    // $ANTLR start "entryRuleSimpleExpression"
    // InternalMontiArcAndCore.g:1078:1: entryRuleSimpleExpression : ruleSimpleExpression EOF ;
    public final void entryRuleSimpleExpression() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:1079:1: ( ruleSimpleExpression EOF )
            // InternalMontiArcAndCore.g:1080:1: ruleSimpleExpression EOF
            {
             before(grammarAccess.getSimpleExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleExpression();

            state._fsp--;

             after(grammarAccess.getSimpleExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSimpleExpression"


    // $ANTLR start "ruleSimpleExpression"
    // InternalMontiArcAndCore.g:1087:1: ruleSimpleExpression : ( ( rule__SimpleExpression__Group__0 ) ) ;
    public final void ruleSimpleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1091:2: ( ( ( rule__SimpleExpression__Group__0 ) ) )
            // InternalMontiArcAndCore.g:1092:2: ( ( rule__SimpleExpression__Group__0 ) )
            {
            // InternalMontiArcAndCore.g:1092:2: ( ( rule__SimpleExpression__Group__0 ) )
            // InternalMontiArcAndCore.g:1093:3: ( rule__SimpleExpression__Group__0 )
            {
             before(grammarAccess.getSimpleExpressionAccess().getGroup()); 
            // InternalMontiArcAndCore.g:1094:3: ( rule__SimpleExpression__Group__0 )
            // InternalMontiArcAndCore.g:1094:4: rule__SimpleExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleSimpleExpression"


    // $ANTLR start "entryRuleSimpleInit"
    // InternalMontiArcAndCore.g:1103:1: entryRuleSimpleInit : ruleSimpleInit EOF ;
    public final void entryRuleSimpleInit() throws RecognitionException {
        try {
            // InternalMontiArcAndCore.g:1104:1: ( ruleSimpleInit EOF )
            // InternalMontiArcAndCore.g:1105:1: ruleSimpleInit EOF
            {
             before(grammarAccess.getSimpleInitRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleInit();

            state._fsp--;

             after(grammarAccess.getSimpleInitRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSimpleInit"


    // $ANTLR start "ruleSimpleInit"
    // InternalMontiArcAndCore.g:1112:1: ruleSimpleInit : ( ( rule__SimpleInit__Group__0 ) ) ;
    public final void ruleSimpleInit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1116:2: ( ( ( rule__SimpleInit__Group__0 ) ) )
            // InternalMontiArcAndCore.g:1117:2: ( ( rule__SimpleInit__Group__0 ) )
            {
            // InternalMontiArcAndCore.g:1117:2: ( ( rule__SimpleInit__Group__0 ) )
            // InternalMontiArcAndCore.g:1118:3: ( rule__SimpleInit__Group__0 )
            {
             before(grammarAccess.getSimpleInitAccess().getGroup()); 
            // InternalMontiArcAndCore.g:1119:3: ( rule__SimpleInit__Group__0 )
            // InternalMontiArcAndCore.g:1119:4: rule__SimpleInit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleInit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleInitAccess().getGroup()); 

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
    // $ANTLR end "ruleSimpleInit"


    // $ANTLR start "ruleOperator"
    // InternalMontiArcAndCore.g:1128:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1132:1: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalMontiArcAndCore.g:1133:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalMontiArcAndCore.g:1133:2: ( ( rule__Operator__Alternatives ) )
            // InternalMontiArcAndCore.g:1134:3: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // InternalMontiArcAndCore.g:1135:3: ( rule__Operator__Alternatives )
            // InternalMontiArcAndCore.g:1135:4: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "ruleSCModifier"
    // InternalMontiArcAndCore.g:1144:1: ruleSCModifier : ( ( rule__SCModifier__Alternatives ) ) ;
    public final void ruleSCModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1148:1: ( ( ( rule__SCModifier__Alternatives ) ) )
            // InternalMontiArcAndCore.g:1149:2: ( ( rule__SCModifier__Alternatives ) )
            {
            // InternalMontiArcAndCore.g:1149:2: ( ( rule__SCModifier__Alternatives ) )
            // InternalMontiArcAndCore.g:1150:3: ( rule__SCModifier__Alternatives )
            {
             before(grammarAccess.getSCModifierAccess().getAlternatives()); 
            // InternalMontiArcAndCore.g:1151:3: ( rule__SCModifier__Alternatives )
            // InternalMontiArcAndCore.g:1151:4: rule__SCModifier__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SCModifier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSCModifierAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSCModifier"


    // $ANTLR start "rule__Package__NameAlternatives_1_0"
    // InternalMontiArcAndCore.g:1159:1: rule__Package__NameAlternatives_1_0 : ( ( RULE_MCQUALIFIEDNAME ) | ( RULE_ID ) );
    public final void rule__Package__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1163:1: ( ( RULE_MCQUALIFIEDNAME ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_MCQUALIFIEDNAME) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMontiArcAndCore.g:1164:2: ( RULE_MCQUALIFIEDNAME )
                    {
                    // InternalMontiArcAndCore.g:1164:2: ( RULE_MCQUALIFIEDNAME )
                    // InternalMontiArcAndCore.g:1165:3: RULE_MCQUALIFIEDNAME
                    {
                     before(grammarAccess.getPackageAccess().getNameMCQUALIFIEDNAMETerminalRuleCall_1_0_0()); 
                    match(input,RULE_MCQUALIFIEDNAME,FOLLOW_2); 
                     after(grammarAccess.getPackageAccess().getNameMCQUALIFIEDNAMETerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:1170:2: ( RULE_ID )
                    {
                    // InternalMontiArcAndCore.g:1170:2: ( RULE_ID )
                    // InternalMontiArcAndCore.g:1171:3: RULE_ID
                    {
                     before(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__Package__NameAlternatives_1_0"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalMontiArcAndCore.g:1180:1: rule__Type__Alternatives : ( ( ruleMCPrimitiveType ) | ( ruleMCArrayType ) | ( ruleMCObjectType ) | ( ruleMCCollectionType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1184:1: ( ( ruleMCPrimitiveType ) | ( ruleMCArrayType ) | ( ruleMCObjectType ) | ( ruleMCCollectionType ) )
            int alt2=4;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalMontiArcAndCore.g:1185:2: ( ruleMCPrimitiveType )
                    {
                    // InternalMontiArcAndCore.g:1185:2: ( ruleMCPrimitiveType )
                    // InternalMontiArcAndCore.g:1186:3: ruleMCPrimitiveType
                    {
                     before(grammarAccess.getTypeAccess().getMCPrimitiveTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMCPrimitiveType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getMCPrimitiveTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:1191:2: ( ruleMCArrayType )
                    {
                    // InternalMontiArcAndCore.g:1191:2: ( ruleMCArrayType )
                    // InternalMontiArcAndCore.g:1192:3: ruleMCArrayType
                    {
                     before(grammarAccess.getTypeAccess().getMCArrayTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMCArrayType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getMCArrayTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMontiArcAndCore.g:1197:2: ( ruleMCObjectType )
                    {
                    // InternalMontiArcAndCore.g:1197:2: ( ruleMCObjectType )
                    // InternalMontiArcAndCore.g:1198:3: ruleMCObjectType
                    {
                     before(grammarAccess.getTypeAccess().getMCObjectTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMCObjectType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getMCObjectTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMontiArcAndCore.g:1203:2: ( ruleMCCollectionType )
                    {
                    // InternalMontiArcAndCore.g:1203:2: ( ruleMCCollectionType )
                    // InternalMontiArcAndCore.g:1204:3: ruleMCCollectionType
                    {
                     before(grammarAccess.getTypeAccess().getMCCollectionTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleMCCollectionType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getMCCollectionTypeParserRuleCall_3()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__MCPrimitiveType__TypeAlternatives_0"
    // InternalMontiArcAndCore.g:1213:1: rule__MCPrimitiveType__TypeAlternatives_0 : ( ( 'boolean' ) | ( 'byte' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'char' ) | ( 'float' ) | ( 'double' ) );
    public final void rule__MCPrimitiveType__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1217:1: ( ( 'boolean' ) | ( 'byte' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'char' ) | ( 'float' ) | ( 'double' ) )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            case 17:
                {
                alt3=4;
                }
                break;
            case 18:
                {
                alt3=5;
                }
                break;
            case 19:
                {
                alt3=6;
                }
                break;
            case 20:
                {
                alt3=7;
                }
                break;
            case 21:
                {
                alt3=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMontiArcAndCore.g:1218:2: ( 'boolean' )
                    {
                    // InternalMontiArcAndCore.g:1218:2: ( 'boolean' )
                    // InternalMontiArcAndCore.g:1219:3: 'boolean'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeBooleanKeyword_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeBooleanKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:1224:2: ( 'byte' )
                    {
                    // InternalMontiArcAndCore.g:1224:2: ( 'byte' )
                    // InternalMontiArcAndCore.g:1225:3: 'byte'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeByteKeyword_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeByteKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMontiArcAndCore.g:1230:2: ( 'short' )
                    {
                    // InternalMontiArcAndCore.g:1230:2: ( 'short' )
                    // InternalMontiArcAndCore.g:1231:3: 'short'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeShortKeyword_0_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeShortKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMontiArcAndCore.g:1236:2: ( 'int' )
                    {
                    // InternalMontiArcAndCore.g:1236:2: ( 'int' )
                    // InternalMontiArcAndCore.g:1237:3: 'int'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeIntKeyword_0_3()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeIntKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMontiArcAndCore.g:1242:2: ( 'long' )
                    {
                    // InternalMontiArcAndCore.g:1242:2: ( 'long' )
                    // InternalMontiArcAndCore.g:1243:3: 'long'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeLongKeyword_0_4()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeLongKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMontiArcAndCore.g:1248:2: ( 'char' )
                    {
                    // InternalMontiArcAndCore.g:1248:2: ( 'char' )
                    // InternalMontiArcAndCore.g:1249:3: 'char'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeCharKeyword_0_5()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeCharKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMontiArcAndCore.g:1254:2: ( 'float' )
                    {
                    // InternalMontiArcAndCore.g:1254:2: ( 'float' )
                    // InternalMontiArcAndCore.g:1255:3: 'float'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeFloatKeyword_0_6()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeFloatKeyword_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMontiArcAndCore.g:1260:2: ( 'double' )
                    {
                    // InternalMontiArcAndCore.g:1260:2: ( 'double' )
                    // InternalMontiArcAndCore.g:1261:3: 'double'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeDoubleKeyword_0_7()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeDoubleKeyword_0_7()); 

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
    // $ANTLR end "rule__MCPrimitiveType__TypeAlternatives_0"


    // $ANTLR start "rule__MCObjectType__TypeAlternatives_0"
    // InternalMontiArcAndCore.g:1270:1: rule__MCObjectType__TypeAlternatives_0 : ( ( 'Boolean' ) | ( 'Byte' ) | ( 'Integer' ) | ( 'Long' ) | ( 'Char' ) | ( 'Double' ) | ( 'String' ) );
    public final void rule__MCObjectType__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1274:1: ( ( 'Boolean' ) | ( 'Byte' ) | ( 'Integer' ) | ( 'Long' ) | ( 'Char' ) | ( 'Double' ) | ( 'String' ) )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt4=1;
                }
                break;
            case 23:
                {
                alt4=2;
                }
                break;
            case 24:
                {
                alt4=3;
                }
                break;
            case 25:
                {
                alt4=4;
                }
                break;
            case 26:
                {
                alt4=5;
                }
                break;
            case 27:
                {
                alt4=6;
                }
                break;
            case 28:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMontiArcAndCore.g:1275:2: ( 'Boolean' )
                    {
                    // InternalMontiArcAndCore.g:1275:2: ( 'Boolean' )
                    // InternalMontiArcAndCore.g:1276:3: 'Boolean'
                    {
                     before(grammarAccess.getMCObjectTypeAccess().getTypeBooleanKeyword_0_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getMCObjectTypeAccess().getTypeBooleanKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:1281:2: ( 'Byte' )
                    {
                    // InternalMontiArcAndCore.g:1281:2: ( 'Byte' )
                    // InternalMontiArcAndCore.g:1282:3: 'Byte'
                    {
                     before(grammarAccess.getMCObjectTypeAccess().getTypeByteKeyword_0_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getMCObjectTypeAccess().getTypeByteKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMontiArcAndCore.g:1287:2: ( 'Integer' )
                    {
                    // InternalMontiArcAndCore.g:1287:2: ( 'Integer' )
                    // InternalMontiArcAndCore.g:1288:3: 'Integer'
                    {
                     before(grammarAccess.getMCObjectTypeAccess().getTypeIntegerKeyword_0_2()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getMCObjectTypeAccess().getTypeIntegerKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMontiArcAndCore.g:1293:2: ( 'Long' )
                    {
                    // InternalMontiArcAndCore.g:1293:2: ( 'Long' )
                    // InternalMontiArcAndCore.g:1294:3: 'Long'
                    {
                     before(grammarAccess.getMCObjectTypeAccess().getTypeLongKeyword_0_3()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getMCObjectTypeAccess().getTypeLongKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMontiArcAndCore.g:1299:2: ( 'Char' )
                    {
                    // InternalMontiArcAndCore.g:1299:2: ( 'Char' )
                    // InternalMontiArcAndCore.g:1300:3: 'Char'
                    {
                     before(grammarAccess.getMCObjectTypeAccess().getTypeCharKeyword_0_4()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getMCObjectTypeAccess().getTypeCharKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMontiArcAndCore.g:1305:2: ( 'Double' )
                    {
                    // InternalMontiArcAndCore.g:1305:2: ( 'Double' )
                    // InternalMontiArcAndCore.g:1306:3: 'Double'
                    {
                     before(grammarAccess.getMCObjectTypeAccess().getTypeDoubleKeyword_0_5()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getMCObjectTypeAccess().getTypeDoubleKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMontiArcAndCore.g:1311:2: ( 'String' )
                    {
                    // InternalMontiArcAndCore.g:1311:2: ( 'String' )
                    // InternalMontiArcAndCore.g:1312:3: 'String'
                    {
                     before(grammarAccess.getMCObjectTypeAccess().getTypeStringKeyword_0_6()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getMCObjectTypeAccess().getTypeStringKeyword_0_6()); 

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
    // $ANTLR end "rule__MCObjectType__TypeAlternatives_0"


    // $ANTLR start "rule__MCCollectionType__CollectionAlternatives_0_0"
    // InternalMontiArcAndCore.g:1321:1: rule__MCCollectionType__CollectionAlternatives_0_0 : ( ( 'Set' ) | ( 'List' ) | ( 'Map' ) | ( 'Optional' ) );
    public final void rule__MCCollectionType__CollectionAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1325:1: ( ( 'Set' ) | ( 'List' ) | ( 'Map' ) | ( 'Optional' ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt5=1;
                }
                break;
            case 30:
                {
                alt5=2;
                }
                break;
            case 31:
                {
                alt5=3;
                }
                break;
            case 32:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMontiArcAndCore.g:1326:2: ( 'Set' )
                    {
                    // InternalMontiArcAndCore.g:1326:2: ( 'Set' )
                    // InternalMontiArcAndCore.g:1327:3: 'Set'
                    {
                     before(grammarAccess.getMCCollectionTypeAccess().getCollectionSetKeyword_0_0_0()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getMCCollectionTypeAccess().getCollectionSetKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:1332:2: ( 'List' )
                    {
                    // InternalMontiArcAndCore.g:1332:2: ( 'List' )
                    // InternalMontiArcAndCore.g:1333:3: 'List'
                    {
                     before(grammarAccess.getMCCollectionTypeAccess().getCollectionListKeyword_0_0_1()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getMCCollectionTypeAccess().getCollectionListKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMontiArcAndCore.g:1338:2: ( 'Map' )
                    {
                    // InternalMontiArcAndCore.g:1338:2: ( 'Map' )
                    // InternalMontiArcAndCore.g:1339:3: 'Map'
                    {
                     before(grammarAccess.getMCCollectionTypeAccess().getCollectionMapKeyword_0_0_2()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getMCCollectionTypeAccess().getCollectionMapKeyword_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMontiArcAndCore.g:1344:2: ( 'Optional' )
                    {
                    // InternalMontiArcAndCore.g:1344:2: ( 'Optional' )
                    // InternalMontiArcAndCore.g:1345:3: 'Optional'
                    {
                     before(grammarAccess.getMCCollectionTypeAccess().getCollectionOptionalKeyword_0_0_3()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getMCCollectionTypeAccess().getCollectionOptionalKeyword_0_0_3()); 

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
    // $ANTLR end "rule__MCCollectionType__CollectionAlternatives_0_0"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalMontiArcAndCore.g:1354:1: rule__Expression__Alternatives : ( ( ruleNameExpression ) | ( ruleLiteralExpression ) | ( ruleBinaryExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1358:1: ( ( ruleNameExpression ) | ( ruleLiteralExpression ) | ( ruleBinaryExpression ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EOF||LA6_1==44||LA6_1==47||(LA6_1>=49 && LA6_1<=50)) ) {
                    alt6=1;
                }
                else if ( ((LA6_1>=33 && LA6_1<=40)) ) {
                    alt6=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_MCQUALIFIEDNAME:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==EOF||LA6_2==44||LA6_2==47||(LA6_2>=49 && LA6_2<=50)) ) {
                    alt6=1;
                }
                else if ( ((LA6_2>=33 && LA6_2<=40)) ) {
                    alt6=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA6_3 = input.LA(2);

                if ( (LA6_3==EOF||LA6_3==44||LA6_3==47||(LA6_3>=49 && LA6_3<=50)) ) {
                    alt6=2;
                }
                else if ( ((LA6_3>=33 && LA6_3<=40)) ) {
                    alt6=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA6_4 = input.LA(2);

                if ( (LA6_4==EOF||LA6_4==44||LA6_4==47||(LA6_4>=49 && LA6_4<=50)) ) {
                    alt6=2;
                }
                else if ( ((LA6_4>=33 && LA6_4<=40)) ) {
                    alt6=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMontiArcAndCore.g:1359:2: ( ruleNameExpression )
                    {
                    // InternalMontiArcAndCore.g:1359:2: ( ruleNameExpression )
                    // InternalMontiArcAndCore.g:1360:3: ruleNameExpression
                    {
                     before(grammarAccess.getExpressionAccess().getNameExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNameExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getNameExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:1365:2: ( ruleLiteralExpression )
                    {
                    // InternalMontiArcAndCore.g:1365:2: ( ruleLiteralExpression )
                    // InternalMontiArcAndCore.g:1366:3: ruleLiteralExpression
                    {
                     before(grammarAccess.getExpressionAccess().getLiteralExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteralExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getLiteralExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMontiArcAndCore.g:1371:2: ( ruleBinaryExpression )
                    {
                    // InternalMontiArcAndCore.g:1371:2: ( ruleBinaryExpression )
                    // InternalMontiArcAndCore.g:1372:3: ruleBinaryExpression
                    {
                     before(grammarAccess.getExpressionAccess().getBinaryExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBinaryExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getBinaryExpressionParserRuleCall_2()); 

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
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__LiteralExpression__Alternatives"
    // InternalMontiArcAndCore.g:1381:1: rule__LiteralExpression__Alternatives : ( ( ruleNumberLiteral ) | ( ruleStringLiteral ) );
    public final void rule__LiteralExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1385:1: ( ( ruleNumberLiteral ) | ( ruleStringLiteral ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_STRING) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMontiArcAndCore.g:1386:2: ( ruleNumberLiteral )
                    {
                    // InternalMontiArcAndCore.g:1386:2: ( ruleNumberLiteral )
                    // InternalMontiArcAndCore.g:1387:3: ruleNumberLiteral
                    {
                     before(grammarAccess.getLiteralExpressionAccess().getNumberLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNumberLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralExpressionAccess().getNumberLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:1392:2: ( ruleStringLiteral )
                    {
                    // InternalMontiArcAndCore.g:1392:2: ( ruleStringLiteral )
                    // InternalMontiArcAndCore.g:1393:3: ruleStringLiteral
                    {
                     before(grammarAccess.getLiteralExpressionAccess().getStringLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStringLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralExpressionAccess().getStringLiteralParserRuleCall_1()); 

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
    // $ANTLR end "rule__LiteralExpression__Alternatives"


    // $ANTLR start "rule__NameExpression__Alternatives"
    // InternalMontiArcAndCore.g:1402:1: rule__NameExpression__Alternatives : ( ( ( rule__NameExpression__NameAssignment_0 ) ) | ( ( rule__NameExpression__QualifiednameAssignment_1 ) ) );
    public final void rule__NameExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1406:1: ( ( ( rule__NameExpression__NameAssignment_0 ) ) | ( ( rule__NameExpression__QualifiednameAssignment_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_MCQUALIFIEDNAME) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMontiArcAndCore.g:1407:2: ( ( rule__NameExpression__NameAssignment_0 ) )
                    {
                    // InternalMontiArcAndCore.g:1407:2: ( ( rule__NameExpression__NameAssignment_0 ) )
                    // InternalMontiArcAndCore.g:1408:3: ( rule__NameExpression__NameAssignment_0 )
                    {
                     before(grammarAccess.getNameExpressionAccess().getNameAssignment_0()); 
                    // InternalMontiArcAndCore.g:1409:3: ( rule__NameExpression__NameAssignment_0 )
                    // InternalMontiArcAndCore.g:1409:4: rule__NameExpression__NameAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NameExpression__NameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNameExpressionAccess().getNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:1413:2: ( ( rule__NameExpression__QualifiednameAssignment_1 ) )
                    {
                    // InternalMontiArcAndCore.g:1413:2: ( ( rule__NameExpression__QualifiednameAssignment_1 ) )
                    // InternalMontiArcAndCore.g:1414:3: ( rule__NameExpression__QualifiednameAssignment_1 )
                    {
                     before(grammarAccess.getNameExpressionAccess().getQualifiednameAssignment_1()); 
                    // InternalMontiArcAndCore.g:1415:3: ( rule__NameExpression__QualifiednameAssignment_1 )
                    // InternalMontiArcAndCore.g:1415:4: rule__NameExpression__QualifiednameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__NameExpression__QualifiednameAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNameExpressionAccess().getQualifiednameAssignment_1()); 

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
    // $ANTLR end "rule__NameExpression__Alternatives"


    // $ANTLR start "rule__BinaryExpression__Literal1Alternatives_0_0"
    // InternalMontiArcAndCore.g:1423:1: rule__BinaryExpression__Literal1Alternatives_0_0 : ( ( ruleLiteralExpression ) | ( ruleNameExpression ) );
    public final void rule__BinaryExpression__Literal1Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1427:1: ( ( ruleLiteralExpression ) | ( ruleNameExpression ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_INT && LA9_0<=RULE_STRING)) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=RULE_MCQUALIFIEDNAME && LA9_0<=RULE_ID)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMontiArcAndCore.g:1428:2: ( ruleLiteralExpression )
                    {
                    // InternalMontiArcAndCore.g:1428:2: ( ruleLiteralExpression )
                    // InternalMontiArcAndCore.g:1429:3: ruleLiteralExpression
                    {
                     before(grammarAccess.getBinaryExpressionAccess().getLiteral1LiteralExpressionParserRuleCall_0_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteralExpression();

                    state._fsp--;

                     after(grammarAccess.getBinaryExpressionAccess().getLiteral1LiteralExpressionParserRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:1434:2: ( ruleNameExpression )
                    {
                    // InternalMontiArcAndCore.g:1434:2: ( ruleNameExpression )
                    // InternalMontiArcAndCore.g:1435:3: ruleNameExpression
                    {
                     before(grammarAccess.getBinaryExpressionAccess().getLiteral1NameExpressionParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNameExpression();

                    state._fsp--;

                     after(grammarAccess.getBinaryExpressionAccess().getLiteral1NameExpressionParserRuleCall_0_0_1()); 

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
    // $ANTLR end "rule__BinaryExpression__Literal1Alternatives_0_0"


    // $ANTLR start "rule__BinaryExpression__Literal2Alternatives_2_0"
    // InternalMontiArcAndCore.g:1444:1: rule__BinaryExpression__Literal2Alternatives_2_0 : ( ( ruleLiteralExpression ) | ( ruleNameExpression ) );
    public final void rule__BinaryExpression__Literal2Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1448:1: ( ( ruleLiteralExpression ) | ( ruleNameExpression ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_INT && LA10_0<=RULE_STRING)) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=RULE_MCQUALIFIEDNAME && LA10_0<=RULE_ID)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMontiArcAndCore.g:1449:2: ( ruleLiteralExpression )
                    {
                    // InternalMontiArcAndCore.g:1449:2: ( ruleLiteralExpression )
                    // InternalMontiArcAndCore.g:1450:3: ruleLiteralExpression
                    {
                     before(grammarAccess.getBinaryExpressionAccess().getLiteral2LiteralExpressionParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteralExpression();

                    state._fsp--;

                     after(grammarAccess.getBinaryExpressionAccess().getLiteral2LiteralExpressionParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:1455:2: ( ruleNameExpression )
                    {
                    // InternalMontiArcAndCore.g:1455:2: ( ruleNameExpression )
                    // InternalMontiArcAndCore.g:1456:3: ruleNameExpression
                    {
                     before(grammarAccess.getBinaryExpressionAccess().getLiteral2NameExpressionParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNameExpression();

                    state._fsp--;

                     after(grammarAccess.getBinaryExpressionAccess().getLiteral2NameExpressionParserRuleCall_2_0_1()); 

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
    // $ANTLR end "rule__BinaryExpression__Literal2Alternatives_2_0"


    // $ANTLR start "rule__CDDefinition__Alternatives"
    // InternalMontiArcAndCore.g:1465:1: rule__CDDefinition__Alternatives : ( ( ruleCDClass ) | ( ruleCDEnum ) );
    public final void rule__CDDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1469:1: ( ( ruleCDClass ) | ( ruleCDEnum ) )
            int alt11=2;
            switch ( input.LA(1) ) {
            case 67:
                {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==57) ) {
                    alt11=2;
                }
                else if ( (LA11_1==54) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
                }
                break;
            case 54:
                {
                alt11=1;
                }
                break;
            case 57:
                {
                alt11=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMontiArcAndCore.g:1470:2: ( ruleCDClass )
                    {
                    // InternalMontiArcAndCore.g:1470:2: ( ruleCDClass )
                    // InternalMontiArcAndCore.g:1471:3: ruleCDClass
                    {
                     before(grammarAccess.getCDDefinitionAccess().getCDClassParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCDClass();

                    state._fsp--;

                     after(grammarAccess.getCDDefinitionAccess().getCDClassParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:1476:2: ( ruleCDEnum )
                    {
                    // InternalMontiArcAndCore.g:1476:2: ( ruleCDEnum )
                    // InternalMontiArcAndCore.g:1477:3: ruleCDEnum
                    {
                     before(grammarAccess.getCDDefinitionAccess().getCDEnumParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCDEnum();

                    state._fsp--;

                     after(grammarAccess.getCDDefinitionAccess().getCDEnumParserRuleCall_1()); 

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
    // $ANTLR end "rule__CDDefinition__Alternatives"


    // $ANTLR start "rule__Member__TypeAlternatives_0_0"
    // InternalMontiArcAndCore.g:1486:1: rule__Member__TypeAlternatives_0_0 : ( ( ruleType ) | ( ruleCDDefinition ) );
    public final void rule__Member__TypeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1490:1: ( ( ruleType ) | ( ruleCDDefinition ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=14 && LA12_0<=32)) ) {
                alt12=1;
            }
            else if ( (LA12_0==54||LA12_0==57||LA12_0==67) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMontiArcAndCore.g:1491:2: ( ruleType )
                    {
                    // InternalMontiArcAndCore.g:1491:2: ( ruleType )
                    // InternalMontiArcAndCore.g:1492:3: ruleType
                    {
                     before(grammarAccess.getMemberAccess().getTypeTypeParserRuleCall_0_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getTypeTypeParserRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:1497:2: ( ruleCDDefinition )
                    {
                    // InternalMontiArcAndCore.g:1497:2: ( ruleCDDefinition )
                    // InternalMontiArcAndCore.g:1498:3: ruleCDDefinition
                    {
                     before(grammarAccess.getMemberAccess().getTypeCDDefinitionParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCDDefinition();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getTypeCDDefinitionParserRuleCall_0_0_1()); 

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
    // $ANTLR end "rule__Member__TypeAlternatives_0_0"


    // $ANTLR start "rule__ArcElement__Alternatives"
    // InternalMontiArcAndCore.g:1507:1: rule__ArcElement__Alternatives : ( ( ruleComponent ) | ( ruleSubComponent ) | ( ruleConnector ) | ( rulePort ) | ( ruleVariable ) | ( ruleAutomaton ) );
    public final void rule__ArcElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1511:1: ( ( ruleComponent ) | ( ruleSubComponent ) | ( ruleConnector ) | ( rulePort ) | ( ruleVariable ) | ( ruleAutomaton ) )
            int alt13=6;
            switch ( input.LA(1) ) {
            case 58:
                {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==RULE_ID) ) {
                    alt13=1;
                }
                else if ( ((LA13_1>=14 && LA13_1<=32)) ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA13_2 = input.LA(2);

                if ( (LA13_2==60) ) {
                    alt13=3;
                }
                else if ( ((LA13_2>=RULE_MCQUALIFIEDNAME && LA13_2<=RULE_ID)) ) {
                    alt13=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_MCQUALIFIEDNAME:
                {
                alt13=3;
                }
                break;
            case 61:
                {
                alt13=4;
                }
                break;
            case RULE_SYNC:
            case 65:
                {
                alt13=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalMontiArcAndCore.g:1512:2: ( ruleComponent )
                    {
                    // InternalMontiArcAndCore.g:1512:2: ( ruleComponent )
                    // InternalMontiArcAndCore.g:1513:3: ruleComponent
                    {
                     before(grammarAccess.getArcElementAccess().getComponentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleComponent();

                    state._fsp--;

                     after(grammarAccess.getArcElementAccess().getComponentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:1518:2: ( ruleSubComponent )
                    {
                    // InternalMontiArcAndCore.g:1518:2: ( ruleSubComponent )
                    // InternalMontiArcAndCore.g:1519:3: ruleSubComponent
                    {
                     before(grammarAccess.getArcElementAccess().getSubComponentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSubComponent();

                    state._fsp--;

                     after(grammarAccess.getArcElementAccess().getSubComponentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMontiArcAndCore.g:1524:2: ( ruleConnector )
                    {
                    // InternalMontiArcAndCore.g:1524:2: ( ruleConnector )
                    // InternalMontiArcAndCore.g:1525:3: ruleConnector
                    {
                     before(grammarAccess.getArcElementAccess().getConnectorParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleConnector();

                    state._fsp--;

                     after(grammarAccess.getArcElementAccess().getConnectorParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMontiArcAndCore.g:1530:2: ( rulePort )
                    {
                    // InternalMontiArcAndCore.g:1530:2: ( rulePort )
                    // InternalMontiArcAndCore.g:1531:3: rulePort
                    {
                     before(grammarAccess.getArcElementAccess().getPortParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    rulePort();

                    state._fsp--;

                     after(grammarAccess.getArcElementAccess().getPortParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMontiArcAndCore.g:1536:2: ( ruleVariable )
                    {
                    // InternalMontiArcAndCore.g:1536:2: ( ruleVariable )
                    // InternalMontiArcAndCore.g:1537:3: ruleVariable
                    {
                     before(grammarAccess.getArcElementAccess().getVariableParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getArcElementAccess().getVariableParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMontiArcAndCore.g:1542:2: ( ruleAutomaton )
                    {
                    // InternalMontiArcAndCore.g:1542:2: ( ruleAutomaton )
                    // InternalMontiArcAndCore.g:1543:3: ruleAutomaton
                    {
                     before(grammarAccess.getArcElementAccess().getAutomatonParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleAutomaton();

                    state._fsp--;

                     after(grammarAccess.getArcElementAccess().getAutomatonParserRuleCall_5()); 

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
    // $ANTLR end "rule__ArcElement__Alternatives"


    // $ANTLR start "rule__Connector__SourceAlternatives_0_0"
    // InternalMontiArcAndCore.g:1552:1: rule__Connector__SourceAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_MCQUALIFIEDNAME ) );
    public final void rule__Connector__SourceAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1556:1: ( ( RULE_ID ) | ( RULE_MCQUALIFIEDNAME ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_MCQUALIFIEDNAME) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMontiArcAndCore.g:1557:2: ( RULE_ID )
                    {
                    // InternalMontiArcAndCore.g:1557:2: ( RULE_ID )
                    // InternalMontiArcAndCore.g:1558:3: RULE_ID
                    {
                     before(grammarAccess.getConnectorAccess().getSourceIDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getConnectorAccess().getSourceIDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:1563:2: ( RULE_MCQUALIFIEDNAME )
                    {
                    // InternalMontiArcAndCore.g:1563:2: ( RULE_MCQUALIFIEDNAME )
                    // InternalMontiArcAndCore.g:1564:3: RULE_MCQUALIFIEDNAME
                    {
                     before(grammarAccess.getConnectorAccess().getSourceMCQUALIFIEDNAMETerminalRuleCall_0_0_1()); 
                    match(input,RULE_MCQUALIFIEDNAME,FOLLOW_2); 
                     after(grammarAccess.getConnectorAccess().getSourceMCQUALIFIEDNAMETerminalRuleCall_0_0_1()); 

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
    // $ANTLR end "rule__Connector__SourceAlternatives_0_0"


    // $ANTLR start "rule__Connector__TargetAlternatives_2_0"
    // InternalMontiArcAndCore.g:1573:1: rule__Connector__TargetAlternatives_2_0 : ( ( RULE_ID ) | ( RULE_MCQUALIFIEDNAME ) );
    public final void rule__Connector__TargetAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1577:1: ( ( RULE_ID ) | ( RULE_MCQUALIFIEDNAME ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_MCQUALIFIEDNAME) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMontiArcAndCore.g:1578:2: ( RULE_ID )
                    {
                    // InternalMontiArcAndCore.g:1578:2: ( RULE_ID )
                    // InternalMontiArcAndCore.g:1579:3: RULE_ID
                    {
                     before(grammarAccess.getConnectorAccess().getTargetIDTerminalRuleCall_2_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getConnectorAccess().getTargetIDTerminalRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:1584:2: ( RULE_MCQUALIFIEDNAME )
                    {
                    // InternalMontiArcAndCore.g:1584:2: ( RULE_MCQUALIFIEDNAME )
                    // InternalMontiArcAndCore.g:1585:3: RULE_MCQUALIFIEDNAME
                    {
                     before(grammarAccess.getConnectorAccess().getTargetMCQUALIFIEDNAMETerminalRuleCall_2_0_1()); 
                    match(input,RULE_MCQUALIFIEDNAME,FOLLOW_2); 
                     after(grammarAccess.getConnectorAccess().getTargetMCQUALIFIEDNAMETerminalRuleCall_2_0_1()); 

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
    // $ANTLR end "rule__Connector__TargetAlternatives_2_0"


    // $ANTLR start "rule__Port__Alternatives_2"
    // InternalMontiArcAndCore.g:1594:1: rule__Port__Alternatives_2 : ( ( ( rule__Port__InAssignment_2_0 ) ) | ( ( rule__Port__OutAssignment_2_1 ) ) );
    public final void rule__Port__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1598:1: ( ( ( rule__Port__InAssignment_2_0 ) ) | ( ( rule__Port__OutAssignment_2_1 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==68) ) {
                alt16=1;
            }
            else if ( (LA16_0==69) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMontiArcAndCore.g:1599:2: ( ( rule__Port__InAssignment_2_0 ) )
                    {
                    // InternalMontiArcAndCore.g:1599:2: ( ( rule__Port__InAssignment_2_0 ) )
                    // InternalMontiArcAndCore.g:1600:3: ( rule__Port__InAssignment_2_0 )
                    {
                     before(grammarAccess.getPortAccess().getInAssignment_2_0()); 
                    // InternalMontiArcAndCore.g:1601:3: ( rule__Port__InAssignment_2_0 )
                    // InternalMontiArcAndCore.g:1601:4: rule__Port__InAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Port__InAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPortAccess().getInAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:1605:2: ( ( rule__Port__OutAssignment_2_1 ) )
                    {
                    // InternalMontiArcAndCore.g:1605:2: ( ( rule__Port__OutAssignment_2_1 ) )
                    // InternalMontiArcAndCore.g:1606:3: ( rule__Port__OutAssignment_2_1 )
                    {
                     before(grammarAccess.getPortAccess().getOutAssignment_2_1()); 
                    // InternalMontiArcAndCore.g:1607:3: ( rule__Port__OutAssignment_2_1 )
                    // InternalMontiArcAndCore.g:1607:4: rule__Port__OutAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Port__OutAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPortAccess().getOutAssignment_2_1()); 

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
    // $ANTLR end "rule__Port__Alternatives_2"


    // $ANTLR start "rule__Port__Alternatives_3"
    // InternalMontiArcAndCore.g:1615:1: rule__Port__Alternatives_3 : ( ( ( rule__Port__TypeAssignment_3_0 ) ) | ( ( rule__Port__DataTypeAssignment_3_1 ) ) );
    public final void rule__Port__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1619:1: ( ( ( rule__Port__TypeAssignment_3_0 ) ) | ( ( rule__Port__DataTypeAssignment_3_1 ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=14 && LA17_0<=32)) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalMontiArcAndCore.g:1620:2: ( ( rule__Port__TypeAssignment_3_0 ) )
                    {
                    // InternalMontiArcAndCore.g:1620:2: ( ( rule__Port__TypeAssignment_3_0 ) )
                    // InternalMontiArcAndCore.g:1621:3: ( rule__Port__TypeAssignment_3_0 )
                    {
                     before(grammarAccess.getPortAccess().getTypeAssignment_3_0()); 
                    // InternalMontiArcAndCore.g:1622:3: ( rule__Port__TypeAssignment_3_0 )
                    // InternalMontiArcAndCore.g:1622:4: rule__Port__TypeAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Port__TypeAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPortAccess().getTypeAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:1626:2: ( ( rule__Port__DataTypeAssignment_3_1 ) )
                    {
                    // InternalMontiArcAndCore.g:1626:2: ( ( rule__Port__DataTypeAssignment_3_1 ) )
                    // InternalMontiArcAndCore.g:1627:3: ( rule__Port__DataTypeAssignment_3_1 )
                    {
                     before(grammarAccess.getPortAccess().getDataTypeAssignment_3_1()); 
                    // InternalMontiArcAndCore.g:1628:3: ( rule__Port__DataTypeAssignment_3_1 )
                    // InternalMontiArcAndCore.g:1628:4: rule__Port__DataTypeAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Port__DataTypeAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPortAccess().getDataTypeAssignment_3_1()); 

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
    // $ANTLR end "rule__Port__Alternatives_3"


    // $ANTLR start "rule__Port__NameAlternatives_4_0"
    // InternalMontiArcAndCore.g:1636:1: rule__Port__NameAlternatives_4_0 : ( ( RULE_ID ) | ( RULE_MCQUALIFIEDNAME ) );
    public final void rule__Port__NameAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1640:1: ( ( RULE_ID ) | ( RULE_MCQUALIFIEDNAME ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_MCQUALIFIEDNAME) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalMontiArcAndCore.g:1641:2: ( RULE_ID )
                    {
                    // InternalMontiArcAndCore.g:1641:2: ( RULE_ID )
                    // InternalMontiArcAndCore.g:1642:3: RULE_ID
                    {
                     before(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_4_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:1647:2: ( RULE_MCQUALIFIEDNAME )
                    {
                    // InternalMontiArcAndCore.g:1647:2: ( RULE_MCQUALIFIEDNAME )
                    // InternalMontiArcAndCore.g:1648:3: RULE_MCQUALIFIEDNAME
                    {
                     before(grammarAccess.getPortAccess().getNameMCQUALIFIEDNAMETerminalRuleCall_4_0_1()); 
                    match(input,RULE_MCQUALIFIEDNAME,FOLLOW_2); 
                     after(grammarAccess.getPortAccess().getNameMCQUALIFIEDNAMETerminalRuleCall_4_0_1()); 

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
    // $ANTLR end "rule__Port__NameAlternatives_4_0"


    // $ANTLR start "rule__Names__NamesAlternatives_0_0"
    // InternalMontiArcAndCore.g:1657:1: rule__Names__NamesAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_MCQUALIFIEDNAME ) );
    public final void rule__Names__NamesAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1661:1: ( ( RULE_ID ) | ( RULE_MCQUALIFIEDNAME ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_MCQUALIFIEDNAME) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalMontiArcAndCore.g:1662:2: ( RULE_ID )
                    {
                    // InternalMontiArcAndCore.g:1662:2: ( RULE_ID )
                    // InternalMontiArcAndCore.g:1663:3: RULE_ID
                    {
                     before(grammarAccess.getNamesAccess().getNamesIDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getNamesAccess().getNamesIDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:1668:2: ( RULE_MCQUALIFIEDNAME )
                    {
                    // InternalMontiArcAndCore.g:1668:2: ( RULE_MCQUALIFIEDNAME )
                    // InternalMontiArcAndCore.g:1669:3: RULE_MCQUALIFIEDNAME
                    {
                     before(grammarAccess.getNamesAccess().getNamesMCQUALIFIEDNAMETerminalRuleCall_0_0_1()); 
                    match(input,RULE_MCQUALIFIEDNAME,FOLLOW_2); 
                     after(grammarAccess.getNamesAccess().getNamesMCQUALIFIEDNAMETerminalRuleCall_0_0_1()); 

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
    // $ANTLR end "rule__Names__NamesAlternatives_0_0"


    // $ANTLR start "rule__Names__NamesAlternatives_1_1_0"
    // InternalMontiArcAndCore.g:1678:1: rule__Names__NamesAlternatives_1_1_0 : ( ( RULE_ID ) | ( RULE_MCQUALIFIEDNAME ) );
    public final void rule__Names__NamesAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1682:1: ( ( RULE_ID ) | ( RULE_MCQUALIFIEDNAME ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_MCQUALIFIEDNAME) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalMontiArcAndCore.g:1683:2: ( RULE_ID )
                    {
                    // InternalMontiArcAndCore.g:1683:2: ( RULE_ID )
                    // InternalMontiArcAndCore.g:1684:3: RULE_ID
                    {
                     before(grammarAccess.getNamesAccess().getNamesIDTerminalRuleCall_1_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getNamesAccess().getNamesIDTerminalRuleCall_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:1689:2: ( RULE_MCQUALIFIEDNAME )
                    {
                    // InternalMontiArcAndCore.g:1689:2: ( RULE_MCQUALIFIEDNAME )
                    // InternalMontiArcAndCore.g:1690:3: RULE_MCQUALIFIEDNAME
                    {
                     before(grammarAccess.getNamesAccess().getNamesMCQUALIFIEDNAMETerminalRuleCall_1_1_0_1()); 
                    match(input,RULE_MCQUALIFIEDNAME,FOLLOW_2); 
                     after(grammarAccess.getNamesAccess().getNamesMCQUALIFIEDNAMETerminalRuleCall_1_1_0_1()); 

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
    // $ANTLR end "rule__Names__NamesAlternatives_1_1_0"


    // $ANTLR start "rule__Variable__NameAlternatives_1_0"
    // InternalMontiArcAndCore.g:1699:1: rule__Variable__NameAlternatives_1_0 : ( ( RULE_ID ) | ( RULE_MCQUALIFIEDNAME ) );
    public final void rule__Variable__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1703:1: ( ( RULE_ID ) | ( RULE_MCQUALIFIEDNAME ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_MCQUALIFIEDNAME) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalMontiArcAndCore.g:1704:2: ( RULE_ID )
                    {
                    // InternalMontiArcAndCore.g:1704:2: ( RULE_ID )
                    // InternalMontiArcAndCore.g:1705:3: RULE_ID
                    {
                     before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:1710:2: ( RULE_MCQUALIFIEDNAME )
                    {
                    // InternalMontiArcAndCore.g:1710:2: ( RULE_MCQUALIFIEDNAME )
                    // InternalMontiArcAndCore.g:1711:3: RULE_MCQUALIFIEDNAME
                    {
                     before(grammarAccess.getVariableAccess().getNameMCQUALIFIEDNAMETerminalRuleCall_1_0_1()); 
                    match(input,RULE_MCQUALIFIEDNAME,FOLLOW_2); 
                     after(grammarAccess.getVariableAccess().getNameMCQUALIFIEDNAMETerminalRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__Variable__NameAlternatives_1_0"


    // $ANTLR start "rule__Automaton__Alternatives_5"
    // InternalMontiArcAndCore.g:1720:1: rule__Automaton__Alternatives_5 : ( ( ( rule__Automaton__StatesAssignment_5_0 ) ) | ( ( rule__Automaton__TransitionsAssignment_5_1 ) ) );
    public final void rule__Automaton__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1724:1: ( ( ( rule__Automaton__StatesAssignment_5_0 ) ) | ( ( rule__Automaton__TransitionsAssignment_5_1 ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=41 && LA22_0<=42)||LA22_0==52||LA22_0==66) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_ID) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalMontiArcAndCore.g:1725:2: ( ( rule__Automaton__StatesAssignment_5_0 ) )
                    {
                    // InternalMontiArcAndCore.g:1725:2: ( ( rule__Automaton__StatesAssignment_5_0 ) )
                    // InternalMontiArcAndCore.g:1726:3: ( rule__Automaton__StatesAssignment_5_0 )
                    {
                     before(grammarAccess.getAutomatonAccess().getStatesAssignment_5_0()); 
                    // InternalMontiArcAndCore.g:1727:3: ( rule__Automaton__StatesAssignment_5_0 )
                    // InternalMontiArcAndCore.g:1727:4: rule__Automaton__StatesAssignment_5_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Automaton__StatesAssignment_5_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAutomatonAccess().getStatesAssignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:1731:2: ( ( rule__Automaton__TransitionsAssignment_5_1 ) )
                    {
                    // InternalMontiArcAndCore.g:1731:2: ( ( rule__Automaton__TransitionsAssignment_5_1 ) )
                    // InternalMontiArcAndCore.g:1732:3: ( rule__Automaton__TransitionsAssignment_5_1 )
                    {
                     before(grammarAccess.getAutomatonAccess().getTransitionsAssignment_5_1()); 
                    // InternalMontiArcAndCore.g:1733:3: ( rule__Automaton__TransitionsAssignment_5_1 )
                    // InternalMontiArcAndCore.g:1733:4: rule__Automaton__TransitionsAssignment_5_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Automaton__TransitionsAssignment_5_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAutomatonAccess().getTransitionsAssignment_5_1()); 

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
    // $ANTLR end "rule__Automaton__Alternatives_5"


    // $ANTLR start "rule__State__Alternatives"
    // InternalMontiArcAndCore.g:1741:1: rule__State__Alternatives : ( ( ruleSCState ) | ( ruleInvState ) );
    public final void rule__State__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1745:1: ( ( ruleSCState ) | ( ruleInvState ) )
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalMontiArcAndCore.g:1746:2: ( ruleSCState )
                    {
                    // InternalMontiArcAndCore.g:1746:2: ( ruleSCState )
                    // InternalMontiArcAndCore.g:1747:3: ruleSCState
                    {
                     before(grammarAccess.getStateAccess().getSCStateParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSCState();

                    state._fsp--;

                     after(grammarAccess.getStateAccess().getSCStateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:1752:2: ( ruleInvState )
                    {
                    // InternalMontiArcAndCore.g:1752:2: ( ruleInvState )
                    // InternalMontiArcAndCore.g:1753:3: ruleInvState
                    {
                     before(grammarAccess.getStateAccess().getInvStateParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInvState();

                    state._fsp--;

                     after(grammarAccess.getStateAccess().getInvStateParserRuleCall_1()); 

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
    // $ANTLR end "rule__State__Alternatives"


    // $ANTLR start "rule__BlockStatement__Alternatives"
    // InternalMontiArcAndCore.g:1762:1: rule__BlockStatement__Alternatives : ( ( ruleSimpleInit ) | ( ruleSimpleExpression ) );
    public final void rule__BlockStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1766:1: ( ( ruleSimpleInit ) | ( ruleSimpleExpression ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                int LA24_1 = input.LA(2);

                if ( ((LA24_1>=33 && LA24_1<=40)||LA24_1==44) ) {
                    alt24=2;
                }
                else if ( (LA24_1==59) ) {
                    alt24=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA24_0==RULE_MCQUALIFIEDNAME||(LA24_0>=RULE_INT && LA24_0<=RULE_STRING)) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalMontiArcAndCore.g:1767:2: ( ruleSimpleInit )
                    {
                    // InternalMontiArcAndCore.g:1767:2: ( ruleSimpleInit )
                    // InternalMontiArcAndCore.g:1768:3: ruleSimpleInit
                    {
                     before(grammarAccess.getBlockStatementAccess().getSimpleInitParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSimpleInit();

                    state._fsp--;

                     after(grammarAccess.getBlockStatementAccess().getSimpleInitParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:1773:2: ( ruleSimpleExpression )
                    {
                    // InternalMontiArcAndCore.g:1773:2: ( ruleSimpleExpression )
                    // InternalMontiArcAndCore.g:1774:3: ruleSimpleExpression
                    {
                     before(grammarAccess.getBlockStatementAccess().getSimpleExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSimpleExpression();

                    state._fsp--;

                     after(grammarAccess.getBlockStatementAccess().getSimpleExpressionParserRuleCall_1()); 

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
    // $ANTLR end "rule__BlockStatement__Alternatives"


    // $ANTLR start "rule__Operator__Alternatives"
    // InternalMontiArcAndCore.g:1783:1: rule__Operator__Alternatives : ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '==' ) ) | ( ( '&&' ) ) | ( ( '+' ) ) | ( ( '-' ) ) | ( ( '/' ) ) | ( ( '*' ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1787:1: ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '==' ) ) | ( ( '&&' ) ) | ( ( '+' ) ) | ( ( '-' ) ) | ( ( '/' ) ) | ( ( '*' ) ) )
            int alt25=8;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt25=1;
                }
                break;
            case 34:
                {
                alt25=2;
                }
                break;
            case 35:
                {
                alt25=3;
                }
                break;
            case 36:
                {
                alt25=4;
                }
                break;
            case 37:
                {
                alt25=5;
                }
                break;
            case 38:
                {
                alt25=6;
                }
                break;
            case 39:
                {
                alt25=7;
                }
                break;
            case 40:
                {
                alt25=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalMontiArcAndCore.g:1788:2: ( ( '>' ) )
                    {
                    // InternalMontiArcAndCore.g:1788:2: ( ( '>' ) )
                    // InternalMontiArcAndCore.g:1789:3: ( '>' )
                    {
                     before(grammarAccess.getOperatorAccess().getGTEnumLiteralDeclaration_0()); 
                    // InternalMontiArcAndCore.g:1790:3: ( '>' )
                    // InternalMontiArcAndCore.g:1790:4: '>'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getGTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:1794:2: ( ( '<' ) )
                    {
                    // InternalMontiArcAndCore.g:1794:2: ( ( '<' ) )
                    // InternalMontiArcAndCore.g:1795:3: ( '<' )
                    {
                     before(grammarAccess.getOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    // InternalMontiArcAndCore.g:1796:3: ( '<' )
                    // InternalMontiArcAndCore.g:1796:4: '<'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getLTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMontiArcAndCore.g:1800:2: ( ( '==' ) )
                    {
                    // InternalMontiArcAndCore.g:1800:2: ( ( '==' ) )
                    // InternalMontiArcAndCore.g:1801:3: ( '==' )
                    {
                     before(grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_2()); 
                    // InternalMontiArcAndCore.g:1802:3: ( '==' )
                    // InternalMontiArcAndCore.g:1802:4: '=='
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMontiArcAndCore.g:1806:2: ( ( '&&' ) )
                    {
                    // InternalMontiArcAndCore.g:1806:2: ( ( '&&' ) )
                    // InternalMontiArcAndCore.g:1807:3: ( '&&' )
                    {
                     before(grammarAccess.getOperatorAccess().getBAEnumLiteralDeclaration_3()); 
                    // InternalMontiArcAndCore.g:1808:3: ( '&&' )
                    // InternalMontiArcAndCore.g:1808:4: '&&'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getBAEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMontiArcAndCore.g:1812:2: ( ( '+' ) )
                    {
                    // InternalMontiArcAndCore.g:1812:2: ( ( '+' ) )
                    // InternalMontiArcAndCore.g:1813:3: ( '+' )
                    {
                     before(grammarAccess.getOperatorAccess().getPLUSEnumLiteralDeclaration_4()); 
                    // InternalMontiArcAndCore.g:1814:3: ( '+' )
                    // InternalMontiArcAndCore.g:1814:4: '+'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getPLUSEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMontiArcAndCore.g:1818:2: ( ( '-' ) )
                    {
                    // InternalMontiArcAndCore.g:1818:2: ( ( '-' ) )
                    // InternalMontiArcAndCore.g:1819:3: ( '-' )
                    {
                     before(grammarAccess.getOperatorAccess().getMINUSEnumLiteralDeclaration_5()); 
                    // InternalMontiArcAndCore.g:1820:3: ( '-' )
                    // InternalMontiArcAndCore.g:1820:4: '-'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getMINUSEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMontiArcAndCore.g:1824:2: ( ( '/' ) )
                    {
                    // InternalMontiArcAndCore.g:1824:2: ( ( '/' ) )
                    // InternalMontiArcAndCore.g:1825:3: ( '/' )
                    {
                     before(grammarAccess.getOperatorAccess().getDIVEnumLiteralDeclaration_6()); 
                    // InternalMontiArcAndCore.g:1826:3: ( '/' )
                    // InternalMontiArcAndCore.g:1826:4: '/'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getDIVEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMontiArcAndCore.g:1830:2: ( ( '*' ) )
                    {
                    // InternalMontiArcAndCore.g:1830:2: ( ( '*' ) )
                    // InternalMontiArcAndCore.g:1831:3: ( '*' )
                    {
                     before(grammarAccess.getOperatorAccess().getMULTEnumLiteralDeclaration_7()); 
                    // InternalMontiArcAndCore.g:1832:3: ( '*' )
                    // InternalMontiArcAndCore.g:1832:4: '*'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getMULTEnumLiteralDeclaration_7()); 

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
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__SCModifier__Alternatives"
    // InternalMontiArcAndCore.g:1840:1: rule__SCModifier__Alternatives : ( ( ( 'initial' ) ) | ( ( 'final' ) ) );
    public final void rule__SCModifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1844:1: ( ( ( 'initial' ) ) | ( ( 'final' ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==41) ) {
                alt26=1;
            }
            else if ( (LA26_0==42) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalMontiArcAndCore.g:1845:2: ( ( 'initial' ) )
                    {
                    // InternalMontiArcAndCore.g:1845:2: ( ( 'initial' ) )
                    // InternalMontiArcAndCore.g:1846:3: ( 'initial' )
                    {
                     before(grammarAccess.getSCModifierAccess().getINITIALEnumLiteralDeclaration_0()); 
                    // InternalMontiArcAndCore.g:1847:3: ( 'initial' )
                    // InternalMontiArcAndCore.g:1847:4: 'initial'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getSCModifierAccess().getINITIALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:1851:2: ( ( 'final' ) )
                    {
                    // InternalMontiArcAndCore.g:1851:2: ( ( 'final' ) )
                    // InternalMontiArcAndCore.g:1852:3: ( 'final' )
                    {
                     before(grammarAccess.getSCModifierAccess().getFINALEnumLiteralDeclaration_1()); 
                    // InternalMontiArcAndCore.g:1853:3: ( 'final' )
                    // InternalMontiArcAndCore.g:1853:4: 'final'
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getSCModifierAccess().getFINALEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__SCModifier__Alternatives"


    // $ANTLR start "rule__MontiArcAndCore__Group__0"
    // InternalMontiArcAndCore.g:1861:1: rule__MontiArcAndCore__Group__0 : rule__MontiArcAndCore__Group__0__Impl rule__MontiArcAndCore__Group__1 ;
    public final void rule__MontiArcAndCore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1865:1: ( rule__MontiArcAndCore__Group__0__Impl rule__MontiArcAndCore__Group__1 )
            // InternalMontiArcAndCore.g:1866:2: rule__MontiArcAndCore__Group__0__Impl rule__MontiArcAndCore__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MontiArcAndCore__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MontiArcAndCore__Group__1();

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
    // $ANTLR end "rule__MontiArcAndCore__Group__0"


    // $ANTLR start "rule__MontiArcAndCore__Group__0__Impl"
    // InternalMontiArcAndCore.g:1873:1: rule__MontiArcAndCore__Group__0__Impl : ( ( rule__MontiArcAndCore__ClassdiagramAssignment_0 ) ) ;
    public final void rule__MontiArcAndCore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1877:1: ( ( ( rule__MontiArcAndCore__ClassdiagramAssignment_0 ) ) )
            // InternalMontiArcAndCore.g:1878:1: ( ( rule__MontiArcAndCore__ClassdiagramAssignment_0 ) )
            {
            // InternalMontiArcAndCore.g:1878:1: ( ( rule__MontiArcAndCore__ClassdiagramAssignment_0 ) )
            // InternalMontiArcAndCore.g:1879:2: ( rule__MontiArcAndCore__ClassdiagramAssignment_0 )
            {
             before(grammarAccess.getMontiArcAndCoreAccess().getClassdiagramAssignment_0()); 
            // InternalMontiArcAndCore.g:1880:2: ( rule__MontiArcAndCore__ClassdiagramAssignment_0 )
            // InternalMontiArcAndCore.g:1880:3: rule__MontiArcAndCore__ClassdiagramAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MontiArcAndCore__ClassdiagramAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMontiArcAndCoreAccess().getClassdiagramAssignment_0()); 

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
    // $ANTLR end "rule__MontiArcAndCore__Group__0__Impl"


    // $ANTLR start "rule__MontiArcAndCore__Group__1"
    // InternalMontiArcAndCore.g:1888:1: rule__MontiArcAndCore__Group__1 : rule__MontiArcAndCore__Group__1__Impl ;
    public final void rule__MontiArcAndCore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1892:1: ( rule__MontiArcAndCore__Group__1__Impl )
            // InternalMontiArcAndCore.g:1893:2: rule__MontiArcAndCore__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MontiArcAndCore__Group__1__Impl();

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
    // $ANTLR end "rule__MontiArcAndCore__Group__1"


    // $ANTLR start "rule__MontiArcAndCore__Group__1__Impl"
    // InternalMontiArcAndCore.g:1899:1: rule__MontiArcAndCore__Group__1__Impl : ( ( rule__MontiArcAndCore__MontiarcdslAssignment_1 ) ) ;
    public final void rule__MontiArcAndCore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1903:1: ( ( ( rule__MontiArcAndCore__MontiarcdslAssignment_1 ) ) )
            // InternalMontiArcAndCore.g:1904:1: ( ( rule__MontiArcAndCore__MontiarcdslAssignment_1 ) )
            {
            // InternalMontiArcAndCore.g:1904:1: ( ( rule__MontiArcAndCore__MontiarcdslAssignment_1 ) )
            // InternalMontiArcAndCore.g:1905:2: ( rule__MontiArcAndCore__MontiarcdslAssignment_1 )
            {
             before(grammarAccess.getMontiArcAndCoreAccess().getMontiarcdslAssignment_1()); 
            // InternalMontiArcAndCore.g:1906:2: ( rule__MontiArcAndCore__MontiarcdslAssignment_1 )
            // InternalMontiArcAndCore.g:1906:3: rule__MontiArcAndCore__MontiarcdslAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MontiArcAndCore__MontiarcdslAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMontiArcAndCoreAccess().getMontiarcdslAssignment_1()); 

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
    // $ANTLR end "rule__MontiArcAndCore__Group__1__Impl"


    // $ANTLR start "rule__ImportStatements__Group__0"
    // InternalMontiArcAndCore.g:1915:1: rule__ImportStatements__Group__0 : rule__ImportStatements__Group__0__Impl rule__ImportStatements__Group__1 ;
    public final void rule__ImportStatements__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1919:1: ( rule__ImportStatements__Group__0__Impl rule__ImportStatements__Group__1 )
            // InternalMontiArcAndCore.g:1920:2: rule__ImportStatements__Group__0__Impl rule__ImportStatements__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ImportStatements__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportStatements__Group__1();

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
    // $ANTLR end "rule__ImportStatements__Group__0"


    // $ANTLR start "rule__ImportStatements__Group__0__Impl"
    // InternalMontiArcAndCore.g:1927:1: rule__ImportStatements__Group__0__Impl : ( 'import' ) ;
    public final void rule__ImportStatements__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1931:1: ( ( 'import' ) )
            // InternalMontiArcAndCore.g:1932:1: ( 'import' )
            {
            // InternalMontiArcAndCore.g:1932:1: ( 'import' )
            // InternalMontiArcAndCore.g:1933:2: 'import'
            {
             before(grammarAccess.getImportStatementsAccess().getImportKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getImportStatementsAccess().getImportKeyword_0()); 

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
    // $ANTLR end "rule__ImportStatements__Group__0__Impl"


    // $ANTLR start "rule__ImportStatements__Group__1"
    // InternalMontiArcAndCore.g:1942:1: rule__ImportStatements__Group__1 : rule__ImportStatements__Group__1__Impl rule__ImportStatements__Group__2 ;
    public final void rule__ImportStatements__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1946:1: ( rule__ImportStatements__Group__1__Impl rule__ImportStatements__Group__2 )
            // InternalMontiArcAndCore.g:1947:2: rule__ImportStatements__Group__1__Impl rule__ImportStatements__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ImportStatements__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportStatements__Group__2();

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
    // $ANTLR end "rule__ImportStatements__Group__1"


    // $ANTLR start "rule__ImportStatements__Group__1__Impl"
    // InternalMontiArcAndCore.g:1954:1: rule__ImportStatements__Group__1__Impl : ( ( rule__ImportStatements__ImportUriAssignment_1 ) ) ;
    public final void rule__ImportStatements__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1958:1: ( ( ( rule__ImportStatements__ImportUriAssignment_1 ) ) )
            // InternalMontiArcAndCore.g:1959:1: ( ( rule__ImportStatements__ImportUriAssignment_1 ) )
            {
            // InternalMontiArcAndCore.g:1959:1: ( ( rule__ImportStatements__ImportUriAssignment_1 ) )
            // InternalMontiArcAndCore.g:1960:2: ( rule__ImportStatements__ImportUriAssignment_1 )
            {
             before(grammarAccess.getImportStatementsAccess().getImportUriAssignment_1()); 
            // InternalMontiArcAndCore.g:1961:2: ( rule__ImportStatements__ImportUriAssignment_1 )
            // InternalMontiArcAndCore.g:1961:3: rule__ImportStatements__ImportUriAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ImportStatements__ImportUriAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportStatementsAccess().getImportUriAssignment_1()); 

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
    // $ANTLR end "rule__ImportStatements__Group__1__Impl"


    // $ANTLR start "rule__ImportStatements__Group__2"
    // InternalMontiArcAndCore.g:1969:1: rule__ImportStatements__Group__2 : rule__ImportStatements__Group__2__Impl rule__ImportStatements__Group__3 ;
    public final void rule__ImportStatements__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1973:1: ( rule__ImportStatements__Group__2__Impl rule__ImportStatements__Group__3 )
            // InternalMontiArcAndCore.g:1974:2: rule__ImportStatements__Group__2__Impl rule__ImportStatements__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ImportStatements__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportStatements__Group__3();

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
    // $ANTLR end "rule__ImportStatements__Group__2"


    // $ANTLR start "rule__ImportStatements__Group__2__Impl"
    // InternalMontiArcAndCore.g:1981:1: rule__ImportStatements__Group__2__Impl : ( ( rule__ImportStatements__StarAssignment_2 )? ) ;
    public final void rule__ImportStatements__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:1985:1: ( ( ( rule__ImportStatements__StarAssignment_2 )? ) )
            // InternalMontiArcAndCore.g:1986:1: ( ( rule__ImportStatements__StarAssignment_2 )? )
            {
            // InternalMontiArcAndCore.g:1986:1: ( ( rule__ImportStatements__StarAssignment_2 )? )
            // InternalMontiArcAndCore.g:1987:2: ( rule__ImportStatements__StarAssignment_2 )?
            {
             before(grammarAccess.getImportStatementsAccess().getStarAssignment_2()); 
            // InternalMontiArcAndCore.g:1988:2: ( rule__ImportStatements__StarAssignment_2 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_DOTSTAR) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMontiArcAndCore.g:1988:3: rule__ImportStatements__StarAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ImportStatements__StarAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImportStatementsAccess().getStarAssignment_2()); 

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
    // $ANTLR end "rule__ImportStatements__Group__2__Impl"


    // $ANTLR start "rule__ImportStatements__Group__3"
    // InternalMontiArcAndCore.g:1996:1: rule__ImportStatements__Group__3 : rule__ImportStatements__Group__3__Impl ;
    public final void rule__ImportStatements__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2000:1: ( rule__ImportStatements__Group__3__Impl )
            // InternalMontiArcAndCore.g:2001:2: rule__ImportStatements__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportStatements__Group__3__Impl();

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
    // $ANTLR end "rule__ImportStatements__Group__3"


    // $ANTLR start "rule__ImportStatements__Group__3__Impl"
    // InternalMontiArcAndCore.g:2007:1: rule__ImportStatements__Group__3__Impl : ( ';' ) ;
    public final void rule__ImportStatements__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2011:1: ( ( ';' ) )
            // InternalMontiArcAndCore.g:2012:1: ( ';' )
            {
            // InternalMontiArcAndCore.g:2012:1: ( ';' )
            // InternalMontiArcAndCore.g:2013:2: ';'
            {
             before(grammarAccess.getImportStatementsAccess().getSemicolonKeyword_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getImportStatementsAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__ImportStatements__Group__3__Impl"


    // $ANTLR start "rule__Package__Group__0"
    // InternalMontiArcAndCore.g:2023:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2027:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalMontiArcAndCore.g:2028:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__1();

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
    // $ANTLR end "rule__Package__Group__0"


    // $ANTLR start "rule__Package__Group__0__Impl"
    // InternalMontiArcAndCore.g:2035:1: rule__Package__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2039:1: ( ( 'package' ) )
            // InternalMontiArcAndCore.g:2040:1: ( 'package' )
            {
            // InternalMontiArcAndCore.g:2040:1: ( 'package' )
            // InternalMontiArcAndCore.g:2041:2: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getPackageKeyword_0()); 

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
    // $ANTLR end "rule__Package__Group__0__Impl"


    // $ANTLR start "rule__Package__Group__1"
    // InternalMontiArcAndCore.g:2050:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2054:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalMontiArcAndCore.g:2055:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__2();

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
    // $ANTLR end "rule__Package__Group__1"


    // $ANTLR start "rule__Package__Group__1__Impl"
    // InternalMontiArcAndCore.g:2062:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2066:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // InternalMontiArcAndCore.g:2067:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // InternalMontiArcAndCore.g:2067:1: ( ( rule__Package__NameAssignment_1 ) )
            // InternalMontiArcAndCore.g:2068:2: ( rule__Package__NameAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            // InternalMontiArcAndCore.g:2069:2: ( rule__Package__NameAssignment_1 )
            // InternalMontiArcAndCore.g:2069:3: rule__Package__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Package__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Package__Group__1__Impl"


    // $ANTLR start "rule__Package__Group__2"
    // InternalMontiArcAndCore.g:2077:1: rule__Package__Group__2 : rule__Package__Group__2__Impl ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2081:1: ( rule__Package__Group__2__Impl )
            // InternalMontiArcAndCore.g:2082:2: rule__Package__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__2__Impl();

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
    // $ANTLR end "rule__Package__Group__2"


    // $ANTLR start "rule__Package__Group__2__Impl"
    // InternalMontiArcAndCore.g:2088:1: rule__Package__Group__2__Impl : ( ';' ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2092:1: ( ( ';' ) )
            // InternalMontiArcAndCore.g:2093:1: ( ';' )
            {
            // InternalMontiArcAndCore.g:2093:1: ( ';' )
            // InternalMontiArcAndCore.g:2094:2: ';'
            {
             before(grammarAccess.getPackageAccess().getSemicolonKeyword_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__Package__Group__2__Impl"


    // $ANTLR start "rule__MCCollectionType__Group__0"
    // InternalMontiArcAndCore.g:2104:1: rule__MCCollectionType__Group__0 : rule__MCCollectionType__Group__0__Impl rule__MCCollectionType__Group__1 ;
    public final void rule__MCCollectionType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2108:1: ( rule__MCCollectionType__Group__0__Impl rule__MCCollectionType__Group__1 )
            // InternalMontiArcAndCore.g:2109:2: rule__MCCollectionType__Group__0__Impl rule__MCCollectionType__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__MCCollectionType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MCCollectionType__Group__1();

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
    // $ANTLR end "rule__MCCollectionType__Group__0"


    // $ANTLR start "rule__MCCollectionType__Group__0__Impl"
    // InternalMontiArcAndCore.g:2116:1: rule__MCCollectionType__Group__0__Impl : ( ( rule__MCCollectionType__CollectionAssignment_0 ) ) ;
    public final void rule__MCCollectionType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2120:1: ( ( ( rule__MCCollectionType__CollectionAssignment_0 ) ) )
            // InternalMontiArcAndCore.g:2121:1: ( ( rule__MCCollectionType__CollectionAssignment_0 ) )
            {
            // InternalMontiArcAndCore.g:2121:1: ( ( rule__MCCollectionType__CollectionAssignment_0 ) )
            // InternalMontiArcAndCore.g:2122:2: ( rule__MCCollectionType__CollectionAssignment_0 )
            {
             before(grammarAccess.getMCCollectionTypeAccess().getCollectionAssignment_0()); 
            // InternalMontiArcAndCore.g:2123:2: ( rule__MCCollectionType__CollectionAssignment_0 )
            // InternalMontiArcAndCore.g:2123:3: rule__MCCollectionType__CollectionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MCCollectionType__CollectionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMCCollectionTypeAccess().getCollectionAssignment_0()); 

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
    // $ANTLR end "rule__MCCollectionType__Group__0__Impl"


    // $ANTLR start "rule__MCCollectionType__Group__1"
    // InternalMontiArcAndCore.g:2131:1: rule__MCCollectionType__Group__1 : rule__MCCollectionType__Group__1__Impl rule__MCCollectionType__Group__2 ;
    public final void rule__MCCollectionType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2135:1: ( rule__MCCollectionType__Group__1__Impl rule__MCCollectionType__Group__2 )
            // InternalMontiArcAndCore.g:2136:2: rule__MCCollectionType__Group__1__Impl rule__MCCollectionType__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__MCCollectionType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MCCollectionType__Group__2();

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
    // $ANTLR end "rule__MCCollectionType__Group__1"


    // $ANTLR start "rule__MCCollectionType__Group__1__Impl"
    // InternalMontiArcAndCore.g:2143:1: rule__MCCollectionType__Group__1__Impl : ( '<' ) ;
    public final void rule__MCCollectionType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2147:1: ( ( '<' ) )
            // InternalMontiArcAndCore.g:2148:1: ( '<' )
            {
            // InternalMontiArcAndCore.g:2148:1: ( '<' )
            // InternalMontiArcAndCore.g:2149:2: '<'
            {
             before(grammarAccess.getMCCollectionTypeAccess().getLessThanSignKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMCCollectionTypeAccess().getLessThanSignKeyword_1()); 

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
    // $ANTLR end "rule__MCCollectionType__Group__1__Impl"


    // $ANTLR start "rule__MCCollectionType__Group__2"
    // InternalMontiArcAndCore.g:2158:1: rule__MCCollectionType__Group__2 : rule__MCCollectionType__Group__2__Impl rule__MCCollectionType__Group__3 ;
    public final void rule__MCCollectionType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2162:1: ( rule__MCCollectionType__Group__2__Impl rule__MCCollectionType__Group__3 )
            // InternalMontiArcAndCore.g:2163:2: rule__MCCollectionType__Group__2__Impl rule__MCCollectionType__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__MCCollectionType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MCCollectionType__Group__3();

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
    // $ANTLR end "rule__MCCollectionType__Group__2"


    // $ANTLR start "rule__MCCollectionType__Group__2__Impl"
    // InternalMontiArcAndCore.g:2170:1: rule__MCCollectionType__Group__2__Impl : ( ( rule__MCCollectionType__InnerTypeAssignment_2 ) ) ;
    public final void rule__MCCollectionType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2174:1: ( ( ( rule__MCCollectionType__InnerTypeAssignment_2 ) ) )
            // InternalMontiArcAndCore.g:2175:1: ( ( rule__MCCollectionType__InnerTypeAssignment_2 ) )
            {
            // InternalMontiArcAndCore.g:2175:1: ( ( rule__MCCollectionType__InnerTypeAssignment_2 ) )
            // InternalMontiArcAndCore.g:2176:2: ( rule__MCCollectionType__InnerTypeAssignment_2 )
            {
             before(grammarAccess.getMCCollectionTypeAccess().getInnerTypeAssignment_2()); 
            // InternalMontiArcAndCore.g:2177:2: ( rule__MCCollectionType__InnerTypeAssignment_2 )
            // InternalMontiArcAndCore.g:2177:3: rule__MCCollectionType__InnerTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MCCollectionType__InnerTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMCCollectionTypeAccess().getInnerTypeAssignment_2()); 

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
    // $ANTLR end "rule__MCCollectionType__Group__2__Impl"


    // $ANTLR start "rule__MCCollectionType__Group__3"
    // InternalMontiArcAndCore.g:2185:1: rule__MCCollectionType__Group__3 : rule__MCCollectionType__Group__3__Impl ;
    public final void rule__MCCollectionType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2189:1: ( rule__MCCollectionType__Group__3__Impl )
            // InternalMontiArcAndCore.g:2190:2: rule__MCCollectionType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MCCollectionType__Group__3__Impl();

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
    // $ANTLR end "rule__MCCollectionType__Group__3"


    // $ANTLR start "rule__MCCollectionType__Group__3__Impl"
    // InternalMontiArcAndCore.g:2196:1: rule__MCCollectionType__Group__3__Impl : ( '>' ) ;
    public final void rule__MCCollectionType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2200:1: ( ( '>' ) )
            // InternalMontiArcAndCore.g:2201:1: ( '>' )
            {
            // InternalMontiArcAndCore.g:2201:1: ( '>' )
            // InternalMontiArcAndCore.g:2202:2: '>'
            {
             before(grammarAccess.getMCCollectionTypeAccess().getGreaterThanSignKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMCCollectionTypeAccess().getGreaterThanSignKeyword_3()); 

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
    // $ANTLR end "rule__MCCollectionType__Group__3__Impl"


    // $ANTLR start "rule__MCArrayType__Group__0"
    // InternalMontiArcAndCore.g:2212:1: rule__MCArrayType__Group__0 : rule__MCArrayType__Group__0__Impl rule__MCArrayType__Group__1 ;
    public final void rule__MCArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2216:1: ( rule__MCArrayType__Group__0__Impl rule__MCArrayType__Group__1 )
            // InternalMontiArcAndCore.g:2217:2: rule__MCArrayType__Group__0__Impl rule__MCArrayType__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__MCArrayType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MCArrayType__Group__1();

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
    // $ANTLR end "rule__MCArrayType__Group__0"


    // $ANTLR start "rule__MCArrayType__Group__0__Impl"
    // InternalMontiArcAndCore.g:2224:1: rule__MCArrayType__Group__0__Impl : ( ruleMCPrimitiveType ) ;
    public final void rule__MCArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2228:1: ( ( ruleMCPrimitiveType ) )
            // InternalMontiArcAndCore.g:2229:1: ( ruleMCPrimitiveType )
            {
            // InternalMontiArcAndCore.g:2229:1: ( ruleMCPrimitiveType )
            // InternalMontiArcAndCore.g:2230:2: ruleMCPrimitiveType
            {
             before(grammarAccess.getMCArrayTypeAccess().getMCPrimitiveTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMCPrimitiveType();

            state._fsp--;

             after(grammarAccess.getMCArrayTypeAccess().getMCPrimitiveTypeParserRuleCall_0()); 

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
    // $ANTLR end "rule__MCArrayType__Group__0__Impl"


    // $ANTLR start "rule__MCArrayType__Group__1"
    // InternalMontiArcAndCore.g:2239:1: rule__MCArrayType__Group__1 : rule__MCArrayType__Group__1__Impl rule__MCArrayType__Group__2 ;
    public final void rule__MCArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2243:1: ( rule__MCArrayType__Group__1__Impl rule__MCArrayType__Group__2 )
            // InternalMontiArcAndCore.g:2244:2: rule__MCArrayType__Group__1__Impl rule__MCArrayType__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__MCArrayType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MCArrayType__Group__2();

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
    // $ANTLR end "rule__MCArrayType__Group__1"


    // $ANTLR start "rule__MCArrayType__Group__1__Impl"
    // InternalMontiArcAndCore.g:2251:1: rule__MCArrayType__Group__1__Impl : ( '[' ) ;
    public final void rule__MCArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2255:1: ( ( '[' ) )
            // InternalMontiArcAndCore.g:2256:1: ( '[' )
            {
            // InternalMontiArcAndCore.g:2256:1: ( '[' )
            // InternalMontiArcAndCore.g:2257:2: '['
            {
             before(grammarAccess.getMCArrayTypeAccess().getLeftSquareBracketKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getMCArrayTypeAccess().getLeftSquareBracketKeyword_1()); 

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
    // $ANTLR end "rule__MCArrayType__Group__1__Impl"


    // $ANTLR start "rule__MCArrayType__Group__2"
    // InternalMontiArcAndCore.g:2266:1: rule__MCArrayType__Group__2 : rule__MCArrayType__Group__2__Impl ;
    public final void rule__MCArrayType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2270:1: ( rule__MCArrayType__Group__2__Impl )
            // InternalMontiArcAndCore.g:2271:2: rule__MCArrayType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MCArrayType__Group__2__Impl();

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
    // $ANTLR end "rule__MCArrayType__Group__2"


    // $ANTLR start "rule__MCArrayType__Group__2__Impl"
    // InternalMontiArcAndCore.g:2277:1: rule__MCArrayType__Group__2__Impl : ( ']' ) ;
    public final void rule__MCArrayType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2281:1: ( ( ']' ) )
            // InternalMontiArcAndCore.g:2282:1: ( ']' )
            {
            // InternalMontiArcAndCore.g:2282:1: ( ']' )
            // InternalMontiArcAndCore.g:2283:2: ']'
            {
             before(grammarAccess.getMCArrayTypeAccess().getRightSquareBracketKeyword_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getMCArrayTypeAccess().getRightSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__MCArrayType__Group__2__Impl"


    // $ANTLR start "rule__BinaryExpression__Group__0"
    // InternalMontiArcAndCore.g:2293:1: rule__BinaryExpression__Group__0 : rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1 ;
    public final void rule__BinaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2297:1: ( rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1 )
            // InternalMontiArcAndCore.g:2298:2: rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__BinaryExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group__1();

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
    // $ANTLR end "rule__BinaryExpression__Group__0"


    // $ANTLR start "rule__BinaryExpression__Group__0__Impl"
    // InternalMontiArcAndCore.g:2305:1: rule__BinaryExpression__Group__0__Impl : ( ( rule__BinaryExpression__Literal1Assignment_0 ) ) ;
    public final void rule__BinaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2309:1: ( ( ( rule__BinaryExpression__Literal1Assignment_0 ) ) )
            // InternalMontiArcAndCore.g:2310:1: ( ( rule__BinaryExpression__Literal1Assignment_0 ) )
            {
            // InternalMontiArcAndCore.g:2310:1: ( ( rule__BinaryExpression__Literal1Assignment_0 ) )
            // InternalMontiArcAndCore.g:2311:2: ( rule__BinaryExpression__Literal1Assignment_0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getLiteral1Assignment_0()); 
            // InternalMontiArcAndCore.g:2312:2: ( rule__BinaryExpression__Literal1Assignment_0 )
            // InternalMontiArcAndCore.g:2312:3: rule__BinaryExpression__Literal1Assignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Literal1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExpressionAccess().getLiteral1Assignment_0()); 

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
    // $ANTLR end "rule__BinaryExpression__Group__0__Impl"


    // $ANTLR start "rule__BinaryExpression__Group__1"
    // InternalMontiArcAndCore.g:2320:1: rule__BinaryExpression__Group__1 : rule__BinaryExpression__Group__1__Impl rule__BinaryExpression__Group__2 ;
    public final void rule__BinaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2324:1: ( rule__BinaryExpression__Group__1__Impl rule__BinaryExpression__Group__2 )
            // InternalMontiArcAndCore.g:2325:2: rule__BinaryExpression__Group__1__Impl rule__BinaryExpression__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__BinaryExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group__2();

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
    // $ANTLR end "rule__BinaryExpression__Group__1"


    // $ANTLR start "rule__BinaryExpression__Group__1__Impl"
    // InternalMontiArcAndCore.g:2332:1: rule__BinaryExpression__Group__1__Impl : ( ( rule__BinaryExpression__OpAssignment_1 ) ) ;
    public final void rule__BinaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2336:1: ( ( ( rule__BinaryExpression__OpAssignment_1 ) ) )
            // InternalMontiArcAndCore.g:2337:1: ( ( rule__BinaryExpression__OpAssignment_1 ) )
            {
            // InternalMontiArcAndCore.g:2337:1: ( ( rule__BinaryExpression__OpAssignment_1 ) )
            // InternalMontiArcAndCore.g:2338:2: ( rule__BinaryExpression__OpAssignment_1 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getOpAssignment_1()); 
            // InternalMontiArcAndCore.g:2339:2: ( rule__BinaryExpression__OpAssignment_1 )
            // InternalMontiArcAndCore.g:2339:3: rule__BinaryExpression__OpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__OpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExpressionAccess().getOpAssignment_1()); 

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
    // $ANTLR end "rule__BinaryExpression__Group__1__Impl"


    // $ANTLR start "rule__BinaryExpression__Group__2"
    // InternalMontiArcAndCore.g:2347:1: rule__BinaryExpression__Group__2 : rule__BinaryExpression__Group__2__Impl ;
    public final void rule__BinaryExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2351:1: ( rule__BinaryExpression__Group__2__Impl )
            // InternalMontiArcAndCore.g:2352:2: rule__BinaryExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group__2__Impl();

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
    // $ANTLR end "rule__BinaryExpression__Group__2"


    // $ANTLR start "rule__BinaryExpression__Group__2__Impl"
    // InternalMontiArcAndCore.g:2358:1: rule__BinaryExpression__Group__2__Impl : ( ( rule__BinaryExpression__Literal2Assignment_2 ) ) ;
    public final void rule__BinaryExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2362:1: ( ( ( rule__BinaryExpression__Literal2Assignment_2 ) ) )
            // InternalMontiArcAndCore.g:2363:1: ( ( rule__BinaryExpression__Literal2Assignment_2 ) )
            {
            // InternalMontiArcAndCore.g:2363:1: ( ( rule__BinaryExpression__Literal2Assignment_2 ) )
            // InternalMontiArcAndCore.g:2364:2: ( rule__BinaryExpression__Literal2Assignment_2 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getLiteral2Assignment_2()); 
            // InternalMontiArcAndCore.g:2365:2: ( rule__BinaryExpression__Literal2Assignment_2 )
            // InternalMontiArcAndCore.g:2365:3: rule__BinaryExpression__Literal2Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Literal2Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExpressionAccess().getLiteral2Assignment_2()); 

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
    // $ANTLR end "rule__BinaryExpression__Group__2__Impl"


    // $ANTLR start "rule__Arguments__Group__0"
    // InternalMontiArcAndCore.g:2374:1: rule__Arguments__Group__0 : rule__Arguments__Group__0__Impl rule__Arguments__Group__1 ;
    public final void rule__Arguments__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2378:1: ( rule__Arguments__Group__0__Impl rule__Arguments__Group__1 )
            // InternalMontiArcAndCore.g:2379:2: rule__Arguments__Group__0__Impl rule__Arguments__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Arguments__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arguments__Group__1();

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
    // $ANTLR end "rule__Arguments__Group__0"


    // $ANTLR start "rule__Arguments__Group__0__Impl"
    // InternalMontiArcAndCore.g:2386:1: rule__Arguments__Group__0__Impl : ( '(' ) ;
    public final void rule__Arguments__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2390:1: ( ( '(' ) )
            // InternalMontiArcAndCore.g:2391:1: ( '(' )
            {
            // InternalMontiArcAndCore.g:2391:1: ( '(' )
            // InternalMontiArcAndCore.g:2392:2: '('
            {
             before(grammarAccess.getArgumentsAccess().getLeftParenthesisKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getArgumentsAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__Arguments__Group__0__Impl"


    // $ANTLR start "rule__Arguments__Group__1"
    // InternalMontiArcAndCore.g:2401:1: rule__Arguments__Group__1 : rule__Arguments__Group__1__Impl rule__Arguments__Group__2 ;
    public final void rule__Arguments__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2405:1: ( rule__Arguments__Group__1__Impl rule__Arguments__Group__2 )
            // InternalMontiArcAndCore.g:2406:2: rule__Arguments__Group__1__Impl rule__Arguments__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Arguments__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arguments__Group__2();

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
    // $ANTLR end "rule__Arguments__Group__1"


    // $ANTLR start "rule__Arguments__Group__1__Impl"
    // InternalMontiArcAndCore.g:2413:1: rule__Arguments__Group__1__Impl : ( ( rule__Arguments__ArgumentsAssignment_1 ) ) ;
    public final void rule__Arguments__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2417:1: ( ( ( rule__Arguments__ArgumentsAssignment_1 ) ) )
            // InternalMontiArcAndCore.g:2418:1: ( ( rule__Arguments__ArgumentsAssignment_1 ) )
            {
            // InternalMontiArcAndCore.g:2418:1: ( ( rule__Arguments__ArgumentsAssignment_1 ) )
            // InternalMontiArcAndCore.g:2419:2: ( rule__Arguments__ArgumentsAssignment_1 )
            {
             before(grammarAccess.getArgumentsAccess().getArgumentsAssignment_1()); 
            // InternalMontiArcAndCore.g:2420:2: ( rule__Arguments__ArgumentsAssignment_1 )
            // InternalMontiArcAndCore.g:2420:3: rule__Arguments__ArgumentsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Arguments__ArgumentsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArgumentsAccess().getArgumentsAssignment_1()); 

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
    // $ANTLR end "rule__Arguments__Group__1__Impl"


    // $ANTLR start "rule__Arguments__Group__2"
    // InternalMontiArcAndCore.g:2428:1: rule__Arguments__Group__2 : rule__Arguments__Group__2__Impl rule__Arguments__Group__3 ;
    public final void rule__Arguments__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2432:1: ( rule__Arguments__Group__2__Impl rule__Arguments__Group__3 )
            // InternalMontiArcAndCore.g:2433:2: rule__Arguments__Group__2__Impl rule__Arguments__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Arguments__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arguments__Group__3();

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
    // $ANTLR end "rule__Arguments__Group__2"


    // $ANTLR start "rule__Arguments__Group__2__Impl"
    // InternalMontiArcAndCore.g:2440:1: rule__Arguments__Group__2__Impl : ( ( rule__Arguments__Group_2__0 )* ) ;
    public final void rule__Arguments__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2444:1: ( ( ( rule__Arguments__Group_2__0 )* ) )
            // InternalMontiArcAndCore.g:2445:1: ( ( rule__Arguments__Group_2__0 )* )
            {
            // InternalMontiArcAndCore.g:2445:1: ( ( rule__Arguments__Group_2__0 )* )
            // InternalMontiArcAndCore.g:2446:2: ( rule__Arguments__Group_2__0 )*
            {
             before(grammarAccess.getArgumentsAccess().getGroup_2()); 
            // InternalMontiArcAndCore.g:2447:2: ( rule__Arguments__Group_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==50) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMontiArcAndCore.g:2447:3: rule__Arguments__Group_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Arguments__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getArgumentsAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Arguments__Group__2__Impl"


    // $ANTLR start "rule__Arguments__Group__3"
    // InternalMontiArcAndCore.g:2455:1: rule__Arguments__Group__3 : rule__Arguments__Group__3__Impl ;
    public final void rule__Arguments__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2459:1: ( rule__Arguments__Group__3__Impl )
            // InternalMontiArcAndCore.g:2460:2: rule__Arguments__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Arguments__Group__3__Impl();

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
    // $ANTLR end "rule__Arguments__Group__3"


    // $ANTLR start "rule__Arguments__Group__3__Impl"
    // InternalMontiArcAndCore.g:2466:1: rule__Arguments__Group__3__Impl : ( ')' ) ;
    public final void rule__Arguments__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2470:1: ( ( ')' ) )
            // InternalMontiArcAndCore.g:2471:1: ( ')' )
            {
            // InternalMontiArcAndCore.g:2471:1: ( ')' )
            // InternalMontiArcAndCore.g:2472:2: ')'
            {
             before(grammarAccess.getArgumentsAccess().getRightParenthesisKeyword_3()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getArgumentsAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Arguments__Group__3__Impl"


    // $ANTLR start "rule__Arguments__Group_2__0"
    // InternalMontiArcAndCore.g:2482:1: rule__Arguments__Group_2__0 : rule__Arguments__Group_2__0__Impl rule__Arguments__Group_2__1 ;
    public final void rule__Arguments__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2486:1: ( rule__Arguments__Group_2__0__Impl rule__Arguments__Group_2__1 )
            // InternalMontiArcAndCore.g:2487:2: rule__Arguments__Group_2__0__Impl rule__Arguments__Group_2__1
            {
            pushFollow(FOLLOW_15);
            rule__Arguments__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arguments__Group_2__1();

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
    // $ANTLR end "rule__Arguments__Group_2__0"


    // $ANTLR start "rule__Arguments__Group_2__0__Impl"
    // InternalMontiArcAndCore.g:2494:1: rule__Arguments__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Arguments__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2498:1: ( ( ',' ) )
            // InternalMontiArcAndCore.g:2499:1: ( ',' )
            {
            // InternalMontiArcAndCore.g:2499:1: ( ',' )
            // InternalMontiArcAndCore.g:2500:2: ','
            {
             before(grammarAccess.getArgumentsAccess().getCommaKeyword_2_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getArgumentsAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__Arguments__Group_2__0__Impl"


    // $ANTLR start "rule__Arguments__Group_2__1"
    // InternalMontiArcAndCore.g:2509:1: rule__Arguments__Group_2__1 : rule__Arguments__Group_2__1__Impl ;
    public final void rule__Arguments__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2513:1: ( rule__Arguments__Group_2__1__Impl )
            // InternalMontiArcAndCore.g:2514:2: rule__Arguments__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Arguments__Group_2__1__Impl();

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
    // $ANTLR end "rule__Arguments__Group_2__1"


    // $ANTLR start "rule__Arguments__Group_2__1__Impl"
    // InternalMontiArcAndCore.g:2520:1: rule__Arguments__Group_2__1__Impl : ( ( rule__Arguments__ArgumentsAssignment_2_1 ) ) ;
    public final void rule__Arguments__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2524:1: ( ( ( rule__Arguments__ArgumentsAssignment_2_1 ) ) )
            // InternalMontiArcAndCore.g:2525:1: ( ( rule__Arguments__ArgumentsAssignment_2_1 ) )
            {
            // InternalMontiArcAndCore.g:2525:1: ( ( rule__Arguments__ArgumentsAssignment_2_1 ) )
            // InternalMontiArcAndCore.g:2526:2: ( rule__Arguments__ArgumentsAssignment_2_1 )
            {
             before(grammarAccess.getArgumentsAccess().getArgumentsAssignment_2_1()); 
            // InternalMontiArcAndCore.g:2527:2: ( rule__Arguments__ArgumentsAssignment_2_1 )
            // InternalMontiArcAndCore.g:2527:3: rule__Arguments__ArgumentsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Arguments__ArgumentsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getArgumentsAccess().getArgumentsAssignment_2_1()); 

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
    // $ANTLR end "rule__Arguments__Group_2__1__Impl"


    // $ANTLR start "rule__Argument__Group__0"
    // InternalMontiArcAndCore.g:2536:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2540:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // InternalMontiArcAndCore.g:2541:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Argument__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Argument__Group__1();

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
    // $ANTLR end "rule__Argument__Group__0"


    // $ANTLR start "rule__Argument__Group__0__Impl"
    // InternalMontiArcAndCore.g:2548:1: rule__Argument__Group__0__Impl : ( ( rule__Argument__NameAssignment_0 ) ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2552:1: ( ( ( rule__Argument__NameAssignment_0 ) ) )
            // InternalMontiArcAndCore.g:2553:1: ( ( rule__Argument__NameAssignment_0 ) )
            {
            // InternalMontiArcAndCore.g:2553:1: ( ( rule__Argument__NameAssignment_0 ) )
            // InternalMontiArcAndCore.g:2554:2: ( rule__Argument__NameAssignment_0 )
            {
             before(grammarAccess.getArgumentAccess().getNameAssignment_0()); 
            // InternalMontiArcAndCore.g:2555:2: ( rule__Argument__NameAssignment_0 )
            // InternalMontiArcAndCore.g:2555:3: rule__Argument__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Argument__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Argument__Group__0__Impl"


    // $ANTLR start "rule__Argument__Group__1"
    // InternalMontiArcAndCore.g:2563:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2567:1: ( rule__Argument__Group__1__Impl )
            // InternalMontiArcAndCore.g:2568:2: rule__Argument__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Argument__Group__1__Impl();

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
    // $ANTLR end "rule__Argument__Group__1"


    // $ANTLR start "rule__Argument__Group__1__Impl"
    // InternalMontiArcAndCore.g:2574:1: rule__Argument__Group__1__Impl : ( ( rule__Argument__ExpressionAssignment_1 ) ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2578:1: ( ( ( rule__Argument__ExpressionAssignment_1 ) ) )
            // InternalMontiArcAndCore.g:2579:1: ( ( rule__Argument__ExpressionAssignment_1 ) )
            {
            // InternalMontiArcAndCore.g:2579:1: ( ( rule__Argument__ExpressionAssignment_1 ) )
            // InternalMontiArcAndCore.g:2580:2: ( rule__Argument__ExpressionAssignment_1 )
            {
             before(grammarAccess.getArgumentAccess().getExpressionAssignment_1()); 
            // InternalMontiArcAndCore.g:2581:2: ( rule__Argument__ExpressionAssignment_1 )
            // InternalMontiArcAndCore.g:2581:3: rule__Argument__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Argument__ExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getExpressionAssignment_1()); 

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
    // $ANTLR end "rule__Argument__Group__1__Impl"


    // $ANTLR start "rule__ClassDiagramCompilationUnit__Group__0"
    // InternalMontiArcAndCore.g:2590:1: rule__ClassDiagramCompilationUnit__Group__0 : rule__ClassDiagramCompilationUnit__Group__0__Impl rule__ClassDiagramCompilationUnit__Group__1 ;
    public final void rule__ClassDiagramCompilationUnit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2594:1: ( rule__ClassDiagramCompilationUnit__Group__0__Impl rule__ClassDiagramCompilationUnit__Group__1 )
            // InternalMontiArcAndCore.g:2595:2: rule__ClassDiagramCompilationUnit__Group__0__Impl rule__ClassDiagramCompilationUnit__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__ClassDiagramCompilationUnit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDiagramCompilationUnit__Group__1();

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
    // $ANTLR end "rule__ClassDiagramCompilationUnit__Group__0"


    // $ANTLR start "rule__ClassDiagramCompilationUnit__Group__0__Impl"
    // InternalMontiArcAndCore.g:2602:1: rule__ClassDiagramCompilationUnit__Group__0__Impl : ( ( rule__ClassDiagramCompilationUnit__PackageAssignment_0 ) ) ;
    public final void rule__ClassDiagramCompilationUnit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2606:1: ( ( ( rule__ClassDiagramCompilationUnit__PackageAssignment_0 ) ) )
            // InternalMontiArcAndCore.g:2607:1: ( ( rule__ClassDiagramCompilationUnit__PackageAssignment_0 ) )
            {
            // InternalMontiArcAndCore.g:2607:1: ( ( rule__ClassDiagramCompilationUnit__PackageAssignment_0 ) )
            // InternalMontiArcAndCore.g:2608:2: ( rule__ClassDiagramCompilationUnit__PackageAssignment_0 )
            {
             before(grammarAccess.getClassDiagramCompilationUnitAccess().getPackageAssignment_0()); 
            // InternalMontiArcAndCore.g:2609:2: ( rule__ClassDiagramCompilationUnit__PackageAssignment_0 )
            // InternalMontiArcAndCore.g:2609:3: rule__ClassDiagramCompilationUnit__PackageAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ClassDiagramCompilationUnit__PackageAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getClassDiagramCompilationUnitAccess().getPackageAssignment_0()); 

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
    // $ANTLR end "rule__ClassDiagramCompilationUnit__Group__0__Impl"


    // $ANTLR start "rule__ClassDiagramCompilationUnit__Group__1"
    // InternalMontiArcAndCore.g:2617:1: rule__ClassDiagramCompilationUnit__Group__1 : rule__ClassDiagramCompilationUnit__Group__1__Impl rule__ClassDiagramCompilationUnit__Group__2 ;
    public final void rule__ClassDiagramCompilationUnit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2621:1: ( rule__ClassDiagramCompilationUnit__Group__1__Impl rule__ClassDiagramCompilationUnit__Group__2 )
            // InternalMontiArcAndCore.g:2622:2: rule__ClassDiagramCompilationUnit__Group__1__Impl rule__ClassDiagramCompilationUnit__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__ClassDiagramCompilationUnit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDiagramCompilationUnit__Group__2();

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
    // $ANTLR end "rule__ClassDiagramCompilationUnit__Group__1"


    // $ANTLR start "rule__ClassDiagramCompilationUnit__Group__1__Impl"
    // InternalMontiArcAndCore.g:2629:1: rule__ClassDiagramCompilationUnit__Group__1__Impl : ( ( rule__ClassDiagramCompilationUnit__ImportStatementsAssignment_1 )* ) ;
    public final void rule__ClassDiagramCompilationUnit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2633:1: ( ( ( rule__ClassDiagramCompilationUnit__ImportStatementsAssignment_1 )* ) )
            // InternalMontiArcAndCore.g:2634:1: ( ( rule__ClassDiagramCompilationUnit__ImportStatementsAssignment_1 )* )
            {
            // InternalMontiArcAndCore.g:2634:1: ( ( rule__ClassDiagramCompilationUnit__ImportStatementsAssignment_1 )* )
            // InternalMontiArcAndCore.g:2635:2: ( rule__ClassDiagramCompilationUnit__ImportStatementsAssignment_1 )*
            {
             before(grammarAccess.getClassDiagramCompilationUnitAccess().getImportStatementsAssignment_1()); 
            // InternalMontiArcAndCore.g:2636:2: ( rule__ClassDiagramCompilationUnit__ImportStatementsAssignment_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==43) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalMontiArcAndCore.g:2636:3: rule__ClassDiagramCompilationUnit__ImportStatementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__ClassDiagramCompilationUnit__ImportStatementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getClassDiagramCompilationUnitAccess().getImportStatementsAssignment_1()); 

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
    // $ANTLR end "rule__ClassDiagramCompilationUnit__Group__1__Impl"


    // $ANTLR start "rule__ClassDiagramCompilationUnit__Group__2"
    // InternalMontiArcAndCore.g:2644:1: rule__ClassDiagramCompilationUnit__Group__2 : rule__ClassDiagramCompilationUnit__Group__2__Impl ;
    public final void rule__ClassDiagramCompilationUnit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2648:1: ( rule__ClassDiagramCompilationUnit__Group__2__Impl )
            // InternalMontiArcAndCore.g:2649:2: rule__ClassDiagramCompilationUnit__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDiagramCompilationUnit__Group__2__Impl();

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
    // $ANTLR end "rule__ClassDiagramCompilationUnit__Group__2"


    // $ANTLR start "rule__ClassDiagramCompilationUnit__Group__2__Impl"
    // InternalMontiArcAndCore.g:2655:1: rule__ClassDiagramCompilationUnit__Group__2__Impl : ( ( rule__ClassDiagramCompilationUnit__DiagramAssignment_2 ) ) ;
    public final void rule__ClassDiagramCompilationUnit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2659:1: ( ( ( rule__ClassDiagramCompilationUnit__DiagramAssignment_2 ) ) )
            // InternalMontiArcAndCore.g:2660:1: ( ( rule__ClassDiagramCompilationUnit__DiagramAssignment_2 ) )
            {
            // InternalMontiArcAndCore.g:2660:1: ( ( rule__ClassDiagramCompilationUnit__DiagramAssignment_2 ) )
            // InternalMontiArcAndCore.g:2661:2: ( rule__ClassDiagramCompilationUnit__DiagramAssignment_2 )
            {
             before(grammarAccess.getClassDiagramCompilationUnitAccess().getDiagramAssignment_2()); 
            // InternalMontiArcAndCore.g:2662:2: ( rule__ClassDiagramCompilationUnit__DiagramAssignment_2 )
            // InternalMontiArcAndCore.g:2662:3: rule__ClassDiagramCompilationUnit__DiagramAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ClassDiagramCompilationUnit__DiagramAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClassDiagramCompilationUnitAccess().getDiagramAssignment_2()); 

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
    // $ANTLR end "rule__ClassDiagramCompilationUnit__Group__2__Impl"


    // $ANTLR start "rule__ClassDiagram__Group__0"
    // InternalMontiArcAndCore.g:2671:1: rule__ClassDiagram__Group__0 : rule__ClassDiagram__Group__0__Impl rule__ClassDiagram__Group__1 ;
    public final void rule__ClassDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2675:1: ( rule__ClassDiagram__Group__0__Impl rule__ClassDiagram__Group__1 )
            // InternalMontiArcAndCore.g:2676:2: rule__ClassDiagram__Group__0__Impl rule__ClassDiagram__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__ClassDiagram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDiagram__Group__1();

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
    // $ANTLR end "rule__ClassDiagram__Group__0"


    // $ANTLR start "rule__ClassDiagram__Group__0__Impl"
    // InternalMontiArcAndCore.g:2683:1: rule__ClassDiagram__Group__0__Impl : ( 'classdiagram' ) ;
    public final void rule__ClassDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2687:1: ( ( 'classdiagram' ) )
            // InternalMontiArcAndCore.g:2688:1: ( 'classdiagram' )
            {
            // InternalMontiArcAndCore.g:2688:1: ( 'classdiagram' )
            // InternalMontiArcAndCore.g:2689:2: 'classdiagram'
            {
             before(grammarAccess.getClassDiagramAccess().getClassdiagramKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getClassDiagramAccess().getClassdiagramKeyword_0()); 

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
    // $ANTLR end "rule__ClassDiagram__Group__0__Impl"


    // $ANTLR start "rule__ClassDiagram__Group__1"
    // InternalMontiArcAndCore.g:2698:1: rule__ClassDiagram__Group__1 : rule__ClassDiagram__Group__1__Impl rule__ClassDiagram__Group__2 ;
    public final void rule__ClassDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2702:1: ( rule__ClassDiagram__Group__1__Impl rule__ClassDiagram__Group__2 )
            // InternalMontiArcAndCore.g:2703:2: rule__ClassDiagram__Group__1__Impl rule__ClassDiagram__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__ClassDiagram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDiagram__Group__2();

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
    // $ANTLR end "rule__ClassDiagram__Group__1"


    // $ANTLR start "rule__ClassDiagram__Group__1__Impl"
    // InternalMontiArcAndCore.g:2710:1: rule__ClassDiagram__Group__1__Impl : ( ( rule__ClassDiagram__NameAssignment_1 ) ) ;
    public final void rule__ClassDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2714:1: ( ( ( rule__ClassDiagram__NameAssignment_1 ) ) )
            // InternalMontiArcAndCore.g:2715:1: ( ( rule__ClassDiagram__NameAssignment_1 ) )
            {
            // InternalMontiArcAndCore.g:2715:1: ( ( rule__ClassDiagram__NameAssignment_1 ) )
            // InternalMontiArcAndCore.g:2716:2: ( rule__ClassDiagram__NameAssignment_1 )
            {
             before(grammarAccess.getClassDiagramAccess().getNameAssignment_1()); 
            // InternalMontiArcAndCore.g:2717:2: ( rule__ClassDiagram__NameAssignment_1 )
            // InternalMontiArcAndCore.g:2717:3: rule__ClassDiagram__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassDiagram__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClassDiagramAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ClassDiagram__Group__1__Impl"


    // $ANTLR start "rule__ClassDiagram__Group__2"
    // InternalMontiArcAndCore.g:2725:1: rule__ClassDiagram__Group__2 : rule__ClassDiagram__Group__2__Impl rule__ClassDiagram__Group__3 ;
    public final void rule__ClassDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2729:1: ( rule__ClassDiagram__Group__2__Impl rule__ClassDiagram__Group__3 )
            // InternalMontiArcAndCore.g:2730:2: rule__ClassDiagram__Group__2__Impl rule__ClassDiagram__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__ClassDiagram__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDiagram__Group__3();

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
    // $ANTLR end "rule__ClassDiagram__Group__2"


    // $ANTLR start "rule__ClassDiagram__Group__2__Impl"
    // InternalMontiArcAndCore.g:2737:1: rule__ClassDiagram__Group__2__Impl : ( '{' ) ;
    public final void rule__ClassDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2741:1: ( ( '{' ) )
            // InternalMontiArcAndCore.g:2742:1: ( '{' )
            {
            // InternalMontiArcAndCore.g:2742:1: ( '{' )
            // InternalMontiArcAndCore.g:2743:2: '{'
            {
             before(grammarAccess.getClassDiagramAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getClassDiagramAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ClassDiagram__Group__2__Impl"


    // $ANTLR start "rule__ClassDiagram__Group__3"
    // InternalMontiArcAndCore.g:2752:1: rule__ClassDiagram__Group__3 : rule__ClassDiagram__Group__3__Impl rule__ClassDiagram__Group__4 ;
    public final void rule__ClassDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2756:1: ( rule__ClassDiagram__Group__3__Impl rule__ClassDiagram__Group__4 )
            // InternalMontiArcAndCore.g:2757:2: rule__ClassDiagram__Group__3__Impl rule__ClassDiagram__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__ClassDiagram__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDiagram__Group__4();

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
    // $ANTLR end "rule__ClassDiagram__Group__3"


    // $ANTLR start "rule__ClassDiagram__Group__3__Impl"
    // InternalMontiArcAndCore.g:2764:1: rule__ClassDiagram__Group__3__Impl : ( ( rule__ClassDiagram__CdElementsAssignment_3 )* ) ;
    public final void rule__ClassDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2768:1: ( ( ( rule__ClassDiagram__CdElementsAssignment_3 )* ) )
            // InternalMontiArcAndCore.g:2769:1: ( ( rule__ClassDiagram__CdElementsAssignment_3 )* )
            {
            // InternalMontiArcAndCore.g:2769:1: ( ( rule__ClassDiagram__CdElementsAssignment_3 )* )
            // InternalMontiArcAndCore.g:2770:2: ( rule__ClassDiagram__CdElementsAssignment_3 )*
            {
             before(grammarAccess.getClassDiagramAccess().getCdElementsAssignment_3()); 
            // InternalMontiArcAndCore.g:2771:2: ( rule__ClassDiagram__CdElementsAssignment_3 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==54||LA30_0==57||LA30_0==67) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMontiArcAndCore.g:2771:3: rule__ClassDiagram__CdElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__ClassDiagram__CdElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getClassDiagramAccess().getCdElementsAssignment_3()); 

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
    // $ANTLR end "rule__ClassDiagram__Group__3__Impl"


    // $ANTLR start "rule__ClassDiagram__Group__4"
    // InternalMontiArcAndCore.g:2779:1: rule__ClassDiagram__Group__4 : rule__ClassDiagram__Group__4__Impl ;
    public final void rule__ClassDiagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2783:1: ( rule__ClassDiagram__Group__4__Impl )
            // InternalMontiArcAndCore.g:2784:2: rule__ClassDiagram__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDiagram__Group__4__Impl();

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
    // $ANTLR end "rule__ClassDiagram__Group__4"


    // $ANTLR start "rule__ClassDiagram__Group__4__Impl"
    // InternalMontiArcAndCore.g:2790:1: rule__ClassDiagram__Group__4__Impl : ( '}' ) ;
    public final void rule__ClassDiagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2794:1: ( ( '}' ) )
            // InternalMontiArcAndCore.g:2795:1: ( '}' )
            {
            // InternalMontiArcAndCore.g:2795:1: ( '}' )
            // InternalMontiArcAndCore.g:2796:2: '}'
            {
             before(grammarAccess.getClassDiagramAccess().getRightCurlyBracketKeyword_4()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getClassDiagramAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__ClassDiagram__Group__4__Impl"


    // $ANTLR start "rule__CDClass__Group__0"
    // InternalMontiArcAndCore.g:2806:1: rule__CDClass__Group__0 : rule__CDClass__Group__0__Impl rule__CDClass__Group__1 ;
    public final void rule__CDClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2810:1: ( rule__CDClass__Group__0__Impl rule__CDClass__Group__1 )
            // InternalMontiArcAndCore.g:2811:2: rule__CDClass__Group__0__Impl rule__CDClass__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__CDClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CDClass__Group__1();

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
    // $ANTLR end "rule__CDClass__Group__0"


    // $ANTLR start "rule__CDClass__Group__0__Impl"
    // InternalMontiArcAndCore.g:2818:1: rule__CDClass__Group__0__Impl : ( ( rule__CDClass__PublicAssignment_0 )? ) ;
    public final void rule__CDClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2822:1: ( ( ( rule__CDClass__PublicAssignment_0 )? ) )
            // InternalMontiArcAndCore.g:2823:1: ( ( rule__CDClass__PublicAssignment_0 )? )
            {
            // InternalMontiArcAndCore.g:2823:1: ( ( rule__CDClass__PublicAssignment_0 )? )
            // InternalMontiArcAndCore.g:2824:2: ( rule__CDClass__PublicAssignment_0 )?
            {
             before(grammarAccess.getCDClassAccess().getPublicAssignment_0()); 
            // InternalMontiArcAndCore.g:2825:2: ( rule__CDClass__PublicAssignment_0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==67) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMontiArcAndCore.g:2825:3: rule__CDClass__PublicAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CDClass__PublicAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCDClassAccess().getPublicAssignment_0()); 

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
    // $ANTLR end "rule__CDClass__Group__0__Impl"


    // $ANTLR start "rule__CDClass__Group__1"
    // InternalMontiArcAndCore.g:2833:1: rule__CDClass__Group__1 : rule__CDClass__Group__1__Impl rule__CDClass__Group__2 ;
    public final void rule__CDClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2837:1: ( rule__CDClass__Group__1__Impl rule__CDClass__Group__2 )
            // InternalMontiArcAndCore.g:2838:2: rule__CDClass__Group__1__Impl rule__CDClass__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__CDClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CDClass__Group__2();

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
    // $ANTLR end "rule__CDClass__Group__1"


    // $ANTLR start "rule__CDClass__Group__1__Impl"
    // InternalMontiArcAndCore.g:2845:1: rule__CDClass__Group__1__Impl : ( 'class' ) ;
    public final void rule__CDClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2849:1: ( ( 'class' ) )
            // InternalMontiArcAndCore.g:2850:1: ( 'class' )
            {
            // InternalMontiArcAndCore.g:2850:1: ( 'class' )
            // InternalMontiArcAndCore.g:2851:2: 'class'
            {
             before(grammarAccess.getCDClassAccess().getClassKeyword_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getCDClassAccess().getClassKeyword_1()); 

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
    // $ANTLR end "rule__CDClass__Group__1__Impl"


    // $ANTLR start "rule__CDClass__Group__2"
    // InternalMontiArcAndCore.g:2860:1: rule__CDClass__Group__2 : rule__CDClass__Group__2__Impl rule__CDClass__Group__3 ;
    public final void rule__CDClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2864:1: ( rule__CDClass__Group__2__Impl rule__CDClass__Group__3 )
            // InternalMontiArcAndCore.g:2865:2: rule__CDClass__Group__2__Impl rule__CDClass__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__CDClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CDClass__Group__3();

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
    // $ANTLR end "rule__CDClass__Group__2"


    // $ANTLR start "rule__CDClass__Group__2__Impl"
    // InternalMontiArcAndCore.g:2872:1: rule__CDClass__Group__2__Impl : ( ( rule__CDClass__NameAssignment_2 ) ) ;
    public final void rule__CDClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2876:1: ( ( ( rule__CDClass__NameAssignment_2 ) ) )
            // InternalMontiArcAndCore.g:2877:1: ( ( rule__CDClass__NameAssignment_2 ) )
            {
            // InternalMontiArcAndCore.g:2877:1: ( ( rule__CDClass__NameAssignment_2 ) )
            // InternalMontiArcAndCore.g:2878:2: ( rule__CDClass__NameAssignment_2 )
            {
             before(grammarAccess.getCDClassAccess().getNameAssignment_2()); 
            // InternalMontiArcAndCore.g:2879:2: ( rule__CDClass__NameAssignment_2 )
            // InternalMontiArcAndCore.g:2879:3: rule__CDClass__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CDClass__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCDClassAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__CDClass__Group__2__Impl"


    // $ANTLR start "rule__CDClass__Group__3"
    // InternalMontiArcAndCore.g:2887:1: rule__CDClass__Group__3 : rule__CDClass__Group__3__Impl rule__CDClass__Group__4 ;
    public final void rule__CDClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2891:1: ( rule__CDClass__Group__3__Impl rule__CDClass__Group__4 )
            // InternalMontiArcAndCore.g:2892:2: rule__CDClass__Group__3__Impl rule__CDClass__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__CDClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CDClass__Group__4();

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
    // $ANTLR end "rule__CDClass__Group__3"


    // $ANTLR start "rule__CDClass__Group__3__Impl"
    // InternalMontiArcAndCore.g:2899:1: rule__CDClass__Group__3__Impl : ( ( rule__CDClass__Group_3__0 )? ) ;
    public final void rule__CDClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2903:1: ( ( ( rule__CDClass__Group_3__0 )? ) )
            // InternalMontiArcAndCore.g:2904:1: ( ( rule__CDClass__Group_3__0 )? )
            {
            // InternalMontiArcAndCore.g:2904:1: ( ( rule__CDClass__Group_3__0 )? )
            // InternalMontiArcAndCore.g:2905:2: ( rule__CDClass__Group_3__0 )?
            {
             before(grammarAccess.getCDClassAccess().getGroup_3()); 
            // InternalMontiArcAndCore.g:2906:2: ( rule__CDClass__Group_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==55) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMontiArcAndCore.g:2906:3: rule__CDClass__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CDClass__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCDClassAccess().getGroup_3()); 

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
    // $ANTLR end "rule__CDClass__Group__3__Impl"


    // $ANTLR start "rule__CDClass__Group__4"
    // InternalMontiArcAndCore.g:2914:1: rule__CDClass__Group__4 : rule__CDClass__Group__4__Impl rule__CDClass__Group__5 ;
    public final void rule__CDClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2918:1: ( rule__CDClass__Group__4__Impl rule__CDClass__Group__5 )
            // InternalMontiArcAndCore.g:2919:2: rule__CDClass__Group__4__Impl rule__CDClass__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__CDClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CDClass__Group__5();

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
    // $ANTLR end "rule__CDClass__Group__4"


    // $ANTLR start "rule__CDClass__Group__4__Impl"
    // InternalMontiArcAndCore.g:2926:1: rule__CDClass__Group__4__Impl : ( ( rule__CDClass__Group_4__0 )? ) ;
    public final void rule__CDClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2930:1: ( ( ( rule__CDClass__Group_4__0 )? ) )
            // InternalMontiArcAndCore.g:2931:1: ( ( rule__CDClass__Group_4__0 )? )
            {
            // InternalMontiArcAndCore.g:2931:1: ( ( rule__CDClass__Group_4__0 )? )
            // InternalMontiArcAndCore.g:2932:2: ( rule__CDClass__Group_4__0 )?
            {
             before(grammarAccess.getCDClassAccess().getGroup_4()); 
            // InternalMontiArcAndCore.g:2933:2: ( rule__CDClass__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==56) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMontiArcAndCore.g:2933:3: rule__CDClass__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CDClass__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCDClassAccess().getGroup_4()); 

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
    // $ANTLR end "rule__CDClass__Group__4__Impl"


    // $ANTLR start "rule__CDClass__Group__5"
    // InternalMontiArcAndCore.g:2941:1: rule__CDClass__Group__5 : rule__CDClass__Group__5__Impl rule__CDClass__Group__6 ;
    public final void rule__CDClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2945:1: ( rule__CDClass__Group__5__Impl rule__CDClass__Group__6 )
            // InternalMontiArcAndCore.g:2946:2: rule__CDClass__Group__5__Impl rule__CDClass__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__CDClass__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CDClass__Group__6();

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
    // $ANTLR end "rule__CDClass__Group__5"


    // $ANTLR start "rule__CDClass__Group__5__Impl"
    // InternalMontiArcAndCore.g:2953:1: rule__CDClass__Group__5__Impl : ( '{' ) ;
    public final void rule__CDClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2957:1: ( ( '{' ) )
            // InternalMontiArcAndCore.g:2958:1: ( '{' )
            {
            // InternalMontiArcAndCore.g:2958:1: ( '{' )
            // InternalMontiArcAndCore.g:2959:2: '{'
            {
             before(grammarAccess.getCDClassAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getCDClassAccess().getLeftCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__CDClass__Group__5__Impl"


    // $ANTLR start "rule__CDClass__Group__6"
    // InternalMontiArcAndCore.g:2968:1: rule__CDClass__Group__6 : rule__CDClass__Group__6__Impl rule__CDClass__Group__7 ;
    public final void rule__CDClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2972:1: ( rule__CDClass__Group__6__Impl rule__CDClass__Group__7 )
            // InternalMontiArcAndCore.g:2973:2: rule__CDClass__Group__6__Impl rule__CDClass__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__CDClass__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CDClass__Group__7();

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
    // $ANTLR end "rule__CDClass__Group__6"


    // $ANTLR start "rule__CDClass__Group__6__Impl"
    // InternalMontiArcAndCore.g:2980:1: rule__CDClass__Group__6__Impl : ( ( rule__CDClass__MembersAssignment_6 ) ) ;
    public final void rule__CDClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2984:1: ( ( ( rule__CDClass__MembersAssignment_6 ) ) )
            // InternalMontiArcAndCore.g:2985:1: ( ( rule__CDClass__MembersAssignment_6 ) )
            {
            // InternalMontiArcAndCore.g:2985:1: ( ( rule__CDClass__MembersAssignment_6 ) )
            // InternalMontiArcAndCore.g:2986:2: ( rule__CDClass__MembersAssignment_6 )
            {
             before(grammarAccess.getCDClassAccess().getMembersAssignment_6()); 
            // InternalMontiArcAndCore.g:2987:2: ( rule__CDClass__MembersAssignment_6 )
            // InternalMontiArcAndCore.g:2987:3: rule__CDClass__MembersAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__CDClass__MembersAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCDClassAccess().getMembersAssignment_6()); 

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
    // $ANTLR end "rule__CDClass__Group__6__Impl"


    // $ANTLR start "rule__CDClass__Group__7"
    // InternalMontiArcAndCore.g:2995:1: rule__CDClass__Group__7 : rule__CDClass__Group__7__Impl ;
    public final void rule__CDClass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:2999:1: ( rule__CDClass__Group__7__Impl )
            // InternalMontiArcAndCore.g:3000:2: rule__CDClass__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CDClass__Group__7__Impl();

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
    // $ANTLR end "rule__CDClass__Group__7"


    // $ANTLR start "rule__CDClass__Group__7__Impl"
    // InternalMontiArcAndCore.g:3006:1: rule__CDClass__Group__7__Impl : ( '}' ) ;
    public final void rule__CDClass__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3010:1: ( ( '}' ) )
            // InternalMontiArcAndCore.g:3011:1: ( '}' )
            {
            // InternalMontiArcAndCore.g:3011:1: ( '}' )
            // InternalMontiArcAndCore.g:3012:2: '}'
            {
             before(grammarAccess.getCDClassAccess().getRightCurlyBracketKeyword_7()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getCDClassAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__CDClass__Group__7__Impl"


    // $ANTLR start "rule__CDClass__Group_3__0"
    // InternalMontiArcAndCore.g:3022:1: rule__CDClass__Group_3__0 : rule__CDClass__Group_3__0__Impl rule__CDClass__Group_3__1 ;
    public final void rule__CDClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3026:1: ( rule__CDClass__Group_3__0__Impl rule__CDClass__Group_3__1 )
            // InternalMontiArcAndCore.g:3027:2: rule__CDClass__Group_3__0__Impl rule__CDClass__Group_3__1
            {
            pushFollow(FOLLOW_15);
            rule__CDClass__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CDClass__Group_3__1();

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
    // $ANTLR end "rule__CDClass__Group_3__0"


    // $ANTLR start "rule__CDClass__Group_3__0__Impl"
    // InternalMontiArcAndCore.g:3034:1: rule__CDClass__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__CDClass__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3038:1: ( ( 'extends' ) )
            // InternalMontiArcAndCore.g:3039:1: ( 'extends' )
            {
            // InternalMontiArcAndCore.g:3039:1: ( 'extends' )
            // InternalMontiArcAndCore.g:3040:2: 'extends'
            {
             before(grammarAccess.getCDClassAccess().getExtendsKeyword_3_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getCDClassAccess().getExtendsKeyword_3_0()); 

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
    // $ANTLR end "rule__CDClass__Group_3__0__Impl"


    // $ANTLR start "rule__CDClass__Group_3__1"
    // InternalMontiArcAndCore.g:3049:1: rule__CDClass__Group_3__1 : rule__CDClass__Group_3__1__Impl ;
    public final void rule__CDClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3053:1: ( rule__CDClass__Group_3__1__Impl )
            // InternalMontiArcAndCore.g:3054:2: rule__CDClass__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CDClass__Group_3__1__Impl();

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
    // $ANTLR end "rule__CDClass__Group_3__1"


    // $ANTLR start "rule__CDClass__Group_3__1__Impl"
    // InternalMontiArcAndCore.g:3060:1: rule__CDClass__Group_3__1__Impl : ( ( rule__CDClass__ExtendsAssignment_3_1 ) ) ;
    public final void rule__CDClass__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3064:1: ( ( ( rule__CDClass__ExtendsAssignment_3_1 ) ) )
            // InternalMontiArcAndCore.g:3065:1: ( ( rule__CDClass__ExtendsAssignment_3_1 ) )
            {
            // InternalMontiArcAndCore.g:3065:1: ( ( rule__CDClass__ExtendsAssignment_3_1 ) )
            // InternalMontiArcAndCore.g:3066:2: ( rule__CDClass__ExtendsAssignment_3_1 )
            {
             before(grammarAccess.getCDClassAccess().getExtendsAssignment_3_1()); 
            // InternalMontiArcAndCore.g:3067:2: ( rule__CDClass__ExtendsAssignment_3_1 )
            // InternalMontiArcAndCore.g:3067:3: rule__CDClass__ExtendsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__CDClass__ExtendsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCDClassAccess().getExtendsAssignment_3_1()); 

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
    // $ANTLR end "rule__CDClass__Group_3__1__Impl"


    // $ANTLR start "rule__CDClass__Group_4__0"
    // InternalMontiArcAndCore.g:3076:1: rule__CDClass__Group_4__0 : rule__CDClass__Group_4__0__Impl rule__CDClass__Group_4__1 ;
    public final void rule__CDClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3080:1: ( rule__CDClass__Group_4__0__Impl rule__CDClass__Group_4__1 )
            // InternalMontiArcAndCore.g:3081:2: rule__CDClass__Group_4__0__Impl rule__CDClass__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__CDClass__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CDClass__Group_4__1();

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
    // $ANTLR end "rule__CDClass__Group_4__0"


    // $ANTLR start "rule__CDClass__Group_4__0__Impl"
    // InternalMontiArcAndCore.g:3088:1: rule__CDClass__Group_4__0__Impl : ( 'implements' ) ;
    public final void rule__CDClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3092:1: ( ( 'implements' ) )
            // InternalMontiArcAndCore.g:3093:1: ( 'implements' )
            {
            // InternalMontiArcAndCore.g:3093:1: ( 'implements' )
            // InternalMontiArcAndCore.g:3094:2: 'implements'
            {
             before(grammarAccess.getCDClassAccess().getImplementsKeyword_4_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getCDClassAccess().getImplementsKeyword_4_0()); 

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
    // $ANTLR end "rule__CDClass__Group_4__0__Impl"


    // $ANTLR start "rule__CDClass__Group_4__1"
    // InternalMontiArcAndCore.g:3103:1: rule__CDClass__Group_4__1 : rule__CDClass__Group_4__1__Impl rule__CDClass__Group_4__2 ;
    public final void rule__CDClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3107:1: ( rule__CDClass__Group_4__1__Impl rule__CDClass__Group_4__2 )
            // InternalMontiArcAndCore.g:3108:2: rule__CDClass__Group_4__1__Impl rule__CDClass__Group_4__2
            {
            pushFollow(FOLLOW_27);
            rule__CDClass__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CDClass__Group_4__2();

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
    // $ANTLR end "rule__CDClass__Group_4__1"


    // $ANTLR start "rule__CDClass__Group_4__1__Impl"
    // InternalMontiArcAndCore.g:3115:1: rule__CDClass__Group_4__1__Impl : ( ( rule__CDClass__ImplementsAssignment_4_1 ) ) ;
    public final void rule__CDClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3119:1: ( ( ( rule__CDClass__ImplementsAssignment_4_1 ) ) )
            // InternalMontiArcAndCore.g:3120:1: ( ( rule__CDClass__ImplementsAssignment_4_1 ) )
            {
            // InternalMontiArcAndCore.g:3120:1: ( ( rule__CDClass__ImplementsAssignment_4_1 ) )
            // InternalMontiArcAndCore.g:3121:2: ( rule__CDClass__ImplementsAssignment_4_1 )
            {
             before(grammarAccess.getCDClassAccess().getImplementsAssignment_4_1()); 
            // InternalMontiArcAndCore.g:3122:2: ( rule__CDClass__ImplementsAssignment_4_1 )
            // InternalMontiArcAndCore.g:3122:3: rule__CDClass__ImplementsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__CDClass__ImplementsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCDClassAccess().getImplementsAssignment_4_1()); 

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
    // $ANTLR end "rule__CDClass__Group_4__1__Impl"


    // $ANTLR start "rule__CDClass__Group_4__2"
    // InternalMontiArcAndCore.g:3130:1: rule__CDClass__Group_4__2 : rule__CDClass__Group_4__2__Impl ;
    public final void rule__CDClass__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3134:1: ( rule__CDClass__Group_4__2__Impl )
            // InternalMontiArcAndCore.g:3135:2: rule__CDClass__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CDClass__Group_4__2__Impl();

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
    // $ANTLR end "rule__CDClass__Group_4__2"


    // $ANTLR start "rule__CDClass__Group_4__2__Impl"
    // InternalMontiArcAndCore.g:3141:1: rule__CDClass__Group_4__2__Impl : ( ( rule__CDClass__Group_4_2__0 )* ) ;
    public final void rule__CDClass__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3145:1: ( ( ( rule__CDClass__Group_4_2__0 )* ) )
            // InternalMontiArcAndCore.g:3146:1: ( ( rule__CDClass__Group_4_2__0 )* )
            {
            // InternalMontiArcAndCore.g:3146:1: ( ( rule__CDClass__Group_4_2__0 )* )
            // InternalMontiArcAndCore.g:3147:2: ( rule__CDClass__Group_4_2__0 )*
            {
             before(grammarAccess.getCDClassAccess().getGroup_4_2()); 
            // InternalMontiArcAndCore.g:3148:2: ( rule__CDClass__Group_4_2__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==50) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalMontiArcAndCore.g:3148:3: rule__CDClass__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__CDClass__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getCDClassAccess().getGroup_4_2()); 

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
    // $ANTLR end "rule__CDClass__Group_4__2__Impl"


    // $ANTLR start "rule__CDClass__Group_4_2__0"
    // InternalMontiArcAndCore.g:3157:1: rule__CDClass__Group_4_2__0 : rule__CDClass__Group_4_2__0__Impl rule__CDClass__Group_4_2__1 ;
    public final void rule__CDClass__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3161:1: ( rule__CDClass__Group_4_2__0__Impl rule__CDClass__Group_4_2__1 )
            // InternalMontiArcAndCore.g:3162:2: rule__CDClass__Group_4_2__0__Impl rule__CDClass__Group_4_2__1
            {
            pushFollow(FOLLOW_15);
            rule__CDClass__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CDClass__Group_4_2__1();

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
    // $ANTLR end "rule__CDClass__Group_4_2__0"


    // $ANTLR start "rule__CDClass__Group_4_2__0__Impl"
    // InternalMontiArcAndCore.g:3169:1: rule__CDClass__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__CDClass__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3173:1: ( ( ',' ) )
            // InternalMontiArcAndCore.g:3174:1: ( ',' )
            {
            // InternalMontiArcAndCore.g:3174:1: ( ',' )
            // InternalMontiArcAndCore.g:3175:2: ','
            {
             before(grammarAccess.getCDClassAccess().getCommaKeyword_4_2_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getCDClassAccess().getCommaKeyword_4_2_0()); 

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
    // $ANTLR end "rule__CDClass__Group_4_2__0__Impl"


    // $ANTLR start "rule__CDClass__Group_4_2__1"
    // InternalMontiArcAndCore.g:3184:1: rule__CDClass__Group_4_2__1 : rule__CDClass__Group_4_2__1__Impl ;
    public final void rule__CDClass__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3188:1: ( rule__CDClass__Group_4_2__1__Impl )
            // InternalMontiArcAndCore.g:3189:2: rule__CDClass__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CDClass__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__CDClass__Group_4_2__1"


    // $ANTLR start "rule__CDClass__Group_4_2__1__Impl"
    // InternalMontiArcAndCore.g:3195:1: rule__CDClass__Group_4_2__1__Impl : ( ( rule__CDClass__ImplementsAssignment_4_2_1 ) ) ;
    public final void rule__CDClass__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3199:1: ( ( ( rule__CDClass__ImplementsAssignment_4_2_1 ) ) )
            // InternalMontiArcAndCore.g:3200:1: ( ( rule__CDClass__ImplementsAssignment_4_2_1 ) )
            {
            // InternalMontiArcAndCore.g:3200:1: ( ( rule__CDClass__ImplementsAssignment_4_2_1 ) )
            // InternalMontiArcAndCore.g:3201:2: ( rule__CDClass__ImplementsAssignment_4_2_1 )
            {
             before(grammarAccess.getCDClassAccess().getImplementsAssignment_4_2_1()); 
            // InternalMontiArcAndCore.g:3202:2: ( rule__CDClass__ImplementsAssignment_4_2_1 )
            // InternalMontiArcAndCore.g:3202:3: rule__CDClass__ImplementsAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__CDClass__ImplementsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCDClassAccess().getImplementsAssignment_4_2_1()); 

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
    // $ANTLR end "rule__CDClass__Group_4_2__1__Impl"


    // $ANTLR start "rule__CDEnum__Group__0"
    // InternalMontiArcAndCore.g:3211:1: rule__CDEnum__Group__0 : rule__CDEnum__Group__0__Impl rule__CDEnum__Group__1 ;
    public final void rule__CDEnum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3215:1: ( rule__CDEnum__Group__0__Impl rule__CDEnum__Group__1 )
            // InternalMontiArcAndCore.g:3216:2: rule__CDEnum__Group__0__Impl rule__CDEnum__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__CDEnum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CDEnum__Group__1();

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
    // $ANTLR end "rule__CDEnum__Group__0"


    // $ANTLR start "rule__CDEnum__Group__0__Impl"
    // InternalMontiArcAndCore.g:3223:1: rule__CDEnum__Group__0__Impl : ( ( rule__CDEnum__PublicAssignment_0 )? ) ;
    public final void rule__CDEnum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3227:1: ( ( ( rule__CDEnum__PublicAssignment_0 )? ) )
            // InternalMontiArcAndCore.g:3228:1: ( ( rule__CDEnum__PublicAssignment_0 )? )
            {
            // InternalMontiArcAndCore.g:3228:1: ( ( rule__CDEnum__PublicAssignment_0 )? )
            // InternalMontiArcAndCore.g:3229:2: ( rule__CDEnum__PublicAssignment_0 )?
            {
             before(grammarAccess.getCDEnumAccess().getPublicAssignment_0()); 
            // InternalMontiArcAndCore.g:3230:2: ( rule__CDEnum__PublicAssignment_0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==67) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMontiArcAndCore.g:3230:3: rule__CDEnum__PublicAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CDEnum__PublicAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCDEnumAccess().getPublicAssignment_0()); 

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
    // $ANTLR end "rule__CDEnum__Group__0__Impl"


    // $ANTLR start "rule__CDEnum__Group__1"
    // InternalMontiArcAndCore.g:3238:1: rule__CDEnum__Group__1 : rule__CDEnum__Group__1__Impl rule__CDEnum__Group__2 ;
    public final void rule__CDEnum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3242:1: ( rule__CDEnum__Group__1__Impl rule__CDEnum__Group__2 )
            // InternalMontiArcAndCore.g:3243:2: rule__CDEnum__Group__1__Impl rule__CDEnum__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__CDEnum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CDEnum__Group__2();

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
    // $ANTLR end "rule__CDEnum__Group__1"


    // $ANTLR start "rule__CDEnum__Group__1__Impl"
    // InternalMontiArcAndCore.g:3250:1: rule__CDEnum__Group__1__Impl : ( 'enum' ) ;
    public final void rule__CDEnum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3254:1: ( ( 'enum' ) )
            // InternalMontiArcAndCore.g:3255:1: ( 'enum' )
            {
            // InternalMontiArcAndCore.g:3255:1: ( 'enum' )
            // InternalMontiArcAndCore.g:3256:2: 'enum'
            {
             before(grammarAccess.getCDEnumAccess().getEnumKeyword_1()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getCDEnumAccess().getEnumKeyword_1()); 

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
    // $ANTLR end "rule__CDEnum__Group__1__Impl"


    // $ANTLR start "rule__CDEnum__Group__2"
    // InternalMontiArcAndCore.g:3265:1: rule__CDEnum__Group__2 : rule__CDEnum__Group__2__Impl rule__CDEnum__Group__3 ;
    public final void rule__CDEnum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3269:1: ( rule__CDEnum__Group__2__Impl rule__CDEnum__Group__3 )
            // InternalMontiArcAndCore.g:3270:2: rule__CDEnum__Group__2__Impl rule__CDEnum__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__CDEnum__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CDEnum__Group__3();

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
    // $ANTLR end "rule__CDEnum__Group__2"


    // $ANTLR start "rule__CDEnum__Group__2__Impl"
    // InternalMontiArcAndCore.g:3277:1: rule__CDEnum__Group__2__Impl : ( ( rule__CDEnum__NameAssignment_2 ) ) ;
    public final void rule__CDEnum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3281:1: ( ( ( rule__CDEnum__NameAssignment_2 ) ) )
            // InternalMontiArcAndCore.g:3282:1: ( ( rule__CDEnum__NameAssignment_2 ) )
            {
            // InternalMontiArcAndCore.g:3282:1: ( ( rule__CDEnum__NameAssignment_2 ) )
            // InternalMontiArcAndCore.g:3283:2: ( rule__CDEnum__NameAssignment_2 )
            {
             before(grammarAccess.getCDEnumAccess().getNameAssignment_2()); 
            // InternalMontiArcAndCore.g:3284:2: ( rule__CDEnum__NameAssignment_2 )
            // InternalMontiArcAndCore.g:3284:3: rule__CDEnum__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CDEnum__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCDEnumAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__CDEnum__Group__2__Impl"


    // $ANTLR start "rule__CDEnum__Group__3"
    // InternalMontiArcAndCore.g:3292:1: rule__CDEnum__Group__3 : rule__CDEnum__Group__3__Impl rule__CDEnum__Group__4 ;
    public final void rule__CDEnum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3296:1: ( rule__CDEnum__Group__3__Impl rule__CDEnum__Group__4 )
            // InternalMontiArcAndCore.g:3297:2: rule__CDEnum__Group__3__Impl rule__CDEnum__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__CDEnum__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CDEnum__Group__4();

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
    // $ANTLR end "rule__CDEnum__Group__3"


    // $ANTLR start "rule__CDEnum__Group__3__Impl"
    // InternalMontiArcAndCore.g:3304:1: rule__CDEnum__Group__3__Impl : ( '{' ) ;
    public final void rule__CDEnum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3308:1: ( ( '{' ) )
            // InternalMontiArcAndCore.g:3309:1: ( '{' )
            {
            // InternalMontiArcAndCore.g:3309:1: ( '{' )
            // InternalMontiArcAndCore.g:3310:2: '{'
            {
             before(grammarAccess.getCDEnumAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getCDEnumAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__CDEnum__Group__3__Impl"


    // $ANTLR start "rule__CDEnum__Group__4"
    // InternalMontiArcAndCore.g:3319:1: rule__CDEnum__Group__4 : rule__CDEnum__Group__4__Impl rule__CDEnum__Group__5 ;
    public final void rule__CDEnum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3323:1: ( rule__CDEnum__Group__4__Impl rule__CDEnum__Group__5 )
            // InternalMontiArcAndCore.g:3324:2: rule__CDEnum__Group__4__Impl rule__CDEnum__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__CDEnum__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CDEnum__Group__5();

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
    // $ANTLR end "rule__CDEnum__Group__4"


    // $ANTLR start "rule__CDEnum__Group__4__Impl"
    // InternalMontiArcAndCore.g:3331:1: rule__CDEnum__Group__4__Impl : ( ( rule__CDEnum__ValuesAssignment_4 ) ) ;
    public final void rule__CDEnum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3335:1: ( ( ( rule__CDEnum__ValuesAssignment_4 ) ) )
            // InternalMontiArcAndCore.g:3336:1: ( ( rule__CDEnum__ValuesAssignment_4 ) )
            {
            // InternalMontiArcAndCore.g:3336:1: ( ( rule__CDEnum__ValuesAssignment_4 ) )
            // InternalMontiArcAndCore.g:3337:2: ( rule__CDEnum__ValuesAssignment_4 )
            {
             before(grammarAccess.getCDEnumAccess().getValuesAssignment_4()); 
            // InternalMontiArcAndCore.g:3338:2: ( rule__CDEnum__ValuesAssignment_4 )
            // InternalMontiArcAndCore.g:3338:3: rule__CDEnum__ValuesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CDEnum__ValuesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCDEnumAccess().getValuesAssignment_4()); 

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
    // $ANTLR end "rule__CDEnum__Group__4__Impl"


    // $ANTLR start "rule__CDEnum__Group__5"
    // InternalMontiArcAndCore.g:3346:1: rule__CDEnum__Group__5 : rule__CDEnum__Group__5__Impl ;
    public final void rule__CDEnum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3350:1: ( rule__CDEnum__Group__5__Impl )
            // InternalMontiArcAndCore.g:3351:2: rule__CDEnum__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CDEnum__Group__5__Impl();

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
    // $ANTLR end "rule__CDEnum__Group__5"


    // $ANTLR start "rule__CDEnum__Group__5__Impl"
    // InternalMontiArcAndCore.g:3357:1: rule__CDEnum__Group__5__Impl : ( '}' ) ;
    public final void rule__CDEnum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3361:1: ( ( '}' ) )
            // InternalMontiArcAndCore.g:3362:1: ( '}' )
            {
            // InternalMontiArcAndCore.g:3362:1: ( '}' )
            // InternalMontiArcAndCore.g:3363:2: '}'
            {
             before(grammarAccess.getCDEnumAccess().getRightCurlyBracketKeyword_5()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getCDEnumAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__CDEnum__Group__5__Impl"


    // $ANTLR start "rule__Member__Group__0"
    // InternalMontiArcAndCore.g:3373:1: rule__Member__Group__0 : rule__Member__Group__0__Impl rule__Member__Group__1 ;
    public final void rule__Member__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3377:1: ( rule__Member__Group__0__Impl rule__Member__Group__1 )
            // InternalMontiArcAndCore.g:3378:2: rule__Member__Group__0__Impl rule__Member__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Member__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Member__Group__1();

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
    // $ANTLR end "rule__Member__Group__0"


    // $ANTLR start "rule__Member__Group__0__Impl"
    // InternalMontiArcAndCore.g:3385:1: rule__Member__Group__0__Impl : ( ( rule__Member__TypeAssignment_0 ) ) ;
    public final void rule__Member__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3389:1: ( ( ( rule__Member__TypeAssignment_0 ) ) )
            // InternalMontiArcAndCore.g:3390:1: ( ( rule__Member__TypeAssignment_0 ) )
            {
            // InternalMontiArcAndCore.g:3390:1: ( ( rule__Member__TypeAssignment_0 ) )
            // InternalMontiArcAndCore.g:3391:2: ( rule__Member__TypeAssignment_0 )
            {
             before(grammarAccess.getMemberAccess().getTypeAssignment_0()); 
            // InternalMontiArcAndCore.g:3392:2: ( rule__Member__TypeAssignment_0 )
            // InternalMontiArcAndCore.g:3392:3: rule__Member__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Member__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__Member__Group__0__Impl"


    // $ANTLR start "rule__Member__Group__1"
    // InternalMontiArcAndCore.g:3400:1: rule__Member__Group__1 : rule__Member__Group__1__Impl rule__Member__Group__2 ;
    public final void rule__Member__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3404:1: ( rule__Member__Group__1__Impl rule__Member__Group__2 )
            // InternalMontiArcAndCore.g:3405:2: rule__Member__Group__1__Impl rule__Member__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Member__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Member__Group__2();

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
    // $ANTLR end "rule__Member__Group__1"


    // $ANTLR start "rule__Member__Group__1__Impl"
    // InternalMontiArcAndCore.g:3412:1: rule__Member__Group__1__Impl : ( ( rule__Member__NameAssignment_1 ) ) ;
    public final void rule__Member__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3416:1: ( ( ( rule__Member__NameAssignment_1 ) ) )
            // InternalMontiArcAndCore.g:3417:1: ( ( rule__Member__NameAssignment_1 ) )
            {
            // InternalMontiArcAndCore.g:3417:1: ( ( rule__Member__NameAssignment_1 ) )
            // InternalMontiArcAndCore.g:3418:2: ( rule__Member__NameAssignment_1 )
            {
             before(grammarAccess.getMemberAccess().getNameAssignment_1()); 
            // InternalMontiArcAndCore.g:3419:2: ( rule__Member__NameAssignment_1 )
            // InternalMontiArcAndCore.g:3419:3: rule__Member__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Member__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Member__Group__1__Impl"


    // $ANTLR start "rule__Member__Group__2"
    // InternalMontiArcAndCore.g:3427:1: rule__Member__Group__2 : rule__Member__Group__2__Impl ;
    public final void rule__Member__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3431:1: ( rule__Member__Group__2__Impl )
            // InternalMontiArcAndCore.g:3432:2: rule__Member__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Member__Group__2__Impl();

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
    // $ANTLR end "rule__Member__Group__2"


    // $ANTLR start "rule__Member__Group__2__Impl"
    // InternalMontiArcAndCore.g:3438:1: rule__Member__Group__2__Impl : ( ';' ) ;
    public final void rule__Member__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3442:1: ( ( ';' ) )
            // InternalMontiArcAndCore.g:3443:1: ( ';' )
            {
            // InternalMontiArcAndCore.g:3443:1: ( ';' )
            // InternalMontiArcAndCore.g:3444:2: ';'
            {
             before(grammarAccess.getMemberAccess().getSemicolonKeyword_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getMemberAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__Member__Group__2__Impl"


    // $ANTLR start "rule__MACompilationUnit__Group__0"
    // InternalMontiArcAndCore.g:3454:1: rule__MACompilationUnit__Group__0 : rule__MACompilationUnit__Group__0__Impl rule__MACompilationUnit__Group__1 ;
    public final void rule__MACompilationUnit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3458:1: ( rule__MACompilationUnit__Group__0__Impl rule__MACompilationUnit__Group__1 )
            // InternalMontiArcAndCore.g:3459:2: rule__MACompilationUnit__Group__0__Impl rule__MACompilationUnit__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__MACompilationUnit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MACompilationUnit__Group__1();

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
    // $ANTLR end "rule__MACompilationUnit__Group__0"


    // $ANTLR start "rule__MACompilationUnit__Group__0__Impl"
    // InternalMontiArcAndCore.g:3466:1: rule__MACompilationUnit__Group__0__Impl : ( ( rule__MACompilationUnit__PackageAssignment_0 ) ) ;
    public final void rule__MACompilationUnit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3470:1: ( ( ( rule__MACompilationUnit__PackageAssignment_0 ) ) )
            // InternalMontiArcAndCore.g:3471:1: ( ( rule__MACompilationUnit__PackageAssignment_0 ) )
            {
            // InternalMontiArcAndCore.g:3471:1: ( ( rule__MACompilationUnit__PackageAssignment_0 ) )
            // InternalMontiArcAndCore.g:3472:2: ( rule__MACompilationUnit__PackageAssignment_0 )
            {
             before(grammarAccess.getMACompilationUnitAccess().getPackageAssignment_0()); 
            // InternalMontiArcAndCore.g:3473:2: ( rule__MACompilationUnit__PackageAssignment_0 )
            // InternalMontiArcAndCore.g:3473:3: rule__MACompilationUnit__PackageAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MACompilationUnit__PackageAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMACompilationUnitAccess().getPackageAssignment_0()); 

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
    // $ANTLR end "rule__MACompilationUnit__Group__0__Impl"


    // $ANTLR start "rule__MACompilationUnit__Group__1"
    // InternalMontiArcAndCore.g:3481:1: rule__MACompilationUnit__Group__1 : rule__MACompilationUnit__Group__1__Impl rule__MACompilationUnit__Group__2 ;
    public final void rule__MACompilationUnit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3485:1: ( rule__MACompilationUnit__Group__1__Impl rule__MACompilationUnit__Group__2 )
            // InternalMontiArcAndCore.g:3486:2: rule__MACompilationUnit__Group__1__Impl rule__MACompilationUnit__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__MACompilationUnit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MACompilationUnit__Group__2();

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
    // $ANTLR end "rule__MACompilationUnit__Group__1"


    // $ANTLR start "rule__MACompilationUnit__Group__1__Impl"
    // InternalMontiArcAndCore.g:3493:1: rule__MACompilationUnit__Group__1__Impl : ( ( rule__MACompilationUnit__ImportStatementsAssignment_1 )* ) ;
    public final void rule__MACompilationUnit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3497:1: ( ( ( rule__MACompilationUnit__ImportStatementsAssignment_1 )* ) )
            // InternalMontiArcAndCore.g:3498:1: ( ( rule__MACompilationUnit__ImportStatementsAssignment_1 )* )
            {
            // InternalMontiArcAndCore.g:3498:1: ( ( rule__MACompilationUnit__ImportStatementsAssignment_1 )* )
            // InternalMontiArcAndCore.g:3499:2: ( rule__MACompilationUnit__ImportStatementsAssignment_1 )*
            {
             before(grammarAccess.getMACompilationUnitAccess().getImportStatementsAssignment_1()); 
            // InternalMontiArcAndCore.g:3500:2: ( rule__MACompilationUnit__ImportStatementsAssignment_1 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==43) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalMontiArcAndCore.g:3500:3: rule__MACompilationUnit__ImportStatementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__MACompilationUnit__ImportStatementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getMACompilationUnitAccess().getImportStatementsAssignment_1()); 

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
    // $ANTLR end "rule__MACompilationUnit__Group__1__Impl"


    // $ANTLR start "rule__MACompilationUnit__Group__2"
    // InternalMontiArcAndCore.g:3508:1: rule__MACompilationUnit__Group__2 : rule__MACompilationUnit__Group__2__Impl ;
    public final void rule__MACompilationUnit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3512:1: ( rule__MACompilationUnit__Group__2__Impl )
            // InternalMontiArcAndCore.g:3513:2: rule__MACompilationUnit__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MACompilationUnit__Group__2__Impl();

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
    // $ANTLR end "rule__MACompilationUnit__Group__2"


    // $ANTLR start "rule__MACompilationUnit__Group__2__Impl"
    // InternalMontiArcAndCore.g:3519:1: rule__MACompilationUnit__Group__2__Impl : ( ( rule__MACompilationUnit__ComponentAssignment_2 ) ) ;
    public final void rule__MACompilationUnit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3523:1: ( ( ( rule__MACompilationUnit__ComponentAssignment_2 ) ) )
            // InternalMontiArcAndCore.g:3524:1: ( ( rule__MACompilationUnit__ComponentAssignment_2 ) )
            {
            // InternalMontiArcAndCore.g:3524:1: ( ( rule__MACompilationUnit__ComponentAssignment_2 ) )
            // InternalMontiArcAndCore.g:3525:2: ( rule__MACompilationUnit__ComponentAssignment_2 )
            {
             before(grammarAccess.getMACompilationUnitAccess().getComponentAssignment_2()); 
            // InternalMontiArcAndCore.g:3526:2: ( rule__MACompilationUnit__ComponentAssignment_2 )
            // InternalMontiArcAndCore.g:3526:3: rule__MACompilationUnit__ComponentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MACompilationUnit__ComponentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMACompilationUnitAccess().getComponentAssignment_2()); 

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
    // $ANTLR end "rule__MACompilationUnit__Group__2__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // InternalMontiArcAndCore.g:3535:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3539:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalMontiArcAndCore.g:3540:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__1();

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
    // $ANTLR end "rule__Component__Group__0"


    // $ANTLR start "rule__Component__Group__0__Impl"
    // InternalMontiArcAndCore.g:3547:1: rule__Component__Group__0__Impl : ( 'component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3551:1: ( ( 'component' ) )
            // InternalMontiArcAndCore.g:3552:1: ( 'component' )
            {
            // InternalMontiArcAndCore.g:3552:1: ( 'component' )
            // InternalMontiArcAndCore.g:3553:2: 'component'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getComponentKeyword_0()); 

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
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // InternalMontiArcAndCore.g:3562:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3566:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalMontiArcAndCore.g:3567:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__2();

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
    // $ANTLR end "rule__Component__Group__1"


    // $ANTLR start "rule__Component__Group__1__Impl"
    // InternalMontiArcAndCore.g:3574:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3578:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // InternalMontiArcAndCore.g:3579:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // InternalMontiArcAndCore.g:3579:1: ( ( rule__Component__NameAssignment_1 ) )
            // InternalMontiArcAndCore.g:3580:2: ( rule__Component__NameAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            // InternalMontiArcAndCore.g:3581:2: ( rule__Component__NameAssignment_1 )
            // InternalMontiArcAndCore.g:3581:3: rule__Component__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Component__Group__1__Impl"


    // $ANTLR start "rule__Component__Group__2"
    // InternalMontiArcAndCore.g:3589:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3593:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalMontiArcAndCore.g:3594:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__Component__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__3();

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
    // $ANTLR end "rule__Component__Group__2"


    // $ANTLR start "rule__Component__Group__2__Impl"
    // InternalMontiArcAndCore.g:3601:1: rule__Component__Group__2__Impl : ( '{' ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3605:1: ( ( '{' ) )
            // InternalMontiArcAndCore.g:3606:1: ( '{' )
            {
            // InternalMontiArcAndCore.g:3606:1: ( '{' )
            // InternalMontiArcAndCore.g:3607:2: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Component__Group__2__Impl"


    // $ANTLR start "rule__Component__Group__3"
    // InternalMontiArcAndCore.g:3616:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3620:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalMontiArcAndCore.g:3621:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__Component__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__4();

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
    // $ANTLR end "rule__Component__Group__3"


    // $ANTLR start "rule__Component__Group__3__Impl"
    // InternalMontiArcAndCore.g:3628:1: rule__Component__Group__3__Impl : ( ( rule__Component__ArcElementsAssignment_3 )* ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3632:1: ( ( ( rule__Component__ArcElementsAssignment_3 )* ) )
            // InternalMontiArcAndCore.g:3633:1: ( ( rule__Component__ArcElementsAssignment_3 )* )
            {
            // InternalMontiArcAndCore.g:3633:1: ( ( rule__Component__ArcElementsAssignment_3 )* )
            // InternalMontiArcAndCore.g:3634:2: ( rule__Component__ArcElementsAssignment_3 )*
            {
             before(grammarAccess.getComponentAccess().getArcElementsAssignment_3()); 
            // InternalMontiArcAndCore.g:3635:2: ( rule__Component__ArcElementsAssignment_3 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=RULE_MCQUALIFIEDNAME && LA37_0<=RULE_ID)||LA37_0==RULE_SYNC||LA37_0==58||LA37_0==61||LA37_0==65) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalMontiArcAndCore.g:3635:3: rule__Component__ArcElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Component__ArcElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getArcElementsAssignment_3()); 

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
    // $ANTLR end "rule__Component__Group__3__Impl"


    // $ANTLR start "rule__Component__Group__4"
    // InternalMontiArcAndCore.g:3643:1: rule__Component__Group__4 : rule__Component__Group__4__Impl ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3647:1: ( rule__Component__Group__4__Impl )
            // InternalMontiArcAndCore.g:3648:2: rule__Component__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__4__Impl();

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
    // $ANTLR end "rule__Component__Group__4"


    // $ANTLR start "rule__Component__Group__4__Impl"
    // InternalMontiArcAndCore.g:3654:1: rule__Component__Group__4__Impl : ( '}' ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3658:1: ( ( '}' ) )
            // InternalMontiArcAndCore.g:3659:1: ( '}' )
            {
            // InternalMontiArcAndCore.g:3659:1: ( '}' )
            // InternalMontiArcAndCore.g:3660:2: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_4()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Component__Group__4__Impl"


    // $ANTLR start "rule__Parameters__Group__0"
    // InternalMontiArcAndCore.g:3670:1: rule__Parameters__Group__0 : rule__Parameters__Group__0__Impl rule__Parameters__Group__1 ;
    public final void rule__Parameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3674:1: ( rule__Parameters__Group__0__Impl rule__Parameters__Group__1 )
            // InternalMontiArcAndCore.g:3675:2: rule__Parameters__Group__0__Impl rule__Parameters__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Parameters__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameters__Group__1();

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
    // $ANTLR end "rule__Parameters__Group__0"


    // $ANTLR start "rule__Parameters__Group__0__Impl"
    // InternalMontiArcAndCore.g:3682:1: rule__Parameters__Group__0__Impl : ( ( rule__Parameters__ParametersAssignment_0 ) ) ;
    public final void rule__Parameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3686:1: ( ( ( rule__Parameters__ParametersAssignment_0 ) ) )
            // InternalMontiArcAndCore.g:3687:1: ( ( rule__Parameters__ParametersAssignment_0 ) )
            {
            // InternalMontiArcAndCore.g:3687:1: ( ( rule__Parameters__ParametersAssignment_0 ) )
            // InternalMontiArcAndCore.g:3688:2: ( rule__Parameters__ParametersAssignment_0 )
            {
             before(grammarAccess.getParametersAccess().getParametersAssignment_0()); 
            // InternalMontiArcAndCore.g:3689:2: ( rule__Parameters__ParametersAssignment_0 )
            // InternalMontiArcAndCore.g:3689:3: rule__Parameters__ParametersAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameters__ParametersAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParametersAccess().getParametersAssignment_0()); 

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
    // $ANTLR end "rule__Parameters__Group__0__Impl"


    // $ANTLR start "rule__Parameters__Group__1"
    // InternalMontiArcAndCore.g:3697:1: rule__Parameters__Group__1 : rule__Parameters__Group__1__Impl ;
    public final void rule__Parameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3701:1: ( rule__Parameters__Group__1__Impl )
            // InternalMontiArcAndCore.g:3702:2: rule__Parameters__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameters__Group__1__Impl();

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
    // $ANTLR end "rule__Parameters__Group__1"


    // $ANTLR start "rule__Parameters__Group__1__Impl"
    // InternalMontiArcAndCore.g:3708:1: rule__Parameters__Group__1__Impl : ( ( rule__Parameters__Group_1__0 )* ) ;
    public final void rule__Parameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3712:1: ( ( ( rule__Parameters__Group_1__0 )* ) )
            // InternalMontiArcAndCore.g:3713:1: ( ( rule__Parameters__Group_1__0 )* )
            {
            // InternalMontiArcAndCore.g:3713:1: ( ( rule__Parameters__Group_1__0 )* )
            // InternalMontiArcAndCore.g:3714:2: ( rule__Parameters__Group_1__0 )*
            {
             before(grammarAccess.getParametersAccess().getGroup_1()); 
            // InternalMontiArcAndCore.g:3715:2: ( rule__Parameters__Group_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==50) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalMontiArcAndCore.g:3715:3: rule__Parameters__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Parameters__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getParametersAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Parameters__Group__1__Impl"


    // $ANTLR start "rule__Parameters__Group_1__0"
    // InternalMontiArcAndCore.g:3724:1: rule__Parameters__Group_1__0 : rule__Parameters__Group_1__0__Impl rule__Parameters__Group_1__1 ;
    public final void rule__Parameters__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3728:1: ( rule__Parameters__Group_1__0__Impl rule__Parameters__Group_1__1 )
            // InternalMontiArcAndCore.g:3729:2: rule__Parameters__Group_1__0__Impl rule__Parameters__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Parameters__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameters__Group_1__1();

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
    // $ANTLR end "rule__Parameters__Group_1__0"


    // $ANTLR start "rule__Parameters__Group_1__0__Impl"
    // InternalMontiArcAndCore.g:3736:1: rule__Parameters__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Parameters__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3740:1: ( ( ',' ) )
            // InternalMontiArcAndCore.g:3741:1: ( ',' )
            {
            // InternalMontiArcAndCore.g:3741:1: ( ',' )
            // InternalMontiArcAndCore.g:3742:2: ','
            {
             before(grammarAccess.getParametersAccess().getCommaKeyword_1_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getParametersAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__Parameters__Group_1__0__Impl"


    // $ANTLR start "rule__Parameters__Group_1__1"
    // InternalMontiArcAndCore.g:3751:1: rule__Parameters__Group_1__1 : rule__Parameters__Group_1__1__Impl ;
    public final void rule__Parameters__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3755:1: ( rule__Parameters__Group_1__1__Impl )
            // InternalMontiArcAndCore.g:3756:2: rule__Parameters__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameters__Group_1__1__Impl();

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
    // $ANTLR end "rule__Parameters__Group_1__1"


    // $ANTLR start "rule__Parameters__Group_1__1__Impl"
    // InternalMontiArcAndCore.g:3762:1: rule__Parameters__Group_1__1__Impl : ( ( rule__Parameters__ParametersAssignment_1_1 ) ) ;
    public final void rule__Parameters__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3766:1: ( ( ( rule__Parameters__ParametersAssignment_1_1 ) ) )
            // InternalMontiArcAndCore.g:3767:1: ( ( rule__Parameters__ParametersAssignment_1_1 ) )
            {
            // InternalMontiArcAndCore.g:3767:1: ( ( rule__Parameters__ParametersAssignment_1_1 ) )
            // InternalMontiArcAndCore.g:3768:2: ( rule__Parameters__ParametersAssignment_1_1 )
            {
             before(grammarAccess.getParametersAccess().getParametersAssignment_1_1()); 
            // InternalMontiArcAndCore.g:3769:2: ( rule__Parameters__ParametersAssignment_1_1 )
            // InternalMontiArcAndCore.g:3769:3: rule__Parameters__ParametersAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameters__ParametersAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getParametersAccess().getParametersAssignment_1_1()); 

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
    // $ANTLR end "rule__Parameters__Group_1__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalMontiArcAndCore.g:3778:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3782:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalMontiArcAndCore.g:3783:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

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
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalMontiArcAndCore.g:3790:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__TypeAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3794:1: ( ( ( rule__Parameter__TypeAssignment_0 ) ) )
            // InternalMontiArcAndCore.g:3795:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            {
            // InternalMontiArcAndCore.g:3795:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            // InternalMontiArcAndCore.g:3796:2: ( rule__Parameter__TypeAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_0()); 
            // InternalMontiArcAndCore.g:3797:2: ( rule__Parameter__TypeAssignment_0 )
            // InternalMontiArcAndCore.g:3797:3: rule__Parameter__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalMontiArcAndCore.g:3805:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3809:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalMontiArcAndCore.g:3810:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

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
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalMontiArcAndCore.g:3817:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3821:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalMontiArcAndCore.g:3822:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalMontiArcAndCore.g:3822:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalMontiArcAndCore.g:3823:2: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // InternalMontiArcAndCore.g:3824:2: ( rule__Parameter__NameAssignment_1 )
            // InternalMontiArcAndCore.g:3824:3: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalMontiArcAndCore.g:3832:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3836:1: ( rule__Parameter__Group__2__Impl )
            // InternalMontiArcAndCore.g:3837:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2__Impl();

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
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalMontiArcAndCore.g:3843:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__Group_2__0 )? ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3847:1: ( ( ( rule__Parameter__Group_2__0 )? ) )
            // InternalMontiArcAndCore.g:3848:1: ( ( rule__Parameter__Group_2__0 )? )
            {
            // InternalMontiArcAndCore.g:3848:1: ( ( rule__Parameter__Group_2__0 )? )
            // InternalMontiArcAndCore.g:3849:2: ( rule__Parameter__Group_2__0 )?
            {
             before(grammarAccess.getParameterAccess().getGroup_2()); 
            // InternalMontiArcAndCore.g:3850:2: ( rule__Parameter__Group_2__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==59) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMontiArcAndCore.g:3850:3: rule__Parameter__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group_2__0"
    // InternalMontiArcAndCore.g:3859:1: rule__Parameter__Group_2__0 : rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1 ;
    public final void rule__Parameter__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3863:1: ( rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1 )
            // InternalMontiArcAndCore.g:3864:2: rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__Parameter__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group_2__1();

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
    // $ANTLR end "rule__Parameter__Group_2__0"


    // $ANTLR start "rule__Parameter__Group_2__0__Impl"
    // InternalMontiArcAndCore.g:3871:1: rule__Parameter__Group_2__0__Impl : ( '=' ) ;
    public final void rule__Parameter__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3875:1: ( ( '=' ) )
            // InternalMontiArcAndCore.g:3876:1: ( '=' )
            {
            // InternalMontiArcAndCore.g:3876:1: ( '=' )
            // InternalMontiArcAndCore.g:3877:2: '='
            {
             before(grammarAccess.getParameterAccess().getEqualsSignKeyword_2_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getEqualsSignKeyword_2_0()); 

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
    // $ANTLR end "rule__Parameter__Group_2__0__Impl"


    // $ANTLR start "rule__Parameter__Group_2__1"
    // InternalMontiArcAndCore.g:3886:1: rule__Parameter__Group_2__1 : rule__Parameter__Group_2__1__Impl ;
    public final void rule__Parameter__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3890:1: ( rule__Parameter__Group_2__1__Impl )
            // InternalMontiArcAndCore.g:3891:2: rule__Parameter__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group_2__1__Impl();

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
    // $ANTLR end "rule__Parameter__Group_2__1"


    // $ANTLR start "rule__Parameter__Group_2__1__Impl"
    // InternalMontiArcAndCore.g:3897:1: rule__Parameter__Group_2__1__Impl : ( ( rule__Parameter__ExpressionAssignment_2_1 ) ) ;
    public final void rule__Parameter__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3901:1: ( ( ( rule__Parameter__ExpressionAssignment_2_1 ) ) )
            // InternalMontiArcAndCore.g:3902:1: ( ( rule__Parameter__ExpressionAssignment_2_1 ) )
            {
            // InternalMontiArcAndCore.g:3902:1: ( ( rule__Parameter__ExpressionAssignment_2_1 ) )
            // InternalMontiArcAndCore.g:3903:2: ( rule__Parameter__ExpressionAssignment_2_1 )
            {
             before(grammarAccess.getParameterAccess().getExpressionAssignment_2_1()); 
            // InternalMontiArcAndCore.g:3904:2: ( rule__Parameter__ExpressionAssignment_2_1 )
            // InternalMontiArcAndCore.g:3904:3: rule__Parameter__ExpressionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__ExpressionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getExpressionAssignment_2_1()); 

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
    // $ANTLR end "rule__Parameter__Group_2__1__Impl"


    // $ANTLR start "rule__SubComponent__Group__0"
    // InternalMontiArcAndCore.g:3913:1: rule__SubComponent__Group__0 : rule__SubComponent__Group__0__Impl rule__SubComponent__Group__1 ;
    public final void rule__SubComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3917:1: ( rule__SubComponent__Group__0__Impl rule__SubComponent__Group__1 )
            // InternalMontiArcAndCore.g:3918:2: rule__SubComponent__Group__0__Impl rule__SubComponent__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__SubComponent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubComponent__Group__1();

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
    // $ANTLR end "rule__SubComponent__Group__0"


    // $ANTLR start "rule__SubComponent__Group__0__Impl"
    // InternalMontiArcAndCore.g:3925:1: rule__SubComponent__Group__0__Impl : ( 'component' ) ;
    public final void rule__SubComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3929:1: ( ( 'component' ) )
            // InternalMontiArcAndCore.g:3930:1: ( 'component' )
            {
            // InternalMontiArcAndCore.g:3930:1: ( 'component' )
            // InternalMontiArcAndCore.g:3931:2: 'component'
            {
             before(grammarAccess.getSubComponentAccess().getComponentKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getSubComponentAccess().getComponentKeyword_0()); 

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
    // $ANTLR end "rule__SubComponent__Group__0__Impl"


    // $ANTLR start "rule__SubComponent__Group__1"
    // InternalMontiArcAndCore.g:3940:1: rule__SubComponent__Group__1 : rule__SubComponent__Group__1__Impl rule__SubComponent__Group__2 ;
    public final void rule__SubComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3944:1: ( rule__SubComponent__Group__1__Impl rule__SubComponent__Group__2 )
            // InternalMontiArcAndCore.g:3945:2: rule__SubComponent__Group__1__Impl rule__SubComponent__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__SubComponent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubComponent__Group__2();

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
    // $ANTLR end "rule__SubComponent__Group__1"


    // $ANTLR start "rule__SubComponent__Group__1__Impl"
    // InternalMontiArcAndCore.g:3952:1: rule__SubComponent__Group__1__Impl : ( ( rule__SubComponent__TypeAssignment_1 ) ) ;
    public final void rule__SubComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3956:1: ( ( ( rule__SubComponent__TypeAssignment_1 ) ) )
            // InternalMontiArcAndCore.g:3957:1: ( ( rule__SubComponent__TypeAssignment_1 ) )
            {
            // InternalMontiArcAndCore.g:3957:1: ( ( rule__SubComponent__TypeAssignment_1 ) )
            // InternalMontiArcAndCore.g:3958:2: ( rule__SubComponent__TypeAssignment_1 )
            {
             before(grammarAccess.getSubComponentAccess().getTypeAssignment_1()); 
            // InternalMontiArcAndCore.g:3959:2: ( rule__SubComponent__TypeAssignment_1 )
            // InternalMontiArcAndCore.g:3959:3: rule__SubComponent__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SubComponent__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubComponentAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__SubComponent__Group__1__Impl"


    // $ANTLR start "rule__SubComponent__Group__2"
    // InternalMontiArcAndCore.g:3967:1: rule__SubComponent__Group__2 : rule__SubComponent__Group__2__Impl rule__SubComponent__Group__3 ;
    public final void rule__SubComponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3971:1: ( rule__SubComponent__Group__2__Impl rule__SubComponent__Group__3 )
            // InternalMontiArcAndCore.g:3972:2: rule__SubComponent__Group__2__Impl rule__SubComponent__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__SubComponent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubComponent__Group__3();

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
    // $ANTLR end "rule__SubComponent__Group__2"


    // $ANTLR start "rule__SubComponent__Group__2__Impl"
    // InternalMontiArcAndCore.g:3979:1: rule__SubComponent__Group__2__Impl : ( ( rule__SubComponent__ArgumentsAssignment_2 )? ) ;
    public final void rule__SubComponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3983:1: ( ( ( rule__SubComponent__ArgumentsAssignment_2 )? ) )
            // InternalMontiArcAndCore.g:3984:1: ( ( rule__SubComponent__ArgumentsAssignment_2 )? )
            {
            // InternalMontiArcAndCore.g:3984:1: ( ( rule__SubComponent__ArgumentsAssignment_2 )? )
            // InternalMontiArcAndCore.g:3985:2: ( rule__SubComponent__ArgumentsAssignment_2 )?
            {
             before(grammarAccess.getSubComponentAccess().getArgumentsAssignment_2()); 
            // InternalMontiArcAndCore.g:3986:2: ( rule__SubComponent__ArgumentsAssignment_2 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==48) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMontiArcAndCore.g:3986:3: rule__SubComponent__ArgumentsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubComponent__ArgumentsAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubComponentAccess().getArgumentsAssignment_2()); 

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
    // $ANTLR end "rule__SubComponent__Group__2__Impl"


    // $ANTLR start "rule__SubComponent__Group__3"
    // InternalMontiArcAndCore.g:3994:1: rule__SubComponent__Group__3 : rule__SubComponent__Group__3__Impl rule__SubComponent__Group__4 ;
    public final void rule__SubComponent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:3998:1: ( rule__SubComponent__Group__3__Impl rule__SubComponent__Group__4 )
            // InternalMontiArcAndCore.g:3999:2: rule__SubComponent__Group__3__Impl rule__SubComponent__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__SubComponent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubComponent__Group__4();

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
    // $ANTLR end "rule__SubComponent__Group__3"


    // $ANTLR start "rule__SubComponent__Group__3__Impl"
    // InternalMontiArcAndCore.g:4006:1: rule__SubComponent__Group__3__Impl : ( ( rule__SubComponent__InstancesAssignment_3 ) ) ;
    public final void rule__SubComponent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4010:1: ( ( ( rule__SubComponent__InstancesAssignment_3 ) ) )
            // InternalMontiArcAndCore.g:4011:1: ( ( rule__SubComponent__InstancesAssignment_3 ) )
            {
            // InternalMontiArcAndCore.g:4011:1: ( ( rule__SubComponent__InstancesAssignment_3 ) )
            // InternalMontiArcAndCore.g:4012:2: ( rule__SubComponent__InstancesAssignment_3 )
            {
             before(grammarAccess.getSubComponentAccess().getInstancesAssignment_3()); 
            // InternalMontiArcAndCore.g:4013:2: ( rule__SubComponent__InstancesAssignment_3 )
            // InternalMontiArcAndCore.g:4013:3: rule__SubComponent__InstancesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SubComponent__InstancesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSubComponentAccess().getInstancesAssignment_3()); 

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
    // $ANTLR end "rule__SubComponent__Group__3__Impl"


    // $ANTLR start "rule__SubComponent__Group__4"
    // InternalMontiArcAndCore.g:4021:1: rule__SubComponent__Group__4 : rule__SubComponent__Group__4__Impl ;
    public final void rule__SubComponent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4025:1: ( rule__SubComponent__Group__4__Impl )
            // InternalMontiArcAndCore.g:4026:2: rule__SubComponent__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubComponent__Group__4__Impl();

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
    // $ANTLR end "rule__SubComponent__Group__4"


    // $ANTLR start "rule__SubComponent__Group__4__Impl"
    // InternalMontiArcAndCore.g:4032:1: rule__SubComponent__Group__4__Impl : ( ';' ) ;
    public final void rule__SubComponent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4036:1: ( ( ';' ) )
            // InternalMontiArcAndCore.g:4037:1: ( ';' )
            {
            // InternalMontiArcAndCore.g:4037:1: ( ';' )
            // InternalMontiArcAndCore.g:4038:2: ';'
            {
             before(grammarAccess.getSubComponentAccess().getSemicolonKeyword_4()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSubComponentAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__SubComponent__Group__4__Impl"


    // $ANTLR start "rule__Connector__Group__0"
    // InternalMontiArcAndCore.g:4048:1: rule__Connector__Group__0 : rule__Connector__Group__0__Impl rule__Connector__Group__1 ;
    public final void rule__Connector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4052:1: ( rule__Connector__Group__0__Impl rule__Connector__Group__1 )
            // InternalMontiArcAndCore.g:4053:2: rule__Connector__Group__0__Impl rule__Connector__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__Connector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connector__Group__1();

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
    // $ANTLR end "rule__Connector__Group__0"


    // $ANTLR start "rule__Connector__Group__0__Impl"
    // InternalMontiArcAndCore.g:4060:1: rule__Connector__Group__0__Impl : ( ( rule__Connector__SourceAssignment_0 ) ) ;
    public final void rule__Connector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4064:1: ( ( ( rule__Connector__SourceAssignment_0 ) ) )
            // InternalMontiArcAndCore.g:4065:1: ( ( rule__Connector__SourceAssignment_0 ) )
            {
            // InternalMontiArcAndCore.g:4065:1: ( ( rule__Connector__SourceAssignment_0 ) )
            // InternalMontiArcAndCore.g:4066:2: ( rule__Connector__SourceAssignment_0 )
            {
             before(grammarAccess.getConnectorAccess().getSourceAssignment_0()); 
            // InternalMontiArcAndCore.g:4067:2: ( rule__Connector__SourceAssignment_0 )
            // InternalMontiArcAndCore.g:4067:3: rule__Connector__SourceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Connector__SourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getSourceAssignment_0()); 

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
    // $ANTLR end "rule__Connector__Group__0__Impl"


    // $ANTLR start "rule__Connector__Group__1"
    // InternalMontiArcAndCore.g:4075:1: rule__Connector__Group__1 : rule__Connector__Group__1__Impl rule__Connector__Group__2 ;
    public final void rule__Connector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4079:1: ( rule__Connector__Group__1__Impl rule__Connector__Group__2 )
            // InternalMontiArcAndCore.g:4080:2: rule__Connector__Group__1__Impl rule__Connector__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Connector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connector__Group__2();

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
    // $ANTLR end "rule__Connector__Group__1"


    // $ANTLR start "rule__Connector__Group__1__Impl"
    // InternalMontiArcAndCore.g:4087:1: rule__Connector__Group__1__Impl : ( '->' ) ;
    public final void rule__Connector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4091:1: ( ( '->' ) )
            // InternalMontiArcAndCore.g:4092:1: ( '->' )
            {
            // InternalMontiArcAndCore.g:4092:1: ( '->' )
            // InternalMontiArcAndCore.g:4093:2: '->'
            {
             before(grammarAccess.getConnectorAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

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
    // $ANTLR end "rule__Connector__Group__1__Impl"


    // $ANTLR start "rule__Connector__Group__2"
    // InternalMontiArcAndCore.g:4102:1: rule__Connector__Group__2 : rule__Connector__Group__2__Impl rule__Connector__Group__3 ;
    public final void rule__Connector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4106:1: ( rule__Connector__Group__2__Impl rule__Connector__Group__3 )
            // InternalMontiArcAndCore.g:4107:2: rule__Connector__Group__2__Impl rule__Connector__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Connector__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connector__Group__3();

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
    // $ANTLR end "rule__Connector__Group__2"


    // $ANTLR start "rule__Connector__Group__2__Impl"
    // InternalMontiArcAndCore.g:4114:1: rule__Connector__Group__2__Impl : ( ( rule__Connector__TargetAssignment_2 ) ) ;
    public final void rule__Connector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4118:1: ( ( ( rule__Connector__TargetAssignment_2 ) ) )
            // InternalMontiArcAndCore.g:4119:1: ( ( rule__Connector__TargetAssignment_2 ) )
            {
            // InternalMontiArcAndCore.g:4119:1: ( ( rule__Connector__TargetAssignment_2 ) )
            // InternalMontiArcAndCore.g:4120:2: ( rule__Connector__TargetAssignment_2 )
            {
             before(grammarAccess.getConnectorAccess().getTargetAssignment_2()); 
            // InternalMontiArcAndCore.g:4121:2: ( rule__Connector__TargetAssignment_2 )
            // InternalMontiArcAndCore.g:4121:3: rule__Connector__TargetAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Connector__TargetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getTargetAssignment_2()); 

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
    // $ANTLR end "rule__Connector__Group__2__Impl"


    // $ANTLR start "rule__Connector__Group__3"
    // InternalMontiArcAndCore.g:4129:1: rule__Connector__Group__3 : rule__Connector__Group__3__Impl ;
    public final void rule__Connector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4133:1: ( rule__Connector__Group__3__Impl )
            // InternalMontiArcAndCore.g:4134:2: rule__Connector__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connector__Group__3__Impl();

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
    // $ANTLR end "rule__Connector__Group__3"


    // $ANTLR start "rule__Connector__Group__3__Impl"
    // InternalMontiArcAndCore.g:4140:1: rule__Connector__Group__3__Impl : ( ';' ) ;
    public final void rule__Connector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4144:1: ( ( ';' ) )
            // InternalMontiArcAndCore.g:4145:1: ( ';' )
            {
            // InternalMontiArcAndCore.g:4145:1: ( ';' )
            // InternalMontiArcAndCore.g:4146:2: ';'
            {
             before(grammarAccess.getConnectorAccess().getSemicolonKeyword_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__Connector__Group__3__Impl"


    // $ANTLR start "rule__Port__Group__0"
    // InternalMontiArcAndCore.g:4156:1: rule__Port__Group__0 : rule__Port__Group__0__Impl rule__Port__Group__1 ;
    public final void rule__Port__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4160:1: ( rule__Port__Group__0__Impl rule__Port__Group__1 )
            // InternalMontiArcAndCore.g:4161:2: rule__Port__Group__0__Impl rule__Port__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__Port__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Port__Group__1();

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
    // $ANTLR end "rule__Port__Group__0"


    // $ANTLR start "rule__Port__Group__0__Impl"
    // InternalMontiArcAndCore.g:4168:1: rule__Port__Group__0__Impl : ( 'port' ) ;
    public final void rule__Port__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4172:1: ( ( 'port' ) )
            // InternalMontiArcAndCore.g:4173:1: ( 'port' )
            {
            // InternalMontiArcAndCore.g:4173:1: ( 'port' )
            // InternalMontiArcAndCore.g:4174:2: 'port'
            {
             before(grammarAccess.getPortAccess().getPortKeyword_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getPortAccess().getPortKeyword_0()); 

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
    // $ANTLR end "rule__Port__Group__0__Impl"


    // $ANTLR start "rule__Port__Group__1"
    // InternalMontiArcAndCore.g:4183:1: rule__Port__Group__1 : rule__Port__Group__1__Impl rule__Port__Group__2 ;
    public final void rule__Port__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4187:1: ( rule__Port__Group__1__Impl rule__Port__Group__2 )
            // InternalMontiArcAndCore.g:4188:2: rule__Port__Group__1__Impl rule__Port__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__Port__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Port__Group__2();

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
    // $ANTLR end "rule__Port__Group__1"


    // $ANTLR start "rule__Port__Group__1__Impl"
    // InternalMontiArcAndCore.g:4195:1: rule__Port__Group__1__Impl : ( ( rule__Port__ConditionAssignment_1 )? ) ;
    public final void rule__Port__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4199:1: ( ( ( rule__Port__ConditionAssignment_1 )? ) )
            // InternalMontiArcAndCore.g:4200:1: ( ( rule__Port__ConditionAssignment_1 )? )
            {
            // InternalMontiArcAndCore.g:4200:1: ( ( rule__Port__ConditionAssignment_1 )? )
            // InternalMontiArcAndCore.g:4201:2: ( rule__Port__ConditionAssignment_1 )?
            {
             before(grammarAccess.getPortAccess().getConditionAssignment_1()); 
            // InternalMontiArcAndCore.g:4202:2: ( rule__Port__ConditionAssignment_1 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==62) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMontiArcAndCore.g:4202:3: rule__Port__ConditionAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Port__ConditionAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPortAccess().getConditionAssignment_1()); 

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
    // $ANTLR end "rule__Port__Group__1__Impl"


    // $ANTLR start "rule__Port__Group__2"
    // InternalMontiArcAndCore.g:4210:1: rule__Port__Group__2 : rule__Port__Group__2__Impl rule__Port__Group__3 ;
    public final void rule__Port__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4214:1: ( rule__Port__Group__2__Impl rule__Port__Group__3 )
            // InternalMontiArcAndCore.g:4215:2: rule__Port__Group__2__Impl rule__Port__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__Port__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Port__Group__3();

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
    // $ANTLR end "rule__Port__Group__2"


    // $ANTLR start "rule__Port__Group__2__Impl"
    // InternalMontiArcAndCore.g:4222:1: rule__Port__Group__2__Impl : ( ( rule__Port__Alternatives_2 ) ) ;
    public final void rule__Port__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4226:1: ( ( ( rule__Port__Alternatives_2 ) ) )
            // InternalMontiArcAndCore.g:4227:1: ( ( rule__Port__Alternatives_2 ) )
            {
            // InternalMontiArcAndCore.g:4227:1: ( ( rule__Port__Alternatives_2 ) )
            // InternalMontiArcAndCore.g:4228:2: ( rule__Port__Alternatives_2 )
            {
             before(grammarAccess.getPortAccess().getAlternatives_2()); 
            // InternalMontiArcAndCore.g:4229:2: ( rule__Port__Alternatives_2 )
            // InternalMontiArcAndCore.g:4229:3: rule__Port__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Port__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__Port__Group__2__Impl"


    // $ANTLR start "rule__Port__Group__3"
    // InternalMontiArcAndCore.g:4237:1: rule__Port__Group__3 : rule__Port__Group__3__Impl rule__Port__Group__4 ;
    public final void rule__Port__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4241:1: ( rule__Port__Group__3__Impl rule__Port__Group__4 )
            // InternalMontiArcAndCore.g:4242:2: rule__Port__Group__3__Impl rule__Port__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Port__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Port__Group__4();

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
    // $ANTLR end "rule__Port__Group__3"


    // $ANTLR start "rule__Port__Group__3__Impl"
    // InternalMontiArcAndCore.g:4249:1: rule__Port__Group__3__Impl : ( ( rule__Port__Alternatives_3 ) ) ;
    public final void rule__Port__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4253:1: ( ( ( rule__Port__Alternatives_3 ) ) )
            // InternalMontiArcAndCore.g:4254:1: ( ( rule__Port__Alternatives_3 ) )
            {
            // InternalMontiArcAndCore.g:4254:1: ( ( rule__Port__Alternatives_3 ) )
            // InternalMontiArcAndCore.g:4255:2: ( rule__Port__Alternatives_3 )
            {
             before(grammarAccess.getPortAccess().getAlternatives_3()); 
            // InternalMontiArcAndCore.g:4256:2: ( rule__Port__Alternatives_3 )
            // InternalMontiArcAndCore.g:4256:3: rule__Port__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__Port__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__Port__Group__3__Impl"


    // $ANTLR start "rule__Port__Group__4"
    // InternalMontiArcAndCore.g:4264:1: rule__Port__Group__4 : rule__Port__Group__4__Impl rule__Port__Group__5 ;
    public final void rule__Port__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4268:1: ( rule__Port__Group__4__Impl rule__Port__Group__5 )
            // InternalMontiArcAndCore.g:4269:2: rule__Port__Group__4__Impl rule__Port__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Port__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Port__Group__5();

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
    // $ANTLR end "rule__Port__Group__4"


    // $ANTLR start "rule__Port__Group__4__Impl"
    // InternalMontiArcAndCore.g:4276:1: rule__Port__Group__4__Impl : ( ( rule__Port__NameAssignment_4 ) ) ;
    public final void rule__Port__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4280:1: ( ( ( rule__Port__NameAssignment_4 ) ) )
            // InternalMontiArcAndCore.g:4281:1: ( ( rule__Port__NameAssignment_4 ) )
            {
            // InternalMontiArcAndCore.g:4281:1: ( ( rule__Port__NameAssignment_4 ) )
            // InternalMontiArcAndCore.g:4282:2: ( rule__Port__NameAssignment_4 )
            {
             before(grammarAccess.getPortAccess().getNameAssignment_4()); 
            // InternalMontiArcAndCore.g:4283:2: ( rule__Port__NameAssignment_4 )
            // InternalMontiArcAndCore.g:4283:3: rule__Port__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Port__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getNameAssignment_4()); 

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
    // $ANTLR end "rule__Port__Group__4__Impl"


    // $ANTLR start "rule__Port__Group__5"
    // InternalMontiArcAndCore.g:4291:1: rule__Port__Group__5 : rule__Port__Group__5__Impl ;
    public final void rule__Port__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4295:1: ( rule__Port__Group__5__Impl )
            // InternalMontiArcAndCore.g:4296:2: rule__Port__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Port__Group__5__Impl();

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
    // $ANTLR end "rule__Port__Group__5"


    // $ANTLR start "rule__Port__Group__5__Impl"
    // InternalMontiArcAndCore.g:4302:1: rule__Port__Group__5__Impl : ( ';' ) ;
    public final void rule__Port__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4306:1: ( ( ';' ) )
            // InternalMontiArcAndCore.g:4307:1: ( ';' )
            {
            // InternalMontiArcAndCore.g:4307:1: ( ';' )
            // InternalMontiArcAndCore.g:4308:2: ';'
            {
             before(grammarAccess.getPortAccess().getSemicolonKeyword_5()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getPortAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end "rule__Port__Group__5__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalMontiArcAndCore.g:4318:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4322:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalMontiArcAndCore.g:4323:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

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
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalMontiArcAndCore.g:4330:1: rule__Condition__Group__0__Impl : ( '<<' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4334:1: ( ( '<<' ) )
            // InternalMontiArcAndCore.g:4335:1: ( '<<' )
            {
            // InternalMontiArcAndCore.g:4335:1: ( '<<' )
            // InternalMontiArcAndCore.g:4336:2: '<<'
            {
             before(grammarAccess.getConditionAccess().getLessThanSignLessThanSignKeyword_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getLessThanSignLessThanSignKeyword_0()); 

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
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalMontiArcAndCore.g:4345:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4349:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalMontiArcAndCore.g:4350:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__Condition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__2();

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
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalMontiArcAndCore.g:4357:1: rule__Condition__Group__1__Impl : ( 'condition' ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4361:1: ( ( 'condition' ) )
            // InternalMontiArcAndCore.g:4362:1: ( 'condition' )
            {
            // InternalMontiArcAndCore.g:4362:1: ( 'condition' )
            // InternalMontiArcAndCore.g:4363:2: 'condition'
            {
             before(grammarAccess.getConditionAccess().getConditionKeyword_1()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getConditionKeyword_1()); 

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
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__2"
    // InternalMontiArcAndCore.g:4372:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl rule__Condition__Group__3 ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4376:1: ( rule__Condition__Group__2__Impl rule__Condition__Group__3 )
            // InternalMontiArcAndCore.g:4377:2: rule__Condition__Group__2__Impl rule__Condition__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__Condition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__3();

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
    // $ANTLR end "rule__Condition__Group__2"


    // $ANTLR start "rule__Condition__Group__2__Impl"
    // InternalMontiArcAndCore.g:4384:1: rule__Condition__Group__2__Impl : ( '=' ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4388:1: ( ( '=' ) )
            // InternalMontiArcAndCore.g:4389:1: ( '=' )
            {
            // InternalMontiArcAndCore.g:4389:1: ( '=' )
            // InternalMontiArcAndCore.g:4390:2: '='
            {
             before(grammarAccess.getConditionAccess().getEqualsSignKeyword_2()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__Condition__Group__2__Impl"


    // $ANTLR start "rule__Condition__Group__3"
    // InternalMontiArcAndCore.g:4399:1: rule__Condition__Group__3 : rule__Condition__Group__3__Impl rule__Condition__Group__4 ;
    public final void rule__Condition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4403:1: ( rule__Condition__Group__3__Impl rule__Condition__Group__4 )
            // InternalMontiArcAndCore.g:4404:2: rule__Condition__Group__3__Impl rule__Condition__Group__4
            {
            pushFollow(FOLLOW_39);
            rule__Condition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__4();

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
    // $ANTLR end "rule__Condition__Group__3"


    // $ANTLR start "rule__Condition__Group__3__Impl"
    // InternalMontiArcAndCore.g:4411:1: rule__Condition__Group__3__Impl : ( ( rule__Condition__ConditionAssignment_3 ) ) ;
    public final void rule__Condition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4415:1: ( ( ( rule__Condition__ConditionAssignment_3 ) ) )
            // InternalMontiArcAndCore.g:4416:1: ( ( rule__Condition__ConditionAssignment_3 ) )
            {
            // InternalMontiArcAndCore.g:4416:1: ( ( rule__Condition__ConditionAssignment_3 ) )
            // InternalMontiArcAndCore.g:4417:2: ( rule__Condition__ConditionAssignment_3 )
            {
             before(grammarAccess.getConditionAccess().getConditionAssignment_3()); 
            // InternalMontiArcAndCore.g:4418:2: ( rule__Condition__ConditionAssignment_3 )
            // InternalMontiArcAndCore.g:4418:3: rule__Condition__ConditionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ConditionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getConditionAssignment_3()); 

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
    // $ANTLR end "rule__Condition__Group__3__Impl"


    // $ANTLR start "rule__Condition__Group__4"
    // InternalMontiArcAndCore.g:4426:1: rule__Condition__Group__4 : rule__Condition__Group__4__Impl ;
    public final void rule__Condition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4430:1: ( rule__Condition__Group__4__Impl )
            // InternalMontiArcAndCore.g:4431:2: rule__Condition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__4__Impl();

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
    // $ANTLR end "rule__Condition__Group__4"


    // $ANTLR start "rule__Condition__Group__4__Impl"
    // InternalMontiArcAndCore.g:4437:1: rule__Condition__Group__4__Impl : ( '>>' ) ;
    public final void rule__Condition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4441:1: ( ( '>>' ) )
            // InternalMontiArcAndCore.g:4442:1: ( '>>' )
            {
            // InternalMontiArcAndCore.g:4442:1: ( '>>' )
            // InternalMontiArcAndCore.g:4443:2: '>>'
            {
             before(grammarAccess.getConditionAccess().getGreaterThanSignGreaterThanSignKeyword_4()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getGreaterThanSignGreaterThanSignKeyword_4()); 

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
    // $ANTLR end "rule__Condition__Group__4__Impl"


    // $ANTLR start "rule__Names__Group__0"
    // InternalMontiArcAndCore.g:4453:1: rule__Names__Group__0 : rule__Names__Group__0__Impl rule__Names__Group__1 ;
    public final void rule__Names__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4457:1: ( rule__Names__Group__0__Impl rule__Names__Group__1 )
            // InternalMontiArcAndCore.g:4458:2: rule__Names__Group__0__Impl rule__Names__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Names__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Names__Group__1();

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
    // $ANTLR end "rule__Names__Group__0"


    // $ANTLR start "rule__Names__Group__0__Impl"
    // InternalMontiArcAndCore.g:4465:1: rule__Names__Group__0__Impl : ( ( rule__Names__NamesAssignment_0 ) ) ;
    public final void rule__Names__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4469:1: ( ( ( rule__Names__NamesAssignment_0 ) ) )
            // InternalMontiArcAndCore.g:4470:1: ( ( rule__Names__NamesAssignment_0 ) )
            {
            // InternalMontiArcAndCore.g:4470:1: ( ( rule__Names__NamesAssignment_0 ) )
            // InternalMontiArcAndCore.g:4471:2: ( rule__Names__NamesAssignment_0 )
            {
             before(grammarAccess.getNamesAccess().getNamesAssignment_0()); 
            // InternalMontiArcAndCore.g:4472:2: ( rule__Names__NamesAssignment_0 )
            // InternalMontiArcAndCore.g:4472:3: rule__Names__NamesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Names__NamesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNamesAccess().getNamesAssignment_0()); 

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
    // $ANTLR end "rule__Names__Group__0__Impl"


    // $ANTLR start "rule__Names__Group__1"
    // InternalMontiArcAndCore.g:4480:1: rule__Names__Group__1 : rule__Names__Group__1__Impl ;
    public final void rule__Names__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4484:1: ( rule__Names__Group__1__Impl )
            // InternalMontiArcAndCore.g:4485:2: rule__Names__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Names__Group__1__Impl();

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
    // $ANTLR end "rule__Names__Group__1"


    // $ANTLR start "rule__Names__Group__1__Impl"
    // InternalMontiArcAndCore.g:4491:1: rule__Names__Group__1__Impl : ( ( rule__Names__Group_1__0 )* ) ;
    public final void rule__Names__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4495:1: ( ( ( rule__Names__Group_1__0 )* ) )
            // InternalMontiArcAndCore.g:4496:1: ( ( rule__Names__Group_1__0 )* )
            {
            // InternalMontiArcAndCore.g:4496:1: ( ( rule__Names__Group_1__0 )* )
            // InternalMontiArcAndCore.g:4497:2: ( rule__Names__Group_1__0 )*
            {
             before(grammarAccess.getNamesAccess().getGroup_1()); 
            // InternalMontiArcAndCore.g:4498:2: ( rule__Names__Group_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==50) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalMontiArcAndCore.g:4498:3: rule__Names__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Names__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getNamesAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Names__Group__1__Impl"


    // $ANTLR start "rule__Names__Group_1__0"
    // InternalMontiArcAndCore.g:4507:1: rule__Names__Group_1__0 : rule__Names__Group_1__0__Impl rule__Names__Group_1__1 ;
    public final void rule__Names__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4511:1: ( rule__Names__Group_1__0__Impl rule__Names__Group_1__1 )
            // InternalMontiArcAndCore.g:4512:2: rule__Names__Group_1__0__Impl rule__Names__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Names__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Names__Group_1__1();

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
    // $ANTLR end "rule__Names__Group_1__0"


    // $ANTLR start "rule__Names__Group_1__0__Impl"
    // InternalMontiArcAndCore.g:4519:1: rule__Names__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Names__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4523:1: ( ( ',' ) )
            // InternalMontiArcAndCore.g:4524:1: ( ',' )
            {
            // InternalMontiArcAndCore.g:4524:1: ( ',' )
            // InternalMontiArcAndCore.g:4525:2: ','
            {
             before(grammarAccess.getNamesAccess().getCommaKeyword_1_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getNamesAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__Names__Group_1__0__Impl"


    // $ANTLR start "rule__Names__Group_1__1"
    // InternalMontiArcAndCore.g:4534:1: rule__Names__Group_1__1 : rule__Names__Group_1__1__Impl ;
    public final void rule__Names__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4538:1: ( rule__Names__Group_1__1__Impl )
            // InternalMontiArcAndCore.g:4539:2: rule__Names__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Names__Group_1__1__Impl();

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
    // $ANTLR end "rule__Names__Group_1__1"


    // $ANTLR start "rule__Names__Group_1__1__Impl"
    // InternalMontiArcAndCore.g:4545:1: rule__Names__Group_1__1__Impl : ( ( rule__Names__NamesAssignment_1_1 ) ) ;
    public final void rule__Names__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4549:1: ( ( ( rule__Names__NamesAssignment_1_1 ) ) )
            // InternalMontiArcAndCore.g:4550:1: ( ( rule__Names__NamesAssignment_1_1 ) )
            {
            // InternalMontiArcAndCore.g:4550:1: ( ( rule__Names__NamesAssignment_1_1 ) )
            // InternalMontiArcAndCore.g:4551:2: ( rule__Names__NamesAssignment_1_1 )
            {
             before(grammarAccess.getNamesAccess().getNamesAssignment_1_1()); 
            // InternalMontiArcAndCore.g:4552:2: ( rule__Names__NamesAssignment_1_1 )
            // InternalMontiArcAndCore.g:4552:3: rule__Names__NamesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Names__NamesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNamesAccess().getNamesAssignment_1_1()); 

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
    // $ANTLR end "rule__Names__Group_1__1__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalMontiArcAndCore.g:4561:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4565:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalMontiArcAndCore.g:4566:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

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
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalMontiArcAndCore.g:4573:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__TypeAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4577:1: ( ( ( rule__Variable__TypeAssignment_0 ) ) )
            // InternalMontiArcAndCore.g:4578:1: ( ( rule__Variable__TypeAssignment_0 ) )
            {
            // InternalMontiArcAndCore.g:4578:1: ( ( rule__Variable__TypeAssignment_0 ) )
            // InternalMontiArcAndCore.g:4579:2: ( rule__Variable__TypeAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getTypeAssignment_0()); 
            // InternalMontiArcAndCore.g:4580:2: ( rule__Variable__TypeAssignment_0 )
            // InternalMontiArcAndCore.g:4580:3: rule__Variable__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalMontiArcAndCore.g:4588:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4592:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalMontiArcAndCore.g:4593:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__2();

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
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalMontiArcAndCore.g:4600:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4604:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // InternalMontiArcAndCore.g:4605:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // InternalMontiArcAndCore.g:4605:1: ( ( rule__Variable__NameAssignment_1 ) )
            // InternalMontiArcAndCore.g:4606:2: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // InternalMontiArcAndCore.g:4607:2: ( rule__Variable__NameAssignment_1 )
            // InternalMontiArcAndCore.g:4607:3: rule__Variable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__2"
    // InternalMontiArcAndCore.g:4615:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4619:1: ( rule__Variable__Group__2__Impl )
            // InternalMontiArcAndCore.g:4620:2: rule__Variable__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__2__Impl();

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
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // InternalMontiArcAndCore.g:4626:1: rule__Variable__Group__2__Impl : ( ';' ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4630:1: ( ( ';' ) )
            // InternalMontiArcAndCore.g:4631:1: ( ';' )
            {
            // InternalMontiArcAndCore.g:4631:1: ( ';' )
            // InternalMontiArcAndCore.g:4632:2: ';'
            {
             before(grammarAccess.getVariableAccess().getSemicolonKeyword_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__Automaton__Group__0"
    // InternalMontiArcAndCore.g:4642:1: rule__Automaton__Group__0 : rule__Automaton__Group__0__Impl rule__Automaton__Group__1 ;
    public final void rule__Automaton__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4646:1: ( rule__Automaton__Group__0__Impl rule__Automaton__Group__1 )
            // InternalMontiArcAndCore.g:4647:2: rule__Automaton__Group__0__Impl rule__Automaton__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__Automaton__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Automaton__Group__1();

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
    // $ANTLR end "rule__Automaton__Group__0"


    // $ANTLR start "rule__Automaton__Group__0__Impl"
    // InternalMontiArcAndCore.g:4654:1: rule__Automaton__Group__0__Impl : ( () ) ;
    public final void rule__Automaton__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4658:1: ( ( () ) )
            // InternalMontiArcAndCore.g:4659:1: ( () )
            {
            // InternalMontiArcAndCore.g:4659:1: ( () )
            // InternalMontiArcAndCore.g:4660:2: ()
            {
             before(grammarAccess.getAutomatonAccess().getAutomatonAction_0()); 
            // InternalMontiArcAndCore.g:4661:2: ()
            // InternalMontiArcAndCore.g:4661:3: 
            {
            }

             after(grammarAccess.getAutomatonAccess().getAutomatonAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automaton__Group__0__Impl"


    // $ANTLR start "rule__Automaton__Group__1"
    // InternalMontiArcAndCore.g:4669:1: rule__Automaton__Group__1 : rule__Automaton__Group__1__Impl rule__Automaton__Group__2 ;
    public final void rule__Automaton__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4673:1: ( rule__Automaton__Group__1__Impl rule__Automaton__Group__2 )
            // InternalMontiArcAndCore.g:4674:2: rule__Automaton__Group__1__Impl rule__Automaton__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__Automaton__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Automaton__Group__2();

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
    // $ANTLR end "rule__Automaton__Group__1"


    // $ANTLR start "rule__Automaton__Group__1__Impl"
    // InternalMontiArcAndCore.g:4681:1: rule__Automaton__Group__1__Impl : ( ( rule__Automaton__SyncAssignment_1 )? ) ;
    public final void rule__Automaton__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4685:1: ( ( ( rule__Automaton__SyncAssignment_1 )? ) )
            // InternalMontiArcAndCore.g:4686:1: ( ( rule__Automaton__SyncAssignment_1 )? )
            {
            // InternalMontiArcAndCore.g:4686:1: ( ( rule__Automaton__SyncAssignment_1 )? )
            // InternalMontiArcAndCore.g:4687:2: ( rule__Automaton__SyncAssignment_1 )?
            {
             before(grammarAccess.getAutomatonAccess().getSyncAssignment_1()); 
            // InternalMontiArcAndCore.g:4688:2: ( rule__Automaton__SyncAssignment_1 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_SYNC) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMontiArcAndCore.g:4688:3: rule__Automaton__SyncAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Automaton__SyncAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutomatonAccess().getSyncAssignment_1()); 

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
    // $ANTLR end "rule__Automaton__Group__1__Impl"


    // $ANTLR start "rule__Automaton__Group__2"
    // InternalMontiArcAndCore.g:4696:1: rule__Automaton__Group__2 : rule__Automaton__Group__2__Impl rule__Automaton__Group__3 ;
    public final void rule__Automaton__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4700:1: ( rule__Automaton__Group__2__Impl rule__Automaton__Group__3 )
            // InternalMontiArcAndCore.g:4701:2: rule__Automaton__Group__2__Impl rule__Automaton__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__Automaton__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Automaton__Group__3();

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
    // $ANTLR end "rule__Automaton__Group__2"


    // $ANTLR start "rule__Automaton__Group__2__Impl"
    // InternalMontiArcAndCore.g:4708:1: rule__Automaton__Group__2__Impl : ( 'automaton' ) ;
    public final void rule__Automaton__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4712:1: ( ( 'automaton' ) )
            // InternalMontiArcAndCore.g:4713:1: ( 'automaton' )
            {
            // InternalMontiArcAndCore.g:4713:1: ( 'automaton' )
            // InternalMontiArcAndCore.g:4714:2: 'automaton'
            {
             before(grammarAccess.getAutomatonAccess().getAutomatonKeyword_2()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getAutomatonAccess().getAutomatonKeyword_2()); 

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
    // $ANTLR end "rule__Automaton__Group__2__Impl"


    // $ANTLR start "rule__Automaton__Group__3"
    // InternalMontiArcAndCore.g:4723:1: rule__Automaton__Group__3 : rule__Automaton__Group__3__Impl rule__Automaton__Group__4 ;
    public final void rule__Automaton__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4727:1: ( rule__Automaton__Group__3__Impl rule__Automaton__Group__4 )
            // InternalMontiArcAndCore.g:4728:2: rule__Automaton__Group__3__Impl rule__Automaton__Group__4
            {
            pushFollow(FOLLOW_41);
            rule__Automaton__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Automaton__Group__4();

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
    // $ANTLR end "rule__Automaton__Group__3"


    // $ANTLR start "rule__Automaton__Group__3__Impl"
    // InternalMontiArcAndCore.g:4735:1: rule__Automaton__Group__3__Impl : ( ( rule__Automaton__NameAssignment_3 )? ) ;
    public final void rule__Automaton__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4739:1: ( ( ( rule__Automaton__NameAssignment_3 )? ) )
            // InternalMontiArcAndCore.g:4740:1: ( ( rule__Automaton__NameAssignment_3 )? )
            {
            // InternalMontiArcAndCore.g:4740:1: ( ( rule__Automaton__NameAssignment_3 )? )
            // InternalMontiArcAndCore.g:4741:2: ( rule__Automaton__NameAssignment_3 )?
            {
             before(grammarAccess.getAutomatonAccess().getNameAssignment_3()); 
            // InternalMontiArcAndCore.g:4742:2: ( rule__Automaton__NameAssignment_3 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMontiArcAndCore.g:4742:3: rule__Automaton__NameAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Automaton__NameAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutomatonAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__Automaton__Group__3__Impl"


    // $ANTLR start "rule__Automaton__Group__4"
    // InternalMontiArcAndCore.g:4750:1: rule__Automaton__Group__4 : rule__Automaton__Group__4__Impl rule__Automaton__Group__5 ;
    public final void rule__Automaton__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4754:1: ( rule__Automaton__Group__4__Impl rule__Automaton__Group__5 )
            // InternalMontiArcAndCore.g:4755:2: rule__Automaton__Group__4__Impl rule__Automaton__Group__5
            {
            pushFollow(FOLLOW_42);
            rule__Automaton__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Automaton__Group__5();

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
    // $ANTLR end "rule__Automaton__Group__4"


    // $ANTLR start "rule__Automaton__Group__4__Impl"
    // InternalMontiArcAndCore.g:4762:1: rule__Automaton__Group__4__Impl : ( '{' ) ;
    public final void rule__Automaton__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4766:1: ( ( '{' ) )
            // InternalMontiArcAndCore.g:4767:1: ( '{' )
            {
            // InternalMontiArcAndCore.g:4767:1: ( '{' )
            // InternalMontiArcAndCore.g:4768:2: '{'
            {
             before(grammarAccess.getAutomatonAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getAutomatonAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Automaton__Group__4__Impl"


    // $ANTLR start "rule__Automaton__Group__5"
    // InternalMontiArcAndCore.g:4777:1: rule__Automaton__Group__5 : rule__Automaton__Group__5__Impl rule__Automaton__Group__6 ;
    public final void rule__Automaton__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4781:1: ( rule__Automaton__Group__5__Impl rule__Automaton__Group__6 )
            // InternalMontiArcAndCore.g:4782:2: rule__Automaton__Group__5__Impl rule__Automaton__Group__6
            {
            pushFollow(FOLLOW_42);
            rule__Automaton__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Automaton__Group__6();

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
    // $ANTLR end "rule__Automaton__Group__5"


    // $ANTLR start "rule__Automaton__Group__5__Impl"
    // InternalMontiArcAndCore.g:4789:1: rule__Automaton__Group__5__Impl : ( ( rule__Automaton__Alternatives_5 )* ) ;
    public final void rule__Automaton__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4793:1: ( ( ( rule__Automaton__Alternatives_5 )* ) )
            // InternalMontiArcAndCore.g:4794:1: ( ( rule__Automaton__Alternatives_5 )* )
            {
            // InternalMontiArcAndCore.g:4794:1: ( ( rule__Automaton__Alternatives_5 )* )
            // InternalMontiArcAndCore.g:4795:2: ( rule__Automaton__Alternatives_5 )*
            {
             before(grammarAccess.getAutomatonAccess().getAlternatives_5()); 
            // InternalMontiArcAndCore.g:4796:2: ( rule__Automaton__Alternatives_5 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_ID||(LA45_0>=41 && LA45_0<=42)||LA45_0==52||LA45_0==66) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalMontiArcAndCore.g:4796:3: rule__Automaton__Alternatives_5
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__Automaton__Alternatives_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getAutomatonAccess().getAlternatives_5()); 

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
    // $ANTLR end "rule__Automaton__Group__5__Impl"


    // $ANTLR start "rule__Automaton__Group__6"
    // InternalMontiArcAndCore.g:4804:1: rule__Automaton__Group__6 : rule__Automaton__Group__6__Impl ;
    public final void rule__Automaton__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4808:1: ( rule__Automaton__Group__6__Impl )
            // InternalMontiArcAndCore.g:4809:2: rule__Automaton__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Automaton__Group__6__Impl();

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
    // $ANTLR end "rule__Automaton__Group__6"


    // $ANTLR start "rule__Automaton__Group__6__Impl"
    // InternalMontiArcAndCore.g:4815:1: rule__Automaton__Group__6__Impl : ( '}' ) ;
    public final void rule__Automaton__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4819:1: ( ( '}' ) )
            // InternalMontiArcAndCore.g:4820:1: ( '}' )
            {
            // InternalMontiArcAndCore.g:4820:1: ( '}' )
            // InternalMontiArcAndCore.g:4821:2: '}'
            {
             before(grammarAccess.getAutomatonAccess().getRightCurlyBracketKeyword_6()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getAutomatonAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Automaton__Group__6__Impl"


    // $ANTLR start "rule__SCState__Group__0"
    // InternalMontiArcAndCore.g:4831:1: rule__SCState__Group__0 : rule__SCState__Group__0__Impl rule__SCState__Group__1 ;
    public final void rule__SCState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4835:1: ( rule__SCState__Group__0__Impl rule__SCState__Group__1 )
            // InternalMontiArcAndCore.g:4836:2: rule__SCState__Group__0__Impl rule__SCState__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__SCState__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SCState__Group__1();

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
    // $ANTLR end "rule__SCState__Group__0"


    // $ANTLR start "rule__SCState__Group__0__Impl"
    // InternalMontiArcAndCore.g:4843:1: rule__SCState__Group__0__Impl : ( ( rule__SCState__ModifierAssignment_0 )* ) ;
    public final void rule__SCState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4847:1: ( ( ( rule__SCState__ModifierAssignment_0 )* ) )
            // InternalMontiArcAndCore.g:4848:1: ( ( rule__SCState__ModifierAssignment_0 )* )
            {
            // InternalMontiArcAndCore.g:4848:1: ( ( rule__SCState__ModifierAssignment_0 )* )
            // InternalMontiArcAndCore.g:4849:2: ( rule__SCState__ModifierAssignment_0 )*
            {
             before(grammarAccess.getSCStateAccess().getModifierAssignment_0()); 
            // InternalMontiArcAndCore.g:4850:2: ( rule__SCState__ModifierAssignment_0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=41 && LA46_0<=42)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalMontiArcAndCore.g:4850:3: rule__SCState__ModifierAssignment_0
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__SCState__ModifierAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getSCStateAccess().getModifierAssignment_0()); 

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
    // $ANTLR end "rule__SCState__Group__0__Impl"


    // $ANTLR start "rule__SCState__Group__1"
    // InternalMontiArcAndCore.g:4858:1: rule__SCState__Group__1 : rule__SCState__Group__1__Impl rule__SCState__Group__2 ;
    public final void rule__SCState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4862:1: ( rule__SCState__Group__1__Impl rule__SCState__Group__2 )
            // InternalMontiArcAndCore.g:4863:2: rule__SCState__Group__1__Impl rule__SCState__Group__2
            {
            pushFollow(FOLLOW_44);
            rule__SCState__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SCState__Group__2();

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
    // $ANTLR end "rule__SCState__Group__1"


    // $ANTLR start "rule__SCState__Group__1__Impl"
    // InternalMontiArcAndCore.g:4870:1: rule__SCState__Group__1__Impl : ( ( rule__SCState__AnteAssignment_1 )? ) ;
    public final void rule__SCState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4874:1: ( ( ( rule__SCState__AnteAssignment_1 )? ) )
            // InternalMontiArcAndCore.g:4875:1: ( ( rule__SCState__AnteAssignment_1 )? )
            {
            // InternalMontiArcAndCore.g:4875:1: ( ( rule__SCState__AnteAssignment_1 )? )
            // InternalMontiArcAndCore.g:4876:2: ( rule__SCState__AnteAssignment_1 )?
            {
             before(grammarAccess.getSCStateAccess().getAnteAssignment_1()); 
            // InternalMontiArcAndCore.g:4877:2: ( rule__SCState__AnteAssignment_1 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==52) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMontiArcAndCore.g:4877:3: rule__SCState__AnteAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SCState__AnteAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSCStateAccess().getAnteAssignment_1()); 

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
    // $ANTLR end "rule__SCState__Group__1__Impl"


    // $ANTLR start "rule__SCState__Group__2"
    // InternalMontiArcAndCore.g:4885:1: rule__SCState__Group__2 : rule__SCState__Group__2__Impl rule__SCState__Group__3 ;
    public final void rule__SCState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4889:1: ( rule__SCState__Group__2__Impl rule__SCState__Group__3 )
            // InternalMontiArcAndCore.g:4890:2: rule__SCState__Group__2__Impl rule__SCState__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__SCState__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SCState__Group__3();

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
    // $ANTLR end "rule__SCState__Group__2"


    // $ANTLR start "rule__SCState__Group__2__Impl"
    // InternalMontiArcAndCore.g:4897:1: rule__SCState__Group__2__Impl : ( 'state' ) ;
    public final void rule__SCState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4901:1: ( ( 'state' ) )
            // InternalMontiArcAndCore.g:4902:1: ( 'state' )
            {
            // InternalMontiArcAndCore.g:4902:1: ( 'state' )
            // InternalMontiArcAndCore.g:4903:2: 'state'
            {
             before(grammarAccess.getSCStateAccess().getStateKeyword_2()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getSCStateAccess().getStateKeyword_2()); 

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
    // $ANTLR end "rule__SCState__Group__2__Impl"


    // $ANTLR start "rule__SCState__Group__3"
    // InternalMontiArcAndCore.g:4912:1: rule__SCState__Group__3 : rule__SCState__Group__3__Impl rule__SCState__Group__4 ;
    public final void rule__SCState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4916:1: ( rule__SCState__Group__3__Impl rule__SCState__Group__4 )
            // InternalMontiArcAndCore.g:4917:2: rule__SCState__Group__3__Impl rule__SCState__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__SCState__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SCState__Group__4();

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
    // $ANTLR end "rule__SCState__Group__3"


    // $ANTLR start "rule__SCState__Group__3__Impl"
    // InternalMontiArcAndCore.g:4924:1: rule__SCState__Group__3__Impl : ( ( rule__SCState__NameAssignment_3 ) ) ;
    public final void rule__SCState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4928:1: ( ( ( rule__SCState__NameAssignment_3 ) ) )
            // InternalMontiArcAndCore.g:4929:1: ( ( rule__SCState__NameAssignment_3 ) )
            {
            // InternalMontiArcAndCore.g:4929:1: ( ( rule__SCState__NameAssignment_3 ) )
            // InternalMontiArcAndCore.g:4930:2: ( rule__SCState__NameAssignment_3 )
            {
             before(grammarAccess.getSCStateAccess().getNameAssignment_3()); 
            // InternalMontiArcAndCore.g:4931:2: ( rule__SCState__NameAssignment_3 )
            // InternalMontiArcAndCore.g:4931:3: rule__SCState__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SCState__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSCStateAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__SCState__Group__3__Impl"


    // $ANTLR start "rule__SCState__Group__4"
    // InternalMontiArcAndCore.g:4939:1: rule__SCState__Group__4 : rule__SCState__Group__4__Impl ;
    public final void rule__SCState__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4943:1: ( rule__SCState__Group__4__Impl )
            // InternalMontiArcAndCore.g:4944:2: rule__SCState__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SCState__Group__4__Impl();

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
    // $ANTLR end "rule__SCState__Group__4"


    // $ANTLR start "rule__SCState__Group__4__Impl"
    // InternalMontiArcAndCore.g:4950:1: rule__SCState__Group__4__Impl : ( ';' ) ;
    public final void rule__SCState__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4954:1: ( ( ';' ) )
            // InternalMontiArcAndCore.g:4955:1: ( ';' )
            {
            // InternalMontiArcAndCore.g:4955:1: ( ';' )
            // InternalMontiArcAndCore.g:4956:2: ';'
            {
             before(grammarAccess.getSCStateAccess().getSemicolonKeyword_4()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSCStateAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__SCState__Group__4__Impl"


    // $ANTLR start "rule__InvState__Group__0"
    // InternalMontiArcAndCore.g:4966:1: rule__InvState__Group__0 : rule__InvState__Group__0__Impl rule__InvState__Group__1 ;
    public final void rule__InvState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4970:1: ( rule__InvState__Group__0__Impl rule__InvState__Group__1 )
            // InternalMontiArcAndCore.g:4971:2: rule__InvState__Group__0__Impl rule__InvState__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__InvState__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InvState__Group__1();

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
    // $ANTLR end "rule__InvState__Group__0"


    // $ANTLR start "rule__InvState__Group__0__Impl"
    // InternalMontiArcAndCore.g:4978:1: rule__InvState__Group__0__Impl : ( ( rule__InvState__ModifierAssignment_0 )* ) ;
    public final void rule__InvState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4982:1: ( ( ( rule__InvState__ModifierAssignment_0 )* ) )
            // InternalMontiArcAndCore.g:4983:1: ( ( rule__InvState__ModifierAssignment_0 )* )
            {
            // InternalMontiArcAndCore.g:4983:1: ( ( rule__InvState__ModifierAssignment_0 )* )
            // InternalMontiArcAndCore.g:4984:2: ( rule__InvState__ModifierAssignment_0 )*
            {
             before(grammarAccess.getInvStateAccess().getModifierAssignment_0()); 
            // InternalMontiArcAndCore.g:4985:2: ( rule__InvState__ModifierAssignment_0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=41 && LA48_0<=42)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalMontiArcAndCore.g:4985:3: rule__InvState__ModifierAssignment_0
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__InvState__ModifierAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getInvStateAccess().getModifierAssignment_0()); 

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
    // $ANTLR end "rule__InvState__Group__0__Impl"


    // $ANTLR start "rule__InvState__Group__1"
    // InternalMontiArcAndCore.g:4993:1: rule__InvState__Group__1 : rule__InvState__Group__1__Impl rule__InvState__Group__2 ;
    public final void rule__InvState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:4997:1: ( rule__InvState__Group__1__Impl rule__InvState__Group__2 )
            // InternalMontiArcAndCore.g:4998:2: rule__InvState__Group__1__Impl rule__InvState__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__InvState__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InvState__Group__2();

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
    // $ANTLR end "rule__InvState__Group__1"


    // $ANTLR start "rule__InvState__Group__1__Impl"
    // InternalMontiArcAndCore.g:5005:1: rule__InvState__Group__1__Impl : ( 'state' ) ;
    public final void rule__InvState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5009:1: ( ( 'state' ) )
            // InternalMontiArcAndCore.g:5010:1: ( 'state' )
            {
            // InternalMontiArcAndCore.g:5010:1: ( 'state' )
            // InternalMontiArcAndCore.g:5011:2: 'state'
            {
             before(grammarAccess.getInvStateAccess().getStateKeyword_1()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getInvStateAccess().getStateKeyword_1()); 

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
    // $ANTLR end "rule__InvState__Group__1__Impl"


    // $ANTLR start "rule__InvState__Group__2"
    // InternalMontiArcAndCore.g:5020:1: rule__InvState__Group__2 : rule__InvState__Group__2__Impl rule__InvState__Group__3 ;
    public final void rule__InvState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5024:1: ( rule__InvState__Group__2__Impl rule__InvState__Group__3 )
            // InternalMontiArcAndCore.g:5025:2: rule__InvState__Group__2__Impl rule__InvState__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__InvState__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InvState__Group__3();

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
    // $ANTLR end "rule__InvState__Group__2"


    // $ANTLR start "rule__InvState__Group__2__Impl"
    // InternalMontiArcAndCore.g:5032:1: rule__InvState__Group__2__Impl : ( ( rule__InvState__NameAssignment_2 ) ) ;
    public final void rule__InvState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5036:1: ( ( ( rule__InvState__NameAssignment_2 ) ) )
            // InternalMontiArcAndCore.g:5037:1: ( ( rule__InvState__NameAssignment_2 ) )
            {
            // InternalMontiArcAndCore.g:5037:1: ( ( rule__InvState__NameAssignment_2 ) )
            // InternalMontiArcAndCore.g:5038:2: ( rule__InvState__NameAssignment_2 )
            {
             before(grammarAccess.getInvStateAccess().getNameAssignment_2()); 
            // InternalMontiArcAndCore.g:5039:2: ( rule__InvState__NameAssignment_2 )
            // InternalMontiArcAndCore.g:5039:3: rule__InvState__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__InvState__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInvStateAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__InvState__Group__2__Impl"


    // $ANTLR start "rule__InvState__Group__3"
    // InternalMontiArcAndCore.g:5047:1: rule__InvState__Group__3 : rule__InvState__Group__3__Impl rule__InvState__Group__4 ;
    public final void rule__InvState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5051:1: ( rule__InvState__Group__3__Impl rule__InvState__Group__4 )
            // InternalMontiArcAndCore.g:5052:2: rule__InvState__Group__3__Impl rule__InvState__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__InvState__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InvState__Group__4();

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
    // $ANTLR end "rule__InvState__Group__3"


    // $ANTLR start "rule__InvState__Group__3__Impl"
    // InternalMontiArcAndCore.g:5059:1: rule__InvState__Group__3__Impl : ( '[' ) ;
    public final void rule__InvState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5063:1: ( ( '[' ) )
            // InternalMontiArcAndCore.g:5064:1: ( '[' )
            {
            // InternalMontiArcAndCore.g:5064:1: ( '[' )
            // InternalMontiArcAndCore.g:5065:2: '['
            {
             before(grammarAccess.getInvStateAccess().getLeftSquareBracketKeyword_3()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getInvStateAccess().getLeftSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__InvState__Group__3__Impl"


    // $ANTLR start "rule__InvState__Group__4"
    // InternalMontiArcAndCore.g:5074:1: rule__InvState__Group__4 : rule__InvState__Group__4__Impl rule__InvState__Group__5 ;
    public final void rule__InvState__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5078:1: ( rule__InvState__Group__4__Impl rule__InvState__Group__5 )
            // InternalMontiArcAndCore.g:5079:2: rule__InvState__Group__4__Impl rule__InvState__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__InvState__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InvState__Group__5();

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
    // $ANTLR end "rule__InvState__Group__4"


    // $ANTLR start "rule__InvState__Group__4__Impl"
    // InternalMontiArcAndCore.g:5086:1: rule__InvState__Group__4__Impl : ( ( rule__InvState__ExpressionAssignment_4 ) ) ;
    public final void rule__InvState__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5090:1: ( ( ( rule__InvState__ExpressionAssignment_4 ) ) )
            // InternalMontiArcAndCore.g:5091:1: ( ( rule__InvState__ExpressionAssignment_4 ) )
            {
            // InternalMontiArcAndCore.g:5091:1: ( ( rule__InvState__ExpressionAssignment_4 ) )
            // InternalMontiArcAndCore.g:5092:2: ( rule__InvState__ExpressionAssignment_4 )
            {
             before(grammarAccess.getInvStateAccess().getExpressionAssignment_4()); 
            // InternalMontiArcAndCore.g:5093:2: ( rule__InvState__ExpressionAssignment_4 )
            // InternalMontiArcAndCore.g:5093:3: rule__InvState__ExpressionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__InvState__ExpressionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInvStateAccess().getExpressionAssignment_4()); 

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
    // $ANTLR end "rule__InvState__Group__4__Impl"


    // $ANTLR start "rule__InvState__Group__5"
    // InternalMontiArcAndCore.g:5101:1: rule__InvState__Group__5 : rule__InvState__Group__5__Impl rule__InvState__Group__6 ;
    public final void rule__InvState__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5105:1: ( rule__InvState__Group__5__Impl rule__InvState__Group__6 )
            // InternalMontiArcAndCore.g:5106:2: rule__InvState__Group__5__Impl rule__InvState__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__InvState__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InvState__Group__6();

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
    // $ANTLR end "rule__InvState__Group__5"


    // $ANTLR start "rule__InvState__Group__5__Impl"
    // InternalMontiArcAndCore.g:5113:1: rule__InvState__Group__5__Impl : ( ']' ) ;
    public final void rule__InvState__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5117:1: ( ( ']' ) )
            // InternalMontiArcAndCore.g:5118:1: ( ']' )
            {
            // InternalMontiArcAndCore.g:5118:1: ( ']' )
            // InternalMontiArcAndCore.g:5119:2: ']'
            {
             before(grammarAccess.getInvStateAccess().getRightSquareBracketKeyword_5()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getInvStateAccess().getRightSquareBracketKeyword_5()); 

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
    // $ANTLR end "rule__InvState__Group__5__Impl"


    // $ANTLR start "rule__InvState__Group__6"
    // InternalMontiArcAndCore.g:5128:1: rule__InvState__Group__6 : rule__InvState__Group__6__Impl ;
    public final void rule__InvState__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5132:1: ( rule__InvState__Group__6__Impl )
            // InternalMontiArcAndCore.g:5133:2: rule__InvState__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InvState__Group__6__Impl();

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
    // $ANTLR end "rule__InvState__Group__6"


    // $ANTLR start "rule__InvState__Group__6__Impl"
    // InternalMontiArcAndCore.g:5139:1: rule__InvState__Group__6__Impl : ( ';' ) ;
    public final void rule__InvState__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5143:1: ( ( ';' ) )
            // InternalMontiArcAndCore.g:5144:1: ( ';' )
            {
            // InternalMontiArcAndCore.g:5144:1: ( ';' )
            // InternalMontiArcAndCore.g:5145:2: ';'
            {
             before(grammarAccess.getInvStateAccess().getSemicolonKeyword_6()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getInvStateAccess().getSemicolonKeyword_6()); 

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
    // $ANTLR end "rule__InvState__Group__6__Impl"


    // $ANTLR start "rule__SCSAnte__Group__0"
    // InternalMontiArcAndCore.g:5155:1: rule__SCSAnte__Group__0 : rule__SCSAnte__Group__0__Impl rule__SCSAnte__Group__1 ;
    public final void rule__SCSAnte__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5159:1: ( rule__SCSAnte__Group__0__Impl rule__SCSAnte__Group__1 )
            // InternalMontiArcAndCore.g:5160:2: rule__SCSAnte__Group__0__Impl rule__SCSAnte__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__SCSAnte__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SCSAnte__Group__1();

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
    // $ANTLR end "rule__SCSAnte__Group__0"


    // $ANTLR start "rule__SCSAnte__Group__0__Impl"
    // InternalMontiArcAndCore.g:5167:1: rule__SCSAnte__Group__0__Impl : ( () ) ;
    public final void rule__SCSAnte__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5171:1: ( ( () ) )
            // InternalMontiArcAndCore.g:5172:1: ( () )
            {
            // InternalMontiArcAndCore.g:5172:1: ( () )
            // InternalMontiArcAndCore.g:5173:2: ()
            {
             before(grammarAccess.getSCSAnteAccess().getSCSAnteAction_0()); 
            // InternalMontiArcAndCore.g:5174:2: ()
            // InternalMontiArcAndCore.g:5174:3: 
            {
            }

             after(grammarAccess.getSCSAnteAccess().getSCSAnteAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SCSAnte__Group__0__Impl"


    // $ANTLR start "rule__SCSAnte__Group__1"
    // InternalMontiArcAndCore.g:5182:1: rule__SCSAnte__Group__1 : rule__SCSAnte__Group__1__Impl ;
    public final void rule__SCSAnte__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5186:1: ( rule__SCSAnte__Group__1__Impl )
            // InternalMontiArcAndCore.g:5187:2: rule__SCSAnte__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SCSAnte__Group__1__Impl();

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
    // $ANTLR end "rule__SCSAnte__Group__1"


    // $ANTLR start "rule__SCSAnte__Group__1__Impl"
    // InternalMontiArcAndCore.g:5193:1: rule__SCSAnte__Group__1__Impl : ( ( rule__SCSAnte__BlockAssignment_1 ) ) ;
    public final void rule__SCSAnte__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5197:1: ( ( ( rule__SCSAnte__BlockAssignment_1 ) ) )
            // InternalMontiArcAndCore.g:5198:1: ( ( rule__SCSAnte__BlockAssignment_1 ) )
            {
            // InternalMontiArcAndCore.g:5198:1: ( ( rule__SCSAnte__BlockAssignment_1 ) )
            // InternalMontiArcAndCore.g:5199:2: ( rule__SCSAnte__BlockAssignment_1 )
            {
             before(grammarAccess.getSCSAnteAccess().getBlockAssignment_1()); 
            // InternalMontiArcAndCore.g:5200:2: ( rule__SCSAnte__BlockAssignment_1 )
            // InternalMontiArcAndCore.g:5200:3: rule__SCSAnte__BlockAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SCSAnte__BlockAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSCSAnteAccess().getBlockAssignment_1()); 

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
    // $ANTLR end "rule__SCSAnte__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // InternalMontiArcAndCore.g:5209:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5213:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalMontiArcAndCore.g:5214:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__1();

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
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // InternalMontiArcAndCore.g:5221:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__SourceAssignment_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5225:1: ( ( ( rule__Transition__SourceAssignment_0 ) ) )
            // InternalMontiArcAndCore.g:5226:1: ( ( rule__Transition__SourceAssignment_0 ) )
            {
            // InternalMontiArcAndCore.g:5226:1: ( ( rule__Transition__SourceAssignment_0 ) )
            // InternalMontiArcAndCore.g:5227:2: ( rule__Transition__SourceAssignment_0 )
            {
             before(grammarAccess.getTransitionAccess().getSourceAssignment_0()); 
            // InternalMontiArcAndCore.g:5228:2: ( rule__Transition__SourceAssignment_0 )
            // InternalMontiArcAndCore.g:5228:3: rule__Transition__SourceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__SourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getSourceAssignment_0()); 

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
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // InternalMontiArcAndCore.g:5236:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5240:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalMontiArcAndCore.g:5241:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_46);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__2();

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
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // InternalMontiArcAndCore.g:5248:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__Group_1__0 )? ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5252:1: ( ( ( rule__Transition__Group_1__0 )? ) )
            // InternalMontiArcAndCore.g:5253:1: ( ( rule__Transition__Group_1__0 )? )
            {
            // InternalMontiArcAndCore.g:5253:1: ( ( rule__Transition__Group_1__0 )? )
            // InternalMontiArcAndCore.g:5254:2: ( rule__Transition__Group_1__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_1()); 
            // InternalMontiArcAndCore.g:5255:2: ( rule__Transition__Group_1__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==60) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalMontiArcAndCore.g:5255:3: rule__Transition__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // InternalMontiArcAndCore.g:5263:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5267:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalMontiArcAndCore.g:5268:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_46);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__3();

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
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // InternalMontiArcAndCore.g:5275:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__Group_2__0 )? ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5279:1: ( ( ( rule__Transition__Group_2__0 )? ) )
            // InternalMontiArcAndCore.g:5280:1: ( ( rule__Transition__Group_2__0 )? )
            {
            // InternalMontiArcAndCore.g:5280:1: ( ( rule__Transition__Group_2__0 )? )
            // InternalMontiArcAndCore.g:5281:2: ( rule__Transition__Group_2__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_2()); 
            // InternalMontiArcAndCore.g:5282:2: ( rule__Transition__Group_2__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==46) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMontiArcAndCore.g:5282:3: rule__Transition__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // InternalMontiArcAndCore.g:5290:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5294:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalMontiArcAndCore.g:5295:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_46);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__4();

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
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // InternalMontiArcAndCore.g:5302:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__Group_3__0 )? ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5306:1: ( ( ( rule__Transition__Group_3__0 )? ) )
            // InternalMontiArcAndCore.g:5307:1: ( ( rule__Transition__Group_3__0 )? )
            {
            // InternalMontiArcAndCore.g:5307:1: ( ( rule__Transition__Group_3__0 )? )
            // InternalMontiArcAndCore.g:5308:2: ( rule__Transition__Group_3__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_3()); 
            // InternalMontiArcAndCore.g:5309:2: ( rule__Transition__Group_3__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==39) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMontiArcAndCore.g:5309:3: rule__Transition__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__4"
    // InternalMontiArcAndCore.g:5317:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5321:1: ( rule__Transition__Group__4__Impl )
            // InternalMontiArcAndCore.g:5322:2: rule__Transition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__4__Impl();

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
    // $ANTLR end "rule__Transition__Group__4"


    // $ANTLR start "rule__Transition__Group__4__Impl"
    // InternalMontiArcAndCore.g:5328:1: rule__Transition__Group__4__Impl : ( ';' ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5332:1: ( ( ';' ) )
            // InternalMontiArcAndCore.g:5333:1: ( ';' )
            {
            // InternalMontiArcAndCore.g:5333:1: ( ';' )
            // InternalMontiArcAndCore.g:5334:2: ';'
            {
             before(grammarAccess.getTransitionAccess().getSemicolonKeyword_4()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__Transition__Group__4__Impl"


    // $ANTLR start "rule__Transition__Group_1__0"
    // InternalMontiArcAndCore.g:5344:1: rule__Transition__Group_1__0 : rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1 ;
    public final void rule__Transition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5348:1: ( rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1 )
            // InternalMontiArcAndCore.g:5349:2: rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Transition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_1__1();

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
    // $ANTLR end "rule__Transition__Group_1__0"


    // $ANTLR start "rule__Transition__Group_1__0__Impl"
    // InternalMontiArcAndCore.g:5356:1: rule__Transition__Group_1__0__Impl : ( '->' ) ;
    public final void rule__Transition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5360:1: ( ( '->' ) )
            // InternalMontiArcAndCore.g:5361:1: ( '->' )
            {
            // InternalMontiArcAndCore.g:5361:1: ( '->' )
            // InternalMontiArcAndCore.g:5362:2: '->'
            {
             before(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1_0()); 

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
    // $ANTLR end "rule__Transition__Group_1__0__Impl"


    // $ANTLR start "rule__Transition__Group_1__1"
    // InternalMontiArcAndCore.g:5371:1: rule__Transition__Group_1__1 : rule__Transition__Group_1__1__Impl ;
    public final void rule__Transition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5375:1: ( rule__Transition__Group_1__1__Impl )
            // InternalMontiArcAndCore.g:5376:2: rule__Transition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_1__1__Impl();

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
    // $ANTLR end "rule__Transition__Group_1__1"


    // $ANTLR start "rule__Transition__Group_1__1__Impl"
    // InternalMontiArcAndCore.g:5382:1: rule__Transition__Group_1__1__Impl : ( ( rule__Transition__TargetAssignment_1_1 ) ) ;
    public final void rule__Transition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5386:1: ( ( ( rule__Transition__TargetAssignment_1_1 ) ) )
            // InternalMontiArcAndCore.g:5387:1: ( ( rule__Transition__TargetAssignment_1_1 ) )
            {
            // InternalMontiArcAndCore.g:5387:1: ( ( rule__Transition__TargetAssignment_1_1 ) )
            // InternalMontiArcAndCore.g:5388:2: ( rule__Transition__TargetAssignment_1_1 )
            {
             before(grammarAccess.getTransitionAccess().getTargetAssignment_1_1()); 
            // InternalMontiArcAndCore.g:5389:2: ( rule__Transition__TargetAssignment_1_1 )
            // InternalMontiArcAndCore.g:5389:3: rule__Transition__TargetAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__TargetAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getTargetAssignment_1_1()); 

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
    // $ANTLR end "rule__Transition__Group_1__1__Impl"


    // $ANTLR start "rule__Transition__Group_2__0"
    // InternalMontiArcAndCore.g:5398:1: rule__Transition__Group_2__0 : rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1 ;
    public final void rule__Transition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5402:1: ( rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1 )
            // InternalMontiArcAndCore.g:5403:2: rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__Transition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_2__1();

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
    // $ANTLR end "rule__Transition__Group_2__0"


    // $ANTLR start "rule__Transition__Group_2__0__Impl"
    // InternalMontiArcAndCore.g:5410:1: rule__Transition__Group_2__0__Impl : ( '[' ) ;
    public final void rule__Transition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5414:1: ( ( '[' ) )
            // InternalMontiArcAndCore.g:5415:1: ( '[' )
            {
            // InternalMontiArcAndCore.g:5415:1: ( '[' )
            // InternalMontiArcAndCore.g:5416:2: '['
            {
             before(grammarAccess.getTransitionAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getLeftSquareBracketKeyword_2_0()); 

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
    // $ANTLR end "rule__Transition__Group_2__0__Impl"


    // $ANTLR start "rule__Transition__Group_2__1"
    // InternalMontiArcAndCore.g:5425:1: rule__Transition__Group_2__1 : rule__Transition__Group_2__1__Impl rule__Transition__Group_2__2 ;
    public final void rule__Transition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5429:1: ( rule__Transition__Group_2__1__Impl rule__Transition__Group_2__2 )
            // InternalMontiArcAndCore.g:5430:2: rule__Transition__Group_2__1__Impl rule__Transition__Group_2__2
            {
            pushFollow(FOLLOW_12);
            rule__Transition__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_2__2();

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
    // $ANTLR end "rule__Transition__Group_2__1"


    // $ANTLR start "rule__Transition__Group_2__1__Impl"
    // InternalMontiArcAndCore.g:5437:1: rule__Transition__Group_2__1__Impl : ( ( rule__Transition__ExpressionAssignment_2_1 ) ) ;
    public final void rule__Transition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5441:1: ( ( ( rule__Transition__ExpressionAssignment_2_1 ) ) )
            // InternalMontiArcAndCore.g:5442:1: ( ( rule__Transition__ExpressionAssignment_2_1 ) )
            {
            // InternalMontiArcAndCore.g:5442:1: ( ( rule__Transition__ExpressionAssignment_2_1 ) )
            // InternalMontiArcAndCore.g:5443:2: ( rule__Transition__ExpressionAssignment_2_1 )
            {
             before(grammarAccess.getTransitionAccess().getExpressionAssignment_2_1()); 
            // InternalMontiArcAndCore.g:5444:2: ( rule__Transition__ExpressionAssignment_2_1 )
            // InternalMontiArcAndCore.g:5444:3: rule__Transition__ExpressionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__ExpressionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getExpressionAssignment_2_1()); 

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
    // $ANTLR end "rule__Transition__Group_2__1__Impl"


    // $ANTLR start "rule__Transition__Group_2__2"
    // InternalMontiArcAndCore.g:5452:1: rule__Transition__Group_2__2 : rule__Transition__Group_2__2__Impl ;
    public final void rule__Transition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5456:1: ( rule__Transition__Group_2__2__Impl )
            // InternalMontiArcAndCore.g:5457:2: rule__Transition__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_2__2__Impl();

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
    // $ANTLR end "rule__Transition__Group_2__2"


    // $ANTLR start "rule__Transition__Group_2__2__Impl"
    // InternalMontiArcAndCore.g:5463:1: rule__Transition__Group_2__2__Impl : ( ']' ) ;
    public final void rule__Transition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5467:1: ( ( ']' ) )
            // InternalMontiArcAndCore.g:5468:1: ( ']' )
            {
            // InternalMontiArcAndCore.g:5468:1: ( ']' )
            // InternalMontiArcAndCore.g:5469:2: ']'
            {
             before(grammarAccess.getTransitionAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getRightSquareBracketKeyword_2_2()); 

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
    // $ANTLR end "rule__Transition__Group_2__2__Impl"


    // $ANTLR start "rule__Transition__Group_3__0"
    // InternalMontiArcAndCore.g:5479:1: rule__Transition__Group_3__0 : rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1 ;
    public final void rule__Transition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5483:1: ( rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1 )
            // InternalMontiArcAndCore.g:5484:2: rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1
            {
            pushFollow(FOLLOW_20);
            rule__Transition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_3__1();

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
    // $ANTLR end "rule__Transition__Group_3__0"


    // $ANTLR start "rule__Transition__Group_3__0__Impl"
    // InternalMontiArcAndCore.g:5491:1: rule__Transition__Group_3__0__Impl : ( '/' ) ;
    public final void rule__Transition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5495:1: ( ( '/' ) )
            // InternalMontiArcAndCore.g:5496:1: ( '/' )
            {
            // InternalMontiArcAndCore.g:5496:1: ( '/' )
            // InternalMontiArcAndCore.g:5497:2: '/'
            {
             before(grammarAccess.getTransitionAccess().getSolidusKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getSolidusKeyword_3_0()); 

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
    // $ANTLR end "rule__Transition__Group_3__0__Impl"


    // $ANTLR start "rule__Transition__Group_3__1"
    // InternalMontiArcAndCore.g:5506:1: rule__Transition__Group_3__1 : rule__Transition__Group_3__1__Impl ;
    public final void rule__Transition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5510:1: ( rule__Transition__Group_3__1__Impl )
            // InternalMontiArcAndCore.g:5511:2: rule__Transition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_3__1__Impl();

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
    // $ANTLR end "rule__Transition__Group_3__1"


    // $ANTLR start "rule__Transition__Group_3__1__Impl"
    // InternalMontiArcAndCore.g:5517:1: rule__Transition__Group_3__1__Impl : ( ( rule__Transition__ReactionAssignment_3_1 ) ) ;
    public final void rule__Transition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5521:1: ( ( ( rule__Transition__ReactionAssignment_3_1 ) ) )
            // InternalMontiArcAndCore.g:5522:1: ( ( rule__Transition__ReactionAssignment_3_1 ) )
            {
            // InternalMontiArcAndCore.g:5522:1: ( ( rule__Transition__ReactionAssignment_3_1 ) )
            // InternalMontiArcAndCore.g:5523:2: ( rule__Transition__ReactionAssignment_3_1 )
            {
             before(grammarAccess.getTransitionAccess().getReactionAssignment_3_1()); 
            // InternalMontiArcAndCore.g:5524:2: ( rule__Transition__ReactionAssignment_3_1 )
            // InternalMontiArcAndCore.g:5524:3: rule__Transition__ReactionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__ReactionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getReactionAssignment_3_1()); 

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
    // $ANTLR end "rule__Transition__Group_3__1__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // InternalMontiArcAndCore.g:5533:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5537:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalMontiArcAndCore.g:5538:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__1();

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
    // $ANTLR end "rule__Block__Group__0"


    // $ANTLR start "rule__Block__Group__0__Impl"
    // InternalMontiArcAndCore.g:5545:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5549:1: ( ( () ) )
            // InternalMontiArcAndCore.g:5550:1: ( () )
            {
            // InternalMontiArcAndCore.g:5550:1: ( () )
            // InternalMontiArcAndCore.g:5551:2: ()
            {
             before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            // InternalMontiArcAndCore.g:5552:2: ()
            // InternalMontiArcAndCore.g:5552:3: 
            {
            }

             after(grammarAccess.getBlockAccess().getBlockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // InternalMontiArcAndCore.g:5560:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5564:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalMontiArcAndCore.g:5565:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__Block__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__2();

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
    // $ANTLR end "rule__Block__Group__1"


    // $ANTLR start "rule__Block__Group__1__Impl"
    // InternalMontiArcAndCore.g:5572:1: rule__Block__Group__1__Impl : ( '{' ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5576:1: ( ( '{' ) )
            // InternalMontiArcAndCore.g:5577:1: ( '{' )
            {
            // InternalMontiArcAndCore.g:5577:1: ( '{' )
            // InternalMontiArcAndCore.g:5578:2: '{'
            {
             before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Block__Group__1__Impl"


    // $ANTLR start "rule__Block__Group__2"
    // InternalMontiArcAndCore.g:5587:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5591:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalMontiArcAndCore.g:5592:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_47);
            rule__Block__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__3();

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
    // $ANTLR end "rule__Block__Group__2"


    // $ANTLR start "rule__Block__Group__2__Impl"
    // InternalMontiArcAndCore.g:5599:1: rule__Block__Group__2__Impl : ( ( rule__Block__BlocksAssignment_2 )* ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5603:1: ( ( ( rule__Block__BlocksAssignment_2 )* ) )
            // InternalMontiArcAndCore.g:5604:1: ( ( rule__Block__BlocksAssignment_2 )* )
            {
            // InternalMontiArcAndCore.g:5604:1: ( ( rule__Block__BlocksAssignment_2 )* )
            // InternalMontiArcAndCore.g:5605:2: ( rule__Block__BlocksAssignment_2 )*
            {
             before(grammarAccess.getBlockAccess().getBlocksAssignment_2()); 
            // InternalMontiArcAndCore.g:5606:2: ( rule__Block__BlocksAssignment_2 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=RULE_MCQUALIFIEDNAME && LA52_0<=RULE_ID)||(LA52_0>=RULE_INT && LA52_0<=RULE_STRING)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalMontiArcAndCore.g:5606:3: rule__Block__BlocksAssignment_2
            	    {
            	    pushFollow(FOLLOW_48);
            	    rule__Block__BlocksAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

             after(grammarAccess.getBlockAccess().getBlocksAssignment_2()); 

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
    // $ANTLR end "rule__Block__Group__2__Impl"


    // $ANTLR start "rule__Block__Group__3"
    // InternalMontiArcAndCore.g:5614:1: rule__Block__Group__3 : rule__Block__Group__3__Impl ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5618:1: ( rule__Block__Group__3__Impl )
            // InternalMontiArcAndCore.g:5619:2: rule__Block__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__3__Impl();

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
    // $ANTLR end "rule__Block__Group__3"


    // $ANTLR start "rule__Block__Group__3__Impl"
    // InternalMontiArcAndCore.g:5625:1: rule__Block__Group__3__Impl : ( '}' ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5629:1: ( ( '}' ) )
            // InternalMontiArcAndCore.g:5630:1: ( '}' )
            {
            // InternalMontiArcAndCore.g:5630:1: ( '}' )
            // InternalMontiArcAndCore.g:5631:2: '}'
            {
             before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Block__Group__3__Impl"


    // $ANTLR start "rule__SimpleExpression__Group__0"
    // InternalMontiArcAndCore.g:5641:1: rule__SimpleExpression__Group__0 : rule__SimpleExpression__Group__0__Impl rule__SimpleExpression__Group__1 ;
    public final void rule__SimpleExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5645:1: ( rule__SimpleExpression__Group__0__Impl rule__SimpleExpression__Group__1 )
            // InternalMontiArcAndCore.g:5646:2: rule__SimpleExpression__Group__0__Impl rule__SimpleExpression__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__SimpleExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleExpression__Group__1();

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
    // $ANTLR end "rule__SimpleExpression__Group__0"


    // $ANTLR start "rule__SimpleExpression__Group__0__Impl"
    // InternalMontiArcAndCore.g:5653:1: rule__SimpleExpression__Group__0__Impl : ( ( rule__SimpleExpression__ExpressionAssignment_0 ) ) ;
    public final void rule__SimpleExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5657:1: ( ( ( rule__SimpleExpression__ExpressionAssignment_0 ) ) )
            // InternalMontiArcAndCore.g:5658:1: ( ( rule__SimpleExpression__ExpressionAssignment_0 ) )
            {
            // InternalMontiArcAndCore.g:5658:1: ( ( rule__SimpleExpression__ExpressionAssignment_0 ) )
            // InternalMontiArcAndCore.g:5659:2: ( rule__SimpleExpression__ExpressionAssignment_0 )
            {
             before(grammarAccess.getSimpleExpressionAccess().getExpressionAssignment_0()); 
            // InternalMontiArcAndCore.g:5660:2: ( rule__SimpleExpression__ExpressionAssignment_0 )
            // InternalMontiArcAndCore.g:5660:3: rule__SimpleExpression__ExpressionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleExpression__ExpressionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleExpressionAccess().getExpressionAssignment_0()); 

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
    // $ANTLR end "rule__SimpleExpression__Group__0__Impl"


    // $ANTLR start "rule__SimpleExpression__Group__1"
    // InternalMontiArcAndCore.g:5668:1: rule__SimpleExpression__Group__1 : rule__SimpleExpression__Group__1__Impl ;
    public final void rule__SimpleExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5672:1: ( rule__SimpleExpression__Group__1__Impl )
            // InternalMontiArcAndCore.g:5673:2: rule__SimpleExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleExpression__Group__1__Impl();

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
    // $ANTLR end "rule__SimpleExpression__Group__1"


    // $ANTLR start "rule__SimpleExpression__Group__1__Impl"
    // InternalMontiArcAndCore.g:5679:1: rule__SimpleExpression__Group__1__Impl : ( ';' ) ;
    public final void rule__SimpleExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5683:1: ( ( ';' ) )
            // InternalMontiArcAndCore.g:5684:1: ( ';' )
            {
            // InternalMontiArcAndCore.g:5684:1: ( ';' )
            // InternalMontiArcAndCore.g:5685:2: ';'
            {
             before(grammarAccess.getSimpleExpressionAccess().getSemicolonKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSimpleExpressionAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end "rule__SimpleExpression__Group__1__Impl"


    // $ANTLR start "rule__SimpleInit__Group__0"
    // InternalMontiArcAndCore.g:5695:1: rule__SimpleInit__Group__0 : rule__SimpleInit__Group__0__Impl rule__SimpleInit__Group__1 ;
    public final void rule__SimpleInit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5699:1: ( rule__SimpleInit__Group__0__Impl rule__SimpleInit__Group__1 )
            // InternalMontiArcAndCore.g:5700:2: rule__SimpleInit__Group__0__Impl rule__SimpleInit__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__SimpleInit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleInit__Group__1();

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
    // $ANTLR end "rule__SimpleInit__Group__0"


    // $ANTLR start "rule__SimpleInit__Group__0__Impl"
    // InternalMontiArcAndCore.g:5707:1: rule__SimpleInit__Group__0__Impl : ( ( rule__SimpleInit__NameAssignment_0 ) ) ;
    public final void rule__SimpleInit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5711:1: ( ( ( rule__SimpleInit__NameAssignment_0 ) ) )
            // InternalMontiArcAndCore.g:5712:1: ( ( rule__SimpleInit__NameAssignment_0 ) )
            {
            // InternalMontiArcAndCore.g:5712:1: ( ( rule__SimpleInit__NameAssignment_0 ) )
            // InternalMontiArcAndCore.g:5713:2: ( rule__SimpleInit__NameAssignment_0 )
            {
             before(grammarAccess.getSimpleInitAccess().getNameAssignment_0()); 
            // InternalMontiArcAndCore.g:5714:2: ( rule__SimpleInit__NameAssignment_0 )
            // InternalMontiArcAndCore.g:5714:3: rule__SimpleInit__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleInit__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleInitAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__SimpleInit__Group__0__Impl"


    // $ANTLR start "rule__SimpleInit__Group__1"
    // InternalMontiArcAndCore.g:5722:1: rule__SimpleInit__Group__1 : rule__SimpleInit__Group__1__Impl rule__SimpleInit__Group__2 ;
    public final void rule__SimpleInit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5726:1: ( rule__SimpleInit__Group__1__Impl rule__SimpleInit__Group__2 )
            // InternalMontiArcAndCore.g:5727:2: rule__SimpleInit__Group__1__Impl rule__SimpleInit__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__SimpleInit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleInit__Group__2();

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
    // $ANTLR end "rule__SimpleInit__Group__1"


    // $ANTLR start "rule__SimpleInit__Group__1__Impl"
    // InternalMontiArcAndCore.g:5734:1: rule__SimpleInit__Group__1__Impl : ( '=' ) ;
    public final void rule__SimpleInit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5738:1: ( ( '=' ) )
            // InternalMontiArcAndCore.g:5739:1: ( '=' )
            {
            // InternalMontiArcAndCore.g:5739:1: ( '=' )
            // InternalMontiArcAndCore.g:5740:2: '='
            {
             before(grammarAccess.getSimpleInitAccess().getEqualsSignKeyword_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getSimpleInitAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__SimpleInit__Group__1__Impl"


    // $ANTLR start "rule__SimpleInit__Group__2"
    // InternalMontiArcAndCore.g:5749:1: rule__SimpleInit__Group__2 : rule__SimpleInit__Group__2__Impl rule__SimpleInit__Group__3 ;
    public final void rule__SimpleInit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5753:1: ( rule__SimpleInit__Group__2__Impl rule__SimpleInit__Group__3 )
            // InternalMontiArcAndCore.g:5754:2: rule__SimpleInit__Group__2__Impl rule__SimpleInit__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__SimpleInit__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleInit__Group__3();

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
    // $ANTLR end "rule__SimpleInit__Group__2"


    // $ANTLR start "rule__SimpleInit__Group__2__Impl"
    // InternalMontiArcAndCore.g:5761:1: rule__SimpleInit__Group__2__Impl : ( ( rule__SimpleInit__ExpressionsAssignment_2 ) ) ;
    public final void rule__SimpleInit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5765:1: ( ( ( rule__SimpleInit__ExpressionsAssignment_2 ) ) )
            // InternalMontiArcAndCore.g:5766:1: ( ( rule__SimpleInit__ExpressionsAssignment_2 ) )
            {
            // InternalMontiArcAndCore.g:5766:1: ( ( rule__SimpleInit__ExpressionsAssignment_2 ) )
            // InternalMontiArcAndCore.g:5767:2: ( rule__SimpleInit__ExpressionsAssignment_2 )
            {
             before(grammarAccess.getSimpleInitAccess().getExpressionsAssignment_2()); 
            // InternalMontiArcAndCore.g:5768:2: ( rule__SimpleInit__ExpressionsAssignment_2 )
            // InternalMontiArcAndCore.g:5768:3: rule__SimpleInit__ExpressionsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SimpleInit__ExpressionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSimpleInitAccess().getExpressionsAssignment_2()); 

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
    // $ANTLR end "rule__SimpleInit__Group__2__Impl"


    // $ANTLR start "rule__SimpleInit__Group__3"
    // InternalMontiArcAndCore.g:5776:1: rule__SimpleInit__Group__3 : rule__SimpleInit__Group__3__Impl ;
    public final void rule__SimpleInit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5780:1: ( rule__SimpleInit__Group__3__Impl )
            // InternalMontiArcAndCore.g:5781:2: rule__SimpleInit__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleInit__Group__3__Impl();

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
    // $ANTLR end "rule__SimpleInit__Group__3"


    // $ANTLR start "rule__SimpleInit__Group__3__Impl"
    // InternalMontiArcAndCore.g:5787:1: rule__SimpleInit__Group__3__Impl : ( ';' ) ;
    public final void rule__SimpleInit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5791:1: ( ( ';' ) )
            // InternalMontiArcAndCore.g:5792:1: ( ';' )
            {
            // InternalMontiArcAndCore.g:5792:1: ( ';' )
            // InternalMontiArcAndCore.g:5793:2: ';'
            {
             before(grammarAccess.getSimpleInitAccess().getSemicolonKeyword_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSimpleInitAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__SimpleInit__Group__3__Impl"


    // $ANTLR start "rule__MontiArcAndCore__ClassdiagramAssignment_0"
    // InternalMontiArcAndCore.g:5803:1: rule__MontiArcAndCore__ClassdiagramAssignment_0 : ( ruleClassDiagramCompilationUnit ) ;
    public final void rule__MontiArcAndCore__ClassdiagramAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5807:1: ( ( ruleClassDiagramCompilationUnit ) )
            // InternalMontiArcAndCore.g:5808:2: ( ruleClassDiagramCompilationUnit )
            {
            // InternalMontiArcAndCore.g:5808:2: ( ruleClassDiagramCompilationUnit )
            // InternalMontiArcAndCore.g:5809:3: ruleClassDiagramCompilationUnit
            {
             before(grammarAccess.getMontiArcAndCoreAccess().getClassdiagramClassDiagramCompilationUnitParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleClassDiagramCompilationUnit();

            state._fsp--;

             after(grammarAccess.getMontiArcAndCoreAccess().getClassdiagramClassDiagramCompilationUnitParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__MontiArcAndCore__ClassdiagramAssignment_0"


    // $ANTLR start "rule__MontiArcAndCore__MontiarcdslAssignment_1"
    // InternalMontiArcAndCore.g:5818:1: rule__MontiArcAndCore__MontiarcdslAssignment_1 : ( ruleMACompilationUnit ) ;
    public final void rule__MontiArcAndCore__MontiarcdslAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5822:1: ( ( ruleMACompilationUnit ) )
            // InternalMontiArcAndCore.g:5823:2: ( ruleMACompilationUnit )
            {
            // InternalMontiArcAndCore.g:5823:2: ( ruleMACompilationUnit )
            // InternalMontiArcAndCore.g:5824:3: ruleMACompilationUnit
            {
             before(grammarAccess.getMontiArcAndCoreAccess().getMontiarcdslMACompilationUnitParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMACompilationUnit();

            state._fsp--;

             after(grammarAccess.getMontiArcAndCoreAccess().getMontiarcdslMACompilationUnitParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__MontiArcAndCore__MontiarcdslAssignment_1"


    // $ANTLR start "rule__ImportStatements__ImportUriAssignment_1"
    // InternalMontiArcAndCore.g:5833:1: rule__ImportStatements__ImportUriAssignment_1 : ( RULE_MCQUALIFIEDNAME ) ;
    public final void rule__ImportStatements__ImportUriAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5837:1: ( ( RULE_MCQUALIFIEDNAME ) )
            // InternalMontiArcAndCore.g:5838:2: ( RULE_MCQUALIFIEDNAME )
            {
            // InternalMontiArcAndCore.g:5838:2: ( RULE_MCQUALIFIEDNAME )
            // InternalMontiArcAndCore.g:5839:3: RULE_MCQUALIFIEDNAME
            {
             before(grammarAccess.getImportStatementsAccess().getImportUriMCQUALIFIEDNAMETerminalRuleCall_1_0()); 
            match(input,RULE_MCQUALIFIEDNAME,FOLLOW_2); 
             after(grammarAccess.getImportStatementsAccess().getImportUriMCQUALIFIEDNAMETerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ImportStatements__ImportUriAssignment_1"


    // $ANTLR start "rule__ImportStatements__StarAssignment_2"
    // InternalMontiArcAndCore.g:5848:1: rule__ImportStatements__StarAssignment_2 : ( RULE_DOTSTAR ) ;
    public final void rule__ImportStatements__StarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5852:1: ( ( RULE_DOTSTAR ) )
            // InternalMontiArcAndCore.g:5853:2: ( RULE_DOTSTAR )
            {
            // InternalMontiArcAndCore.g:5853:2: ( RULE_DOTSTAR )
            // InternalMontiArcAndCore.g:5854:3: RULE_DOTSTAR
            {
             before(grammarAccess.getImportStatementsAccess().getStarDOTSTARTerminalRuleCall_2_0()); 
            match(input,RULE_DOTSTAR,FOLLOW_2); 
             after(grammarAccess.getImportStatementsAccess().getStarDOTSTARTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ImportStatements__StarAssignment_2"


    // $ANTLR start "rule__Package__NameAssignment_1"
    // InternalMontiArcAndCore.g:5863:1: rule__Package__NameAssignment_1 : ( ( rule__Package__NameAlternatives_1_0 ) ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5867:1: ( ( ( rule__Package__NameAlternatives_1_0 ) ) )
            // InternalMontiArcAndCore.g:5868:2: ( ( rule__Package__NameAlternatives_1_0 ) )
            {
            // InternalMontiArcAndCore.g:5868:2: ( ( rule__Package__NameAlternatives_1_0 ) )
            // InternalMontiArcAndCore.g:5869:3: ( rule__Package__NameAlternatives_1_0 )
            {
             before(grammarAccess.getPackageAccess().getNameAlternatives_1_0()); 
            // InternalMontiArcAndCore.g:5870:3: ( rule__Package__NameAlternatives_1_0 )
            // InternalMontiArcAndCore.g:5870:4: rule__Package__NameAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Package__NameAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getNameAlternatives_1_0()); 

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
    // $ANTLR end "rule__Package__NameAssignment_1"


    // $ANTLR start "rule__MCPrimitiveType__TypeAssignment"
    // InternalMontiArcAndCore.g:5878:1: rule__MCPrimitiveType__TypeAssignment : ( ( rule__MCPrimitiveType__TypeAlternatives_0 ) ) ;
    public final void rule__MCPrimitiveType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5882:1: ( ( ( rule__MCPrimitiveType__TypeAlternatives_0 ) ) )
            // InternalMontiArcAndCore.g:5883:2: ( ( rule__MCPrimitiveType__TypeAlternatives_0 ) )
            {
            // InternalMontiArcAndCore.g:5883:2: ( ( rule__MCPrimitiveType__TypeAlternatives_0 ) )
            // InternalMontiArcAndCore.g:5884:3: ( rule__MCPrimitiveType__TypeAlternatives_0 )
            {
             before(grammarAccess.getMCPrimitiveTypeAccess().getTypeAlternatives_0()); 
            // InternalMontiArcAndCore.g:5885:3: ( rule__MCPrimitiveType__TypeAlternatives_0 )
            // InternalMontiArcAndCore.g:5885:4: rule__MCPrimitiveType__TypeAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__MCPrimitiveType__TypeAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getMCPrimitiveTypeAccess().getTypeAlternatives_0()); 

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
    // $ANTLR end "rule__MCPrimitiveType__TypeAssignment"


    // $ANTLR start "rule__MCObjectType__TypeAssignment"
    // InternalMontiArcAndCore.g:5893:1: rule__MCObjectType__TypeAssignment : ( ( rule__MCObjectType__TypeAlternatives_0 ) ) ;
    public final void rule__MCObjectType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5897:1: ( ( ( rule__MCObjectType__TypeAlternatives_0 ) ) )
            // InternalMontiArcAndCore.g:5898:2: ( ( rule__MCObjectType__TypeAlternatives_0 ) )
            {
            // InternalMontiArcAndCore.g:5898:2: ( ( rule__MCObjectType__TypeAlternatives_0 ) )
            // InternalMontiArcAndCore.g:5899:3: ( rule__MCObjectType__TypeAlternatives_0 )
            {
             before(grammarAccess.getMCObjectTypeAccess().getTypeAlternatives_0()); 
            // InternalMontiArcAndCore.g:5900:3: ( rule__MCObjectType__TypeAlternatives_0 )
            // InternalMontiArcAndCore.g:5900:4: rule__MCObjectType__TypeAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__MCObjectType__TypeAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getMCObjectTypeAccess().getTypeAlternatives_0()); 

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
    // $ANTLR end "rule__MCObjectType__TypeAssignment"


    // $ANTLR start "rule__MCCollectionType__CollectionAssignment_0"
    // InternalMontiArcAndCore.g:5908:1: rule__MCCollectionType__CollectionAssignment_0 : ( ( rule__MCCollectionType__CollectionAlternatives_0_0 ) ) ;
    public final void rule__MCCollectionType__CollectionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5912:1: ( ( ( rule__MCCollectionType__CollectionAlternatives_0_0 ) ) )
            // InternalMontiArcAndCore.g:5913:2: ( ( rule__MCCollectionType__CollectionAlternatives_0_0 ) )
            {
            // InternalMontiArcAndCore.g:5913:2: ( ( rule__MCCollectionType__CollectionAlternatives_0_0 ) )
            // InternalMontiArcAndCore.g:5914:3: ( rule__MCCollectionType__CollectionAlternatives_0_0 )
            {
             before(grammarAccess.getMCCollectionTypeAccess().getCollectionAlternatives_0_0()); 
            // InternalMontiArcAndCore.g:5915:3: ( rule__MCCollectionType__CollectionAlternatives_0_0 )
            // InternalMontiArcAndCore.g:5915:4: rule__MCCollectionType__CollectionAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__MCCollectionType__CollectionAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getMCCollectionTypeAccess().getCollectionAlternatives_0_0()); 

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
    // $ANTLR end "rule__MCCollectionType__CollectionAssignment_0"


    // $ANTLR start "rule__MCCollectionType__InnerTypeAssignment_2"
    // InternalMontiArcAndCore.g:5923:1: rule__MCCollectionType__InnerTypeAssignment_2 : ( ruleType ) ;
    public final void rule__MCCollectionType__InnerTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5927:1: ( ( ruleType ) )
            // InternalMontiArcAndCore.g:5928:2: ( ruleType )
            {
            // InternalMontiArcAndCore.g:5928:2: ( ruleType )
            // InternalMontiArcAndCore.g:5929:3: ruleType
            {
             before(grammarAccess.getMCCollectionTypeAccess().getInnerTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getMCCollectionTypeAccess().getInnerTypeTypeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__MCCollectionType__InnerTypeAssignment_2"


    // $ANTLR start "rule__NumberLiteral__LiteralAssignment"
    // InternalMontiArcAndCore.g:5938:1: rule__NumberLiteral__LiteralAssignment : ( RULE_INT ) ;
    public final void rule__NumberLiteral__LiteralAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5942:1: ( ( RULE_INT ) )
            // InternalMontiArcAndCore.g:5943:2: ( RULE_INT )
            {
            // InternalMontiArcAndCore.g:5943:2: ( RULE_INT )
            // InternalMontiArcAndCore.g:5944:3: RULE_INT
            {
             before(grammarAccess.getNumberLiteralAccess().getLiteralINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberLiteralAccess().getLiteralINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__NumberLiteral__LiteralAssignment"


    // $ANTLR start "rule__StringLiteral__LiteralAssignment"
    // InternalMontiArcAndCore.g:5953:1: rule__StringLiteral__LiteralAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__LiteralAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5957:1: ( ( RULE_STRING ) )
            // InternalMontiArcAndCore.g:5958:2: ( RULE_STRING )
            {
            // InternalMontiArcAndCore.g:5958:2: ( RULE_STRING )
            // InternalMontiArcAndCore.g:5959:3: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getLiteralSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringLiteralAccess().getLiteralSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__StringLiteral__LiteralAssignment"


    // $ANTLR start "rule__NameExpression__NameAssignment_0"
    // InternalMontiArcAndCore.g:5968:1: rule__NameExpression__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__NameExpression__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5972:1: ( ( RULE_ID ) )
            // InternalMontiArcAndCore.g:5973:2: ( RULE_ID )
            {
            // InternalMontiArcAndCore.g:5973:2: ( RULE_ID )
            // InternalMontiArcAndCore.g:5974:3: RULE_ID
            {
             before(grammarAccess.getNameExpressionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNameExpressionAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__NameExpression__NameAssignment_0"


    // $ANTLR start "rule__NameExpression__QualifiednameAssignment_1"
    // InternalMontiArcAndCore.g:5983:1: rule__NameExpression__QualifiednameAssignment_1 : ( RULE_MCQUALIFIEDNAME ) ;
    public final void rule__NameExpression__QualifiednameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:5987:1: ( ( RULE_MCQUALIFIEDNAME ) )
            // InternalMontiArcAndCore.g:5988:2: ( RULE_MCQUALIFIEDNAME )
            {
            // InternalMontiArcAndCore.g:5988:2: ( RULE_MCQUALIFIEDNAME )
            // InternalMontiArcAndCore.g:5989:3: RULE_MCQUALIFIEDNAME
            {
             before(grammarAccess.getNameExpressionAccess().getQualifiednameMCQUALIFIEDNAMETerminalRuleCall_1_0()); 
            match(input,RULE_MCQUALIFIEDNAME,FOLLOW_2); 
             after(grammarAccess.getNameExpressionAccess().getQualifiednameMCQUALIFIEDNAMETerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__NameExpression__QualifiednameAssignment_1"


    // $ANTLR start "rule__BinaryExpression__Literal1Assignment_0"
    // InternalMontiArcAndCore.g:5998:1: rule__BinaryExpression__Literal1Assignment_0 : ( ( rule__BinaryExpression__Literal1Alternatives_0_0 ) ) ;
    public final void rule__BinaryExpression__Literal1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6002:1: ( ( ( rule__BinaryExpression__Literal1Alternatives_0_0 ) ) )
            // InternalMontiArcAndCore.g:6003:2: ( ( rule__BinaryExpression__Literal1Alternatives_0_0 ) )
            {
            // InternalMontiArcAndCore.g:6003:2: ( ( rule__BinaryExpression__Literal1Alternatives_0_0 ) )
            // InternalMontiArcAndCore.g:6004:3: ( rule__BinaryExpression__Literal1Alternatives_0_0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getLiteral1Alternatives_0_0()); 
            // InternalMontiArcAndCore.g:6005:3: ( rule__BinaryExpression__Literal1Alternatives_0_0 )
            // InternalMontiArcAndCore.g:6005:4: rule__BinaryExpression__Literal1Alternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Literal1Alternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExpressionAccess().getLiteral1Alternatives_0_0()); 

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
    // $ANTLR end "rule__BinaryExpression__Literal1Assignment_0"


    // $ANTLR start "rule__BinaryExpression__OpAssignment_1"
    // InternalMontiArcAndCore.g:6013:1: rule__BinaryExpression__OpAssignment_1 : ( ruleOperator ) ;
    public final void rule__BinaryExpression__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6017:1: ( ( ruleOperator ) )
            // InternalMontiArcAndCore.g:6018:2: ( ruleOperator )
            {
            // InternalMontiArcAndCore.g:6018:2: ( ruleOperator )
            // InternalMontiArcAndCore.g:6019:3: ruleOperator
            {
             before(grammarAccess.getBinaryExpressionAccess().getOpOperatorEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getBinaryExpressionAccess().getOpOperatorEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__BinaryExpression__OpAssignment_1"


    // $ANTLR start "rule__BinaryExpression__Literal2Assignment_2"
    // InternalMontiArcAndCore.g:6028:1: rule__BinaryExpression__Literal2Assignment_2 : ( ( rule__BinaryExpression__Literal2Alternatives_2_0 ) ) ;
    public final void rule__BinaryExpression__Literal2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6032:1: ( ( ( rule__BinaryExpression__Literal2Alternatives_2_0 ) ) )
            // InternalMontiArcAndCore.g:6033:2: ( ( rule__BinaryExpression__Literal2Alternatives_2_0 ) )
            {
            // InternalMontiArcAndCore.g:6033:2: ( ( rule__BinaryExpression__Literal2Alternatives_2_0 ) )
            // InternalMontiArcAndCore.g:6034:3: ( rule__BinaryExpression__Literal2Alternatives_2_0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getLiteral2Alternatives_2_0()); 
            // InternalMontiArcAndCore.g:6035:3: ( rule__BinaryExpression__Literal2Alternatives_2_0 )
            // InternalMontiArcAndCore.g:6035:4: rule__BinaryExpression__Literal2Alternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Literal2Alternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExpressionAccess().getLiteral2Alternatives_2_0()); 

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
    // $ANTLR end "rule__BinaryExpression__Literal2Assignment_2"


    // $ANTLR start "rule__Arguments__ArgumentsAssignment_1"
    // InternalMontiArcAndCore.g:6043:1: rule__Arguments__ArgumentsAssignment_1 : ( ruleArgument ) ;
    public final void rule__Arguments__ArgumentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6047:1: ( ( ruleArgument ) )
            // InternalMontiArcAndCore.g:6048:2: ( ruleArgument )
            {
            // InternalMontiArcAndCore.g:6048:2: ( ruleArgument )
            // InternalMontiArcAndCore.g:6049:3: ruleArgument
            {
             before(grammarAccess.getArgumentsAccess().getArgumentsArgumentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getArgumentsAccess().getArgumentsArgumentParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Arguments__ArgumentsAssignment_1"


    // $ANTLR start "rule__Arguments__ArgumentsAssignment_2_1"
    // InternalMontiArcAndCore.g:6058:1: rule__Arguments__ArgumentsAssignment_2_1 : ( ruleArgument ) ;
    public final void rule__Arguments__ArgumentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6062:1: ( ( ruleArgument ) )
            // InternalMontiArcAndCore.g:6063:2: ( ruleArgument )
            {
            // InternalMontiArcAndCore.g:6063:2: ( ruleArgument )
            // InternalMontiArcAndCore.g:6064:3: ruleArgument
            {
             before(grammarAccess.getArgumentsAccess().getArgumentsArgumentParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getArgumentsAccess().getArgumentsArgumentParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Arguments__ArgumentsAssignment_2_1"


    // $ANTLR start "rule__Argument__NameAssignment_0"
    // InternalMontiArcAndCore.g:6073:1: rule__Argument__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Argument__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6077:1: ( ( RULE_ID ) )
            // InternalMontiArcAndCore.g:6078:2: ( RULE_ID )
            {
            // InternalMontiArcAndCore.g:6078:2: ( RULE_ID )
            // InternalMontiArcAndCore.g:6079:3: RULE_ID
            {
             before(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Argument__NameAssignment_0"


    // $ANTLR start "rule__Argument__ExpressionAssignment_1"
    // InternalMontiArcAndCore.g:6088:1: rule__Argument__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__Argument__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6092:1: ( ( ruleExpression ) )
            // InternalMontiArcAndCore.g:6093:2: ( ruleExpression )
            {
            // InternalMontiArcAndCore.g:6093:2: ( ruleExpression )
            // InternalMontiArcAndCore.g:6094:3: ruleExpression
            {
             before(grammarAccess.getArgumentAccess().getExpressionExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getArgumentAccess().getExpressionExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Argument__ExpressionAssignment_1"


    // $ANTLR start "rule__ClassDiagramCompilationUnit__PackageAssignment_0"
    // InternalMontiArcAndCore.g:6103:1: rule__ClassDiagramCompilationUnit__PackageAssignment_0 : ( rulePackage ) ;
    public final void rule__ClassDiagramCompilationUnit__PackageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6107:1: ( ( rulePackage ) )
            // InternalMontiArcAndCore.g:6108:2: ( rulePackage )
            {
            // InternalMontiArcAndCore.g:6108:2: ( rulePackage )
            // InternalMontiArcAndCore.g:6109:3: rulePackage
            {
             before(grammarAccess.getClassDiagramCompilationUnitAccess().getPackagePackageParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getClassDiagramCompilationUnitAccess().getPackagePackageParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ClassDiagramCompilationUnit__PackageAssignment_0"


    // $ANTLR start "rule__ClassDiagramCompilationUnit__ImportStatementsAssignment_1"
    // InternalMontiArcAndCore.g:6118:1: rule__ClassDiagramCompilationUnit__ImportStatementsAssignment_1 : ( ruleImportStatements ) ;
    public final void rule__ClassDiagramCompilationUnit__ImportStatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6122:1: ( ( ruleImportStatements ) )
            // InternalMontiArcAndCore.g:6123:2: ( ruleImportStatements )
            {
            // InternalMontiArcAndCore.g:6123:2: ( ruleImportStatements )
            // InternalMontiArcAndCore.g:6124:3: ruleImportStatements
            {
             before(grammarAccess.getClassDiagramCompilationUnitAccess().getImportStatementsImportStatementsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImportStatements();

            state._fsp--;

             after(grammarAccess.getClassDiagramCompilationUnitAccess().getImportStatementsImportStatementsParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ClassDiagramCompilationUnit__ImportStatementsAssignment_1"


    // $ANTLR start "rule__ClassDiagramCompilationUnit__DiagramAssignment_2"
    // InternalMontiArcAndCore.g:6133:1: rule__ClassDiagramCompilationUnit__DiagramAssignment_2 : ( ruleClassDiagram ) ;
    public final void rule__ClassDiagramCompilationUnit__DiagramAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6137:1: ( ( ruleClassDiagram ) )
            // InternalMontiArcAndCore.g:6138:2: ( ruleClassDiagram )
            {
            // InternalMontiArcAndCore.g:6138:2: ( ruleClassDiagram )
            // InternalMontiArcAndCore.g:6139:3: ruleClassDiagram
            {
             before(grammarAccess.getClassDiagramCompilationUnitAccess().getDiagramClassDiagramParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleClassDiagram();

            state._fsp--;

             after(grammarAccess.getClassDiagramCompilationUnitAccess().getDiagramClassDiagramParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ClassDiagramCompilationUnit__DiagramAssignment_2"


    // $ANTLR start "rule__ClassDiagram__NameAssignment_1"
    // InternalMontiArcAndCore.g:6148:1: rule__ClassDiagram__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ClassDiagram__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6152:1: ( ( RULE_ID ) )
            // InternalMontiArcAndCore.g:6153:2: ( RULE_ID )
            {
            // InternalMontiArcAndCore.g:6153:2: ( RULE_ID )
            // InternalMontiArcAndCore.g:6154:3: RULE_ID
            {
             before(grammarAccess.getClassDiagramAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassDiagramAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ClassDiagram__NameAssignment_1"


    // $ANTLR start "rule__ClassDiagram__CdElementsAssignment_3"
    // InternalMontiArcAndCore.g:6163:1: rule__ClassDiagram__CdElementsAssignment_3 : ( ruleCDDefinition ) ;
    public final void rule__ClassDiagram__CdElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6167:1: ( ( ruleCDDefinition ) )
            // InternalMontiArcAndCore.g:6168:2: ( ruleCDDefinition )
            {
            // InternalMontiArcAndCore.g:6168:2: ( ruleCDDefinition )
            // InternalMontiArcAndCore.g:6169:3: ruleCDDefinition
            {
             before(grammarAccess.getClassDiagramAccess().getCdElementsCDDefinitionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCDDefinition();

            state._fsp--;

             after(grammarAccess.getClassDiagramAccess().getCdElementsCDDefinitionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ClassDiagram__CdElementsAssignment_3"


    // $ANTLR start "rule__CDClass__PublicAssignment_0"
    // InternalMontiArcAndCore.g:6178:1: rule__CDClass__PublicAssignment_0 : ( ( 'public' ) ) ;
    public final void rule__CDClass__PublicAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6182:1: ( ( ( 'public' ) ) )
            // InternalMontiArcAndCore.g:6183:2: ( ( 'public' ) )
            {
            // InternalMontiArcAndCore.g:6183:2: ( ( 'public' ) )
            // InternalMontiArcAndCore.g:6184:3: ( 'public' )
            {
             before(grammarAccess.getCDClassAccess().getPublicPublicKeyword_0_0()); 
            // InternalMontiArcAndCore.g:6185:3: ( 'public' )
            // InternalMontiArcAndCore.g:6186:4: 'public'
            {
             before(grammarAccess.getCDClassAccess().getPublicPublicKeyword_0_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getCDClassAccess().getPublicPublicKeyword_0_0()); 

            }

             after(grammarAccess.getCDClassAccess().getPublicPublicKeyword_0_0()); 

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
    // $ANTLR end "rule__CDClass__PublicAssignment_0"


    // $ANTLR start "rule__CDClass__NameAssignment_2"
    // InternalMontiArcAndCore.g:6197:1: rule__CDClass__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CDClass__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6201:1: ( ( RULE_ID ) )
            // InternalMontiArcAndCore.g:6202:2: ( RULE_ID )
            {
            // InternalMontiArcAndCore.g:6202:2: ( RULE_ID )
            // InternalMontiArcAndCore.g:6203:3: RULE_ID
            {
             before(grammarAccess.getCDClassAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCDClassAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__CDClass__NameAssignment_2"


    // $ANTLR start "rule__CDClass__ExtendsAssignment_3_1"
    // InternalMontiArcAndCore.g:6212:1: rule__CDClass__ExtendsAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__CDClass__ExtendsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6216:1: ( ( RULE_ID ) )
            // InternalMontiArcAndCore.g:6217:2: ( RULE_ID )
            {
            // InternalMontiArcAndCore.g:6217:2: ( RULE_ID )
            // InternalMontiArcAndCore.g:6218:3: RULE_ID
            {
             before(grammarAccess.getCDClassAccess().getExtendsIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCDClassAccess().getExtendsIDTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__CDClass__ExtendsAssignment_3_1"


    // $ANTLR start "rule__CDClass__ImplementsAssignment_4_1"
    // InternalMontiArcAndCore.g:6227:1: rule__CDClass__ImplementsAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__CDClass__ImplementsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6231:1: ( ( RULE_ID ) )
            // InternalMontiArcAndCore.g:6232:2: ( RULE_ID )
            {
            // InternalMontiArcAndCore.g:6232:2: ( RULE_ID )
            // InternalMontiArcAndCore.g:6233:3: RULE_ID
            {
             before(grammarAccess.getCDClassAccess().getImplementsIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCDClassAccess().getImplementsIDTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__CDClass__ImplementsAssignment_4_1"


    // $ANTLR start "rule__CDClass__ImplementsAssignment_4_2_1"
    // InternalMontiArcAndCore.g:6242:1: rule__CDClass__ImplementsAssignment_4_2_1 : ( RULE_ID ) ;
    public final void rule__CDClass__ImplementsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6246:1: ( ( RULE_ID ) )
            // InternalMontiArcAndCore.g:6247:2: ( RULE_ID )
            {
            // InternalMontiArcAndCore.g:6247:2: ( RULE_ID )
            // InternalMontiArcAndCore.g:6248:3: RULE_ID
            {
             before(grammarAccess.getCDClassAccess().getImplementsIDTerminalRuleCall_4_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCDClassAccess().getImplementsIDTerminalRuleCall_4_2_1_0()); 

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
    // $ANTLR end "rule__CDClass__ImplementsAssignment_4_2_1"


    // $ANTLR start "rule__CDClass__MembersAssignment_6"
    // InternalMontiArcAndCore.g:6257:1: rule__CDClass__MembersAssignment_6 : ( ruleMember ) ;
    public final void rule__CDClass__MembersAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6261:1: ( ( ruleMember ) )
            // InternalMontiArcAndCore.g:6262:2: ( ruleMember )
            {
            // InternalMontiArcAndCore.g:6262:2: ( ruleMember )
            // InternalMontiArcAndCore.g:6263:3: ruleMember
            {
             before(grammarAccess.getCDClassAccess().getMembersMemberParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getCDClassAccess().getMembersMemberParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__CDClass__MembersAssignment_6"


    // $ANTLR start "rule__CDEnum__PublicAssignment_0"
    // InternalMontiArcAndCore.g:6272:1: rule__CDEnum__PublicAssignment_0 : ( ( 'public' ) ) ;
    public final void rule__CDEnum__PublicAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6276:1: ( ( ( 'public' ) ) )
            // InternalMontiArcAndCore.g:6277:2: ( ( 'public' ) )
            {
            // InternalMontiArcAndCore.g:6277:2: ( ( 'public' ) )
            // InternalMontiArcAndCore.g:6278:3: ( 'public' )
            {
             before(grammarAccess.getCDEnumAccess().getPublicPublicKeyword_0_0()); 
            // InternalMontiArcAndCore.g:6279:3: ( 'public' )
            // InternalMontiArcAndCore.g:6280:4: 'public'
            {
             before(grammarAccess.getCDEnumAccess().getPublicPublicKeyword_0_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getCDEnumAccess().getPublicPublicKeyword_0_0()); 

            }

             after(grammarAccess.getCDEnumAccess().getPublicPublicKeyword_0_0()); 

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
    // $ANTLR end "rule__CDEnum__PublicAssignment_0"


    // $ANTLR start "rule__CDEnum__NameAssignment_2"
    // InternalMontiArcAndCore.g:6291:1: rule__CDEnum__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CDEnum__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6295:1: ( ( RULE_ID ) )
            // InternalMontiArcAndCore.g:6296:2: ( RULE_ID )
            {
            // InternalMontiArcAndCore.g:6296:2: ( RULE_ID )
            // InternalMontiArcAndCore.g:6297:3: RULE_ID
            {
             before(grammarAccess.getCDEnumAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCDEnumAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__CDEnum__NameAssignment_2"


    // $ANTLR start "rule__CDEnum__ValuesAssignment_4"
    // InternalMontiArcAndCore.g:6306:1: rule__CDEnum__ValuesAssignment_4 : ( RULE_ID ) ;
    public final void rule__CDEnum__ValuesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6310:1: ( ( RULE_ID ) )
            // InternalMontiArcAndCore.g:6311:2: ( RULE_ID )
            {
            // InternalMontiArcAndCore.g:6311:2: ( RULE_ID )
            // InternalMontiArcAndCore.g:6312:3: RULE_ID
            {
             before(grammarAccess.getCDEnumAccess().getValuesIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCDEnumAccess().getValuesIDTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__CDEnum__ValuesAssignment_4"


    // $ANTLR start "rule__Member__TypeAssignment_0"
    // InternalMontiArcAndCore.g:6321:1: rule__Member__TypeAssignment_0 : ( ( rule__Member__TypeAlternatives_0_0 ) ) ;
    public final void rule__Member__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6325:1: ( ( ( rule__Member__TypeAlternatives_0_0 ) ) )
            // InternalMontiArcAndCore.g:6326:2: ( ( rule__Member__TypeAlternatives_0_0 ) )
            {
            // InternalMontiArcAndCore.g:6326:2: ( ( rule__Member__TypeAlternatives_0_0 ) )
            // InternalMontiArcAndCore.g:6327:3: ( rule__Member__TypeAlternatives_0_0 )
            {
             before(grammarAccess.getMemberAccess().getTypeAlternatives_0_0()); 
            // InternalMontiArcAndCore.g:6328:3: ( rule__Member__TypeAlternatives_0_0 )
            // InternalMontiArcAndCore.g:6328:4: rule__Member__TypeAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Member__TypeAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getTypeAlternatives_0_0()); 

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
    // $ANTLR end "rule__Member__TypeAssignment_0"


    // $ANTLR start "rule__Member__NameAssignment_1"
    // InternalMontiArcAndCore.g:6336:1: rule__Member__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Member__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6340:1: ( ( RULE_ID ) )
            // InternalMontiArcAndCore.g:6341:2: ( RULE_ID )
            {
            // InternalMontiArcAndCore.g:6341:2: ( RULE_ID )
            // InternalMontiArcAndCore.g:6342:3: RULE_ID
            {
             before(grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Member__NameAssignment_1"


    // $ANTLR start "rule__MACompilationUnit__PackageAssignment_0"
    // InternalMontiArcAndCore.g:6351:1: rule__MACompilationUnit__PackageAssignment_0 : ( rulePackage ) ;
    public final void rule__MACompilationUnit__PackageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6355:1: ( ( rulePackage ) )
            // InternalMontiArcAndCore.g:6356:2: ( rulePackage )
            {
            // InternalMontiArcAndCore.g:6356:2: ( rulePackage )
            // InternalMontiArcAndCore.g:6357:3: rulePackage
            {
             before(grammarAccess.getMACompilationUnitAccess().getPackagePackageParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getMACompilationUnitAccess().getPackagePackageParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__MACompilationUnit__PackageAssignment_0"


    // $ANTLR start "rule__MACompilationUnit__ImportStatementsAssignment_1"
    // InternalMontiArcAndCore.g:6366:1: rule__MACompilationUnit__ImportStatementsAssignment_1 : ( ruleImportStatements ) ;
    public final void rule__MACompilationUnit__ImportStatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6370:1: ( ( ruleImportStatements ) )
            // InternalMontiArcAndCore.g:6371:2: ( ruleImportStatements )
            {
            // InternalMontiArcAndCore.g:6371:2: ( ruleImportStatements )
            // InternalMontiArcAndCore.g:6372:3: ruleImportStatements
            {
             before(grammarAccess.getMACompilationUnitAccess().getImportStatementsImportStatementsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImportStatements();

            state._fsp--;

             after(grammarAccess.getMACompilationUnitAccess().getImportStatementsImportStatementsParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__MACompilationUnit__ImportStatementsAssignment_1"


    // $ANTLR start "rule__MACompilationUnit__ComponentAssignment_2"
    // InternalMontiArcAndCore.g:6381:1: rule__MACompilationUnit__ComponentAssignment_2 : ( ruleComponent ) ;
    public final void rule__MACompilationUnit__ComponentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6385:1: ( ( ruleComponent ) )
            // InternalMontiArcAndCore.g:6386:2: ( ruleComponent )
            {
            // InternalMontiArcAndCore.g:6386:2: ( ruleComponent )
            // InternalMontiArcAndCore.g:6387:3: ruleComponent
            {
             before(grammarAccess.getMACompilationUnitAccess().getComponentComponentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getMACompilationUnitAccess().getComponentComponentParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__MACompilationUnit__ComponentAssignment_2"


    // $ANTLR start "rule__Component__NameAssignment_1"
    // InternalMontiArcAndCore.g:6396:1: rule__Component__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6400:1: ( ( RULE_ID ) )
            // InternalMontiArcAndCore.g:6401:2: ( RULE_ID )
            {
            // InternalMontiArcAndCore.g:6401:2: ( RULE_ID )
            // InternalMontiArcAndCore.g:6402:3: RULE_ID
            {
             before(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Component__NameAssignment_1"


    // $ANTLR start "rule__Component__ArcElementsAssignment_3"
    // InternalMontiArcAndCore.g:6411:1: rule__Component__ArcElementsAssignment_3 : ( ruleArcElement ) ;
    public final void rule__Component__ArcElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6415:1: ( ( ruleArcElement ) )
            // InternalMontiArcAndCore.g:6416:2: ( ruleArcElement )
            {
            // InternalMontiArcAndCore.g:6416:2: ( ruleArcElement )
            // InternalMontiArcAndCore.g:6417:3: ruleArcElement
            {
             before(grammarAccess.getComponentAccess().getArcElementsArcElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleArcElement();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getArcElementsArcElementParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Component__ArcElementsAssignment_3"


    // $ANTLR start "rule__Parameters__ParametersAssignment_0"
    // InternalMontiArcAndCore.g:6426:1: rule__Parameters__ParametersAssignment_0 : ( ruleParameter ) ;
    public final void rule__Parameters__ParametersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6430:1: ( ( ruleParameter ) )
            // InternalMontiArcAndCore.g:6431:2: ( ruleParameter )
            {
            // InternalMontiArcAndCore.g:6431:2: ( ruleParameter )
            // InternalMontiArcAndCore.g:6432:3: ruleParameter
            {
             before(grammarAccess.getParametersAccess().getParametersParameterParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParametersAccess().getParametersParameterParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Parameters__ParametersAssignment_0"


    // $ANTLR start "rule__Parameters__ParametersAssignment_1_1"
    // InternalMontiArcAndCore.g:6441:1: rule__Parameters__ParametersAssignment_1_1 : ( ruleParameter ) ;
    public final void rule__Parameters__ParametersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6445:1: ( ( ruleParameter ) )
            // InternalMontiArcAndCore.g:6446:2: ( ruleParameter )
            {
            // InternalMontiArcAndCore.g:6446:2: ( ruleParameter )
            // InternalMontiArcAndCore.g:6447:3: ruleParameter
            {
             before(grammarAccess.getParametersAccess().getParametersParameterParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParametersAccess().getParametersParameterParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Parameters__ParametersAssignment_1_1"


    // $ANTLR start "rule__Parameter__TypeAssignment_0"
    // InternalMontiArcAndCore.g:6456:1: rule__Parameter__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Parameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6460:1: ( ( ruleType ) )
            // InternalMontiArcAndCore.g:6461:2: ( ruleType )
            {
            // InternalMontiArcAndCore.g:6461:2: ( ruleType )
            // InternalMontiArcAndCore.g:6462:3: ruleType
            {
             before(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Parameter__TypeAssignment_0"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // InternalMontiArcAndCore.g:6471:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6475:1: ( ( RULE_ID ) )
            // InternalMontiArcAndCore.g:6476:2: ( RULE_ID )
            {
            // InternalMontiArcAndCore.g:6476:2: ( RULE_ID )
            // InternalMontiArcAndCore.g:6477:3: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Parameter__NameAssignment_1"


    // $ANTLR start "rule__Parameter__ExpressionAssignment_2_1"
    // InternalMontiArcAndCore.g:6486:1: rule__Parameter__ExpressionAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__Parameter__ExpressionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6490:1: ( ( ruleExpression ) )
            // InternalMontiArcAndCore.g:6491:2: ( ruleExpression )
            {
            // InternalMontiArcAndCore.g:6491:2: ( ruleExpression )
            // InternalMontiArcAndCore.g:6492:3: ruleExpression
            {
             before(grammarAccess.getParameterAccess().getExpressionExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getExpressionExpressionParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Parameter__ExpressionAssignment_2_1"


    // $ANTLR start "rule__SubComponent__TypeAssignment_1"
    // InternalMontiArcAndCore.g:6501:1: rule__SubComponent__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__SubComponent__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6505:1: ( ( ruleType ) )
            // InternalMontiArcAndCore.g:6506:2: ( ruleType )
            {
            // InternalMontiArcAndCore.g:6506:2: ( ruleType )
            // InternalMontiArcAndCore.g:6507:3: ruleType
            {
             before(grammarAccess.getSubComponentAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getSubComponentAccess().getTypeTypeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__SubComponent__TypeAssignment_1"


    // $ANTLR start "rule__SubComponent__ArgumentsAssignment_2"
    // InternalMontiArcAndCore.g:6516:1: rule__SubComponent__ArgumentsAssignment_2 : ( ruleArguments ) ;
    public final void rule__SubComponent__ArgumentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6520:1: ( ( ruleArguments ) )
            // InternalMontiArcAndCore.g:6521:2: ( ruleArguments )
            {
            // InternalMontiArcAndCore.g:6521:2: ( ruleArguments )
            // InternalMontiArcAndCore.g:6522:3: ruleArguments
            {
             before(grammarAccess.getSubComponentAccess().getArgumentsArgumentsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleArguments();

            state._fsp--;

             after(grammarAccess.getSubComponentAccess().getArgumentsArgumentsParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__SubComponent__ArgumentsAssignment_2"


    // $ANTLR start "rule__SubComponent__InstancesAssignment_3"
    // InternalMontiArcAndCore.g:6531:1: rule__SubComponent__InstancesAssignment_3 : ( ruleNames ) ;
    public final void rule__SubComponent__InstancesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6535:1: ( ( ruleNames ) )
            // InternalMontiArcAndCore.g:6536:2: ( ruleNames )
            {
            // InternalMontiArcAndCore.g:6536:2: ( ruleNames )
            // InternalMontiArcAndCore.g:6537:3: ruleNames
            {
             before(grammarAccess.getSubComponentAccess().getInstancesNamesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNames();

            state._fsp--;

             after(grammarAccess.getSubComponentAccess().getInstancesNamesParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__SubComponent__InstancesAssignment_3"


    // $ANTLR start "rule__Connector__SourceAssignment_0"
    // InternalMontiArcAndCore.g:6546:1: rule__Connector__SourceAssignment_0 : ( ( rule__Connector__SourceAlternatives_0_0 ) ) ;
    public final void rule__Connector__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6550:1: ( ( ( rule__Connector__SourceAlternatives_0_0 ) ) )
            // InternalMontiArcAndCore.g:6551:2: ( ( rule__Connector__SourceAlternatives_0_0 ) )
            {
            // InternalMontiArcAndCore.g:6551:2: ( ( rule__Connector__SourceAlternatives_0_0 ) )
            // InternalMontiArcAndCore.g:6552:3: ( rule__Connector__SourceAlternatives_0_0 )
            {
             before(grammarAccess.getConnectorAccess().getSourceAlternatives_0_0()); 
            // InternalMontiArcAndCore.g:6553:3: ( rule__Connector__SourceAlternatives_0_0 )
            // InternalMontiArcAndCore.g:6553:4: rule__Connector__SourceAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Connector__SourceAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getSourceAlternatives_0_0()); 

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
    // $ANTLR end "rule__Connector__SourceAssignment_0"


    // $ANTLR start "rule__Connector__TargetAssignment_2"
    // InternalMontiArcAndCore.g:6561:1: rule__Connector__TargetAssignment_2 : ( ( rule__Connector__TargetAlternatives_2_0 ) ) ;
    public final void rule__Connector__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6565:1: ( ( ( rule__Connector__TargetAlternatives_2_0 ) ) )
            // InternalMontiArcAndCore.g:6566:2: ( ( rule__Connector__TargetAlternatives_2_0 ) )
            {
            // InternalMontiArcAndCore.g:6566:2: ( ( rule__Connector__TargetAlternatives_2_0 ) )
            // InternalMontiArcAndCore.g:6567:3: ( rule__Connector__TargetAlternatives_2_0 )
            {
             before(grammarAccess.getConnectorAccess().getTargetAlternatives_2_0()); 
            // InternalMontiArcAndCore.g:6568:3: ( rule__Connector__TargetAlternatives_2_0 )
            // InternalMontiArcAndCore.g:6568:4: rule__Connector__TargetAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Connector__TargetAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getTargetAlternatives_2_0()); 

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
    // $ANTLR end "rule__Connector__TargetAssignment_2"


    // $ANTLR start "rule__Port__ConditionAssignment_1"
    // InternalMontiArcAndCore.g:6576:1: rule__Port__ConditionAssignment_1 : ( ruleCondition ) ;
    public final void rule__Port__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6580:1: ( ( ruleCondition ) )
            // InternalMontiArcAndCore.g:6581:2: ( ruleCondition )
            {
            // InternalMontiArcAndCore.g:6581:2: ( ruleCondition )
            // InternalMontiArcAndCore.g:6582:3: ruleCondition
            {
             before(grammarAccess.getPortAccess().getConditionConditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getPortAccess().getConditionConditionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Port__ConditionAssignment_1"


    // $ANTLR start "rule__Port__InAssignment_2_0"
    // InternalMontiArcAndCore.g:6591:1: rule__Port__InAssignment_2_0 : ( ( 'in' ) ) ;
    public final void rule__Port__InAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6595:1: ( ( ( 'in' ) ) )
            // InternalMontiArcAndCore.g:6596:2: ( ( 'in' ) )
            {
            // InternalMontiArcAndCore.g:6596:2: ( ( 'in' ) )
            // InternalMontiArcAndCore.g:6597:3: ( 'in' )
            {
             before(grammarAccess.getPortAccess().getInInKeyword_2_0_0()); 
            // InternalMontiArcAndCore.g:6598:3: ( 'in' )
            // InternalMontiArcAndCore.g:6599:4: 'in'
            {
             before(grammarAccess.getPortAccess().getInInKeyword_2_0_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getPortAccess().getInInKeyword_2_0_0()); 

            }

             after(grammarAccess.getPortAccess().getInInKeyword_2_0_0()); 

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
    // $ANTLR end "rule__Port__InAssignment_2_0"


    // $ANTLR start "rule__Port__OutAssignment_2_1"
    // InternalMontiArcAndCore.g:6610:1: rule__Port__OutAssignment_2_1 : ( ( 'out' ) ) ;
    public final void rule__Port__OutAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6614:1: ( ( ( 'out' ) ) )
            // InternalMontiArcAndCore.g:6615:2: ( ( 'out' ) )
            {
            // InternalMontiArcAndCore.g:6615:2: ( ( 'out' ) )
            // InternalMontiArcAndCore.g:6616:3: ( 'out' )
            {
             before(grammarAccess.getPortAccess().getOutOutKeyword_2_1_0()); 
            // InternalMontiArcAndCore.g:6617:3: ( 'out' )
            // InternalMontiArcAndCore.g:6618:4: 'out'
            {
             before(grammarAccess.getPortAccess().getOutOutKeyword_2_1_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getPortAccess().getOutOutKeyword_2_1_0()); 

            }

             after(grammarAccess.getPortAccess().getOutOutKeyword_2_1_0()); 

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
    // $ANTLR end "rule__Port__OutAssignment_2_1"


    // $ANTLR start "rule__Port__TypeAssignment_3_0"
    // InternalMontiArcAndCore.g:6629:1: rule__Port__TypeAssignment_3_0 : ( ruleType ) ;
    public final void rule__Port__TypeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6633:1: ( ( ruleType ) )
            // InternalMontiArcAndCore.g:6634:2: ( ruleType )
            {
            // InternalMontiArcAndCore.g:6634:2: ( ruleType )
            // InternalMontiArcAndCore.g:6635:3: ruleType
            {
             before(grammarAccess.getPortAccess().getTypeTypeParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getPortAccess().getTypeTypeParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__Port__TypeAssignment_3_0"


    // $ANTLR start "rule__Port__DataTypeAssignment_3_1"
    // InternalMontiArcAndCore.g:6644:1: rule__Port__DataTypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Port__DataTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6648:1: ( ( ( RULE_ID ) ) )
            // InternalMontiArcAndCore.g:6649:2: ( ( RULE_ID ) )
            {
            // InternalMontiArcAndCore.g:6649:2: ( ( RULE_ID ) )
            // InternalMontiArcAndCore.g:6650:3: ( RULE_ID )
            {
             before(grammarAccess.getPortAccess().getDataTypeCDDefinitionCrossReference_3_1_0()); 
            // InternalMontiArcAndCore.g:6651:3: ( RULE_ID )
            // InternalMontiArcAndCore.g:6652:4: RULE_ID
            {
             before(grammarAccess.getPortAccess().getDataTypeCDDefinitionIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPortAccess().getDataTypeCDDefinitionIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getPortAccess().getDataTypeCDDefinitionCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__Port__DataTypeAssignment_3_1"


    // $ANTLR start "rule__Port__NameAssignment_4"
    // InternalMontiArcAndCore.g:6663:1: rule__Port__NameAssignment_4 : ( ( rule__Port__NameAlternatives_4_0 ) ) ;
    public final void rule__Port__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6667:1: ( ( ( rule__Port__NameAlternatives_4_0 ) ) )
            // InternalMontiArcAndCore.g:6668:2: ( ( rule__Port__NameAlternatives_4_0 ) )
            {
            // InternalMontiArcAndCore.g:6668:2: ( ( rule__Port__NameAlternatives_4_0 ) )
            // InternalMontiArcAndCore.g:6669:3: ( rule__Port__NameAlternatives_4_0 )
            {
             before(grammarAccess.getPortAccess().getNameAlternatives_4_0()); 
            // InternalMontiArcAndCore.g:6670:3: ( rule__Port__NameAlternatives_4_0 )
            // InternalMontiArcAndCore.g:6670:4: rule__Port__NameAlternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Port__NameAlternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getNameAlternatives_4_0()); 

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
    // $ANTLR end "rule__Port__NameAssignment_4"


    // $ANTLR start "rule__Condition__ConditionAssignment_3"
    // InternalMontiArcAndCore.g:6678:1: rule__Condition__ConditionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Condition__ConditionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6682:1: ( ( RULE_STRING ) )
            // InternalMontiArcAndCore.g:6683:2: ( RULE_STRING )
            {
            // InternalMontiArcAndCore.g:6683:2: ( RULE_STRING )
            // InternalMontiArcAndCore.g:6684:3: RULE_STRING
            {
             before(grammarAccess.getConditionAccess().getConditionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getConditionSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Condition__ConditionAssignment_3"


    // $ANTLR start "rule__Names__NamesAssignment_0"
    // InternalMontiArcAndCore.g:6693:1: rule__Names__NamesAssignment_0 : ( ( rule__Names__NamesAlternatives_0_0 ) ) ;
    public final void rule__Names__NamesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6697:1: ( ( ( rule__Names__NamesAlternatives_0_0 ) ) )
            // InternalMontiArcAndCore.g:6698:2: ( ( rule__Names__NamesAlternatives_0_0 ) )
            {
            // InternalMontiArcAndCore.g:6698:2: ( ( rule__Names__NamesAlternatives_0_0 ) )
            // InternalMontiArcAndCore.g:6699:3: ( rule__Names__NamesAlternatives_0_0 )
            {
             before(grammarAccess.getNamesAccess().getNamesAlternatives_0_0()); 
            // InternalMontiArcAndCore.g:6700:3: ( rule__Names__NamesAlternatives_0_0 )
            // InternalMontiArcAndCore.g:6700:4: rule__Names__NamesAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Names__NamesAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getNamesAccess().getNamesAlternatives_0_0()); 

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
    // $ANTLR end "rule__Names__NamesAssignment_0"


    // $ANTLR start "rule__Names__NamesAssignment_1_1"
    // InternalMontiArcAndCore.g:6708:1: rule__Names__NamesAssignment_1_1 : ( ( rule__Names__NamesAlternatives_1_1_0 ) ) ;
    public final void rule__Names__NamesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6712:1: ( ( ( rule__Names__NamesAlternatives_1_1_0 ) ) )
            // InternalMontiArcAndCore.g:6713:2: ( ( rule__Names__NamesAlternatives_1_1_0 ) )
            {
            // InternalMontiArcAndCore.g:6713:2: ( ( rule__Names__NamesAlternatives_1_1_0 ) )
            // InternalMontiArcAndCore.g:6714:3: ( rule__Names__NamesAlternatives_1_1_0 )
            {
             before(grammarAccess.getNamesAccess().getNamesAlternatives_1_1_0()); 
            // InternalMontiArcAndCore.g:6715:3: ( rule__Names__NamesAlternatives_1_1_0 )
            // InternalMontiArcAndCore.g:6715:4: rule__Names__NamesAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Names__NamesAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getNamesAccess().getNamesAlternatives_1_1_0()); 

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
    // $ANTLR end "rule__Names__NamesAssignment_1_1"


    // $ANTLR start "rule__Variable__TypeAssignment_0"
    // InternalMontiArcAndCore.g:6723:1: rule__Variable__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Variable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6727:1: ( ( ( RULE_ID ) ) )
            // InternalMontiArcAndCore.g:6728:2: ( ( RULE_ID ) )
            {
            // InternalMontiArcAndCore.g:6728:2: ( ( RULE_ID ) )
            // InternalMontiArcAndCore.g:6729:3: ( RULE_ID )
            {
             before(grammarAccess.getVariableAccess().getTypeComponentCrossReference_0_0()); 
            // InternalMontiArcAndCore.g:6730:3: ( RULE_ID )
            // InternalMontiArcAndCore.g:6731:4: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getTypeComponentIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getTypeComponentIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getVariableAccess().getTypeComponentCrossReference_0_0()); 

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
    // $ANTLR end "rule__Variable__TypeAssignment_0"


    // $ANTLR start "rule__Variable__NameAssignment_1"
    // InternalMontiArcAndCore.g:6742:1: rule__Variable__NameAssignment_1 : ( ( rule__Variable__NameAlternatives_1_0 ) ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6746:1: ( ( ( rule__Variable__NameAlternatives_1_0 ) ) )
            // InternalMontiArcAndCore.g:6747:2: ( ( rule__Variable__NameAlternatives_1_0 ) )
            {
            // InternalMontiArcAndCore.g:6747:2: ( ( rule__Variable__NameAlternatives_1_0 ) )
            // InternalMontiArcAndCore.g:6748:3: ( rule__Variable__NameAlternatives_1_0 )
            {
             before(grammarAccess.getVariableAccess().getNameAlternatives_1_0()); 
            // InternalMontiArcAndCore.g:6749:3: ( rule__Variable__NameAlternatives_1_0 )
            // InternalMontiArcAndCore.g:6749:4: rule__Variable__NameAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAlternatives_1_0()); 

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
    // $ANTLR end "rule__Variable__NameAssignment_1"


    // $ANTLR start "rule__Automaton__SyncAssignment_1"
    // InternalMontiArcAndCore.g:6757:1: rule__Automaton__SyncAssignment_1 : ( RULE_SYNC ) ;
    public final void rule__Automaton__SyncAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6761:1: ( ( RULE_SYNC ) )
            // InternalMontiArcAndCore.g:6762:2: ( RULE_SYNC )
            {
            // InternalMontiArcAndCore.g:6762:2: ( RULE_SYNC )
            // InternalMontiArcAndCore.g:6763:3: RULE_SYNC
            {
             before(grammarAccess.getAutomatonAccess().getSyncSYNCTerminalRuleCall_1_0()); 
            match(input,RULE_SYNC,FOLLOW_2); 
             after(grammarAccess.getAutomatonAccess().getSyncSYNCTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Automaton__SyncAssignment_1"


    // $ANTLR start "rule__Automaton__NameAssignment_3"
    // InternalMontiArcAndCore.g:6772:1: rule__Automaton__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Automaton__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6776:1: ( ( RULE_ID ) )
            // InternalMontiArcAndCore.g:6777:2: ( RULE_ID )
            {
            // InternalMontiArcAndCore.g:6777:2: ( RULE_ID )
            // InternalMontiArcAndCore.g:6778:3: RULE_ID
            {
             before(grammarAccess.getAutomatonAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAutomatonAccess().getNameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Automaton__NameAssignment_3"


    // $ANTLR start "rule__Automaton__StatesAssignment_5_0"
    // InternalMontiArcAndCore.g:6787:1: rule__Automaton__StatesAssignment_5_0 : ( ruleState ) ;
    public final void rule__Automaton__StatesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6791:1: ( ( ruleState ) )
            // InternalMontiArcAndCore.g:6792:2: ( ruleState )
            {
            // InternalMontiArcAndCore.g:6792:2: ( ruleState )
            // InternalMontiArcAndCore.g:6793:3: ruleState
            {
             before(grammarAccess.getAutomatonAccess().getStatesStateParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getAutomatonAccess().getStatesStateParserRuleCall_5_0_0()); 

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
    // $ANTLR end "rule__Automaton__StatesAssignment_5_0"


    // $ANTLR start "rule__Automaton__TransitionsAssignment_5_1"
    // InternalMontiArcAndCore.g:6802:1: rule__Automaton__TransitionsAssignment_5_1 : ( ruleTransition ) ;
    public final void rule__Automaton__TransitionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6806:1: ( ( ruleTransition ) )
            // InternalMontiArcAndCore.g:6807:2: ( ruleTransition )
            {
            // InternalMontiArcAndCore.g:6807:2: ( ruleTransition )
            // InternalMontiArcAndCore.g:6808:3: ruleTransition
            {
             before(grammarAccess.getAutomatonAccess().getTransitionsTransitionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getAutomatonAccess().getTransitionsTransitionParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Automaton__TransitionsAssignment_5_1"


    // $ANTLR start "rule__SCState__ModifierAssignment_0"
    // InternalMontiArcAndCore.g:6817:1: rule__SCState__ModifierAssignment_0 : ( ruleSCModifier ) ;
    public final void rule__SCState__ModifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6821:1: ( ( ruleSCModifier ) )
            // InternalMontiArcAndCore.g:6822:2: ( ruleSCModifier )
            {
            // InternalMontiArcAndCore.g:6822:2: ( ruleSCModifier )
            // InternalMontiArcAndCore.g:6823:3: ruleSCModifier
            {
             before(grammarAccess.getSCStateAccess().getModifierSCModifierEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSCModifier();

            state._fsp--;

             after(grammarAccess.getSCStateAccess().getModifierSCModifierEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__SCState__ModifierAssignment_0"


    // $ANTLR start "rule__SCState__AnteAssignment_1"
    // InternalMontiArcAndCore.g:6832:1: rule__SCState__AnteAssignment_1 : ( ruleSCSAnte ) ;
    public final void rule__SCState__AnteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6836:1: ( ( ruleSCSAnte ) )
            // InternalMontiArcAndCore.g:6837:2: ( ruleSCSAnte )
            {
            // InternalMontiArcAndCore.g:6837:2: ( ruleSCSAnte )
            // InternalMontiArcAndCore.g:6838:3: ruleSCSAnte
            {
             before(grammarAccess.getSCStateAccess().getAnteSCSAnteParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSCSAnte();

            state._fsp--;

             after(grammarAccess.getSCStateAccess().getAnteSCSAnteParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__SCState__AnteAssignment_1"


    // $ANTLR start "rule__SCState__NameAssignment_3"
    // InternalMontiArcAndCore.g:6847:1: rule__SCState__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__SCState__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6851:1: ( ( RULE_ID ) )
            // InternalMontiArcAndCore.g:6852:2: ( RULE_ID )
            {
            // InternalMontiArcAndCore.g:6852:2: ( RULE_ID )
            // InternalMontiArcAndCore.g:6853:3: RULE_ID
            {
             before(grammarAccess.getSCStateAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSCStateAccess().getNameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__SCState__NameAssignment_3"


    // $ANTLR start "rule__InvState__ModifierAssignment_0"
    // InternalMontiArcAndCore.g:6862:1: rule__InvState__ModifierAssignment_0 : ( ruleSCModifier ) ;
    public final void rule__InvState__ModifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6866:1: ( ( ruleSCModifier ) )
            // InternalMontiArcAndCore.g:6867:2: ( ruleSCModifier )
            {
            // InternalMontiArcAndCore.g:6867:2: ( ruleSCModifier )
            // InternalMontiArcAndCore.g:6868:3: ruleSCModifier
            {
             before(grammarAccess.getInvStateAccess().getModifierSCModifierEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSCModifier();

            state._fsp--;

             after(grammarAccess.getInvStateAccess().getModifierSCModifierEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__InvState__ModifierAssignment_0"


    // $ANTLR start "rule__InvState__NameAssignment_2"
    // InternalMontiArcAndCore.g:6877:1: rule__InvState__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__InvState__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6881:1: ( ( RULE_ID ) )
            // InternalMontiArcAndCore.g:6882:2: ( RULE_ID )
            {
            // InternalMontiArcAndCore.g:6882:2: ( RULE_ID )
            // InternalMontiArcAndCore.g:6883:3: RULE_ID
            {
             before(grammarAccess.getInvStateAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInvStateAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__InvState__NameAssignment_2"


    // $ANTLR start "rule__InvState__ExpressionAssignment_4"
    // InternalMontiArcAndCore.g:6892:1: rule__InvState__ExpressionAssignment_4 : ( ruleExpression ) ;
    public final void rule__InvState__ExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6896:1: ( ( ruleExpression ) )
            // InternalMontiArcAndCore.g:6897:2: ( ruleExpression )
            {
            // InternalMontiArcAndCore.g:6897:2: ( ruleExpression )
            // InternalMontiArcAndCore.g:6898:3: ruleExpression
            {
             before(grammarAccess.getInvStateAccess().getExpressionExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getInvStateAccess().getExpressionExpressionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__InvState__ExpressionAssignment_4"


    // $ANTLR start "rule__SCSAnte__BlockAssignment_1"
    // InternalMontiArcAndCore.g:6907:1: rule__SCSAnte__BlockAssignment_1 : ( ruleBlock ) ;
    public final void rule__SCSAnte__BlockAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6911:1: ( ( ruleBlock ) )
            // InternalMontiArcAndCore.g:6912:2: ( ruleBlock )
            {
            // InternalMontiArcAndCore.g:6912:2: ( ruleBlock )
            // InternalMontiArcAndCore.g:6913:3: ruleBlock
            {
             before(grammarAccess.getSCSAnteAccess().getBlockBlockParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getSCSAnteAccess().getBlockBlockParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__SCSAnte__BlockAssignment_1"


    // $ANTLR start "rule__Transition__SourceAssignment_0"
    // InternalMontiArcAndCore.g:6922:1: rule__Transition__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6926:1: ( ( ( RULE_ID ) ) )
            // InternalMontiArcAndCore.g:6927:2: ( ( RULE_ID ) )
            {
            // InternalMontiArcAndCore.g:6927:2: ( ( RULE_ID ) )
            // InternalMontiArcAndCore.g:6928:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getSourceStateCrossReference_0_0()); 
            // InternalMontiArcAndCore.g:6929:3: ( RULE_ID )
            // InternalMontiArcAndCore.g:6930:4: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getSourceStateIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getSourceStateIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getSourceStateCrossReference_0_0()); 

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
    // $ANTLR end "rule__Transition__SourceAssignment_0"


    // $ANTLR start "rule__Transition__TargetAssignment_1_1"
    // InternalMontiArcAndCore.g:6941:1: rule__Transition__TargetAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__TargetAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6945:1: ( ( ( RULE_ID ) ) )
            // InternalMontiArcAndCore.g:6946:2: ( ( RULE_ID ) )
            {
            // InternalMontiArcAndCore.g:6946:2: ( ( RULE_ID ) )
            // InternalMontiArcAndCore.g:6947:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getTargetStateCrossReference_1_1_0()); 
            // InternalMontiArcAndCore.g:6948:3: ( RULE_ID )
            // InternalMontiArcAndCore.g:6949:4: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getTargetStateIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getTargetStateIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getTargetStateCrossReference_1_1_0()); 

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
    // $ANTLR end "rule__Transition__TargetAssignment_1_1"


    // $ANTLR start "rule__Transition__ExpressionAssignment_2_1"
    // InternalMontiArcAndCore.g:6960:1: rule__Transition__ExpressionAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__Transition__ExpressionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6964:1: ( ( ruleExpression ) )
            // InternalMontiArcAndCore.g:6965:2: ( ruleExpression )
            {
            // InternalMontiArcAndCore.g:6965:2: ( ruleExpression )
            // InternalMontiArcAndCore.g:6966:3: ruleExpression
            {
             before(grammarAccess.getTransitionAccess().getExpressionExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getExpressionExpressionParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Transition__ExpressionAssignment_2_1"


    // $ANTLR start "rule__Transition__ReactionAssignment_3_1"
    // InternalMontiArcAndCore.g:6975:1: rule__Transition__ReactionAssignment_3_1 : ( ruleBlock ) ;
    public final void rule__Transition__ReactionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6979:1: ( ( ruleBlock ) )
            // InternalMontiArcAndCore.g:6980:2: ( ruleBlock )
            {
            // InternalMontiArcAndCore.g:6980:2: ( ruleBlock )
            // InternalMontiArcAndCore.g:6981:3: ruleBlock
            {
             before(grammarAccess.getTransitionAccess().getReactionBlockParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getReactionBlockParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Transition__ReactionAssignment_3_1"


    // $ANTLR start "rule__Block__BlocksAssignment_2"
    // InternalMontiArcAndCore.g:6990:1: rule__Block__BlocksAssignment_2 : ( ruleBlockStatement ) ;
    public final void rule__Block__BlocksAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:6994:1: ( ( ruleBlockStatement ) )
            // InternalMontiArcAndCore.g:6995:2: ( ruleBlockStatement )
            {
            // InternalMontiArcAndCore.g:6995:2: ( ruleBlockStatement )
            // InternalMontiArcAndCore.g:6996:3: ruleBlockStatement
            {
             before(grammarAccess.getBlockAccess().getBlocksBlockStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBlockStatement();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getBlocksBlockStatementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Block__BlocksAssignment_2"


    // $ANTLR start "rule__SimpleExpression__ExpressionAssignment_0"
    // InternalMontiArcAndCore.g:7005:1: rule__SimpleExpression__ExpressionAssignment_0 : ( ruleExpression ) ;
    public final void rule__SimpleExpression__ExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:7009:1: ( ( ruleExpression ) )
            // InternalMontiArcAndCore.g:7010:2: ( ruleExpression )
            {
            // InternalMontiArcAndCore.g:7010:2: ( ruleExpression )
            // InternalMontiArcAndCore.g:7011:3: ruleExpression
            {
             before(grammarAccess.getSimpleExpressionAccess().getExpressionExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSimpleExpressionAccess().getExpressionExpressionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__SimpleExpression__ExpressionAssignment_0"


    // $ANTLR start "rule__SimpleInit__NameAssignment_0"
    // InternalMontiArcAndCore.g:7020:1: rule__SimpleInit__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SimpleInit__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:7024:1: ( ( RULE_ID ) )
            // InternalMontiArcAndCore.g:7025:2: ( RULE_ID )
            {
            // InternalMontiArcAndCore.g:7025:2: ( RULE_ID )
            // InternalMontiArcAndCore.g:7026:3: RULE_ID
            {
             before(grammarAccess.getSimpleInitAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSimpleInitAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__SimpleInit__NameAssignment_0"


    // $ANTLR start "rule__SimpleInit__ExpressionsAssignment_2"
    // InternalMontiArcAndCore.g:7035:1: rule__SimpleInit__ExpressionsAssignment_2 : ( ruleExpression ) ;
    public final void rule__SimpleInit__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcAndCore.g:7039:1: ( ( ruleExpression ) )
            // InternalMontiArcAndCore.g:7040:2: ( ruleExpression )
            {
            // InternalMontiArcAndCore.g:7040:2: ( ruleExpression )
            // InternalMontiArcAndCore.g:7041:3: ruleExpression
            {
             before(grammarAccess.getSimpleInitAccess().getExpressionsExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSimpleInitAccess().getExpressionsExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__SimpleInit__ExpressionsAssignment_2"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA23 dfa23 = new DFA23(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\uffff\10\14\4\uffff";
    static final String dfa_3s = "\1\16\10\4\4\uffff";
    static final String dfa_4s = "\1\40\10\60\4\uffff";
    static final String dfa_5s = "\11\uffff\1\3\1\4\1\2\1\1";
    static final String dfa_6s = "\15\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\7\11\4\12",
            "\2\14\33\uffff\1\14\14\uffff\1\13\1\uffff\1\14",
            "\2\14\33\uffff\1\14\14\uffff\1\13\1\uffff\1\14",
            "\2\14\33\uffff\1\14\14\uffff\1\13\1\uffff\1\14",
            "\2\14\33\uffff\1\14\14\uffff\1\13\1\uffff\1\14",
            "\2\14\33\uffff\1\14\14\uffff\1\13\1\uffff\1\14",
            "\2\14\33\uffff\1\14\14\uffff\1\13\1\uffff\1\14",
            "\2\14\33\uffff\1\14\14\uffff\1\13\1\uffff\1\14",
            "\2\14\33\uffff\1\14\14\uffff\1\13\1\uffff\1\14",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1180:1: rule__Type__Alternatives : ( ( ruleMCPrimitiveType ) | ( ruleMCArrayType ) | ( ruleMCObjectType ) | ( ruleMCCollectionType ) );";
        }
    }
    static final String dfa_8s = "\7\uffff";
    static final String dfa_9s = "\3\51\1\uffff\1\5\1\54\1\uffff";
    static final String dfa_10s = "\3\102\1\uffff\1\5\1\56\1\uffff";
    static final String dfa_11s = "\3\uffff\1\1\2\uffff\1\2";
    static final String dfa_12s = "\7\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\1\2\11\uffff\1\3\15\uffff\1\4",
            "\1\1\1\2\11\uffff\1\3\15\uffff\1\4",
            "\1\1\1\2\11\uffff\1\3\15\uffff\1\4",
            "",
            "\1\5",
            "\1\3\1\uffff\1\6",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1741:1: rule__State__Alternatives : ( ( ruleSCState ) | ( ruleInvState ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000100000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000001FFFFC000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000001FE00000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000001B0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0008080000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0260000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0240000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0190000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x02400001FFFFC000L,0x0000000000000008L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0240000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0400080000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x2420080000000230L,0x0000000000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x2400080000000232L,0x0000000000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001000000000030L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000001FFFFC020L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x2400080000000230L,0x0000000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0030060000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0010060000000022L,0x0000000000000004L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0010060000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x1000508000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x00200000000001B0L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x00000000000001B2L});

}
package org.palladiosimulator.xtext.montiarcandcore.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.palladiosimulator.xtext.montiarcandcore.services.MontiArcAndCoreGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMontiArcAndCoreParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_MCQUALIFIEDNAME", "RULE_DOTSTAR", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_SYNC", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'package'", "'boolean'", "'byte'", "'short'", "'int'", "'long'", "'char'", "'float'", "'double'", "'Boolean'", "'Byte'", "'Integer'", "'Long'", "'Char'", "'Double'", "'String'", "'Set'", "'List'", "'Map'", "'Optional'", "'<'", "'>'", "'['", "']'", "'('", "','", "')'", "'classdiagram'", "'{'", "'}'", "'public'", "'class'", "'extends'", "'implements'", "'enum'", "'component'", "'='", "'->'", "'port'", "'in'", "'out'", "'<<'", "'condition'", "'>>'", "'automaton'", "'state'", "'/'", "'=='", "'&&'", "'+'", "'-'", "'*'", "'initial'", "'final'"
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
    public static final int RULE_ID=6;
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
    public static final int RULE_DOTSTAR=5;
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

        public InternalMontiArcAndCoreParser(TokenStream input, MontiArcAndCoreGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MontiArcAndCore";
       	}

       	@Override
       	protected MontiArcAndCoreGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMontiArcAndCore"
    // InternalMontiArcAndCore.g:65:1: entryRuleMontiArcAndCore returns [EObject current=null] : iv_ruleMontiArcAndCore= ruleMontiArcAndCore EOF ;
    public final EObject entryRuleMontiArcAndCore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMontiArcAndCore = null;


        try {
            // InternalMontiArcAndCore.g:65:56: (iv_ruleMontiArcAndCore= ruleMontiArcAndCore EOF )
            // InternalMontiArcAndCore.g:66:2: iv_ruleMontiArcAndCore= ruleMontiArcAndCore EOF
            {
             newCompositeNode(grammarAccess.getMontiArcAndCoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMontiArcAndCore=ruleMontiArcAndCore();

            state._fsp--;

             current =iv_ruleMontiArcAndCore; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMontiArcAndCore"


    // $ANTLR start "ruleMontiArcAndCore"
    // InternalMontiArcAndCore.g:72:1: ruleMontiArcAndCore returns [EObject current=null] : ( ( (lv_classdiagram_0_0= ruleClassDiagramCompilationUnit ) ) ( (lv_montiarcdsl_1_0= ruleMACompilationUnit ) ) ) ;
    public final EObject ruleMontiArcAndCore() throws RecognitionException {
        EObject current = null;

        EObject lv_classdiagram_0_0 = null;

        EObject lv_montiarcdsl_1_0 = null;



        	enterRule();

        try {
            // InternalMontiArcAndCore.g:78:2: ( ( ( (lv_classdiagram_0_0= ruleClassDiagramCompilationUnit ) ) ( (lv_montiarcdsl_1_0= ruleMACompilationUnit ) ) ) )
            // InternalMontiArcAndCore.g:79:2: ( ( (lv_classdiagram_0_0= ruleClassDiagramCompilationUnit ) ) ( (lv_montiarcdsl_1_0= ruleMACompilationUnit ) ) )
            {
            // InternalMontiArcAndCore.g:79:2: ( ( (lv_classdiagram_0_0= ruleClassDiagramCompilationUnit ) ) ( (lv_montiarcdsl_1_0= ruleMACompilationUnit ) ) )
            // InternalMontiArcAndCore.g:80:3: ( (lv_classdiagram_0_0= ruleClassDiagramCompilationUnit ) ) ( (lv_montiarcdsl_1_0= ruleMACompilationUnit ) )
            {
            // InternalMontiArcAndCore.g:80:3: ( (lv_classdiagram_0_0= ruleClassDiagramCompilationUnit ) )
            // InternalMontiArcAndCore.g:81:4: (lv_classdiagram_0_0= ruleClassDiagramCompilationUnit )
            {
            // InternalMontiArcAndCore.g:81:4: (lv_classdiagram_0_0= ruleClassDiagramCompilationUnit )
            // InternalMontiArcAndCore.g:82:5: lv_classdiagram_0_0= ruleClassDiagramCompilationUnit
            {

            					newCompositeNode(grammarAccess.getMontiArcAndCoreAccess().getClassdiagramClassDiagramCompilationUnitParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_classdiagram_0_0=ruleClassDiagramCompilationUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMontiArcAndCoreRule());
            					}
            					set(
            						current,
            						"classdiagram",
            						lv_classdiagram_0_0,
            						"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.ClassDiagramCompilationUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMontiArcAndCore.g:99:3: ( (lv_montiarcdsl_1_0= ruleMACompilationUnit ) )
            // InternalMontiArcAndCore.g:100:4: (lv_montiarcdsl_1_0= ruleMACompilationUnit )
            {
            // InternalMontiArcAndCore.g:100:4: (lv_montiarcdsl_1_0= ruleMACompilationUnit )
            // InternalMontiArcAndCore.g:101:5: lv_montiarcdsl_1_0= ruleMACompilationUnit
            {

            					newCompositeNode(grammarAccess.getMontiArcAndCoreAccess().getMontiarcdslMACompilationUnitParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_montiarcdsl_1_0=ruleMACompilationUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMontiArcAndCoreRule());
            					}
            					set(
            						current,
            						"montiarcdsl",
            						lv_montiarcdsl_1_0,
            						"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.MACompilationUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMontiArcAndCore"


    // $ANTLR start "entryRuleImportStatements"
    // InternalMontiArcAndCore.g:122:1: entryRuleImportStatements returns [EObject current=null] : iv_ruleImportStatements= ruleImportStatements EOF ;
    public final EObject entryRuleImportStatements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportStatements = null;


        try {
            // InternalMontiArcAndCore.g:122:57: (iv_ruleImportStatements= ruleImportStatements EOF )
            // InternalMontiArcAndCore.g:123:2: iv_ruleImportStatements= ruleImportStatements EOF
            {
             newCompositeNode(grammarAccess.getImportStatementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImportStatements=ruleImportStatements();

            state._fsp--;

             current =iv_ruleImportStatements; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportStatements"


    // $ANTLR start "ruleImportStatements"
    // InternalMontiArcAndCore.g:129:1: ruleImportStatements returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importUri_1_0= RULE_MCQUALIFIEDNAME ) ) ( (lv_star_2_0= RULE_DOTSTAR ) )? otherlv_3= ';' ) ;
    public final EObject ruleImportStatements() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importUri_1_0=null;
        Token lv_star_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMontiArcAndCore.g:135:2: ( (otherlv_0= 'import' ( (lv_importUri_1_0= RULE_MCQUALIFIEDNAME ) ) ( (lv_star_2_0= RULE_DOTSTAR ) )? otherlv_3= ';' ) )
            // InternalMontiArcAndCore.g:136:2: (otherlv_0= 'import' ( (lv_importUri_1_0= RULE_MCQUALIFIEDNAME ) ) ( (lv_star_2_0= RULE_DOTSTAR ) )? otherlv_3= ';' )
            {
            // InternalMontiArcAndCore.g:136:2: (otherlv_0= 'import' ( (lv_importUri_1_0= RULE_MCQUALIFIEDNAME ) ) ( (lv_star_2_0= RULE_DOTSTAR ) )? otherlv_3= ';' )
            // InternalMontiArcAndCore.g:137:3: otherlv_0= 'import' ( (lv_importUri_1_0= RULE_MCQUALIFIEDNAME ) ) ( (lv_star_2_0= RULE_DOTSTAR ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getImportStatementsAccess().getImportKeyword_0());
            		
            // InternalMontiArcAndCore.g:141:3: ( (lv_importUri_1_0= RULE_MCQUALIFIEDNAME ) )
            // InternalMontiArcAndCore.g:142:4: (lv_importUri_1_0= RULE_MCQUALIFIEDNAME )
            {
            // InternalMontiArcAndCore.g:142:4: (lv_importUri_1_0= RULE_MCQUALIFIEDNAME )
            // InternalMontiArcAndCore.g:143:5: lv_importUri_1_0= RULE_MCQUALIFIEDNAME
            {
            lv_importUri_1_0=(Token)match(input,RULE_MCQUALIFIEDNAME,FOLLOW_5); 

            					newLeafNode(lv_importUri_1_0, grammarAccess.getImportStatementsAccess().getImportUriMCQUALIFIEDNAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportStatementsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"importUri",
            						lv_importUri_1_0,
            						"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.MCQUALIFIEDNAME");
            				

            }


            }

            // InternalMontiArcAndCore.g:159:3: ( (lv_star_2_0= RULE_DOTSTAR ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_DOTSTAR) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMontiArcAndCore.g:160:4: (lv_star_2_0= RULE_DOTSTAR )
                    {
                    // InternalMontiArcAndCore.g:160:4: (lv_star_2_0= RULE_DOTSTAR )
                    // InternalMontiArcAndCore.g:161:5: lv_star_2_0= RULE_DOTSTAR
                    {
                    lv_star_2_0=(Token)match(input,RULE_DOTSTAR,FOLLOW_6); 

                    					newLeafNode(lv_star_2_0, grammarAccess.getImportStatementsAccess().getStarDOTSTARTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getImportStatementsRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"star",
                    						lv_star_2_0 != null,
                    						"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.DOTSTAR");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getImportStatementsAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportStatements"


    // $ANTLR start "entryRulePackage"
    // InternalMontiArcAndCore.g:185:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalMontiArcAndCore.g:185:48: (iv_rulePackage= rulePackage EOF )
            // InternalMontiArcAndCore.g:186:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalMontiArcAndCore.g:192:1: rulePackage returns [EObject current=null] : (otherlv_0= 'package' ( ( (lv_name_1_1= RULE_MCQUALIFIEDNAME | lv_name_1_2= RULE_ID ) ) ) otherlv_2= ';' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMontiArcAndCore.g:198:2: ( (otherlv_0= 'package' ( ( (lv_name_1_1= RULE_MCQUALIFIEDNAME | lv_name_1_2= RULE_ID ) ) ) otherlv_2= ';' ) )
            // InternalMontiArcAndCore.g:199:2: (otherlv_0= 'package' ( ( (lv_name_1_1= RULE_MCQUALIFIEDNAME | lv_name_1_2= RULE_ID ) ) ) otherlv_2= ';' )
            {
            // InternalMontiArcAndCore.g:199:2: (otherlv_0= 'package' ( ( (lv_name_1_1= RULE_MCQUALIFIEDNAME | lv_name_1_2= RULE_ID ) ) ) otherlv_2= ';' )
            // InternalMontiArcAndCore.g:200:3: otherlv_0= 'package' ( ( (lv_name_1_1= RULE_MCQUALIFIEDNAME | lv_name_1_2= RULE_ID ) ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
            		
            // InternalMontiArcAndCore.g:204:3: ( ( (lv_name_1_1= RULE_MCQUALIFIEDNAME | lv_name_1_2= RULE_ID ) ) )
            // InternalMontiArcAndCore.g:205:4: ( (lv_name_1_1= RULE_MCQUALIFIEDNAME | lv_name_1_2= RULE_ID ) )
            {
            // InternalMontiArcAndCore.g:205:4: ( (lv_name_1_1= RULE_MCQUALIFIEDNAME | lv_name_1_2= RULE_ID ) )
            // InternalMontiArcAndCore.g:206:5: (lv_name_1_1= RULE_MCQUALIFIEDNAME | lv_name_1_2= RULE_ID )
            {
            // InternalMontiArcAndCore.g:206:5: (lv_name_1_1= RULE_MCQUALIFIEDNAME | lv_name_1_2= RULE_ID )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_MCQUALIFIEDNAME) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMontiArcAndCore.g:207:6: lv_name_1_1= RULE_MCQUALIFIEDNAME
                    {
                    lv_name_1_1=(Token)match(input,RULE_MCQUALIFIEDNAME,FOLLOW_6); 

                    						newLeafNode(lv_name_1_1, grammarAccess.getPackageAccess().getNameMCQUALIFIEDNAMETerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPackageRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_1,
                    							"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.MCQUALIFIEDNAME");
                    					

                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:222:6: lv_name_1_2= RULE_ID
                    {
                    lv_name_1_2=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(lv_name_1_2, grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPackageRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_2,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleType"
    // InternalMontiArcAndCore.g:247:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalMontiArcAndCore.g:247:45: (iv_ruleType= ruleType EOF )
            // InternalMontiArcAndCore.g:248:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMontiArcAndCore.g:254:1: ruleType returns [EObject current=null] : (this_MCPrimitiveType_0= ruleMCPrimitiveType | this_MCArrayType_1= ruleMCArrayType | this_MCObjectType_2= ruleMCObjectType | this_MCCollectionType_3= ruleMCCollectionType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_MCPrimitiveType_0 = null;

        EObject this_MCArrayType_1 = null;

        EObject this_MCObjectType_2 = null;

        EObject this_MCCollectionType_3 = null;



        	enterRule();

        try {
            // InternalMontiArcAndCore.g:260:2: ( (this_MCPrimitiveType_0= ruleMCPrimitiveType | this_MCArrayType_1= ruleMCArrayType | this_MCObjectType_2= ruleMCObjectType | this_MCCollectionType_3= ruleMCCollectionType ) )
            // InternalMontiArcAndCore.g:261:2: (this_MCPrimitiveType_0= ruleMCPrimitiveType | this_MCArrayType_1= ruleMCArrayType | this_MCObjectType_2= ruleMCObjectType | this_MCCollectionType_3= ruleMCCollectionType )
            {
            // InternalMontiArcAndCore.g:261:2: (this_MCPrimitiveType_0= ruleMCPrimitiveType | this_MCArrayType_1= ruleMCArrayType | this_MCObjectType_2= ruleMCObjectType | this_MCCollectionType_3= ruleMCCollectionType )
            int alt3=4;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalMontiArcAndCore.g:262:3: this_MCPrimitiveType_0= ruleMCPrimitiveType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getMCPrimitiveTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MCPrimitiveType_0=ruleMCPrimitiveType();

                    state._fsp--;


                    			current = this_MCPrimitiveType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:271:3: this_MCArrayType_1= ruleMCArrayType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getMCArrayTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MCArrayType_1=ruleMCArrayType();

                    state._fsp--;


                    			current = this_MCArrayType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMontiArcAndCore.g:280:3: this_MCObjectType_2= ruleMCObjectType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getMCObjectTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MCObjectType_2=ruleMCObjectType();

                    state._fsp--;


                    			current = this_MCObjectType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMontiArcAndCore.g:289:3: this_MCCollectionType_3= ruleMCCollectionType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getMCCollectionTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_MCCollectionType_3=ruleMCCollectionType();

                    state._fsp--;


                    			current = this_MCCollectionType_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleMCPrimitiveType"
    // InternalMontiArcAndCore.g:301:1: entryRuleMCPrimitiveType returns [EObject current=null] : iv_ruleMCPrimitiveType= ruleMCPrimitiveType EOF ;
    public final EObject entryRuleMCPrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMCPrimitiveType = null;


        try {
            // InternalMontiArcAndCore.g:301:56: (iv_ruleMCPrimitiveType= ruleMCPrimitiveType EOF )
            // InternalMontiArcAndCore.g:302:2: iv_ruleMCPrimitiveType= ruleMCPrimitiveType EOF
            {
             newCompositeNode(grammarAccess.getMCPrimitiveTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMCPrimitiveType=ruleMCPrimitiveType();

            state._fsp--;

             current =iv_ruleMCPrimitiveType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMCPrimitiveType"


    // $ANTLR start "ruleMCPrimitiveType"
    // InternalMontiArcAndCore.g:308:1: ruleMCPrimitiveType returns [EObject current=null] : ( ( (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' ) ) ) ;
    public final EObject ruleMCPrimitiveType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        Token lv_type_0_4=null;
        Token lv_type_0_5=null;
        Token lv_type_0_6=null;
        Token lv_type_0_7=null;
        Token lv_type_0_8=null;


        	enterRule();

        try {
            // InternalMontiArcAndCore.g:314:2: ( ( ( (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' ) ) ) )
            // InternalMontiArcAndCore.g:315:2: ( ( (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' ) ) )
            {
            // InternalMontiArcAndCore.g:315:2: ( ( (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' ) ) )
            // InternalMontiArcAndCore.g:316:3: ( (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' ) )
            {
            // InternalMontiArcAndCore.g:316:3: ( (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' ) )
            // InternalMontiArcAndCore.g:317:4: (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' )
            {
            // InternalMontiArcAndCore.g:317:4: (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' )
            int alt4=8;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                alt4=2;
                }
                break;
            case 19:
                {
                alt4=3;
                }
                break;
            case 20:
                {
                alt4=4;
                }
                break;
            case 21:
                {
                alt4=5;
                }
                break;
            case 22:
                {
                alt4=6;
                }
                break;
            case 23:
                {
                alt4=7;
                }
                break;
            case 24:
                {
                alt4=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMontiArcAndCore.g:318:5: lv_type_0_1= 'boolean'
                    {
                    lv_type_0_1=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(lv_type_0_1, grammarAccess.getMCPrimitiveTypeAccess().getTypeBooleanKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:329:5: lv_type_0_2= 'byte'
                    {
                    lv_type_0_2=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(lv_type_0_2, grammarAccess.getMCPrimitiveTypeAccess().getTypeByteKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalMontiArcAndCore.g:340:5: lv_type_0_3= 'short'
                    {
                    lv_type_0_3=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(lv_type_0_3, grammarAccess.getMCPrimitiveTypeAccess().getTypeShortKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalMontiArcAndCore.g:351:5: lv_type_0_4= 'int'
                    {
                    lv_type_0_4=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_type_0_4, grammarAccess.getMCPrimitiveTypeAccess().getTypeIntKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalMontiArcAndCore.g:362:5: lv_type_0_5= 'long'
                    {
                    lv_type_0_5=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_type_0_5, grammarAccess.getMCPrimitiveTypeAccess().getTypeLongKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalMontiArcAndCore.g:373:5: lv_type_0_6= 'char'
                    {
                    lv_type_0_6=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_type_0_6, grammarAccess.getMCPrimitiveTypeAccess().getTypeCharKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_6, null);
                    				

                    }
                    break;
                case 7 :
                    // InternalMontiArcAndCore.g:384:5: lv_type_0_7= 'float'
                    {
                    lv_type_0_7=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_type_0_7, grammarAccess.getMCPrimitiveTypeAccess().getTypeFloatKeyword_0_6());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_7, null);
                    				

                    }
                    break;
                case 8 :
                    // InternalMontiArcAndCore.g:395:5: lv_type_0_8= 'double'
                    {
                    lv_type_0_8=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_type_0_8, grammarAccess.getMCPrimitiveTypeAccess().getTypeDoubleKeyword_0_7());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_8, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMCPrimitiveType"


    // $ANTLR start "entryRuleMCObjectType"
    // InternalMontiArcAndCore.g:411:1: entryRuleMCObjectType returns [EObject current=null] : iv_ruleMCObjectType= ruleMCObjectType EOF ;
    public final EObject entryRuleMCObjectType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMCObjectType = null;


        try {
            // InternalMontiArcAndCore.g:411:53: (iv_ruleMCObjectType= ruleMCObjectType EOF )
            // InternalMontiArcAndCore.g:412:2: iv_ruleMCObjectType= ruleMCObjectType EOF
            {
             newCompositeNode(grammarAccess.getMCObjectTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMCObjectType=ruleMCObjectType();

            state._fsp--;

             current =iv_ruleMCObjectType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMCObjectType"


    // $ANTLR start "ruleMCObjectType"
    // InternalMontiArcAndCore.g:418:1: ruleMCObjectType returns [EObject current=null] : ( ( (lv_type_0_1= 'Boolean' | lv_type_0_2= 'Byte' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Long' | lv_type_0_5= 'Char' | lv_type_0_6= 'Double' | lv_type_0_7= 'String' ) ) ) ;
    public final EObject ruleMCObjectType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        Token lv_type_0_4=null;
        Token lv_type_0_5=null;
        Token lv_type_0_6=null;
        Token lv_type_0_7=null;


        	enterRule();

        try {
            // InternalMontiArcAndCore.g:424:2: ( ( ( (lv_type_0_1= 'Boolean' | lv_type_0_2= 'Byte' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Long' | lv_type_0_5= 'Char' | lv_type_0_6= 'Double' | lv_type_0_7= 'String' ) ) ) )
            // InternalMontiArcAndCore.g:425:2: ( ( (lv_type_0_1= 'Boolean' | lv_type_0_2= 'Byte' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Long' | lv_type_0_5= 'Char' | lv_type_0_6= 'Double' | lv_type_0_7= 'String' ) ) )
            {
            // InternalMontiArcAndCore.g:425:2: ( ( (lv_type_0_1= 'Boolean' | lv_type_0_2= 'Byte' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Long' | lv_type_0_5= 'Char' | lv_type_0_6= 'Double' | lv_type_0_7= 'String' ) ) )
            // InternalMontiArcAndCore.g:426:3: ( (lv_type_0_1= 'Boolean' | lv_type_0_2= 'Byte' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Long' | lv_type_0_5= 'Char' | lv_type_0_6= 'Double' | lv_type_0_7= 'String' ) )
            {
            // InternalMontiArcAndCore.g:426:3: ( (lv_type_0_1= 'Boolean' | lv_type_0_2= 'Byte' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Long' | lv_type_0_5= 'Char' | lv_type_0_6= 'Double' | lv_type_0_7= 'String' ) )
            // InternalMontiArcAndCore.g:427:4: (lv_type_0_1= 'Boolean' | lv_type_0_2= 'Byte' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Long' | lv_type_0_5= 'Char' | lv_type_0_6= 'Double' | lv_type_0_7= 'String' )
            {
            // InternalMontiArcAndCore.g:427:4: (lv_type_0_1= 'Boolean' | lv_type_0_2= 'Byte' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Long' | lv_type_0_5= 'Char' | lv_type_0_6= 'Double' | lv_type_0_7= 'String' )
            int alt5=7;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt5=1;
                }
                break;
            case 26:
                {
                alt5=2;
                }
                break;
            case 27:
                {
                alt5=3;
                }
                break;
            case 28:
                {
                alt5=4;
                }
                break;
            case 29:
                {
                alt5=5;
                }
                break;
            case 30:
                {
                alt5=6;
                }
                break;
            case 31:
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMontiArcAndCore.g:428:5: lv_type_0_1= 'Boolean'
                    {
                    lv_type_0_1=(Token)match(input,25,FOLLOW_2); 

                    					newLeafNode(lv_type_0_1, grammarAccess.getMCObjectTypeAccess().getTypeBooleanKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCObjectTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:439:5: lv_type_0_2= 'Byte'
                    {
                    lv_type_0_2=(Token)match(input,26,FOLLOW_2); 

                    					newLeafNode(lv_type_0_2, grammarAccess.getMCObjectTypeAccess().getTypeByteKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCObjectTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalMontiArcAndCore.g:450:5: lv_type_0_3= 'Integer'
                    {
                    lv_type_0_3=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(lv_type_0_3, grammarAccess.getMCObjectTypeAccess().getTypeIntegerKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCObjectTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalMontiArcAndCore.g:461:5: lv_type_0_4= 'Long'
                    {
                    lv_type_0_4=(Token)match(input,28,FOLLOW_2); 

                    					newLeafNode(lv_type_0_4, grammarAccess.getMCObjectTypeAccess().getTypeLongKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCObjectTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalMontiArcAndCore.g:472:5: lv_type_0_5= 'Char'
                    {
                    lv_type_0_5=(Token)match(input,29,FOLLOW_2); 

                    					newLeafNode(lv_type_0_5, grammarAccess.getMCObjectTypeAccess().getTypeCharKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCObjectTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalMontiArcAndCore.g:483:5: lv_type_0_6= 'Double'
                    {
                    lv_type_0_6=(Token)match(input,30,FOLLOW_2); 

                    					newLeafNode(lv_type_0_6, grammarAccess.getMCObjectTypeAccess().getTypeDoubleKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCObjectTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_6, null);
                    				

                    }
                    break;
                case 7 :
                    // InternalMontiArcAndCore.g:494:5: lv_type_0_7= 'String'
                    {
                    lv_type_0_7=(Token)match(input,31,FOLLOW_2); 

                    					newLeafNode(lv_type_0_7, grammarAccess.getMCObjectTypeAccess().getTypeStringKeyword_0_6());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCObjectTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_7, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMCObjectType"


    // $ANTLR start "entryRuleMCCollectionType"
    // InternalMontiArcAndCore.g:510:1: entryRuleMCCollectionType returns [EObject current=null] : iv_ruleMCCollectionType= ruleMCCollectionType EOF ;
    public final EObject entryRuleMCCollectionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMCCollectionType = null;


        try {
            // InternalMontiArcAndCore.g:510:57: (iv_ruleMCCollectionType= ruleMCCollectionType EOF )
            // InternalMontiArcAndCore.g:511:2: iv_ruleMCCollectionType= ruleMCCollectionType EOF
            {
             newCompositeNode(grammarAccess.getMCCollectionTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMCCollectionType=ruleMCCollectionType();

            state._fsp--;

             current =iv_ruleMCCollectionType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMCCollectionType"


    // $ANTLR start "ruleMCCollectionType"
    // InternalMontiArcAndCore.g:517:1: ruleMCCollectionType returns [EObject current=null] : ( ( ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'List' | lv_collection_0_3= 'Map' | lv_collection_0_4= 'Optional' ) ) ) otherlv_1= '<' ( (lv_innerType_2_0= ruleType ) ) otherlv_3= '>' ) ;
    public final EObject ruleMCCollectionType() throws RecognitionException {
        EObject current = null;

        Token lv_collection_0_1=null;
        Token lv_collection_0_2=null;
        Token lv_collection_0_3=null;
        Token lv_collection_0_4=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_innerType_2_0 = null;



        	enterRule();

        try {
            // InternalMontiArcAndCore.g:523:2: ( ( ( ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'List' | lv_collection_0_3= 'Map' | lv_collection_0_4= 'Optional' ) ) ) otherlv_1= '<' ( (lv_innerType_2_0= ruleType ) ) otherlv_3= '>' ) )
            // InternalMontiArcAndCore.g:524:2: ( ( ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'List' | lv_collection_0_3= 'Map' | lv_collection_0_4= 'Optional' ) ) ) otherlv_1= '<' ( (lv_innerType_2_0= ruleType ) ) otherlv_3= '>' )
            {
            // InternalMontiArcAndCore.g:524:2: ( ( ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'List' | lv_collection_0_3= 'Map' | lv_collection_0_4= 'Optional' ) ) ) otherlv_1= '<' ( (lv_innerType_2_0= ruleType ) ) otherlv_3= '>' )
            // InternalMontiArcAndCore.g:525:3: ( ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'List' | lv_collection_0_3= 'Map' | lv_collection_0_4= 'Optional' ) ) ) otherlv_1= '<' ( (lv_innerType_2_0= ruleType ) ) otherlv_3= '>'
            {
            // InternalMontiArcAndCore.g:525:3: ( ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'List' | lv_collection_0_3= 'Map' | lv_collection_0_4= 'Optional' ) ) )
            // InternalMontiArcAndCore.g:526:4: ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'List' | lv_collection_0_3= 'Map' | lv_collection_0_4= 'Optional' ) )
            {
            // InternalMontiArcAndCore.g:526:4: ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'List' | lv_collection_0_3= 'Map' | lv_collection_0_4= 'Optional' ) )
            // InternalMontiArcAndCore.g:527:5: (lv_collection_0_1= 'Set' | lv_collection_0_2= 'List' | lv_collection_0_3= 'Map' | lv_collection_0_4= 'Optional' )
            {
            // InternalMontiArcAndCore.g:527:5: (lv_collection_0_1= 'Set' | lv_collection_0_2= 'List' | lv_collection_0_3= 'Map' | lv_collection_0_4= 'Optional' )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt6=1;
                }
                break;
            case 33:
                {
                alt6=2;
                }
                break;
            case 34:
                {
                alt6=3;
                }
                break;
            case 35:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMontiArcAndCore.g:528:6: lv_collection_0_1= 'Set'
                    {
                    lv_collection_0_1=(Token)match(input,32,FOLLOW_8); 

                    						newLeafNode(lv_collection_0_1, grammarAccess.getMCCollectionTypeAccess().getCollectionSetKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMCCollectionTypeRule());
                    						}
                    						setWithLastConsumed(current, "collection", lv_collection_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:539:6: lv_collection_0_2= 'List'
                    {
                    lv_collection_0_2=(Token)match(input,33,FOLLOW_8); 

                    						newLeafNode(lv_collection_0_2, grammarAccess.getMCCollectionTypeAccess().getCollectionListKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMCCollectionTypeRule());
                    						}
                    						setWithLastConsumed(current, "collection", lv_collection_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalMontiArcAndCore.g:550:6: lv_collection_0_3= 'Map'
                    {
                    lv_collection_0_3=(Token)match(input,34,FOLLOW_8); 

                    						newLeafNode(lv_collection_0_3, grammarAccess.getMCCollectionTypeAccess().getCollectionMapKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMCCollectionTypeRule());
                    						}
                    						setWithLastConsumed(current, "collection", lv_collection_0_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalMontiArcAndCore.g:561:6: lv_collection_0_4= 'Optional'
                    {
                    lv_collection_0_4=(Token)match(input,35,FOLLOW_8); 

                    						newLeafNode(lv_collection_0_4, grammarAccess.getMCCollectionTypeAccess().getCollectionOptionalKeyword_0_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMCCollectionTypeRule());
                    						}
                    						setWithLastConsumed(current, "collection", lv_collection_0_4, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getMCCollectionTypeAccess().getLessThanSignKeyword_1());
            		
            // InternalMontiArcAndCore.g:578:3: ( (lv_innerType_2_0= ruleType ) )
            // InternalMontiArcAndCore.g:579:4: (lv_innerType_2_0= ruleType )
            {
            // InternalMontiArcAndCore.g:579:4: (lv_innerType_2_0= ruleType )
            // InternalMontiArcAndCore.g:580:5: lv_innerType_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getMCCollectionTypeAccess().getInnerTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_innerType_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMCCollectionTypeRule());
            					}
            					set(
            						current,
            						"innerType",
            						lv_innerType_2_0,
            						"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getMCCollectionTypeAccess().getGreaterThanSignKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMCCollectionType"


    // $ANTLR start "entryRuleMCArrayType"
    // InternalMontiArcAndCore.g:605:1: entryRuleMCArrayType returns [EObject current=null] : iv_ruleMCArrayType= ruleMCArrayType EOF ;
    public final EObject entryRuleMCArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMCArrayType = null;


        try {
            // InternalMontiArcAndCore.g:605:52: (iv_ruleMCArrayType= ruleMCArrayType EOF )
            // InternalMontiArcAndCore.g:606:2: iv_ruleMCArrayType= ruleMCArrayType EOF
            {
             newCompositeNode(grammarAccess.getMCArrayTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMCArrayType=ruleMCArrayType();

            state._fsp--;

             current =iv_ruleMCArrayType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMCArrayType"


    // $ANTLR start "ruleMCArrayType"
    // InternalMontiArcAndCore.g:612:1: ruleMCArrayType returns [EObject current=null] : (this_MCPrimitiveType_0= ruleMCPrimitiveType otherlv_1= '[' otherlv_2= ']' ) ;
    public final EObject ruleMCArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject this_MCPrimitiveType_0 = null;



        	enterRule();

        try {
            // InternalMontiArcAndCore.g:618:2: ( (this_MCPrimitiveType_0= ruleMCPrimitiveType otherlv_1= '[' otherlv_2= ']' ) )
            // InternalMontiArcAndCore.g:619:2: (this_MCPrimitiveType_0= ruleMCPrimitiveType otherlv_1= '[' otherlv_2= ']' )
            {
            // InternalMontiArcAndCore.g:619:2: (this_MCPrimitiveType_0= ruleMCPrimitiveType otherlv_1= '[' otherlv_2= ']' )
            // InternalMontiArcAndCore.g:620:3: this_MCPrimitiveType_0= ruleMCPrimitiveType otherlv_1= '[' otherlv_2= ']'
            {

            			newCompositeNode(grammarAccess.getMCArrayTypeAccess().getMCPrimitiveTypeParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_MCPrimitiveType_0=ruleMCPrimitiveType();

            state._fsp--;


            			current = this_MCPrimitiveType_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,38,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getMCArrayTypeAccess().getLeftSquareBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getMCArrayTypeAccess().getRightSquareBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMCArrayType"


    // $ANTLR start "entryRuleExpression"
    // InternalMontiArcAndCore.g:640:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMontiArcAndCore.g:640:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMontiArcAndCore.g:641:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMontiArcAndCore.g:647:1: ruleExpression returns [EObject current=null] : (this_NameExpression_0= ruleNameExpression | this_LiteralExpression_1= ruleLiteralExpression | this_BinaryExpression_2= ruleBinaryExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NameExpression_0 = null;

        EObject this_LiteralExpression_1 = null;

        EObject this_BinaryExpression_2 = null;



        	enterRule();

        try {
            // InternalMontiArcAndCore.g:653:2: ( (this_NameExpression_0= ruleNameExpression | this_LiteralExpression_1= ruleLiteralExpression | this_BinaryExpression_2= ruleBinaryExpression ) )
            // InternalMontiArcAndCore.g:654:2: (this_NameExpression_0= ruleNameExpression | this_LiteralExpression_1= ruleLiteralExpression | this_BinaryExpression_2= ruleBinaryExpression )
            {
            // InternalMontiArcAndCore.g:654:2: (this_NameExpression_0= ruleNameExpression | this_LiteralExpression_1= ruleLiteralExpression | this_BinaryExpression_2= ruleBinaryExpression )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==EOF||LA7_1==15||LA7_1==39||(LA7_1>=41 && LA7_1<=42)) ) {
                    alt7=1;
                }
                else if ( ((LA7_1>=36 && LA7_1<=37)||(LA7_1>=62 && LA7_1<=67)) ) {
                    alt7=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_MCQUALIFIEDNAME:
                {
                int LA7_2 = input.LA(2);

                if ( ((LA7_2>=36 && LA7_2<=37)||(LA7_2>=62 && LA7_2<=67)) ) {
                    alt7=3;
                }
                else if ( (LA7_2==EOF||LA7_2==15||LA7_2==39||(LA7_2>=41 && LA7_2<=42)) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA7_3 = input.LA(2);

                if ( (LA7_3==EOF||LA7_3==15||LA7_3==39||(LA7_3>=41 && LA7_3<=42)) ) {
                    alt7=2;
                }
                else if ( ((LA7_3>=36 && LA7_3<=37)||(LA7_3>=62 && LA7_3<=67)) ) {
                    alt7=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA7_4 = input.LA(2);

                if ( (LA7_4==EOF||LA7_4==15||LA7_4==39||(LA7_4>=41 && LA7_4<=42)) ) {
                    alt7=2;
                }
                else if ( ((LA7_4>=36 && LA7_4<=37)||(LA7_4>=62 && LA7_4<=67)) ) {
                    alt7=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMontiArcAndCore.g:655:3: this_NameExpression_0= ruleNameExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getNameExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NameExpression_0=ruleNameExpression();

                    state._fsp--;


                    			current = this_NameExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:664:3: this_LiteralExpression_1= ruleLiteralExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getLiteralExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteralExpression_1=ruleLiteralExpression();

                    state._fsp--;


                    			current = this_LiteralExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMontiArcAndCore.g:673:3: this_BinaryExpression_2= ruleBinaryExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getBinaryExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BinaryExpression_2=ruleBinaryExpression();

                    state._fsp--;


                    			current = this_BinaryExpression_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleLiteralExpression"
    // InternalMontiArcAndCore.g:685:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalMontiArcAndCore.g:685:58: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalMontiArcAndCore.g:686:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
            {
             newCompositeNode(grammarAccess.getLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteralExpression=ruleLiteralExpression();

            state._fsp--;

             current =iv_ruleLiteralExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralExpression"


    // $ANTLR start "ruleLiteralExpression"
    // InternalMontiArcAndCore.g:692:1: ruleLiteralExpression returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_StringLiteral_1 = null;



        	enterRule();

        try {
            // InternalMontiArcAndCore.g:698:2: ( (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral ) )
            // InternalMontiArcAndCore.g:699:2: (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral )
            {
            // InternalMontiArcAndCore.g:699:2: (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_STRING) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMontiArcAndCore.g:700:3: this_NumberLiteral_0= ruleNumberLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getNumberLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberLiteral_0=ruleNumberLiteral();

                    state._fsp--;


                    			current = this_NumberLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:709:3: this_StringLiteral_1= ruleStringLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getStringLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_1=ruleStringLiteral();

                    state._fsp--;


                    			current = this_StringLiteral_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralExpression"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalMontiArcAndCore.g:721:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // InternalMontiArcAndCore.g:721:54: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalMontiArcAndCore.g:722:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;

             current =iv_ruleNumberLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalMontiArcAndCore.g:728:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_literal_0_0= RULE_INT ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_literal_0_0=null;


        	enterRule();

        try {
            // InternalMontiArcAndCore.g:734:2: ( ( (lv_literal_0_0= RULE_INT ) ) )
            // InternalMontiArcAndCore.g:735:2: ( (lv_literal_0_0= RULE_INT ) )
            {
            // InternalMontiArcAndCore.g:735:2: ( (lv_literal_0_0= RULE_INT ) )
            // InternalMontiArcAndCore.g:736:3: (lv_literal_0_0= RULE_INT )
            {
            // InternalMontiArcAndCore.g:736:3: (lv_literal_0_0= RULE_INT )
            // InternalMontiArcAndCore.g:737:4: lv_literal_0_0= RULE_INT
            {
            lv_literal_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_literal_0_0, grammarAccess.getNumberLiteralAccess().getLiteralINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNumberLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"literal",
            					lv_literal_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalMontiArcAndCore.g:756:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalMontiArcAndCore.g:756:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalMontiArcAndCore.g:757:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalMontiArcAndCore.g:763:1: ruleStringLiteral returns [EObject current=null] : ( (lv_literal_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_literal_0_0=null;


        	enterRule();

        try {
            // InternalMontiArcAndCore.g:769:2: ( ( (lv_literal_0_0= RULE_STRING ) ) )
            // InternalMontiArcAndCore.g:770:2: ( (lv_literal_0_0= RULE_STRING ) )
            {
            // InternalMontiArcAndCore.g:770:2: ( (lv_literal_0_0= RULE_STRING ) )
            // InternalMontiArcAndCore.g:771:3: (lv_literal_0_0= RULE_STRING )
            {
            // InternalMontiArcAndCore.g:771:3: (lv_literal_0_0= RULE_STRING )
            // InternalMontiArcAndCore.g:772:4: lv_literal_0_0= RULE_STRING
            {
            lv_literal_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_literal_0_0, grammarAccess.getStringLiteralAccess().getLiteralSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"literal",
            					lv_literal_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleNameExpression"
    // InternalMontiArcAndCore.g:791:1: entryRuleNameExpression returns [EObject current=null] : iv_ruleNameExpression= ruleNameExpression EOF ;
    public final EObject entryRuleNameExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameExpression = null;


        try {
            // InternalMontiArcAndCore.g:791:55: (iv_ruleNameExpression= ruleNameExpression EOF )
            // InternalMontiArcAndCore.g:792:2: iv_ruleNameExpression= ruleNameExpression EOF
            {
             newCompositeNode(grammarAccess.getNameExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNameExpression=ruleNameExpression();

            state._fsp--;

             current =iv_ruleNameExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNameExpression"


    // $ANTLR start "ruleNameExpression"
    // InternalMontiArcAndCore.g:798:1: ruleNameExpression returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_qualifiedname_1_0= RULE_MCQUALIFIEDNAME ) ) ) ;
    public final EObject ruleNameExpression() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_qualifiedname_1_0=null;


        	enterRule();

        try {
            // InternalMontiArcAndCore.g:804:2: ( ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_qualifiedname_1_0= RULE_MCQUALIFIEDNAME ) ) ) )
            // InternalMontiArcAndCore.g:805:2: ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_qualifiedname_1_0= RULE_MCQUALIFIEDNAME ) ) )
            {
            // InternalMontiArcAndCore.g:805:2: ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_qualifiedname_1_0= RULE_MCQUALIFIEDNAME ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_MCQUALIFIEDNAME) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMontiArcAndCore.g:806:3: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // InternalMontiArcAndCore.g:806:3: ( (lv_name_0_0= RULE_ID ) )
                    // InternalMontiArcAndCore.g:807:4: (lv_name_0_0= RULE_ID )
                    {
                    // InternalMontiArcAndCore.g:807:4: (lv_name_0_0= RULE_ID )
                    // InternalMontiArcAndCore.g:808:5: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_0_0, grammarAccess.getNameExpressionAccess().getNameIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNameExpressionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:825:3: ( (lv_qualifiedname_1_0= RULE_MCQUALIFIEDNAME ) )
                    {
                    // InternalMontiArcAndCore.g:825:3: ( (lv_qualifiedname_1_0= RULE_MCQUALIFIEDNAME ) )
                    // InternalMontiArcAndCore.g:826:4: (lv_qualifiedname_1_0= RULE_MCQUALIFIEDNAME )
                    {
                    // InternalMontiArcAndCore.g:826:4: (lv_qualifiedname_1_0= RULE_MCQUALIFIEDNAME )
                    // InternalMontiArcAndCore.g:827:5: lv_qualifiedname_1_0= RULE_MCQUALIFIEDNAME
                    {
                    lv_qualifiedname_1_0=(Token)match(input,RULE_MCQUALIFIEDNAME,FOLLOW_2); 

                    					newLeafNode(lv_qualifiedname_1_0, grammarAccess.getNameExpressionAccess().getQualifiednameMCQUALIFIEDNAMETerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNameExpressionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"qualifiedname",
                    						lv_qualifiedname_1_0,
                    						"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.MCQUALIFIEDNAME");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNameExpression"


    // $ANTLR start "entryRuleBinaryExpression"
    // InternalMontiArcAndCore.g:847:1: entryRuleBinaryExpression returns [EObject current=null] : iv_ruleBinaryExpression= ruleBinaryExpression EOF ;
    public final EObject entryRuleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpression = null;


        try {
            // InternalMontiArcAndCore.g:847:57: (iv_ruleBinaryExpression= ruleBinaryExpression EOF )
            // InternalMontiArcAndCore.g:848:2: iv_ruleBinaryExpression= ruleBinaryExpression EOF
            {
             newCompositeNode(grammarAccess.getBinaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaryExpression=ruleBinaryExpression();

            state._fsp--;

             current =iv_ruleBinaryExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryExpression"


    // $ANTLR start "ruleBinaryExpression"
    // InternalMontiArcAndCore.g:854:1: ruleBinaryExpression returns [EObject current=null] : ( ( ( (lv_literal1_0_1= ruleLiteralExpression | lv_literal1_0_2= ruleNameExpression ) ) ) ( (lv_op_1_0= ruleOperator ) ) ( ( (lv_literal2_2_1= ruleLiteralExpression | lv_literal2_2_2= ruleNameExpression ) ) ) ) ;
    public final EObject ruleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_literal1_0_1 = null;

        EObject lv_literal1_0_2 = null;

        Enumerator lv_op_1_0 = null;

        EObject lv_literal2_2_1 = null;

        EObject lv_literal2_2_2 = null;



        	enterRule();

        try {
            // InternalMontiArcAndCore.g:860:2: ( ( ( ( (lv_literal1_0_1= ruleLiteralExpression | lv_literal1_0_2= ruleNameExpression ) ) ) ( (lv_op_1_0= ruleOperator ) ) ( ( (lv_literal2_2_1= ruleLiteralExpression | lv_literal2_2_2= ruleNameExpression ) ) ) ) )
            // InternalMontiArcAndCore.g:861:2: ( ( ( (lv_literal1_0_1= ruleLiteralExpression | lv_literal1_0_2= ruleNameExpression ) ) ) ( (lv_op_1_0= ruleOperator ) ) ( ( (lv_literal2_2_1= ruleLiteralExpression | lv_literal2_2_2= ruleNameExpression ) ) ) )
            {
            // InternalMontiArcAndCore.g:861:2: ( ( ( (lv_literal1_0_1= ruleLiteralExpression | lv_literal1_0_2= ruleNameExpression ) ) ) ( (lv_op_1_0= ruleOperator ) ) ( ( (lv_literal2_2_1= ruleLiteralExpression | lv_literal2_2_2= ruleNameExpression ) ) ) )
            // InternalMontiArcAndCore.g:862:3: ( ( (lv_literal1_0_1= ruleLiteralExpression | lv_literal1_0_2= ruleNameExpression ) ) ) ( (lv_op_1_0= ruleOperator ) ) ( ( (lv_literal2_2_1= ruleLiteralExpression | lv_literal2_2_2= ruleNameExpression ) ) )
            {
            // InternalMontiArcAndCore.g:862:3: ( ( (lv_literal1_0_1= ruleLiteralExpression | lv_literal1_0_2= ruleNameExpression ) ) )
            // InternalMontiArcAndCore.g:863:4: ( (lv_literal1_0_1= ruleLiteralExpression | lv_literal1_0_2= ruleNameExpression ) )
            {
            // InternalMontiArcAndCore.g:863:4: ( (lv_literal1_0_1= ruleLiteralExpression | lv_literal1_0_2= ruleNameExpression ) )
            // InternalMontiArcAndCore.g:864:5: (lv_literal1_0_1= ruleLiteralExpression | lv_literal1_0_2= ruleNameExpression )
            {
            // InternalMontiArcAndCore.g:864:5: (lv_literal1_0_1= ruleLiteralExpression | lv_literal1_0_2= ruleNameExpression )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_INT && LA10_0<=RULE_STRING)) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_MCQUALIFIEDNAME||LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMontiArcAndCore.g:865:6: lv_literal1_0_1= ruleLiteralExpression
                    {

                    						newCompositeNode(grammarAccess.getBinaryExpressionAccess().getLiteral1LiteralExpressionParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_literal1_0_1=ruleLiteralExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"literal1",
                    							lv_literal1_0_1,
                    							"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.LiteralExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:881:6: lv_literal1_0_2= ruleNameExpression
                    {

                    						newCompositeNode(grammarAccess.getBinaryExpressionAccess().getLiteral1NameExpressionParserRuleCall_0_0_1());
                    					
                    pushFollow(FOLLOW_13);
                    lv_literal1_0_2=ruleNameExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"literal1",
                    							lv_literal1_0_2,
                    							"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.NameExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalMontiArcAndCore.g:899:3: ( (lv_op_1_0= ruleOperator ) )
            // InternalMontiArcAndCore.g:900:4: (lv_op_1_0= ruleOperator )
            {
            // InternalMontiArcAndCore.g:900:4: (lv_op_1_0= ruleOperator )
            // InternalMontiArcAndCore.g:901:5: lv_op_1_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOpOperatorEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_op_1_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_1_0,
            						"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMontiArcAndCore.g:918:3: ( ( (lv_literal2_2_1= ruleLiteralExpression | lv_literal2_2_2= ruleNameExpression ) ) )
            // InternalMontiArcAndCore.g:919:4: ( (lv_literal2_2_1= ruleLiteralExpression | lv_literal2_2_2= ruleNameExpression ) )
            {
            // InternalMontiArcAndCore.g:919:4: ( (lv_literal2_2_1= ruleLiteralExpression | lv_literal2_2_2= ruleNameExpression ) )
            // InternalMontiArcAndCore.g:920:5: (lv_literal2_2_1= ruleLiteralExpression | lv_literal2_2_2= ruleNameExpression )
            {
            // InternalMontiArcAndCore.g:920:5: (lv_literal2_2_1= ruleLiteralExpression | lv_literal2_2_2= ruleNameExpression )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_INT && LA11_0<=RULE_STRING)) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_MCQUALIFIEDNAME||LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMontiArcAndCore.g:921:6: lv_literal2_2_1= ruleLiteralExpression
                    {

                    						newCompositeNode(grammarAccess.getBinaryExpressionAccess().getLiteral2LiteralExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_literal2_2_1=ruleLiteralExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"literal2",
                    							lv_literal2_2_1,
                    							"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.LiteralExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:937:6: lv_literal2_2_2= ruleNameExpression
                    {

                    						newCompositeNode(grammarAccess.getBinaryExpressionAccess().getLiteral2NameExpressionParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_literal2_2_2=ruleNameExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"literal2",
                    							lv_literal2_2_2,
                    							"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.NameExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryExpression"


    // $ANTLR start "entryRuleArguments"
    // InternalMontiArcAndCore.g:959:1: entryRuleArguments returns [EObject current=null] : iv_ruleArguments= ruleArguments EOF ;
    public final EObject entryRuleArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArguments = null;


        try {
            // InternalMontiArcAndCore.g:959:50: (iv_ruleArguments= ruleArguments EOF )
            // InternalMontiArcAndCore.g:960:2: iv_ruleArguments= ruleArguments EOF
            {
             newCompositeNode(grammarAccess.getArgumentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArguments=ruleArguments();

            state._fsp--;

             current =iv_ruleArguments; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArguments"


    // $ANTLR start "ruleArguments"
    // InternalMontiArcAndCore.g:966:1: ruleArguments returns [EObject current=null] : (otherlv_0= '(' ( (lv_arguments_1_0= ruleArgument ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleArgument ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_arguments_1_0 = null;

        EObject lv_arguments_3_0 = null;



        	enterRule();

        try {
            // InternalMontiArcAndCore.g:972:2: ( (otherlv_0= '(' ( (lv_arguments_1_0= ruleArgument ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleArgument ) ) )* otherlv_4= ')' ) )
            // InternalMontiArcAndCore.g:973:2: (otherlv_0= '(' ( (lv_arguments_1_0= ruleArgument ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleArgument ) ) )* otherlv_4= ')' )
            {
            // InternalMontiArcAndCore.g:973:2: (otherlv_0= '(' ( (lv_arguments_1_0= ruleArgument ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleArgument ) ) )* otherlv_4= ')' )
            // InternalMontiArcAndCore.g:974:3: otherlv_0= '(' ( (lv_arguments_1_0= ruleArgument ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleArgument ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getArgumentsAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMontiArcAndCore.g:978:3: ( (lv_arguments_1_0= ruleArgument ) )
            // InternalMontiArcAndCore.g:979:4: (lv_arguments_1_0= ruleArgument )
            {
            // InternalMontiArcAndCore.g:979:4: (lv_arguments_1_0= ruleArgument )
            // InternalMontiArcAndCore.g:980:5: lv_arguments_1_0= ruleArgument
            {

            					newCompositeNode(grammarAccess.getArgumentsAccess().getArgumentsArgumentParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_arguments_1_0=ruleArgument();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArgumentsRule());
            					}
            					add(
            						current,
            						"arguments",
            						lv_arguments_1_0,
            						"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.Argument");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMontiArcAndCore.g:997:3: (otherlv_2= ',' ( (lv_arguments_3_0= ruleArgument ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==41) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMontiArcAndCore.g:998:4: otherlv_2= ',' ( (lv_arguments_3_0= ruleArgument ) )
            	    {
            	    otherlv_2=(Token)match(input,41,FOLLOW_15); 

            	    				newLeafNode(otherlv_2, grammarAccess.getArgumentsAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMontiArcAndCore.g:1002:4: ( (lv_arguments_3_0= ruleArgument ) )
            	    // InternalMontiArcAndCore.g:1003:5: (lv_arguments_3_0= ruleArgument )
            	    {
            	    // InternalMontiArcAndCore.g:1003:5: (lv_arguments_3_0= ruleArgument )
            	    // InternalMontiArcAndCore.g:1004:6: lv_arguments_3_0= ruleArgument
            	    {

            	    						newCompositeNode(grammarAccess.getArgumentsAccess().getArgumentsArgumentParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_arguments_3_0=ruleArgument();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getArgumentsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"arguments",
            	    							lv_arguments_3_0,
            	    							"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.Argument");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_4=(Token)match(input,42,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getArgumentsAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArguments"


    // $ANTLR start "entryRuleArgument"
    // InternalMontiArcAndCore.g:1030:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalMontiArcAndCore.g:1030:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalMontiArcAndCore.g:1031:2: iv_ruleArgument= ruleArgument EOF
            {
             newCompositeNode(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgument=ruleArgument();

            state._fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // InternalMontiArcAndCore.g:1037:1: ruleArgument returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalMontiArcAndCore.g:1043:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_expression_1_0= ruleExpression ) ) ) )
            // InternalMontiArcAndCore.g:1044:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // InternalMontiArcAndCore.g:1044:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_expression_1_0= ruleExpression ) ) )
            // InternalMontiArcAndCore.g:1045:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_expression_1_0= ruleExpression ) )
            {
            // InternalMontiArcAndCore.g:1045:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMontiArcAndCore.g:1046:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMontiArcAndCore.g:1046:4: (lv_name_0_0= RULE_ID )
            // InternalMontiArcAndCore.g:1047:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArgumentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0 != null,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMontiArcAndCore.g:1063:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalMontiArcAndCore.g:1064:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalMontiArcAndCore.g:1064:4: (lv_expression_1_0= ruleExpression )
            // InternalMontiArcAndCore.g:1065:5: lv_expression_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getArgumentAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArgumentRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleClassDiagramCompilationUnit"
    // InternalMontiArcAndCore.g:1086:1: entryRuleClassDiagramCompilationUnit returns [EObject current=null] : iv_ruleClassDiagramCompilationUnit= ruleClassDiagramCompilationUnit EOF ;
    public final EObject entryRuleClassDiagramCompilationUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDiagramCompilationUnit = null;


        try {
            // InternalMontiArcAndCore.g:1086:68: (iv_ruleClassDiagramCompilationUnit= ruleClassDiagramCompilationUnit EOF )
            // InternalMontiArcAndCore.g:1087:2: iv_ruleClassDiagramCompilationUnit= ruleClassDiagramCompilationUnit EOF
            {
             newCompositeNode(grammarAccess.getClassDiagramCompilationUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassDiagramCompilationUnit=ruleClassDiagramCompilationUnit();

            state._fsp--;

             current =iv_ruleClassDiagramCompilationUnit; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassDiagramCompilationUnit"


    // $ANTLR start "ruleClassDiagramCompilationUnit"
    // InternalMontiArcAndCore.g:1093:1: ruleClassDiagramCompilationUnit returns [EObject current=null] : ( ( (lv_package_0_0= rulePackage ) ) ( (lv_importStatements_1_0= ruleImportStatements ) )* ( (lv_diagram_2_0= ruleClassDiagram ) ) ) ;
    public final EObject ruleClassDiagramCompilationUnit() throws RecognitionException {
        EObject current = null;

        EObject lv_package_0_0 = null;

        EObject lv_importStatements_1_0 = null;

        EObject lv_diagram_2_0 = null;



        	enterRule();

        try {
            // InternalMontiArcAndCore.g:1099:2: ( ( ( (lv_package_0_0= rulePackage ) ) ( (lv_importStatements_1_0= ruleImportStatements ) )* ( (lv_diagram_2_0= ruleClassDiagram ) ) ) )
            // InternalMontiArcAndCore.g:1100:2: ( ( (lv_package_0_0= rulePackage ) ) ( (lv_importStatements_1_0= ruleImportStatements ) )* ( (lv_diagram_2_0= ruleClassDiagram ) ) )
            {
            // InternalMontiArcAndCore.g:1100:2: ( ( (lv_package_0_0= rulePackage ) ) ( (lv_importStatements_1_0= ruleImportStatements ) )* ( (lv_diagram_2_0= ruleClassDiagram ) ) )
            // InternalMontiArcAndCore.g:1101:3: ( (lv_package_0_0= rulePackage ) ) ( (lv_importStatements_1_0= ruleImportStatements ) )* ( (lv_diagram_2_0= ruleClassDiagram ) )
            {
            // InternalMontiArcAndCore.g:1101:3: ( (lv_package_0_0= rulePackage ) )
            // InternalMontiArcAndCore.g:1102:4: (lv_package_0_0= rulePackage )
            {
            // InternalMontiArcAndCore.g:1102:4: (lv_package_0_0= rulePackage )
            // InternalMontiArcAndCore.g:1103:5: lv_package_0_0= rulePackage
            {

            					newCompositeNode(grammarAccess.getClassDiagramCompilationUnitAccess().getPackagePackageParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_package_0_0=rulePackage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassDiagramCompilationUnitRule());
            					}
            					set(
            						current,
            						"package",
            						lv_package_0_0,
            						"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.Package");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMontiArcAndCore.g:1120:3: ( (lv_importStatements_1_0= ruleImportStatements ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==14) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMontiArcAndCore.g:1121:4: (lv_importStatements_1_0= ruleImportStatements )
            	    {
            	    // InternalMontiArcAndCore.g:1121:4: (lv_importStatements_1_0= ruleImportStatements )
            	    // InternalMontiArcAndCore.g:1122:5: lv_importStatements_1_0= ruleImportStatements
            	    {

            	    					newCompositeNode(grammarAccess.getClassDiagramCompilationUnitAccess().getImportStatementsImportStatementsParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_importStatements_1_0=ruleImportStatements();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassDiagramCompilationUnitRule());
            	    					}
            	    					add(
            	    						current,
            	    						"importStatements",
            	    						lv_importStatements_1_0,
            	    						"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.ImportStatements");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalMontiArcAndCore.g:1139:3: ( (lv_diagram_2_0= ruleClassDiagram ) )
            // InternalMontiArcAndCore.g:1140:4: (lv_diagram_2_0= ruleClassDiagram )
            {
            // InternalMontiArcAndCore.g:1140:4: (lv_diagram_2_0= ruleClassDiagram )
            // InternalMontiArcAndCore.g:1141:5: lv_diagram_2_0= ruleClassDiagram
            {

            					newCompositeNode(grammarAccess.getClassDiagramCompilationUnitAccess().getDiagramClassDiagramParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_diagram_2_0=ruleClassDiagram();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassDiagramCompilationUnitRule());
            					}
            					set(
            						current,
            						"diagram",
            						lv_diagram_2_0,
            						"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.ClassDiagram");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassDiagramCompilationUnit"


    // $ANTLR start "entryRuleClassDiagram"
    // InternalMontiArcAndCore.g:1162:1: entryRuleClassDiagram returns [EObject current=null] : iv_ruleClassDiagram= ruleClassDiagram EOF ;
    public final EObject entryRuleClassDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDiagram = null;


        try {
            // InternalMontiArcAndCore.g:1162:53: (iv_ruleClassDiagram= ruleClassDiagram EOF )
            // InternalMontiArcAndCore.g:1163:2: iv_ruleClassDiagram= ruleClassDiagram EOF
            {
             newCompositeNode(grammarAccess.getClassDiagramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassDiagram=ruleClassDiagram();

            state._fsp--;

             current =iv_ruleClassDiagram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassDiagram"


    // $ANTLR start "ruleClassDiagram"
    // InternalMontiArcAndCore.g:1169:1: ruleClassDiagram returns [EObject current=null] : (otherlv_0= 'classdiagram' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_cdElements_3_0= ruleCDDefinition ) )* otherlv_4= '}' ) ;
    public final EObject ruleClassDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_cdElements_3_0 = null;



        	enterRule();

        try {
            // InternalMontiArcAndCore.g:1175:2: ( (otherlv_0= 'classdiagram' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_cdElements_3_0= ruleCDDefinition ) )* otherlv_4= '}' ) )
            // InternalMontiArcAndCore.g:1176:2: (otherlv_0= 'classdiagram' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_cdElements_3_0= ruleCDDefinition ) )* otherlv_4= '}' )
            {
            // InternalMontiArcAndCore.g:1176:2: (otherlv_0= 'classdiagram' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_cdElements_3_0= ruleCDDefinition ) )* otherlv_4= '}' )
            // InternalMontiArcAndCore.g:1177:3: otherlv_0= 'classdiagram' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_cdElements_3_0= ruleCDDefinition ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getClassDiagramAccess().getClassdiagramKeyword_0());
            		
            // InternalMontiArcAndCore.g:1181:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMontiArcAndCore.g:1182:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMontiArcAndCore.g:1182:4: (lv_name_1_0= RULE_ID )
            // InternalMontiArcAndCore.g:1183:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_1_0, grammarAccess.getClassDiagramAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassDiagramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getClassDiagramAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMontiArcAndCore.g:1203:3: ( (lv_cdElements_3_0= ruleCDDefinition ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=46 && LA14_0<=47)||LA14_0==50) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMontiArcAndCore.g:1204:4: (lv_cdElements_3_0= ruleCDDefinition )
            	    {
            	    // InternalMontiArcAndCore.g:1204:4: (lv_cdElements_3_0= ruleCDDefinition )
            	    // InternalMontiArcAndCore.g:1205:5: lv_cdElements_3_0= ruleCDDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getClassDiagramAccess().getCdElementsCDDefinitionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_cdElements_3_0=ruleCDDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassDiagramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cdElements",
            	    						lv_cdElements_3_0,
            	    						"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.CDDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_4=(Token)match(input,45,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getClassDiagramAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassDiagram"


    // $ANTLR start "entryRuleCDDefinition"
    // InternalMontiArcAndCore.g:1230:1: entryRuleCDDefinition returns [EObject current=null] : iv_ruleCDDefinition= ruleCDDefinition EOF ;
    public final EObject entryRuleCDDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCDDefinition = null;


        try {
            // InternalMontiArcAndCore.g:1230:53: (iv_ruleCDDefinition= ruleCDDefinition EOF )
            // InternalMontiArcAndCore.g:1231:2: iv_ruleCDDefinition= ruleCDDefinition EOF
            {
             newCompositeNode(grammarAccess.getCDDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCDDefinition=ruleCDDefinition();

            state._fsp--;

             current =iv_ruleCDDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCDDefinition"


    // $ANTLR start "ruleCDDefinition"
    // InternalMontiArcAndCore.g:1237:1: ruleCDDefinition returns [EObject current=null] : (this_CDClass_0= ruleCDClass | this_CDEnum_1= ruleCDEnum ) ;
    public final EObject ruleCDDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_CDClass_0 = null;

        EObject this_CDEnum_1 = null;



        	enterRule();

        try {
            // InternalMontiArcAndCore.g:1243:2: ( (this_CDClass_0= ruleCDClass | this_CDEnum_1= ruleCDEnum ) )
            // InternalMontiArcAndCore.g:1244:2: (this_CDClass_0= ruleCDClass | this_CDEnum_1= ruleCDEnum )
            {
            // InternalMontiArcAndCore.g:1244:2: (this_CDClass_0= ruleCDClass | this_CDEnum_1= ruleCDEnum )
            int alt15=2;
            switch ( input.LA(1) ) {
            case 46:
                {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==50) ) {
                    alt15=2;
                }
                else if ( (LA15_1==47) ) {
                    alt15=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
                }
                break;
            case 47:
                {
                alt15=1;
                }
                break;
            case 50:
                {
                alt15=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMontiArcAndCore.g:1245:3: this_CDClass_0= ruleCDClass
                    {

                    			newCompositeNode(grammarAccess.getCDDefinitionAccess().getCDClassParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CDClass_0=ruleCDClass();

                    state._fsp--;


                    			current = this_CDClass_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:1254:3: this_CDEnum_1= ruleCDEnum
                    {

                    			newCompositeNode(grammarAccess.getCDDefinitionAccess().getCDEnumParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CDEnum_1=ruleCDEnum();

                    state._fsp--;


                    			current = this_CDEnum_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCDDefinition"


    // $ANTLR start "entryRuleCDClass"
    // InternalMontiArcAndCore.g:1266:1: entryRuleCDClass returns [EObject current=null] : iv_ruleCDClass= ruleCDClass EOF ;
    public final EObject entryRuleCDClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCDClass = null;


        try {
            // InternalMontiArcAndCore.g:1266:48: (iv_ruleCDClass= ruleCDClass EOF )
            // InternalMontiArcAndCore.g:1267:2: iv_ruleCDClass= ruleCDClass EOF
            {
             newCompositeNode(grammarAccess.getCDClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCDClass=ruleCDClass();

            state._fsp--;

             current =iv_ruleCDClass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCDClass"


    // $ANTLR start "ruleCDClass"
    // InternalMontiArcAndCore.g:1273:1: ruleCDClass returns [EObject current=null] : ( ( (lv_public_0_0= 'public' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extends_4_0= RULE_ID ) ) )? (otherlv_5= 'implements' ( (lv_implements_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_implements_8_0= RULE_ID ) ) )* )? otherlv_9= '{' ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}' ) ;
    public final EObject ruleCDClass() throws RecognitionException {
        EObject current = null;

        Token lv_public_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_extends_4_0=null;
        Token otherlv_5=null;
        Token lv_implements_6_0=null;
        Token otherlv_7=null;
        Token lv_implements_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_members_10_0 = null;



        	enterRule();

        try {
            // InternalMontiArcAndCore.g:1279:2: ( ( ( (lv_public_0_0= 'public' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extends_4_0= RULE_ID ) ) )? (otherlv_5= 'implements' ( (lv_implements_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_implements_8_0= RULE_ID ) ) )* )? otherlv_9= '{' ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}' ) )
            // InternalMontiArcAndCore.g:1280:2: ( ( (lv_public_0_0= 'public' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extends_4_0= RULE_ID ) ) )? (otherlv_5= 'implements' ( (lv_implements_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_implements_8_0= RULE_ID ) ) )* )? otherlv_9= '{' ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}' )
            {
            // InternalMontiArcAndCore.g:1280:2: ( ( (lv_public_0_0= 'public' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extends_4_0= RULE_ID ) ) )? (otherlv_5= 'implements' ( (lv_implements_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_implements_8_0= RULE_ID ) ) )* )? otherlv_9= '{' ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}' )
            // InternalMontiArcAndCore.g:1281:3: ( (lv_public_0_0= 'public' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extends_4_0= RULE_ID ) ) )? (otherlv_5= 'implements' ( (lv_implements_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_implements_8_0= RULE_ID ) ) )* )? otherlv_9= '{' ( (lv_members_10_0= ruleMember ) )* otherlv_11= '}'
            {
            // InternalMontiArcAndCore.g:1281:3: ( (lv_public_0_0= 'public' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==46) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMontiArcAndCore.g:1282:4: (lv_public_0_0= 'public' )
                    {
                    // InternalMontiArcAndCore.g:1282:4: (lv_public_0_0= 'public' )
                    // InternalMontiArcAndCore.g:1283:5: lv_public_0_0= 'public'
                    {
                    lv_public_0_0=(Token)match(input,46,FOLLOW_20); 

                    					newLeafNode(lv_public_0_0, grammarAccess.getCDClassAccess().getPublicPublicKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCDClassRule());
                    					}
                    					setWithLastConsumed(current, "public", lv_public_0_0 != null, "public");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,47,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getCDClassAccess().getClassKeyword_1());
            		
            // InternalMontiArcAndCore.g:1299:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMontiArcAndCore.g:1300:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMontiArcAndCore.g:1300:4: (lv_name_2_0= RULE_ID )
            // InternalMontiArcAndCore.g:1301:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCDClassAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCDClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMontiArcAndCore.g:1317:3: (otherlv_3= 'extends' ( (lv_extends_4_0= RULE_ID ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==48) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMontiArcAndCore.g:1318:4: otherlv_3= 'extends' ( (lv_extends_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,48,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getCDClassAccess().getExtendsKeyword_3_0());
                    			
                    // InternalMontiArcAndCore.g:1322:4: ( (lv_extends_4_0= RULE_ID ) )
                    // InternalMontiArcAndCore.g:1323:5: (lv_extends_4_0= RULE_ID )
                    {
                    // InternalMontiArcAndCore.g:1323:5: (lv_extends_4_0= RULE_ID )
                    // InternalMontiArcAndCore.g:1324:6: lv_extends_4_0= RULE_ID
                    {
                    lv_extends_4_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(lv_extends_4_0, grammarAccess.getCDClassAccess().getExtendsIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCDClassRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"extends",
                    							lv_extends_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMontiArcAndCore.g:1341:3: (otherlv_5= 'implements' ( (lv_implements_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_implements_8_0= RULE_ID ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==49) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMontiArcAndCore.g:1342:4: otherlv_5= 'implements' ( (lv_implements_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_implements_8_0= RULE_ID ) ) )*
                    {
                    otherlv_5=(Token)match(input,49,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getCDClassAccess().getImplementsKeyword_4_0());
                    			
                    // InternalMontiArcAndCore.g:1346:4: ( (lv_implements_6_0= RULE_ID ) )
                    // InternalMontiArcAndCore.g:1347:5: (lv_implements_6_0= RULE_ID )
                    {
                    // InternalMontiArcAndCore.g:1347:5: (lv_implements_6_0= RULE_ID )
                    // InternalMontiArcAndCore.g:1348:6: lv_implements_6_0= RULE_ID
                    {
                    lv_implements_6_0=(Token)match(input,RULE_ID,FOLLOW_23); 

                    						newLeafNode(lv_implements_6_0, grammarAccess.getCDClassAccess().getImplementsIDTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCDClassRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"implements",
                    							lv_implements_6_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalMontiArcAndCore.g:1364:4: (otherlv_7= ',' ( (lv_implements_8_0= RULE_ID ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==41) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalMontiArcAndCore.g:1365:5: otherlv_7= ',' ( (lv_implements_8_0= RULE_ID ) )
                    	    {
                    	    otherlv_7=(Token)match(input,41,FOLLOW_15); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getCDClassAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMontiArcAndCore.g:1369:5: ( (lv_implements_8_0= RULE_ID ) )
                    	    // InternalMontiArcAndCore.g:1370:6: (lv_implements_8_0= RULE_ID )
                    	    {
                    	    // InternalMontiArcAndCore.g:1370:6: (lv_implements_8_0= RULE_ID )
                    	    // InternalMontiArcAndCore.g:1371:7: lv_implements_8_0= RULE_ID
                    	    {
                    	    lv_implements_8_0=(Token)match(input,RULE_ID,FOLLOW_23); 

                    	    							newLeafNode(lv_implements_8_0, grammarAccess.getCDClassAccess().getImplementsIDTerminalRuleCall_4_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCDClassRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"implements",
                    	    								lv_implements_8_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,44,FOLLOW_24); 

            			newLeafNode(otherlv_9, grammarAccess.getCDClassAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMontiArcAndCore.g:1393:3: ( (lv_members_10_0= ruleMember ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=17 && LA20_0<=35)||(LA20_0>=46 && LA20_0<=47)||LA20_0==50) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMontiArcAndCore.g:1394:4: (lv_members_10_0= ruleMember )
            	    {
            	    // InternalMontiArcAndCore.g:1394:4: (lv_members_10_0= ruleMember )
            	    // InternalMontiArcAndCore.g:1395:5: lv_members_10_0= ruleMember
            	    {

            	    					newCompositeNode(grammarAccess.getCDClassAccess().getMembersMemberParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_members_10_0=ruleMember();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCDClassRule());
            	    					}
            	    					add(
            	    						current,
            	    						"members",
            	    						lv_members_10_0,
            	    						"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.Member");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_11=(Token)match(input,45,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getCDClassAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCDClass"


    // $ANTLR start "entryRuleCDEnum"
    // InternalMontiArcAndCore.g:1420:1: entryRuleCDEnum returns [EObject current=null] : iv_ruleCDEnum= ruleCDEnum EOF ;
    public final EObject entryRuleCDEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCDEnum = null;


        try {
            // InternalMontiArcAndCore.g:1420:47: (iv_ruleCDEnum= ruleCDEnum EOF )
            // InternalMontiArcAndCore.g:1421:2: iv_ruleCDEnum= ruleCDEnum EOF
            {
             newCompositeNode(grammarAccess.getCDEnumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCDEnum=ruleCDEnum();

            state._fsp--;

             current =iv_ruleCDEnum; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCDEnum"


    // $ANTLR start "ruleCDEnum"
    // InternalMontiArcAndCore.g:1427:1: ruleCDEnum returns [EObject current=null] : ( ( (lv_public_0_0= 'public' ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_values_4_0= RULE_ID ) ) otherlv_5= '}' ) ;
    public final EObject ruleCDEnum() throws RecognitionException {
        EObject current = null;

        Token lv_public_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_values_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMontiArcAndCore.g:1433:2: ( ( ( (lv_public_0_0= 'public' ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_values_4_0= RULE_ID ) ) otherlv_5= '}' ) )
            // InternalMontiArcAndCore.g:1434:2: ( ( (lv_public_0_0= 'public' ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_values_4_0= RULE_ID ) ) otherlv_5= '}' )
            {
            // InternalMontiArcAndCore.g:1434:2: ( ( (lv_public_0_0= 'public' ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_values_4_0= RULE_ID ) ) otherlv_5= '}' )
            // InternalMontiArcAndCore.g:1435:3: ( (lv_public_0_0= 'public' ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_values_4_0= RULE_ID ) ) otherlv_5= '}'
            {
            // InternalMontiArcAndCore.g:1435:3: ( (lv_public_0_0= 'public' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==46) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMontiArcAndCore.g:1436:4: (lv_public_0_0= 'public' )
                    {
                    // InternalMontiArcAndCore.g:1436:4: (lv_public_0_0= 'public' )
                    // InternalMontiArcAndCore.g:1437:5: lv_public_0_0= 'public'
                    {
                    lv_public_0_0=(Token)match(input,46,FOLLOW_25); 

                    					newLeafNode(lv_public_0_0, grammarAccess.getCDEnumAccess().getPublicPublicKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCDEnumRule());
                    					}
                    					setWithLastConsumed(current, "public", lv_public_0_0 != null, "public");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,50,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getCDEnumAccess().getEnumKeyword_1());
            		
            // InternalMontiArcAndCore.g:1453:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMontiArcAndCore.g:1454:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMontiArcAndCore.g:1454:4: (lv_name_2_0= RULE_ID )
            // InternalMontiArcAndCore.g:1455:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCDEnumAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCDEnumRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,44,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getCDEnumAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMontiArcAndCore.g:1475:3: ( (lv_values_4_0= RULE_ID ) )
            // InternalMontiArcAndCore.g:1476:4: (lv_values_4_0= RULE_ID )
            {
            // InternalMontiArcAndCore.g:1476:4: (lv_values_4_0= RULE_ID )
            // InternalMontiArcAndCore.g:1477:5: lv_values_4_0= RULE_ID
            {
            lv_values_4_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_values_4_0, grammarAccess.getCDEnumAccess().getValuesIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCDEnumRule());
            					}
            					addWithLastConsumed(
            						current,
            						"values",
            						lv_values_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,45,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCDEnumAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCDEnum"


    // $ANTLR start "entryRuleMember"
    // InternalMontiArcAndCore.g:1501:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalMontiArcAndCore.g:1501:47: (iv_ruleMember= ruleMember EOF )
            // InternalMontiArcAndCore.g:1502:2: iv_ruleMember= ruleMember EOF
            {
             newCompositeNode(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMember=ruleMember();

            state._fsp--;

             current =iv_ruleMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalMontiArcAndCore.g:1508:1: ruleMember returns [EObject current=null] : ( ( ( (lv_type_0_1= ruleType | lv_type_0_2= ruleCDDefinition ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_0_1 = null;

        EObject lv_type_0_2 = null;



        	enterRule();

        try {
            // InternalMontiArcAndCore.g:1514:2: ( ( ( ( (lv_type_0_1= ruleType | lv_type_0_2= ruleCDDefinition ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalMontiArcAndCore.g:1515:2: ( ( ( (lv_type_0_1= ruleType | lv_type_0_2= ruleCDDefinition ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalMontiArcAndCore.g:1515:2: ( ( ( (lv_type_0_1= ruleType | lv_type_0_2= ruleCDDefinition ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalMontiArcAndCore.g:1516:3: ( ( (lv_type_0_1= ruleType | lv_type_0_2= ruleCDDefinition ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            // InternalMontiArcAndCore.g:1516:3: ( ( (lv_type_0_1= ruleType | lv_type_0_2= ruleCDDefinition ) ) )
            // InternalMontiArcAndCore.g:1517:4: ( (lv_type_0_1= ruleType | lv_type_0_2= ruleCDDefinition ) )
            {
            // InternalMontiArcAndCore.g:1517:4: ( (lv_type_0_1= ruleType | lv_type_0_2= ruleCDDefinition ) )
            // InternalMontiArcAndCore.g:1518:5: (lv_type_0_1= ruleType | lv_type_0_2= ruleCDDefinition )
            {
            // InternalMontiArcAndCore.g:1518:5: (lv_type_0_1= ruleType | lv_type_0_2= ruleCDDefinition )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=17 && LA22_0<=35)) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=46 && LA22_0<=47)||LA22_0==50) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalMontiArcAndCore.g:1519:6: lv_type_0_1= ruleType
                    {

                    						newCompositeNode(grammarAccess.getMemberAccess().getTypeTypeParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_type_0_1=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMemberRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_0_1,
                    							"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:1535:6: lv_type_0_2= ruleCDDefinition
                    {

                    						newCompositeNode(grammarAccess.getMemberAccess().getTypeCDDefinitionParserRuleCall_0_0_1());
                    					
                    pushFollow(FOLLOW_15);
                    lv_type_0_2=ruleCDDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMemberRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_0_2,
                    							"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.CDDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalMontiArcAndCore.g:1553:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMontiArcAndCore.g:1554:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMontiArcAndCore.g:1554:4: (lv_name_1_0= RULE_ID )
            // InternalMontiArcAndCore.g:1555:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getMemberAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleMACompilationUnit"
    // InternalMontiArcAndCore.g:1579:1: entryRuleMACompilationUnit returns [EObject current=null] : iv_ruleMACompilationUnit= ruleMACompilationUnit EOF ;
    public final EObject entryRuleMACompilationUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMACompilationUnit = null;


        try {
            // InternalMontiArcAndCore.g:1579:58: (iv_ruleMACompilationUnit= ruleMACompilationUnit EOF )
            // InternalMontiArcAndCore.g:1580:2: iv_ruleMACompilationUnit= ruleMACompilationUnit EOF
            {
             newCompositeNode(grammarAccess.getMACompilationUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMACompilationUnit=ruleMACompilationUnit();

            state._fsp--;

             current =iv_ruleMACompilationUnit; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMACompilationUnit"


    // $ANTLR start "ruleMACompilationUnit"
    // InternalMontiArcAndCore.g:1586:1: ruleMACompilationUnit returns [EObject current=null] : ( ( (lv_package_0_0= rulePackage ) ) ( (lv_importStatements_1_0= ruleImportStatements ) )* ( (lv_component_2_0= ruleComponent ) ) ) ;
    public final EObject ruleMACompilationUnit() throws RecognitionException {
        EObject current = null;

        EObject lv_package_0_0 = null;

        EObject lv_importStatements_1_0 = null;

        EObject lv_component_2_0 = null;



        	enterRule();

        try {
            // InternalMontiArcAndCore.g:1592:2: ( ( ( (lv_package_0_0= rulePackage ) ) ( (lv_importStatements_1_0= ruleImportStatements ) )* ( (lv_component_2_0= ruleComponent ) ) ) )
            // InternalMontiArcAndCore.g:1593:2: ( ( (lv_package_0_0= rulePackage ) ) ( (lv_importStatements_1_0= ruleImportStatements ) )* ( (lv_component_2_0= ruleComponent ) ) )
            {
            // InternalMontiArcAndCore.g:1593:2: ( ( (lv_package_0_0= rulePackage ) ) ( (lv_importStatements_1_0= ruleImportStatements ) )* ( (lv_component_2_0= ruleComponent ) ) )
            // InternalMontiArcAndCore.g:1594:3: ( (lv_package_0_0= rulePackage ) ) ( (lv_importStatements_1_0= ruleImportStatements ) )* ( (lv_component_2_0= ruleComponent ) )
            {
            // InternalMontiArcAndCore.g:1594:3: ( (lv_package_0_0= rulePackage ) )
            // InternalMontiArcAndCore.g:1595:4: (lv_package_0_0= rulePackage )
            {
            // InternalMontiArcAndCore.g:1595:4: (lv_package_0_0= rulePackage )
            // InternalMontiArcAndCore.g:1596:5: lv_package_0_0= rulePackage
            {

            					newCompositeNode(grammarAccess.getMACompilationUnitAccess().getPackagePackageParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_27);
            lv_package_0_0=rulePackage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMACompilationUnitRule());
            					}
            					set(
            						current,
            						"package",
            						lv_package_0_0,
            						"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.Package");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMontiArcAndCore.g:1613:3: ( (lv_importStatements_1_0= ruleImportStatements ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==14) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMontiArcAndCore.g:1614:4: (lv_importStatements_1_0= ruleImportStatements )
            	    {
            	    // InternalMontiArcAndCore.g:1614:4: (lv_importStatements_1_0= ruleImportStatements )
            	    // InternalMontiArcAndCore.g:1615:5: lv_importStatements_1_0= ruleImportStatements
            	    {

            	    					newCompositeNode(grammarAccess.getMACompilationUnitAccess().getImportStatementsImportStatementsParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_importStatements_1_0=ruleImportStatements();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMACompilationUnitRule());
            	    					}
            	    					add(
            	    						current,
            	    						"importStatements",
            	    						lv_importStatements_1_0,
            	    						"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.ImportStatements");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // InternalMontiArcAndCore.g:1632:3: ( (lv_component_2_0= ruleComponent ) )
            // InternalMontiArcAndCore.g:1633:4: (lv_component_2_0= ruleComponent )
            {
            // InternalMontiArcAndCore.g:1633:4: (lv_component_2_0= ruleComponent )
            // InternalMontiArcAndCore.g:1634:5: lv_component_2_0= ruleComponent
            {

            					newCompositeNode(grammarAccess.getMACompilationUnitAccess().getComponentComponentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_component_2_0=ruleComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMACompilationUnitRule());
            					}
            					set(
            						current,
            						"component",
            						lv_component_2_0,
            						"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.Component");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMACompilationUnit"


    // $ANTLR start "entryRuleComponent"
    // InternalMontiArcAndCore.g:1655:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalMontiArcAndCore.g:1655:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalMontiArcAndCore.g:1656:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalMontiArcAndCore.g:1662:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_arcElements_3_0= ruleArcElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_arcElements_3_0 = null;



        	enterRule();

        try {
            // InternalMontiArcAndCore.g:1668:2: ( (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_arcElements_3_0= ruleArcElement ) )* otherlv_4= '}' ) )
            // InternalMontiArcAndCore.g:1669:2: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_arcElements_3_0= ruleArcElement ) )* otherlv_4= '}' )
            {
            // InternalMontiArcAndCore.g:1669:2: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_arcElements_3_0= ruleArcElement ) )* otherlv_4= '}' )
            // InternalMontiArcAndCore.g:1670:3: otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_arcElements_3_0= ruleArcElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
            		
            // InternalMontiArcAndCore.g:1674:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMontiArcAndCore.g:1675:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMontiArcAndCore.g:1675:4: (lv_name_1_0= RULE_ID )
            // InternalMontiArcAndCore.g:1676:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_1_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMontiArcAndCore.g:1696:3: ( (lv_arcElements_3_0= ruleArcElement ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_MCQUALIFIEDNAME||LA24_0==RULE_ID||LA24_0==RULE_SYNC||LA24_0==51||LA24_0==54||LA24_0==60) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMontiArcAndCore.g:1697:4: (lv_arcElements_3_0= ruleArcElement )
            	    {
            	    // InternalMontiArcAndCore.g:1697:4: (lv_arcElements_3_0= ruleArcElement )
            	    // InternalMontiArcAndCore.g:1698:5: lv_arcElements_3_0= ruleArcElement
            	    {

            	    					newCompositeNode(grammarAccess.getComponentAccess().getArcElementsArcElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_arcElements_3_0=ruleArcElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"arcElements",
            	    						lv_arcElements_3_0,
            	    						"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.ArcElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_4=(Token)match(input,45,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleParameters"
    // InternalMontiArcAndCore.g:1723:1: entryRuleParameters returns [EObject current=null] : iv_ruleParameters= ruleParameters EOF ;
    public final EObject entryRuleParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameters = null;


        try {
            // InternalMontiArcAndCore.g:1723:51: (iv_ruleParameters= ruleParameters EOF )
            // InternalMontiArcAndCore.g:1724:2: iv_ruleParameters= ruleParameters EOF
            {
             newCompositeNode(grammarAccess.getParametersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameters=ruleParameters();

            state._fsp--;

             current =iv_ruleParameters; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameters"


    // $ANTLR start "ruleParameters"
    // InternalMontiArcAndCore.g:1730:1: ruleParameters returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* ) ;
    public final EObject ruleParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalMontiArcAndCore.g:1736:2: ( ( ( (lv_parameters_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* ) )
            // InternalMontiArcAndCore.g:1737:2: ( ( (lv_parameters_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* )
            {
            // InternalMontiArcAndCore.g:1737:2: ( ( (lv_parameters_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* )
            // InternalMontiArcAndCore.g:1738:3: ( (lv_parameters_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )*
            {
            // InternalMontiArcAndCore.g:1738:3: ( (lv_parameters_0_0= ruleParameter ) )
            // InternalMontiArcAndCore.g:1739:4: (lv_parameters_0_0= ruleParameter )
            {
            // InternalMontiArcAndCore.g:1739:4: (lv_parameters_0_0= ruleParameter )
            // InternalMontiArcAndCore.g:1740:5: lv_parameters_0_0= ruleParameter
            {

            					newCompositeNode(grammarAccess.getParametersAccess().getParametersParameterParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_29);
            lv_parameters_0_0=ruleParameter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParametersRule());
            					}
            					add(
            						current,
            						"parameters",
            						lv_parameters_0_0,
            						"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.Parameter");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMontiArcAndCore.g:1757:3: (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==41) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMontiArcAndCore.g:1758:4: otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) )
            	    {
            	    otherlv_1=(Token)match(input,41,FOLLOW_9); 

            	    				newLeafNode(otherlv_1, grammarAccess.getParametersAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMontiArcAndCore.g:1762:4: ( (lv_parameters_2_0= ruleParameter ) )
            	    // InternalMontiArcAndCore.g:1763:5: (lv_parameters_2_0= ruleParameter )
            	    {
            	    // InternalMontiArcAndCore.g:1763:5: (lv_parameters_2_0= ruleParameter )
            	    // InternalMontiArcAndCore.g:1764:6: lv_parameters_2_0= ruleParameter
            	    {

            	    						newCompositeNode(grammarAccess.getParametersAccess().getParametersParameterParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_parameters_2_0=ruleParameter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParametersRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_2_0,
            	    							"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.Parameter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameters"


    // $ANTLR start "entryRuleParameter"
    // InternalMontiArcAndCore.g:1786:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalMontiArcAndCore.g:1786:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalMontiArcAndCore.g:1787:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalMontiArcAndCore.g:1793:1: ruleParameter returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_0_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalMontiArcAndCore.g:1799:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ) )
            // InternalMontiArcAndCore.g:1800:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? )
            {
            // InternalMontiArcAndCore.g:1800:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? )
            // InternalMontiArcAndCore.g:1801:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )?
            {
            // InternalMontiArcAndCore.g:1801:3: ( (lv_type_0_0= ruleType ) )
            // InternalMontiArcAndCore.g:1802:4: (lv_type_0_0= ruleType )
            {
            // InternalMontiArcAndCore.g:1802:4: (lv_type_0_0= ruleType )
            // InternalMontiArcAndCore.g:1803:5: lv_type_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_type_0_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMontiArcAndCore.g:1820:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMontiArcAndCore.g:1821:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMontiArcAndCore.g:1821:4: (lv_name_1_0= RULE_ID )
            // InternalMontiArcAndCore.g:1822:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(lv_name_1_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMontiArcAndCore.g:1838:3: (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==52) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMontiArcAndCore.g:1839:4: otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,52,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getEqualsSignKeyword_2_0());
                    			
                    // InternalMontiArcAndCore.g:1843:4: ( (lv_expression_3_0= ruleExpression ) )
                    // InternalMontiArcAndCore.g:1844:5: (lv_expression_3_0= ruleExpression )
                    {
                    // InternalMontiArcAndCore.g:1844:5: (lv_expression_3_0= ruleExpression )
                    // InternalMontiArcAndCore.g:1845:6: lv_expression_3_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getExpressionExpressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_3_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_3_0 != null,
                    							"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleArcElement"
    // InternalMontiArcAndCore.g:1867:1: entryRuleArcElement returns [EObject current=null] : iv_ruleArcElement= ruleArcElement EOF ;
    public final EObject entryRuleArcElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArcElement = null;


        try {
            // InternalMontiArcAndCore.g:1867:51: (iv_ruleArcElement= ruleArcElement EOF )
            // InternalMontiArcAndCore.g:1868:2: iv_ruleArcElement= ruleArcElement EOF
            {
             newCompositeNode(grammarAccess.getArcElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArcElement=ruleArcElement();

            state._fsp--;

             current =iv_ruleArcElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArcElement"


    // $ANTLR start "ruleArcElement"
    // InternalMontiArcAndCore.g:1874:1: ruleArcElement returns [EObject current=null] : (this_Component_0= ruleComponent | this_SubComponent_1= ruleSubComponent | this_Connector_2= ruleConnector | this_Port_3= rulePort | this_Variable_4= ruleVariable | this_Automaton_5= ruleAutomaton ) ;
    public final EObject ruleArcElement() throws RecognitionException {
        EObject current = null;

        EObject this_Component_0 = null;

        EObject this_SubComponent_1 = null;

        EObject this_Connector_2 = null;

        EObject this_Port_3 = null;

        EObject this_Variable_4 = null;

        EObject this_Automaton_5 = null;



        	enterRule();

        try {
            // InternalMontiArcAndCore.g:1880:2: ( (this_Component_0= ruleComponent | this_SubComponent_1= ruleSubComponent | this_Connector_2= ruleConnector | this_Port_3= rulePort | this_Variable_4= ruleVariable | this_Automaton_5= ruleAutomaton ) )
            // InternalMontiArcAndCore.g:1881:2: (this_Component_0= ruleComponent | this_SubComponent_1= ruleSubComponent | this_Connector_2= ruleConnector | this_Port_3= rulePort | this_Variable_4= ruleVariable | this_Automaton_5= ruleAutomaton )
            {
            // InternalMontiArcAndCore.g:1881:2: (this_Component_0= ruleComponent | this_SubComponent_1= ruleSubComponent | this_Connector_2= ruleConnector | this_Port_3= rulePort | this_Variable_4= ruleVariable | this_Automaton_5= ruleAutomaton )
            int alt27=6;
            switch ( input.LA(1) ) {
            case 51:
                {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==RULE_ID) ) {
                    alt27=1;
                }
                else if ( ((LA27_1>=17 && LA27_1<=35)) ) {
                    alt27=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA27_2 = input.LA(2);

                if ( (LA27_2==53) ) {
                    alt27=3;
                }
                else if ( (LA27_2==RULE_MCQUALIFIEDNAME||LA27_2==RULE_ID) ) {
                    alt27=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_MCQUALIFIEDNAME:
                {
                alt27=3;
                }
                break;
            case 54:
                {
                alt27=4;
                }
                break;
            case RULE_SYNC:
            case 60:
                {
                alt27=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalMontiArcAndCore.g:1882:3: this_Component_0= ruleComponent
                    {

                    			newCompositeNode(grammarAccess.getArcElementAccess().getComponentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Component_0=ruleComponent();

                    state._fsp--;


                    			current = this_Component_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:1891:3: this_SubComponent_1= ruleSubComponent
                    {

                    			newCompositeNode(grammarAccess.getArcElementAccess().getSubComponentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SubComponent_1=ruleSubComponent();

                    state._fsp--;


                    			current = this_SubComponent_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMontiArcAndCore.g:1900:3: this_Connector_2= ruleConnector
                    {

                    			newCompositeNode(grammarAccess.getArcElementAccess().getConnectorParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Connector_2=ruleConnector();

                    state._fsp--;


                    			current = this_Connector_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMontiArcAndCore.g:1909:3: this_Port_3= rulePort
                    {

                    			newCompositeNode(grammarAccess.getArcElementAccess().getPortParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Port_3=rulePort();

                    state._fsp--;


                    			current = this_Port_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMontiArcAndCore.g:1918:3: this_Variable_4= ruleVariable
                    {

                    			newCompositeNode(grammarAccess.getArcElementAccess().getVariableParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_4=ruleVariable();

                    state._fsp--;


                    			current = this_Variable_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMontiArcAndCore.g:1927:3: this_Automaton_5= ruleAutomaton
                    {

                    			newCompositeNode(grammarAccess.getArcElementAccess().getAutomatonParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Automaton_5=ruleAutomaton();

                    state._fsp--;


                    			current = this_Automaton_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArcElement"


    // $ANTLR start "entryRuleSubComponent"
    // InternalMontiArcAndCore.g:1939:1: entryRuleSubComponent returns [EObject current=null] : iv_ruleSubComponent= ruleSubComponent EOF ;
    public final EObject entryRuleSubComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubComponent = null;


        try {
            // InternalMontiArcAndCore.g:1939:53: (iv_ruleSubComponent= ruleSubComponent EOF )
            // InternalMontiArcAndCore.g:1940:2: iv_ruleSubComponent= ruleSubComponent EOF
            {
             newCompositeNode(grammarAccess.getSubComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubComponent=ruleSubComponent();

            state._fsp--;

             current =iv_ruleSubComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubComponent"


    // $ANTLR start "ruleSubComponent"
    // InternalMontiArcAndCore.g:1946:1: ruleSubComponent returns [EObject current=null] : (otherlv_0= 'component' ( (lv_type_1_0= ruleType ) ) ( (lv_arguments_2_0= ruleArguments ) )? ( (lv_instances_3_0= ruleNames ) ) otherlv_4= ';' ) ;
    public final EObject ruleSubComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_type_1_0 = null;

        EObject lv_arguments_2_0 = null;

        EObject lv_instances_3_0 = null;



        	enterRule();

        try {
            // InternalMontiArcAndCore.g:1952:2: ( (otherlv_0= 'component' ( (lv_type_1_0= ruleType ) ) ( (lv_arguments_2_0= ruleArguments ) )? ( (lv_instances_3_0= ruleNames ) ) otherlv_4= ';' ) )
            // InternalMontiArcAndCore.g:1953:2: (otherlv_0= 'component' ( (lv_type_1_0= ruleType ) ) ( (lv_arguments_2_0= ruleArguments ) )? ( (lv_instances_3_0= ruleNames ) ) otherlv_4= ';' )
            {
            // InternalMontiArcAndCore.g:1953:2: (otherlv_0= 'component' ( (lv_type_1_0= ruleType ) ) ( (lv_arguments_2_0= ruleArguments ) )? ( (lv_instances_3_0= ruleNames ) ) otherlv_4= ';' )
            // InternalMontiArcAndCore.g:1954:3: otherlv_0= 'component' ( (lv_type_1_0= ruleType ) ) ( (lv_arguments_2_0= ruleArguments ) )? ( (lv_instances_3_0= ruleNames ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSubComponentAccess().getComponentKeyword_0());
            		
            // InternalMontiArcAndCore.g:1958:3: ( (lv_type_1_0= ruleType ) )
            // InternalMontiArcAndCore.g:1959:4: (lv_type_1_0= ruleType )
            {
            // InternalMontiArcAndCore.g:1959:4: (lv_type_1_0= ruleType )
            // InternalMontiArcAndCore.g:1960:5: lv_type_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getSubComponentAccess().getTypeTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_31);
            lv_type_1_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubComponentRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMontiArcAndCore.g:1977:3: ( (lv_arguments_2_0= ruleArguments ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==40) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMontiArcAndCore.g:1978:4: (lv_arguments_2_0= ruleArguments )
                    {
                    // InternalMontiArcAndCore.g:1978:4: (lv_arguments_2_0= ruleArguments )
                    // InternalMontiArcAndCore.g:1979:5: lv_arguments_2_0= ruleArguments
                    {

                    					newCompositeNode(grammarAccess.getSubComponentAccess().getArgumentsArgumentsParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_31);
                    lv_arguments_2_0=ruleArguments();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSubComponentRule());
                    					}
                    					set(
                    						current,
                    						"arguments",
                    						lv_arguments_2_0 != null,
                    						"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.Arguments");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMontiArcAndCore.g:1996:3: ( (lv_instances_3_0= ruleNames ) )
            // InternalMontiArcAndCore.g:1997:4: (lv_instances_3_0= ruleNames )
            {
            // InternalMontiArcAndCore.g:1997:4: (lv_instances_3_0= ruleNames )
            // InternalMontiArcAndCore.g:1998:5: lv_instances_3_0= ruleNames
            {

            					newCompositeNode(grammarAccess.getSubComponentAccess().getInstancesNamesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_instances_3_0=ruleNames();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubComponentRule());
            					}
            					set(
            						current,
            						"instances",
            						lv_instances_3_0,
            						"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.Names");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSubComponentAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubComponent"


    // $ANTLR start "entryRuleConnector"
    // InternalMontiArcAndCore.g:2023:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // InternalMontiArcAndCore.g:2023:50: (iv_ruleConnector= ruleConnector EOF )
            // InternalMontiArcAndCore.g:2024:2: iv_ruleConnector= ruleConnector EOF
            {
             newCompositeNode(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnector=ruleConnector();

            state._fsp--;

             current =iv_ruleConnector; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnector"


    // $ANTLR start "ruleConnector"
    // InternalMontiArcAndCore.g:2030:1: ruleConnector returns [EObject current=null] : ( ( ( (lv_source_0_1= RULE_ID | lv_source_0_2= RULE_MCQUALIFIEDNAME ) ) ) otherlv_1= '->' ( ( (lv_target_2_1= RULE_ID | lv_target_2_2= RULE_MCQUALIFIEDNAME ) ) ) otherlv_3= ';' ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        Token lv_source_0_1=null;
        Token lv_source_0_2=null;
        Token otherlv_1=null;
        Token lv_target_2_1=null;
        Token lv_target_2_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMontiArcAndCore.g:2036:2: ( ( ( ( (lv_source_0_1= RULE_ID | lv_source_0_2= RULE_MCQUALIFIEDNAME ) ) ) otherlv_1= '->' ( ( (lv_target_2_1= RULE_ID | lv_target_2_2= RULE_MCQUALIFIEDNAME ) ) ) otherlv_3= ';' ) )
            // InternalMontiArcAndCore.g:2037:2: ( ( ( (lv_source_0_1= RULE_ID | lv_source_0_2= RULE_MCQUALIFIEDNAME ) ) ) otherlv_1= '->' ( ( (lv_target_2_1= RULE_ID | lv_target_2_2= RULE_MCQUALIFIEDNAME ) ) ) otherlv_3= ';' )
            {
            // InternalMontiArcAndCore.g:2037:2: ( ( ( (lv_source_0_1= RULE_ID | lv_source_0_2= RULE_MCQUALIFIEDNAME ) ) ) otherlv_1= '->' ( ( (lv_target_2_1= RULE_ID | lv_target_2_2= RULE_MCQUALIFIEDNAME ) ) ) otherlv_3= ';' )
            // InternalMontiArcAndCore.g:2038:3: ( ( (lv_source_0_1= RULE_ID | lv_source_0_2= RULE_MCQUALIFIEDNAME ) ) ) otherlv_1= '->' ( ( (lv_target_2_1= RULE_ID | lv_target_2_2= RULE_MCQUALIFIEDNAME ) ) ) otherlv_3= ';'
            {
            // InternalMontiArcAndCore.g:2038:3: ( ( (lv_source_0_1= RULE_ID | lv_source_0_2= RULE_MCQUALIFIEDNAME ) ) )
            // InternalMontiArcAndCore.g:2039:4: ( (lv_source_0_1= RULE_ID | lv_source_0_2= RULE_MCQUALIFIEDNAME ) )
            {
            // InternalMontiArcAndCore.g:2039:4: ( (lv_source_0_1= RULE_ID | lv_source_0_2= RULE_MCQUALIFIEDNAME ) )
            // InternalMontiArcAndCore.g:2040:5: (lv_source_0_1= RULE_ID | lv_source_0_2= RULE_MCQUALIFIEDNAME )
            {
            // InternalMontiArcAndCore.g:2040:5: (lv_source_0_1= RULE_ID | lv_source_0_2= RULE_MCQUALIFIEDNAME )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_MCQUALIFIEDNAME) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalMontiArcAndCore.g:2041:6: lv_source_0_1= RULE_ID
                    {
                    lv_source_0_1=(Token)match(input,RULE_ID,FOLLOW_32); 

                    						newLeafNode(lv_source_0_1, grammarAccess.getConnectorAccess().getSourceIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConnectorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"source",
                    							lv_source_0_1,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:2056:6: lv_source_0_2= RULE_MCQUALIFIEDNAME
                    {
                    lv_source_0_2=(Token)match(input,RULE_MCQUALIFIEDNAME,FOLLOW_32); 

                    						newLeafNode(lv_source_0_2, grammarAccess.getConnectorAccess().getSourceMCQUALIFIEDNAMETerminalRuleCall_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConnectorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"source",
                    							lv_source_0_2,
                    							"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.MCQUALIFIEDNAME");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,53,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getConnectorAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalMontiArcAndCore.g:2077:3: ( ( (lv_target_2_1= RULE_ID | lv_target_2_2= RULE_MCQUALIFIEDNAME ) ) )
            // InternalMontiArcAndCore.g:2078:4: ( (lv_target_2_1= RULE_ID | lv_target_2_2= RULE_MCQUALIFIEDNAME ) )
            {
            // InternalMontiArcAndCore.g:2078:4: ( (lv_target_2_1= RULE_ID | lv_target_2_2= RULE_MCQUALIFIEDNAME ) )
            // InternalMontiArcAndCore.g:2079:5: (lv_target_2_1= RULE_ID | lv_target_2_2= RULE_MCQUALIFIEDNAME )
            {
            // InternalMontiArcAndCore.g:2079:5: (lv_target_2_1= RULE_ID | lv_target_2_2= RULE_MCQUALIFIEDNAME )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_MCQUALIFIEDNAME) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalMontiArcAndCore.g:2080:6: lv_target_2_1= RULE_ID
                    {
                    lv_target_2_1=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(lv_target_2_1, grammarAccess.getConnectorAccess().getTargetIDTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConnectorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"target",
                    							lv_target_2_1,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:2095:6: lv_target_2_2= RULE_MCQUALIFIEDNAME
                    {
                    lv_target_2_2=(Token)match(input,RULE_MCQUALIFIEDNAME,FOLLOW_6); 

                    						newLeafNode(lv_target_2_2, grammarAccess.getConnectorAccess().getTargetMCQUALIFIEDNAMETerminalRuleCall_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConnectorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"target",
                    							lv_target_2_2,
                    							"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.MCQUALIFIEDNAME");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getConnectorAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnector"


    // $ANTLR start "entryRulePort"
    // InternalMontiArcAndCore.g:2120:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalMontiArcAndCore.g:2120:45: (iv_rulePort= rulePort EOF )
            // InternalMontiArcAndCore.g:2121:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalMontiArcAndCore.g:2127:1: rulePort returns [EObject current=null] : (otherlv_0= 'port' ( (lv_condition_1_0= ruleCondition ) )? ( ( (lv_in_2_0= 'in' ) ) | ( (lv_out_3_0= 'out' ) ) ) ( ( (lv_type_4_0= ruleType ) ) | ( (otherlv_5= RULE_ID ) ) ) ( ( (lv_name_6_1= RULE_ID | lv_name_6_2= RULE_MCQUALIFIEDNAME ) ) ) otherlv_7= ';' ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_in_2_0=null;
        Token lv_out_3_0=null;
        Token otherlv_5=null;
        Token lv_name_6_1=null;
        Token lv_name_6_2=null;
        Token otherlv_7=null;
        EObject lv_condition_1_0 = null;

        EObject lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalMontiArcAndCore.g:2133:2: ( (otherlv_0= 'port' ( (lv_condition_1_0= ruleCondition ) )? ( ( (lv_in_2_0= 'in' ) ) | ( (lv_out_3_0= 'out' ) ) ) ( ( (lv_type_4_0= ruleType ) ) | ( (otherlv_5= RULE_ID ) ) ) ( ( (lv_name_6_1= RULE_ID | lv_name_6_2= RULE_MCQUALIFIEDNAME ) ) ) otherlv_7= ';' ) )
            // InternalMontiArcAndCore.g:2134:2: (otherlv_0= 'port' ( (lv_condition_1_0= ruleCondition ) )? ( ( (lv_in_2_0= 'in' ) ) | ( (lv_out_3_0= 'out' ) ) ) ( ( (lv_type_4_0= ruleType ) ) | ( (otherlv_5= RULE_ID ) ) ) ( ( (lv_name_6_1= RULE_ID | lv_name_6_2= RULE_MCQUALIFIEDNAME ) ) ) otherlv_7= ';' )
            {
            // InternalMontiArcAndCore.g:2134:2: (otherlv_0= 'port' ( (lv_condition_1_0= ruleCondition ) )? ( ( (lv_in_2_0= 'in' ) ) | ( (lv_out_3_0= 'out' ) ) ) ( ( (lv_type_4_0= ruleType ) ) | ( (otherlv_5= RULE_ID ) ) ) ( ( (lv_name_6_1= RULE_ID | lv_name_6_2= RULE_MCQUALIFIEDNAME ) ) ) otherlv_7= ';' )
            // InternalMontiArcAndCore.g:2135:3: otherlv_0= 'port' ( (lv_condition_1_0= ruleCondition ) )? ( ( (lv_in_2_0= 'in' ) ) | ( (lv_out_3_0= 'out' ) ) ) ( ( (lv_type_4_0= ruleType ) ) | ( (otherlv_5= RULE_ID ) ) ) ( ( (lv_name_6_1= RULE_ID | lv_name_6_2= RULE_MCQUALIFIEDNAME ) ) ) otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getPortAccess().getPortKeyword_0());
            		
            // InternalMontiArcAndCore.g:2139:3: ( (lv_condition_1_0= ruleCondition ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==57) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMontiArcAndCore.g:2140:4: (lv_condition_1_0= ruleCondition )
                    {
                    // InternalMontiArcAndCore.g:2140:4: (lv_condition_1_0= ruleCondition )
                    // InternalMontiArcAndCore.g:2141:5: lv_condition_1_0= ruleCondition
                    {

                    					newCompositeNode(grammarAccess.getPortAccess().getConditionConditionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_34);
                    lv_condition_1_0=ruleCondition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPortRule());
                    					}
                    					set(
                    						current,
                    						"condition",
                    						lv_condition_1_0,
                    						"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.Condition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMontiArcAndCore.g:2158:3: ( ( (lv_in_2_0= 'in' ) ) | ( (lv_out_3_0= 'out' ) ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==55) ) {
                alt32=1;
            }
            else if ( (LA32_0==56) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalMontiArcAndCore.g:2159:4: ( (lv_in_2_0= 'in' ) )
                    {
                    // InternalMontiArcAndCore.g:2159:4: ( (lv_in_2_0= 'in' ) )
                    // InternalMontiArcAndCore.g:2160:5: (lv_in_2_0= 'in' )
                    {
                    // InternalMontiArcAndCore.g:2160:5: (lv_in_2_0= 'in' )
                    // InternalMontiArcAndCore.g:2161:6: lv_in_2_0= 'in'
                    {
                    lv_in_2_0=(Token)match(input,55,FOLLOW_35); 

                    						newLeafNode(lv_in_2_0, grammarAccess.getPortAccess().getInInKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPortRule());
                    						}
                    						setWithLastConsumed(current, "in", lv_in_2_0 != null, "in");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:2174:4: ( (lv_out_3_0= 'out' ) )
                    {
                    // InternalMontiArcAndCore.g:2174:4: ( (lv_out_3_0= 'out' ) )
                    // InternalMontiArcAndCore.g:2175:5: (lv_out_3_0= 'out' )
                    {
                    // InternalMontiArcAndCore.g:2175:5: (lv_out_3_0= 'out' )
                    // InternalMontiArcAndCore.g:2176:6: lv_out_3_0= 'out'
                    {
                    lv_out_3_0=(Token)match(input,56,FOLLOW_35); 

                    						newLeafNode(lv_out_3_0, grammarAccess.getPortAccess().getOutOutKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPortRule());
                    						}
                    						setWithLastConsumed(current, "out", lv_out_3_0 != null, "out");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMontiArcAndCore.g:2189:3: ( ( (lv_type_4_0= ruleType ) ) | ( (otherlv_5= RULE_ID ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=17 && LA33_0<=35)) ) {
                alt33=1;
            }
            else if ( (LA33_0==RULE_ID) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalMontiArcAndCore.g:2190:4: ( (lv_type_4_0= ruleType ) )
                    {
                    // InternalMontiArcAndCore.g:2190:4: ( (lv_type_4_0= ruleType ) )
                    // InternalMontiArcAndCore.g:2191:5: (lv_type_4_0= ruleType )
                    {
                    // InternalMontiArcAndCore.g:2191:5: (lv_type_4_0= ruleType )
                    // InternalMontiArcAndCore.g:2192:6: lv_type_4_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getPortAccess().getTypeTypeParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_type_4_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPortRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:2210:4: ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalMontiArcAndCore.g:2210:4: ( (otherlv_5= RULE_ID ) )
                    // InternalMontiArcAndCore.g:2211:5: (otherlv_5= RULE_ID )
                    {
                    // InternalMontiArcAndCore.g:2211:5: (otherlv_5= RULE_ID )
                    // InternalMontiArcAndCore.g:2212:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPortRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(otherlv_5, grammarAccess.getPortAccess().getDataTypeCDDefinitionCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMontiArcAndCore.g:2224:3: ( ( (lv_name_6_1= RULE_ID | lv_name_6_2= RULE_MCQUALIFIEDNAME ) ) )
            // InternalMontiArcAndCore.g:2225:4: ( (lv_name_6_1= RULE_ID | lv_name_6_2= RULE_MCQUALIFIEDNAME ) )
            {
            // InternalMontiArcAndCore.g:2225:4: ( (lv_name_6_1= RULE_ID | lv_name_6_2= RULE_MCQUALIFIEDNAME ) )
            // InternalMontiArcAndCore.g:2226:5: (lv_name_6_1= RULE_ID | lv_name_6_2= RULE_MCQUALIFIEDNAME )
            {
            // InternalMontiArcAndCore.g:2226:5: (lv_name_6_1= RULE_ID | lv_name_6_2= RULE_MCQUALIFIEDNAME )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            else if ( (LA34_0==RULE_MCQUALIFIEDNAME) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalMontiArcAndCore.g:2227:6: lv_name_6_1= RULE_ID
                    {
                    lv_name_6_1=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(lv_name_6_1, grammarAccess.getPortAccess().getNameIDTerminalRuleCall_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPortRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_6_1,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:2242:6: lv_name_6_2= RULE_MCQUALIFIEDNAME
                    {
                    lv_name_6_2=(Token)match(input,RULE_MCQUALIFIEDNAME,FOLLOW_6); 

                    						newLeafNode(lv_name_6_2, grammarAccess.getPortAccess().getNameMCQUALIFIEDNAMETerminalRuleCall_4_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPortRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_6_2,
                    							"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.MCQUALIFIEDNAME");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPortAccess().getSemicolonKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleCondition"
    // InternalMontiArcAndCore.g:2267:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalMontiArcAndCore.g:2267:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalMontiArcAndCore.g:2268:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalMontiArcAndCore.g:2274:1: ruleCondition returns [EObject current=null] : (otherlv_0= '<<' otherlv_1= 'condition' otherlv_2= '=' ( (lv_condition_3_0= RULE_STRING ) ) otherlv_4= '>>' ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_condition_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMontiArcAndCore.g:2280:2: ( (otherlv_0= '<<' otherlv_1= 'condition' otherlv_2= '=' ( (lv_condition_3_0= RULE_STRING ) ) otherlv_4= '>>' ) )
            // InternalMontiArcAndCore.g:2281:2: (otherlv_0= '<<' otherlv_1= 'condition' otherlv_2= '=' ( (lv_condition_3_0= RULE_STRING ) ) otherlv_4= '>>' )
            {
            // InternalMontiArcAndCore.g:2281:2: (otherlv_0= '<<' otherlv_1= 'condition' otherlv_2= '=' ( (lv_condition_3_0= RULE_STRING ) ) otherlv_4= '>>' )
            // InternalMontiArcAndCore.g:2282:3: otherlv_0= '<<' otherlv_1= 'condition' otherlv_2= '=' ( (lv_condition_3_0= RULE_STRING ) ) otherlv_4= '>>'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getLessThanSignLessThanSignKeyword_0());
            		
            otherlv_1=(Token)match(input,58,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getConditionKeyword_1());
            		
            otherlv_2=(Token)match(input,52,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getEqualsSignKeyword_2());
            		
            // InternalMontiArcAndCore.g:2294:3: ( (lv_condition_3_0= RULE_STRING ) )
            // InternalMontiArcAndCore.g:2295:4: (lv_condition_3_0= RULE_STRING )
            {
            // InternalMontiArcAndCore.g:2295:4: (lv_condition_3_0= RULE_STRING )
            // InternalMontiArcAndCore.g:2296:5: lv_condition_3_0= RULE_STRING
            {
            lv_condition_3_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

            					newLeafNode(lv_condition_3_0, grammarAccess.getConditionAccess().getConditionSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"condition",
            						lv_condition_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,59,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getGreaterThanSignGreaterThanSignKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleNames"
    // InternalMontiArcAndCore.g:2320:1: entryRuleNames returns [EObject current=null] : iv_ruleNames= ruleNames EOF ;
    public final EObject entryRuleNames() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNames = null;


        try {
            // InternalMontiArcAndCore.g:2320:46: (iv_ruleNames= ruleNames EOF )
            // InternalMontiArcAndCore.g:2321:2: iv_ruleNames= ruleNames EOF
            {
             newCompositeNode(grammarAccess.getNamesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNames=ruleNames();

            state._fsp--;

             current =iv_ruleNames; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNames"


    // $ANTLR start "ruleNames"
    // InternalMontiArcAndCore.g:2327:1: ruleNames returns [EObject current=null] : ( ( ( (lv_names_0_1= RULE_ID | lv_names_0_2= RULE_MCQUALIFIEDNAME ) ) ) (otherlv_1= ',' ( ( (lv_names_2_1= RULE_ID | lv_names_2_2= RULE_MCQUALIFIEDNAME ) ) ) )* ) ;
    public final EObject ruleNames() throws RecognitionException {
        EObject current = null;

        Token lv_names_0_1=null;
        Token lv_names_0_2=null;
        Token otherlv_1=null;
        Token lv_names_2_1=null;
        Token lv_names_2_2=null;


        	enterRule();

        try {
            // InternalMontiArcAndCore.g:2333:2: ( ( ( ( (lv_names_0_1= RULE_ID | lv_names_0_2= RULE_MCQUALIFIEDNAME ) ) ) (otherlv_1= ',' ( ( (lv_names_2_1= RULE_ID | lv_names_2_2= RULE_MCQUALIFIEDNAME ) ) ) )* ) )
            // InternalMontiArcAndCore.g:2334:2: ( ( ( (lv_names_0_1= RULE_ID | lv_names_0_2= RULE_MCQUALIFIEDNAME ) ) ) (otherlv_1= ',' ( ( (lv_names_2_1= RULE_ID | lv_names_2_2= RULE_MCQUALIFIEDNAME ) ) ) )* )
            {
            // InternalMontiArcAndCore.g:2334:2: ( ( ( (lv_names_0_1= RULE_ID | lv_names_0_2= RULE_MCQUALIFIEDNAME ) ) ) (otherlv_1= ',' ( ( (lv_names_2_1= RULE_ID | lv_names_2_2= RULE_MCQUALIFIEDNAME ) ) ) )* )
            // InternalMontiArcAndCore.g:2335:3: ( ( (lv_names_0_1= RULE_ID | lv_names_0_2= RULE_MCQUALIFIEDNAME ) ) ) (otherlv_1= ',' ( ( (lv_names_2_1= RULE_ID | lv_names_2_2= RULE_MCQUALIFIEDNAME ) ) ) )*
            {
            // InternalMontiArcAndCore.g:2335:3: ( ( (lv_names_0_1= RULE_ID | lv_names_0_2= RULE_MCQUALIFIEDNAME ) ) )
            // InternalMontiArcAndCore.g:2336:4: ( (lv_names_0_1= RULE_ID | lv_names_0_2= RULE_MCQUALIFIEDNAME ) )
            {
            // InternalMontiArcAndCore.g:2336:4: ( (lv_names_0_1= RULE_ID | lv_names_0_2= RULE_MCQUALIFIEDNAME ) )
            // InternalMontiArcAndCore.g:2337:5: (lv_names_0_1= RULE_ID | lv_names_0_2= RULE_MCQUALIFIEDNAME )
            {
            // InternalMontiArcAndCore.g:2337:5: (lv_names_0_1= RULE_ID | lv_names_0_2= RULE_MCQUALIFIEDNAME )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            else if ( (LA35_0==RULE_MCQUALIFIEDNAME) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalMontiArcAndCore.g:2338:6: lv_names_0_1= RULE_ID
                    {
                    lv_names_0_1=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(lv_names_0_1, grammarAccess.getNamesAccess().getNamesIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamesRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"names",
                    							lv_names_0_1,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:2353:6: lv_names_0_2= RULE_MCQUALIFIEDNAME
                    {
                    lv_names_0_2=(Token)match(input,RULE_MCQUALIFIEDNAME,FOLLOW_29); 

                    						newLeafNode(lv_names_0_2, grammarAccess.getNamesAccess().getNamesMCQUALIFIEDNAMETerminalRuleCall_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamesRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"names",
                    							lv_names_0_2,
                    							"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.MCQUALIFIEDNAME");
                    					

                    }
                    break;

            }


            }


            }

            // InternalMontiArcAndCore.g:2370:3: (otherlv_1= ',' ( ( (lv_names_2_1= RULE_ID | lv_names_2_2= RULE_MCQUALIFIEDNAME ) ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==41) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalMontiArcAndCore.g:2371:4: otherlv_1= ',' ( ( (lv_names_2_1= RULE_ID | lv_names_2_2= RULE_MCQUALIFIEDNAME ) ) )
            	    {
            	    otherlv_1=(Token)match(input,41,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getNamesAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMontiArcAndCore.g:2375:4: ( ( (lv_names_2_1= RULE_ID | lv_names_2_2= RULE_MCQUALIFIEDNAME ) ) )
            	    // InternalMontiArcAndCore.g:2376:5: ( (lv_names_2_1= RULE_ID | lv_names_2_2= RULE_MCQUALIFIEDNAME ) )
            	    {
            	    // InternalMontiArcAndCore.g:2376:5: ( (lv_names_2_1= RULE_ID | lv_names_2_2= RULE_MCQUALIFIEDNAME ) )
            	    // InternalMontiArcAndCore.g:2377:6: (lv_names_2_1= RULE_ID | lv_names_2_2= RULE_MCQUALIFIEDNAME )
            	    {
            	    // InternalMontiArcAndCore.g:2377:6: (lv_names_2_1= RULE_ID | lv_names_2_2= RULE_MCQUALIFIEDNAME )
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==RULE_ID) ) {
            	        alt36=1;
            	    }
            	    else if ( (LA36_0==RULE_MCQUALIFIEDNAME) ) {
            	        alt36=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 36, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // InternalMontiArcAndCore.g:2378:7: lv_names_2_1= RULE_ID
            	            {
            	            lv_names_2_1=(Token)match(input,RULE_ID,FOLLOW_29); 

            	            							newLeafNode(lv_names_2_1, grammarAccess.getNamesAccess().getNamesIDTerminalRuleCall_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getNamesRule());
            	            							}
            	            							addWithLastConsumed(
            	            								current,
            	            								"names",
            	            								lv_names_2_1,
            	            								"org.eclipse.xtext.common.Terminals.ID");
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalMontiArcAndCore.g:2393:7: lv_names_2_2= RULE_MCQUALIFIEDNAME
            	            {
            	            lv_names_2_2=(Token)match(input,RULE_MCQUALIFIEDNAME,FOLLOW_29); 

            	            							newLeafNode(lv_names_2_2, grammarAccess.getNamesAccess().getNamesMCQUALIFIEDNAMETerminalRuleCall_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getNamesRule());
            	            							}
            	            							addWithLastConsumed(
            	            								current,
            	            								"names",
            	            								lv_names_2_2,
            	            								"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.MCQUALIFIEDNAME");
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNames"


    // $ANTLR start "entryRuleVariable"
    // InternalMontiArcAndCore.g:2415:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalMontiArcAndCore.g:2415:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalMontiArcAndCore.g:2416:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMontiArcAndCore.g:2422:1: ruleVariable returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_MCQUALIFIEDNAME ) ) ) otherlv_2= ';' ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMontiArcAndCore.g:2428:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_MCQUALIFIEDNAME ) ) ) otherlv_2= ';' ) )
            // InternalMontiArcAndCore.g:2429:2: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_MCQUALIFIEDNAME ) ) ) otherlv_2= ';' )
            {
            // InternalMontiArcAndCore.g:2429:2: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_MCQUALIFIEDNAME ) ) ) otherlv_2= ';' )
            // InternalMontiArcAndCore.g:2430:3: ( (otherlv_0= RULE_ID ) ) ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_MCQUALIFIEDNAME ) ) ) otherlv_2= ';'
            {
            // InternalMontiArcAndCore.g:2430:3: ( (otherlv_0= RULE_ID ) )
            // InternalMontiArcAndCore.g:2431:4: (otherlv_0= RULE_ID )
            {
            // InternalMontiArcAndCore.g:2431:4: (otherlv_0= RULE_ID )
            // InternalMontiArcAndCore.g:2432:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getTypeComponentCrossReference_0_0());
            				

            }


            }

            // InternalMontiArcAndCore.g:2443:3: ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_MCQUALIFIEDNAME ) ) )
            // InternalMontiArcAndCore.g:2444:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_MCQUALIFIEDNAME ) )
            {
            // InternalMontiArcAndCore.g:2444:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_MCQUALIFIEDNAME ) )
            // InternalMontiArcAndCore.g:2445:5: (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_MCQUALIFIEDNAME )
            {
            // InternalMontiArcAndCore.g:2445:5: (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_MCQUALIFIEDNAME )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_MCQUALIFIEDNAME) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalMontiArcAndCore.g:2446:6: lv_name_1_1= RULE_ID
                    {
                    lv_name_1_1=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(lv_name_1_1, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVariableRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_1,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:2461:6: lv_name_1_2= RULE_MCQUALIFIEDNAME
                    {
                    lv_name_1_2=(Token)match(input,RULE_MCQUALIFIEDNAME,FOLLOW_6); 

                    						newLeafNode(lv_name_1_2, grammarAccess.getVariableAccess().getNameMCQUALIFIEDNAMETerminalRuleCall_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVariableRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_2,
                    							"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.MCQUALIFIEDNAME");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleAutomaton"
    // InternalMontiArcAndCore.g:2486:1: entryRuleAutomaton returns [EObject current=null] : iv_ruleAutomaton= ruleAutomaton EOF ;
    public final EObject entryRuleAutomaton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutomaton = null;


        try {
            // InternalMontiArcAndCore.g:2486:50: (iv_ruleAutomaton= ruleAutomaton EOF )
            // InternalMontiArcAndCore.g:2487:2: iv_ruleAutomaton= ruleAutomaton EOF
            {
             newCompositeNode(grammarAccess.getAutomatonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAutomaton=ruleAutomaton();

            state._fsp--;

             current =iv_ruleAutomaton; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAutomaton"


    // $ANTLR start "ruleAutomaton"
    // InternalMontiArcAndCore.g:2493:1: ruleAutomaton returns [EObject current=null] : ( () ( (lv_sync_1_0= RULE_SYNC ) )? otherlv_2= 'automaton' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '{' ( ( (lv_states_5_0= ruleState ) ) | ( (lv_transitions_6_0= ruleTransition ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleAutomaton() throws RecognitionException {
        EObject current = null;

        Token lv_sync_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_states_5_0 = null;

        EObject lv_transitions_6_0 = null;



        	enterRule();

        try {
            // InternalMontiArcAndCore.g:2499:2: ( ( () ( (lv_sync_1_0= RULE_SYNC ) )? otherlv_2= 'automaton' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '{' ( ( (lv_states_5_0= ruleState ) ) | ( (lv_transitions_6_0= ruleTransition ) ) )* otherlv_7= '}' ) )
            // InternalMontiArcAndCore.g:2500:2: ( () ( (lv_sync_1_0= RULE_SYNC ) )? otherlv_2= 'automaton' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '{' ( ( (lv_states_5_0= ruleState ) ) | ( (lv_transitions_6_0= ruleTransition ) ) )* otherlv_7= '}' )
            {
            // InternalMontiArcAndCore.g:2500:2: ( () ( (lv_sync_1_0= RULE_SYNC ) )? otherlv_2= 'automaton' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '{' ( ( (lv_states_5_0= ruleState ) ) | ( (lv_transitions_6_0= ruleTransition ) ) )* otherlv_7= '}' )
            // InternalMontiArcAndCore.g:2501:3: () ( (lv_sync_1_0= RULE_SYNC ) )? otherlv_2= 'automaton' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '{' ( ( (lv_states_5_0= ruleState ) ) | ( (lv_transitions_6_0= ruleTransition ) ) )* otherlv_7= '}'
            {
            // InternalMontiArcAndCore.g:2501:3: ()
            // InternalMontiArcAndCore.g:2502:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAutomatonAccess().getAutomatonAction_0(),
            					current);
            			

            }

            // InternalMontiArcAndCore.g:2508:3: ( (lv_sync_1_0= RULE_SYNC ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_SYNC) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMontiArcAndCore.g:2509:4: (lv_sync_1_0= RULE_SYNC )
                    {
                    // InternalMontiArcAndCore.g:2509:4: (lv_sync_1_0= RULE_SYNC )
                    // InternalMontiArcAndCore.g:2510:5: lv_sync_1_0= RULE_SYNC
                    {
                    lv_sync_1_0=(Token)match(input,RULE_SYNC,FOLLOW_40); 

                    					newLeafNode(lv_sync_1_0, grammarAccess.getAutomatonAccess().getSyncSYNCTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAutomatonRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"sync",
                    						lv_sync_1_0 != null,
                    						"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.SYNC");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,60,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getAutomatonAccess().getAutomatonKeyword_2());
            		
            // InternalMontiArcAndCore.g:2530:3: ( (lv_name_3_0= RULE_ID ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMontiArcAndCore.g:2531:4: (lv_name_3_0= RULE_ID )
                    {
                    // InternalMontiArcAndCore.g:2531:4: (lv_name_3_0= RULE_ID )
                    // InternalMontiArcAndCore.g:2532:5: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_18); 

                    					newLeafNode(lv_name_3_0, grammarAccess.getAutomatonAccess().getNameIDTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAutomatonRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_3_0 != null,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,44,FOLLOW_42); 

            			newLeafNode(otherlv_4, grammarAccess.getAutomatonAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMontiArcAndCore.g:2552:3: ( ( (lv_states_5_0= ruleState ) ) | ( (lv_transitions_6_0= ruleTransition ) ) )*
            loop41:
            do {
                int alt41=3;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==44||LA41_0==61||(LA41_0>=68 && LA41_0<=69)) ) {
                    alt41=1;
                }
                else if ( (LA41_0==RULE_ID) ) {
                    alt41=2;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalMontiArcAndCore.g:2553:4: ( (lv_states_5_0= ruleState ) )
            	    {
            	    // InternalMontiArcAndCore.g:2553:4: ( (lv_states_5_0= ruleState ) )
            	    // InternalMontiArcAndCore.g:2554:5: (lv_states_5_0= ruleState )
            	    {
            	    // InternalMontiArcAndCore.g:2554:5: (lv_states_5_0= ruleState )
            	    // InternalMontiArcAndCore.g:2555:6: lv_states_5_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getAutomatonAccess().getStatesStateParserRuleCall_5_0_0());
            	    					
            	    pushFollow(FOLLOW_42);
            	    lv_states_5_0=ruleState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAutomatonRule());
            	    						}
            	    						add(
            	    							current,
            	    							"states",
            	    							lv_states_5_0,
            	    							"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.State");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMontiArcAndCore.g:2573:4: ( (lv_transitions_6_0= ruleTransition ) )
            	    {
            	    // InternalMontiArcAndCore.g:2573:4: ( (lv_transitions_6_0= ruleTransition ) )
            	    // InternalMontiArcAndCore.g:2574:5: (lv_transitions_6_0= ruleTransition )
            	    {
            	    // InternalMontiArcAndCore.g:2574:5: (lv_transitions_6_0= ruleTransition )
            	    // InternalMontiArcAndCore.g:2575:6: lv_transitions_6_0= ruleTransition
            	    {

            	    						newCompositeNode(grammarAccess.getAutomatonAccess().getTransitionsTransitionParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_42);
            	    lv_transitions_6_0=ruleTransition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAutomatonRule());
            	    						}
            	    						add(
            	    							current,
            	    							"transitions",
            	    							lv_transitions_6_0,
            	    							"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.Transition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            otherlv_7=(Token)match(input,45,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAutomatonAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAutomaton"


    // $ANTLR start "entryRuleState"
    // InternalMontiArcAndCore.g:2601:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalMontiArcAndCore.g:2601:46: (iv_ruleState= ruleState EOF )
            // InternalMontiArcAndCore.g:2602:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalMontiArcAndCore.g:2608:1: ruleState returns [EObject current=null] : (this_SCState_0= ruleSCState | this_InvState_1= ruleInvState ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        EObject this_SCState_0 = null;

        EObject this_InvState_1 = null;



        	enterRule();

        try {
            // InternalMontiArcAndCore.g:2614:2: ( (this_SCState_0= ruleSCState | this_InvState_1= ruleInvState ) )
            // InternalMontiArcAndCore.g:2615:2: (this_SCState_0= ruleSCState | this_InvState_1= ruleInvState )
            {
            // InternalMontiArcAndCore.g:2615:2: (this_SCState_0= ruleSCState | this_InvState_1= ruleInvState )
            int alt42=2;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // InternalMontiArcAndCore.g:2616:3: this_SCState_0= ruleSCState
                    {

                    			newCompositeNode(grammarAccess.getStateAccess().getSCStateParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SCState_0=ruleSCState();

                    state._fsp--;


                    			current = this_SCState_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:2625:3: this_InvState_1= ruleInvState
                    {

                    			newCompositeNode(grammarAccess.getStateAccess().getInvStateParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_InvState_1=ruleInvState();

                    state._fsp--;


                    			current = this_InvState_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleSCState"
    // InternalMontiArcAndCore.g:2637:1: entryRuleSCState returns [EObject current=null] : iv_ruleSCState= ruleSCState EOF ;
    public final EObject entryRuleSCState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSCState = null;


        try {
            // InternalMontiArcAndCore.g:2637:48: (iv_ruleSCState= ruleSCState EOF )
            // InternalMontiArcAndCore.g:2638:2: iv_ruleSCState= ruleSCState EOF
            {
             newCompositeNode(grammarAccess.getSCStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSCState=ruleSCState();

            state._fsp--;

             current =iv_ruleSCState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSCState"


    // $ANTLR start "ruleSCState"
    // InternalMontiArcAndCore.g:2644:1: ruleSCState returns [EObject current=null] : ( ( (lv_modifier_0_0= ruleSCModifier ) )* ( (lv_ante_1_0= ruleSCSAnte ) )? otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleSCState() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Enumerator lv_modifier_0_0 = null;

        EObject lv_ante_1_0 = null;



        	enterRule();

        try {
            // InternalMontiArcAndCore.g:2650:2: ( ( ( (lv_modifier_0_0= ruleSCModifier ) )* ( (lv_ante_1_0= ruleSCSAnte ) )? otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalMontiArcAndCore.g:2651:2: ( ( (lv_modifier_0_0= ruleSCModifier ) )* ( (lv_ante_1_0= ruleSCSAnte ) )? otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalMontiArcAndCore.g:2651:2: ( ( (lv_modifier_0_0= ruleSCModifier ) )* ( (lv_ante_1_0= ruleSCSAnte ) )? otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            // InternalMontiArcAndCore.g:2652:3: ( (lv_modifier_0_0= ruleSCModifier ) )* ( (lv_ante_1_0= ruleSCSAnte ) )? otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';'
            {
            // InternalMontiArcAndCore.g:2652:3: ( (lv_modifier_0_0= ruleSCModifier ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=68 && LA43_0<=69)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalMontiArcAndCore.g:2653:4: (lv_modifier_0_0= ruleSCModifier )
            	    {
            	    // InternalMontiArcAndCore.g:2653:4: (lv_modifier_0_0= ruleSCModifier )
            	    // InternalMontiArcAndCore.g:2654:5: lv_modifier_0_0= ruleSCModifier
            	    {

            	    					newCompositeNode(grammarAccess.getSCStateAccess().getModifierSCModifierEnumRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_43);
            	    lv_modifier_0_0=ruleSCModifier();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSCStateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"modifier",
            	    						lv_modifier_0_0,
            	    						"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.SCModifier");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            // InternalMontiArcAndCore.g:2671:3: ( (lv_ante_1_0= ruleSCSAnte ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==44) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMontiArcAndCore.g:2672:4: (lv_ante_1_0= ruleSCSAnte )
                    {
                    // InternalMontiArcAndCore.g:2672:4: (lv_ante_1_0= ruleSCSAnte )
                    // InternalMontiArcAndCore.g:2673:5: lv_ante_1_0= ruleSCSAnte
                    {

                    					newCompositeNode(grammarAccess.getSCStateAccess().getAnteSCSAnteParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_44);
                    lv_ante_1_0=ruleSCSAnte();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSCStateRule());
                    					}
                    					set(
                    						current,
                    						"ante",
                    						lv_ante_1_0,
                    						"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.SCSAnte");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,61,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getSCStateAccess().getStateKeyword_2());
            		
            // InternalMontiArcAndCore.g:2694:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalMontiArcAndCore.g:2695:4: (lv_name_3_0= RULE_ID )
            {
            // InternalMontiArcAndCore.g:2695:4: (lv_name_3_0= RULE_ID )
            // InternalMontiArcAndCore.g:2696:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_3_0, grammarAccess.getSCStateAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSCStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSCStateAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSCState"


    // $ANTLR start "entryRuleInvState"
    // InternalMontiArcAndCore.g:2720:1: entryRuleInvState returns [EObject current=null] : iv_ruleInvState= ruleInvState EOF ;
    public final EObject entryRuleInvState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvState = null;


        try {
            // InternalMontiArcAndCore.g:2720:49: (iv_ruleInvState= ruleInvState EOF )
            // InternalMontiArcAndCore.g:2721:2: iv_ruleInvState= ruleInvState EOF
            {
             newCompositeNode(grammarAccess.getInvStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInvState=ruleInvState();

            state._fsp--;

             current =iv_ruleInvState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInvState"


    // $ANTLR start "ruleInvState"
    // InternalMontiArcAndCore.g:2727:1: ruleInvState returns [EObject current=null] : ( ( (lv_modifier_0_0= ruleSCModifier ) )* otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ']' otherlv_6= ';' ) ;
    public final EObject ruleInvState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Enumerator lv_modifier_0_0 = null;

        EObject lv_expression_4_0 = null;



        	enterRule();

        try {
            // InternalMontiArcAndCore.g:2733:2: ( ( ( (lv_modifier_0_0= ruleSCModifier ) )* otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ']' otherlv_6= ';' ) )
            // InternalMontiArcAndCore.g:2734:2: ( ( (lv_modifier_0_0= ruleSCModifier ) )* otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ']' otherlv_6= ';' )
            {
            // InternalMontiArcAndCore.g:2734:2: ( ( (lv_modifier_0_0= ruleSCModifier ) )* otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ']' otherlv_6= ';' )
            // InternalMontiArcAndCore.g:2735:3: ( (lv_modifier_0_0= ruleSCModifier ) )* otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ']' otherlv_6= ';'
            {
            // InternalMontiArcAndCore.g:2735:3: ( (lv_modifier_0_0= ruleSCModifier ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=68 && LA45_0<=69)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalMontiArcAndCore.g:2736:4: (lv_modifier_0_0= ruleSCModifier )
            	    {
            	    // InternalMontiArcAndCore.g:2736:4: (lv_modifier_0_0= ruleSCModifier )
            	    // InternalMontiArcAndCore.g:2737:5: lv_modifier_0_0= ruleSCModifier
            	    {

            	    					newCompositeNode(grammarAccess.getInvStateAccess().getModifierSCModifierEnumRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_45);
            	    lv_modifier_0_0=ruleSCModifier();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInvStateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"modifier",
            	    						lv_modifier_0_0,
            	    						"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.SCModifier");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            otherlv_1=(Token)match(input,61,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getInvStateAccess().getStateKeyword_1());
            		
            // InternalMontiArcAndCore.g:2758:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMontiArcAndCore.g:2759:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMontiArcAndCore.g:2759:4: (lv_name_2_0= RULE_ID )
            // InternalMontiArcAndCore.g:2760:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_2_0, grammarAccess.getInvStateAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInvStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,38,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getInvStateAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalMontiArcAndCore.g:2780:3: ( (lv_expression_4_0= ruleExpression ) )
            // InternalMontiArcAndCore.g:2781:4: (lv_expression_4_0= ruleExpression )
            {
            // InternalMontiArcAndCore.g:2781:4: (lv_expression_4_0= ruleExpression )
            // InternalMontiArcAndCore.g:2782:5: lv_expression_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getInvStateAccess().getExpressionExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
            lv_expression_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInvStateRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_4_0,
            						"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,39,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getInvStateAccess().getRightSquareBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getInvStateAccess().getSemicolonKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInvState"


    // $ANTLR start "entryRuleSCSAnte"
    // InternalMontiArcAndCore.g:2811:1: entryRuleSCSAnte returns [EObject current=null] : iv_ruleSCSAnte= ruleSCSAnte EOF ;
    public final EObject entryRuleSCSAnte() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSCSAnte = null;


        try {
            // InternalMontiArcAndCore.g:2811:48: (iv_ruleSCSAnte= ruleSCSAnte EOF )
            // InternalMontiArcAndCore.g:2812:2: iv_ruleSCSAnte= ruleSCSAnte EOF
            {
             newCompositeNode(grammarAccess.getSCSAnteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSCSAnte=ruleSCSAnte();

            state._fsp--;

             current =iv_ruleSCSAnte; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSCSAnte"


    // $ANTLR start "ruleSCSAnte"
    // InternalMontiArcAndCore.g:2818:1: ruleSCSAnte returns [EObject current=null] : ( () ( (lv_block_1_0= ruleBlock ) ) ) ;
    public final EObject ruleSCSAnte() throws RecognitionException {
        EObject current = null;

        EObject lv_block_1_0 = null;



        	enterRule();

        try {
            // InternalMontiArcAndCore.g:2824:2: ( ( () ( (lv_block_1_0= ruleBlock ) ) ) )
            // InternalMontiArcAndCore.g:2825:2: ( () ( (lv_block_1_0= ruleBlock ) ) )
            {
            // InternalMontiArcAndCore.g:2825:2: ( () ( (lv_block_1_0= ruleBlock ) ) )
            // InternalMontiArcAndCore.g:2826:3: () ( (lv_block_1_0= ruleBlock ) )
            {
            // InternalMontiArcAndCore.g:2826:3: ()
            // InternalMontiArcAndCore.g:2827:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSCSAnteAccess().getSCSAnteAction_0(),
            					current);
            			

            }

            // InternalMontiArcAndCore.g:2833:3: ( (lv_block_1_0= ruleBlock ) )
            // InternalMontiArcAndCore.g:2834:4: (lv_block_1_0= ruleBlock )
            {
            // InternalMontiArcAndCore.g:2834:4: (lv_block_1_0= ruleBlock )
            // InternalMontiArcAndCore.g:2835:5: lv_block_1_0= ruleBlock
            {

            					newCompositeNode(grammarAccess.getSCSAnteAccess().getBlockBlockParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_block_1_0=ruleBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSCSAnteRule());
            					}
            					set(
            						current,
            						"block",
            						lv_block_1_0,
            						"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.Block");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSCSAnte"


    // $ANTLR start "entryRuleTransition"
    // InternalMontiArcAndCore.g:2856:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalMontiArcAndCore.g:2856:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalMontiArcAndCore.g:2857:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalMontiArcAndCore.g:2863:1: ruleTransition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )? (otherlv_3= '[' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ']' )? (otherlv_6= '/' ( (lv_reaction_7_0= ruleBlock ) ) )? otherlv_8= ';' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_expression_4_0 = null;

        EObject lv_reaction_7_0 = null;



        	enterRule();

        try {
            // InternalMontiArcAndCore.g:2869:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )? (otherlv_3= '[' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ']' )? (otherlv_6= '/' ( (lv_reaction_7_0= ruleBlock ) ) )? otherlv_8= ';' ) )
            // InternalMontiArcAndCore.g:2870:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )? (otherlv_3= '[' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ']' )? (otherlv_6= '/' ( (lv_reaction_7_0= ruleBlock ) ) )? otherlv_8= ';' )
            {
            // InternalMontiArcAndCore.g:2870:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )? (otherlv_3= '[' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ']' )? (otherlv_6= '/' ( (lv_reaction_7_0= ruleBlock ) ) )? otherlv_8= ';' )
            // InternalMontiArcAndCore.g:2871:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )? (otherlv_3= '[' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ']' )? (otherlv_6= '/' ( (lv_reaction_7_0= ruleBlock ) ) )? otherlv_8= ';'
            {
            // InternalMontiArcAndCore.g:2871:3: ( (otherlv_0= RULE_ID ) )
            // InternalMontiArcAndCore.g:2872:4: (otherlv_0= RULE_ID )
            {
            // InternalMontiArcAndCore.g:2872:4: (otherlv_0= RULE_ID )
            // InternalMontiArcAndCore.g:2873:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_46); 

            					newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getSourceStateCrossReference_0_0());
            				

            }


            }

            // InternalMontiArcAndCore.g:2884:3: (otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==53) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMontiArcAndCore.g:2885:4: otherlv_1= '->' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,53,FOLLOW_15); 

                    				newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1_0());
                    			
                    // InternalMontiArcAndCore.g:2889:4: ( (otherlv_2= RULE_ID ) )
                    // InternalMontiArcAndCore.g:2890:5: (otherlv_2= RULE_ID )
                    {
                    // InternalMontiArcAndCore.g:2890:5: (otherlv_2= RULE_ID )
                    // InternalMontiArcAndCore.g:2891:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_47); 

                    						newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getTargetStateCrossReference_1_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMontiArcAndCore.g:2903:3: (otherlv_3= '[' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ']' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==38) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMontiArcAndCore.g:2904:4: otherlv_3= '[' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ']'
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalMontiArcAndCore.g:2908:4: ( (lv_expression_4_0= ruleExpression ) )
                    // InternalMontiArcAndCore.g:2909:5: (lv_expression_4_0= ruleExpression )
                    {
                    // InternalMontiArcAndCore.g:2909:5: (lv_expression_4_0= ruleExpression )
                    // InternalMontiArcAndCore.g:2910:6: lv_expression_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getExpressionExpressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_expression_4_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_4_0,
                    							"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,39,FOLLOW_48); 

                    				newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getRightSquareBracketKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalMontiArcAndCore.g:2932:3: (otherlv_6= '/' ( (lv_reaction_7_0= ruleBlock ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==62) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMontiArcAndCore.g:2933:4: otherlv_6= '/' ( (lv_reaction_7_0= ruleBlock ) )
                    {
                    otherlv_6=(Token)match(input,62,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getSolidusKeyword_3_0());
                    			
                    // InternalMontiArcAndCore.g:2937:4: ( (lv_reaction_7_0= ruleBlock ) )
                    // InternalMontiArcAndCore.g:2938:5: (lv_reaction_7_0= ruleBlock )
                    {
                    // InternalMontiArcAndCore.g:2938:5: (lv_reaction_7_0= ruleBlock )
                    // InternalMontiArcAndCore.g:2939:6: lv_reaction_7_0= ruleBlock
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getReactionBlockParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_reaction_7_0=ruleBlock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    						}
                    						set(
                    							current,
                    							"reaction",
                    							lv_reaction_7_0,
                    							"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.Block");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleBlock"
    // InternalMontiArcAndCore.g:2965:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalMontiArcAndCore.g:2965:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalMontiArcAndCore.g:2966:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalMontiArcAndCore.g:2972:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_blocks_2_0= ruleBlockStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_blocks_2_0 = null;



        	enterRule();

        try {
            // InternalMontiArcAndCore.g:2978:2: ( ( () otherlv_1= '{' ( (lv_blocks_2_0= ruleBlockStatement ) )* otherlv_3= '}' ) )
            // InternalMontiArcAndCore.g:2979:2: ( () otherlv_1= '{' ( (lv_blocks_2_0= ruleBlockStatement ) )* otherlv_3= '}' )
            {
            // InternalMontiArcAndCore.g:2979:2: ( () otherlv_1= '{' ( (lv_blocks_2_0= ruleBlockStatement ) )* otherlv_3= '}' )
            // InternalMontiArcAndCore.g:2980:3: () otherlv_1= '{' ( (lv_blocks_2_0= ruleBlockStatement ) )* otherlv_3= '}'
            {
            // InternalMontiArcAndCore.g:2980:3: ()
            // InternalMontiArcAndCore.g:2981:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBlockAccess().getBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_49); 

            			newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMontiArcAndCore.g:2991:3: ( (lv_blocks_2_0= ruleBlockStatement ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_MCQUALIFIEDNAME||(LA49_0>=RULE_ID && LA49_0<=RULE_STRING)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalMontiArcAndCore.g:2992:4: (lv_blocks_2_0= ruleBlockStatement )
            	    {
            	    // InternalMontiArcAndCore.g:2992:4: (lv_blocks_2_0= ruleBlockStatement )
            	    // InternalMontiArcAndCore.g:2993:5: lv_blocks_2_0= ruleBlockStatement
            	    {

            	    					newCompositeNode(grammarAccess.getBlockAccess().getBlocksBlockStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_49);
            	    lv_blocks_2_0=ruleBlockStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"blocks",
            	    						lv_blocks_2_0,
            	    						"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.BlockStatement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            otherlv_3=(Token)match(input,45,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleBlockStatement"
    // InternalMontiArcAndCore.g:3018:1: entryRuleBlockStatement returns [EObject current=null] : iv_ruleBlockStatement= ruleBlockStatement EOF ;
    public final EObject entryRuleBlockStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockStatement = null;


        try {
            // InternalMontiArcAndCore.g:3018:55: (iv_ruleBlockStatement= ruleBlockStatement EOF )
            // InternalMontiArcAndCore.g:3019:2: iv_ruleBlockStatement= ruleBlockStatement EOF
            {
             newCompositeNode(grammarAccess.getBlockStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlockStatement=ruleBlockStatement();

            state._fsp--;

             current =iv_ruleBlockStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlockStatement"


    // $ANTLR start "ruleBlockStatement"
    // InternalMontiArcAndCore.g:3025:1: ruleBlockStatement returns [EObject current=null] : (this_SimpleInit_0= ruleSimpleInit | this_SimpleExpression_1= ruleSimpleExpression ) ;
    public final EObject ruleBlockStatement() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleInit_0 = null;

        EObject this_SimpleExpression_1 = null;



        	enterRule();

        try {
            // InternalMontiArcAndCore.g:3031:2: ( (this_SimpleInit_0= ruleSimpleInit | this_SimpleExpression_1= ruleSimpleExpression ) )
            // InternalMontiArcAndCore.g:3032:2: (this_SimpleInit_0= ruleSimpleInit | this_SimpleExpression_1= ruleSimpleExpression )
            {
            // InternalMontiArcAndCore.g:3032:2: (this_SimpleInit_0= ruleSimpleInit | this_SimpleExpression_1= ruleSimpleExpression )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==52) ) {
                    alt50=1;
                }
                else if ( (LA50_1==15||(LA50_1>=36 && LA50_1<=37)||(LA50_1>=62 && LA50_1<=67)) ) {
                    alt50=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA50_0==RULE_MCQUALIFIEDNAME||(LA50_0>=RULE_INT && LA50_0<=RULE_STRING)) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalMontiArcAndCore.g:3033:3: this_SimpleInit_0= ruleSimpleInit
                    {

                    			newCompositeNode(grammarAccess.getBlockStatementAccess().getSimpleInitParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleInit_0=ruleSimpleInit();

                    state._fsp--;


                    			current = this_SimpleInit_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:3042:3: this_SimpleExpression_1= ruleSimpleExpression
                    {

                    			newCompositeNode(grammarAccess.getBlockStatementAccess().getSimpleExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleExpression_1=ruleSimpleExpression();

                    state._fsp--;


                    			current = this_SimpleExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlockStatement"


    // $ANTLR start "entryRuleSimpleExpression"
    // InternalMontiArcAndCore.g:3054:1: entryRuleSimpleExpression returns [EObject current=null] : iv_ruleSimpleExpression= ruleSimpleExpression EOF ;
    public final EObject entryRuleSimpleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleExpression = null;


        try {
            // InternalMontiArcAndCore.g:3054:57: (iv_ruleSimpleExpression= ruleSimpleExpression EOF )
            // InternalMontiArcAndCore.g:3055:2: iv_ruleSimpleExpression= ruleSimpleExpression EOF
            {
             newCompositeNode(grammarAccess.getSimpleExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleExpression=ruleSimpleExpression();

            state._fsp--;

             current =iv_ruleSimpleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleExpression"


    // $ANTLR start "ruleSimpleExpression"
    // InternalMontiArcAndCore.g:3061:1: ruleSimpleExpression returns [EObject current=null] : ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ) ;
    public final EObject ruleSimpleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_0_0 = null;



        	enterRule();

        try {
            // InternalMontiArcAndCore.g:3067:2: ( ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ) )
            // InternalMontiArcAndCore.g:3068:2: ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' )
            {
            // InternalMontiArcAndCore.g:3068:2: ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' )
            // InternalMontiArcAndCore.g:3069:3: ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';'
            {
            // InternalMontiArcAndCore.g:3069:3: ( (lv_expression_0_0= ruleExpression ) )
            // InternalMontiArcAndCore.g:3070:4: (lv_expression_0_0= ruleExpression )
            {
            // InternalMontiArcAndCore.g:3070:4: (lv_expression_0_0= ruleExpression )
            // InternalMontiArcAndCore.g:3071:5: lv_expression_0_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSimpleExpressionAccess().getExpressionExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_expression_0_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleExpressionRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_0_0,
            						"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleExpressionAccess().getSemicolonKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleExpression"


    // $ANTLR start "entryRuleSimpleInit"
    // InternalMontiArcAndCore.g:3096:1: entryRuleSimpleInit returns [EObject current=null] : iv_ruleSimpleInit= ruleSimpleInit EOF ;
    public final EObject entryRuleSimpleInit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleInit = null;


        try {
            // InternalMontiArcAndCore.g:3096:51: (iv_ruleSimpleInit= ruleSimpleInit EOF )
            // InternalMontiArcAndCore.g:3097:2: iv_ruleSimpleInit= ruleSimpleInit EOF
            {
             newCompositeNode(grammarAccess.getSimpleInitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleInit=ruleSimpleInit();

            state._fsp--;

             current =iv_ruleSimpleInit; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleInit"


    // $ANTLR start "ruleSimpleInit"
    // InternalMontiArcAndCore.g:3103:1: ruleSimpleInit returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expressions_2_0= ruleExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleSimpleInit() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalMontiArcAndCore.g:3109:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expressions_2_0= ruleExpression ) ) otherlv_3= ';' ) )
            // InternalMontiArcAndCore.g:3110:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expressions_2_0= ruleExpression ) ) otherlv_3= ';' )
            {
            // InternalMontiArcAndCore.g:3110:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expressions_2_0= ruleExpression ) ) otherlv_3= ';' )
            // InternalMontiArcAndCore.g:3111:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expressions_2_0= ruleExpression ) ) otherlv_3= ';'
            {
            // InternalMontiArcAndCore.g:3111:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMontiArcAndCore.g:3112:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMontiArcAndCore.g:3112:4: (lv_name_0_0= RULE_ID )
            // InternalMontiArcAndCore.g:3113:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_37); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSimpleInitAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimpleInitRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,52,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleInitAccess().getEqualsSignKeyword_1());
            		
            // InternalMontiArcAndCore.g:3133:3: ( (lv_expressions_2_0= ruleExpression ) )
            // InternalMontiArcAndCore.g:3134:4: (lv_expressions_2_0= ruleExpression )
            {
            // InternalMontiArcAndCore.g:3134:4: (lv_expressions_2_0= ruleExpression )
            // InternalMontiArcAndCore.g:3135:5: lv_expressions_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSimpleInitAccess().getExpressionsExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_expressions_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleInitRule());
            					}
            					add(
            						current,
            						"expressions",
            						lv_expressions_2_0,
            						"org.palladiosimulator.xtext.montiarcandcore.MontiArcAndCore.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSimpleInitAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleInit"


    // $ANTLR start "ruleOperator"
    // InternalMontiArcAndCore.g:3160:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '&&' ) | (enumLiteral_4= '+' ) | (enumLiteral_5= '-' ) | (enumLiteral_6= '/' ) | (enumLiteral_7= '*' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalMontiArcAndCore.g:3166:2: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '&&' ) | (enumLiteral_4= '+' ) | (enumLiteral_5= '-' ) | (enumLiteral_6= '/' ) | (enumLiteral_7= '*' ) ) )
            // InternalMontiArcAndCore.g:3167:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '&&' ) | (enumLiteral_4= '+' ) | (enumLiteral_5= '-' ) | (enumLiteral_6= '/' ) | (enumLiteral_7= '*' ) )
            {
            // InternalMontiArcAndCore.g:3167:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '&&' ) | (enumLiteral_4= '+' ) | (enumLiteral_5= '-' ) | (enumLiteral_6= '/' ) | (enumLiteral_7= '*' ) )
            int alt51=8;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt51=1;
                }
                break;
            case 36:
                {
                alt51=2;
                }
                break;
            case 63:
                {
                alt51=3;
                }
                break;
            case 64:
                {
                alt51=4;
                }
                break;
            case 65:
                {
                alt51=5;
                }
                break;
            case 66:
                {
                alt51=6;
                }
                break;
            case 62:
                {
                alt51=7;
                }
                break;
            case 67:
                {
                alt51=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalMontiArcAndCore.g:3168:3: (enumLiteral_0= '>' )
                    {
                    // InternalMontiArcAndCore.g:3168:3: (enumLiteral_0= '>' )
                    // InternalMontiArcAndCore.g:3169:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getGTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getGTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:3176:3: (enumLiteral_1= '<' )
                    {
                    // InternalMontiArcAndCore.g:3176:3: (enumLiteral_1= '<' )
                    // InternalMontiArcAndCore.g:3177:4: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getLTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMontiArcAndCore.g:3184:3: (enumLiteral_2= '==' )
                    {
                    // InternalMontiArcAndCore.g:3184:3: (enumLiteral_2= '==' )
                    // InternalMontiArcAndCore.g:3185:4: enumLiteral_2= '=='
                    {
                    enumLiteral_2=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMontiArcAndCore.g:3192:3: (enumLiteral_3= '&&' )
                    {
                    // InternalMontiArcAndCore.g:3192:3: (enumLiteral_3= '&&' )
                    // InternalMontiArcAndCore.g:3193:4: enumLiteral_3= '&&'
                    {
                    enumLiteral_3=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getBAEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOperatorAccess().getBAEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMontiArcAndCore.g:3200:3: (enumLiteral_4= '+' )
                    {
                    // InternalMontiArcAndCore.g:3200:3: (enumLiteral_4= '+' )
                    // InternalMontiArcAndCore.g:3201:4: enumLiteral_4= '+'
                    {
                    enumLiteral_4=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getPLUSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getOperatorAccess().getPLUSEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMontiArcAndCore.g:3208:3: (enumLiteral_5= '-' )
                    {
                    // InternalMontiArcAndCore.g:3208:3: (enumLiteral_5= '-' )
                    // InternalMontiArcAndCore.g:3209:4: enumLiteral_5= '-'
                    {
                    enumLiteral_5=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getMINUSEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getOperatorAccess().getMINUSEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMontiArcAndCore.g:3216:3: (enumLiteral_6= '/' )
                    {
                    // InternalMontiArcAndCore.g:3216:3: (enumLiteral_6= '/' )
                    // InternalMontiArcAndCore.g:3217:4: enumLiteral_6= '/'
                    {
                    enumLiteral_6=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getDIVEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getOperatorAccess().getDIVEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalMontiArcAndCore.g:3224:3: (enumLiteral_7= '*' )
                    {
                    // InternalMontiArcAndCore.g:3224:3: (enumLiteral_7= '*' )
                    // InternalMontiArcAndCore.g:3225:4: enumLiteral_7= '*'
                    {
                    enumLiteral_7=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getMULTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getOperatorAccess().getMULTEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "ruleSCModifier"
    // InternalMontiArcAndCore.g:3235:1: ruleSCModifier returns [Enumerator current=null] : ( (enumLiteral_0= 'initial' ) | (enumLiteral_1= 'final' ) ) ;
    public final Enumerator ruleSCModifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMontiArcAndCore.g:3241:2: ( ( (enumLiteral_0= 'initial' ) | (enumLiteral_1= 'final' ) ) )
            // InternalMontiArcAndCore.g:3242:2: ( (enumLiteral_0= 'initial' ) | (enumLiteral_1= 'final' ) )
            {
            // InternalMontiArcAndCore.g:3242:2: ( (enumLiteral_0= 'initial' ) | (enumLiteral_1= 'final' ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==68) ) {
                alt52=1;
            }
            else if ( (LA52_0==69) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalMontiArcAndCore.g:3243:3: (enumLiteral_0= 'initial' )
                    {
                    // InternalMontiArcAndCore.g:3243:3: (enumLiteral_0= 'initial' )
                    // InternalMontiArcAndCore.g:3244:4: enumLiteral_0= 'initial'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getSCModifierAccess().getINITIALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSCModifierAccess().getINITIALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcAndCore.g:3251:3: (enumLiteral_1= 'final' )
                    {
                    // InternalMontiArcAndCore.g:3251:3: (enumLiteral_1= 'final' )
                    // InternalMontiArcAndCore.g:3252:4: enumLiteral_1= 'final'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getSCModifierAccess().getFINALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSCModifierAccess().getFINALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSCModifier"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA42 dfa42 = new DFA42(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\uffff\10\14\4\uffff";
    static final String dfa_3s = "\1\21\10\4\4\uffff";
    static final String dfa_4s = "\1\43\10\50\4\uffff";
    static final String dfa_5s = "\11\uffff\1\3\1\4\1\2\1\1";
    static final String dfa_6s = "\15\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\7\11\4\12",
            "\1\14\1\uffff\1\14\36\uffff\1\14\1\13\1\uffff\1\14",
            "\1\14\1\uffff\1\14\36\uffff\1\14\1\13\1\uffff\1\14",
            "\1\14\1\uffff\1\14\36\uffff\1\14\1\13\1\uffff\1\14",
            "\1\14\1\uffff\1\14\36\uffff\1\14\1\13\1\uffff\1\14",
            "\1\14\1\uffff\1\14\36\uffff\1\14\1\13\1\uffff\1\14",
            "\1\14\1\uffff\1\14\36\uffff\1\14\1\13\1\uffff\1\14",
            "\1\14\1\uffff\1\14\36\uffff\1\14\1\13\1\uffff\1\14",
            "\1\14\1\uffff\1\14\36\uffff\1\14\1\13\1\uffff\1\14",
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

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "261:2: (this_MCPrimitiveType_0= ruleMCPrimitiveType | this_MCArrayType_1= ruleMCArrayType | this_MCObjectType_2= ruleMCObjectType | this_MCCollectionType_3= ruleMCCollectionType )";
        }
    }
    static final String dfa_8s = "\7\uffff";
    static final String dfa_9s = "\3\54\1\uffff\1\6\1\17\1\uffff";
    static final String dfa_10s = "\3\105\1\uffff\1\6\1\46\1\uffff";
    static final String dfa_11s = "\3\uffff\1\1\2\uffff\1\2";
    static final String dfa_12s = "\7\uffff}>";
    static final String[] dfa_13s = {
            "\1\3\20\uffff\1\4\6\uffff\1\1\1\2",
            "\1\3\20\uffff\1\4\6\uffff\1\1\1\2",
            "\1\3\20\uffff\1\4\6\uffff\1\1\1\2",
            "",
            "\1\5",
            "\1\3\26\uffff\1\6",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "2615:2: (this_SCState_0= ruleSCState | this_InvState_1= ruleInvState )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000FFFFE0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0xC000003000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000001D0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000080000004000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0004E00000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0003100000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0002100000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000120000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0004E00FFFFE0000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0008000000004000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x1048200000004250L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000050L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0380000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000FFFFE0040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100000000040L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x2000300000000040L,0x0000000000000030L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x2000100000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x4020004000008000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x4000004000008000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x4000000000008000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x00002000000001D0L});

}
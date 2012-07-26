package org.lunifera.metamodel.dsl.parser.antlr.internal; 

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
import org.lunifera.metamodel.dsl.services.SqlDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSqlDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'settings {'", "'schema='", "'engine='", "'}'", "'table'", "'{'", "'prefix'", "';'", "'column'", "'joincolumn'", "'with'", "'nullable'", "'AES'", "'index='", "'enum'", "'='", "'String('", "')'", "'Decimal('", "'InnoDB'", "'MyISAM'", "'Int'", "'Tinyint'", "'Smallint'", "'Mediumint'", "'Boolean'", "'Blob'", "'Datetime'", "'Date'", "'Time'", "'Polygon'", "'Point'", "'Foto'", "'Currency'", "'Coordinate'", "'No'", "'Yes'", "'Unique'", "'Spatial'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalSqlDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSqlDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSqlDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g"; }



     	private SqlDSLGrammarAccess grammarAccess;
     	
        public InternalSqlDSLParser(TokenStream input, SqlDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SModel";	
       	}
       	
       	@Override
       	protected SqlDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSModel"
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:68:1: entryRuleSModel returns [EObject current=null] : iv_ruleSModel= ruleSModel EOF ;
    public final EObject entryRuleSModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSModel = null;


        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:69:2: (iv_ruleSModel= ruleSModel EOF )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:70:2: iv_ruleSModel= ruleSModel EOF
            {
             newCompositeNode(grammarAccess.getSModelRule()); 
            pushFollow(FOLLOW_ruleSModel_in_entryRuleSModel75);
            iv_ruleSModel=ruleSModel();

            state._fsp--;

             current =iv_ruleSModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSModel85); 

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
    // $ANTLR end "entryRuleSModel"


    // $ANTLR start "ruleSModel"
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:77:1: ruleSModel returns [EObject current=null] : ( ( (lv_settings_0_0= ruleSSettings ) )? ( (lv_artifact_1_0= ruleSArtifact ) )* ) ;
    public final EObject ruleSModel() throws RecognitionException {
        EObject current = null;

        EObject lv_settings_0_0 = null;

        EObject lv_artifact_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:80:28: ( ( ( (lv_settings_0_0= ruleSSettings ) )? ( (lv_artifact_1_0= ruleSArtifact ) )* ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:81:1: ( ( (lv_settings_0_0= ruleSSettings ) )? ( (lv_artifact_1_0= ruleSArtifact ) )* )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:81:1: ( ( (lv_settings_0_0= ruleSSettings ) )? ( (lv_artifact_1_0= ruleSArtifact ) )* )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:81:2: ( (lv_settings_0_0= ruleSSettings ) )? ( (lv_artifact_1_0= ruleSArtifact ) )*
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:81:2: ( (lv_settings_0_0= ruleSSettings ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:82:1: (lv_settings_0_0= ruleSSettings )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:82:1: (lv_settings_0_0= ruleSSettings )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:83:3: lv_settings_0_0= ruleSSettings
                    {
                     
                    	        newCompositeNode(grammarAccess.getSModelAccess().getSettingsSSettingsParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSSettings_in_ruleSModel131);
                    lv_settings_0_0=ruleSSettings();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSModelRule());
                    	        }
                           		set(
                           			current, 
                           			"settings",
                            		lv_settings_0_0, 
                            		"SSettings");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:99:3: ( (lv_artifact_1_0= ruleSArtifact ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15||LA2_0==25) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:100:1: (lv_artifact_1_0= ruleSArtifact )
            	    {
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:100:1: (lv_artifact_1_0= ruleSArtifact )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:101:3: lv_artifact_1_0= ruleSArtifact
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSModelAccess().getArtifactSArtifactParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSArtifact_in_ruleSModel153);
            	    lv_artifact_1_0=ruleSArtifact();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"artifact",
            	            		lv_artifact_1_0, 
            	            		"SArtifact");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleSModel"


    // $ANTLR start "entryRuleSSettings"
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:125:1: entryRuleSSettings returns [EObject current=null] : iv_ruleSSettings= ruleSSettings EOF ;
    public final EObject entryRuleSSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSSettings = null;


        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:126:2: (iv_ruleSSettings= ruleSSettings EOF )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:127:2: iv_ruleSSettings= ruleSSettings EOF
            {
             newCompositeNode(grammarAccess.getSSettingsRule()); 
            pushFollow(FOLLOW_ruleSSettings_in_entryRuleSSettings190);
            iv_ruleSSettings=ruleSSettings();

            state._fsp--;

             current =iv_ruleSSettings; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSSettings200); 

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
    // $ANTLR end "entryRuleSSettings"


    // $ANTLR start "ruleSSettings"
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:134:1: ruleSSettings returns [EObject current=null] : ( () otherlv_1= 'settings {' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'engine=' ( (lv_engine_6_0= ruleSDBEngine ) ) ) ) ) ) )* ) ) ) otherlv_7= '}' ) ;
    public final EObject ruleSSettings() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_schema_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_engine_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:137:28: ( ( () otherlv_1= 'settings {' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'engine=' ( (lv_engine_6_0= ruleSDBEngine ) ) ) ) ) ) )* ) ) ) otherlv_7= '}' ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:138:1: ( () otherlv_1= 'settings {' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'engine=' ( (lv_engine_6_0= ruleSDBEngine ) ) ) ) ) ) )* ) ) ) otherlv_7= '}' )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:138:1: ( () otherlv_1= 'settings {' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'engine=' ( (lv_engine_6_0= ruleSDBEngine ) ) ) ) ) ) )* ) ) ) otherlv_7= '}' )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:138:2: () otherlv_1= 'settings {' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'engine=' ( (lv_engine_6_0= ruleSDBEngine ) ) ) ) ) ) )* ) ) ) otherlv_7= '}'
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:138:2: ()
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:139:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSSettingsAccess().getSSettingsAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleSSettings246); 

                	newLeafNode(otherlv_1, grammarAccess.getSSettingsAccess().getSettingsKeyword_1());
                
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:148:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'engine=' ( (lv_engine_6_0= ruleSDBEngine ) ) ) ) ) ) )* ) ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:150:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'engine=' ( (lv_engine_6_0= ruleSDBEngine ) ) ) ) ) ) )* ) )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:150:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'engine=' ( (lv_engine_6_0= ruleSDBEngine ) ) ) ) ) ) )* ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:151:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'engine=' ( (lv_engine_6_0= ruleSDBEngine ) ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getSSettingsAccess().getUnorderedGroup_2());
            	
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:154:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'engine=' ( (lv_engine_6_0= ruleSDBEngine ) ) ) ) ) ) )* )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:155:3: ( ({...}? => ( ({...}? => (otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'engine=' ( (lv_engine_6_0= ruleSDBEngine ) ) ) ) ) ) )*
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:155:3: ( ({...}? => ( ({...}? => (otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'engine=' ( (lv_engine_6_0= ruleSDBEngine ) ) ) ) ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( LA3_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 1) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:157:4: ({...}? => ( ({...}? => (otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) ) ) ) ) )
            	    {
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:157:4: ({...}? => ( ({...}? => (otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) ) ) ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:158:5: {...}? => ( ({...}? => (otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:158:106: ( ({...}? => (otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) ) ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:159:6: ({...}? => (otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:162:6: ({...}? => (otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:162:7: {...}? => (otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSSettings", "true");
            	    }
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:162:16: (otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:162:18: otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleSSettings304); 

            	        	newLeafNode(otherlv_3, grammarAccess.getSSettingsAccess().getSchemaKeyword_2_0_0());
            	        
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:166:1: ( (lv_schema_4_0= RULE_ID ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:167:1: (lv_schema_4_0= RULE_ID )
            	    {
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:167:1: (lv_schema_4_0= RULE_ID )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:168:3: lv_schema_4_0= RULE_ID
            	    {
            	    lv_schema_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSSettings321); 

            	    			newLeafNode(lv_schema_4_0, grammarAccess.getSSettingsAccess().getSchemaIDTerminalRuleCall_2_0_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSSettingsRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"schema",
            	            		lv_schema_4_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSSettingsAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:191:4: ({...}? => ( ({...}? => (otherlv_5= 'engine=' ( (lv_engine_6_0= ruleSDBEngine ) ) ) ) ) )
            	    {
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:191:4: ({...}? => ( ({...}? => (otherlv_5= 'engine=' ( (lv_engine_6_0= ruleSDBEngine ) ) ) ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:192:5: {...}? => ( ({...}? => (otherlv_5= 'engine=' ( (lv_engine_6_0= ruleSDBEngine ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:192:106: ( ({...}? => (otherlv_5= 'engine=' ( (lv_engine_6_0= ruleSDBEngine ) ) ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:193:6: ({...}? => (otherlv_5= 'engine=' ( (lv_engine_6_0= ruleSDBEngine ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:196:6: ({...}? => (otherlv_5= 'engine=' ( (lv_engine_6_0= ruleSDBEngine ) ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:196:7: {...}? => (otherlv_5= 'engine=' ( (lv_engine_6_0= ruleSDBEngine ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSSettings", "true");
            	    }
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:196:16: (otherlv_5= 'engine=' ( (lv_engine_6_0= ruleSDBEngine ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:196:18: otherlv_5= 'engine=' ( (lv_engine_6_0= ruleSDBEngine ) )
            	    {
            	    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleSSettings394); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSSettingsAccess().getEngineKeyword_2_1_0());
            	        
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:200:1: ( (lv_engine_6_0= ruleSDBEngine ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:201:1: (lv_engine_6_0= ruleSDBEngine )
            	    {
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:201:1: (lv_engine_6_0= ruleSDBEngine )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:202:3: lv_engine_6_0= ruleSDBEngine
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSSettingsAccess().getEngineSDBEngineEnumRuleCall_2_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSDBEngine_in_ruleSSettings415);
            	    lv_engine_6_0=ruleSDBEngine();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSSettingsRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"engine",
            	            		lv_engine_6_0, 
            	            		"SDBEngine");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSSettingsAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getSSettingsAccess().getUnorderedGroup_2());
            	

            }

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleSSettings468); 

                	newLeafNode(otherlv_7, grammarAccess.getSSettingsAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleSSettings"


    // $ANTLR start "entryRuleSArtifact"
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:244:1: entryRuleSArtifact returns [EObject current=null] : iv_ruleSArtifact= ruleSArtifact EOF ;
    public final EObject entryRuleSArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSArtifact = null;


        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:245:2: (iv_ruleSArtifact= ruleSArtifact EOF )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:246:2: iv_ruleSArtifact= ruleSArtifact EOF
            {
             newCompositeNode(grammarAccess.getSArtifactRule()); 
            pushFollow(FOLLOW_ruleSArtifact_in_entryRuleSArtifact504);
            iv_ruleSArtifact=ruleSArtifact();

            state._fsp--;

             current =iv_ruleSArtifact; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSArtifact514); 

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
    // $ANTLR end "entryRuleSArtifact"


    // $ANTLR start "ruleSArtifact"
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:253:1: ruleSArtifact returns [EObject current=null] : (this_STable_0= ruleSTable | this_SEnum_1= ruleSEnum ) ;
    public final EObject ruleSArtifact() throws RecognitionException {
        EObject current = null;

        EObject this_STable_0 = null;

        EObject this_SEnum_1 = null;


         enterRule(); 
            
        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:256:28: ( (this_STable_0= ruleSTable | this_SEnum_1= ruleSEnum ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:257:1: (this_STable_0= ruleSTable | this_SEnum_1= ruleSEnum )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:257:1: (this_STable_0= ruleSTable | this_SEnum_1= ruleSEnum )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==25) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:258:5: this_STable_0= ruleSTable
                    {
                     
                            newCompositeNode(grammarAccess.getSArtifactAccess().getSTableParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSTable_in_ruleSArtifact561);
                    this_STable_0=ruleSTable();

                    state._fsp--;

                     
                            current = this_STable_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:268:5: this_SEnum_1= ruleSEnum
                    {
                     
                            newCompositeNode(grammarAccess.getSArtifactAccess().getSEnumParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSEnum_in_ruleSArtifact588);
                    this_SEnum_1=ruleSEnum();

                    state._fsp--;

                     
                            current = this_SEnum_1; 
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
    // $ANTLR end "ruleSArtifact"


    // $ANTLR start "entryRuleSTable"
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:284:1: entryRuleSTable returns [EObject current=null] : iv_ruleSTable= ruleSTable EOF ;
    public final EObject entryRuleSTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSTable = null;


        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:285:2: (iv_ruleSTable= ruleSTable EOF )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:286:2: iv_ruleSTable= ruleSTable EOF
            {
             newCompositeNode(grammarAccess.getSTableRule()); 
            pushFollow(FOLLOW_ruleSTable_in_entryRuleSTable623);
            iv_ruleSTable=ruleSTable();

            state._fsp--;

             current =iv_ruleSTable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSTable633); 

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
    // $ANTLR end "entryRuleSTable"


    // $ANTLR start "ruleSTable"
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:293:1: ruleSTable returns [EObject current=null] : (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'prefix' ( (lv_prefix_4_0= RULE_ID ) ) otherlv_5= ';' )? ( (lv_entityMembers_6_0= ruleSEntityMember ) )* otherlv_7= '}' ) ;
    public final EObject ruleSTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_prefix_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_entityMembers_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:296:28: ( (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'prefix' ( (lv_prefix_4_0= RULE_ID ) ) otherlv_5= ';' )? ( (lv_entityMembers_6_0= ruleSEntityMember ) )* otherlv_7= '}' ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:297:1: (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'prefix' ( (lv_prefix_4_0= RULE_ID ) ) otherlv_5= ';' )? ( (lv_entityMembers_6_0= ruleSEntityMember ) )* otherlv_7= '}' )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:297:1: (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'prefix' ( (lv_prefix_4_0= RULE_ID ) ) otherlv_5= ';' )? ( (lv_entityMembers_6_0= ruleSEntityMember ) )* otherlv_7= '}' )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:297:3: otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'prefix' ( (lv_prefix_4_0= RULE_ID ) ) otherlv_5= ';' )? ( (lv_entityMembers_6_0= ruleSEntityMember ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSTable670); 

                	newLeafNode(otherlv_0, grammarAccess.getSTableAccess().getTableKeyword_0());
                
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:301:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:302:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:302:1: (lv_name_1_0= RULE_ID )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:303:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSTable687); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSTableAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSTableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleSTable704); 

                	newLeafNode(otherlv_2, grammarAccess.getSTableAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:323:1: (otherlv_3= 'prefix' ( (lv_prefix_4_0= RULE_ID ) ) otherlv_5= ';' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:323:3: otherlv_3= 'prefix' ( (lv_prefix_4_0= RULE_ID ) ) otherlv_5= ';'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleSTable717); 

                        	newLeafNode(otherlv_3, grammarAccess.getSTableAccess().getPrefixKeyword_3_0());
                        
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:327:1: ( (lv_prefix_4_0= RULE_ID ) )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:328:1: (lv_prefix_4_0= RULE_ID )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:328:1: (lv_prefix_4_0= RULE_ID )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:329:3: lv_prefix_4_0= RULE_ID
                    {
                    lv_prefix_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSTable734); 

                    			newLeafNode(lv_prefix_4_0, grammarAccess.getSTableAccess().getPrefixIDTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSTableRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"prefix",
                            		lv_prefix_4_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleSTable751); 

                        	newLeafNode(otherlv_5, grammarAccess.getSTableAccess().getSemicolonKeyword_3_2());
                        

                    }
                    break;

            }

            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:349:3: ( (lv_entityMembers_6_0= ruleSEntityMember ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=19 && LA6_0<=20)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:350:1: (lv_entityMembers_6_0= ruleSEntityMember )
            	    {
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:350:1: (lv_entityMembers_6_0= ruleSEntityMember )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:351:3: lv_entityMembers_6_0= ruleSEntityMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSTableAccess().getEntityMembersSEntityMemberParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSEntityMember_in_ruleSTable774);
            	    lv_entityMembers_6_0=ruleSEntityMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSTableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entityMembers",
            	            		lv_entityMembers_6_0, 
            	            		"SEntityMember");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleSTable787); 

                	newLeafNode(otherlv_7, grammarAccess.getSTableAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleSTable"


    // $ANTLR start "entryRuleSEntityMember"
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:379:1: entryRuleSEntityMember returns [EObject current=null] : iv_ruleSEntityMember= ruleSEntityMember EOF ;
    public final EObject entryRuleSEntityMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSEntityMember = null;


        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:380:2: (iv_ruleSEntityMember= ruleSEntityMember EOF )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:381:2: iv_ruleSEntityMember= ruleSEntityMember EOF
            {
             newCompositeNode(grammarAccess.getSEntityMemberRule()); 
            pushFollow(FOLLOW_ruleSEntityMember_in_entryRuleSEntityMember823);
            iv_ruleSEntityMember=ruleSEntityMember();

            state._fsp--;

             current =iv_ruleSEntityMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSEntityMember833); 

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
    // $ANTLR end "entryRuleSEntityMember"


    // $ANTLR start "ruleSEntityMember"
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:388:1: ruleSEntityMember returns [EObject current=null] : (this_SProperty_0= ruleSProperty | this_SJoinProperty_1= ruleSJoinProperty ) ;
    public final EObject ruleSEntityMember() throws RecognitionException {
        EObject current = null;

        EObject this_SProperty_0 = null;

        EObject this_SJoinProperty_1 = null;


         enterRule(); 
            
        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:391:28: ( (this_SProperty_0= ruleSProperty | this_SJoinProperty_1= ruleSJoinProperty ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:392:1: (this_SProperty_0= ruleSProperty | this_SJoinProperty_1= ruleSJoinProperty )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:392:1: (this_SProperty_0= ruleSProperty | this_SJoinProperty_1= ruleSJoinProperty )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            else if ( (LA7_0==20) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:393:5: this_SProperty_0= ruleSProperty
                    {
                     
                            newCompositeNode(grammarAccess.getSEntityMemberAccess().getSPropertyParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSProperty_in_ruleSEntityMember880);
                    this_SProperty_0=ruleSProperty();

                    state._fsp--;

                     
                            current = this_SProperty_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:403:5: this_SJoinProperty_1= ruleSJoinProperty
                    {
                     
                            newCompositeNode(grammarAccess.getSEntityMemberAccess().getSJoinPropertyParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSJoinProperty_in_ruleSEntityMember907);
                    this_SJoinProperty_1=ruleSJoinProperty();

                    state._fsp--;

                     
                            current = this_SJoinProperty_1; 
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
    // $ANTLR end "ruleSEntityMember"


    // $ANTLR start "entryRuleSProperty"
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:419:1: entryRuleSProperty returns [EObject current=null] : iv_ruleSProperty= ruleSProperty EOF ;
    public final EObject entryRuleSProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSProperty = null;


        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:420:2: (iv_ruleSProperty= ruleSProperty EOF )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:421:2: iv_ruleSProperty= ruleSProperty EOF
            {
             newCompositeNode(grammarAccess.getSPropertyRule()); 
            pushFollow(FOLLOW_ruleSProperty_in_entryRuleSProperty942);
            iv_ruleSProperty=ruleSProperty();

            state._fsp--;

             current =iv_ruleSProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSProperty952); 

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
    // $ANTLR end "entryRuleSProperty"


    // $ANTLR start "ruleSProperty"
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:428:1: ruleSProperty returns [EObject current=null] : (otherlv_0= 'column' ( (lv_name_1_0= RULE_ID ) ) ( ( (otherlv_2= RULE_ID ) ) | ( (lv_inlinedType_3_0= ruleSInlinedSQLType ) ) | ( (lv_simpleType_4_0= ruleSSimpleTypes ) ) ) ( (lv_props_5_0= ruleSColumnProps ) )? otherlv_6= ';' ) ;
    public final EObject ruleSProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_inlinedType_3_0 = null;

        Enumerator lv_simpleType_4_0 = null;

        EObject lv_props_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:431:28: ( (otherlv_0= 'column' ( (lv_name_1_0= RULE_ID ) ) ( ( (otherlv_2= RULE_ID ) ) | ( (lv_inlinedType_3_0= ruleSInlinedSQLType ) ) | ( (lv_simpleType_4_0= ruleSSimpleTypes ) ) ) ( (lv_props_5_0= ruleSColumnProps ) )? otherlv_6= ';' ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:432:1: (otherlv_0= 'column' ( (lv_name_1_0= RULE_ID ) ) ( ( (otherlv_2= RULE_ID ) ) | ( (lv_inlinedType_3_0= ruleSInlinedSQLType ) ) | ( (lv_simpleType_4_0= ruleSSimpleTypes ) ) ) ( (lv_props_5_0= ruleSColumnProps ) )? otherlv_6= ';' )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:432:1: (otherlv_0= 'column' ( (lv_name_1_0= RULE_ID ) ) ( ( (otherlv_2= RULE_ID ) ) | ( (lv_inlinedType_3_0= ruleSInlinedSQLType ) ) | ( (lv_simpleType_4_0= ruleSSimpleTypes ) ) ) ( (lv_props_5_0= ruleSColumnProps ) )? otherlv_6= ';' )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:432:3: otherlv_0= 'column' ( (lv_name_1_0= RULE_ID ) ) ( ( (otherlv_2= RULE_ID ) ) | ( (lv_inlinedType_3_0= ruleSInlinedSQLType ) ) | ( (lv_simpleType_4_0= ruleSSimpleTypes ) ) ) ( (lv_props_5_0= ruleSColumnProps ) )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleSProperty989); 

                	newLeafNode(otherlv_0, grammarAccess.getSPropertyAccess().getColumnKeyword_0());
                
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:436:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:437:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:437:1: (lv_name_1_0= RULE_ID )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:438:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSProperty1006); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSPropertyAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:454:2: ( ( (otherlv_2= RULE_ID ) ) | ( (lv_inlinedType_3_0= ruleSInlinedSQLType ) ) | ( (lv_simpleType_4_0= ruleSSimpleTypes ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt8=1;
                }
                break;
            case 27:
            case 29:
                {
                alt8=2;
                }
                break;
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:454:3: ( (otherlv_2= RULE_ID ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:454:3: ( (otherlv_2= RULE_ID ) )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:455:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:455:1: (otherlv_2= RULE_ID )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:456:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSPropertyRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSProperty1032); 

                    		newLeafNode(otherlv_2, grammarAccess.getSPropertyAccess().getExtTypeSExtDeclaredSQLTypeCrossReference_2_0_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:468:6: ( (lv_inlinedType_3_0= ruleSInlinedSQLType ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:468:6: ( (lv_inlinedType_3_0= ruleSInlinedSQLType ) )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:469:1: (lv_inlinedType_3_0= ruleSInlinedSQLType )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:469:1: (lv_inlinedType_3_0= ruleSInlinedSQLType )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:470:3: lv_inlinedType_3_0= ruleSInlinedSQLType
                    {
                     
                    	        newCompositeNode(grammarAccess.getSPropertyAccess().getInlinedTypeSInlinedSQLTypeParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSInlinedSQLType_in_ruleSProperty1059);
                    lv_inlinedType_3_0=ruleSInlinedSQLType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"inlinedType",
                            		lv_inlinedType_3_0, 
                            		"SInlinedSQLType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:487:6: ( (lv_simpleType_4_0= ruleSSimpleTypes ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:487:6: ( (lv_simpleType_4_0= ruleSSimpleTypes ) )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:488:1: (lv_simpleType_4_0= ruleSSimpleTypes )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:488:1: (lv_simpleType_4_0= ruleSSimpleTypes )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:489:3: lv_simpleType_4_0= ruleSSimpleTypes
                    {
                     
                    	        newCompositeNode(grammarAccess.getSPropertyAccess().getSimpleTypeSSimpleTypesEnumRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSSimpleTypes_in_ruleSProperty1086);
                    lv_simpleType_4_0=ruleSSimpleTypes();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"simpleType",
                            		lv_simpleType_4_0, 
                            		"SSimpleTypes");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:505:3: ( (lv_props_5_0= ruleSColumnProps ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:506:1: (lv_props_5_0= ruleSColumnProps )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:506:1: (lv_props_5_0= ruleSColumnProps )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:507:3: lv_props_5_0= ruleSColumnProps
                    {
                     
                    	        newCompositeNode(grammarAccess.getSPropertyAccess().getPropsSColumnPropsParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSColumnProps_in_ruleSProperty1108);
                    lv_props_5_0=ruleSColumnProps();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"props",
                            		lv_props_5_0, 
                            		"SColumnProps");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleSProperty1121); 

                	newLeafNode(otherlv_6, grammarAccess.getSPropertyAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleSProperty"


    // $ANTLR start "entryRuleSJoinProperty"
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:535:1: entryRuleSJoinProperty returns [EObject current=null] : iv_ruleSJoinProperty= ruleSJoinProperty EOF ;
    public final EObject entryRuleSJoinProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSJoinProperty = null;


        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:536:2: (iv_ruleSJoinProperty= ruleSJoinProperty EOF )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:537:2: iv_ruleSJoinProperty= ruleSJoinProperty EOF
            {
             newCompositeNode(grammarAccess.getSJoinPropertyRule()); 
            pushFollow(FOLLOW_ruleSJoinProperty_in_entryRuleSJoinProperty1157);
            iv_ruleSJoinProperty=ruleSJoinProperty();

            state._fsp--;

             current =iv_ruleSJoinProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSJoinProperty1167); 

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
    // $ANTLR end "entryRuleSJoinProperty"


    // $ANTLR start "ruleSJoinProperty"
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:544:1: ruleSJoinProperty returns [EObject current=null] : (otherlv_0= 'joincolumn' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_props_3_0= ruleSColumnProps ) )? otherlv_4= ';' ) ;
    public final EObject ruleSJoinProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_props_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:547:28: ( (otherlv_0= 'joincolumn' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_props_3_0= ruleSColumnProps ) )? otherlv_4= ';' ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:548:1: (otherlv_0= 'joincolumn' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_props_3_0= ruleSColumnProps ) )? otherlv_4= ';' )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:548:1: (otherlv_0= 'joincolumn' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_props_3_0= ruleSColumnProps ) )? otherlv_4= ';' )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:548:3: otherlv_0= 'joincolumn' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_props_3_0= ruleSColumnProps ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleSJoinProperty1204); 

                	newLeafNode(otherlv_0, grammarAccess.getSJoinPropertyAccess().getJoincolumnKeyword_0());
                
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:552:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:553:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:553:1: (lv_name_1_0= RULE_ID )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:554:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSJoinProperty1221); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSJoinPropertyAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSJoinPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:570:2: ( (otherlv_2= RULE_ID ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:571:1: (otherlv_2= RULE_ID )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:571:1: (otherlv_2= RULE_ID )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:572:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSJoinPropertyRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSJoinProperty1246); 

            		newLeafNode(otherlv_2, grammarAccess.getSJoinPropertyAccess().getTypeSTableCrossReference_2_0()); 
            	

            }


            }

            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:583:2: ( (lv_props_3_0= ruleSColumnProps ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:584:1: (lv_props_3_0= ruleSColumnProps )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:584:1: (lv_props_3_0= ruleSColumnProps )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:585:3: lv_props_3_0= ruleSColumnProps
                    {
                     
                    	        newCompositeNode(grammarAccess.getSJoinPropertyAccess().getPropsSColumnPropsParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSColumnProps_in_ruleSJoinProperty1267);
                    lv_props_3_0=ruleSColumnProps();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSJoinPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"props",
                            		lv_props_3_0, 
                            		"SColumnProps");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleSJoinProperty1280); 

                	newLeafNode(otherlv_4, grammarAccess.getSJoinPropertyAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleSJoinProperty"


    // $ANTLR start "entryRuleSColumnProps"
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:613:1: entryRuleSColumnProps returns [EObject current=null] : iv_ruleSColumnProps= ruleSColumnProps EOF ;
    public final EObject entryRuleSColumnProps() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSColumnProps = null;


        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:614:2: (iv_ruleSColumnProps= ruleSColumnProps EOF )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:615:2: iv_ruleSColumnProps= ruleSColumnProps EOF
            {
             newCompositeNode(grammarAccess.getSColumnPropsRule()); 
            pushFollow(FOLLOW_ruleSColumnProps_in_entryRuleSColumnProps1316);
            iv_ruleSColumnProps=ruleSColumnProps();

            state._fsp--;

             current =iv_ruleSColumnProps; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSColumnProps1326); 

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
    // $ANTLR end "entryRuleSColumnProps"


    // $ANTLR start "ruleSColumnProps"
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:622:1: ruleSColumnProps returns [EObject current=null] : ( () otherlv_1= 'with' ( ( ( ( ({...}? => ( ({...}? => ( (lv_nullable_3_0= 'nullable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_aes_4_0= 'AES' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleSColumnProps() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_nullable_3_0=null;
        Token lv_aes_4_0=null;
        Token otherlv_5=null;
        Enumerator lv_index_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:625:28: ( ( () otherlv_1= 'with' ( ( ( ( ({...}? => ( ({...}? => ( (lv_nullable_3_0= 'nullable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_aes_4_0= 'AES' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) ) ) ) ) ) )* ) ) ) ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:626:1: ( () otherlv_1= 'with' ( ( ( ( ({...}? => ( ({...}? => ( (lv_nullable_3_0= 'nullable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_aes_4_0= 'AES' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) ) ) ) ) ) )* ) ) ) )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:626:1: ( () otherlv_1= 'with' ( ( ( ( ({...}? => ( ({...}? => ( (lv_nullable_3_0= 'nullable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_aes_4_0= 'AES' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) ) ) ) ) ) )* ) ) ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:626:2: () otherlv_1= 'with' ( ( ( ( ({...}? => ( ({...}? => ( (lv_nullable_3_0= 'nullable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_aes_4_0= 'AES' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) ) ) ) ) ) )* ) ) )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:626:2: ()
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:627:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSColumnPropsAccess().getSColumnPropsAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSColumnProps1372); 

                	newLeafNode(otherlv_1, grammarAccess.getSColumnPropsAccess().getWithKeyword_1());
                
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:636:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_nullable_3_0= 'nullable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_aes_4_0= 'AES' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) ) ) ) ) ) )* ) ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:638:1: ( ( ( ({...}? => ( ({...}? => ( (lv_nullable_3_0= 'nullable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_aes_4_0= 'AES' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) ) ) ) ) ) )* ) )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:638:1: ( ( ( ({...}? => ( ({...}? => ( (lv_nullable_3_0= 'nullable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_aes_4_0= 'AES' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) ) ) ) ) ) )* ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:639:2: ( ( ({...}? => ( ({...}? => ( (lv_nullable_3_0= 'nullable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_aes_4_0= 'AES' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2());
            	
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:642:2: ( ( ({...}? => ( ({...}? => ( (lv_nullable_3_0= 'nullable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_aes_4_0= 'AES' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) ) ) ) ) ) )* )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:643:3: ( ({...}? => ( ({...}? => ( (lv_nullable_3_0= 'nullable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_aes_4_0= 'AES' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) ) ) ) ) ) )*
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:643:3: ( ({...}? => ( ({...}? => ( (lv_nullable_3_0= 'nullable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_aes_4_0= 'AES' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) ) ) ) ) ) )*
            loop11:
            do {
                int alt11=4;
                int LA11_0 = input.LA(1);

                if ( LA11_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 0) ) {
                    alt11=1;
                }
                else if ( LA11_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 1) ) {
                    alt11=2;
                }
                else if ( LA11_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 2) ) {
                    alt11=3;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:645:4: ({...}? => ( ({...}? => ( (lv_nullable_3_0= 'nullable' ) ) ) ) )
            	    {
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:645:4: ({...}? => ( ({...}? => ( (lv_nullable_3_0= 'nullable' ) ) ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:646:5: {...}? => ( ({...}? => ( (lv_nullable_3_0= 'nullable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSColumnProps", "getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:646:109: ( ({...}? => ( (lv_nullable_3_0= 'nullable' ) ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:647:6: ({...}? => ( (lv_nullable_3_0= 'nullable' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:650:6: ({...}? => ( (lv_nullable_3_0= 'nullable' ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:650:7: {...}? => ( (lv_nullable_3_0= 'nullable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSColumnProps", "true");
            	    }
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:650:16: ( (lv_nullable_3_0= 'nullable' ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:651:1: (lv_nullable_3_0= 'nullable' )
            	    {
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:651:1: (lv_nullable_3_0= 'nullable' )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:652:3: lv_nullable_3_0= 'nullable'
            	    {
            	    lv_nullable_3_0=(Token)match(input,22,FOLLOW_22_in_ruleSColumnProps1435); 

            	            newLeafNode(lv_nullable_3_0, grammarAccess.getSColumnPropsAccess().getNullableNullableKeyword_2_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSColumnPropsRule());
            	    	        }
            	           		setWithLastConsumed(current, "nullable", true, "nullable");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:672:4: ({...}? => ( ({...}? => ( (lv_aes_4_0= 'AES' ) ) ) ) )
            	    {
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:672:4: ({...}? => ( ({...}? => ( (lv_aes_4_0= 'AES' ) ) ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:673:5: {...}? => ( ({...}? => ( (lv_aes_4_0= 'AES' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSColumnProps", "getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:673:109: ( ({...}? => ( (lv_aes_4_0= 'AES' ) ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:674:6: ({...}? => ( (lv_aes_4_0= 'AES' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:677:6: ({...}? => ( (lv_aes_4_0= 'AES' ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:677:7: {...}? => ( (lv_aes_4_0= 'AES' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSColumnProps", "true");
            	    }
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:677:16: ( (lv_aes_4_0= 'AES' ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:678:1: (lv_aes_4_0= 'AES' )
            	    {
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:678:1: (lv_aes_4_0= 'AES' )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:679:3: lv_aes_4_0= 'AES'
            	    {
            	    lv_aes_4_0=(Token)match(input,23,FOLLOW_23_in_ruleSColumnProps1520); 

            	            newLeafNode(lv_aes_4_0, grammarAccess.getSColumnPropsAccess().getAesAESKeyword_2_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSColumnPropsRule());
            	    	        }
            	           		setWithLastConsumed(current, "aes", true, "AES");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:699:4: ({...}? => ( ({...}? => (otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) ) ) ) ) )
            	    {
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:699:4: ({...}? => ( ({...}? => (otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) ) ) ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:700:5: {...}? => ( ({...}? => (otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSColumnProps", "getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:700:109: ( ({...}? => (otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) ) ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:701:6: ({...}? => (otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:704:6: ({...}? => (otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:704:7: {...}? => (otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSColumnProps", "true");
            	    }
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:704:16: (otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:704:18: otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) )
            	    {
            	    otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleSColumnProps1600); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSColumnPropsAccess().getIndexKeyword_2_2_0());
            	        
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:708:1: ( (lv_index_6_0= ruleSIndex ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:709:1: (lv_index_6_0= ruleSIndex )
            	    {
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:709:1: (lv_index_6_0= ruleSIndex )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:710:3: lv_index_6_0= ruleSIndex
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSColumnPropsAccess().getIndexSIndexEnumRuleCall_2_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSIndex_in_ruleSColumnProps1621);
            	    lv_index_6_0=ruleSIndex();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSColumnPropsRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"index",
            	            		lv_index_6_0, 
            	            		"SIndex");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2());
            	

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
    // $ANTLR end "ruleSColumnProps"


    // $ANTLR start "entryRuleSInlinedSQLType"
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:750:1: entryRuleSInlinedSQLType returns [EObject current=null] : iv_ruleSInlinedSQLType= ruleSInlinedSQLType EOF ;
    public final EObject entryRuleSInlinedSQLType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSInlinedSQLType = null;


        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:751:2: (iv_ruleSInlinedSQLType= ruleSInlinedSQLType EOF )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:752:2: iv_ruleSInlinedSQLType= ruleSInlinedSQLType EOF
            {
             newCompositeNode(grammarAccess.getSInlinedSQLTypeRule()); 
            pushFollow(FOLLOW_ruleSInlinedSQLType_in_entryRuleSInlinedSQLType1700);
            iv_ruleSInlinedSQLType=ruleSInlinedSQLType();

            state._fsp--;

             current =iv_ruleSInlinedSQLType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSInlinedSQLType1710); 

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
    // $ANTLR end "entryRuleSInlinedSQLType"


    // $ANTLR start "ruleSInlinedSQLType"
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:759:1: ruleSInlinedSQLType returns [EObject current=null] : (this_SString_0= ruleSString | this_SDecimal_1= ruleSDecimal ) ;
    public final EObject ruleSInlinedSQLType() throws RecognitionException {
        EObject current = null;

        EObject this_SString_0 = null;

        EObject this_SDecimal_1 = null;


         enterRule(); 
            
        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:762:28: ( (this_SString_0= ruleSString | this_SDecimal_1= ruleSDecimal ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:763:1: (this_SString_0= ruleSString | this_SDecimal_1= ruleSDecimal )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:763:1: (this_SString_0= ruleSString | this_SDecimal_1= ruleSDecimal )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            else if ( (LA12_0==29) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:764:5: this_SString_0= ruleSString
                    {
                     
                            newCompositeNode(grammarAccess.getSInlinedSQLTypeAccess().getSStringParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSString_in_ruleSInlinedSQLType1757);
                    this_SString_0=ruleSString();

                    state._fsp--;

                     
                            current = this_SString_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:774:5: this_SDecimal_1= ruleSDecimal
                    {
                     
                            newCompositeNode(grammarAccess.getSInlinedSQLTypeAccess().getSDecimalParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSDecimal_in_ruleSInlinedSQLType1784);
                    this_SDecimal_1=ruleSDecimal();

                    state._fsp--;

                     
                            current = this_SDecimal_1; 
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
    // $ANTLR end "ruleSInlinedSQLType"


    // $ANTLR start "entryRuleSEnum"
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:790:1: entryRuleSEnum returns [EObject current=null] : iv_ruleSEnum= ruleSEnum EOF ;
    public final EObject entryRuleSEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSEnum = null;


        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:791:2: (iv_ruleSEnum= ruleSEnum EOF )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:792:2: iv_ruleSEnum= ruleSEnum EOF
            {
             newCompositeNode(grammarAccess.getSEnumRule()); 
            pushFollow(FOLLOW_ruleSEnum_in_entryRuleSEnum1819);
            iv_ruleSEnum=ruleSEnum();

            state._fsp--;

             current =iv_ruleSEnum; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSEnum1829); 

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
    // $ANTLR end "entryRuleSEnum"


    // $ANTLR start "ruleSEnum"
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:799:1: ruleSEnum returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleSEnumLiteral ) )* otherlv_4= '}' ) ;
    public final EObject ruleSEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_literals_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:802:28: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleSEnumLiteral ) )* otherlv_4= '}' ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:803:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleSEnumLiteral ) )* otherlv_4= '}' )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:803:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleSEnumLiteral ) )* otherlv_4= '}' )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:803:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleSEnumLiteral ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleSEnum1866); 

                	newLeafNode(otherlv_0, grammarAccess.getSEnumAccess().getEnumKeyword_0());
                
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:807:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:808:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:808:1: (lv_name_1_0= RULE_ID )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:809:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSEnum1883); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSEnumAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSEnumRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleSEnum1900); 

                	newLeafNode(otherlv_2, grammarAccess.getSEnumAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:829:1: ( (lv_literals_3_0= ruleSEnumLiteral ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:830:1: (lv_literals_3_0= ruleSEnumLiteral )
            	    {
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:830:1: (lv_literals_3_0= ruleSEnumLiteral )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:831:3: lv_literals_3_0= ruleSEnumLiteral
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSEnumAccess().getLiteralsSEnumLiteralParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSEnumLiteral_in_ruleSEnum1921);
            	    lv_literals_3_0=ruleSEnumLiteral();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSEnumRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"literals",
            	            		lv_literals_3_0, 
            	            		"SEnumLiteral");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleSEnum1934); 

                	newLeafNode(otherlv_4, grammarAccess.getSEnumAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleSEnum"


    // $ANTLR start "entryRuleSEnumLiteral"
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:859:1: entryRuleSEnumLiteral returns [EObject current=null] : iv_ruleSEnumLiteral= ruleSEnumLiteral EOF ;
    public final EObject entryRuleSEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSEnumLiteral = null;


        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:860:2: (iv_ruleSEnumLiteral= ruleSEnumLiteral EOF )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:861:2: iv_ruleSEnumLiteral= ruleSEnumLiteral EOF
            {
             newCompositeNode(grammarAccess.getSEnumLiteralRule()); 
            pushFollow(FOLLOW_ruleSEnumLiteral_in_entryRuleSEnumLiteral1970);
            iv_ruleSEnumLiteral=ruleSEnumLiteral();

            state._fsp--;

             current =iv_ruleSEnumLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSEnumLiteral1980); 

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
    // $ANTLR end "entryRuleSEnumLiteral"


    // $ANTLR start "ruleSEnumLiteral"
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:868:1: ruleSEnumLiteral returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleSEnumLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:871:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:872:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:872:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:872:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:872:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:873:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:873:1: (lv_name_0_0= RULE_ID )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:874:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSEnumLiteral2022); 

            			newLeafNode(lv_name_0_0, grammarAccess.getSEnumLiteralAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSEnumLiteralRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleSEnumLiteral2039); 

                	newLeafNode(otherlv_1, grammarAccess.getSEnumLiteralAccess().getEqualsSignKeyword_1());
                
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:894:1: ( (lv_value_2_0= RULE_INT ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:895:1: (lv_value_2_0= RULE_INT )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:895:1: (lv_value_2_0= RULE_INT )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:896:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSEnumLiteral2056); 

            			newLeafNode(lv_value_2_0, grammarAccess.getSEnumLiteralAccess().getValueINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSEnumLiteralRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"INT");
            	    

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
    // $ANTLR end "ruleSEnumLiteral"


    // $ANTLR start "entryRuleSString"
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:920:1: entryRuleSString returns [EObject current=null] : iv_ruleSString= ruleSString EOF ;
    public final EObject entryRuleSString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSString = null;


        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:921:2: (iv_ruleSString= ruleSString EOF )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:922:2: iv_ruleSString= ruleSString EOF
            {
             newCompositeNode(grammarAccess.getSStringRule()); 
            pushFollow(FOLLOW_ruleSString_in_entryRuleSString2097);
            iv_ruleSString=ruleSString();

            state._fsp--;

             current =iv_ruleSString; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSString2107); 

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
    // $ANTLR end "entryRuleSString"


    // $ANTLR start "ruleSString"
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:929:1: ruleSString returns [EObject current=null] : (otherlv_0= 'String(' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= ')' ) ;
    public final EObject ruleSString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:932:28: ( (otherlv_0= 'String(' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= ')' ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:933:1: (otherlv_0= 'String(' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= ')' )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:933:1: (otherlv_0= 'String(' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= ')' )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:933:3: otherlv_0= 'String(' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleSString2144); 

                	newLeafNode(otherlv_0, grammarAccess.getSStringAccess().getStringKeyword_0());
                
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:937:1: ( (lv_value_1_0= RULE_INT ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:938:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:938:1: (lv_value_1_0= RULE_INT )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:939:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSString2161); 

            			newLeafNode(lv_value_1_0, grammarAccess.getSStringAccess().getValueINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSStringRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"INT");
            	    

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleSString2178); 

                	newLeafNode(otherlv_2, grammarAccess.getSStringAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleSString"


    // $ANTLR start "entryRuleSDecimal"
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:967:1: entryRuleSDecimal returns [EObject current=null] : iv_ruleSDecimal= ruleSDecimal EOF ;
    public final EObject entryRuleSDecimal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDecimal = null;


        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:968:2: (iv_ruleSDecimal= ruleSDecimal EOF )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:969:2: iv_ruleSDecimal= ruleSDecimal EOF
            {
             newCompositeNode(grammarAccess.getSDecimalRule()); 
            pushFollow(FOLLOW_ruleSDecimal_in_entryRuleSDecimal2214);
            iv_ruleSDecimal=ruleSDecimal();

            state._fsp--;

             current =iv_ruleSDecimal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSDecimal2224); 

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
    // $ANTLR end "entryRuleSDecimal"


    // $ANTLR start "ruleSDecimal"
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:976:1: ruleSDecimal returns [EObject current=null] : (otherlv_0= 'Decimal(' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= ')' ) ;
    public final EObject ruleSDecimal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:979:28: ( (otherlv_0= 'Decimal(' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= ')' ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:980:1: (otherlv_0= 'Decimal(' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= ')' )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:980:1: (otherlv_0= 'Decimal(' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= ')' )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:980:3: otherlv_0= 'Decimal(' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleSDecimal2261); 

                	newLeafNode(otherlv_0, grammarAccess.getSDecimalAccess().getDecimalKeyword_0());
                
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:984:1: ( (lv_value_1_0= RULE_INT ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:985:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:985:1: (lv_value_1_0= RULE_INT )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:986:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSDecimal2278); 

            			newLeafNode(lv_value_1_0, grammarAccess.getSDecimalAccess().getValueINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSDecimalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"INT");
            	    

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleSDecimal2295); 

                	newLeafNode(otherlv_2, grammarAccess.getSDecimalAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleSDecimal"


    // $ANTLR start "ruleSDBEngine"
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1014:1: ruleSDBEngine returns [Enumerator current=null] : ( (enumLiteral_0= 'InnoDB' ) | (enumLiteral_1= 'MyISAM' ) ) ;
    public final Enumerator ruleSDBEngine() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1016:28: ( ( (enumLiteral_0= 'InnoDB' ) | (enumLiteral_1= 'MyISAM' ) ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1017:1: ( (enumLiteral_0= 'InnoDB' ) | (enumLiteral_1= 'MyISAM' ) )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1017:1: ( (enumLiteral_0= 'InnoDB' ) | (enumLiteral_1= 'MyISAM' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            else if ( (LA14_0==31) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1017:2: (enumLiteral_0= 'InnoDB' )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1017:2: (enumLiteral_0= 'InnoDB' )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1017:4: enumLiteral_0= 'InnoDB'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_30_in_ruleSDBEngine2345); 

                            current = grammarAccess.getSDBEngineAccess().getINNODBEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSDBEngineAccess().getINNODBEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1023:6: (enumLiteral_1= 'MyISAM' )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1023:6: (enumLiteral_1= 'MyISAM' )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1023:8: enumLiteral_1= 'MyISAM'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_31_in_ruleSDBEngine2362); 

                            current = grammarAccess.getSDBEngineAccess().getMYISAMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getSDBEngineAccess().getMYISAMEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleSDBEngine"


    // $ANTLR start "ruleSSimpleTypes"
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1033:1: ruleSSimpleTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'Int' ) | (enumLiteral_1= 'Tinyint' ) | (enumLiteral_2= 'Smallint' ) | (enumLiteral_3= 'Mediumint' ) | (enumLiteral_4= 'Boolean' ) | (enumLiteral_5= 'Blob' ) | (enumLiteral_6= 'Datetime' ) | (enumLiteral_7= 'Date' ) | (enumLiteral_8= 'Time' ) | (enumLiteral_9= 'Polygon' ) | (enumLiteral_10= 'Point' ) | (enumLiteral_11= 'Foto' ) | (enumLiteral_12= 'Currency' ) | (enumLiteral_13= 'Coordinate' ) ) ;
    public final Enumerator ruleSSimpleTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;

         enterRule(); 
        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1035:28: ( ( (enumLiteral_0= 'Int' ) | (enumLiteral_1= 'Tinyint' ) | (enumLiteral_2= 'Smallint' ) | (enumLiteral_3= 'Mediumint' ) | (enumLiteral_4= 'Boolean' ) | (enumLiteral_5= 'Blob' ) | (enumLiteral_6= 'Datetime' ) | (enumLiteral_7= 'Date' ) | (enumLiteral_8= 'Time' ) | (enumLiteral_9= 'Polygon' ) | (enumLiteral_10= 'Point' ) | (enumLiteral_11= 'Foto' ) | (enumLiteral_12= 'Currency' ) | (enumLiteral_13= 'Coordinate' ) ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1036:1: ( (enumLiteral_0= 'Int' ) | (enumLiteral_1= 'Tinyint' ) | (enumLiteral_2= 'Smallint' ) | (enumLiteral_3= 'Mediumint' ) | (enumLiteral_4= 'Boolean' ) | (enumLiteral_5= 'Blob' ) | (enumLiteral_6= 'Datetime' ) | (enumLiteral_7= 'Date' ) | (enumLiteral_8= 'Time' ) | (enumLiteral_9= 'Polygon' ) | (enumLiteral_10= 'Point' ) | (enumLiteral_11= 'Foto' ) | (enumLiteral_12= 'Currency' ) | (enumLiteral_13= 'Coordinate' ) )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1036:1: ( (enumLiteral_0= 'Int' ) | (enumLiteral_1= 'Tinyint' ) | (enumLiteral_2= 'Smallint' ) | (enumLiteral_3= 'Mediumint' ) | (enumLiteral_4= 'Boolean' ) | (enumLiteral_5= 'Blob' ) | (enumLiteral_6= 'Datetime' ) | (enumLiteral_7= 'Date' ) | (enumLiteral_8= 'Time' ) | (enumLiteral_9= 'Polygon' ) | (enumLiteral_10= 'Point' ) | (enumLiteral_11= 'Foto' ) | (enumLiteral_12= 'Currency' ) | (enumLiteral_13= 'Coordinate' ) )
            int alt15=14;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt15=1;
                }
                break;
            case 33:
                {
                alt15=2;
                }
                break;
            case 34:
                {
                alt15=3;
                }
                break;
            case 35:
                {
                alt15=4;
                }
                break;
            case 36:
                {
                alt15=5;
                }
                break;
            case 37:
                {
                alt15=6;
                }
                break;
            case 38:
                {
                alt15=7;
                }
                break;
            case 39:
                {
                alt15=8;
                }
                break;
            case 40:
                {
                alt15=9;
                }
                break;
            case 41:
                {
                alt15=10;
                }
                break;
            case 42:
                {
                alt15=11;
                }
                break;
            case 43:
                {
                alt15=12;
                }
                break;
            case 44:
                {
                alt15=13;
                }
                break;
            case 45:
                {
                alt15=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1036:2: (enumLiteral_0= 'Int' )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1036:2: (enumLiteral_0= 'Int' )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1036:4: enumLiteral_0= 'Int'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_32_in_ruleSSimpleTypes2407); 

                            current = grammarAccess.getSSimpleTypesAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSSimpleTypesAccess().getINTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1042:6: (enumLiteral_1= 'Tinyint' )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1042:6: (enumLiteral_1= 'Tinyint' )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1042:8: enumLiteral_1= 'Tinyint'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_33_in_ruleSSimpleTypes2424); 

                            current = grammarAccess.getSSimpleTypesAccess().getTINY_INTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getSSimpleTypesAccess().getTINY_INTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1048:6: (enumLiteral_2= 'Smallint' )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1048:6: (enumLiteral_2= 'Smallint' )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1048:8: enumLiteral_2= 'Smallint'
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_34_in_ruleSSimpleTypes2441); 

                            current = grammarAccess.getSSimpleTypesAccess().getSMALL_INTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getSSimpleTypesAccess().getSMALL_INTEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1054:6: (enumLiteral_3= 'Mediumint' )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1054:6: (enumLiteral_3= 'Mediumint' )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1054:8: enumLiteral_3= 'Mediumint'
                    {
                    enumLiteral_3=(Token)match(input,35,FOLLOW_35_in_ruleSSimpleTypes2458); 

                            current = grammarAccess.getSSimpleTypesAccess().getMEDIUM_INTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getSSimpleTypesAccess().getMEDIUM_INTEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1060:6: (enumLiteral_4= 'Boolean' )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1060:6: (enumLiteral_4= 'Boolean' )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1060:8: enumLiteral_4= 'Boolean'
                    {
                    enumLiteral_4=(Token)match(input,36,FOLLOW_36_in_ruleSSimpleTypes2475); 

                            current = grammarAccess.getSSimpleTypesAccess().getBOOLEANEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getSSimpleTypesAccess().getBOOLEANEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1066:6: (enumLiteral_5= 'Blob' )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1066:6: (enumLiteral_5= 'Blob' )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1066:8: enumLiteral_5= 'Blob'
                    {
                    enumLiteral_5=(Token)match(input,37,FOLLOW_37_in_ruleSSimpleTypes2492); 

                            current = grammarAccess.getSSimpleTypesAccess().getBLOBEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getSSimpleTypesAccess().getBLOBEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1072:6: (enumLiteral_6= 'Datetime' )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1072:6: (enumLiteral_6= 'Datetime' )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1072:8: enumLiteral_6= 'Datetime'
                    {
                    enumLiteral_6=(Token)match(input,38,FOLLOW_38_in_ruleSSimpleTypes2509); 

                            current = grammarAccess.getSSimpleTypesAccess().getDATETIMEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getSSimpleTypesAccess().getDATETIMEEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1078:6: (enumLiteral_7= 'Date' )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1078:6: (enumLiteral_7= 'Date' )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1078:8: enumLiteral_7= 'Date'
                    {
                    enumLiteral_7=(Token)match(input,39,FOLLOW_39_in_ruleSSimpleTypes2526); 

                            current = grammarAccess.getSSimpleTypesAccess().getDATEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getSSimpleTypesAccess().getDATEEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1084:6: (enumLiteral_8= 'Time' )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1084:6: (enumLiteral_8= 'Time' )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1084:8: enumLiteral_8= 'Time'
                    {
                    enumLiteral_8=(Token)match(input,40,FOLLOW_40_in_ruleSSimpleTypes2543); 

                            current = grammarAccess.getSSimpleTypesAccess().getTIMEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getSSimpleTypesAccess().getTIMEEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1090:6: (enumLiteral_9= 'Polygon' )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1090:6: (enumLiteral_9= 'Polygon' )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1090:8: enumLiteral_9= 'Polygon'
                    {
                    enumLiteral_9=(Token)match(input,41,FOLLOW_41_in_ruleSSimpleTypes2560); 

                            current = grammarAccess.getSSimpleTypesAccess().getPOLYGONEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getSSimpleTypesAccess().getPOLYGONEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1096:6: (enumLiteral_10= 'Point' )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1096:6: (enumLiteral_10= 'Point' )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1096:8: enumLiteral_10= 'Point'
                    {
                    enumLiteral_10=(Token)match(input,42,FOLLOW_42_in_ruleSSimpleTypes2577); 

                            current = grammarAccess.getSSimpleTypesAccess().getPOINTEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getSSimpleTypesAccess().getPOINTEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1102:6: (enumLiteral_11= 'Foto' )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1102:6: (enumLiteral_11= 'Foto' )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1102:8: enumLiteral_11= 'Foto'
                    {
                    enumLiteral_11=(Token)match(input,43,FOLLOW_43_in_ruleSSimpleTypes2594); 

                            current = grammarAccess.getSSimpleTypesAccess().getFOTOEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getSSimpleTypesAccess().getFOTOEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1108:6: (enumLiteral_12= 'Currency' )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1108:6: (enumLiteral_12= 'Currency' )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1108:8: enumLiteral_12= 'Currency'
                    {
                    enumLiteral_12=(Token)match(input,44,FOLLOW_44_in_ruleSSimpleTypes2611); 

                            current = grammarAccess.getSSimpleTypesAccess().getCurrencyEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getSSimpleTypesAccess().getCurrencyEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1114:6: (enumLiteral_13= 'Coordinate' )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1114:6: (enumLiteral_13= 'Coordinate' )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1114:8: enumLiteral_13= 'Coordinate'
                    {
                    enumLiteral_13=(Token)match(input,45,FOLLOW_45_in_ruleSSimpleTypes2628); 

                            current = grammarAccess.getSSimpleTypesAccess().getCoordinateEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_13, grammarAccess.getSSimpleTypesAccess().getCoordinateEnumLiteralDeclaration_13()); 
                        

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
    // $ANTLR end "ruleSSimpleTypes"


    // $ANTLR start "ruleSIndex"
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1124:1: ruleSIndex returns [Enumerator current=null] : ( (enumLiteral_0= 'No' ) | (enumLiteral_1= 'Yes' ) | (enumLiteral_2= 'Unique' ) | (enumLiteral_3= 'Spatial' ) ) ;
    public final Enumerator ruleSIndex() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1126:28: ( ( (enumLiteral_0= 'No' ) | (enumLiteral_1= 'Yes' ) | (enumLiteral_2= 'Unique' ) | (enumLiteral_3= 'Spatial' ) ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1127:1: ( (enumLiteral_0= 'No' ) | (enumLiteral_1= 'Yes' ) | (enumLiteral_2= 'Unique' ) | (enumLiteral_3= 'Spatial' ) )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1127:1: ( (enumLiteral_0= 'No' ) | (enumLiteral_1= 'Yes' ) | (enumLiteral_2= 'Unique' ) | (enumLiteral_3= 'Spatial' ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt16=1;
                }
                break;
            case 47:
                {
                alt16=2;
                }
                break;
            case 48:
                {
                alt16=3;
                }
                break;
            case 49:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1127:2: (enumLiteral_0= 'No' )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1127:2: (enumLiteral_0= 'No' )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1127:4: enumLiteral_0= 'No'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_46_in_ruleSIndex2673); 

                            current = grammarAccess.getSIndexAccess().getNOEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSIndexAccess().getNOEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1133:6: (enumLiteral_1= 'Yes' )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1133:6: (enumLiteral_1= 'Yes' )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1133:8: enumLiteral_1= 'Yes'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_47_in_ruleSIndex2690); 

                            current = grammarAccess.getSIndexAccess().getYESEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getSIndexAccess().getYESEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1139:6: (enumLiteral_2= 'Unique' )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1139:6: (enumLiteral_2= 'Unique' )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1139:8: enumLiteral_2= 'Unique'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_48_in_ruleSIndex2707); 

                            current = grammarAccess.getSIndexAccess().getUNIQUEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getSIndexAccess().getUNIQUEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1145:6: (enumLiteral_3= 'Spatial' )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1145:6: (enumLiteral_3= 'Spatial' )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1145:8: enumLiteral_3= 'Spatial'
                    {
                    enumLiteral_3=(Token)match(input,49,FOLLOW_49_in_ruleSIndex2724); 

                            current = grammarAccess.getSIndexAccess().getSPATIALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getSIndexAccess().getSPATIALEnumLiteralDeclaration_3()); 
                        

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
    // $ANTLR end "ruleSIndex"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSModel_in_entryRuleSModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSSettings_in_ruleSModel131 = new BitSet(new long[]{0x0000000002008002L});
    public static final BitSet FOLLOW_ruleSArtifact_in_ruleSModel153 = new BitSet(new long[]{0x0000000002008002L});
    public static final BitSet FOLLOW_ruleSSettings_in_entryRuleSSettings190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSSettings200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSSettings246 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_12_in_ruleSSettings304 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSSettings321 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_13_in_ruleSSettings394 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_ruleSDBEngine_in_ruleSSettings415 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_14_in_ruleSSettings468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSArtifact_in_entryRuleSArtifact504 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSArtifact514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTable_in_ruleSArtifact561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSEnum_in_ruleSArtifact588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTable_in_entryRuleSTable623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSTable633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSTable670 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSTable687 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSTable704 = new BitSet(new long[]{0x00000000001A4000L});
    public static final BitSet FOLLOW_17_in_ruleSTable717 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSTable734 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSTable751 = new BitSet(new long[]{0x0000000000184000L});
    public static final BitSet FOLLOW_ruleSEntityMember_in_ruleSTable774 = new BitSet(new long[]{0x0000000000184000L});
    public static final BitSet FOLLOW_14_in_ruleSTable787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSEntityMember_in_entryRuleSEntityMember823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSEntityMember833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSProperty_in_ruleSEntityMember880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJoinProperty_in_ruleSEntityMember907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSProperty_in_entryRuleSProperty942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSProperty952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleSProperty989 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSProperty1006 = new BitSet(new long[]{0x00003FFF28000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSProperty1032 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_ruleSInlinedSQLType_in_ruleSProperty1059 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_ruleSSimpleTypes_in_ruleSProperty1086 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_ruleSColumnProps_in_ruleSProperty1108 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSProperty1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJoinProperty_in_entryRuleSJoinProperty1157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSJoinProperty1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleSJoinProperty1204 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSJoinProperty1221 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSJoinProperty1246 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_ruleSColumnProps_in_ruleSJoinProperty1267 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSJoinProperty1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSColumnProps_in_entryRuleSColumnProps1316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSColumnProps1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSColumnProps1372 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_22_in_ruleSColumnProps1435 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_23_in_ruleSColumnProps1520 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_24_in_ruleSColumnProps1600 = new BitSet(new long[]{0x0003C00000000000L});
    public static final BitSet FOLLOW_ruleSIndex_in_ruleSColumnProps1621 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_ruleSInlinedSQLType_in_entryRuleSInlinedSQLType1700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSInlinedSQLType1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSString_in_ruleSInlinedSQLType1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSDecimal_in_ruleSInlinedSQLType1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSEnum_in_entryRuleSEnum1819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSEnum1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleSEnum1866 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSEnum1883 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSEnum1900 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleSEnumLiteral_in_ruleSEnum1921 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleSEnum1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSEnumLiteral_in_entryRuleSEnumLiteral1970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSEnumLiteral1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSEnumLiteral2022 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleSEnumLiteral2039 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSEnumLiteral2056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSString_in_entryRuleSString2097 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSString2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleSString2144 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSString2161 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSString2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSDecimal_in_entryRuleSDecimal2214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSDecimal2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleSDecimal2261 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSDecimal2278 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSDecimal2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleSDBEngine2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleSDBEngine2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleSSimpleTypes2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleSSimpleTypes2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleSSimpleTypes2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleSSimpleTypes2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleSSimpleTypes2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleSSimpleTypes2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleSSimpleTypes2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleSSimpleTypes2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleSSimpleTypes2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleSSimpleTypes2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleSSimpleTypes2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleSSimpleTypes2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleSSimpleTypes2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleSSimpleTypes2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleSIndex2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleSIndex2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleSIndex2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleSIndex2724 = new BitSet(new long[]{0x0000000000000002L});

}

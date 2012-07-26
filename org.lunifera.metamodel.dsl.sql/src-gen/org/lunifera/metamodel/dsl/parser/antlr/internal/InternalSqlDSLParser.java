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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'generatedFile'", "'settings {'", "'schema='", "'javapackage='", "'engine='", "'}'", "'table'", "'{'", "'entityname='", "'cached'", "'prefix'", "';'", "'column'", "'joincolumn'", "'with'", "'nullable'", "'AES'", "'index='", "'javacolumn='", "'enum'", "'='", "'String('", "')'", "'Decimal('", "'.'", "'InnoDB'", "'MyISAM'", "'Int'", "'Tinyint'", "'Smallint'", "'Mediumint'", "'Boolean'", "'Blob'", "'Datetime'", "'Date'", "'Time'", "'Polygon'", "'Point'", "'Foto'", "'Currency'", "'Coordinate'", "'No'", "'Yes'", "'Unique'", "'Spatial'"
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
    public static final int T__55=55;
    public static final int T__19=19;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int T__50=50;
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
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:77:1: ruleSModel returns [EObject current=null] : ( (otherlv_0= 'generatedFile' ( (lv_generatedFile_1_0= RULE_ID ) ) ) ( (lv_settings_2_0= ruleSSettings ) )? ( (lv_artifact_3_0= ruleSArtifact ) )* ) ;
    public final EObject ruleSModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_generatedFile_1_0=null;
        EObject lv_settings_2_0 = null;

        EObject lv_artifact_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:80:28: ( ( (otherlv_0= 'generatedFile' ( (lv_generatedFile_1_0= RULE_ID ) ) ) ( (lv_settings_2_0= ruleSSettings ) )? ( (lv_artifact_3_0= ruleSArtifact ) )* ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:81:1: ( (otherlv_0= 'generatedFile' ( (lv_generatedFile_1_0= RULE_ID ) ) ) ( (lv_settings_2_0= ruleSSettings ) )? ( (lv_artifact_3_0= ruleSArtifact ) )* )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:81:1: ( (otherlv_0= 'generatedFile' ( (lv_generatedFile_1_0= RULE_ID ) ) ) ( (lv_settings_2_0= ruleSSettings ) )? ( (lv_artifact_3_0= ruleSArtifact ) )* )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:81:2: (otherlv_0= 'generatedFile' ( (lv_generatedFile_1_0= RULE_ID ) ) ) ( (lv_settings_2_0= ruleSSettings ) )? ( (lv_artifact_3_0= ruleSArtifact ) )*
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:81:2: (otherlv_0= 'generatedFile' ( (lv_generatedFile_1_0= RULE_ID ) ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:81:4: otherlv_0= 'generatedFile' ( (lv_generatedFile_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleSModel123); 

                	newLeafNode(otherlv_0, grammarAccess.getSModelAccess().getGeneratedFileKeyword_0_0());
                
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:85:1: ( (lv_generatedFile_1_0= RULE_ID ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:86:1: (lv_generatedFile_1_0= RULE_ID )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:86:1: (lv_generatedFile_1_0= RULE_ID )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:87:3: lv_generatedFile_1_0= RULE_ID
            {
            lv_generatedFile_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSModel140); 

            			newLeafNode(lv_generatedFile_1_0, grammarAccess.getSModelAccess().getGeneratedFileIDTerminalRuleCall_0_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"generatedFile",
                    		lv_generatedFile_1_0, 
                    		"ID");
            	    

            }


            }


            }

            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:103:3: ( (lv_settings_2_0= ruleSSettings ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:104:1: (lv_settings_2_0= ruleSSettings )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:104:1: (lv_settings_2_0= ruleSSettings )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:105:3: lv_settings_2_0= ruleSSettings
                    {
                     
                    	        newCompositeNode(grammarAccess.getSModelAccess().getSettingsSSettingsParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSSettings_in_ruleSModel167);
                    lv_settings_2_0=ruleSSettings();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSModelRule());
                    	        }
                           		set(
                           			current, 
                           			"settings",
                            		lv_settings_2_0, 
                            		"SSettings");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:121:3: ( (lv_artifact_3_0= ruleSArtifact ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17||LA2_0==30) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:122:1: (lv_artifact_3_0= ruleSArtifact )
            	    {
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:122:1: (lv_artifact_3_0= ruleSArtifact )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:123:3: lv_artifact_3_0= ruleSArtifact
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSModelAccess().getArtifactSArtifactParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSArtifact_in_ruleSModel189);
            	    lv_artifact_3_0=ruleSArtifact();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"artifact",
            	            		lv_artifact_3_0, 
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
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:147:1: entryRuleSSettings returns [EObject current=null] : iv_ruleSSettings= ruleSSettings EOF ;
    public final EObject entryRuleSSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSSettings = null;


        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:148:2: (iv_ruleSSettings= ruleSSettings EOF )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:149:2: iv_ruleSSettings= ruleSSettings EOF
            {
             newCompositeNode(grammarAccess.getSSettingsRule()); 
            pushFollow(FOLLOW_ruleSSettings_in_entryRuleSSettings226);
            iv_ruleSSettings=ruleSSettings();

            state._fsp--;

             current =iv_ruleSSettings; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSSettings236); 

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
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:156:1: ruleSSettings returns [EObject current=null] : ( () otherlv_1= 'settings {' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'javapackage=' ( (lv_javapackage_6_0= ruleLFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'engine=' ( (lv_engine_8_0= ruleSDBEngine ) ) ) ) ) ) )* ) ) ) otherlv_9= '}' ) ;
    public final EObject ruleSSettings() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_schema_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_javapackage_6_0 = null;

        Enumerator lv_engine_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:159:28: ( ( () otherlv_1= 'settings {' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'javapackage=' ( (lv_javapackage_6_0= ruleLFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'engine=' ( (lv_engine_8_0= ruleSDBEngine ) ) ) ) ) ) )* ) ) ) otherlv_9= '}' ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:160:1: ( () otherlv_1= 'settings {' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'javapackage=' ( (lv_javapackage_6_0= ruleLFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'engine=' ( (lv_engine_8_0= ruleSDBEngine ) ) ) ) ) ) )* ) ) ) otherlv_9= '}' )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:160:1: ( () otherlv_1= 'settings {' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'javapackage=' ( (lv_javapackage_6_0= ruleLFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'engine=' ( (lv_engine_8_0= ruleSDBEngine ) ) ) ) ) ) )* ) ) ) otherlv_9= '}' )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:160:2: () otherlv_1= 'settings {' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'javapackage=' ( (lv_javapackage_6_0= ruleLFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'engine=' ( (lv_engine_8_0= ruleSDBEngine ) ) ) ) ) ) )* ) ) ) otherlv_9= '}'
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:160:2: ()
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:161:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSSettingsAccess().getSSettingsAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleSSettings282); 

                	newLeafNode(otherlv_1, grammarAccess.getSSettingsAccess().getSettingsKeyword_1());
                
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:170:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'javapackage=' ( (lv_javapackage_6_0= ruleLFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'engine=' ( (lv_engine_8_0= ruleSDBEngine ) ) ) ) ) ) )* ) ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:172:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'javapackage=' ( (lv_javapackage_6_0= ruleLFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'engine=' ( (lv_engine_8_0= ruleSDBEngine ) ) ) ) ) ) )* ) )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:172:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'javapackage=' ( (lv_javapackage_6_0= ruleLFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'engine=' ( (lv_engine_8_0= ruleSDBEngine ) ) ) ) ) ) )* ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:173:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'javapackage=' ( (lv_javapackage_6_0= ruleLFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'engine=' ( (lv_engine_8_0= ruleSDBEngine ) ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getSSettingsAccess().getUnorderedGroup_2());
            	
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:176:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'javapackage=' ( (lv_javapackage_6_0= ruleLFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'engine=' ( (lv_engine_8_0= ruleSDBEngine ) ) ) ) ) ) )* )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:177:3: ( ({...}? => ( ({...}? => (otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'javapackage=' ( (lv_javapackage_6_0= ruleLFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'engine=' ( (lv_engine_8_0= ruleSDBEngine ) ) ) ) ) ) )*
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:177:3: ( ({...}? => ( ({...}? => (otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'javapackage=' ( (lv_javapackage_6_0= ruleLFQN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'engine=' ( (lv_engine_8_0= ruleSDBEngine ) ) ) ) ) ) )*
            loop3:
            do {
                int alt3=4;
                int LA3_0 = input.LA(1);

                if ( LA3_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 1) ) {
                    alt3=2;
                }
                else if ( LA3_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 2) ) {
                    alt3=3;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:179:4: ({...}? => ( ({...}? => (otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) ) ) ) ) )
            	    {
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:179:4: ({...}? => ( ({...}? => (otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) ) ) ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:180:5: {...}? => ( ({...}? => (otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:180:106: ( ({...}? => (otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) ) ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:181:6: ({...}? => (otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:184:6: ({...}? => (otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:184:7: {...}? => (otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSSettings", "true");
            	    }
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:184:16: (otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:184:18: otherlv_3= 'schema=' ( (lv_schema_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleSSettings340); 

            	        	newLeafNode(otherlv_3, grammarAccess.getSSettingsAccess().getSchemaKeyword_2_0_0());
            	        
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:188:1: ( (lv_schema_4_0= RULE_ID ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:189:1: (lv_schema_4_0= RULE_ID )
            	    {
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:189:1: (lv_schema_4_0= RULE_ID )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:190:3: lv_schema_4_0= RULE_ID
            	    {
            	    lv_schema_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSSettings357); 

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
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:213:4: ({...}? => ( ({...}? => (otherlv_5= 'javapackage=' ( (lv_javapackage_6_0= ruleLFQN ) ) ) ) ) )
            	    {
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:213:4: ({...}? => ( ({...}? => (otherlv_5= 'javapackage=' ( (lv_javapackage_6_0= ruleLFQN ) ) ) ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:214:5: {...}? => ( ({...}? => (otherlv_5= 'javapackage=' ( (lv_javapackage_6_0= ruleLFQN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:214:106: ( ({...}? => (otherlv_5= 'javapackage=' ( (lv_javapackage_6_0= ruleLFQN ) ) ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:215:6: ({...}? => (otherlv_5= 'javapackage=' ( (lv_javapackage_6_0= ruleLFQN ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:218:6: ({...}? => (otherlv_5= 'javapackage=' ( (lv_javapackage_6_0= ruleLFQN ) ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:218:7: {...}? => (otherlv_5= 'javapackage=' ( (lv_javapackage_6_0= ruleLFQN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSSettings", "true");
            	    }
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:218:16: (otherlv_5= 'javapackage=' ( (lv_javapackage_6_0= ruleLFQN ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:218:18: otherlv_5= 'javapackage=' ( (lv_javapackage_6_0= ruleLFQN ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleSSettings430); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSSettingsAccess().getJavapackageKeyword_2_1_0());
            	        
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:222:1: ( (lv_javapackage_6_0= ruleLFQN ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:223:1: (lv_javapackage_6_0= ruleLFQN )
            	    {
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:223:1: (lv_javapackage_6_0= ruleLFQN )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:224:3: lv_javapackage_6_0= ruleLFQN
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSSettingsAccess().getJavapackageLFQNParserRuleCall_2_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLFQN_in_ruleSSettings451);
            	    lv_javapackage_6_0=ruleLFQN();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSSettingsRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"javapackage",
            	            		lv_javapackage_6_0, 
            	            		"LFQN");
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
            	case 3 :
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:247:4: ({...}? => ( ({...}? => (otherlv_7= 'engine=' ( (lv_engine_8_0= ruleSDBEngine ) ) ) ) ) )
            	    {
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:247:4: ({...}? => ( ({...}? => (otherlv_7= 'engine=' ( (lv_engine_8_0= ruleSDBEngine ) ) ) ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:248:5: {...}? => ( ({...}? => (otherlv_7= 'engine=' ( (lv_engine_8_0= ruleSDBEngine ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:248:106: ( ({...}? => (otherlv_7= 'engine=' ( (lv_engine_8_0= ruleSDBEngine ) ) ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:249:6: ({...}? => (otherlv_7= 'engine=' ( (lv_engine_8_0= ruleSDBEngine ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:252:6: ({...}? => (otherlv_7= 'engine=' ( (lv_engine_8_0= ruleSDBEngine ) ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:252:7: {...}? => (otherlv_7= 'engine=' ( (lv_engine_8_0= ruleSDBEngine ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSSettings", "true");
            	    }
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:252:16: (otherlv_7= 'engine=' ( (lv_engine_8_0= ruleSDBEngine ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:252:18: otherlv_7= 'engine=' ( (lv_engine_8_0= ruleSDBEngine ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleSSettings519); 

            	        	newLeafNode(otherlv_7, grammarAccess.getSSettingsAccess().getEngineKeyword_2_2_0());
            	        
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:256:1: ( (lv_engine_8_0= ruleSDBEngine ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:257:1: (lv_engine_8_0= ruleSDBEngine )
            	    {
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:257:1: (lv_engine_8_0= ruleSDBEngine )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:258:3: lv_engine_8_0= ruleSDBEngine
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSSettingsAccess().getEngineSDBEngineEnumRuleCall_2_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSDBEngine_in_ruleSSettings540);
            	    lv_engine_8_0=ruleSDBEngine();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSSettingsRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"engine",
            	            		lv_engine_8_0, 
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

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleSSettings593); 

                	newLeafNode(otherlv_9, grammarAccess.getSSettingsAccess().getRightCurlyBracketKeyword_3());
                

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
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:300:1: entryRuleSArtifact returns [EObject current=null] : iv_ruleSArtifact= ruleSArtifact EOF ;
    public final EObject entryRuleSArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSArtifact = null;


        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:301:2: (iv_ruleSArtifact= ruleSArtifact EOF )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:302:2: iv_ruleSArtifact= ruleSArtifact EOF
            {
             newCompositeNode(grammarAccess.getSArtifactRule()); 
            pushFollow(FOLLOW_ruleSArtifact_in_entryRuleSArtifact629);
            iv_ruleSArtifact=ruleSArtifact();

            state._fsp--;

             current =iv_ruleSArtifact; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSArtifact639); 

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
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:309:1: ruleSArtifact returns [EObject current=null] : (this_STable_0= ruleSTable | this_SEnum_1= ruleSEnum ) ;
    public final EObject ruleSArtifact() throws RecognitionException {
        EObject current = null;

        EObject this_STable_0 = null;

        EObject this_SEnum_1 = null;


         enterRule(); 
            
        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:312:28: ( (this_STable_0= ruleSTable | this_SEnum_1= ruleSEnum ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:313:1: (this_STable_0= ruleSTable | this_SEnum_1= ruleSEnum )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:313:1: (this_STable_0= ruleSTable | this_SEnum_1= ruleSEnum )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            else if ( (LA4_0==30) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:314:5: this_STable_0= ruleSTable
                    {
                     
                            newCompositeNode(grammarAccess.getSArtifactAccess().getSTableParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSTable_in_ruleSArtifact686);
                    this_STable_0=ruleSTable();

                    state._fsp--;

                     
                            current = this_STable_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:324:5: this_SEnum_1= ruleSEnum
                    {
                     
                            newCompositeNode(grammarAccess.getSArtifactAccess().getSEnumParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSEnum_in_ruleSArtifact713);
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
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:340:1: entryRuleSTable returns [EObject current=null] : iv_ruleSTable= ruleSTable EOF ;
    public final EObject entryRuleSTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSTable = null;


        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:341:2: (iv_ruleSTable= ruleSTable EOF )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:342:2: iv_ruleSTable= ruleSTable EOF
            {
             newCompositeNode(grammarAccess.getSTableRule()); 
            pushFollow(FOLLOW_ruleSTable_in_entryRuleSTable748);
            iv_ruleSTable=ruleSTable();

            state._fsp--;

             current =iv_ruleSTable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSTable758); 

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
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:349:1: ruleSTable returns [EObject current=null] : (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_settings_4_0= ruleSSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'entityname=' ( (lv_entityname_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cached_7_0= 'cached' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'prefix' ( (lv_prefix_9_0= RULE_ID ) ) otherlv_10= ';' ) ) ) ) )* ) ) ) ( (lv_columns_11_0= ruleSTableMember ) )* otherlv_12= '}' ) ;
    public final EObject ruleSTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token lv_entityname_6_0=null;
        Token lv_cached_7_0=null;
        Token otherlv_8=null;
        Token lv_prefix_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_settings_4_0 = null;

        EObject lv_columns_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:352:28: ( (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_settings_4_0= ruleSSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'entityname=' ( (lv_entityname_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cached_7_0= 'cached' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'prefix' ( (lv_prefix_9_0= RULE_ID ) ) otherlv_10= ';' ) ) ) ) )* ) ) ) ( (lv_columns_11_0= ruleSTableMember ) )* otherlv_12= '}' ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:353:1: (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_settings_4_0= ruleSSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'entityname=' ( (lv_entityname_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cached_7_0= 'cached' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'prefix' ( (lv_prefix_9_0= RULE_ID ) ) otherlv_10= ';' ) ) ) ) )* ) ) ) ( (lv_columns_11_0= ruleSTableMember ) )* otherlv_12= '}' )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:353:1: (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_settings_4_0= ruleSSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'entityname=' ( (lv_entityname_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cached_7_0= 'cached' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'prefix' ( (lv_prefix_9_0= RULE_ID ) ) otherlv_10= ';' ) ) ) ) )* ) ) ) ( (lv_columns_11_0= ruleSTableMember ) )* otherlv_12= '}' )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:353:3: otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_settings_4_0= ruleSSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'entityname=' ( (lv_entityname_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cached_7_0= 'cached' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'prefix' ( (lv_prefix_9_0= RULE_ID ) ) otherlv_10= ';' ) ) ) ) )* ) ) ) ( (lv_columns_11_0= ruleSTableMember ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleSTable795); 

                	newLeafNode(otherlv_0, grammarAccess.getSTableAccess().getTableKeyword_0());
                
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:357:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:358:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:358:1: (lv_name_1_0= RULE_ID )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:359:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSTable812); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleSTable829); 

                	newLeafNode(otherlv_2, grammarAccess.getSTableAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:379:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_settings_4_0= ruleSSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'entityname=' ( (lv_entityname_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cached_7_0= 'cached' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'prefix' ( (lv_prefix_9_0= RULE_ID ) ) otherlv_10= ';' ) ) ) ) )* ) ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:381:1: ( ( ( ({...}? => ( ({...}? => ( (lv_settings_4_0= ruleSSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'entityname=' ( (lv_entityname_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cached_7_0= 'cached' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'prefix' ( (lv_prefix_9_0= RULE_ID ) ) otherlv_10= ';' ) ) ) ) )* ) )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:381:1: ( ( ( ({...}? => ( ({...}? => ( (lv_settings_4_0= ruleSSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'entityname=' ( (lv_entityname_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cached_7_0= 'cached' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'prefix' ( (lv_prefix_9_0= RULE_ID ) ) otherlv_10= ';' ) ) ) ) )* ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:382:2: ( ( ({...}? => ( ({...}? => ( (lv_settings_4_0= ruleSSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'entityname=' ( (lv_entityname_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cached_7_0= 'cached' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'prefix' ( (lv_prefix_9_0= RULE_ID ) ) otherlv_10= ';' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getSTableAccess().getUnorderedGroup_3());
            	
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:385:2: ( ( ({...}? => ( ({...}? => ( (lv_settings_4_0= ruleSSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'entityname=' ( (lv_entityname_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cached_7_0= 'cached' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'prefix' ( (lv_prefix_9_0= RULE_ID ) ) otherlv_10= ';' ) ) ) ) )* )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:386:3: ( ({...}? => ( ({...}? => ( (lv_settings_4_0= ruleSSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'entityname=' ( (lv_entityname_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cached_7_0= 'cached' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'prefix' ( (lv_prefix_9_0= RULE_ID ) ) otherlv_10= ';' ) ) ) ) )*
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:386:3: ( ({...}? => ( ({...}? => ( (lv_settings_4_0= ruleSSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'entityname=' ( (lv_entityname_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cached_7_0= 'cached' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'prefix' ( (lv_prefix_9_0= RULE_ID ) ) otherlv_10= ';' ) ) ) ) )*
            loop5:
            do {
                int alt5=5;
                int LA5_0 = input.LA(1);

                if ( LA5_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 0) ) {
                    alt5=1;
                }
                else if ( LA5_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 1) ) {
                    alt5=2;
                }
                else if ( LA5_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 2) ) {
                    alt5=3;
                }
                else if ( LA5_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 3) ) {
                    alt5=4;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:388:4: ({...}? => ( ({...}? => ( (lv_settings_4_0= ruleSSettings ) ) ) ) )
            	    {
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:388:4: ({...}? => ( ({...}? => ( (lv_settings_4_0= ruleSSettings ) ) ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:389:5: {...}? => ( ({...}? => ( (lv_settings_4_0= ruleSSettings ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:389:103: ( ({...}? => ( (lv_settings_4_0= ruleSSettings ) ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:390:6: ({...}? => ( (lv_settings_4_0= ruleSSettings ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:393:6: ({...}? => ( (lv_settings_4_0= ruleSSettings ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:393:7: {...}? => ( (lv_settings_4_0= ruleSSettings ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSTable", "true");
            	    }
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:393:16: ( (lv_settings_4_0= ruleSSettings ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:394:1: (lv_settings_4_0= ruleSSettings )
            	    {
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:394:1: (lv_settings_4_0= ruleSSettings )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:395:3: lv_settings_4_0= ruleSSettings
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSTableAccess().getSettingsSSettingsParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSSettings_in_ruleSTable895);
            	    lv_settings_4_0=ruleSSettings();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSTableRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"settings",
            	            		lv_settings_4_0, 
            	            		"SSettings");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSTableAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:418:4: ({...}? => ( ({...}? => (otherlv_5= 'entityname=' ( (lv_entityname_6_0= RULE_ID ) ) ) ) ) )
            	    {
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:418:4: ({...}? => ( ({...}? => (otherlv_5= 'entityname=' ( (lv_entityname_6_0= RULE_ID ) ) ) ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:419:5: {...}? => ( ({...}? => (otherlv_5= 'entityname=' ( (lv_entityname_6_0= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:419:103: ( ({...}? => (otherlv_5= 'entityname=' ( (lv_entityname_6_0= RULE_ID ) ) ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:420:6: ({...}? => (otherlv_5= 'entityname=' ( (lv_entityname_6_0= RULE_ID ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:423:6: ({...}? => (otherlv_5= 'entityname=' ( (lv_entityname_6_0= RULE_ID ) ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:423:7: {...}? => (otherlv_5= 'entityname=' ( (lv_entityname_6_0= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSTable", "true");
            	    }
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:423:16: (otherlv_5= 'entityname=' ( (lv_entityname_6_0= RULE_ID ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:423:18: otherlv_5= 'entityname=' ( (lv_entityname_6_0= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleSTable962); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSTableAccess().getEntitynameKeyword_3_1_0());
            	        
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:427:1: ( (lv_entityname_6_0= RULE_ID ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:428:1: (lv_entityname_6_0= RULE_ID )
            	    {
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:428:1: (lv_entityname_6_0= RULE_ID )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:429:3: lv_entityname_6_0= RULE_ID
            	    {
            	    lv_entityname_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSTable979); 

            	    			newLeafNode(lv_entityname_6_0, grammarAccess.getSTableAccess().getEntitynameIDTerminalRuleCall_3_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSTableRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"entityname",
            	            		lv_entityname_6_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSTableAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:452:4: ({...}? => ( ({...}? => ( (lv_cached_7_0= 'cached' ) ) ) ) )
            	    {
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:452:4: ({...}? => ( ({...}? => ( (lv_cached_7_0= 'cached' ) ) ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:453:5: {...}? => ( ({...}? => ( (lv_cached_7_0= 'cached' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:453:103: ( ({...}? => ( (lv_cached_7_0= 'cached' ) ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:454:6: ({...}? => ( (lv_cached_7_0= 'cached' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:457:6: ({...}? => ( (lv_cached_7_0= 'cached' ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:457:7: {...}? => ( (lv_cached_7_0= 'cached' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSTable", "true");
            	    }
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:457:16: ( (lv_cached_7_0= 'cached' ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:458:1: (lv_cached_7_0= 'cached' )
            	    {
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:458:1: (lv_cached_7_0= 'cached' )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:459:3: lv_cached_7_0= 'cached'
            	    {
            	    lv_cached_7_0=(Token)match(input,20,FOLLOW_20_in_ruleSTable1057); 

            	            newLeafNode(lv_cached_7_0, grammarAccess.getSTableAccess().getCachedCachedKeyword_3_2_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSTableRule());
            	    	        }
            	           		setWithLastConsumed(current, "cached", true, "cached");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSTableAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:479:4: ({...}? => ( ({...}? => (otherlv_8= 'prefix' ( (lv_prefix_9_0= RULE_ID ) ) otherlv_10= ';' ) ) ) )
            	    {
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:479:4: ({...}? => ( ({...}? => (otherlv_8= 'prefix' ( (lv_prefix_9_0= RULE_ID ) ) otherlv_10= ';' ) ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:480:5: {...}? => ( ({...}? => (otherlv_8= 'prefix' ( (lv_prefix_9_0= RULE_ID ) ) otherlv_10= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSTable", "getUnorderedGroupHelper().canSelect(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:480:103: ( ({...}? => (otherlv_8= 'prefix' ( (lv_prefix_9_0= RULE_ID ) ) otherlv_10= ';' ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:481:6: ({...}? => (otherlv_8= 'prefix' ( (lv_prefix_9_0= RULE_ID ) ) otherlv_10= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:484:6: ({...}? => (otherlv_8= 'prefix' ( (lv_prefix_9_0= RULE_ID ) ) otherlv_10= ';' ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:484:7: {...}? => (otherlv_8= 'prefix' ( (lv_prefix_9_0= RULE_ID ) ) otherlv_10= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSTable", "true");
            	    }
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:484:16: (otherlv_8= 'prefix' ( (lv_prefix_9_0= RULE_ID ) ) otherlv_10= ';' )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:484:18: otherlv_8= 'prefix' ( (lv_prefix_9_0= RULE_ID ) ) otherlv_10= ';'
            	    {
            	    otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleSTable1137); 

            	        	newLeafNode(otherlv_8, grammarAccess.getSTableAccess().getPrefixKeyword_3_3_0());
            	        
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:488:1: ( (lv_prefix_9_0= RULE_ID ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:489:1: (lv_prefix_9_0= RULE_ID )
            	    {
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:489:1: (lv_prefix_9_0= RULE_ID )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:490:3: lv_prefix_9_0= RULE_ID
            	    {
            	    lv_prefix_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSTable1154); 

            	    			newLeafNode(lv_prefix_9_0, grammarAccess.getSTableAccess().getPrefixIDTerminalRuleCall_3_3_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSTableRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"prefix",
            	            		lv_prefix_9_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    otherlv_10=(Token)match(input,22,FOLLOW_22_in_ruleSTable1171); 

            	        	newLeafNode(otherlv_10, grammarAccess.getSTableAccess().getSemicolonKeyword_3_3_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSTableAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getSTableAccess().getUnorderedGroup_3());
            	

            }

            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:524:2: ( (lv_columns_11_0= ruleSTableMember ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=23 && LA6_0<=24)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:525:1: (lv_columns_11_0= ruleSTableMember )
            	    {
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:525:1: (lv_columns_11_0= ruleSTableMember )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:526:3: lv_columns_11_0= ruleSTableMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSTableAccess().getColumnsSTableMemberParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSTableMember_in_ruleSTable1233);
            	    lv_columns_11_0=ruleSTableMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSTableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"columns",
            	            		lv_columns_11_0, 
            	            		"STableMember");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleSTable1246); 

                	newLeafNode(otherlv_12, grammarAccess.getSTableAccess().getRightCurlyBracketKeyword_5());
                

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


    // $ANTLR start "entryRuleSTableMember"
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:554:1: entryRuleSTableMember returns [EObject current=null] : iv_ruleSTableMember= ruleSTableMember EOF ;
    public final EObject entryRuleSTableMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSTableMember = null;


        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:555:2: (iv_ruleSTableMember= ruleSTableMember EOF )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:556:2: iv_ruleSTableMember= ruleSTableMember EOF
            {
             newCompositeNode(grammarAccess.getSTableMemberRule()); 
            pushFollow(FOLLOW_ruleSTableMember_in_entryRuleSTableMember1282);
            iv_ruleSTableMember=ruleSTableMember();

            state._fsp--;

             current =iv_ruleSTableMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSTableMember1292); 

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
    // $ANTLR end "entryRuleSTableMember"


    // $ANTLR start "ruleSTableMember"
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:563:1: ruleSTableMember returns [EObject current=null] : (this_SColumn_0= ruleSColumn | this_SJoinColumn_1= ruleSJoinColumn ) ;
    public final EObject ruleSTableMember() throws RecognitionException {
        EObject current = null;

        EObject this_SColumn_0 = null;

        EObject this_SJoinColumn_1 = null;


         enterRule(); 
            
        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:566:28: ( (this_SColumn_0= ruleSColumn | this_SJoinColumn_1= ruleSJoinColumn ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:567:1: (this_SColumn_0= ruleSColumn | this_SJoinColumn_1= ruleSJoinColumn )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:567:1: (this_SColumn_0= ruleSColumn | this_SJoinColumn_1= ruleSJoinColumn )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            else if ( (LA7_0==24) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:568:5: this_SColumn_0= ruleSColumn
                    {
                     
                            newCompositeNode(grammarAccess.getSTableMemberAccess().getSColumnParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSColumn_in_ruleSTableMember1339);
                    this_SColumn_0=ruleSColumn();

                    state._fsp--;

                     
                            current = this_SColumn_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:578:5: this_SJoinColumn_1= ruleSJoinColumn
                    {
                     
                            newCompositeNode(grammarAccess.getSTableMemberAccess().getSJoinColumnParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSJoinColumn_in_ruleSTableMember1366);
                    this_SJoinColumn_1=ruleSJoinColumn();

                    state._fsp--;

                     
                            current = this_SJoinColumn_1; 
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
    // $ANTLR end "ruleSTableMember"


    // $ANTLR start "entryRuleSColumn"
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:594:1: entryRuleSColumn returns [EObject current=null] : iv_ruleSColumn= ruleSColumn EOF ;
    public final EObject entryRuleSColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSColumn = null;


        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:595:2: (iv_ruleSColumn= ruleSColumn EOF )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:596:2: iv_ruleSColumn= ruleSColumn EOF
            {
             newCompositeNode(grammarAccess.getSColumnRule()); 
            pushFollow(FOLLOW_ruleSColumn_in_entryRuleSColumn1401);
            iv_ruleSColumn=ruleSColumn();

            state._fsp--;

             current =iv_ruleSColumn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSColumn1411); 

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
    // $ANTLR end "entryRuleSColumn"


    // $ANTLR start "ruleSColumn"
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:603:1: ruleSColumn returns [EObject current=null] : (otherlv_0= 'column' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ruleLFQN ) ) | ( (lv_inlinedType_3_0= ruleSInlinedSQLType ) ) | ( (lv_simpleType_4_0= ruleSSimpleTypes ) ) ) ( (lv_props_5_0= ruleSColumnProps ) )? otherlv_6= ';' ) ;
    public final EObject ruleSColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_6=null;
        EObject lv_inlinedType_3_0 = null;

        Enumerator lv_simpleType_4_0 = null;

        EObject lv_props_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:606:28: ( (otherlv_0= 'column' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ruleLFQN ) ) | ( (lv_inlinedType_3_0= ruleSInlinedSQLType ) ) | ( (lv_simpleType_4_0= ruleSSimpleTypes ) ) ) ( (lv_props_5_0= ruleSColumnProps ) )? otherlv_6= ';' ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:607:1: (otherlv_0= 'column' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ruleLFQN ) ) | ( (lv_inlinedType_3_0= ruleSInlinedSQLType ) ) | ( (lv_simpleType_4_0= ruleSSimpleTypes ) ) ) ( (lv_props_5_0= ruleSColumnProps ) )? otherlv_6= ';' )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:607:1: (otherlv_0= 'column' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ruleLFQN ) ) | ( (lv_inlinedType_3_0= ruleSInlinedSQLType ) ) | ( (lv_simpleType_4_0= ruleSSimpleTypes ) ) ) ( (lv_props_5_0= ruleSColumnProps ) )? otherlv_6= ';' )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:607:3: otherlv_0= 'column' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ruleLFQN ) ) | ( (lv_inlinedType_3_0= ruleSInlinedSQLType ) ) | ( (lv_simpleType_4_0= ruleSSimpleTypes ) ) ) ( (lv_props_5_0= ruleSColumnProps ) )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleSColumn1448); 

                	newLeafNode(otherlv_0, grammarAccess.getSColumnAccess().getColumnKeyword_0());
                
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:611:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:612:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:612:1: (lv_name_1_0= RULE_ID )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:613:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSColumn1465); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSColumnAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSColumnRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:629:2: ( ( ( ruleLFQN ) ) | ( (lv_inlinedType_3_0= ruleSInlinedSQLType ) ) | ( (lv_simpleType_4_0= ruleSSimpleTypes ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt8=1;
                }
                break;
            case 32:
            case 34:
                {
                alt8=2;
                }
                break;
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
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
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:629:3: ( ( ruleLFQN ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:629:3: ( ( ruleLFQN ) )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:630:1: ( ruleLFQN )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:630:1: ( ruleLFQN )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:631:3: ruleLFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSColumnRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSColumnAccess().getExtTypeSExtDeclaredSQLTypeCrossReference_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLFQN_in_ruleSColumn1494);
                    ruleLFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:645:6: ( (lv_inlinedType_3_0= ruleSInlinedSQLType ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:645:6: ( (lv_inlinedType_3_0= ruleSInlinedSQLType ) )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:646:1: (lv_inlinedType_3_0= ruleSInlinedSQLType )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:646:1: (lv_inlinedType_3_0= ruleSInlinedSQLType )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:647:3: lv_inlinedType_3_0= ruleSInlinedSQLType
                    {
                     
                    	        newCompositeNode(grammarAccess.getSColumnAccess().getInlinedTypeSInlinedSQLTypeParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSInlinedSQLType_in_ruleSColumn1521);
                    lv_inlinedType_3_0=ruleSInlinedSQLType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSColumnRule());
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
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:664:6: ( (lv_simpleType_4_0= ruleSSimpleTypes ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:664:6: ( (lv_simpleType_4_0= ruleSSimpleTypes ) )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:665:1: (lv_simpleType_4_0= ruleSSimpleTypes )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:665:1: (lv_simpleType_4_0= ruleSSimpleTypes )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:666:3: lv_simpleType_4_0= ruleSSimpleTypes
                    {
                     
                    	        newCompositeNode(grammarAccess.getSColumnAccess().getSimpleTypeSSimpleTypesEnumRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSSimpleTypes_in_ruleSColumn1548);
                    lv_simpleType_4_0=ruleSSimpleTypes();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSColumnRule());
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

            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:682:3: ( (lv_props_5_0= ruleSColumnProps ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:683:1: (lv_props_5_0= ruleSColumnProps )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:683:1: (lv_props_5_0= ruleSColumnProps )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:684:3: lv_props_5_0= ruleSColumnProps
                    {
                     
                    	        newCompositeNode(grammarAccess.getSColumnAccess().getPropsSColumnPropsParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSColumnProps_in_ruleSColumn1570);
                    lv_props_5_0=ruleSColumnProps();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSColumnRule());
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

            otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleSColumn1583); 

                	newLeafNode(otherlv_6, grammarAccess.getSColumnAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleSColumn"


    // $ANTLR start "entryRuleSJoinColumn"
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:712:1: entryRuleSJoinColumn returns [EObject current=null] : iv_ruleSJoinColumn= ruleSJoinColumn EOF ;
    public final EObject entryRuleSJoinColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSJoinColumn = null;


        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:713:2: (iv_ruleSJoinColumn= ruleSJoinColumn EOF )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:714:2: iv_ruleSJoinColumn= ruleSJoinColumn EOF
            {
             newCompositeNode(grammarAccess.getSJoinColumnRule()); 
            pushFollow(FOLLOW_ruleSJoinColumn_in_entryRuleSJoinColumn1619);
            iv_ruleSJoinColumn=ruleSJoinColumn();

            state._fsp--;

             current =iv_ruleSJoinColumn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSJoinColumn1629); 

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
    // $ANTLR end "entryRuleSJoinColumn"


    // $ANTLR start "ruleSJoinColumn"
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:721:1: ruleSJoinColumn returns [EObject current=null] : (otherlv_0= 'joincolumn' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleLFQN ) ) ( (lv_props_3_0= ruleSColumnProps ) )? otherlv_4= ';' ) ;
    public final EObject ruleSJoinColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_4=null;
        EObject lv_props_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:724:28: ( (otherlv_0= 'joincolumn' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleLFQN ) ) ( (lv_props_3_0= ruleSColumnProps ) )? otherlv_4= ';' ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:725:1: (otherlv_0= 'joincolumn' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleLFQN ) ) ( (lv_props_3_0= ruleSColumnProps ) )? otherlv_4= ';' )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:725:1: (otherlv_0= 'joincolumn' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleLFQN ) ) ( (lv_props_3_0= ruleSColumnProps ) )? otherlv_4= ';' )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:725:3: otherlv_0= 'joincolumn' ( (lv_name_1_0= RULE_ID ) ) ( ( ruleLFQN ) ) ( (lv_props_3_0= ruleSColumnProps ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleSJoinColumn1666); 

                	newLeafNode(otherlv_0, grammarAccess.getSJoinColumnAccess().getJoincolumnKeyword_0());
                
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:729:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:730:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:730:1: (lv_name_1_0= RULE_ID )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:731:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSJoinColumn1683); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSJoinColumnAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSJoinColumnRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:747:2: ( ( ruleLFQN ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:748:1: ( ruleLFQN )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:748:1: ( ruleLFQN )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:749:3: ruleLFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSJoinColumnRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getSJoinColumnAccess().getReferencedTypeSTableCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleLFQN_in_ruleSJoinColumn1711);
            ruleLFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:762:2: ( (lv_props_3_0= ruleSColumnProps ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:763:1: (lv_props_3_0= ruleSColumnProps )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:763:1: (lv_props_3_0= ruleSColumnProps )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:764:3: lv_props_3_0= ruleSColumnProps
                    {
                     
                    	        newCompositeNode(grammarAccess.getSJoinColumnAccess().getPropsSColumnPropsParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSColumnProps_in_ruleSJoinColumn1732);
                    lv_props_3_0=ruleSColumnProps();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSJoinColumnRule());
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

            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleSJoinColumn1745); 

                	newLeafNode(otherlv_4, grammarAccess.getSJoinColumnAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleSJoinColumn"


    // $ANTLR start "entryRuleSColumnProps"
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:792:1: entryRuleSColumnProps returns [EObject current=null] : iv_ruleSColumnProps= ruleSColumnProps EOF ;
    public final EObject entryRuleSColumnProps() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSColumnProps = null;


        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:793:2: (iv_ruleSColumnProps= ruleSColumnProps EOF )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:794:2: iv_ruleSColumnProps= ruleSColumnProps EOF
            {
             newCompositeNode(grammarAccess.getSColumnPropsRule()); 
            pushFollow(FOLLOW_ruleSColumnProps_in_entryRuleSColumnProps1781);
            iv_ruleSColumnProps=ruleSColumnProps();

            state._fsp--;

             current =iv_ruleSColumnProps; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSColumnProps1791); 

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
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:801:1: ruleSColumnProps returns [EObject current=null] : ( () otherlv_1= 'with' ( ( ( ( ({...}? => ( ({...}? => ( (lv_nullable_3_0= 'nullable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_aes_4_0= 'AES' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'javacolumn=' ( (lv_javacolumn_8_0= RULE_ID ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleSColumnProps() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_nullable_3_0=null;
        Token lv_aes_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_javacolumn_8_0=null;
        Enumerator lv_index_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:804:28: ( ( () otherlv_1= 'with' ( ( ( ( ({...}? => ( ({...}? => ( (lv_nullable_3_0= 'nullable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_aes_4_0= 'AES' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'javacolumn=' ( (lv_javacolumn_8_0= RULE_ID ) ) ) ) ) ) )* ) ) ) ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:805:1: ( () otherlv_1= 'with' ( ( ( ( ({...}? => ( ({...}? => ( (lv_nullable_3_0= 'nullable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_aes_4_0= 'AES' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'javacolumn=' ( (lv_javacolumn_8_0= RULE_ID ) ) ) ) ) ) )* ) ) ) )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:805:1: ( () otherlv_1= 'with' ( ( ( ( ({...}? => ( ({...}? => ( (lv_nullable_3_0= 'nullable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_aes_4_0= 'AES' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'javacolumn=' ( (lv_javacolumn_8_0= RULE_ID ) ) ) ) ) ) )* ) ) ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:805:2: () otherlv_1= 'with' ( ( ( ( ({...}? => ( ({...}? => ( (lv_nullable_3_0= 'nullable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_aes_4_0= 'AES' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'javacolumn=' ( (lv_javacolumn_8_0= RULE_ID ) ) ) ) ) ) )* ) ) )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:805:2: ()
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:806:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSColumnPropsAccess().getSColumnPropsAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleSColumnProps1837); 

                	newLeafNode(otherlv_1, grammarAccess.getSColumnPropsAccess().getWithKeyword_1());
                
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:815:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_nullable_3_0= 'nullable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_aes_4_0= 'AES' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'javacolumn=' ( (lv_javacolumn_8_0= RULE_ID ) ) ) ) ) ) )* ) ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:817:1: ( ( ( ({...}? => ( ({...}? => ( (lv_nullable_3_0= 'nullable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_aes_4_0= 'AES' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'javacolumn=' ( (lv_javacolumn_8_0= RULE_ID ) ) ) ) ) ) )* ) )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:817:1: ( ( ( ({...}? => ( ({...}? => ( (lv_nullable_3_0= 'nullable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_aes_4_0= 'AES' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'javacolumn=' ( (lv_javacolumn_8_0= RULE_ID ) ) ) ) ) ) )* ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:818:2: ( ( ({...}? => ( ({...}? => ( (lv_nullable_3_0= 'nullable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_aes_4_0= 'AES' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'javacolumn=' ( (lv_javacolumn_8_0= RULE_ID ) ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2());
            	
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:821:2: ( ( ({...}? => ( ({...}? => ( (lv_nullable_3_0= 'nullable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_aes_4_0= 'AES' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'javacolumn=' ( (lv_javacolumn_8_0= RULE_ID ) ) ) ) ) ) )* )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:822:3: ( ({...}? => ( ({...}? => ( (lv_nullable_3_0= 'nullable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_aes_4_0= 'AES' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'javacolumn=' ( (lv_javacolumn_8_0= RULE_ID ) ) ) ) ) ) )*
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:822:3: ( ({...}? => ( ({...}? => ( (lv_nullable_3_0= 'nullable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_aes_4_0= 'AES' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'javacolumn=' ( (lv_javacolumn_8_0= RULE_ID ) ) ) ) ) ) )*
            loop11:
            do {
                int alt11=5;
                int LA11_0 = input.LA(1);

                if ( LA11_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 0) ) {
                    alt11=1;
                }
                else if ( LA11_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 1) ) {
                    alt11=2;
                }
                else if ( LA11_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 2) ) {
                    alt11=3;
                }
                else if ( LA11_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 3) ) {
                    alt11=4;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:824:4: ({...}? => ( ({...}? => ( (lv_nullable_3_0= 'nullable' ) ) ) ) )
            	    {
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:824:4: ({...}? => ( ({...}? => ( (lv_nullable_3_0= 'nullable' ) ) ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:825:5: {...}? => ( ({...}? => ( (lv_nullable_3_0= 'nullable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSColumnProps", "getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:825:109: ( ({...}? => ( (lv_nullable_3_0= 'nullable' ) ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:826:6: ({...}? => ( (lv_nullable_3_0= 'nullable' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:829:6: ({...}? => ( (lv_nullable_3_0= 'nullable' ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:829:7: {...}? => ( (lv_nullable_3_0= 'nullable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSColumnProps", "true");
            	    }
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:829:16: ( (lv_nullable_3_0= 'nullable' ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:830:1: (lv_nullable_3_0= 'nullable' )
            	    {
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:830:1: (lv_nullable_3_0= 'nullable' )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:831:3: lv_nullable_3_0= 'nullable'
            	    {
            	    lv_nullable_3_0=(Token)match(input,26,FOLLOW_26_in_ruleSColumnProps1900); 

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
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:851:4: ({...}? => ( ({...}? => ( (lv_aes_4_0= 'AES' ) ) ) ) )
            	    {
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:851:4: ({...}? => ( ({...}? => ( (lv_aes_4_0= 'AES' ) ) ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:852:5: {...}? => ( ({...}? => ( (lv_aes_4_0= 'AES' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSColumnProps", "getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:852:109: ( ({...}? => ( (lv_aes_4_0= 'AES' ) ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:853:6: ({...}? => ( (lv_aes_4_0= 'AES' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:856:6: ({...}? => ( (lv_aes_4_0= 'AES' ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:856:7: {...}? => ( (lv_aes_4_0= 'AES' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSColumnProps", "true");
            	    }
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:856:16: ( (lv_aes_4_0= 'AES' ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:857:1: (lv_aes_4_0= 'AES' )
            	    {
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:857:1: (lv_aes_4_0= 'AES' )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:858:3: lv_aes_4_0= 'AES'
            	    {
            	    lv_aes_4_0=(Token)match(input,27,FOLLOW_27_in_ruleSColumnProps1985); 

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
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:878:4: ({...}? => ( ({...}? => (otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) ) ) ) ) )
            	    {
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:878:4: ({...}? => ( ({...}? => (otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) ) ) ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:879:5: {...}? => ( ({...}? => (otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSColumnProps", "getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:879:109: ( ({...}? => (otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) ) ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:880:6: ({...}? => (otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:883:6: ({...}? => (otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:883:7: {...}? => (otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSColumnProps", "true");
            	    }
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:883:16: (otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:883:18: otherlv_5= 'index=' ( (lv_index_6_0= ruleSIndex ) )
            	    {
            	    otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleSColumnProps2065); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSColumnPropsAccess().getIndexKeyword_2_2_0());
            	        
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:887:1: ( (lv_index_6_0= ruleSIndex ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:888:1: (lv_index_6_0= ruleSIndex )
            	    {
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:888:1: (lv_index_6_0= ruleSIndex )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:889:3: lv_index_6_0= ruleSIndex
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSColumnPropsAccess().getIndexSIndexEnumRuleCall_2_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSIndex_in_ruleSColumnProps2086);
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
            	case 4 :
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:912:4: ({...}? => ( ({...}? => (otherlv_7= 'javacolumn=' ( (lv_javacolumn_8_0= RULE_ID ) ) ) ) ) )
            	    {
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:912:4: ({...}? => ( ({...}? => (otherlv_7= 'javacolumn=' ( (lv_javacolumn_8_0= RULE_ID ) ) ) ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:913:5: {...}? => ( ({...}? => (otherlv_7= 'javacolumn=' ( (lv_javacolumn_8_0= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSColumnProps", "getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:913:109: ( ({...}? => (otherlv_7= 'javacolumn=' ( (lv_javacolumn_8_0= RULE_ID ) ) ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:914:6: ({...}? => (otherlv_7= 'javacolumn=' ( (lv_javacolumn_8_0= RULE_ID ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:917:6: ({...}? => (otherlv_7= 'javacolumn=' ( (lv_javacolumn_8_0= RULE_ID ) ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:917:7: {...}? => (otherlv_7= 'javacolumn=' ( (lv_javacolumn_8_0= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSColumnProps", "true");
            	    }
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:917:16: (otherlv_7= 'javacolumn=' ( (lv_javacolumn_8_0= RULE_ID ) ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:917:18: otherlv_7= 'javacolumn=' ( (lv_javacolumn_8_0= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleSColumnProps2154); 

            	        	newLeafNode(otherlv_7, grammarAccess.getSColumnPropsAccess().getJavacolumnKeyword_2_3_0());
            	        
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:921:1: ( (lv_javacolumn_8_0= RULE_ID ) )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:922:1: (lv_javacolumn_8_0= RULE_ID )
            	    {
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:922:1: (lv_javacolumn_8_0= RULE_ID )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:923:3: lv_javacolumn_8_0= RULE_ID
            	    {
            	    lv_javacolumn_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSColumnProps2171); 

            	    			newLeafNode(lv_javacolumn_8_0, grammarAccess.getSColumnPropsAccess().getJavacolumnIDTerminalRuleCall_2_3_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSColumnPropsRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"javacolumn",
            	            		lv_javacolumn_8_0, 
            	            		"ID");
            	    	    

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
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:963:1: entryRuleSInlinedSQLType returns [EObject current=null] : iv_ruleSInlinedSQLType= ruleSInlinedSQLType EOF ;
    public final EObject entryRuleSInlinedSQLType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSInlinedSQLType = null;


        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:964:2: (iv_ruleSInlinedSQLType= ruleSInlinedSQLType EOF )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:965:2: iv_ruleSInlinedSQLType= ruleSInlinedSQLType EOF
            {
             newCompositeNode(grammarAccess.getSInlinedSQLTypeRule()); 
            pushFollow(FOLLOW_ruleSInlinedSQLType_in_entryRuleSInlinedSQLType2255);
            iv_ruleSInlinedSQLType=ruleSInlinedSQLType();

            state._fsp--;

             current =iv_ruleSInlinedSQLType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSInlinedSQLType2265); 

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
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:972:1: ruleSInlinedSQLType returns [EObject current=null] : (this_SString_0= ruleSString | this_SDecimal_1= ruleSDecimal ) ;
    public final EObject ruleSInlinedSQLType() throws RecognitionException {
        EObject current = null;

        EObject this_SString_0 = null;

        EObject this_SDecimal_1 = null;


         enterRule(); 
            
        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:975:28: ( (this_SString_0= ruleSString | this_SDecimal_1= ruleSDecimal ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:976:1: (this_SString_0= ruleSString | this_SDecimal_1= ruleSDecimal )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:976:1: (this_SString_0= ruleSString | this_SDecimal_1= ruleSDecimal )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            else if ( (LA12_0==34) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:977:5: this_SString_0= ruleSString
                    {
                     
                            newCompositeNode(grammarAccess.getSInlinedSQLTypeAccess().getSStringParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSString_in_ruleSInlinedSQLType2312);
                    this_SString_0=ruleSString();

                    state._fsp--;

                     
                            current = this_SString_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:987:5: this_SDecimal_1= ruleSDecimal
                    {
                     
                            newCompositeNode(grammarAccess.getSInlinedSQLTypeAccess().getSDecimalParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSDecimal_in_ruleSInlinedSQLType2339);
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
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1003:1: entryRuleSEnum returns [EObject current=null] : iv_ruleSEnum= ruleSEnum EOF ;
    public final EObject entryRuleSEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSEnum = null;


        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1004:2: (iv_ruleSEnum= ruleSEnum EOF )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1005:2: iv_ruleSEnum= ruleSEnum EOF
            {
             newCompositeNode(grammarAccess.getSEnumRule()); 
            pushFollow(FOLLOW_ruleSEnum_in_entryRuleSEnum2374);
            iv_ruleSEnum=ruleSEnum();

            state._fsp--;

             current =iv_ruleSEnum; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSEnum2384); 

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
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1012:1: ruleSEnum returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleSEnumLiteral ) )* otherlv_4= '}' ) ;
    public final EObject ruleSEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_literals_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1015:28: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleSEnumLiteral ) )* otherlv_4= '}' ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1016:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleSEnumLiteral ) )* otherlv_4= '}' )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1016:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleSEnumLiteral ) )* otherlv_4= '}' )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1016:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleSEnumLiteral ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleSEnum2421); 

                	newLeafNode(otherlv_0, grammarAccess.getSEnumAccess().getEnumKeyword_0());
                
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1020:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1021:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1021:1: (lv_name_1_0= RULE_ID )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1022:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSEnum2438); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleSEnum2455); 

                	newLeafNode(otherlv_2, grammarAccess.getSEnumAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1042:1: ( (lv_literals_3_0= ruleSEnumLiteral ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1043:1: (lv_literals_3_0= ruleSEnumLiteral )
            	    {
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1043:1: (lv_literals_3_0= ruleSEnumLiteral )
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1044:3: lv_literals_3_0= ruleSEnumLiteral
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSEnumAccess().getLiteralsSEnumLiteralParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSEnumLiteral_in_ruleSEnum2476);
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

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleSEnum2489); 

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
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1072:1: entryRuleSEnumLiteral returns [EObject current=null] : iv_ruleSEnumLiteral= ruleSEnumLiteral EOF ;
    public final EObject entryRuleSEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSEnumLiteral = null;


        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1073:2: (iv_ruleSEnumLiteral= ruleSEnumLiteral EOF )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1074:2: iv_ruleSEnumLiteral= ruleSEnumLiteral EOF
            {
             newCompositeNode(grammarAccess.getSEnumLiteralRule()); 
            pushFollow(FOLLOW_ruleSEnumLiteral_in_entryRuleSEnumLiteral2525);
            iv_ruleSEnumLiteral=ruleSEnumLiteral();

            state._fsp--;

             current =iv_ruleSEnumLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSEnumLiteral2535); 

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
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1081:1: ruleSEnumLiteral returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleSEnumLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1084:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1085:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1085:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1085:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1085:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1086:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1086:1: (lv_name_0_0= RULE_ID )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1087:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSEnumLiteral2577); 

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

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleSEnumLiteral2594); 

                	newLeafNode(otherlv_1, grammarAccess.getSEnumLiteralAccess().getEqualsSignKeyword_1());
                
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1107:1: ( (lv_value_2_0= RULE_INT ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1108:1: (lv_value_2_0= RULE_INT )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1108:1: (lv_value_2_0= RULE_INT )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1109:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSEnumLiteral2611); 

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
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1133:1: entryRuleSString returns [EObject current=null] : iv_ruleSString= ruleSString EOF ;
    public final EObject entryRuleSString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSString = null;


        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1134:2: (iv_ruleSString= ruleSString EOF )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1135:2: iv_ruleSString= ruleSString EOF
            {
             newCompositeNode(grammarAccess.getSStringRule()); 
            pushFollow(FOLLOW_ruleSString_in_entryRuleSString2652);
            iv_ruleSString=ruleSString();

            state._fsp--;

             current =iv_ruleSString; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSString2662); 

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
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1142:1: ruleSString returns [EObject current=null] : (otherlv_0= 'String(' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= ')' ) ;
    public final EObject ruleSString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1145:28: ( (otherlv_0= 'String(' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= ')' ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1146:1: (otherlv_0= 'String(' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= ')' )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1146:1: (otherlv_0= 'String(' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= ')' )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1146:3: otherlv_0= 'String(' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleSString2699); 

                	newLeafNode(otherlv_0, grammarAccess.getSStringAccess().getStringKeyword_0());
                
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1150:1: ( (lv_value_1_0= RULE_INT ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1151:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1151:1: (lv_value_1_0= RULE_INT )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1152:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSString2716); 

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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleSString2733); 

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
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1180:1: entryRuleSDecimal returns [EObject current=null] : iv_ruleSDecimal= ruleSDecimal EOF ;
    public final EObject entryRuleSDecimal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDecimal = null;


        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1181:2: (iv_ruleSDecimal= ruleSDecimal EOF )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1182:2: iv_ruleSDecimal= ruleSDecimal EOF
            {
             newCompositeNode(grammarAccess.getSDecimalRule()); 
            pushFollow(FOLLOW_ruleSDecimal_in_entryRuleSDecimal2769);
            iv_ruleSDecimal=ruleSDecimal();

            state._fsp--;

             current =iv_ruleSDecimal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSDecimal2779); 

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
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1189:1: ruleSDecimal returns [EObject current=null] : (otherlv_0= 'Decimal(' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= ')' ) ;
    public final EObject ruleSDecimal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1192:28: ( (otherlv_0= 'Decimal(' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= ')' ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1193:1: (otherlv_0= 'Decimal(' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= ')' )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1193:1: (otherlv_0= 'Decimal(' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= ')' )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1193:3: otherlv_0= 'Decimal(' ( (lv_value_1_0= RULE_INT ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleSDecimal2816); 

                	newLeafNode(otherlv_0, grammarAccess.getSDecimalAccess().getDecimalKeyword_0());
                
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1197:1: ( (lv_value_1_0= RULE_INT ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1198:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1198:1: (lv_value_1_0= RULE_INT )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1199:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSDecimal2833); 

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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleSDecimal2850); 

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


    // $ANTLR start "entryRuleLFQN"
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1227:1: entryRuleLFQN returns [String current=null] : iv_ruleLFQN= ruleLFQN EOF ;
    public final String entryRuleLFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLFQN = null;


        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1228:2: (iv_ruleLFQN= ruleLFQN EOF )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1229:2: iv_ruleLFQN= ruleLFQN EOF
            {
             newCompositeNode(grammarAccess.getLFQNRule()); 
            pushFollow(FOLLOW_ruleLFQN_in_entryRuleLFQN2887);
            iv_ruleLFQN=ruleLFQN();

            state._fsp--;

             current =iv_ruleLFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLFQN2898); 

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
    // $ANTLR end "entryRuleLFQN"


    // $ANTLR start "ruleLFQN"
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1236:1: ruleLFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleLFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1239:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1240:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1240:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1240:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLFQN2938); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getLFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1247:1: (kw= '.' this_ID_2= RULE_ID )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==35) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1248:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,35,FOLLOW_35_in_ruleLFQN2957); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getLFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLFQN2972); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getLFQNAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // $ANTLR end "ruleLFQN"


    // $ANTLR start "ruleSDBEngine"
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1268:1: ruleSDBEngine returns [Enumerator current=null] : ( (enumLiteral_0= 'InnoDB' ) | (enumLiteral_1= 'MyISAM' ) ) ;
    public final Enumerator ruleSDBEngine() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1270:28: ( ( (enumLiteral_0= 'InnoDB' ) | (enumLiteral_1= 'MyISAM' ) ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1271:1: ( (enumLiteral_0= 'InnoDB' ) | (enumLiteral_1= 'MyISAM' ) )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1271:1: ( (enumLiteral_0= 'InnoDB' ) | (enumLiteral_1= 'MyISAM' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==36) ) {
                alt15=1;
            }
            else if ( (LA15_0==37) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1271:2: (enumLiteral_0= 'InnoDB' )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1271:2: (enumLiteral_0= 'InnoDB' )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1271:4: enumLiteral_0= 'InnoDB'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_36_in_ruleSDBEngine3033); 

                            current = grammarAccess.getSDBEngineAccess().getINNODBEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSDBEngineAccess().getINNODBEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1277:6: (enumLiteral_1= 'MyISAM' )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1277:6: (enumLiteral_1= 'MyISAM' )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1277:8: enumLiteral_1= 'MyISAM'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_37_in_ruleSDBEngine3050); 

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
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1287:1: ruleSSimpleTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'Int' ) | (enumLiteral_1= 'Tinyint' ) | (enumLiteral_2= 'Smallint' ) | (enumLiteral_3= 'Mediumint' ) | (enumLiteral_4= 'Boolean' ) | (enumLiteral_5= 'Blob' ) | (enumLiteral_6= 'Datetime' ) | (enumLiteral_7= 'Date' ) | (enumLiteral_8= 'Time' ) | (enumLiteral_9= 'Polygon' ) | (enumLiteral_10= 'Point' ) | (enumLiteral_11= 'Foto' ) | (enumLiteral_12= 'Currency' ) | (enumLiteral_13= 'Coordinate' ) ) ;
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
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1289:28: ( ( (enumLiteral_0= 'Int' ) | (enumLiteral_1= 'Tinyint' ) | (enumLiteral_2= 'Smallint' ) | (enumLiteral_3= 'Mediumint' ) | (enumLiteral_4= 'Boolean' ) | (enumLiteral_5= 'Blob' ) | (enumLiteral_6= 'Datetime' ) | (enumLiteral_7= 'Date' ) | (enumLiteral_8= 'Time' ) | (enumLiteral_9= 'Polygon' ) | (enumLiteral_10= 'Point' ) | (enumLiteral_11= 'Foto' ) | (enumLiteral_12= 'Currency' ) | (enumLiteral_13= 'Coordinate' ) ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1290:1: ( (enumLiteral_0= 'Int' ) | (enumLiteral_1= 'Tinyint' ) | (enumLiteral_2= 'Smallint' ) | (enumLiteral_3= 'Mediumint' ) | (enumLiteral_4= 'Boolean' ) | (enumLiteral_5= 'Blob' ) | (enumLiteral_6= 'Datetime' ) | (enumLiteral_7= 'Date' ) | (enumLiteral_8= 'Time' ) | (enumLiteral_9= 'Polygon' ) | (enumLiteral_10= 'Point' ) | (enumLiteral_11= 'Foto' ) | (enumLiteral_12= 'Currency' ) | (enumLiteral_13= 'Coordinate' ) )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1290:1: ( (enumLiteral_0= 'Int' ) | (enumLiteral_1= 'Tinyint' ) | (enumLiteral_2= 'Smallint' ) | (enumLiteral_3= 'Mediumint' ) | (enumLiteral_4= 'Boolean' ) | (enumLiteral_5= 'Blob' ) | (enumLiteral_6= 'Datetime' ) | (enumLiteral_7= 'Date' ) | (enumLiteral_8= 'Time' ) | (enumLiteral_9= 'Polygon' ) | (enumLiteral_10= 'Point' ) | (enumLiteral_11= 'Foto' ) | (enumLiteral_12= 'Currency' ) | (enumLiteral_13= 'Coordinate' ) )
            int alt16=14;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt16=1;
                }
                break;
            case 39:
                {
                alt16=2;
                }
                break;
            case 40:
                {
                alt16=3;
                }
                break;
            case 41:
                {
                alt16=4;
                }
                break;
            case 42:
                {
                alt16=5;
                }
                break;
            case 43:
                {
                alt16=6;
                }
                break;
            case 44:
                {
                alt16=7;
                }
                break;
            case 45:
                {
                alt16=8;
                }
                break;
            case 46:
                {
                alt16=9;
                }
                break;
            case 47:
                {
                alt16=10;
                }
                break;
            case 48:
                {
                alt16=11;
                }
                break;
            case 49:
                {
                alt16=12;
                }
                break;
            case 50:
                {
                alt16=13;
                }
                break;
            case 51:
                {
                alt16=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1290:2: (enumLiteral_0= 'Int' )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1290:2: (enumLiteral_0= 'Int' )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1290:4: enumLiteral_0= 'Int'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_38_in_ruleSSimpleTypes3095); 

                            current = grammarAccess.getSSimpleTypesAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSSimpleTypesAccess().getINTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1296:6: (enumLiteral_1= 'Tinyint' )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1296:6: (enumLiteral_1= 'Tinyint' )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1296:8: enumLiteral_1= 'Tinyint'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_39_in_ruleSSimpleTypes3112); 

                            current = grammarAccess.getSSimpleTypesAccess().getTINY_INTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getSSimpleTypesAccess().getTINY_INTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1302:6: (enumLiteral_2= 'Smallint' )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1302:6: (enumLiteral_2= 'Smallint' )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1302:8: enumLiteral_2= 'Smallint'
                    {
                    enumLiteral_2=(Token)match(input,40,FOLLOW_40_in_ruleSSimpleTypes3129); 

                            current = grammarAccess.getSSimpleTypesAccess().getSMALL_INTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getSSimpleTypesAccess().getSMALL_INTEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1308:6: (enumLiteral_3= 'Mediumint' )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1308:6: (enumLiteral_3= 'Mediumint' )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1308:8: enumLiteral_3= 'Mediumint'
                    {
                    enumLiteral_3=(Token)match(input,41,FOLLOW_41_in_ruleSSimpleTypes3146); 

                            current = grammarAccess.getSSimpleTypesAccess().getMEDIUM_INTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getSSimpleTypesAccess().getMEDIUM_INTEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1314:6: (enumLiteral_4= 'Boolean' )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1314:6: (enumLiteral_4= 'Boolean' )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1314:8: enumLiteral_4= 'Boolean'
                    {
                    enumLiteral_4=(Token)match(input,42,FOLLOW_42_in_ruleSSimpleTypes3163); 

                            current = grammarAccess.getSSimpleTypesAccess().getBOOLEANEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getSSimpleTypesAccess().getBOOLEANEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1320:6: (enumLiteral_5= 'Blob' )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1320:6: (enumLiteral_5= 'Blob' )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1320:8: enumLiteral_5= 'Blob'
                    {
                    enumLiteral_5=(Token)match(input,43,FOLLOW_43_in_ruleSSimpleTypes3180); 

                            current = grammarAccess.getSSimpleTypesAccess().getBLOBEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getSSimpleTypesAccess().getBLOBEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1326:6: (enumLiteral_6= 'Datetime' )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1326:6: (enumLiteral_6= 'Datetime' )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1326:8: enumLiteral_6= 'Datetime'
                    {
                    enumLiteral_6=(Token)match(input,44,FOLLOW_44_in_ruleSSimpleTypes3197); 

                            current = grammarAccess.getSSimpleTypesAccess().getDATETIMEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getSSimpleTypesAccess().getDATETIMEEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1332:6: (enumLiteral_7= 'Date' )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1332:6: (enumLiteral_7= 'Date' )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1332:8: enumLiteral_7= 'Date'
                    {
                    enumLiteral_7=(Token)match(input,45,FOLLOW_45_in_ruleSSimpleTypes3214); 

                            current = grammarAccess.getSSimpleTypesAccess().getDATEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getSSimpleTypesAccess().getDATEEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1338:6: (enumLiteral_8= 'Time' )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1338:6: (enumLiteral_8= 'Time' )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1338:8: enumLiteral_8= 'Time'
                    {
                    enumLiteral_8=(Token)match(input,46,FOLLOW_46_in_ruleSSimpleTypes3231); 

                            current = grammarAccess.getSSimpleTypesAccess().getTIMEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getSSimpleTypesAccess().getTIMEEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1344:6: (enumLiteral_9= 'Polygon' )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1344:6: (enumLiteral_9= 'Polygon' )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1344:8: enumLiteral_9= 'Polygon'
                    {
                    enumLiteral_9=(Token)match(input,47,FOLLOW_47_in_ruleSSimpleTypes3248); 

                            current = grammarAccess.getSSimpleTypesAccess().getPOLYGONEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getSSimpleTypesAccess().getPOLYGONEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1350:6: (enumLiteral_10= 'Point' )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1350:6: (enumLiteral_10= 'Point' )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1350:8: enumLiteral_10= 'Point'
                    {
                    enumLiteral_10=(Token)match(input,48,FOLLOW_48_in_ruleSSimpleTypes3265); 

                            current = grammarAccess.getSSimpleTypesAccess().getPOINTEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getSSimpleTypesAccess().getPOINTEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1356:6: (enumLiteral_11= 'Foto' )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1356:6: (enumLiteral_11= 'Foto' )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1356:8: enumLiteral_11= 'Foto'
                    {
                    enumLiteral_11=(Token)match(input,49,FOLLOW_49_in_ruleSSimpleTypes3282); 

                            current = grammarAccess.getSSimpleTypesAccess().getFOTOEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getSSimpleTypesAccess().getFOTOEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1362:6: (enumLiteral_12= 'Currency' )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1362:6: (enumLiteral_12= 'Currency' )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1362:8: enumLiteral_12= 'Currency'
                    {
                    enumLiteral_12=(Token)match(input,50,FOLLOW_50_in_ruleSSimpleTypes3299); 

                            current = grammarAccess.getSSimpleTypesAccess().getCurrencyEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getSSimpleTypesAccess().getCurrencyEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1368:6: (enumLiteral_13= 'Coordinate' )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1368:6: (enumLiteral_13= 'Coordinate' )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1368:8: enumLiteral_13= 'Coordinate'
                    {
                    enumLiteral_13=(Token)match(input,51,FOLLOW_51_in_ruleSSimpleTypes3316); 

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
    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1378:1: ruleSIndex returns [Enumerator current=null] : ( (enumLiteral_0= 'No' ) | (enumLiteral_1= 'Yes' ) | (enumLiteral_2= 'Unique' ) | (enumLiteral_3= 'Spatial' ) ) ;
    public final Enumerator ruleSIndex() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1380:28: ( ( (enumLiteral_0= 'No' ) | (enumLiteral_1= 'Yes' ) | (enumLiteral_2= 'Unique' ) | (enumLiteral_3= 'Spatial' ) ) )
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1381:1: ( (enumLiteral_0= 'No' ) | (enumLiteral_1= 'Yes' ) | (enumLiteral_2= 'Unique' ) | (enumLiteral_3= 'Spatial' ) )
            {
            // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1381:1: ( (enumLiteral_0= 'No' ) | (enumLiteral_1= 'Yes' ) | (enumLiteral_2= 'Unique' ) | (enumLiteral_3= 'Spatial' ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt17=1;
                }
                break;
            case 53:
                {
                alt17=2;
                }
                break;
            case 54:
                {
                alt17=3;
                }
                break;
            case 55:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1381:2: (enumLiteral_0= 'No' )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1381:2: (enumLiteral_0= 'No' )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1381:4: enumLiteral_0= 'No'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_52_in_ruleSIndex3361); 

                            current = grammarAccess.getSIndexAccess().getNOEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSIndexAccess().getNOEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1387:6: (enumLiteral_1= 'Yes' )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1387:6: (enumLiteral_1= 'Yes' )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1387:8: enumLiteral_1= 'Yes'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_53_in_ruleSIndex3378); 

                            current = grammarAccess.getSIndexAccess().getYESEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getSIndexAccess().getYESEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1393:6: (enumLiteral_2= 'Unique' )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1393:6: (enumLiteral_2= 'Unique' )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1393:8: enumLiteral_2= 'Unique'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_54_in_ruleSIndex3395); 

                            current = grammarAccess.getSIndexAccess().getUNIQUEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getSIndexAccess().getUNIQUEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1399:6: (enumLiteral_3= 'Spatial' )
                    {
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1399:6: (enumLiteral_3= 'Spatial' )
                    // ../org.lunifera.metamodel.dsl.sql/src-gen/org/lunifera/metamodel/dsl/parser/antlr/internal/InternalSqlDSL.g:1399:8: enumLiteral_3= 'Spatial'
                    {
                    enumLiteral_3=(Token)match(input,55,FOLLOW_55_in_ruleSIndex3412); 

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
    public static final BitSet FOLLOW_11_in_ruleSModel123 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSModel140 = new BitSet(new long[]{0x0000000040021002L});
    public static final BitSet FOLLOW_ruleSSettings_in_ruleSModel167 = new BitSet(new long[]{0x0000000040020002L});
    public static final BitSet FOLLOW_ruleSArtifact_in_ruleSModel189 = new BitSet(new long[]{0x0000000040020002L});
    public static final BitSet FOLLOW_ruleSSettings_in_entryRuleSSettings226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSSettings236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleSSettings282 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_13_in_ruleSSettings340 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSSettings357 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_14_in_ruleSSettings430 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLFQN_in_ruleSSettings451 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_15_in_ruleSSettings519 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_ruleSDBEngine_in_ruleSSettings540 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_16_in_ruleSSettings593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSArtifact_in_entryRuleSArtifact629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSArtifact639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTable_in_ruleSArtifact686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSEnum_in_ruleSArtifact713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTable_in_entryRuleSTable748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSTable758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSTable795 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSTable812 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSTable829 = new BitSet(new long[]{0x0000000001B91000L});
    public static final BitSet FOLLOW_ruleSSettings_in_ruleSTable895 = new BitSet(new long[]{0x0000000001B91000L});
    public static final BitSet FOLLOW_19_in_ruleSTable962 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSTable979 = new BitSet(new long[]{0x0000000001B91000L});
    public static final BitSet FOLLOW_20_in_ruleSTable1057 = new BitSet(new long[]{0x0000000001B91000L});
    public static final BitSet FOLLOW_21_in_ruleSTable1137 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSTable1154 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleSTable1171 = new BitSet(new long[]{0x0000000001B91000L});
    public static final BitSet FOLLOW_ruleSTableMember_in_ruleSTable1233 = new BitSet(new long[]{0x0000000001810000L});
    public static final BitSet FOLLOW_16_in_ruleSTable1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTableMember_in_entryRuleSTableMember1282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSTableMember1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSColumn_in_ruleSTableMember1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJoinColumn_in_ruleSTableMember1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSColumn_in_entryRuleSColumn1401 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSColumn1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleSColumn1448 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSColumn1465 = new BitSet(new long[]{0x000FFFC500000010L});
    public static final BitSet FOLLOW_ruleLFQN_in_ruleSColumn1494 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_ruleSInlinedSQLType_in_ruleSColumn1521 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_ruleSSimpleTypes_in_ruleSColumn1548 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_ruleSColumnProps_in_ruleSColumn1570 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleSColumn1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJoinColumn_in_entryRuleSJoinColumn1619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSJoinColumn1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleSJoinColumn1666 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSJoinColumn1683 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLFQN_in_ruleSJoinColumn1711 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_ruleSColumnProps_in_ruleSJoinColumn1732 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleSJoinColumn1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSColumnProps_in_entryRuleSColumnProps1781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSColumnProps1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleSColumnProps1837 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_26_in_ruleSColumnProps1900 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_27_in_ruleSColumnProps1985 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_28_in_ruleSColumnProps2065 = new BitSet(new long[]{0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleSIndex_in_ruleSColumnProps2086 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_29_in_ruleSColumnProps2154 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSColumnProps2171 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_ruleSInlinedSQLType_in_entryRuleSInlinedSQLType2255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSInlinedSQLType2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSString_in_ruleSInlinedSQLType2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSDecimal_in_ruleSInlinedSQLType2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSEnum_in_entryRuleSEnum2374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSEnum2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleSEnum2421 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSEnum2438 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSEnum2455 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleSEnumLiteral_in_ruleSEnum2476 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleSEnum2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSEnumLiteral_in_entryRuleSEnumLiteral2525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSEnumLiteral2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSEnumLiteral2577 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleSEnumLiteral2594 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSEnumLiteral2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSString_in_entryRuleSString2652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSString2662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleSString2699 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSString2716 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleSString2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSDecimal_in_entryRuleSDecimal2769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSDecimal2779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleSDecimal2816 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSDecimal2833 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleSDecimal2850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLFQN_in_entryRuleLFQN2887 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLFQN2898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLFQN2938 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleLFQN2957 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLFQN2972 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_36_in_ruleSDBEngine3033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleSDBEngine3050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleSSimpleTypes3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleSSimpleTypes3112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleSSimpleTypes3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleSSimpleTypes3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleSSimpleTypes3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleSSimpleTypes3180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleSSimpleTypes3197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleSSimpleTypes3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleSSimpleTypes3231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleSSimpleTypes3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleSSimpleTypes3265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleSSimpleTypes3282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleSSimpleTypes3299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleSSimpleTypes3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleSIndex3361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleSIndex3378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleSIndex3395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleSIndex3412 = new BitSet(new long[]{0x0000000000000002L});

}

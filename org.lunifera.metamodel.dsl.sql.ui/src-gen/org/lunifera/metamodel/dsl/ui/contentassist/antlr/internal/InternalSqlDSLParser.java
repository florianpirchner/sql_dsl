package org.lunifera.metamodel.dsl.ui.contentassist.antlr.internal; 

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
import org.lunifera.metamodel.dsl.services.SqlDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSqlDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'InnoDB'", "'MyISAM'", "'Int'", "'Tinyint'", "'Smallint'", "'Mediumint'", "'Boolean'", "'Blob'", "'Datetime'", "'Date'", "'Time'", "'Polygon'", "'Point'", "'Foto'", "'Currency'", "'Coordinate'", "'No'", "'Yes'", "'Unique'", "'Spatial'", "'generatedFile'", "'settings {'", "'}'", "'schema='", "'javapackage='", "'engine='", "'table'", "'{'", "'entityname='", "'prefix'", "';'", "'column'", "'joincolumn'", "'with'", "'index='", "'javacolumn='", "'enum'", "'='", "'String('", "')'", "'Decimal('", "'.'", "'cached'", "'nullable'", "'AES'"
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
    public String getGrammarFileName() { return "../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g"; }


     
     	private SqlDSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SqlDSLGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleSModel"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:60:1: entryRuleSModel : ruleSModel EOF ;
    public final void entryRuleSModel() throws RecognitionException {
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:61:1: ( ruleSModel EOF )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:62:1: ruleSModel EOF
            {
             before(grammarAccess.getSModelRule()); 
            pushFollow(FOLLOW_ruleSModel_in_entryRuleSModel61);
            ruleSModel();

            state._fsp--;

             after(grammarAccess.getSModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSModel68); 

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
    // $ANTLR end "entryRuleSModel"


    // $ANTLR start "ruleSModel"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:69:1: ruleSModel : ( ( rule__SModel__Group__0 ) ) ;
    public final void ruleSModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:73:2: ( ( ( rule__SModel__Group__0 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:74:1: ( ( rule__SModel__Group__0 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:74:1: ( ( rule__SModel__Group__0 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:75:1: ( rule__SModel__Group__0 )
            {
             before(grammarAccess.getSModelAccess().getGroup()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:76:1: ( rule__SModel__Group__0 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:76:2: rule__SModel__Group__0
            {
            pushFollow(FOLLOW_rule__SModel__Group__0_in_ruleSModel94);
            rule__SModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSModel"


    // $ANTLR start "entryRuleSSettings"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:88:1: entryRuleSSettings : ruleSSettings EOF ;
    public final void entryRuleSSettings() throws RecognitionException {
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:89:1: ( ruleSSettings EOF )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:90:1: ruleSSettings EOF
            {
             before(grammarAccess.getSSettingsRule()); 
            pushFollow(FOLLOW_ruleSSettings_in_entryRuleSSettings121);
            ruleSSettings();

            state._fsp--;

             after(grammarAccess.getSSettingsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSSettings128); 

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
    // $ANTLR end "entryRuleSSettings"


    // $ANTLR start "ruleSSettings"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:97:1: ruleSSettings : ( ( rule__SSettings__Group__0 ) ) ;
    public final void ruleSSettings() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:101:2: ( ( ( rule__SSettings__Group__0 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:102:1: ( ( rule__SSettings__Group__0 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:102:1: ( ( rule__SSettings__Group__0 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:103:1: ( rule__SSettings__Group__0 )
            {
             before(grammarAccess.getSSettingsAccess().getGroup()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:104:1: ( rule__SSettings__Group__0 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:104:2: rule__SSettings__Group__0
            {
            pushFollow(FOLLOW_rule__SSettings__Group__0_in_ruleSSettings154);
            rule__SSettings__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSSettingsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSSettings"


    // $ANTLR start "entryRuleSArtifact"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:116:1: entryRuleSArtifact : ruleSArtifact EOF ;
    public final void entryRuleSArtifact() throws RecognitionException {
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:117:1: ( ruleSArtifact EOF )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:118:1: ruleSArtifact EOF
            {
             before(grammarAccess.getSArtifactRule()); 
            pushFollow(FOLLOW_ruleSArtifact_in_entryRuleSArtifact181);
            ruleSArtifact();

            state._fsp--;

             after(grammarAccess.getSArtifactRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSArtifact188); 

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
    // $ANTLR end "entryRuleSArtifact"


    // $ANTLR start "ruleSArtifact"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:125:1: ruleSArtifact : ( ( rule__SArtifact__Alternatives ) ) ;
    public final void ruleSArtifact() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:129:2: ( ( ( rule__SArtifact__Alternatives ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:130:1: ( ( rule__SArtifact__Alternatives ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:130:1: ( ( rule__SArtifact__Alternatives ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:131:1: ( rule__SArtifact__Alternatives )
            {
             before(grammarAccess.getSArtifactAccess().getAlternatives()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:132:1: ( rule__SArtifact__Alternatives )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:132:2: rule__SArtifact__Alternatives
            {
            pushFollow(FOLLOW_rule__SArtifact__Alternatives_in_ruleSArtifact214);
            rule__SArtifact__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSArtifactAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSArtifact"


    // $ANTLR start "entryRuleSTable"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:144:1: entryRuleSTable : ruleSTable EOF ;
    public final void entryRuleSTable() throws RecognitionException {
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:145:1: ( ruleSTable EOF )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:146:1: ruleSTable EOF
            {
             before(grammarAccess.getSTableRule()); 
            pushFollow(FOLLOW_ruleSTable_in_entryRuleSTable241);
            ruleSTable();

            state._fsp--;

             after(grammarAccess.getSTableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSTable248); 

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
    // $ANTLR end "entryRuleSTable"


    // $ANTLR start "ruleSTable"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:153:1: ruleSTable : ( ( rule__STable__Group__0 ) ) ;
    public final void ruleSTable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:157:2: ( ( ( rule__STable__Group__0 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:158:1: ( ( rule__STable__Group__0 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:158:1: ( ( rule__STable__Group__0 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:159:1: ( rule__STable__Group__0 )
            {
             before(grammarAccess.getSTableAccess().getGroup()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:160:1: ( rule__STable__Group__0 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:160:2: rule__STable__Group__0
            {
            pushFollow(FOLLOW_rule__STable__Group__0_in_ruleSTable274);
            rule__STable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSTableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSTable"


    // $ANTLR start "entryRuleSTableMember"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:172:1: entryRuleSTableMember : ruleSTableMember EOF ;
    public final void entryRuleSTableMember() throws RecognitionException {
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:173:1: ( ruleSTableMember EOF )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:174:1: ruleSTableMember EOF
            {
             before(grammarAccess.getSTableMemberRule()); 
            pushFollow(FOLLOW_ruleSTableMember_in_entryRuleSTableMember301);
            ruleSTableMember();

            state._fsp--;

             after(grammarAccess.getSTableMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSTableMember308); 

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
    // $ANTLR end "entryRuleSTableMember"


    // $ANTLR start "ruleSTableMember"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:181:1: ruleSTableMember : ( ( rule__STableMember__Alternatives ) ) ;
    public final void ruleSTableMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:185:2: ( ( ( rule__STableMember__Alternatives ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:186:1: ( ( rule__STableMember__Alternatives ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:186:1: ( ( rule__STableMember__Alternatives ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:187:1: ( rule__STableMember__Alternatives )
            {
             before(grammarAccess.getSTableMemberAccess().getAlternatives()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:188:1: ( rule__STableMember__Alternatives )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:188:2: rule__STableMember__Alternatives
            {
            pushFollow(FOLLOW_rule__STableMember__Alternatives_in_ruleSTableMember334);
            rule__STableMember__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSTableMemberAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSTableMember"


    // $ANTLR start "entryRuleSColumn"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:200:1: entryRuleSColumn : ruleSColumn EOF ;
    public final void entryRuleSColumn() throws RecognitionException {
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:201:1: ( ruleSColumn EOF )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:202:1: ruleSColumn EOF
            {
             before(grammarAccess.getSColumnRule()); 
            pushFollow(FOLLOW_ruleSColumn_in_entryRuleSColumn361);
            ruleSColumn();

            state._fsp--;

             after(grammarAccess.getSColumnRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSColumn368); 

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
    // $ANTLR end "entryRuleSColumn"


    // $ANTLR start "ruleSColumn"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:209:1: ruleSColumn : ( ( rule__SColumn__Group__0 ) ) ;
    public final void ruleSColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:213:2: ( ( ( rule__SColumn__Group__0 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:214:1: ( ( rule__SColumn__Group__0 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:214:1: ( ( rule__SColumn__Group__0 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:215:1: ( rule__SColumn__Group__0 )
            {
             before(grammarAccess.getSColumnAccess().getGroup()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:216:1: ( rule__SColumn__Group__0 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:216:2: rule__SColumn__Group__0
            {
            pushFollow(FOLLOW_rule__SColumn__Group__0_in_ruleSColumn394);
            rule__SColumn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSColumnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSColumn"


    // $ANTLR start "entryRuleSJoinColumn"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:228:1: entryRuleSJoinColumn : ruleSJoinColumn EOF ;
    public final void entryRuleSJoinColumn() throws RecognitionException {
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:229:1: ( ruleSJoinColumn EOF )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:230:1: ruleSJoinColumn EOF
            {
             before(grammarAccess.getSJoinColumnRule()); 
            pushFollow(FOLLOW_ruleSJoinColumn_in_entryRuleSJoinColumn421);
            ruleSJoinColumn();

            state._fsp--;

             after(grammarAccess.getSJoinColumnRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSJoinColumn428); 

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
    // $ANTLR end "entryRuleSJoinColumn"


    // $ANTLR start "ruleSJoinColumn"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:237:1: ruleSJoinColumn : ( ( rule__SJoinColumn__Group__0 ) ) ;
    public final void ruleSJoinColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:241:2: ( ( ( rule__SJoinColumn__Group__0 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:242:1: ( ( rule__SJoinColumn__Group__0 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:242:1: ( ( rule__SJoinColumn__Group__0 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:243:1: ( rule__SJoinColumn__Group__0 )
            {
             before(grammarAccess.getSJoinColumnAccess().getGroup()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:244:1: ( rule__SJoinColumn__Group__0 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:244:2: rule__SJoinColumn__Group__0
            {
            pushFollow(FOLLOW_rule__SJoinColumn__Group__0_in_ruleSJoinColumn454);
            rule__SJoinColumn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSJoinColumnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSJoinColumn"


    // $ANTLR start "entryRuleSColumnProps"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:256:1: entryRuleSColumnProps : ruleSColumnProps EOF ;
    public final void entryRuleSColumnProps() throws RecognitionException {
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:257:1: ( ruleSColumnProps EOF )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:258:1: ruleSColumnProps EOF
            {
             before(grammarAccess.getSColumnPropsRule()); 
            pushFollow(FOLLOW_ruleSColumnProps_in_entryRuleSColumnProps481);
            ruleSColumnProps();

            state._fsp--;

             after(grammarAccess.getSColumnPropsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSColumnProps488); 

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
    // $ANTLR end "entryRuleSColumnProps"


    // $ANTLR start "ruleSColumnProps"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:265:1: ruleSColumnProps : ( ( rule__SColumnProps__Group__0 ) ) ;
    public final void ruleSColumnProps() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:269:2: ( ( ( rule__SColumnProps__Group__0 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:270:1: ( ( rule__SColumnProps__Group__0 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:270:1: ( ( rule__SColumnProps__Group__0 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:271:1: ( rule__SColumnProps__Group__0 )
            {
             before(grammarAccess.getSColumnPropsAccess().getGroup()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:272:1: ( rule__SColumnProps__Group__0 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:272:2: rule__SColumnProps__Group__0
            {
            pushFollow(FOLLOW_rule__SColumnProps__Group__0_in_ruleSColumnProps514);
            rule__SColumnProps__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSColumnPropsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSColumnProps"


    // $ANTLR start "entryRuleSInlinedSQLType"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:286:1: entryRuleSInlinedSQLType : ruleSInlinedSQLType EOF ;
    public final void entryRuleSInlinedSQLType() throws RecognitionException {
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:287:1: ( ruleSInlinedSQLType EOF )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:288:1: ruleSInlinedSQLType EOF
            {
             before(grammarAccess.getSInlinedSQLTypeRule()); 
            pushFollow(FOLLOW_ruleSInlinedSQLType_in_entryRuleSInlinedSQLType543);
            ruleSInlinedSQLType();

            state._fsp--;

             after(grammarAccess.getSInlinedSQLTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSInlinedSQLType550); 

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
    // $ANTLR end "entryRuleSInlinedSQLType"


    // $ANTLR start "ruleSInlinedSQLType"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:295:1: ruleSInlinedSQLType : ( ( rule__SInlinedSQLType__Alternatives ) ) ;
    public final void ruleSInlinedSQLType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:299:2: ( ( ( rule__SInlinedSQLType__Alternatives ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:300:1: ( ( rule__SInlinedSQLType__Alternatives ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:300:1: ( ( rule__SInlinedSQLType__Alternatives ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:301:1: ( rule__SInlinedSQLType__Alternatives )
            {
             before(grammarAccess.getSInlinedSQLTypeAccess().getAlternatives()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:302:1: ( rule__SInlinedSQLType__Alternatives )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:302:2: rule__SInlinedSQLType__Alternatives
            {
            pushFollow(FOLLOW_rule__SInlinedSQLType__Alternatives_in_ruleSInlinedSQLType576);
            rule__SInlinedSQLType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSInlinedSQLTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSInlinedSQLType"


    // $ANTLR start "entryRuleSEnum"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:314:1: entryRuleSEnum : ruleSEnum EOF ;
    public final void entryRuleSEnum() throws RecognitionException {
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:315:1: ( ruleSEnum EOF )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:316:1: ruleSEnum EOF
            {
             before(grammarAccess.getSEnumRule()); 
            pushFollow(FOLLOW_ruleSEnum_in_entryRuleSEnum603);
            ruleSEnum();

            state._fsp--;

             after(grammarAccess.getSEnumRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSEnum610); 

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
    // $ANTLR end "entryRuleSEnum"


    // $ANTLR start "ruleSEnum"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:323:1: ruleSEnum : ( ( rule__SEnum__Group__0 ) ) ;
    public final void ruleSEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:327:2: ( ( ( rule__SEnum__Group__0 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:328:1: ( ( rule__SEnum__Group__0 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:328:1: ( ( rule__SEnum__Group__0 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:329:1: ( rule__SEnum__Group__0 )
            {
             before(grammarAccess.getSEnumAccess().getGroup()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:330:1: ( rule__SEnum__Group__0 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:330:2: rule__SEnum__Group__0
            {
            pushFollow(FOLLOW_rule__SEnum__Group__0_in_ruleSEnum636);
            rule__SEnum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSEnumAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSEnum"


    // $ANTLR start "entryRuleSEnumLiteral"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:342:1: entryRuleSEnumLiteral : ruleSEnumLiteral EOF ;
    public final void entryRuleSEnumLiteral() throws RecognitionException {
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:343:1: ( ruleSEnumLiteral EOF )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:344:1: ruleSEnumLiteral EOF
            {
             before(grammarAccess.getSEnumLiteralRule()); 
            pushFollow(FOLLOW_ruleSEnumLiteral_in_entryRuleSEnumLiteral663);
            ruleSEnumLiteral();

            state._fsp--;

             after(grammarAccess.getSEnumLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSEnumLiteral670); 

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
    // $ANTLR end "entryRuleSEnumLiteral"


    // $ANTLR start "ruleSEnumLiteral"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:351:1: ruleSEnumLiteral : ( ( rule__SEnumLiteral__Group__0 ) ) ;
    public final void ruleSEnumLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:355:2: ( ( ( rule__SEnumLiteral__Group__0 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:356:1: ( ( rule__SEnumLiteral__Group__0 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:356:1: ( ( rule__SEnumLiteral__Group__0 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:357:1: ( rule__SEnumLiteral__Group__0 )
            {
             before(grammarAccess.getSEnumLiteralAccess().getGroup()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:358:1: ( rule__SEnumLiteral__Group__0 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:358:2: rule__SEnumLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__SEnumLiteral__Group__0_in_ruleSEnumLiteral696);
            rule__SEnumLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSEnumLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSEnumLiteral"


    // $ANTLR start "entryRuleSString"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:370:1: entryRuleSString : ruleSString EOF ;
    public final void entryRuleSString() throws RecognitionException {
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:371:1: ( ruleSString EOF )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:372:1: ruleSString EOF
            {
             before(grammarAccess.getSStringRule()); 
            pushFollow(FOLLOW_ruleSString_in_entryRuleSString723);
            ruleSString();

            state._fsp--;

             after(grammarAccess.getSStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSString730); 

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
    // $ANTLR end "entryRuleSString"


    // $ANTLR start "ruleSString"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:379:1: ruleSString : ( ( rule__SString__Group__0 ) ) ;
    public final void ruleSString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:383:2: ( ( ( rule__SString__Group__0 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:384:1: ( ( rule__SString__Group__0 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:384:1: ( ( rule__SString__Group__0 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:385:1: ( rule__SString__Group__0 )
            {
             before(grammarAccess.getSStringAccess().getGroup()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:386:1: ( rule__SString__Group__0 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:386:2: rule__SString__Group__0
            {
            pushFollow(FOLLOW_rule__SString__Group__0_in_ruleSString756);
            rule__SString__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSStringAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSString"


    // $ANTLR start "entryRuleSDecimal"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:398:1: entryRuleSDecimal : ruleSDecimal EOF ;
    public final void entryRuleSDecimal() throws RecognitionException {
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:399:1: ( ruleSDecimal EOF )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:400:1: ruleSDecimal EOF
            {
             before(grammarAccess.getSDecimalRule()); 
            pushFollow(FOLLOW_ruleSDecimal_in_entryRuleSDecimal783);
            ruleSDecimal();

            state._fsp--;

             after(grammarAccess.getSDecimalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSDecimal790); 

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
    // $ANTLR end "entryRuleSDecimal"


    // $ANTLR start "ruleSDecimal"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:407:1: ruleSDecimal : ( ( rule__SDecimal__Group__0 ) ) ;
    public final void ruleSDecimal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:411:2: ( ( ( rule__SDecimal__Group__0 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:412:1: ( ( rule__SDecimal__Group__0 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:412:1: ( ( rule__SDecimal__Group__0 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:413:1: ( rule__SDecimal__Group__0 )
            {
             before(grammarAccess.getSDecimalAccess().getGroup()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:414:1: ( rule__SDecimal__Group__0 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:414:2: rule__SDecimal__Group__0
            {
            pushFollow(FOLLOW_rule__SDecimal__Group__0_in_ruleSDecimal816);
            rule__SDecimal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSDecimalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSDecimal"


    // $ANTLR start "entryRuleLFQN"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:426:1: entryRuleLFQN : ruleLFQN EOF ;
    public final void entryRuleLFQN() throws RecognitionException {
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:427:1: ( ruleLFQN EOF )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:428:1: ruleLFQN EOF
            {
             before(grammarAccess.getLFQNRule()); 
            pushFollow(FOLLOW_ruleLFQN_in_entryRuleLFQN843);
            ruleLFQN();

            state._fsp--;

             after(grammarAccess.getLFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLFQN850); 

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
    // $ANTLR end "entryRuleLFQN"


    // $ANTLR start "ruleLFQN"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:435:1: ruleLFQN : ( ( rule__LFQN__Group__0 ) ) ;
    public final void ruleLFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:439:2: ( ( ( rule__LFQN__Group__0 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:440:1: ( ( rule__LFQN__Group__0 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:440:1: ( ( rule__LFQN__Group__0 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:441:1: ( rule__LFQN__Group__0 )
            {
             before(grammarAccess.getLFQNAccess().getGroup()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:442:1: ( rule__LFQN__Group__0 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:442:2: rule__LFQN__Group__0
            {
            pushFollow(FOLLOW_rule__LFQN__Group__0_in_ruleLFQN876);
            rule__LFQN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLFQNAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLFQN"


    // $ANTLR start "ruleSDBEngine"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:455:1: ruleSDBEngine : ( ( rule__SDBEngine__Alternatives ) ) ;
    public final void ruleSDBEngine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:459:1: ( ( ( rule__SDBEngine__Alternatives ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:460:1: ( ( rule__SDBEngine__Alternatives ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:460:1: ( ( rule__SDBEngine__Alternatives ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:461:1: ( rule__SDBEngine__Alternatives )
            {
             before(grammarAccess.getSDBEngineAccess().getAlternatives()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:462:1: ( rule__SDBEngine__Alternatives )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:462:2: rule__SDBEngine__Alternatives
            {
            pushFollow(FOLLOW_rule__SDBEngine__Alternatives_in_ruleSDBEngine913);
            rule__SDBEngine__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSDBEngineAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSDBEngine"


    // $ANTLR start "ruleSSimpleTypes"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:474:1: ruleSSimpleTypes : ( ( rule__SSimpleTypes__Alternatives ) ) ;
    public final void ruleSSimpleTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:478:1: ( ( ( rule__SSimpleTypes__Alternatives ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:479:1: ( ( rule__SSimpleTypes__Alternatives ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:479:1: ( ( rule__SSimpleTypes__Alternatives ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:480:1: ( rule__SSimpleTypes__Alternatives )
            {
             before(grammarAccess.getSSimpleTypesAccess().getAlternatives()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:481:1: ( rule__SSimpleTypes__Alternatives )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:481:2: rule__SSimpleTypes__Alternatives
            {
            pushFollow(FOLLOW_rule__SSimpleTypes__Alternatives_in_ruleSSimpleTypes949);
            rule__SSimpleTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSSimpleTypesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSSimpleTypes"


    // $ANTLR start "ruleSIndex"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:493:1: ruleSIndex : ( ( rule__SIndex__Alternatives ) ) ;
    public final void ruleSIndex() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:497:1: ( ( ( rule__SIndex__Alternatives ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:498:1: ( ( rule__SIndex__Alternatives ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:498:1: ( ( rule__SIndex__Alternatives ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:499:1: ( rule__SIndex__Alternatives )
            {
             before(grammarAccess.getSIndexAccess().getAlternatives()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:500:1: ( rule__SIndex__Alternatives )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:500:2: rule__SIndex__Alternatives
            {
            pushFollow(FOLLOW_rule__SIndex__Alternatives_in_ruleSIndex985);
            rule__SIndex__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSIndexAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSIndex"


    // $ANTLR start "rule__SArtifact__Alternatives"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:511:1: rule__SArtifact__Alternatives : ( ( ruleSTable ) | ( ruleSEnum ) );
    public final void rule__SArtifact__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:515:1: ( ( ruleSTable ) | ( ruleSEnum ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==37) ) {
                alt1=1;
            }
            else if ( (LA1_0==47) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:516:1: ( ruleSTable )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:516:1: ( ruleSTable )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:517:1: ruleSTable
                    {
                     before(grammarAccess.getSArtifactAccess().getSTableParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSTable_in_rule__SArtifact__Alternatives1020);
                    ruleSTable();

                    state._fsp--;

                     after(grammarAccess.getSArtifactAccess().getSTableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:522:6: ( ruleSEnum )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:522:6: ( ruleSEnum )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:523:1: ruleSEnum
                    {
                     before(grammarAccess.getSArtifactAccess().getSEnumParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSEnum_in_rule__SArtifact__Alternatives1037);
                    ruleSEnum();

                    state._fsp--;

                     after(grammarAccess.getSArtifactAccess().getSEnumParserRuleCall_1()); 

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
    // $ANTLR end "rule__SArtifact__Alternatives"


    // $ANTLR start "rule__STableMember__Alternatives"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:533:1: rule__STableMember__Alternatives : ( ( ruleSColumn ) | ( ruleSJoinColumn ) );
    public final void rule__STableMember__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:537:1: ( ( ruleSColumn ) | ( ruleSJoinColumn ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==42) ) {
                alt2=1;
            }
            else if ( (LA2_0==43) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:538:1: ( ruleSColumn )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:538:1: ( ruleSColumn )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:539:1: ruleSColumn
                    {
                     before(grammarAccess.getSTableMemberAccess().getSColumnParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSColumn_in_rule__STableMember__Alternatives1069);
                    ruleSColumn();

                    state._fsp--;

                     after(grammarAccess.getSTableMemberAccess().getSColumnParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:544:6: ( ruleSJoinColumn )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:544:6: ( ruleSJoinColumn )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:545:1: ruleSJoinColumn
                    {
                     before(grammarAccess.getSTableMemberAccess().getSJoinColumnParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSJoinColumn_in_rule__STableMember__Alternatives1086);
                    ruleSJoinColumn();

                    state._fsp--;

                     after(grammarAccess.getSTableMemberAccess().getSJoinColumnParserRuleCall_1()); 

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
    // $ANTLR end "rule__STableMember__Alternatives"


    // $ANTLR start "rule__SColumn__Alternatives_2"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:555:1: rule__SColumn__Alternatives_2 : ( ( ( rule__SColumn__ExtTypeAssignment_2_0 ) ) | ( ( rule__SColumn__InlinedTypeAssignment_2_1 ) ) | ( ( rule__SColumn__SimpleTypeAssignment_2_2 ) ) );
    public final void rule__SColumn__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:559:1: ( ( ( rule__SColumn__ExtTypeAssignment_2_0 ) ) | ( ( rule__SColumn__InlinedTypeAssignment_2_1 ) ) | ( ( rule__SColumn__SimpleTypeAssignment_2_2 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case 49:
            case 51:
                {
                alt3=2;
                }
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:560:1: ( ( rule__SColumn__ExtTypeAssignment_2_0 ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:560:1: ( ( rule__SColumn__ExtTypeAssignment_2_0 ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:561:1: ( rule__SColumn__ExtTypeAssignment_2_0 )
                    {
                     before(grammarAccess.getSColumnAccess().getExtTypeAssignment_2_0()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:562:1: ( rule__SColumn__ExtTypeAssignment_2_0 )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:562:2: rule__SColumn__ExtTypeAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__SColumn__ExtTypeAssignment_2_0_in_rule__SColumn__Alternatives_21118);
                    rule__SColumn__ExtTypeAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSColumnAccess().getExtTypeAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:566:6: ( ( rule__SColumn__InlinedTypeAssignment_2_1 ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:566:6: ( ( rule__SColumn__InlinedTypeAssignment_2_1 ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:567:1: ( rule__SColumn__InlinedTypeAssignment_2_1 )
                    {
                     before(grammarAccess.getSColumnAccess().getInlinedTypeAssignment_2_1()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:568:1: ( rule__SColumn__InlinedTypeAssignment_2_1 )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:568:2: rule__SColumn__InlinedTypeAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__SColumn__InlinedTypeAssignment_2_1_in_rule__SColumn__Alternatives_21136);
                    rule__SColumn__InlinedTypeAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSColumnAccess().getInlinedTypeAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:572:6: ( ( rule__SColumn__SimpleTypeAssignment_2_2 ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:572:6: ( ( rule__SColumn__SimpleTypeAssignment_2_2 ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:573:1: ( rule__SColumn__SimpleTypeAssignment_2_2 )
                    {
                     before(grammarAccess.getSColumnAccess().getSimpleTypeAssignment_2_2()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:574:1: ( rule__SColumn__SimpleTypeAssignment_2_2 )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:574:2: rule__SColumn__SimpleTypeAssignment_2_2
                    {
                    pushFollow(FOLLOW_rule__SColumn__SimpleTypeAssignment_2_2_in_rule__SColumn__Alternatives_21154);
                    rule__SColumn__SimpleTypeAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSColumnAccess().getSimpleTypeAssignment_2_2()); 

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
    // $ANTLR end "rule__SColumn__Alternatives_2"


    // $ANTLR start "rule__SInlinedSQLType__Alternatives"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:583:1: rule__SInlinedSQLType__Alternatives : ( ( ruleSString ) | ( ruleSDecimal ) );
    public final void rule__SInlinedSQLType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:587:1: ( ( ruleSString ) | ( ruleSDecimal ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==49) ) {
                alt4=1;
            }
            else if ( (LA4_0==51) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:588:1: ( ruleSString )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:588:1: ( ruleSString )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:589:1: ruleSString
                    {
                     before(grammarAccess.getSInlinedSQLTypeAccess().getSStringParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSString_in_rule__SInlinedSQLType__Alternatives1187);
                    ruleSString();

                    state._fsp--;

                     after(grammarAccess.getSInlinedSQLTypeAccess().getSStringParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:594:6: ( ruleSDecimal )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:594:6: ( ruleSDecimal )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:595:1: ruleSDecimal
                    {
                     before(grammarAccess.getSInlinedSQLTypeAccess().getSDecimalParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSDecimal_in_rule__SInlinedSQLType__Alternatives1204);
                    ruleSDecimal();

                    state._fsp--;

                     after(grammarAccess.getSInlinedSQLTypeAccess().getSDecimalParserRuleCall_1()); 

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
    // $ANTLR end "rule__SInlinedSQLType__Alternatives"


    // $ANTLR start "rule__SDBEngine__Alternatives"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:605:1: rule__SDBEngine__Alternatives : ( ( ( 'InnoDB' ) ) | ( ( 'MyISAM' ) ) );
    public final void rule__SDBEngine__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:609:1: ( ( ( 'InnoDB' ) ) | ( ( 'MyISAM' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:610:1: ( ( 'InnoDB' ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:610:1: ( ( 'InnoDB' ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:611:1: ( 'InnoDB' )
                    {
                     before(grammarAccess.getSDBEngineAccess().getINNODBEnumLiteralDeclaration_0()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:612:1: ( 'InnoDB' )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:612:3: 'InnoDB'
                    {
                    match(input,11,FOLLOW_11_in_rule__SDBEngine__Alternatives1237); 

                    }

                     after(grammarAccess.getSDBEngineAccess().getINNODBEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:617:6: ( ( 'MyISAM' ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:617:6: ( ( 'MyISAM' ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:618:1: ( 'MyISAM' )
                    {
                     before(grammarAccess.getSDBEngineAccess().getMYISAMEnumLiteralDeclaration_1()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:619:1: ( 'MyISAM' )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:619:3: 'MyISAM'
                    {
                    match(input,12,FOLLOW_12_in_rule__SDBEngine__Alternatives1258); 

                    }

                     after(grammarAccess.getSDBEngineAccess().getMYISAMEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__SDBEngine__Alternatives"


    // $ANTLR start "rule__SSimpleTypes__Alternatives"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:629:1: rule__SSimpleTypes__Alternatives : ( ( ( 'Int' ) ) | ( ( 'Tinyint' ) ) | ( ( 'Smallint' ) ) | ( ( 'Mediumint' ) ) | ( ( 'Boolean' ) ) | ( ( 'Blob' ) ) | ( ( 'Datetime' ) ) | ( ( 'Date' ) ) | ( ( 'Time' ) ) | ( ( 'Polygon' ) ) | ( ( 'Point' ) ) | ( ( 'Foto' ) ) | ( ( 'Currency' ) ) | ( ( 'Coordinate' ) ) );
    public final void rule__SSimpleTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:633:1: ( ( ( 'Int' ) ) | ( ( 'Tinyint' ) ) | ( ( 'Smallint' ) ) | ( ( 'Mediumint' ) ) | ( ( 'Boolean' ) ) | ( ( 'Blob' ) ) | ( ( 'Datetime' ) ) | ( ( 'Date' ) ) | ( ( 'Time' ) ) | ( ( 'Polygon' ) ) | ( ( 'Point' ) ) | ( ( 'Foto' ) ) | ( ( 'Currency' ) ) | ( ( 'Coordinate' ) ) )
            int alt6=14;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt6=1;
                }
                break;
            case 14:
                {
                alt6=2;
                }
                break;
            case 15:
                {
                alt6=3;
                }
                break;
            case 16:
                {
                alt6=4;
                }
                break;
            case 17:
                {
                alt6=5;
                }
                break;
            case 18:
                {
                alt6=6;
                }
                break;
            case 19:
                {
                alt6=7;
                }
                break;
            case 20:
                {
                alt6=8;
                }
                break;
            case 21:
                {
                alt6=9;
                }
                break;
            case 22:
                {
                alt6=10;
                }
                break;
            case 23:
                {
                alt6=11;
                }
                break;
            case 24:
                {
                alt6=12;
                }
                break;
            case 25:
                {
                alt6=13;
                }
                break;
            case 26:
                {
                alt6=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:634:1: ( ( 'Int' ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:634:1: ( ( 'Int' ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:635:1: ( 'Int' )
                    {
                     before(grammarAccess.getSSimpleTypesAccess().getINTEnumLiteralDeclaration_0()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:636:1: ( 'Int' )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:636:3: 'Int'
                    {
                    match(input,13,FOLLOW_13_in_rule__SSimpleTypes__Alternatives1294); 

                    }

                     after(grammarAccess.getSSimpleTypesAccess().getINTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:641:6: ( ( 'Tinyint' ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:641:6: ( ( 'Tinyint' ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:642:1: ( 'Tinyint' )
                    {
                     before(grammarAccess.getSSimpleTypesAccess().getTINY_INTEnumLiteralDeclaration_1()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:643:1: ( 'Tinyint' )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:643:3: 'Tinyint'
                    {
                    match(input,14,FOLLOW_14_in_rule__SSimpleTypes__Alternatives1315); 

                    }

                     after(grammarAccess.getSSimpleTypesAccess().getTINY_INTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:648:6: ( ( 'Smallint' ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:648:6: ( ( 'Smallint' ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:649:1: ( 'Smallint' )
                    {
                     before(grammarAccess.getSSimpleTypesAccess().getSMALL_INTEnumLiteralDeclaration_2()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:650:1: ( 'Smallint' )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:650:3: 'Smallint'
                    {
                    match(input,15,FOLLOW_15_in_rule__SSimpleTypes__Alternatives1336); 

                    }

                     after(grammarAccess.getSSimpleTypesAccess().getSMALL_INTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:655:6: ( ( 'Mediumint' ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:655:6: ( ( 'Mediumint' ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:656:1: ( 'Mediumint' )
                    {
                     before(grammarAccess.getSSimpleTypesAccess().getMEDIUM_INTEnumLiteralDeclaration_3()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:657:1: ( 'Mediumint' )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:657:3: 'Mediumint'
                    {
                    match(input,16,FOLLOW_16_in_rule__SSimpleTypes__Alternatives1357); 

                    }

                     after(grammarAccess.getSSimpleTypesAccess().getMEDIUM_INTEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:662:6: ( ( 'Boolean' ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:662:6: ( ( 'Boolean' ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:663:1: ( 'Boolean' )
                    {
                     before(grammarAccess.getSSimpleTypesAccess().getBOOLEANEnumLiteralDeclaration_4()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:664:1: ( 'Boolean' )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:664:3: 'Boolean'
                    {
                    match(input,17,FOLLOW_17_in_rule__SSimpleTypes__Alternatives1378); 

                    }

                     after(grammarAccess.getSSimpleTypesAccess().getBOOLEANEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:669:6: ( ( 'Blob' ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:669:6: ( ( 'Blob' ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:670:1: ( 'Blob' )
                    {
                     before(grammarAccess.getSSimpleTypesAccess().getBLOBEnumLiteralDeclaration_5()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:671:1: ( 'Blob' )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:671:3: 'Blob'
                    {
                    match(input,18,FOLLOW_18_in_rule__SSimpleTypes__Alternatives1399); 

                    }

                     after(grammarAccess.getSSimpleTypesAccess().getBLOBEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:676:6: ( ( 'Datetime' ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:676:6: ( ( 'Datetime' ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:677:1: ( 'Datetime' )
                    {
                     before(grammarAccess.getSSimpleTypesAccess().getDATETIMEEnumLiteralDeclaration_6()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:678:1: ( 'Datetime' )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:678:3: 'Datetime'
                    {
                    match(input,19,FOLLOW_19_in_rule__SSimpleTypes__Alternatives1420); 

                    }

                     after(grammarAccess.getSSimpleTypesAccess().getDATETIMEEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:683:6: ( ( 'Date' ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:683:6: ( ( 'Date' ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:684:1: ( 'Date' )
                    {
                     before(grammarAccess.getSSimpleTypesAccess().getDATEEnumLiteralDeclaration_7()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:685:1: ( 'Date' )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:685:3: 'Date'
                    {
                    match(input,20,FOLLOW_20_in_rule__SSimpleTypes__Alternatives1441); 

                    }

                     after(grammarAccess.getSSimpleTypesAccess().getDATEEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:690:6: ( ( 'Time' ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:690:6: ( ( 'Time' ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:691:1: ( 'Time' )
                    {
                     before(grammarAccess.getSSimpleTypesAccess().getTIMEEnumLiteralDeclaration_8()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:692:1: ( 'Time' )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:692:3: 'Time'
                    {
                    match(input,21,FOLLOW_21_in_rule__SSimpleTypes__Alternatives1462); 

                    }

                     after(grammarAccess.getSSimpleTypesAccess().getTIMEEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:697:6: ( ( 'Polygon' ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:697:6: ( ( 'Polygon' ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:698:1: ( 'Polygon' )
                    {
                     before(grammarAccess.getSSimpleTypesAccess().getPOLYGONEnumLiteralDeclaration_9()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:699:1: ( 'Polygon' )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:699:3: 'Polygon'
                    {
                    match(input,22,FOLLOW_22_in_rule__SSimpleTypes__Alternatives1483); 

                    }

                     after(grammarAccess.getSSimpleTypesAccess().getPOLYGONEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:704:6: ( ( 'Point' ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:704:6: ( ( 'Point' ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:705:1: ( 'Point' )
                    {
                     before(grammarAccess.getSSimpleTypesAccess().getPOINTEnumLiteralDeclaration_10()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:706:1: ( 'Point' )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:706:3: 'Point'
                    {
                    match(input,23,FOLLOW_23_in_rule__SSimpleTypes__Alternatives1504); 

                    }

                     after(grammarAccess.getSSimpleTypesAccess().getPOINTEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:711:6: ( ( 'Foto' ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:711:6: ( ( 'Foto' ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:712:1: ( 'Foto' )
                    {
                     before(grammarAccess.getSSimpleTypesAccess().getFOTOEnumLiteralDeclaration_11()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:713:1: ( 'Foto' )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:713:3: 'Foto'
                    {
                    match(input,24,FOLLOW_24_in_rule__SSimpleTypes__Alternatives1525); 

                    }

                     after(grammarAccess.getSSimpleTypesAccess().getFOTOEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:718:6: ( ( 'Currency' ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:718:6: ( ( 'Currency' ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:719:1: ( 'Currency' )
                    {
                     before(grammarAccess.getSSimpleTypesAccess().getCurrencyEnumLiteralDeclaration_12()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:720:1: ( 'Currency' )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:720:3: 'Currency'
                    {
                    match(input,25,FOLLOW_25_in_rule__SSimpleTypes__Alternatives1546); 

                    }

                     after(grammarAccess.getSSimpleTypesAccess().getCurrencyEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:725:6: ( ( 'Coordinate' ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:725:6: ( ( 'Coordinate' ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:726:1: ( 'Coordinate' )
                    {
                     before(grammarAccess.getSSimpleTypesAccess().getCoordinateEnumLiteralDeclaration_13()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:727:1: ( 'Coordinate' )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:727:3: 'Coordinate'
                    {
                    match(input,26,FOLLOW_26_in_rule__SSimpleTypes__Alternatives1567); 

                    }

                     after(grammarAccess.getSSimpleTypesAccess().getCoordinateEnumLiteralDeclaration_13()); 

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
    // $ANTLR end "rule__SSimpleTypes__Alternatives"


    // $ANTLR start "rule__SIndex__Alternatives"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:737:1: rule__SIndex__Alternatives : ( ( ( 'No' ) ) | ( ( 'Yes' ) ) | ( ( 'Unique' ) ) | ( ( 'Spatial' ) ) );
    public final void rule__SIndex__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:741:1: ( ( ( 'No' ) ) | ( ( 'Yes' ) ) | ( ( 'Unique' ) ) | ( ( 'Spatial' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt7=1;
                }
                break;
            case 28:
                {
                alt7=2;
                }
                break;
            case 29:
                {
                alt7=3;
                }
                break;
            case 30:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:742:1: ( ( 'No' ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:742:1: ( ( 'No' ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:743:1: ( 'No' )
                    {
                     before(grammarAccess.getSIndexAccess().getNOEnumLiteralDeclaration_0()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:744:1: ( 'No' )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:744:3: 'No'
                    {
                    match(input,27,FOLLOW_27_in_rule__SIndex__Alternatives1603); 

                    }

                     after(grammarAccess.getSIndexAccess().getNOEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:749:6: ( ( 'Yes' ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:749:6: ( ( 'Yes' ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:750:1: ( 'Yes' )
                    {
                     before(grammarAccess.getSIndexAccess().getYESEnumLiteralDeclaration_1()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:751:1: ( 'Yes' )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:751:3: 'Yes'
                    {
                    match(input,28,FOLLOW_28_in_rule__SIndex__Alternatives1624); 

                    }

                     after(grammarAccess.getSIndexAccess().getYESEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:756:6: ( ( 'Unique' ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:756:6: ( ( 'Unique' ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:757:1: ( 'Unique' )
                    {
                     before(grammarAccess.getSIndexAccess().getUNIQUEEnumLiteralDeclaration_2()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:758:1: ( 'Unique' )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:758:3: 'Unique'
                    {
                    match(input,29,FOLLOW_29_in_rule__SIndex__Alternatives1645); 

                    }

                     after(grammarAccess.getSIndexAccess().getUNIQUEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:763:6: ( ( 'Spatial' ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:763:6: ( ( 'Spatial' ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:764:1: ( 'Spatial' )
                    {
                     before(grammarAccess.getSIndexAccess().getSPATIALEnumLiteralDeclaration_3()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:765:1: ( 'Spatial' )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:765:3: 'Spatial'
                    {
                    match(input,30,FOLLOW_30_in_rule__SIndex__Alternatives1666); 

                    }

                     after(grammarAccess.getSIndexAccess().getSPATIALEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__SIndex__Alternatives"


    // $ANTLR start "rule__SModel__Group__0"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:777:1: rule__SModel__Group__0 : rule__SModel__Group__0__Impl rule__SModel__Group__1 ;
    public final void rule__SModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:781:1: ( rule__SModel__Group__0__Impl rule__SModel__Group__1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:782:2: rule__SModel__Group__0__Impl rule__SModel__Group__1
            {
            pushFollow(FOLLOW_rule__SModel__Group__0__Impl_in_rule__SModel__Group__01699);
            rule__SModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SModel__Group__1_in_rule__SModel__Group__01702);
            rule__SModel__Group__1();

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
    // $ANTLR end "rule__SModel__Group__0"


    // $ANTLR start "rule__SModel__Group__0__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:789:1: rule__SModel__Group__0__Impl : ( ( rule__SModel__Group_0__0 ) ) ;
    public final void rule__SModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:793:1: ( ( ( rule__SModel__Group_0__0 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:794:1: ( ( rule__SModel__Group_0__0 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:794:1: ( ( rule__SModel__Group_0__0 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:795:1: ( rule__SModel__Group_0__0 )
            {
             before(grammarAccess.getSModelAccess().getGroup_0()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:796:1: ( rule__SModel__Group_0__0 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:796:2: rule__SModel__Group_0__0
            {
            pushFollow(FOLLOW_rule__SModel__Group_0__0_in_rule__SModel__Group__0__Impl1729);
            rule__SModel__Group_0__0();

            state._fsp--;


            }

             after(grammarAccess.getSModelAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SModel__Group__0__Impl"


    // $ANTLR start "rule__SModel__Group__1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:806:1: rule__SModel__Group__1 : rule__SModel__Group__1__Impl rule__SModel__Group__2 ;
    public final void rule__SModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:810:1: ( rule__SModel__Group__1__Impl rule__SModel__Group__2 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:811:2: rule__SModel__Group__1__Impl rule__SModel__Group__2
            {
            pushFollow(FOLLOW_rule__SModel__Group__1__Impl_in_rule__SModel__Group__11759);
            rule__SModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SModel__Group__2_in_rule__SModel__Group__11762);
            rule__SModel__Group__2();

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
    // $ANTLR end "rule__SModel__Group__1"


    // $ANTLR start "rule__SModel__Group__1__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:818:1: rule__SModel__Group__1__Impl : ( ( rule__SModel__SettingsAssignment_1 )? ) ;
    public final void rule__SModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:822:1: ( ( ( rule__SModel__SettingsAssignment_1 )? ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:823:1: ( ( rule__SModel__SettingsAssignment_1 )? )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:823:1: ( ( rule__SModel__SettingsAssignment_1 )? )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:824:1: ( rule__SModel__SettingsAssignment_1 )?
            {
             before(grammarAccess.getSModelAccess().getSettingsAssignment_1()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:825:1: ( rule__SModel__SettingsAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==32) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:825:2: rule__SModel__SettingsAssignment_1
                    {
                    pushFollow(FOLLOW_rule__SModel__SettingsAssignment_1_in_rule__SModel__Group__1__Impl1789);
                    rule__SModel__SettingsAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSModelAccess().getSettingsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SModel__Group__1__Impl"


    // $ANTLR start "rule__SModel__Group__2"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:835:1: rule__SModel__Group__2 : rule__SModel__Group__2__Impl ;
    public final void rule__SModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:839:1: ( rule__SModel__Group__2__Impl )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:840:2: rule__SModel__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SModel__Group__2__Impl_in_rule__SModel__Group__21820);
            rule__SModel__Group__2__Impl();

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
    // $ANTLR end "rule__SModel__Group__2"


    // $ANTLR start "rule__SModel__Group__2__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:846:1: rule__SModel__Group__2__Impl : ( ( rule__SModel__ArtifactAssignment_2 )* ) ;
    public final void rule__SModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:850:1: ( ( ( rule__SModel__ArtifactAssignment_2 )* ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:851:1: ( ( rule__SModel__ArtifactAssignment_2 )* )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:851:1: ( ( rule__SModel__ArtifactAssignment_2 )* )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:852:1: ( rule__SModel__ArtifactAssignment_2 )*
            {
             before(grammarAccess.getSModelAccess().getArtifactAssignment_2()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:853:1: ( rule__SModel__ArtifactAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==37||LA9_0==47) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:853:2: rule__SModel__ArtifactAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__SModel__ArtifactAssignment_2_in_rule__SModel__Group__2__Impl1847);
            	    rule__SModel__ArtifactAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSModelAccess().getArtifactAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SModel__Group__2__Impl"


    // $ANTLR start "rule__SModel__Group_0__0"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:869:1: rule__SModel__Group_0__0 : rule__SModel__Group_0__0__Impl rule__SModel__Group_0__1 ;
    public final void rule__SModel__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:873:1: ( rule__SModel__Group_0__0__Impl rule__SModel__Group_0__1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:874:2: rule__SModel__Group_0__0__Impl rule__SModel__Group_0__1
            {
            pushFollow(FOLLOW_rule__SModel__Group_0__0__Impl_in_rule__SModel__Group_0__01884);
            rule__SModel__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SModel__Group_0__1_in_rule__SModel__Group_0__01887);
            rule__SModel__Group_0__1();

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
    // $ANTLR end "rule__SModel__Group_0__0"


    // $ANTLR start "rule__SModel__Group_0__0__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:881:1: rule__SModel__Group_0__0__Impl : ( 'generatedFile' ) ;
    public final void rule__SModel__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:885:1: ( ( 'generatedFile' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:886:1: ( 'generatedFile' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:886:1: ( 'generatedFile' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:887:1: 'generatedFile'
            {
             before(grammarAccess.getSModelAccess().getGeneratedFileKeyword_0_0()); 
            match(input,31,FOLLOW_31_in_rule__SModel__Group_0__0__Impl1915); 
             after(grammarAccess.getSModelAccess().getGeneratedFileKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SModel__Group_0__0__Impl"


    // $ANTLR start "rule__SModel__Group_0__1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:900:1: rule__SModel__Group_0__1 : rule__SModel__Group_0__1__Impl ;
    public final void rule__SModel__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:904:1: ( rule__SModel__Group_0__1__Impl )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:905:2: rule__SModel__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__SModel__Group_0__1__Impl_in_rule__SModel__Group_0__11946);
            rule__SModel__Group_0__1__Impl();

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
    // $ANTLR end "rule__SModel__Group_0__1"


    // $ANTLR start "rule__SModel__Group_0__1__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:911:1: rule__SModel__Group_0__1__Impl : ( ( rule__SModel__GeneratedFileAssignment_0_1 ) ) ;
    public final void rule__SModel__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:915:1: ( ( ( rule__SModel__GeneratedFileAssignment_0_1 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:916:1: ( ( rule__SModel__GeneratedFileAssignment_0_1 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:916:1: ( ( rule__SModel__GeneratedFileAssignment_0_1 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:917:1: ( rule__SModel__GeneratedFileAssignment_0_1 )
            {
             before(grammarAccess.getSModelAccess().getGeneratedFileAssignment_0_1()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:918:1: ( rule__SModel__GeneratedFileAssignment_0_1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:918:2: rule__SModel__GeneratedFileAssignment_0_1
            {
            pushFollow(FOLLOW_rule__SModel__GeneratedFileAssignment_0_1_in_rule__SModel__Group_0__1__Impl1973);
            rule__SModel__GeneratedFileAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSModelAccess().getGeneratedFileAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SModel__Group_0__1__Impl"


    // $ANTLR start "rule__SSettings__Group__0"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:932:1: rule__SSettings__Group__0 : rule__SSettings__Group__0__Impl rule__SSettings__Group__1 ;
    public final void rule__SSettings__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:936:1: ( rule__SSettings__Group__0__Impl rule__SSettings__Group__1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:937:2: rule__SSettings__Group__0__Impl rule__SSettings__Group__1
            {
            pushFollow(FOLLOW_rule__SSettings__Group__0__Impl_in_rule__SSettings__Group__02007);
            rule__SSettings__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SSettings__Group__1_in_rule__SSettings__Group__02010);
            rule__SSettings__Group__1();

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
    // $ANTLR end "rule__SSettings__Group__0"


    // $ANTLR start "rule__SSettings__Group__0__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:944:1: rule__SSettings__Group__0__Impl : ( () ) ;
    public final void rule__SSettings__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:948:1: ( ( () ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:949:1: ( () )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:949:1: ( () )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:950:1: ()
            {
             before(grammarAccess.getSSettingsAccess().getSSettingsAction_0()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:951:1: ()
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:953:1: 
            {
            }

             after(grammarAccess.getSSettingsAccess().getSSettingsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SSettings__Group__0__Impl"


    // $ANTLR start "rule__SSettings__Group__1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:963:1: rule__SSettings__Group__1 : rule__SSettings__Group__1__Impl rule__SSettings__Group__2 ;
    public final void rule__SSettings__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:967:1: ( rule__SSettings__Group__1__Impl rule__SSettings__Group__2 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:968:2: rule__SSettings__Group__1__Impl rule__SSettings__Group__2
            {
            pushFollow(FOLLOW_rule__SSettings__Group__1__Impl_in_rule__SSettings__Group__12068);
            rule__SSettings__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SSettings__Group__2_in_rule__SSettings__Group__12071);
            rule__SSettings__Group__2();

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
    // $ANTLR end "rule__SSettings__Group__1"


    // $ANTLR start "rule__SSettings__Group__1__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:975:1: rule__SSettings__Group__1__Impl : ( 'settings {' ) ;
    public final void rule__SSettings__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:979:1: ( ( 'settings {' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:980:1: ( 'settings {' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:980:1: ( 'settings {' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:981:1: 'settings {'
            {
             before(grammarAccess.getSSettingsAccess().getSettingsKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__SSettings__Group__1__Impl2099); 
             after(grammarAccess.getSSettingsAccess().getSettingsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SSettings__Group__1__Impl"


    // $ANTLR start "rule__SSettings__Group__2"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:994:1: rule__SSettings__Group__2 : rule__SSettings__Group__2__Impl rule__SSettings__Group__3 ;
    public final void rule__SSettings__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:998:1: ( rule__SSettings__Group__2__Impl rule__SSettings__Group__3 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:999:2: rule__SSettings__Group__2__Impl rule__SSettings__Group__3
            {
            pushFollow(FOLLOW_rule__SSettings__Group__2__Impl_in_rule__SSettings__Group__22130);
            rule__SSettings__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SSettings__Group__3_in_rule__SSettings__Group__22133);
            rule__SSettings__Group__3();

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
    // $ANTLR end "rule__SSettings__Group__2"


    // $ANTLR start "rule__SSettings__Group__2__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1006:1: rule__SSettings__Group__2__Impl : ( ( rule__SSettings__UnorderedGroup_2 ) ) ;
    public final void rule__SSettings__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1010:1: ( ( ( rule__SSettings__UnorderedGroup_2 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1011:1: ( ( rule__SSettings__UnorderedGroup_2 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1011:1: ( ( rule__SSettings__UnorderedGroup_2 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1012:1: ( rule__SSettings__UnorderedGroup_2 )
            {
             before(grammarAccess.getSSettingsAccess().getUnorderedGroup_2()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1013:1: ( rule__SSettings__UnorderedGroup_2 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1013:2: rule__SSettings__UnorderedGroup_2
            {
            pushFollow(FOLLOW_rule__SSettings__UnorderedGroup_2_in_rule__SSettings__Group__2__Impl2160);
            rule__SSettings__UnorderedGroup_2();

            state._fsp--;


            }

             after(grammarAccess.getSSettingsAccess().getUnorderedGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SSettings__Group__2__Impl"


    // $ANTLR start "rule__SSettings__Group__3"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1023:1: rule__SSettings__Group__3 : rule__SSettings__Group__3__Impl ;
    public final void rule__SSettings__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1027:1: ( rule__SSettings__Group__3__Impl )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1028:2: rule__SSettings__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SSettings__Group__3__Impl_in_rule__SSettings__Group__32190);
            rule__SSettings__Group__3__Impl();

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
    // $ANTLR end "rule__SSettings__Group__3"


    // $ANTLR start "rule__SSettings__Group__3__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1034:1: rule__SSettings__Group__3__Impl : ( '}' ) ;
    public final void rule__SSettings__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1038:1: ( ( '}' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1039:1: ( '}' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1039:1: ( '}' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1040:1: '}'
            {
             before(grammarAccess.getSSettingsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,33,FOLLOW_33_in_rule__SSettings__Group__3__Impl2218); 
             after(grammarAccess.getSSettingsAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SSettings__Group__3__Impl"


    // $ANTLR start "rule__SSettings__Group_2_0__0"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1061:1: rule__SSettings__Group_2_0__0 : rule__SSettings__Group_2_0__0__Impl rule__SSettings__Group_2_0__1 ;
    public final void rule__SSettings__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1065:1: ( rule__SSettings__Group_2_0__0__Impl rule__SSettings__Group_2_0__1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1066:2: rule__SSettings__Group_2_0__0__Impl rule__SSettings__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__SSettings__Group_2_0__0__Impl_in_rule__SSettings__Group_2_0__02257);
            rule__SSettings__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SSettings__Group_2_0__1_in_rule__SSettings__Group_2_0__02260);
            rule__SSettings__Group_2_0__1();

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
    // $ANTLR end "rule__SSettings__Group_2_0__0"


    // $ANTLR start "rule__SSettings__Group_2_0__0__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1073:1: rule__SSettings__Group_2_0__0__Impl : ( 'schema=' ) ;
    public final void rule__SSettings__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1077:1: ( ( 'schema=' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1078:1: ( 'schema=' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1078:1: ( 'schema=' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1079:1: 'schema='
            {
             before(grammarAccess.getSSettingsAccess().getSchemaKeyword_2_0_0()); 
            match(input,34,FOLLOW_34_in_rule__SSettings__Group_2_0__0__Impl2288); 
             after(grammarAccess.getSSettingsAccess().getSchemaKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SSettings__Group_2_0__0__Impl"


    // $ANTLR start "rule__SSettings__Group_2_0__1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1092:1: rule__SSettings__Group_2_0__1 : rule__SSettings__Group_2_0__1__Impl ;
    public final void rule__SSettings__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1096:1: ( rule__SSettings__Group_2_0__1__Impl )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1097:2: rule__SSettings__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_rule__SSettings__Group_2_0__1__Impl_in_rule__SSettings__Group_2_0__12319);
            rule__SSettings__Group_2_0__1__Impl();

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
    // $ANTLR end "rule__SSettings__Group_2_0__1"


    // $ANTLR start "rule__SSettings__Group_2_0__1__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1103:1: rule__SSettings__Group_2_0__1__Impl : ( ( rule__SSettings__SchemaAssignment_2_0_1 ) ) ;
    public final void rule__SSettings__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1107:1: ( ( ( rule__SSettings__SchemaAssignment_2_0_1 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1108:1: ( ( rule__SSettings__SchemaAssignment_2_0_1 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1108:1: ( ( rule__SSettings__SchemaAssignment_2_0_1 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1109:1: ( rule__SSettings__SchemaAssignment_2_0_1 )
            {
             before(grammarAccess.getSSettingsAccess().getSchemaAssignment_2_0_1()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1110:1: ( rule__SSettings__SchemaAssignment_2_0_1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1110:2: rule__SSettings__SchemaAssignment_2_0_1
            {
            pushFollow(FOLLOW_rule__SSettings__SchemaAssignment_2_0_1_in_rule__SSettings__Group_2_0__1__Impl2346);
            rule__SSettings__SchemaAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSSettingsAccess().getSchemaAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SSettings__Group_2_0__1__Impl"


    // $ANTLR start "rule__SSettings__Group_2_1__0"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1124:1: rule__SSettings__Group_2_1__0 : rule__SSettings__Group_2_1__0__Impl rule__SSettings__Group_2_1__1 ;
    public final void rule__SSettings__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1128:1: ( rule__SSettings__Group_2_1__0__Impl rule__SSettings__Group_2_1__1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1129:2: rule__SSettings__Group_2_1__0__Impl rule__SSettings__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__SSettings__Group_2_1__0__Impl_in_rule__SSettings__Group_2_1__02380);
            rule__SSettings__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SSettings__Group_2_1__1_in_rule__SSettings__Group_2_1__02383);
            rule__SSettings__Group_2_1__1();

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
    // $ANTLR end "rule__SSettings__Group_2_1__0"


    // $ANTLR start "rule__SSettings__Group_2_1__0__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1136:1: rule__SSettings__Group_2_1__0__Impl : ( 'javapackage=' ) ;
    public final void rule__SSettings__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1140:1: ( ( 'javapackage=' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1141:1: ( 'javapackage=' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1141:1: ( 'javapackage=' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1142:1: 'javapackage='
            {
             before(grammarAccess.getSSettingsAccess().getJavapackageKeyword_2_1_0()); 
            match(input,35,FOLLOW_35_in_rule__SSettings__Group_2_1__0__Impl2411); 
             after(grammarAccess.getSSettingsAccess().getJavapackageKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SSettings__Group_2_1__0__Impl"


    // $ANTLR start "rule__SSettings__Group_2_1__1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1155:1: rule__SSettings__Group_2_1__1 : rule__SSettings__Group_2_1__1__Impl ;
    public final void rule__SSettings__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1159:1: ( rule__SSettings__Group_2_1__1__Impl )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1160:2: rule__SSettings__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SSettings__Group_2_1__1__Impl_in_rule__SSettings__Group_2_1__12442);
            rule__SSettings__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__SSettings__Group_2_1__1"


    // $ANTLR start "rule__SSettings__Group_2_1__1__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1166:1: rule__SSettings__Group_2_1__1__Impl : ( ( rule__SSettings__JavapackageAssignment_2_1_1 ) ) ;
    public final void rule__SSettings__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1170:1: ( ( ( rule__SSettings__JavapackageAssignment_2_1_1 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1171:1: ( ( rule__SSettings__JavapackageAssignment_2_1_1 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1171:1: ( ( rule__SSettings__JavapackageAssignment_2_1_1 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1172:1: ( rule__SSettings__JavapackageAssignment_2_1_1 )
            {
             before(grammarAccess.getSSettingsAccess().getJavapackageAssignment_2_1_1()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1173:1: ( rule__SSettings__JavapackageAssignment_2_1_1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1173:2: rule__SSettings__JavapackageAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__SSettings__JavapackageAssignment_2_1_1_in_rule__SSettings__Group_2_1__1__Impl2469);
            rule__SSettings__JavapackageAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSSettingsAccess().getJavapackageAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SSettings__Group_2_1__1__Impl"


    // $ANTLR start "rule__SSettings__Group_2_2__0"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1187:1: rule__SSettings__Group_2_2__0 : rule__SSettings__Group_2_2__0__Impl rule__SSettings__Group_2_2__1 ;
    public final void rule__SSettings__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1191:1: ( rule__SSettings__Group_2_2__0__Impl rule__SSettings__Group_2_2__1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1192:2: rule__SSettings__Group_2_2__0__Impl rule__SSettings__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__SSettings__Group_2_2__0__Impl_in_rule__SSettings__Group_2_2__02503);
            rule__SSettings__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SSettings__Group_2_2__1_in_rule__SSettings__Group_2_2__02506);
            rule__SSettings__Group_2_2__1();

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
    // $ANTLR end "rule__SSettings__Group_2_2__0"


    // $ANTLR start "rule__SSettings__Group_2_2__0__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1199:1: rule__SSettings__Group_2_2__0__Impl : ( 'engine=' ) ;
    public final void rule__SSettings__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1203:1: ( ( 'engine=' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1204:1: ( 'engine=' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1204:1: ( 'engine=' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1205:1: 'engine='
            {
             before(grammarAccess.getSSettingsAccess().getEngineKeyword_2_2_0()); 
            match(input,36,FOLLOW_36_in_rule__SSettings__Group_2_2__0__Impl2534); 
             after(grammarAccess.getSSettingsAccess().getEngineKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SSettings__Group_2_2__0__Impl"


    // $ANTLR start "rule__SSettings__Group_2_2__1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1218:1: rule__SSettings__Group_2_2__1 : rule__SSettings__Group_2_2__1__Impl ;
    public final void rule__SSettings__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1222:1: ( rule__SSettings__Group_2_2__1__Impl )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1223:2: rule__SSettings__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SSettings__Group_2_2__1__Impl_in_rule__SSettings__Group_2_2__12565);
            rule__SSettings__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__SSettings__Group_2_2__1"


    // $ANTLR start "rule__SSettings__Group_2_2__1__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1229:1: rule__SSettings__Group_2_2__1__Impl : ( ( rule__SSettings__EngineAssignment_2_2_1 ) ) ;
    public final void rule__SSettings__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1233:1: ( ( ( rule__SSettings__EngineAssignment_2_2_1 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1234:1: ( ( rule__SSettings__EngineAssignment_2_2_1 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1234:1: ( ( rule__SSettings__EngineAssignment_2_2_1 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1235:1: ( rule__SSettings__EngineAssignment_2_2_1 )
            {
             before(grammarAccess.getSSettingsAccess().getEngineAssignment_2_2_1()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1236:1: ( rule__SSettings__EngineAssignment_2_2_1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1236:2: rule__SSettings__EngineAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__SSettings__EngineAssignment_2_2_1_in_rule__SSettings__Group_2_2__1__Impl2592);
            rule__SSettings__EngineAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSSettingsAccess().getEngineAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SSettings__Group_2_2__1__Impl"


    // $ANTLR start "rule__STable__Group__0"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1250:1: rule__STable__Group__0 : rule__STable__Group__0__Impl rule__STable__Group__1 ;
    public final void rule__STable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1254:1: ( rule__STable__Group__0__Impl rule__STable__Group__1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1255:2: rule__STable__Group__0__Impl rule__STable__Group__1
            {
            pushFollow(FOLLOW_rule__STable__Group__0__Impl_in_rule__STable__Group__02626);
            rule__STable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__STable__Group__1_in_rule__STable__Group__02629);
            rule__STable__Group__1();

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
    // $ANTLR end "rule__STable__Group__0"


    // $ANTLR start "rule__STable__Group__0__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1262:1: rule__STable__Group__0__Impl : ( 'table' ) ;
    public final void rule__STable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1266:1: ( ( 'table' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1267:1: ( 'table' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1267:1: ( 'table' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1268:1: 'table'
            {
             before(grammarAccess.getSTableAccess().getTableKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__STable__Group__0__Impl2657); 
             after(grammarAccess.getSTableAccess().getTableKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STable__Group__0__Impl"


    // $ANTLR start "rule__STable__Group__1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1281:1: rule__STable__Group__1 : rule__STable__Group__1__Impl rule__STable__Group__2 ;
    public final void rule__STable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1285:1: ( rule__STable__Group__1__Impl rule__STable__Group__2 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1286:2: rule__STable__Group__1__Impl rule__STable__Group__2
            {
            pushFollow(FOLLOW_rule__STable__Group__1__Impl_in_rule__STable__Group__12688);
            rule__STable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__STable__Group__2_in_rule__STable__Group__12691);
            rule__STable__Group__2();

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
    // $ANTLR end "rule__STable__Group__1"


    // $ANTLR start "rule__STable__Group__1__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1293:1: rule__STable__Group__1__Impl : ( ( rule__STable__NameAssignment_1 ) ) ;
    public final void rule__STable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1297:1: ( ( ( rule__STable__NameAssignment_1 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1298:1: ( ( rule__STable__NameAssignment_1 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1298:1: ( ( rule__STable__NameAssignment_1 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1299:1: ( rule__STable__NameAssignment_1 )
            {
             before(grammarAccess.getSTableAccess().getNameAssignment_1()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1300:1: ( rule__STable__NameAssignment_1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1300:2: rule__STable__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__STable__NameAssignment_1_in_rule__STable__Group__1__Impl2718);
            rule__STable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSTableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STable__Group__1__Impl"


    // $ANTLR start "rule__STable__Group__2"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1310:1: rule__STable__Group__2 : rule__STable__Group__2__Impl rule__STable__Group__3 ;
    public final void rule__STable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1314:1: ( rule__STable__Group__2__Impl rule__STable__Group__3 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1315:2: rule__STable__Group__2__Impl rule__STable__Group__3
            {
            pushFollow(FOLLOW_rule__STable__Group__2__Impl_in_rule__STable__Group__22748);
            rule__STable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__STable__Group__3_in_rule__STable__Group__22751);
            rule__STable__Group__3();

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
    // $ANTLR end "rule__STable__Group__2"


    // $ANTLR start "rule__STable__Group__2__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1322:1: rule__STable__Group__2__Impl : ( '{' ) ;
    public final void rule__STable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1326:1: ( ( '{' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1327:1: ( '{' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1327:1: ( '{' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1328:1: '{'
            {
             before(grammarAccess.getSTableAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,38,FOLLOW_38_in_rule__STable__Group__2__Impl2779); 
             after(grammarAccess.getSTableAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STable__Group__2__Impl"


    // $ANTLR start "rule__STable__Group__3"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1341:1: rule__STable__Group__3 : rule__STable__Group__3__Impl rule__STable__Group__4 ;
    public final void rule__STable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1345:1: ( rule__STable__Group__3__Impl rule__STable__Group__4 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1346:2: rule__STable__Group__3__Impl rule__STable__Group__4
            {
            pushFollow(FOLLOW_rule__STable__Group__3__Impl_in_rule__STable__Group__32810);
            rule__STable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__STable__Group__4_in_rule__STable__Group__32813);
            rule__STable__Group__4();

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
    // $ANTLR end "rule__STable__Group__3"


    // $ANTLR start "rule__STable__Group__3__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1353:1: rule__STable__Group__3__Impl : ( ( rule__STable__UnorderedGroup_3 ) ) ;
    public final void rule__STable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1357:1: ( ( ( rule__STable__UnorderedGroup_3 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1358:1: ( ( rule__STable__UnorderedGroup_3 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1358:1: ( ( rule__STable__UnorderedGroup_3 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1359:1: ( rule__STable__UnorderedGroup_3 )
            {
             before(grammarAccess.getSTableAccess().getUnorderedGroup_3()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1360:1: ( rule__STable__UnorderedGroup_3 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1360:2: rule__STable__UnorderedGroup_3
            {
            pushFollow(FOLLOW_rule__STable__UnorderedGroup_3_in_rule__STable__Group__3__Impl2840);
            rule__STable__UnorderedGroup_3();

            state._fsp--;


            }

             after(grammarAccess.getSTableAccess().getUnorderedGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STable__Group__3__Impl"


    // $ANTLR start "rule__STable__Group__4"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1370:1: rule__STable__Group__4 : rule__STable__Group__4__Impl rule__STable__Group__5 ;
    public final void rule__STable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1374:1: ( rule__STable__Group__4__Impl rule__STable__Group__5 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1375:2: rule__STable__Group__4__Impl rule__STable__Group__5
            {
            pushFollow(FOLLOW_rule__STable__Group__4__Impl_in_rule__STable__Group__42870);
            rule__STable__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__STable__Group__5_in_rule__STable__Group__42873);
            rule__STable__Group__5();

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
    // $ANTLR end "rule__STable__Group__4"


    // $ANTLR start "rule__STable__Group__4__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1382:1: rule__STable__Group__4__Impl : ( ( rule__STable__ColumnsAssignment_4 )* ) ;
    public final void rule__STable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1386:1: ( ( ( rule__STable__ColumnsAssignment_4 )* ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1387:1: ( ( rule__STable__ColumnsAssignment_4 )* )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1387:1: ( ( rule__STable__ColumnsAssignment_4 )* )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1388:1: ( rule__STable__ColumnsAssignment_4 )*
            {
             before(grammarAccess.getSTableAccess().getColumnsAssignment_4()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1389:1: ( rule__STable__ColumnsAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=42 && LA10_0<=43)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1389:2: rule__STable__ColumnsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__STable__ColumnsAssignment_4_in_rule__STable__Group__4__Impl2900);
            	    rule__STable__ColumnsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSTableAccess().getColumnsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STable__Group__4__Impl"


    // $ANTLR start "rule__STable__Group__5"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1399:1: rule__STable__Group__5 : rule__STable__Group__5__Impl ;
    public final void rule__STable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1403:1: ( rule__STable__Group__5__Impl )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1404:2: rule__STable__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__STable__Group__5__Impl_in_rule__STable__Group__52931);
            rule__STable__Group__5__Impl();

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
    // $ANTLR end "rule__STable__Group__5"


    // $ANTLR start "rule__STable__Group__5__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1410:1: rule__STable__Group__5__Impl : ( '}' ) ;
    public final void rule__STable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1414:1: ( ( '}' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1415:1: ( '}' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1415:1: ( '}' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1416:1: '}'
            {
             before(grammarAccess.getSTableAccess().getRightCurlyBracketKeyword_5()); 
            match(input,33,FOLLOW_33_in_rule__STable__Group__5__Impl2959); 
             after(grammarAccess.getSTableAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STable__Group__5__Impl"


    // $ANTLR start "rule__STable__Group_3_1__0"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1441:1: rule__STable__Group_3_1__0 : rule__STable__Group_3_1__0__Impl rule__STable__Group_3_1__1 ;
    public final void rule__STable__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1445:1: ( rule__STable__Group_3_1__0__Impl rule__STable__Group_3_1__1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1446:2: rule__STable__Group_3_1__0__Impl rule__STable__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__STable__Group_3_1__0__Impl_in_rule__STable__Group_3_1__03002);
            rule__STable__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__STable__Group_3_1__1_in_rule__STable__Group_3_1__03005);
            rule__STable__Group_3_1__1();

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
    // $ANTLR end "rule__STable__Group_3_1__0"


    // $ANTLR start "rule__STable__Group_3_1__0__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1453:1: rule__STable__Group_3_1__0__Impl : ( 'entityname=' ) ;
    public final void rule__STable__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1457:1: ( ( 'entityname=' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1458:1: ( 'entityname=' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1458:1: ( 'entityname=' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1459:1: 'entityname='
            {
             before(grammarAccess.getSTableAccess().getEntitynameKeyword_3_1_0()); 
            match(input,39,FOLLOW_39_in_rule__STable__Group_3_1__0__Impl3033); 
             after(grammarAccess.getSTableAccess().getEntitynameKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STable__Group_3_1__0__Impl"


    // $ANTLR start "rule__STable__Group_3_1__1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1472:1: rule__STable__Group_3_1__1 : rule__STable__Group_3_1__1__Impl ;
    public final void rule__STable__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1476:1: ( rule__STable__Group_3_1__1__Impl )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1477:2: rule__STable__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__STable__Group_3_1__1__Impl_in_rule__STable__Group_3_1__13064);
            rule__STable__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__STable__Group_3_1__1"


    // $ANTLR start "rule__STable__Group_3_1__1__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1483:1: rule__STable__Group_3_1__1__Impl : ( ( rule__STable__EntitynameAssignment_3_1_1 ) ) ;
    public final void rule__STable__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1487:1: ( ( ( rule__STable__EntitynameAssignment_3_1_1 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1488:1: ( ( rule__STable__EntitynameAssignment_3_1_1 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1488:1: ( ( rule__STable__EntitynameAssignment_3_1_1 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1489:1: ( rule__STable__EntitynameAssignment_3_1_1 )
            {
             before(grammarAccess.getSTableAccess().getEntitynameAssignment_3_1_1()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1490:1: ( rule__STable__EntitynameAssignment_3_1_1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1490:2: rule__STable__EntitynameAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__STable__EntitynameAssignment_3_1_1_in_rule__STable__Group_3_1__1__Impl3091);
            rule__STable__EntitynameAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSTableAccess().getEntitynameAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STable__Group_3_1__1__Impl"


    // $ANTLR start "rule__STable__Group_3_3__0"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1504:1: rule__STable__Group_3_3__0 : rule__STable__Group_3_3__0__Impl rule__STable__Group_3_3__1 ;
    public final void rule__STable__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1508:1: ( rule__STable__Group_3_3__0__Impl rule__STable__Group_3_3__1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1509:2: rule__STable__Group_3_3__0__Impl rule__STable__Group_3_3__1
            {
            pushFollow(FOLLOW_rule__STable__Group_3_3__0__Impl_in_rule__STable__Group_3_3__03125);
            rule__STable__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__STable__Group_3_3__1_in_rule__STable__Group_3_3__03128);
            rule__STable__Group_3_3__1();

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
    // $ANTLR end "rule__STable__Group_3_3__0"


    // $ANTLR start "rule__STable__Group_3_3__0__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1516:1: rule__STable__Group_3_3__0__Impl : ( 'prefix' ) ;
    public final void rule__STable__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1520:1: ( ( 'prefix' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1521:1: ( 'prefix' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1521:1: ( 'prefix' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1522:1: 'prefix'
            {
             before(grammarAccess.getSTableAccess().getPrefixKeyword_3_3_0()); 
            match(input,40,FOLLOW_40_in_rule__STable__Group_3_3__0__Impl3156); 
             after(grammarAccess.getSTableAccess().getPrefixKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STable__Group_3_3__0__Impl"


    // $ANTLR start "rule__STable__Group_3_3__1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1535:1: rule__STable__Group_3_3__1 : rule__STable__Group_3_3__1__Impl rule__STable__Group_3_3__2 ;
    public final void rule__STable__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1539:1: ( rule__STable__Group_3_3__1__Impl rule__STable__Group_3_3__2 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1540:2: rule__STable__Group_3_3__1__Impl rule__STable__Group_3_3__2
            {
            pushFollow(FOLLOW_rule__STable__Group_3_3__1__Impl_in_rule__STable__Group_3_3__13187);
            rule__STable__Group_3_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__STable__Group_3_3__2_in_rule__STable__Group_3_3__13190);
            rule__STable__Group_3_3__2();

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
    // $ANTLR end "rule__STable__Group_3_3__1"


    // $ANTLR start "rule__STable__Group_3_3__1__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1547:1: rule__STable__Group_3_3__1__Impl : ( ( rule__STable__PrefixAssignment_3_3_1 ) ) ;
    public final void rule__STable__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1551:1: ( ( ( rule__STable__PrefixAssignment_3_3_1 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1552:1: ( ( rule__STable__PrefixAssignment_3_3_1 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1552:1: ( ( rule__STable__PrefixAssignment_3_3_1 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1553:1: ( rule__STable__PrefixAssignment_3_3_1 )
            {
             before(grammarAccess.getSTableAccess().getPrefixAssignment_3_3_1()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1554:1: ( rule__STable__PrefixAssignment_3_3_1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1554:2: rule__STable__PrefixAssignment_3_3_1
            {
            pushFollow(FOLLOW_rule__STable__PrefixAssignment_3_3_1_in_rule__STable__Group_3_3__1__Impl3217);
            rule__STable__PrefixAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSTableAccess().getPrefixAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STable__Group_3_3__1__Impl"


    // $ANTLR start "rule__STable__Group_3_3__2"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1564:1: rule__STable__Group_3_3__2 : rule__STable__Group_3_3__2__Impl ;
    public final void rule__STable__Group_3_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1568:1: ( rule__STable__Group_3_3__2__Impl )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1569:2: rule__STable__Group_3_3__2__Impl
            {
            pushFollow(FOLLOW_rule__STable__Group_3_3__2__Impl_in_rule__STable__Group_3_3__23247);
            rule__STable__Group_3_3__2__Impl();

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
    // $ANTLR end "rule__STable__Group_3_3__2"


    // $ANTLR start "rule__STable__Group_3_3__2__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1575:1: rule__STable__Group_3_3__2__Impl : ( ';' ) ;
    public final void rule__STable__Group_3_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1579:1: ( ( ';' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1580:1: ( ';' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1580:1: ( ';' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1581:1: ';'
            {
             before(grammarAccess.getSTableAccess().getSemicolonKeyword_3_3_2()); 
            match(input,41,FOLLOW_41_in_rule__STable__Group_3_3__2__Impl3275); 
             after(grammarAccess.getSTableAccess().getSemicolonKeyword_3_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STable__Group_3_3__2__Impl"


    // $ANTLR start "rule__SColumn__Group__0"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1600:1: rule__SColumn__Group__0 : rule__SColumn__Group__0__Impl rule__SColumn__Group__1 ;
    public final void rule__SColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1604:1: ( rule__SColumn__Group__0__Impl rule__SColumn__Group__1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1605:2: rule__SColumn__Group__0__Impl rule__SColumn__Group__1
            {
            pushFollow(FOLLOW_rule__SColumn__Group__0__Impl_in_rule__SColumn__Group__03312);
            rule__SColumn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SColumn__Group__1_in_rule__SColumn__Group__03315);
            rule__SColumn__Group__1();

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
    // $ANTLR end "rule__SColumn__Group__0"


    // $ANTLR start "rule__SColumn__Group__0__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1612:1: rule__SColumn__Group__0__Impl : ( 'column' ) ;
    public final void rule__SColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1616:1: ( ( 'column' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1617:1: ( 'column' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1617:1: ( 'column' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1618:1: 'column'
            {
             before(grammarAccess.getSColumnAccess().getColumnKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__SColumn__Group__0__Impl3343); 
             after(grammarAccess.getSColumnAccess().getColumnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SColumn__Group__0__Impl"


    // $ANTLR start "rule__SColumn__Group__1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1631:1: rule__SColumn__Group__1 : rule__SColumn__Group__1__Impl rule__SColumn__Group__2 ;
    public final void rule__SColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1635:1: ( rule__SColumn__Group__1__Impl rule__SColumn__Group__2 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1636:2: rule__SColumn__Group__1__Impl rule__SColumn__Group__2
            {
            pushFollow(FOLLOW_rule__SColumn__Group__1__Impl_in_rule__SColumn__Group__13374);
            rule__SColumn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SColumn__Group__2_in_rule__SColumn__Group__13377);
            rule__SColumn__Group__2();

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
    // $ANTLR end "rule__SColumn__Group__1"


    // $ANTLR start "rule__SColumn__Group__1__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1643:1: rule__SColumn__Group__1__Impl : ( ( rule__SColumn__NameAssignment_1 ) ) ;
    public final void rule__SColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1647:1: ( ( ( rule__SColumn__NameAssignment_1 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1648:1: ( ( rule__SColumn__NameAssignment_1 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1648:1: ( ( rule__SColumn__NameAssignment_1 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1649:1: ( rule__SColumn__NameAssignment_1 )
            {
             before(grammarAccess.getSColumnAccess().getNameAssignment_1()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1650:1: ( rule__SColumn__NameAssignment_1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1650:2: rule__SColumn__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SColumn__NameAssignment_1_in_rule__SColumn__Group__1__Impl3404);
            rule__SColumn__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSColumnAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SColumn__Group__1__Impl"


    // $ANTLR start "rule__SColumn__Group__2"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1660:1: rule__SColumn__Group__2 : rule__SColumn__Group__2__Impl rule__SColumn__Group__3 ;
    public final void rule__SColumn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1664:1: ( rule__SColumn__Group__2__Impl rule__SColumn__Group__3 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1665:2: rule__SColumn__Group__2__Impl rule__SColumn__Group__3
            {
            pushFollow(FOLLOW_rule__SColumn__Group__2__Impl_in_rule__SColumn__Group__23434);
            rule__SColumn__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SColumn__Group__3_in_rule__SColumn__Group__23437);
            rule__SColumn__Group__3();

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
    // $ANTLR end "rule__SColumn__Group__2"


    // $ANTLR start "rule__SColumn__Group__2__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1672:1: rule__SColumn__Group__2__Impl : ( ( rule__SColumn__Alternatives_2 ) ) ;
    public final void rule__SColumn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1676:1: ( ( ( rule__SColumn__Alternatives_2 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1677:1: ( ( rule__SColumn__Alternatives_2 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1677:1: ( ( rule__SColumn__Alternatives_2 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1678:1: ( rule__SColumn__Alternatives_2 )
            {
             before(grammarAccess.getSColumnAccess().getAlternatives_2()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1679:1: ( rule__SColumn__Alternatives_2 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1679:2: rule__SColumn__Alternatives_2
            {
            pushFollow(FOLLOW_rule__SColumn__Alternatives_2_in_rule__SColumn__Group__2__Impl3464);
            rule__SColumn__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getSColumnAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SColumn__Group__2__Impl"


    // $ANTLR start "rule__SColumn__Group__3"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1689:1: rule__SColumn__Group__3 : rule__SColumn__Group__3__Impl rule__SColumn__Group__4 ;
    public final void rule__SColumn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1693:1: ( rule__SColumn__Group__3__Impl rule__SColumn__Group__4 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1694:2: rule__SColumn__Group__3__Impl rule__SColumn__Group__4
            {
            pushFollow(FOLLOW_rule__SColumn__Group__3__Impl_in_rule__SColumn__Group__33494);
            rule__SColumn__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SColumn__Group__4_in_rule__SColumn__Group__33497);
            rule__SColumn__Group__4();

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
    // $ANTLR end "rule__SColumn__Group__3"


    // $ANTLR start "rule__SColumn__Group__3__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1701:1: rule__SColumn__Group__3__Impl : ( ( rule__SColumn__PropsAssignment_3 )? ) ;
    public final void rule__SColumn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1705:1: ( ( ( rule__SColumn__PropsAssignment_3 )? ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1706:1: ( ( rule__SColumn__PropsAssignment_3 )? )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1706:1: ( ( rule__SColumn__PropsAssignment_3 )? )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1707:1: ( rule__SColumn__PropsAssignment_3 )?
            {
             before(grammarAccess.getSColumnAccess().getPropsAssignment_3()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1708:1: ( rule__SColumn__PropsAssignment_3 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==44) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1708:2: rule__SColumn__PropsAssignment_3
                    {
                    pushFollow(FOLLOW_rule__SColumn__PropsAssignment_3_in_rule__SColumn__Group__3__Impl3524);
                    rule__SColumn__PropsAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSColumnAccess().getPropsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SColumn__Group__3__Impl"


    // $ANTLR start "rule__SColumn__Group__4"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1718:1: rule__SColumn__Group__4 : rule__SColumn__Group__4__Impl ;
    public final void rule__SColumn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1722:1: ( rule__SColumn__Group__4__Impl )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1723:2: rule__SColumn__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SColumn__Group__4__Impl_in_rule__SColumn__Group__43555);
            rule__SColumn__Group__4__Impl();

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
    // $ANTLR end "rule__SColumn__Group__4"


    // $ANTLR start "rule__SColumn__Group__4__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1729:1: rule__SColumn__Group__4__Impl : ( ';' ) ;
    public final void rule__SColumn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1733:1: ( ( ';' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1734:1: ( ';' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1734:1: ( ';' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1735:1: ';'
            {
             before(grammarAccess.getSColumnAccess().getSemicolonKeyword_4()); 
            match(input,41,FOLLOW_41_in_rule__SColumn__Group__4__Impl3583); 
             after(grammarAccess.getSColumnAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SColumn__Group__4__Impl"


    // $ANTLR start "rule__SJoinColumn__Group__0"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1758:1: rule__SJoinColumn__Group__0 : rule__SJoinColumn__Group__0__Impl rule__SJoinColumn__Group__1 ;
    public final void rule__SJoinColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1762:1: ( rule__SJoinColumn__Group__0__Impl rule__SJoinColumn__Group__1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1763:2: rule__SJoinColumn__Group__0__Impl rule__SJoinColumn__Group__1
            {
            pushFollow(FOLLOW_rule__SJoinColumn__Group__0__Impl_in_rule__SJoinColumn__Group__03624);
            rule__SJoinColumn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SJoinColumn__Group__1_in_rule__SJoinColumn__Group__03627);
            rule__SJoinColumn__Group__1();

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
    // $ANTLR end "rule__SJoinColumn__Group__0"


    // $ANTLR start "rule__SJoinColumn__Group__0__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1770:1: rule__SJoinColumn__Group__0__Impl : ( 'joincolumn' ) ;
    public final void rule__SJoinColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1774:1: ( ( 'joincolumn' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1775:1: ( 'joincolumn' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1775:1: ( 'joincolumn' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1776:1: 'joincolumn'
            {
             before(grammarAccess.getSJoinColumnAccess().getJoincolumnKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__SJoinColumn__Group__0__Impl3655); 
             after(grammarAccess.getSJoinColumnAccess().getJoincolumnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJoinColumn__Group__0__Impl"


    // $ANTLR start "rule__SJoinColumn__Group__1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1789:1: rule__SJoinColumn__Group__1 : rule__SJoinColumn__Group__1__Impl rule__SJoinColumn__Group__2 ;
    public final void rule__SJoinColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1793:1: ( rule__SJoinColumn__Group__1__Impl rule__SJoinColumn__Group__2 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1794:2: rule__SJoinColumn__Group__1__Impl rule__SJoinColumn__Group__2
            {
            pushFollow(FOLLOW_rule__SJoinColumn__Group__1__Impl_in_rule__SJoinColumn__Group__13686);
            rule__SJoinColumn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SJoinColumn__Group__2_in_rule__SJoinColumn__Group__13689);
            rule__SJoinColumn__Group__2();

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
    // $ANTLR end "rule__SJoinColumn__Group__1"


    // $ANTLR start "rule__SJoinColumn__Group__1__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1801:1: rule__SJoinColumn__Group__1__Impl : ( ( rule__SJoinColumn__NameAssignment_1 ) ) ;
    public final void rule__SJoinColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1805:1: ( ( ( rule__SJoinColumn__NameAssignment_1 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1806:1: ( ( rule__SJoinColumn__NameAssignment_1 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1806:1: ( ( rule__SJoinColumn__NameAssignment_1 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1807:1: ( rule__SJoinColumn__NameAssignment_1 )
            {
             before(grammarAccess.getSJoinColumnAccess().getNameAssignment_1()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1808:1: ( rule__SJoinColumn__NameAssignment_1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1808:2: rule__SJoinColumn__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SJoinColumn__NameAssignment_1_in_rule__SJoinColumn__Group__1__Impl3716);
            rule__SJoinColumn__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSJoinColumnAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJoinColumn__Group__1__Impl"


    // $ANTLR start "rule__SJoinColumn__Group__2"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1818:1: rule__SJoinColumn__Group__2 : rule__SJoinColumn__Group__2__Impl rule__SJoinColumn__Group__3 ;
    public final void rule__SJoinColumn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1822:1: ( rule__SJoinColumn__Group__2__Impl rule__SJoinColumn__Group__3 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1823:2: rule__SJoinColumn__Group__2__Impl rule__SJoinColumn__Group__3
            {
            pushFollow(FOLLOW_rule__SJoinColumn__Group__2__Impl_in_rule__SJoinColumn__Group__23746);
            rule__SJoinColumn__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SJoinColumn__Group__3_in_rule__SJoinColumn__Group__23749);
            rule__SJoinColumn__Group__3();

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
    // $ANTLR end "rule__SJoinColumn__Group__2"


    // $ANTLR start "rule__SJoinColumn__Group__2__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1830:1: rule__SJoinColumn__Group__2__Impl : ( ( rule__SJoinColumn__ReferencedTypeAssignment_2 ) ) ;
    public final void rule__SJoinColumn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1834:1: ( ( ( rule__SJoinColumn__ReferencedTypeAssignment_2 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1835:1: ( ( rule__SJoinColumn__ReferencedTypeAssignment_2 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1835:1: ( ( rule__SJoinColumn__ReferencedTypeAssignment_2 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1836:1: ( rule__SJoinColumn__ReferencedTypeAssignment_2 )
            {
             before(grammarAccess.getSJoinColumnAccess().getReferencedTypeAssignment_2()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1837:1: ( rule__SJoinColumn__ReferencedTypeAssignment_2 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1837:2: rule__SJoinColumn__ReferencedTypeAssignment_2
            {
            pushFollow(FOLLOW_rule__SJoinColumn__ReferencedTypeAssignment_2_in_rule__SJoinColumn__Group__2__Impl3776);
            rule__SJoinColumn__ReferencedTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSJoinColumnAccess().getReferencedTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJoinColumn__Group__2__Impl"


    // $ANTLR start "rule__SJoinColumn__Group__3"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1847:1: rule__SJoinColumn__Group__3 : rule__SJoinColumn__Group__3__Impl rule__SJoinColumn__Group__4 ;
    public final void rule__SJoinColumn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1851:1: ( rule__SJoinColumn__Group__3__Impl rule__SJoinColumn__Group__4 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1852:2: rule__SJoinColumn__Group__3__Impl rule__SJoinColumn__Group__4
            {
            pushFollow(FOLLOW_rule__SJoinColumn__Group__3__Impl_in_rule__SJoinColumn__Group__33806);
            rule__SJoinColumn__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SJoinColumn__Group__4_in_rule__SJoinColumn__Group__33809);
            rule__SJoinColumn__Group__4();

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
    // $ANTLR end "rule__SJoinColumn__Group__3"


    // $ANTLR start "rule__SJoinColumn__Group__3__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1859:1: rule__SJoinColumn__Group__3__Impl : ( ( rule__SJoinColumn__PropsAssignment_3 )? ) ;
    public final void rule__SJoinColumn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1863:1: ( ( ( rule__SJoinColumn__PropsAssignment_3 )? ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1864:1: ( ( rule__SJoinColumn__PropsAssignment_3 )? )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1864:1: ( ( rule__SJoinColumn__PropsAssignment_3 )? )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1865:1: ( rule__SJoinColumn__PropsAssignment_3 )?
            {
             before(grammarAccess.getSJoinColumnAccess().getPropsAssignment_3()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1866:1: ( rule__SJoinColumn__PropsAssignment_3 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==44) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1866:2: rule__SJoinColumn__PropsAssignment_3
                    {
                    pushFollow(FOLLOW_rule__SJoinColumn__PropsAssignment_3_in_rule__SJoinColumn__Group__3__Impl3836);
                    rule__SJoinColumn__PropsAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSJoinColumnAccess().getPropsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJoinColumn__Group__3__Impl"


    // $ANTLR start "rule__SJoinColumn__Group__4"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1876:1: rule__SJoinColumn__Group__4 : rule__SJoinColumn__Group__4__Impl ;
    public final void rule__SJoinColumn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1880:1: ( rule__SJoinColumn__Group__4__Impl )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1881:2: rule__SJoinColumn__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SJoinColumn__Group__4__Impl_in_rule__SJoinColumn__Group__43867);
            rule__SJoinColumn__Group__4__Impl();

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
    // $ANTLR end "rule__SJoinColumn__Group__4"


    // $ANTLR start "rule__SJoinColumn__Group__4__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1887:1: rule__SJoinColumn__Group__4__Impl : ( ';' ) ;
    public final void rule__SJoinColumn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1891:1: ( ( ';' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1892:1: ( ';' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1892:1: ( ';' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1893:1: ';'
            {
             before(grammarAccess.getSJoinColumnAccess().getSemicolonKeyword_4()); 
            match(input,41,FOLLOW_41_in_rule__SJoinColumn__Group__4__Impl3895); 
             after(grammarAccess.getSJoinColumnAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJoinColumn__Group__4__Impl"


    // $ANTLR start "rule__SColumnProps__Group__0"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1916:1: rule__SColumnProps__Group__0 : rule__SColumnProps__Group__0__Impl rule__SColumnProps__Group__1 ;
    public final void rule__SColumnProps__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1920:1: ( rule__SColumnProps__Group__0__Impl rule__SColumnProps__Group__1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1921:2: rule__SColumnProps__Group__0__Impl rule__SColumnProps__Group__1
            {
            pushFollow(FOLLOW_rule__SColumnProps__Group__0__Impl_in_rule__SColumnProps__Group__03936);
            rule__SColumnProps__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SColumnProps__Group__1_in_rule__SColumnProps__Group__03939);
            rule__SColumnProps__Group__1();

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
    // $ANTLR end "rule__SColumnProps__Group__0"


    // $ANTLR start "rule__SColumnProps__Group__0__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1928:1: rule__SColumnProps__Group__0__Impl : ( () ) ;
    public final void rule__SColumnProps__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1932:1: ( ( () ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1933:1: ( () )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1933:1: ( () )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1934:1: ()
            {
             before(grammarAccess.getSColumnPropsAccess().getSColumnPropsAction_0()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1935:1: ()
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1937:1: 
            {
            }

             after(grammarAccess.getSColumnPropsAccess().getSColumnPropsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SColumnProps__Group__0__Impl"


    // $ANTLR start "rule__SColumnProps__Group__1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1947:1: rule__SColumnProps__Group__1 : rule__SColumnProps__Group__1__Impl rule__SColumnProps__Group__2 ;
    public final void rule__SColumnProps__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1951:1: ( rule__SColumnProps__Group__1__Impl rule__SColumnProps__Group__2 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1952:2: rule__SColumnProps__Group__1__Impl rule__SColumnProps__Group__2
            {
            pushFollow(FOLLOW_rule__SColumnProps__Group__1__Impl_in_rule__SColumnProps__Group__13997);
            rule__SColumnProps__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SColumnProps__Group__2_in_rule__SColumnProps__Group__14000);
            rule__SColumnProps__Group__2();

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
    // $ANTLR end "rule__SColumnProps__Group__1"


    // $ANTLR start "rule__SColumnProps__Group__1__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1959:1: rule__SColumnProps__Group__1__Impl : ( 'with' ) ;
    public final void rule__SColumnProps__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1963:1: ( ( 'with' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1964:1: ( 'with' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1964:1: ( 'with' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1965:1: 'with'
            {
             before(grammarAccess.getSColumnPropsAccess().getWithKeyword_1()); 
            match(input,44,FOLLOW_44_in_rule__SColumnProps__Group__1__Impl4028); 
             after(grammarAccess.getSColumnPropsAccess().getWithKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SColumnProps__Group__1__Impl"


    // $ANTLR start "rule__SColumnProps__Group__2"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1978:1: rule__SColumnProps__Group__2 : rule__SColumnProps__Group__2__Impl ;
    public final void rule__SColumnProps__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1982:1: ( rule__SColumnProps__Group__2__Impl )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1983:2: rule__SColumnProps__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SColumnProps__Group__2__Impl_in_rule__SColumnProps__Group__24059);
            rule__SColumnProps__Group__2__Impl();

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
    // $ANTLR end "rule__SColumnProps__Group__2"


    // $ANTLR start "rule__SColumnProps__Group__2__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1989:1: rule__SColumnProps__Group__2__Impl : ( ( rule__SColumnProps__UnorderedGroup_2 ) ) ;
    public final void rule__SColumnProps__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1993:1: ( ( ( rule__SColumnProps__UnorderedGroup_2 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1994:1: ( ( rule__SColumnProps__UnorderedGroup_2 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1994:1: ( ( rule__SColumnProps__UnorderedGroup_2 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1995:1: ( rule__SColumnProps__UnorderedGroup_2 )
            {
             before(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1996:1: ( rule__SColumnProps__UnorderedGroup_2 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1996:2: rule__SColumnProps__UnorderedGroup_2
            {
            pushFollow(FOLLOW_rule__SColumnProps__UnorderedGroup_2_in_rule__SColumnProps__Group__2__Impl4086);
            rule__SColumnProps__UnorderedGroup_2();

            state._fsp--;


            }

             after(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SColumnProps__Group__2__Impl"


    // $ANTLR start "rule__SColumnProps__Group_2_2__0"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2012:1: rule__SColumnProps__Group_2_2__0 : rule__SColumnProps__Group_2_2__0__Impl rule__SColumnProps__Group_2_2__1 ;
    public final void rule__SColumnProps__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2016:1: ( rule__SColumnProps__Group_2_2__0__Impl rule__SColumnProps__Group_2_2__1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2017:2: rule__SColumnProps__Group_2_2__0__Impl rule__SColumnProps__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__SColumnProps__Group_2_2__0__Impl_in_rule__SColumnProps__Group_2_2__04122);
            rule__SColumnProps__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SColumnProps__Group_2_2__1_in_rule__SColumnProps__Group_2_2__04125);
            rule__SColumnProps__Group_2_2__1();

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
    // $ANTLR end "rule__SColumnProps__Group_2_2__0"


    // $ANTLR start "rule__SColumnProps__Group_2_2__0__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2024:1: rule__SColumnProps__Group_2_2__0__Impl : ( 'index=' ) ;
    public final void rule__SColumnProps__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2028:1: ( ( 'index=' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2029:1: ( 'index=' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2029:1: ( 'index=' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2030:1: 'index='
            {
             before(grammarAccess.getSColumnPropsAccess().getIndexKeyword_2_2_0()); 
            match(input,45,FOLLOW_45_in_rule__SColumnProps__Group_2_2__0__Impl4153); 
             after(grammarAccess.getSColumnPropsAccess().getIndexKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SColumnProps__Group_2_2__0__Impl"


    // $ANTLR start "rule__SColumnProps__Group_2_2__1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2043:1: rule__SColumnProps__Group_2_2__1 : rule__SColumnProps__Group_2_2__1__Impl ;
    public final void rule__SColumnProps__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2047:1: ( rule__SColumnProps__Group_2_2__1__Impl )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2048:2: rule__SColumnProps__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SColumnProps__Group_2_2__1__Impl_in_rule__SColumnProps__Group_2_2__14184);
            rule__SColumnProps__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__SColumnProps__Group_2_2__1"


    // $ANTLR start "rule__SColumnProps__Group_2_2__1__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2054:1: rule__SColumnProps__Group_2_2__1__Impl : ( ( rule__SColumnProps__IndexAssignment_2_2_1 ) ) ;
    public final void rule__SColumnProps__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2058:1: ( ( ( rule__SColumnProps__IndexAssignment_2_2_1 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2059:1: ( ( rule__SColumnProps__IndexAssignment_2_2_1 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2059:1: ( ( rule__SColumnProps__IndexAssignment_2_2_1 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2060:1: ( rule__SColumnProps__IndexAssignment_2_2_1 )
            {
             before(grammarAccess.getSColumnPropsAccess().getIndexAssignment_2_2_1()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2061:1: ( rule__SColumnProps__IndexAssignment_2_2_1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2061:2: rule__SColumnProps__IndexAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__SColumnProps__IndexAssignment_2_2_1_in_rule__SColumnProps__Group_2_2__1__Impl4211);
            rule__SColumnProps__IndexAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSColumnPropsAccess().getIndexAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SColumnProps__Group_2_2__1__Impl"


    // $ANTLR start "rule__SColumnProps__Group_2_3__0"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2075:1: rule__SColumnProps__Group_2_3__0 : rule__SColumnProps__Group_2_3__0__Impl rule__SColumnProps__Group_2_3__1 ;
    public final void rule__SColumnProps__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2079:1: ( rule__SColumnProps__Group_2_3__0__Impl rule__SColumnProps__Group_2_3__1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2080:2: rule__SColumnProps__Group_2_3__0__Impl rule__SColumnProps__Group_2_3__1
            {
            pushFollow(FOLLOW_rule__SColumnProps__Group_2_3__0__Impl_in_rule__SColumnProps__Group_2_3__04245);
            rule__SColumnProps__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SColumnProps__Group_2_3__1_in_rule__SColumnProps__Group_2_3__04248);
            rule__SColumnProps__Group_2_3__1();

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
    // $ANTLR end "rule__SColumnProps__Group_2_3__0"


    // $ANTLR start "rule__SColumnProps__Group_2_3__0__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2087:1: rule__SColumnProps__Group_2_3__0__Impl : ( 'javacolumn=' ) ;
    public final void rule__SColumnProps__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2091:1: ( ( 'javacolumn=' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2092:1: ( 'javacolumn=' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2092:1: ( 'javacolumn=' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2093:1: 'javacolumn='
            {
             before(grammarAccess.getSColumnPropsAccess().getJavacolumnKeyword_2_3_0()); 
            match(input,46,FOLLOW_46_in_rule__SColumnProps__Group_2_3__0__Impl4276); 
             after(grammarAccess.getSColumnPropsAccess().getJavacolumnKeyword_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SColumnProps__Group_2_3__0__Impl"


    // $ANTLR start "rule__SColumnProps__Group_2_3__1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2106:1: rule__SColumnProps__Group_2_3__1 : rule__SColumnProps__Group_2_3__1__Impl ;
    public final void rule__SColumnProps__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2110:1: ( rule__SColumnProps__Group_2_3__1__Impl )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2111:2: rule__SColumnProps__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_rule__SColumnProps__Group_2_3__1__Impl_in_rule__SColumnProps__Group_2_3__14307);
            rule__SColumnProps__Group_2_3__1__Impl();

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
    // $ANTLR end "rule__SColumnProps__Group_2_3__1"


    // $ANTLR start "rule__SColumnProps__Group_2_3__1__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2117:1: rule__SColumnProps__Group_2_3__1__Impl : ( ( rule__SColumnProps__JavacolumnAssignment_2_3_1 ) ) ;
    public final void rule__SColumnProps__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2121:1: ( ( ( rule__SColumnProps__JavacolumnAssignment_2_3_1 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2122:1: ( ( rule__SColumnProps__JavacolumnAssignment_2_3_1 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2122:1: ( ( rule__SColumnProps__JavacolumnAssignment_2_3_1 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2123:1: ( rule__SColumnProps__JavacolumnAssignment_2_3_1 )
            {
             before(grammarAccess.getSColumnPropsAccess().getJavacolumnAssignment_2_3_1()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2124:1: ( rule__SColumnProps__JavacolumnAssignment_2_3_1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2124:2: rule__SColumnProps__JavacolumnAssignment_2_3_1
            {
            pushFollow(FOLLOW_rule__SColumnProps__JavacolumnAssignment_2_3_1_in_rule__SColumnProps__Group_2_3__1__Impl4334);
            rule__SColumnProps__JavacolumnAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSColumnPropsAccess().getJavacolumnAssignment_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SColumnProps__Group_2_3__1__Impl"


    // $ANTLR start "rule__SEnum__Group__0"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2138:1: rule__SEnum__Group__0 : rule__SEnum__Group__0__Impl rule__SEnum__Group__1 ;
    public final void rule__SEnum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2142:1: ( rule__SEnum__Group__0__Impl rule__SEnum__Group__1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2143:2: rule__SEnum__Group__0__Impl rule__SEnum__Group__1
            {
            pushFollow(FOLLOW_rule__SEnum__Group__0__Impl_in_rule__SEnum__Group__04368);
            rule__SEnum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SEnum__Group__1_in_rule__SEnum__Group__04371);
            rule__SEnum__Group__1();

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
    // $ANTLR end "rule__SEnum__Group__0"


    // $ANTLR start "rule__SEnum__Group__0__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2150:1: rule__SEnum__Group__0__Impl : ( 'enum' ) ;
    public final void rule__SEnum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2154:1: ( ( 'enum' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2155:1: ( 'enum' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2155:1: ( 'enum' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2156:1: 'enum'
            {
             before(grammarAccess.getSEnumAccess().getEnumKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__SEnum__Group__0__Impl4399); 
             after(grammarAccess.getSEnumAccess().getEnumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnum__Group__0__Impl"


    // $ANTLR start "rule__SEnum__Group__1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2169:1: rule__SEnum__Group__1 : rule__SEnum__Group__1__Impl rule__SEnum__Group__2 ;
    public final void rule__SEnum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2173:1: ( rule__SEnum__Group__1__Impl rule__SEnum__Group__2 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2174:2: rule__SEnum__Group__1__Impl rule__SEnum__Group__2
            {
            pushFollow(FOLLOW_rule__SEnum__Group__1__Impl_in_rule__SEnum__Group__14430);
            rule__SEnum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SEnum__Group__2_in_rule__SEnum__Group__14433);
            rule__SEnum__Group__2();

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
    // $ANTLR end "rule__SEnum__Group__1"


    // $ANTLR start "rule__SEnum__Group__1__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2181:1: rule__SEnum__Group__1__Impl : ( ( rule__SEnum__NameAssignment_1 ) ) ;
    public final void rule__SEnum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2185:1: ( ( ( rule__SEnum__NameAssignment_1 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2186:1: ( ( rule__SEnum__NameAssignment_1 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2186:1: ( ( rule__SEnum__NameAssignment_1 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2187:1: ( rule__SEnum__NameAssignment_1 )
            {
             before(grammarAccess.getSEnumAccess().getNameAssignment_1()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2188:1: ( rule__SEnum__NameAssignment_1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2188:2: rule__SEnum__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SEnum__NameAssignment_1_in_rule__SEnum__Group__1__Impl4460);
            rule__SEnum__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSEnumAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnum__Group__1__Impl"


    // $ANTLR start "rule__SEnum__Group__2"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2198:1: rule__SEnum__Group__2 : rule__SEnum__Group__2__Impl rule__SEnum__Group__3 ;
    public final void rule__SEnum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2202:1: ( rule__SEnum__Group__2__Impl rule__SEnum__Group__3 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2203:2: rule__SEnum__Group__2__Impl rule__SEnum__Group__3
            {
            pushFollow(FOLLOW_rule__SEnum__Group__2__Impl_in_rule__SEnum__Group__24490);
            rule__SEnum__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SEnum__Group__3_in_rule__SEnum__Group__24493);
            rule__SEnum__Group__3();

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
    // $ANTLR end "rule__SEnum__Group__2"


    // $ANTLR start "rule__SEnum__Group__2__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2210:1: rule__SEnum__Group__2__Impl : ( '{' ) ;
    public final void rule__SEnum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2214:1: ( ( '{' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2215:1: ( '{' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2215:1: ( '{' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2216:1: '{'
            {
             before(grammarAccess.getSEnumAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,38,FOLLOW_38_in_rule__SEnum__Group__2__Impl4521); 
             after(grammarAccess.getSEnumAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnum__Group__2__Impl"


    // $ANTLR start "rule__SEnum__Group__3"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2229:1: rule__SEnum__Group__3 : rule__SEnum__Group__3__Impl rule__SEnum__Group__4 ;
    public final void rule__SEnum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2233:1: ( rule__SEnum__Group__3__Impl rule__SEnum__Group__4 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2234:2: rule__SEnum__Group__3__Impl rule__SEnum__Group__4
            {
            pushFollow(FOLLOW_rule__SEnum__Group__3__Impl_in_rule__SEnum__Group__34552);
            rule__SEnum__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SEnum__Group__4_in_rule__SEnum__Group__34555);
            rule__SEnum__Group__4();

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
    // $ANTLR end "rule__SEnum__Group__3"


    // $ANTLR start "rule__SEnum__Group__3__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2241:1: rule__SEnum__Group__3__Impl : ( ( rule__SEnum__LiteralsAssignment_3 )* ) ;
    public final void rule__SEnum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2245:1: ( ( ( rule__SEnum__LiteralsAssignment_3 )* ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2246:1: ( ( rule__SEnum__LiteralsAssignment_3 )* )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2246:1: ( ( rule__SEnum__LiteralsAssignment_3 )* )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2247:1: ( rule__SEnum__LiteralsAssignment_3 )*
            {
             before(grammarAccess.getSEnumAccess().getLiteralsAssignment_3()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2248:1: ( rule__SEnum__LiteralsAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2248:2: rule__SEnum__LiteralsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__SEnum__LiteralsAssignment_3_in_rule__SEnum__Group__3__Impl4582);
            	    rule__SEnum__LiteralsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getSEnumAccess().getLiteralsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnum__Group__3__Impl"


    // $ANTLR start "rule__SEnum__Group__4"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2258:1: rule__SEnum__Group__4 : rule__SEnum__Group__4__Impl ;
    public final void rule__SEnum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2262:1: ( rule__SEnum__Group__4__Impl )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2263:2: rule__SEnum__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SEnum__Group__4__Impl_in_rule__SEnum__Group__44613);
            rule__SEnum__Group__4__Impl();

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
    // $ANTLR end "rule__SEnum__Group__4"


    // $ANTLR start "rule__SEnum__Group__4__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2269:1: rule__SEnum__Group__4__Impl : ( '}' ) ;
    public final void rule__SEnum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2273:1: ( ( '}' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2274:1: ( '}' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2274:1: ( '}' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2275:1: '}'
            {
             before(grammarAccess.getSEnumAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_33_in_rule__SEnum__Group__4__Impl4641); 
             after(grammarAccess.getSEnumAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnum__Group__4__Impl"


    // $ANTLR start "rule__SEnumLiteral__Group__0"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2298:1: rule__SEnumLiteral__Group__0 : rule__SEnumLiteral__Group__0__Impl rule__SEnumLiteral__Group__1 ;
    public final void rule__SEnumLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2302:1: ( rule__SEnumLiteral__Group__0__Impl rule__SEnumLiteral__Group__1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2303:2: rule__SEnumLiteral__Group__0__Impl rule__SEnumLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__SEnumLiteral__Group__0__Impl_in_rule__SEnumLiteral__Group__04682);
            rule__SEnumLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SEnumLiteral__Group__1_in_rule__SEnumLiteral__Group__04685);
            rule__SEnumLiteral__Group__1();

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
    // $ANTLR end "rule__SEnumLiteral__Group__0"


    // $ANTLR start "rule__SEnumLiteral__Group__0__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2310:1: rule__SEnumLiteral__Group__0__Impl : ( ( rule__SEnumLiteral__NameAssignment_0 ) ) ;
    public final void rule__SEnumLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2314:1: ( ( ( rule__SEnumLiteral__NameAssignment_0 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2315:1: ( ( rule__SEnumLiteral__NameAssignment_0 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2315:1: ( ( rule__SEnumLiteral__NameAssignment_0 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2316:1: ( rule__SEnumLiteral__NameAssignment_0 )
            {
             before(grammarAccess.getSEnumLiteralAccess().getNameAssignment_0()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2317:1: ( rule__SEnumLiteral__NameAssignment_0 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2317:2: rule__SEnumLiteral__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__SEnumLiteral__NameAssignment_0_in_rule__SEnumLiteral__Group__0__Impl4712);
            rule__SEnumLiteral__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSEnumLiteralAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumLiteral__Group__0__Impl"


    // $ANTLR start "rule__SEnumLiteral__Group__1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2327:1: rule__SEnumLiteral__Group__1 : rule__SEnumLiteral__Group__1__Impl rule__SEnumLiteral__Group__2 ;
    public final void rule__SEnumLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2331:1: ( rule__SEnumLiteral__Group__1__Impl rule__SEnumLiteral__Group__2 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2332:2: rule__SEnumLiteral__Group__1__Impl rule__SEnumLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__SEnumLiteral__Group__1__Impl_in_rule__SEnumLiteral__Group__14742);
            rule__SEnumLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SEnumLiteral__Group__2_in_rule__SEnumLiteral__Group__14745);
            rule__SEnumLiteral__Group__2();

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
    // $ANTLR end "rule__SEnumLiteral__Group__1"


    // $ANTLR start "rule__SEnumLiteral__Group__1__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2339:1: rule__SEnumLiteral__Group__1__Impl : ( '=' ) ;
    public final void rule__SEnumLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2343:1: ( ( '=' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2344:1: ( '=' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2344:1: ( '=' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2345:1: '='
            {
             before(grammarAccess.getSEnumLiteralAccess().getEqualsSignKeyword_1()); 
            match(input,48,FOLLOW_48_in_rule__SEnumLiteral__Group__1__Impl4773); 
             after(grammarAccess.getSEnumLiteralAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumLiteral__Group__1__Impl"


    // $ANTLR start "rule__SEnumLiteral__Group__2"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2358:1: rule__SEnumLiteral__Group__2 : rule__SEnumLiteral__Group__2__Impl ;
    public final void rule__SEnumLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2362:1: ( rule__SEnumLiteral__Group__2__Impl )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2363:2: rule__SEnumLiteral__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SEnumLiteral__Group__2__Impl_in_rule__SEnumLiteral__Group__24804);
            rule__SEnumLiteral__Group__2__Impl();

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
    // $ANTLR end "rule__SEnumLiteral__Group__2"


    // $ANTLR start "rule__SEnumLiteral__Group__2__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2369:1: rule__SEnumLiteral__Group__2__Impl : ( ( rule__SEnumLiteral__ValueAssignment_2 ) ) ;
    public final void rule__SEnumLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2373:1: ( ( ( rule__SEnumLiteral__ValueAssignment_2 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2374:1: ( ( rule__SEnumLiteral__ValueAssignment_2 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2374:1: ( ( rule__SEnumLiteral__ValueAssignment_2 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2375:1: ( rule__SEnumLiteral__ValueAssignment_2 )
            {
             before(grammarAccess.getSEnumLiteralAccess().getValueAssignment_2()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2376:1: ( rule__SEnumLiteral__ValueAssignment_2 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2376:2: rule__SEnumLiteral__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__SEnumLiteral__ValueAssignment_2_in_rule__SEnumLiteral__Group__2__Impl4831);
            rule__SEnumLiteral__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSEnumLiteralAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumLiteral__Group__2__Impl"


    // $ANTLR start "rule__SString__Group__0"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2392:1: rule__SString__Group__0 : rule__SString__Group__0__Impl rule__SString__Group__1 ;
    public final void rule__SString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2396:1: ( rule__SString__Group__0__Impl rule__SString__Group__1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2397:2: rule__SString__Group__0__Impl rule__SString__Group__1
            {
            pushFollow(FOLLOW_rule__SString__Group__0__Impl_in_rule__SString__Group__04867);
            rule__SString__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SString__Group__1_in_rule__SString__Group__04870);
            rule__SString__Group__1();

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
    // $ANTLR end "rule__SString__Group__0"


    // $ANTLR start "rule__SString__Group__0__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2404:1: rule__SString__Group__0__Impl : ( 'String(' ) ;
    public final void rule__SString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2408:1: ( ( 'String(' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2409:1: ( 'String(' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2409:1: ( 'String(' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2410:1: 'String('
            {
             before(grammarAccess.getSStringAccess().getStringKeyword_0()); 
            match(input,49,FOLLOW_49_in_rule__SString__Group__0__Impl4898); 
             after(grammarAccess.getSStringAccess().getStringKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SString__Group__0__Impl"


    // $ANTLR start "rule__SString__Group__1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2423:1: rule__SString__Group__1 : rule__SString__Group__1__Impl rule__SString__Group__2 ;
    public final void rule__SString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2427:1: ( rule__SString__Group__1__Impl rule__SString__Group__2 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2428:2: rule__SString__Group__1__Impl rule__SString__Group__2
            {
            pushFollow(FOLLOW_rule__SString__Group__1__Impl_in_rule__SString__Group__14929);
            rule__SString__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SString__Group__2_in_rule__SString__Group__14932);
            rule__SString__Group__2();

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
    // $ANTLR end "rule__SString__Group__1"


    // $ANTLR start "rule__SString__Group__1__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2435:1: rule__SString__Group__1__Impl : ( ( rule__SString__ValueAssignment_1 ) ) ;
    public final void rule__SString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2439:1: ( ( ( rule__SString__ValueAssignment_1 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2440:1: ( ( rule__SString__ValueAssignment_1 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2440:1: ( ( rule__SString__ValueAssignment_1 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2441:1: ( rule__SString__ValueAssignment_1 )
            {
             before(grammarAccess.getSStringAccess().getValueAssignment_1()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2442:1: ( rule__SString__ValueAssignment_1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2442:2: rule__SString__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__SString__ValueAssignment_1_in_rule__SString__Group__1__Impl4959);
            rule__SString__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSStringAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SString__Group__1__Impl"


    // $ANTLR start "rule__SString__Group__2"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2452:1: rule__SString__Group__2 : rule__SString__Group__2__Impl ;
    public final void rule__SString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2456:1: ( rule__SString__Group__2__Impl )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2457:2: rule__SString__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SString__Group__2__Impl_in_rule__SString__Group__24989);
            rule__SString__Group__2__Impl();

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
    // $ANTLR end "rule__SString__Group__2"


    // $ANTLR start "rule__SString__Group__2__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2463:1: rule__SString__Group__2__Impl : ( ')' ) ;
    public final void rule__SString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2467:1: ( ( ')' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2468:1: ( ')' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2468:1: ( ')' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2469:1: ')'
            {
             before(grammarAccess.getSStringAccess().getRightParenthesisKeyword_2()); 
            match(input,50,FOLLOW_50_in_rule__SString__Group__2__Impl5017); 
             after(grammarAccess.getSStringAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SString__Group__2__Impl"


    // $ANTLR start "rule__SDecimal__Group__0"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2488:1: rule__SDecimal__Group__0 : rule__SDecimal__Group__0__Impl rule__SDecimal__Group__1 ;
    public final void rule__SDecimal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2492:1: ( rule__SDecimal__Group__0__Impl rule__SDecimal__Group__1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2493:2: rule__SDecimal__Group__0__Impl rule__SDecimal__Group__1
            {
            pushFollow(FOLLOW_rule__SDecimal__Group__0__Impl_in_rule__SDecimal__Group__05054);
            rule__SDecimal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SDecimal__Group__1_in_rule__SDecimal__Group__05057);
            rule__SDecimal__Group__1();

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
    // $ANTLR end "rule__SDecimal__Group__0"


    // $ANTLR start "rule__SDecimal__Group__0__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2500:1: rule__SDecimal__Group__0__Impl : ( 'Decimal(' ) ;
    public final void rule__SDecimal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2504:1: ( ( 'Decimal(' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2505:1: ( 'Decimal(' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2505:1: ( 'Decimal(' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2506:1: 'Decimal('
            {
             before(grammarAccess.getSDecimalAccess().getDecimalKeyword_0()); 
            match(input,51,FOLLOW_51_in_rule__SDecimal__Group__0__Impl5085); 
             after(grammarAccess.getSDecimalAccess().getDecimalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDecimal__Group__0__Impl"


    // $ANTLR start "rule__SDecimal__Group__1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2519:1: rule__SDecimal__Group__1 : rule__SDecimal__Group__1__Impl rule__SDecimal__Group__2 ;
    public final void rule__SDecimal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2523:1: ( rule__SDecimal__Group__1__Impl rule__SDecimal__Group__2 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2524:2: rule__SDecimal__Group__1__Impl rule__SDecimal__Group__2
            {
            pushFollow(FOLLOW_rule__SDecimal__Group__1__Impl_in_rule__SDecimal__Group__15116);
            rule__SDecimal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SDecimal__Group__2_in_rule__SDecimal__Group__15119);
            rule__SDecimal__Group__2();

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
    // $ANTLR end "rule__SDecimal__Group__1"


    // $ANTLR start "rule__SDecimal__Group__1__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2531:1: rule__SDecimal__Group__1__Impl : ( ( rule__SDecimal__ValueAssignment_1 ) ) ;
    public final void rule__SDecimal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2535:1: ( ( ( rule__SDecimal__ValueAssignment_1 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2536:1: ( ( rule__SDecimal__ValueAssignment_1 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2536:1: ( ( rule__SDecimal__ValueAssignment_1 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2537:1: ( rule__SDecimal__ValueAssignment_1 )
            {
             before(grammarAccess.getSDecimalAccess().getValueAssignment_1()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2538:1: ( rule__SDecimal__ValueAssignment_1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2538:2: rule__SDecimal__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__SDecimal__ValueAssignment_1_in_rule__SDecimal__Group__1__Impl5146);
            rule__SDecimal__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSDecimalAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDecimal__Group__1__Impl"


    // $ANTLR start "rule__SDecimal__Group__2"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2548:1: rule__SDecimal__Group__2 : rule__SDecimal__Group__2__Impl ;
    public final void rule__SDecimal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2552:1: ( rule__SDecimal__Group__2__Impl )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2553:2: rule__SDecimal__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SDecimal__Group__2__Impl_in_rule__SDecimal__Group__25176);
            rule__SDecimal__Group__2__Impl();

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
    // $ANTLR end "rule__SDecimal__Group__2"


    // $ANTLR start "rule__SDecimal__Group__2__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2559:1: rule__SDecimal__Group__2__Impl : ( ')' ) ;
    public final void rule__SDecimal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2563:1: ( ( ')' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2564:1: ( ')' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2564:1: ( ')' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2565:1: ')'
            {
             before(grammarAccess.getSDecimalAccess().getRightParenthesisKeyword_2()); 
            match(input,50,FOLLOW_50_in_rule__SDecimal__Group__2__Impl5204); 
             after(grammarAccess.getSDecimalAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDecimal__Group__2__Impl"


    // $ANTLR start "rule__LFQN__Group__0"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2584:1: rule__LFQN__Group__0 : rule__LFQN__Group__0__Impl rule__LFQN__Group__1 ;
    public final void rule__LFQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2588:1: ( rule__LFQN__Group__0__Impl rule__LFQN__Group__1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2589:2: rule__LFQN__Group__0__Impl rule__LFQN__Group__1
            {
            pushFollow(FOLLOW_rule__LFQN__Group__0__Impl_in_rule__LFQN__Group__05241);
            rule__LFQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LFQN__Group__1_in_rule__LFQN__Group__05244);
            rule__LFQN__Group__1();

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
    // $ANTLR end "rule__LFQN__Group__0"


    // $ANTLR start "rule__LFQN__Group__0__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2596:1: rule__LFQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__LFQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2600:1: ( ( RULE_ID ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2601:1: ( RULE_ID )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2601:1: ( RULE_ID )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2602:1: RULE_ID
            {
             before(grammarAccess.getLFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LFQN__Group__0__Impl5271); 
             after(grammarAccess.getLFQNAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LFQN__Group__0__Impl"


    // $ANTLR start "rule__LFQN__Group__1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2613:1: rule__LFQN__Group__1 : rule__LFQN__Group__1__Impl ;
    public final void rule__LFQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2617:1: ( rule__LFQN__Group__1__Impl )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2618:2: rule__LFQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__LFQN__Group__1__Impl_in_rule__LFQN__Group__15300);
            rule__LFQN__Group__1__Impl();

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
    // $ANTLR end "rule__LFQN__Group__1"


    // $ANTLR start "rule__LFQN__Group__1__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2624:1: rule__LFQN__Group__1__Impl : ( ( rule__LFQN__Group_1__0 )* ) ;
    public final void rule__LFQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2628:1: ( ( ( rule__LFQN__Group_1__0 )* ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2629:1: ( ( rule__LFQN__Group_1__0 )* )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2629:1: ( ( rule__LFQN__Group_1__0 )* )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2630:1: ( rule__LFQN__Group_1__0 )*
            {
             before(grammarAccess.getLFQNAccess().getGroup_1()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2631:1: ( rule__LFQN__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==52) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2631:2: rule__LFQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__LFQN__Group_1__0_in_rule__LFQN__Group__1__Impl5327);
            	    rule__LFQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getLFQNAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LFQN__Group__1__Impl"


    // $ANTLR start "rule__LFQN__Group_1__0"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2645:1: rule__LFQN__Group_1__0 : rule__LFQN__Group_1__0__Impl rule__LFQN__Group_1__1 ;
    public final void rule__LFQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2649:1: ( rule__LFQN__Group_1__0__Impl rule__LFQN__Group_1__1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2650:2: rule__LFQN__Group_1__0__Impl rule__LFQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__LFQN__Group_1__0__Impl_in_rule__LFQN__Group_1__05362);
            rule__LFQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LFQN__Group_1__1_in_rule__LFQN__Group_1__05365);
            rule__LFQN__Group_1__1();

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
    // $ANTLR end "rule__LFQN__Group_1__0"


    // $ANTLR start "rule__LFQN__Group_1__0__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2657:1: rule__LFQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__LFQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2661:1: ( ( '.' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2662:1: ( '.' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2662:1: ( '.' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2663:1: '.'
            {
             before(grammarAccess.getLFQNAccess().getFullStopKeyword_1_0()); 
            match(input,52,FOLLOW_52_in_rule__LFQN__Group_1__0__Impl5393); 
             after(grammarAccess.getLFQNAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LFQN__Group_1__0__Impl"


    // $ANTLR start "rule__LFQN__Group_1__1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2676:1: rule__LFQN__Group_1__1 : rule__LFQN__Group_1__1__Impl ;
    public final void rule__LFQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2680:1: ( rule__LFQN__Group_1__1__Impl )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2681:2: rule__LFQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__LFQN__Group_1__1__Impl_in_rule__LFQN__Group_1__15424);
            rule__LFQN__Group_1__1__Impl();

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
    // $ANTLR end "rule__LFQN__Group_1__1"


    // $ANTLR start "rule__LFQN__Group_1__1__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2687:1: rule__LFQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__LFQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2691:1: ( ( RULE_ID ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2692:1: ( RULE_ID )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2692:1: ( RULE_ID )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2693:1: RULE_ID
            {
             before(grammarAccess.getLFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LFQN__Group_1__1__Impl5451); 
             after(grammarAccess.getLFQNAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LFQN__Group_1__1__Impl"


    // $ANTLR start "rule__SSettings__UnorderedGroup_2"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2709:1: rule__SSettings__UnorderedGroup_2 : ( rule__SSettings__UnorderedGroup_2__0 )? ;
    public final void rule__SSettings__UnorderedGroup_2() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getSSettingsAccess().getUnorderedGroup_2());
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2714:1: ( ( rule__SSettings__UnorderedGroup_2__0 )? )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2715:2: ( rule__SSettings__UnorderedGroup_2__0 )?
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2715:2: ( rule__SSettings__UnorderedGroup_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( LA15_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 0) ) {
                alt15=1;
            }
            else if ( LA15_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 1) ) {
                alt15=1;
            }
            else if ( LA15_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 2) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2715:2: rule__SSettings__UnorderedGroup_2__0
                    {
                    pushFollow(FOLLOW_rule__SSettings__UnorderedGroup_2__0_in_rule__SSettings__UnorderedGroup_25485);
                    rule__SSettings__UnorderedGroup_2__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getSSettingsAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SSettings__UnorderedGroup_2"


    // $ANTLR start "rule__SSettings__UnorderedGroup_2__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2725:1: rule__SSettings__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__SSettings__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__SSettings__Group_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__SSettings__Group_2_2__0 ) ) ) ) ) ;
    public final void rule__SSettings__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2730:1: ( ( ({...}? => ( ( ( rule__SSettings__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__SSettings__Group_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__SSettings__Group_2_2__0 ) ) ) ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2731:3: ( ({...}? => ( ( ( rule__SSettings__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__SSettings__Group_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__SSettings__Group_2_2__0 ) ) ) ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2731:3: ( ({...}? => ( ( ( rule__SSettings__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__SSettings__Group_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__SSettings__Group_2_2__0 ) ) ) ) )
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( LA16_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 0) ) {
                alt16=1;
            }
            else if ( LA16_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 1) ) {
                alt16=2;
            }
            else if ( LA16_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 2) ) {
                alt16=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2733:4: ({...}? => ( ( ( rule__SSettings__Group_2_0__0 ) ) ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2733:4: ({...}? => ( ( ( rule__SSettings__Group_2_0__0 ) ) ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2734:5: {...}? => ( ( ( rule__SSettings__Group_2_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 0) ) {
                        throw new FailedPredicateException(input, "rule__SSettings__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 0)");
                    }
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2734:106: ( ( ( rule__SSettings__Group_2_0__0 ) ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2735:6: ( ( rule__SSettings__Group_2_0__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2741:6: ( ( rule__SSettings__Group_2_0__0 ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2743:7: ( rule__SSettings__Group_2_0__0 )
                    {
                     before(grammarAccess.getSSettingsAccess().getGroup_2_0()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2744:7: ( rule__SSettings__Group_2_0__0 )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2744:8: rule__SSettings__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__SSettings__Group_2_0__0_in_rule__SSettings__UnorderedGroup_2__Impl5572);
                    rule__SSettings__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSSettingsAccess().getGroup_2_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2750:4: ({...}? => ( ( ( rule__SSettings__Group_2_1__0 ) ) ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2750:4: ({...}? => ( ( ( rule__SSettings__Group_2_1__0 ) ) ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2751:5: {...}? => ( ( ( rule__SSettings__Group_2_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 1) ) {
                        throw new FailedPredicateException(input, "rule__SSettings__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 1)");
                    }
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2751:106: ( ( ( rule__SSettings__Group_2_1__0 ) ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2752:6: ( ( rule__SSettings__Group_2_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2758:6: ( ( rule__SSettings__Group_2_1__0 ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2760:7: ( rule__SSettings__Group_2_1__0 )
                    {
                     before(grammarAccess.getSSettingsAccess().getGroup_2_1()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2761:7: ( rule__SSettings__Group_2_1__0 )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2761:8: rule__SSettings__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__SSettings__Group_2_1__0_in_rule__SSettings__UnorderedGroup_2__Impl5663);
                    rule__SSettings__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSSettingsAccess().getGroup_2_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2767:4: ({...}? => ( ( ( rule__SSettings__Group_2_2__0 ) ) ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2767:4: ({...}? => ( ( ( rule__SSettings__Group_2_2__0 ) ) ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2768:5: {...}? => ( ( ( rule__SSettings__Group_2_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 2) ) {
                        throw new FailedPredicateException(input, "rule__SSettings__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 2)");
                    }
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2768:106: ( ( ( rule__SSettings__Group_2_2__0 ) ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2769:6: ( ( rule__SSettings__Group_2_2__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2775:6: ( ( rule__SSettings__Group_2_2__0 ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2777:7: ( rule__SSettings__Group_2_2__0 )
                    {
                     before(grammarAccess.getSSettingsAccess().getGroup_2_2()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2778:7: ( rule__SSettings__Group_2_2__0 )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2778:8: rule__SSettings__Group_2_2__0
                    {
                    pushFollow(FOLLOW_rule__SSettings__Group_2_2__0_in_rule__SSettings__UnorderedGroup_2__Impl5754);
                    rule__SSettings__Group_2_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSSettingsAccess().getGroup_2_2()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSSettingsAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SSettings__UnorderedGroup_2__Impl"


    // $ANTLR start "rule__SSettings__UnorderedGroup_2__0"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2793:1: rule__SSettings__UnorderedGroup_2__0 : rule__SSettings__UnorderedGroup_2__Impl ( rule__SSettings__UnorderedGroup_2__1 )? ;
    public final void rule__SSettings__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2797:1: ( rule__SSettings__UnorderedGroup_2__Impl ( rule__SSettings__UnorderedGroup_2__1 )? )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2798:2: rule__SSettings__UnorderedGroup_2__Impl ( rule__SSettings__UnorderedGroup_2__1 )?
            {
            pushFollow(FOLLOW_rule__SSettings__UnorderedGroup_2__Impl_in_rule__SSettings__UnorderedGroup_2__05813);
            rule__SSettings__UnorderedGroup_2__Impl();

            state._fsp--;

            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2799:2: ( rule__SSettings__UnorderedGroup_2__1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( LA17_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 0) ) {
                alt17=1;
            }
            else if ( LA17_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 1) ) {
                alt17=1;
            }
            else if ( LA17_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 2) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2799:2: rule__SSettings__UnorderedGroup_2__1
                    {
                    pushFollow(FOLLOW_rule__SSettings__UnorderedGroup_2__1_in_rule__SSettings__UnorderedGroup_2__05816);
                    rule__SSettings__UnorderedGroup_2__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SSettings__UnorderedGroup_2__0"


    // $ANTLR start "rule__SSettings__UnorderedGroup_2__1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2806:1: rule__SSettings__UnorderedGroup_2__1 : rule__SSettings__UnorderedGroup_2__Impl ( rule__SSettings__UnorderedGroup_2__2 )? ;
    public final void rule__SSettings__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2810:1: ( rule__SSettings__UnorderedGroup_2__Impl ( rule__SSettings__UnorderedGroup_2__2 )? )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2811:2: rule__SSettings__UnorderedGroup_2__Impl ( rule__SSettings__UnorderedGroup_2__2 )?
            {
            pushFollow(FOLLOW_rule__SSettings__UnorderedGroup_2__Impl_in_rule__SSettings__UnorderedGroup_2__15841);
            rule__SSettings__UnorderedGroup_2__Impl();

            state._fsp--;

            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2812:2: ( rule__SSettings__UnorderedGroup_2__2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( LA18_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 0) ) {
                alt18=1;
            }
            else if ( LA18_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 1) ) {
                alt18=1;
            }
            else if ( LA18_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 2) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2812:2: rule__SSettings__UnorderedGroup_2__2
                    {
                    pushFollow(FOLLOW_rule__SSettings__UnorderedGroup_2__2_in_rule__SSettings__UnorderedGroup_2__15844);
                    rule__SSettings__UnorderedGroup_2__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SSettings__UnorderedGroup_2__1"


    // $ANTLR start "rule__SSettings__UnorderedGroup_2__2"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2819:1: rule__SSettings__UnorderedGroup_2__2 : rule__SSettings__UnorderedGroup_2__Impl ;
    public final void rule__SSettings__UnorderedGroup_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2823:1: ( rule__SSettings__UnorderedGroup_2__Impl )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2824:2: rule__SSettings__UnorderedGroup_2__Impl
            {
            pushFollow(FOLLOW_rule__SSettings__UnorderedGroup_2__Impl_in_rule__SSettings__UnorderedGroup_2__25869);
            rule__SSettings__UnorderedGroup_2__Impl();

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
    // $ANTLR end "rule__SSettings__UnorderedGroup_2__2"


    // $ANTLR start "rule__STable__UnorderedGroup_3"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2837:1: rule__STable__UnorderedGroup_3 : ( rule__STable__UnorderedGroup_3__0 )? ;
    public final void rule__STable__UnorderedGroup_3() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getSTableAccess().getUnorderedGroup_3());
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2842:1: ( ( rule__STable__UnorderedGroup_3__0 )? )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2843:2: ( rule__STable__UnorderedGroup_3__0 )?
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2843:2: ( rule__STable__UnorderedGroup_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( LA19_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 0) ) {
                alt19=1;
            }
            else if ( LA19_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 1) ) {
                alt19=1;
            }
            else if ( LA19_0 ==53 && getUnorderedGroupHelper().canSelect(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 2) ) {
                alt19=1;
            }
            else if ( LA19_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 3) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2843:2: rule__STable__UnorderedGroup_3__0
                    {
                    pushFollow(FOLLOW_rule__STable__UnorderedGroup_3__0_in_rule__STable__UnorderedGroup_35899);
                    rule__STable__UnorderedGroup_3__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getSTableAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STable__UnorderedGroup_3"


    // $ANTLR start "rule__STable__UnorderedGroup_3__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2853:1: rule__STable__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__STable__SettingsAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__STable__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__STable__CachedAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__STable__Group_3_3__0 ) ) ) ) ) ;
    public final void rule__STable__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2858:1: ( ( ({...}? => ( ( ( rule__STable__SettingsAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__STable__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__STable__CachedAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__STable__Group_3_3__0 ) ) ) ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2859:3: ( ({...}? => ( ( ( rule__STable__SettingsAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__STable__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__STable__CachedAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__STable__Group_3_3__0 ) ) ) ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2859:3: ( ({...}? => ( ( ( rule__STable__SettingsAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__STable__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__STable__CachedAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__STable__Group_3_3__0 ) ) ) ) )
            int alt20=4;
            int LA20_0 = input.LA(1);

            if ( LA20_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 0) ) {
                alt20=1;
            }
            else if ( LA20_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 1) ) {
                alt20=2;
            }
            else if ( LA20_0 ==53 && getUnorderedGroupHelper().canSelect(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 2) ) {
                alt20=3;
            }
            else if ( LA20_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 3) ) {
                alt20=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2861:4: ({...}? => ( ( ( rule__STable__SettingsAssignment_3_0 ) ) ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2861:4: ({...}? => ( ( ( rule__STable__SettingsAssignment_3_0 ) ) ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2862:5: {...}? => ( ( ( rule__STable__SettingsAssignment_3_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__STable__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 0)");
                    }
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2862:103: ( ( ( rule__STable__SettingsAssignment_3_0 ) ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2863:6: ( ( rule__STable__SettingsAssignment_3_0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2869:6: ( ( rule__STable__SettingsAssignment_3_0 ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2871:7: ( rule__STable__SettingsAssignment_3_0 )
                    {
                     before(grammarAccess.getSTableAccess().getSettingsAssignment_3_0()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2872:7: ( rule__STable__SettingsAssignment_3_0 )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2872:8: rule__STable__SettingsAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__STable__SettingsAssignment_3_0_in_rule__STable__UnorderedGroup_3__Impl5986);
                    rule__STable__SettingsAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSTableAccess().getSettingsAssignment_3_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2878:4: ({...}? => ( ( ( rule__STable__Group_3_1__0 ) ) ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2878:4: ({...}? => ( ( ( rule__STable__Group_3_1__0 ) ) ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2879:5: {...}? => ( ( ( rule__STable__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__STable__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 1)");
                    }
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2879:103: ( ( ( rule__STable__Group_3_1__0 ) ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2880:6: ( ( rule__STable__Group_3_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2886:6: ( ( rule__STable__Group_3_1__0 ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2888:7: ( rule__STable__Group_3_1__0 )
                    {
                     before(grammarAccess.getSTableAccess().getGroup_3_1()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2889:7: ( rule__STable__Group_3_1__0 )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2889:8: rule__STable__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__STable__Group_3_1__0_in_rule__STable__UnorderedGroup_3__Impl6077);
                    rule__STable__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSTableAccess().getGroup_3_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2895:4: ({...}? => ( ( ( rule__STable__CachedAssignment_3_2 ) ) ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2895:4: ({...}? => ( ( ( rule__STable__CachedAssignment_3_2 ) ) ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2896:5: {...}? => ( ( ( rule__STable__CachedAssignment_3_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__STable__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 2)");
                    }
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2896:103: ( ( ( rule__STable__CachedAssignment_3_2 ) ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2897:6: ( ( rule__STable__CachedAssignment_3_2 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2903:6: ( ( rule__STable__CachedAssignment_3_2 ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2905:7: ( rule__STable__CachedAssignment_3_2 )
                    {
                     before(grammarAccess.getSTableAccess().getCachedAssignment_3_2()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2906:7: ( rule__STable__CachedAssignment_3_2 )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2906:8: rule__STable__CachedAssignment_3_2
                    {
                    pushFollow(FOLLOW_rule__STable__CachedAssignment_3_2_in_rule__STable__UnorderedGroup_3__Impl6168);
                    rule__STable__CachedAssignment_3_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSTableAccess().getCachedAssignment_3_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2912:4: ({...}? => ( ( ( rule__STable__Group_3_3__0 ) ) ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2912:4: ({...}? => ( ( ( rule__STable__Group_3_3__0 ) ) ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2913:5: {...}? => ( ( ( rule__STable__Group_3_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 3) ) {
                        throw new FailedPredicateException(input, "rule__STable__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 3)");
                    }
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2913:103: ( ( ( rule__STable__Group_3_3__0 ) ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2914:6: ( ( rule__STable__Group_3_3__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 3);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2920:6: ( ( rule__STable__Group_3_3__0 ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2922:7: ( rule__STable__Group_3_3__0 )
                    {
                     before(grammarAccess.getSTableAccess().getGroup_3_3()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2923:7: ( rule__STable__Group_3_3__0 )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2923:8: rule__STable__Group_3_3__0
                    {
                    pushFollow(FOLLOW_rule__STable__Group_3_3__0_in_rule__STable__UnorderedGroup_3__Impl6259);
                    rule__STable__Group_3_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSTableAccess().getGroup_3_3()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSTableAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STable__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__STable__UnorderedGroup_3__0"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2938:1: rule__STable__UnorderedGroup_3__0 : rule__STable__UnorderedGroup_3__Impl ( rule__STable__UnorderedGroup_3__1 )? ;
    public final void rule__STable__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2942:1: ( rule__STable__UnorderedGroup_3__Impl ( rule__STable__UnorderedGroup_3__1 )? )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2943:2: rule__STable__UnorderedGroup_3__Impl ( rule__STable__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_rule__STable__UnorderedGroup_3__Impl_in_rule__STable__UnorderedGroup_3__06318);
            rule__STable__UnorderedGroup_3__Impl();

            state._fsp--;

            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2944:2: ( rule__STable__UnorderedGroup_3__1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( LA21_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 0) ) {
                alt21=1;
            }
            else if ( LA21_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 1) ) {
                alt21=1;
            }
            else if ( LA21_0 ==53 && getUnorderedGroupHelper().canSelect(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 2) ) {
                alt21=1;
            }
            else if ( LA21_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 3) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2944:2: rule__STable__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_rule__STable__UnorderedGroup_3__1_in_rule__STable__UnorderedGroup_3__06321);
                    rule__STable__UnorderedGroup_3__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STable__UnorderedGroup_3__0"


    // $ANTLR start "rule__STable__UnorderedGroup_3__1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2951:1: rule__STable__UnorderedGroup_3__1 : rule__STable__UnorderedGroup_3__Impl ( rule__STable__UnorderedGroup_3__2 )? ;
    public final void rule__STable__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2955:1: ( rule__STable__UnorderedGroup_3__Impl ( rule__STable__UnorderedGroup_3__2 )? )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2956:2: rule__STable__UnorderedGroup_3__Impl ( rule__STable__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_rule__STable__UnorderedGroup_3__Impl_in_rule__STable__UnorderedGroup_3__16346);
            rule__STable__UnorderedGroup_3__Impl();

            state._fsp--;

            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2957:2: ( rule__STable__UnorderedGroup_3__2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( LA22_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 0) ) {
                alt22=1;
            }
            else if ( LA22_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 1) ) {
                alt22=1;
            }
            else if ( LA22_0 ==53 && getUnorderedGroupHelper().canSelect(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 2) ) {
                alt22=1;
            }
            else if ( LA22_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 3) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2957:2: rule__STable__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_rule__STable__UnorderedGroup_3__2_in_rule__STable__UnorderedGroup_3__16349);
                    rule__STable__UnorderedGroup_3__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STable__UnorderedGroup_3__1"


    // $ANTLR start "rule__STable__UnorderedGroup_3__2"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2964:1: rule__STable__UnorderedGroup_3__2 : rule__STable__UnorderedGroup_3__Impl ( rule__STable__UnorderedGroup_3__3 )? ;
    public final void rule__STable__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2968:1: ( rule__STable__UnorderedGroup_3__Impl ( rule__STable__UnorderedGroup_3__3 )? )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2969:2: rule__STable__UnorderedGroup_3__Impl ( rule__STable__UnorderedGroup_3__3 )?
            {
            pushFollow(FOLLOW_rule__STable__UnorderedGroup_3__Impl_in_rule__STable__UnorderedGroup_3__26374);
            rule__STable__UnorderedGroup_3__Impl();

            state._fsp--;

            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2970:2: ( rule__STable__UnorderedGroup_3__3 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( LA23_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 0) ) {
                alt23=1;
            }
            else if ( LA23_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 1) ) {
                alt23=1;
            }
            else if ( LA23_0 ==53 && getUnorderedGroupHelper().canSelect(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 2) ) {
                alt23=1;
            }
            else if ( LA23_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getSTableAccess().getUnorderedGroup_3(), 3) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2970:2: rule__STable__UnorderedGroup_3__3
                    {
                    pushFollow(FOLLOW_rule__STable__UnorderedGroup_3__3_in_rule__STable__UnorderedGroup_3__26377);
                    rule__STable__UnorderedGroup_3__3();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STable__UnorderedGroup_3__2"


    // $ANTLR start "rule__STable__UnorderedGroup_3__3"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2977:1: rule__STable__UnorderedGroup_3__3 : rule__STable__UnorderedGroup_3__Impl ;
    public final void rule__STable__UnorderedGroup_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2981:1: ( rule__STable__UnorderedGroup_3__Impl )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2982:2: rule__STable__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_rule__STable__UnorderedGroup_3__Impl_in_rule__STable__UnorderedGroup_3__36402);
            rule__STable__UnorderedGroup_3__Impl();

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
    // $ANTLR end "rule__STable__UnorderedGroup_3__3"


    // $ANTLR start "rule__SColumnProps__UnorderedGroup_2"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2997:1: rule__SColumnProps__UnorderedGroup_2 : ( rule__SColumnProps__UnorderedGroup_2__0 )? ;
    public final void rule__SColumnProps__UnorderedGroup_2() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2());
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3002:1: ( ( rule__SColumnProps__UnorderedGroup_2__0 )? )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3003:2: ( rule__SColumnProps__UnorderedGroup_2__0 )?
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3003:2: ( rule__SColumnProps__UnorderedGroup_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( LA24_0 ==54 && getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 0) ) {
                alt24=1;
            }
            else if ( LA24_0 ==55 && getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 1) ) {
                alt24=1;
            }
            else if ( LA24_0 ==45 && getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 2) ) {
                alt24=1;
            }
            else if ( LA24_0 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 3) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3003:2: rule__SColumnProps__UnorderedGroup_2__0
                    {
                    pushFollow(FOLLOW_rule__SColumnProps__UnorderedGroup_2__0_in_rule__SColumnProps__UnorderedGroup_26434);
                    rule__SColumnProps__UnorderedGroup_2__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SColumnProps__UnorderedGroup_2"


    // $ANTLR start "rule__SColumnProps__UnorderedGroup_2__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3013:1: rule__SColumnProps__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__SColumnProps__NullableAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__SColumnProps__AesAssignment_2_1 ) ) ) ) | ({...}? => ( ( ( rule__SColumnProps__Group_2_2__0 ) ) ) ) | ({...}? => ( ( ( rule__SColumnProps__Group_2_3__0 ) ) ) ) ) ;
    public final void rule__SColumnProps__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3018:1: ( ( ({...}? => ( ( ( rule__SColumnProps__NullableAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__SColumnProps__AesAssignment_2_1 ) ) ) ) | ({...}? => ( ( ( rule__SColumnProps__Group_2_2__0 ) ) ) ) | ({...}? => ( ( ( rule__SColumnProps__Group_2_3__0 ) ) ) ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3019:3: ( ({...}? => ( ( ( rule__SColumnProps__NullableAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__SColumnProps__AesAssignment_2_1 ) ) ) ) | ({...}? => ( ( ( rule__SColumnProps__Group_2_2__0 ) ) ) ) | ({...}? => ( ( ( rule__SColumnProps__Group_2_3__0 ) ) ) ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3019:3: ( ({...}? => ( ( ( rule__SColumnProps__NullableAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__SColumnProps__AesAssignment_2_1 ) ) ) ) | ({...}? => ( ( ( rule__SColumnProps__Group_2_2__0 ) ) ) ) | ({...}? => ( ( ( rule__SColumnProps__Group_2_3__0 ) ) ) ) )
            int alt25=4;
            int LA25_0 = input.LA(1);

            if ( LA25_0 ==54 && getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 0) ) {
                alt25=1;
            }
            else if ( LA25_0 ==55 && getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 1) ) {
                alt25=2;
            }
            else if ( LA25_0 ==45 && getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 2) ) {
                alt25=3;
            }
            else if ( LA25_0 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 3) ) {
                alt25=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3021:4: ({...}? => ( ( ( rule__SColumnProps__NullableAssignment_2_0 ) ) ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3021:4: ({...}? => ( ( ( rule__SColumnProps__NullableAssignment_2_0 ) ) ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3022:5: {...}? => ( ( ( rule__SColumnProps__NullableAssignment_2_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 0) ) {
                        throw new FailedPredicateException(input, "rule__SColumnProps__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 0)");
                    }
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3022:109: ( ( ( rule__SColumnProps__NullableAssignment_2_0 ) ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3023:6: ( ( rule__SColumnProps__NullableAssignment_2_0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3029:6: ( ( rule__SColumnProps__NullableAssignment_2_0 ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3031:7: ( rule__SColumnProps__NullableAssignment_2_0 )
                    {
                     before(grammarAccess.getSColumnPropsAccess().getNullableAssignment_2_0()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3032:7: ( rule__SColumnProps__NullableAssignment_2_0 )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3032:8: rule__SColumnProps__NullableAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__SColumnProps__NullableAssignment_2_0_in_rule__SColumnProps__UnorderedGroup_2__Impl6521);
                    rule__SColumnProps__NullableAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSColumnPropsAccess().getNullableAssignment_2_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3038:4: ({...}? => ( ( ( rule__SColumnProps__AesAssignment_2_1 ) ) ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3038:4: ({...}? => ( ( ( rule__SColumnProps__AesAssignment_2_1 ) ) ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3039:5: {...}? => ( ( ( rule__SColumnProps__AesAssignment_2_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 1) ) {
                        throw new FailedPredicateException(input, "rule__SColumnProps__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 1)");
                    }
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3039:109: ( ( ( rule__SColumnProps__AesAssignment_2_1 ) ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3040:6: ( ( rule__SColumnProps__AesAssignment_2_1 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3046:6: ( ( rule__SColumnProps__AesAssignment_2_1 ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3048:7: ( rule__SColumnProps__AesAssignment_2_1 )
                    {
                     before(grammarAccess.getSColumnPropsAccess().getAesAssignment_2_1()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3049:7: ( rule__SColumnProps__AesAssignment_2_1 )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3049:8: rule__SColumnProps__AesAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__SColumnProps__AesAssignment_2_1_in_rule__SColumnProps__UnorderedGroup_2__Impl6612);
                    rule__SColumnProps__AesAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSColumnPropsAccess().getAesAssignment_2_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3055:4: ({...}? => ( ( ( rule__SColumnProps__Group_2_2__0 ) ) ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3055:4: ({...}? => ( ( ( rule__SColumnProps__Group_2_2__0 ) ) ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3056:5: {...}? => ( ( ( rule__SColumnProps__Group_2_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 2) ) {
                        throw new FailedPredicateException(input, "rule__SColumnProps__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 2)");
                    }
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3056:109: ( ( ( rule__SColumnProps__Group_2_2__0 ) ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3057:6: ( ( rule__SColumnProps__Group_2_2__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3063:6: ( ( rule__SColumnProps__Group_2_2__0 ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3065:7: ( rule__SColumnProps__Group_2_2__0 )
                    {
                     before(grammarAccess.getSColumnPropsAccess().getGroup_2_2()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3066:7: ( rule__SColumnProps__Group_2_2__0 )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3066:8: rule__SColumnProps__Group_2_2__0
                    {
                    pushFollow(FOLLOW_rule__SColumnProps__Group_2_2__0_in_rule__SColumnProps__UnorderedGroup_2__Impl6703);
                    rule__SColumnProps__Group_2_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSColumnPropsAccess().getGroup_2_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3072:4: ({...}? => ( ( ( rule__SColumnProps__Group_2_3__0 ) ) ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3072:4: ({...}? => ( ( ( rule__SColumnProps__Group_2_3__0 ) ) ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3073:5: {...}? => ( ( ( rule__SColumnProps__Group_2_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 3) ) {
                        throw new FailedPredicateException(input, "rule__SColumnProps__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 3)");
                    }
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3073:109: ( ( ( rule__SColumnProps__Group_2_3__0 ) ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3074:6: ( ( rule__SColumnProps__Group_2_3__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 3);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3080:6: ( ( rule__SColumnProps__Group_2_3__0 ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3082:7: ( rule__SColumnProps__Group_2_3__0 )
                    {
                     before(grammarAccess.getSColumnPropsAccess().getGroup_2_3()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3083:7: ( rule__SColumnProps__Group_2_3__0 )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3083:8: rule__SColumnProps__Group_2_3__0
                    {
                    pushFollow(FOLLOW_rule__SColumnProps__Group_2_3__0_in_rule__SColumnProps__UnorderedGroup_2__Impl6794);
                    rule__SColumnProps__Group_2_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSColumnPropsAccess().getGroup_2_3()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SColumnProps__UnorderedGroup_2__Impl"


    // $ANTLR start "rule__SColumnProps__UnorderedGroup_2__0"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3098:1: rule__SColumnProps__UnorderedGroup_2__0 : rule__SColumnProps__UnorderedGroup_2__Impl ( rule__SColumnProps__UnorderedGroup_2__1 )? ;
    public final void rule__SColumnProps__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3102:1: ( rule__SColumnProps__UnorderedGroup_2__Impl ( rule__SColumnProps__UnorderedGroup_2__1 )? )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3103:2: rule__SColumnProps__UnorderedGroup_2__Impl ( rule__SColumnProps__UnorderedGroup_2__1 )?
            {
            pushFollow(FOLLOW_rule__SColumnProps__UnorderedGroup_2__Impl_in_rule__SColumnProps__UnorderedGroup_2__06853);
            rule__SColumnProps__UnorderedGroup_2__Impl();

            state._fsp--;

            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3104:2: ( rule__SColumnProps__UnorderedGroup_2__1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( LA26_0 ==54 && getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 0) ) {
                alt26=1;
            }
            else if ( LA26_0 ==55 && getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 1) ) {
                alt26=1;
            }
            else if ( LA26_0 ==45 && getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 2) ) {
                alt26=1;
            }
            else if ( LA26_0 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 3) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3104:2: rule__SColumnProps__UnorderedGroup_2__1
                    {
                    pushFollow(FOLLOW_rule__SColumnProps__UnorderedGroup_2__1_in_rule__SColumnProps__UnorderedGroup_2__06856);
                    rule__SColumnProps__UnorderedGroup_2__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SColumnProps__UnorderedGroup_2__0"


    // $ANTLR start "rule__SColumnProps__UnorderedGroup_2__1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3111:1: rule__SColumnProps__UnorderedGroup_2__1 : rule__SColumnProps__UnorderedGroup_2__Impl ( rule__SColumnProps__UnorderedGroup_2__2 )? ;
    public final void rule__SColumnProps__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3115:1: ( rule__SColumnProps__UnorderedGroup_2__Impl ( rule__SColumnProps__UnorderedGroup_2__2 )? )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3116:2: rule__SColumnProps__UnorderedGroup_2__Impl ( rule__SColumnProps__UnorderedGroup_2__2 )?
            {
            pushFollow(FOLLOW_rule__SColumnProps__UnorderedGroup_2__Impl_in_rule__SColumnProps__UnorderedGroup_2__16881);
            rule__SColumnProps__UnorderedGroup_2__Impl();

            state._fsp--;

            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3117:2: ( rule__SColumnProps__UnorderedGroup_2__2 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( LA27_0 ==54 && getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 0) ) {
                alt27=1;
            }
            else if ( LA27_0 ==55 && getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 1) ) {
                alt27=1;
            }
            else if ( LA27_0 ==45 && getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 2) ) {
                alt27=1;
            }
            else if ( LA27_0 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 3) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3117:2: rule__SColumnProps__UnorderedGroup_2__2
                    {
                    pushFollow(FOLLOW_rule__SColumnProps__UnorderedGroup_2__2_in_rule__SColumnProps__UnorderedGroup_2__16884);
                    rule__SColumnProps__UnorderedGroup_2__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SColumnProps__UnorderedGroup_2__1"


    // $ANTLR start "rule__SColumnProps__UnorderedGroup_2__2"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3124:1: rule__SColumnProps__UnorderedGroup_2__2 : rule__SColumnProps__UnorderedGroup_2__Impl ( rule__SColumnProps__UnorderedGroup_2__3 )? ;
    public final void rule__SColumnProps__UnorderedGroup_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3128:1: ( rule__SColumnProps__UnorderedGroup_2__Impl ( rule__SColumnProps__UnorderedGroup_2__3 )? )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3129:2: rule__SColumnProps__UnorderedGroup_2__Impl ( rule__SColumnProps__UnorderedGroup_2__3 )?
            {
            pushFollow(FOLLOW_rule__SColumnProps__UnorderedGroup_2__Impl_in_rule__SColumnProps__UnorderedGroup_2__26909);
            rule__SColumnProps__UnorderedGroup_2__Impl();

            state._fsp--;

            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3130:2: ( rule__SColumnProps__UnorderedGroup_2__3 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( LA28_0 ==54 && getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 0) ) {
                alt28=1;
            }
            else if ( LA28_0 ==55 && getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 1) ) {
                alt28=1;
            }
            else if ( LA28_0 ==45 && getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 2) ) {
                alt28=1;
            }
            else if ( LA28_0 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 3) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3130:2: rule__SColumnProps__UnorderedGroup_2__3
                    {
                    pushFollow(FOLLOW_rule__SColumnProps__UnorderedGroup_2__3_in_rule__SColumnProps__UnorderedGroup_2__26912);
                    rule__SColumnProps__UnorderedGroup_2__3();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SColumnProps__UnorderedGroup_2__2"


    // $ANTLR start "rule__SColumnProps__UnorderedGroup_2__3"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3137:1: rule__SColumnProps__UnorderedGroup_2__3 : rule__SColumnProps__UnorderedGroup_2__Impl ;
    public final void rule__SColumnProps__UnorderedGroup_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3141:1: ( rule__SColumnProps__UnorderedGroup_2__Impl )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3142:2: rule__SColumnProps__UnorderedGroup_2__Impl
            {
            pushFollow(FOLLOW_rule__SColumnProps__UnorderedGroup_2__Impl_in_rule__SColumnProps__UnorderedGroup_2__36937);
            rule__SColumnProps__UnorderedGroup_2__Impl();

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
    // $ANTLR end "rule__SColumnProps__UnorderedGroup_2__3"


    // $ANTLR start "rule__SModel__GeneratedFileAssignment_0_1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3157:1: rule__SModel__GeneratedFileAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__SModel__GeneratedFileAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3161:1: ( ( RULE_ID ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3162:1: ( RULE_ID )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3162:1: ( RULE_ID )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3163:1: RULE_ID
            {
             before(grammarAccess.getSModelAccess().getGeneratedFileIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SModel__GeneratedFileAssignment_0_16973); 
             after(grammarAccess.getSModelAccess().getGeneratedFileIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SModel__GeneratedFileAssignment_0_1"


    // $ANTLR start "rule__SModel__SettingsAssignment_1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3172:1: rule__SModel__SettingsAssignment_1 : ( ruleSSettings ) ;
    public final void rule__SModel__SettingsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3176:1: ( ( ruleSSettings ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3177:1: ( ruleSSettings )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3177:1: ( ruleSSettings )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3178:1: ruleSSettings
            {
             before(grammarAccess.getSModelAccess().getSettingsSSettingsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSSettings_in_rule__SModel__SettingsAssignment_17004);
            ruleSSettings();

            state._fsp--;

             after(grammarAccess.getSModelAccess().getSettingsSSettingsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SModel__SettingsAssignment_1"


    // $ANTLR start "rule__SModel__ArtifactAssignment_2"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3187:1: rule__SModel__ArtifactAssignment_2 : ( ruleSArtifact ) ;
    public final void rule__SModel__ArtifactAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3191:1: ( ( ruleSArtifact ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3192:1: ( ruleSArtifact )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3192:1: ( ruleSArtifact )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3193:1: ruleSArtifact
            {
             before(grammarAccess.getSModelAccess().getArtifactSArtifactParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSArtifact_in_rule__SModel__ArtifactAssignment_27035);
            ruleSArtifact();

            state._fsp--;

             after(grammarAccess.getSModelAccess().getArtifactSArtifactParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SModel__ArtifactAssignment_2"


    // $ANTLR start "rule__SSettings__SchemaAssignment_2_0_1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3202:1: rule__SSettings__SchemaAssignment_2_0_1 : ( RULE_ID ) ;
    public final void rule__SSettings__SchemaAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3206:1: ( ( RULE_ID ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3207:1: ( RULE_ID )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3207:1: ( RULE_ID )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3208:1: RULE_ID
            {
             before(grammarAccess.getSSettingsAccess().getSchemaIDTerminalRuleCall_2_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SSettings__SchemaAssignment_2_0_17066); 
             after(grammarAccess.getSSettingsAccess().getSchemaIDTerminalRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SSettings__SchemaAssignment_2_0_1"


    // $ANTLR start "rule__SSettings__JavapackageAssignment_2_1_1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3217:1: rule__SSettings__JavapackageAssignment_2_1_1 : ( ruleLFQN ) ;
    public final void rule__SSettings__JavapackageAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3221:1: ( ( ruleLFQN ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3222:1: ( ruleLFQN )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3222:1: ( ruleLFQN )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3223:1: ruleLFQN
            {
             before(grammarAccess.getSSettingsAccess().getJavapackageLFQNParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleLFQN_in_rule__SSettings__JavapackageAssignment_2_1_17097);
            ruleLFQN();

            state._fsp--;

             after(grammarAccess.getSSettingsAccess().getJavapackageLFQNParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SSettings__JavapackageAssignment_2_1_1"


    // $ANTLR start "rule__SSettings__EngineAssignment_2_2_1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3232:1: rule__SSettings__EngineAssignment_2_2_1 : ( ruleSDBEngine ) ;
    public final void rule__SSettings__EngineAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3236:1: ( ( ruleSDBEngine ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3237:1: ( ruleSDBEngine )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3237:1: ( ruleSDBEngine )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3238:1: ruleSDBEngine
            {
             before(grammarAccess.getSSettingsAccess().getEngineSDBEngineEnumRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleSDBEngine_in_rule__SSettings__EngineAssignment_2_2_17128);
            ruleSDBEngine();

            state._fsp--;

             after(grammarAccess.getSSettingsAccess().getEngineSDBEngineEnumRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SSettings__EngineAssignment_2_2_1"


    // $ANTLR start "rule__STable__NameAssignment_1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3247:1: rule__STable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__STable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3251:1: ( ( RULE_ID ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3252:1: ( RULE_ID )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3252:1: ( RULE_ID )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3253:1: RULE_ID
            {
             before(grammarAccess.getSTableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__STable__NameAssignment_17159); 
             after(grammarAccess.getSTableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STable__NameAssignment_1"


    // $ANTLR start "rule__STable__SettingsAssignment_3_0"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3262:1: rule__STable__SettingsAssignment_3_0 : ( ruleSSettings ) ;
    public final void rule__STable__SettingsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3266:1: ( ( ruleSSettings ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3267:1: ( ruleSSettings )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3267:1: ( ruleSSettings )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3268:1: ruleSSettings
            {
             before(grammarAccess.getSTableAccess().getSettingsSSettingsParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleSSettings_in_rule__STable__SettingsAssignment_3_07190);
            ruleSSettings();

            state._fsp--;

             after(grammarAccess.getSTableAccess().getSettingsSSettingsParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STable__SettingsAssignment_3_0"


    // $ANTLR start "rule__STable__EntitynameAssignment_3_1_1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3277:1: rule__STable__EntitynameAssignment_3_1_1 : ( RULE_ID ) ;
    public final void rule__STable__EntitynameAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3281:1: ( ( RULE_ID ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3282:1: ( RULE_ID )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3282:1: ( RULE_ID )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3283:1: RULE_ID
            {
             before(grammarAccess.getSTableAccess().getEntitynameIDTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__STable__EntitynameAssignment_3_1_17221); 
             after(grammarAccess.getSTableAccess().getEntitynameIDTerminalRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STable__EntitynameAssignment_3_1_1"


    // $ANTLR start "rule__STable__CachedAssignment_3_2"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3292:1: rule__STable__CachedAssignment_3_2 : ( ( 'cached' ) ) ;
    public final void rule__STable__CachedAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3296:1: ( ( ( 'cached' ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3297:1: ( ( 'cached' ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3297:1: ( ( 'cached' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3298:1: ( 'cached' )
            {
             before(grammarAccess.getSTableAccess().getCachedCachedKeyword_3_2_0()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3299:1: ( 'cached' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3300:1: 'cached'
            {
             before(grammarAccess.getSTableAccess().getCachedCachedKeyword_3_2_0()); 
            match(input,53,FOLLOW_53_in_rule__STable__CachedAssignment_3_27257); 
             after(grammarAccess.getSTableAccess().getCachedCachedKeyword_3_2_0()); 

            }

             after(grammarAccess.getSTableAccess().getCachedCachedKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STable__CachedAssignment_3_2"


    // $ANTLR start "rule__STable__PrefixAssignment_3_3_1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3315:1: rule__STable__PrefixAssignment_3_3_1 : ( RULE_ID ) ;
    public final void rule__STable__PrefixAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3319:1: ( ( RULE_ID ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3320:1: ( RULE_ID )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3320:1: ( RULE_ID )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3321:1: RULE_ID
            {
             before(grammarAccess.getSTableAccess().getPrefixIDTerminalRuleCall_3_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__STable__PrefixAssignment_3_3_17296); 
             after(grammarAccess.getSTableAccess().getPrefixIDTerminalRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STable__PrefixAssignment_3_3_1"


    // $ANTLR start "rule__STable__ColumnsAssignment_4"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3330:1: rule__STable__ColumnsAssignment_4 : ( ruleSTableMember ) ;
    public final void rule__STable__ColumnsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3334:1: ( ( ruleSTableMember ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3335:1: ( ruleSTableMember )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3335:1: ( ruleSTableMember )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3336:1: ruleSTableMember
            {
             before(grammarAccess.getSTableAccess().getColumnsSTableMemberParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleSTableMember_in_rule__STable__ColumnsAssignment_47327);
            ruleSTableMember();

            state._fsp--;

             after(grammarAccess.getSTableAccess().getColumnsSTableMemberParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STable__ColumnsAssignment_4"


    // $ANTLR start "rule__SColumn__NameAssignment_1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3345:1: rule__SColumn__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SColumn__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3349:1: ( ( RULE_ID ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3350:1: ( RULE_ID )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3350:1: ( RULE_ID )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3351:1: RULE_ID
            {
             before(grammarAccess.getSColumnAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SColumn__NameAssignment_17358); 
             after(grammarAccess.getSColumnAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SColumn__NameAssignment_1"


    // $ANTLR start "rule__SColumn__ExtTypeAssignment_2_0"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3360:1: rule__SColumn__ExtTypeAssignment_2_0 : ( ( ruleLFQN ) ) ;
    public final void rule__SColumn__ExtTypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3364:1: ( ( ( ruleLFQN ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3365:1: ( ( ruleLFQN ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3365:1: ( ( ruleLFQN ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3366:1: ( ruleLFQN )
            {
             before(grammarAccess.getSColumnAccess().getExtTypeSExtDeclaredSQLTypeCrossReference_2_0_0()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3367:1: ( ruleLFQN )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3368:1: ruleLFQN
            {
             before(grammarAccess.getSColumnAccess().getExtTypeSExtDeclaredSQLTypeLFQNParserRuleCall_2_0_0_1()); 
            pushFollow(FOLLOW_ruleLFQN_in_rule__SColumn__ExtTypeAssignment_2_07393);
            ruleLFQN();

            state._fsp--;

             after(grammarAccess.getSColumnAccess().getExtTypeSExtDeclaredSQLTypeLFQNParserRuleCall_2_0_0_1()); 

            }

             after(grammarAccess.getSColumnAccess().getExtTypeSExtDeclaredSQLTypeCrossReference_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SColumn__ExtTypeAssignment_2_0"


    // $ANTLR start "rule__SColumn__InlinedTypeAssignment_2_1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3379:1: rule__SColumn__InlinedTypeAssignment_2_1 : ( ruleSInlinedSQLType ) ;
    public final void rule__SColumn__InlinedTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3383:1: ( ( ruleSInlinedSQLType ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3384:1: ( ruleSInlinedSQLType )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3384:1: ( ruleSInlinedSQLType )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3385:1: ruleSInlinedSQLType
            {
             before(grammarAccess.getSColumnAccess().getInlinedTypeSInlinedSQLTypeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleSInlinedSQLType_in_rule__SColumn__InlinedTypeAssignment_2_17428);
            ruleSInlinedSQLType();

            state._fsp--;

             after(grammarAccess.getSColumnAccess().getInlinedTypeSInlinedSQLTypeParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SColumn__InlinedTypeAssignment_2_1"


    // $ANTLR start "rule__SColumn__SimpleTypeAssignment_2_2"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3394:1: rule__SColumn__SimpleTypeAssignment_2_2 : ( ruleSSimpleTypes ) ;
    public final void rule__SColumn__SimpleTypeAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3398:1: ( ( ruleSSimpleTypes ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3399:1: ( ruleSSimpleTypes )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3399:1: ( ruleSSimpleTypes )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3400:1: ruleSSimpleTypes
            {
             before(grammarAccess.getSColumnAccess().getSimpleTypeSSimpleTypesEnumRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleSSimpleTypes_in_rule__SColumn__SimpleTypeAssignment_2_27459);
            ruleSSimpleTypes();

            state._fsp--;

             after(grammarAccess.getSColumnAccess().getSimpleTypeSSimpleTypesEnumRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SColumn__SimpleTypeAssignment_2_2"


    // $ANTLR start "rule__SColumn__PropsAssignment_3"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3409:1: rule__SColumn__PropsAssignment_3 : ( ruleSColumnProps ) ;
    public final void rule__SColumn__PropsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3413:1: ( ( ruleSColumnProps ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3414:1: ( ruleSColumnProps )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3414:1: ( ruleSColumnProps )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3415:1: ruleSColumnProps
            {
             before(grammarAccess.getSColumnAccess().getPropsSColumnPropsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSColumnProps_in_rule__SColumn__PropsAssignment_37490);
            ruleSColumnProps();

            state._fsp--;

             after(grammarAccess.getSColumnAccess().getPropsSColumnPropsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SColumn__PropsAssignment_3"


    // $ANTLR start "rule__SJoinColumn__NameAssignment_1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3424:1: rule__SJoinColumn__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SJoinColumn__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3428:1: ( ( RULE_ID ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3429:1: ( RULE_ID )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3429:1: ( RULE_ID )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3430:1: RULE_ID
            {
             before(grammarAccess.getSJoinColumnAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SJoinColumn__NameAssignment_17521); 
             after(grammarAccess.getSJoinColumnAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJoinColumn__NameAssignment_1"


    // $ANTLR start "rule__SJoinColumn__ReferencedTypeAssignment_2"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3439:1: rule__SJoinColumn__ReferencedTypeAssignment_2 : ( ( ruleLFQN ) ) ;
    public final void rule__SJoinColumn__ReferencedTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3443:1: ( ( ( ruleLFQN ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3444:1: ( ( ruleLFQN ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3444:1: ( ( ruleLFQN ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3445:1: ( ruleLFQN )
            {
             before(grammarAccess.getSJoinColumnAccess().getReferencedTypeSTableCrossReference_2_0()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3446:1: ( ruleLFQN )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3447:1: ruleLFQN
            {
             before(grammarAccess.getSJoinColumnAccess().getReferencedTypeSTableLFQNParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_ruleLFQN_in_rule__SJoinColumn__ReferencedTypeAssignment_27556);
            ruleLFQN();

            state._fsp--;

             after(grammarAccess.getSJoinColumnAccess().getReferencedTypeSTableLFQNParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getSJoinColumnAccess().getReferencedTypeSTableCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJoinColumn__ReferencedTypeAssignment_2"


    // $ANTLR start "rule__SJoinColumn__PropsAssignment_3"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3458:1: rule__SJoinColumn__PropsAssignment_3 : ( ruleSColumnProps ) ;
    public final void rule__SJoinColumn__PropsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3462:1: ( ( ruleSColumnProps ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3463:1: ( ruleSColumnProps )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3463:1: ( ruleSColumnProps )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3464:1: ruleSColumnProps
            {
             before(grammarAccess.getSJoinColumnAccess().getPropsSColumnPropsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSColumnProps_in_rule__SJoinColumn__PropsAssignment_37591);
            ruleSColumnProps();

            state._fsp--;

             after(grammarAccess.getSJoinColumnAccess().getPropsSColumnPropsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJoinColumn__PropsAssignment_3"


    // $ANTLR start "rule__SColumnProps__NullableAssignment_2_0"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3473:1: rule__SColumnProps__NullableAssignment_2_0 : ( ( 'nullable' ) ) ;
    public final void rule__SColumnProps__NullableAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3477:1: ( ( ( 'nullable' ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3478:1: ( ( 'nullable' ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3478:1: ( ( 'nullable' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3479:1: ( 'nullable' )
            {
             before(grammarAccess.getSColumnPropsAccess().getNullableNullableKeyword_2_0_0()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3480:1: ( 'nullable' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3481:1: 'nullable'
            {
             before(grammarAccess.getSColumnPropsAccess().getNullableNullableKeyword_2_0_0()); 
            match(input,54,FOLLOW_54_in_rule__SColumnProps__NullableAssignment_2_07627); 
             after(grammarAccess.getSColumnPropsAccess().getNullableNullableKeyword_2_0_0()); 

            }

             after(grammarAccess.getSColumnPropsAccess().getNullableNullableKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SColumnProps__NullableAssignment_2_0"


    // $ANTLR start "rule__SColumnProps__AesAssignment_2_1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3496:1: rule__SColumnProps__AesAssignment_2_1 : ( ( 'AES' ) ) ;
    public final void rule__SColumnProps__AesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3500:1: ( ( ( 'AES' ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3501:1: ( ( 'AES' ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3501:1: ( ( 'AES' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3502:1: ( 'AES' )
            {
             before(grammarAccess.getSColumnPropsAccess().getAesAESKeyword_2_1_0()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3503:1: ( 'AES' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3504:1: 'AES'
            {
             before(grammarAccess.getSColumnPropsAccess().getAesAESKeyword_2_1_0()); 
            match(input,55,FOLLOW_55_in_rule__SColumnProps__AesAssignment_2_17671); 
             after(grammarAccess.getSColumnPropsAccess().getAesAESKeyword_2_1_0()); 

            }

             after(grammarAccess.getSColumnPropsAccess().getAesAESKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SColumnProps__AesAssignment_2_1"


    // $ANTLR start "rule__SColumnProps__IndexAssignment_2_2_1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3519:1: rule__SColumnProps__IndexAssignment_2_2_1 : ( ruleSIndex ) ;
    public final void rule__SColumnProps__IndexAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3523:1: ( ( ruleSIndex ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3524:1: ( ruleSIndex )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3524:1: ( ruleSIndex )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3525:1: ruleSIndex
            {
             before(grammarAccess.getSColumnPropsAccess().getIndexSIndexEnumRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleSIndex_in_rule__SColumnProps__IndexAssignment_2_2_17710);
            ruleSIndex();

            state._fsp--;

             after(grammarAccess.getSColumnPropsAccess().getIndexSIndexEnumRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SColumnProps__IndexAssignment_2_2_1"


    // $ANTLR start "rule__SColumnProps__JavacolumnAssignment_2_3_1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3534:1: rule__SColumnProps__JavacolumnAssignment_2_3_1 : ( RULE_ID ) ;
    public final void rule__SColumnProps__JavacolumnAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3538:1: ( ( RULE_ID ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3539:1: ( RULE_ID )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3539:1: ( RULE_ID )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3540:1: RULE_ID
            {
             before(grammarAccess.getSColumnPropsAccess().getJavacolumnIDTerminalRuleCall_2_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SColumnProps__JavacolumnAssignment_2_3_17741); 
             after(grammarAccess.getSColumnPropsAccess().getJavacolumnIDTerminalRuleCall_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SColumnProps__JavacolumnAssignment_2_3_1"


    // $ANTLR start "rule__SEnum__NameAssignment_1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3549:1: rule__SEnum__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SEnum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3553:1: ( ( RULE_ID ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3554:1: ( RULE_ID )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3554:1: ( RULE_ID )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3555:1: RULE_ID
            {
             before(grammarAccess.getSEnumAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SEnum__NameAssignment_17772); 
             after(grammarAccess.getSEnumAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnum__NameAssignment_1"


    // $ANTLR start "rule__SEnum__LiteralsAssignment_3"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3564:1: rule__SEnum__LiteralsAssignment_3 : ( ruleSEnumLiteral ) ;
    public final void rule__SEnum__LiteralsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3568:1: ( ( ruleSEnumLiteral ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3569:1: ( ruleSEnumLiteral )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3569:1: ( ruleSEnumLiteral )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3570:1: ruleSEnumLiteral
            {
             before(grammarAccess.getSEnumAccess().getLiteralsSEnumLiteralParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSEnumLiteral_in_rule__SEnum__LiteralsAssignment_37803);
            ruleSEnumLiteral();

            state._fsp--;

             after(grammarAccess.getSEnumAccess().getLiteralsSEnumLiteralParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnum__LiteralsAssignment_3"


    // $ANTLR start "rule__SEnumLiteral__NameAssignment_0"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3579:1: rule__SEnumLiteral__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SEnumLiteral__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3583:1: ( ( RULE_ID ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3584:1: ( RULE_ID )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3584:1: ( RULE_ID )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3585:1: RULE_ID
            {
             before(grammarAccess.getSEnumLiteralAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SEnumLiteral__NameAssignment_07834); 
             after(grammarAccess.getSEnumLiteralAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumLiteral__NameAssignment_0"


    // $ANTLR start "rule__SEnumLiteral__ValueAssignment_2"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3594:1: rule__SEnumLiteral__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__SEnumLiteral__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3598:1: ( ( RULE_INT ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3599:1: ( RULE_INT )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3599:1: ( RULE_INT )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3600:1: RULE_INT
            {
             before(grammarAccess.getSEnumLiteralAccess().getValueINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SEnumLiteral__ValueAssignment_27865); 
             after(grammarAccess.getSEnumLiteralAccess().getValueINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumLiteral__ValueAssignment_2"


    // $ANTLR start "rule__SString__ValueAssignment_1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3609:1: rule__SString__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__SString__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3613:1: ( ( RULE_INT ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3614:1: ( RULE_INT )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3614:1: ( RULE_INT )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3615:1: RULE_INT
            {
             before(grammarAccess.getSStringAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SString__ValueAssignment_17896); 
             after(grammarAccess.getSStringAccess().getValueINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SString__ValueAssignment_1"


    // $ANTLR start "rule__SDecimal__ValueAssignment_1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3624:1: rule__SDecimal__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__SDecimal__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3628:1: ( ( RULE_INT ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3629:1: ( RULE_INT )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3629:1: ( RULE_INT )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:3630:1: RULE_INT
            {
             before(grammarAccess.getSDecimalAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SDecimal__ValueAssignment_17927); 
             after(grammarAccess.getSDecimalAccess().getValueINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDecimal__ValueAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSModel_in_entryRuleSModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SModel__Group__0_in_ruleSModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSSettings_in_entryRuleSSettings121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSSettings128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SSettings__Group__0_in_ruleSSettings154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSArtifact_in_entryRuleSArtifact181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSArtifact188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SArtifact__Alternatives_in_ruleSArtifact214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTable_in_entryRuleSTable241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSTable248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__STable__Group__0_in_ruleSTable274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTableMember_in_entryRuleSTableMember301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSTableMember308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__STableMember__Alternatives_in_ruleSTableMember334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSColumn_in_entryRuleSColumn361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSColumn368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumn__Group__0_in_ruleSColumn394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJoinColumn_in_entryRuleSJoinColumn421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSJoinColumn428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJoinColumn__Group__0_in_ruleSJoinColumn454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSColumnProps_in_entryRuleSColumnProps481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSColumnProps488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumnProps__Group__0_in_ruleSColumnProps514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSInlinedSQLType_in_entryRuleSInlinedSQLType543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSInlinedSQLType550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SInlinedSQLType__Alternatives_in_ruleSInlinedSQLType576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSEnum_in_entryRuleSEnum603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSEnum610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SEnum__Group__0_in_ruleSEnum636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSEnumLiteral_in_entryRuleSEnumLiteral663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSEnumLiteral670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SEnumLiteral__Group__0_in_ruleSEnumLiteral696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSString_in_entryRuleSString723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSString730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SString__Group__0_in_ruleSString756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSDecimal_in_entryRuleSDecimal783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSDecimal790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDecimal__Group__0_in_ruleSDecimal816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLFQN_in_entryRuleLFQN843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLFQN850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LFQN__Group__0_in_ruleLFQN876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDBEngine__Alternatives_in_ruleSDBEngine913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SSimpleTypes__Alternatives_in_ruleSSimpleTypes949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SIndex__Alternatives_in_ruleSIndex985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTable_in_rule__SArtifact__Alternatives1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSEnum_in_rule__SArtifact__Alternatives1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSColumn_in_rule__STableMember__Alternatives1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJoinColumn_in_rule__STableMember__Alternatives1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumn__ExtTypeAssignment_2_0_in_rule__SColumn__Alternatives_21118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumn__InlinedTypeAssignment_2_1_in_rule__SColumn__Alternatives_21136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumn__SimpleTypeAssignment_2_2_in_rule__SColumn__Alternatives_21154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSString_in_rule__SInlinedSQLType__Alternatives1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSDecimal_in_rule__SInlinedSQLType__Alternatives1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__SDBEngine__Alternatives1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SDBEngine__Alternatives1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SSimpleTypes__Alternatives1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SSimpleTypes__Alternatives1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SSimpleTypes__Alternatives1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SSimpleTypes__Alternatives1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SSimpleTypes__Alternatives1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SSimpleTypes__Alternatives1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__SSimpleTypes__Alternatives1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SSimpleTypes__Alternatives1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SSimpleTypes__Alternatives1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SSimpleTypes__Alternatives1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SSimpleTypes__Alternatives1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__SSimpleTypes__Alternatives1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__SSimpleTypes__Alternatives1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__SSimpleTypes__Alternatives1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__SIndex__Alternatives1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__SIndex__Alternatives1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__SIndex__Alternatives1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__SIndex__Alternatives1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SModel__Group__0__Impl_in_rule__SModel__Group__01699 = new BitSet(new long[]{0x0000802100000000L});
    public static final BitSet FOLLOW_rule__SModel__Group__1_in_rule__SModel__Group__01702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SModel__Group_0__0_in_rule__SModel__Group__0__Impl1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SModel__Group__1__Impl_in_rule__SModel__Group__11759 = new BitSet(new long[]{0x0000802100000000L});
    public static final BitSet FOLLOW_rule__SModel__Group__2_in_rule__SModel__Group__11762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SModel__SettingsAssignment_1_in_rule__SModel__Group__1__Impl1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SModel__Group__2__Impl_in_rule__SModel__Group__21820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SModel__ArtifactAssignment_2_in_rule__SModel__Group__2__Impl1847 = new BitSet(new long[]{0x0000802000000002L});
    public static final BitSet FOLLOW_rule__SModel__Group_0__0__Impl_in_rule__SModel__Group_0__01884 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SModel__Group_0__1_in_rule__SModel__Group_0__01887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__SModel__Group_0__0__Impl1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SModel__Group_0__1__Impl_in_rule__SModel__Group_0__11946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SModel__GeneratedFileAssignment_0_1_in_rule__SModel__Group_0__1__Impl1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SSettings__Group__0__Impl_in_rule__SSettings__Group__02007 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__SSettings__Group__1_in_rule__SSettings__Group__02010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SSettings__Group__1__Impl_in_rule__SSettings__Group__12068 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_rule__SSettings__Group__2_in_rule__SSettings__Group__12071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__SSettings__Group__1__Impl2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SSettings__Group__2__Impl_in_rule__SSettings__Group__22130 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__SSettings__Group__3_in_rule__SSettings__Group__22133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SSettings__UnorderedGroup_2_in_rule__SSettings__Group__2__Impl2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SSettings__Group__3__Impl_in_rule__SSettings__Group__32190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__SSettings__Group__3__Impl2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SSettings__Group_2_0__0__Impl_in_rule__SSettings__Group_2_0__02257 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SSettings__Group_2_0__1_in_rule__SSettings__Group_2_0__02260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__SSettings__Group_2_0__0__Impl2288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SSettings__Group_2_0__1__Impl_in_rule__SSettings__Group_2_0__12319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SSettings__SchemaAssignment_2_0_1_in_rule__SSettings__Group_2_0__1__Impl2346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SSettings__Group_2_1__0__Impl_in_rule__SSettings__Group_2_1__02380 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SSettings__Group_2_1__1_in_rule__SSettings__Group_2_1__02383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__SSettings__Group_2_1__0__Impl2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SSettings__Group_2_1__1__Impl_in_rule__SSettings__Group_2_1__12442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SSettings__JavapackageAssignment_2_1_1_in_rule__SSettings__Group_2_1__1__Impl2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SSettings__Group_2_2__0__Impl_in_rule__SSettings__Group_2_2__02503 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__SSettings__Group_2_2__1_in_rule__SSettings__Group_2_2__02506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__SSettings__Group_2_2__0__Impl2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SSettings__Group_2_2__1__Impl_in_rule__SSettings__Group_2_2__12565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SSettings__EngineAssignment_2_2_1_in_rule__SSettings__Group_2_2__1__Impl2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__STable__Group__0__Impl_in_rule__STable__Group__02626 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__STable__Group__1_in_rule__STable__Group__02629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__STable__Group__0__Impl2657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__STable__Group__1__Impl_in_rule__STable__Group__12688 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__STable__Group__2_in_rule__STable__Group__12691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__STable__NameAssignment_1_in_rule__STable__Group__1__Impl2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__STable__Group__2__Impl_in_rule__STable__Group__22748 = new BitSet(new long[]{0x0020018100000000L});
    public static final BitSet FOLLOW_rule__STable__Group__3_in_rule__STable__Group__22751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__STable__Group__2__Impl2779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__STable__Group__3__Impl_in_rule__STable__Group__32810 = new BitSet(new long[]{0x00000C0200000000L});
    public static final BitSet FOLLOW_rule__STable__Group__4_in_rule__STable__Group__32813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__STable__UnorderedGroup_3_in_rule__STable__Group__3__Impl2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__STable__Group__4__Impl_in_rule__STable__Group__42870 = new BitSet(new long[]{0x00000C0200000000L});
    public static final BitSet FOLLOW_rule__STable__Group__5_in_rule__STable__Group__42873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__STable__ColumnsAssignment_4_in_rule__STable__Group__4__Impl2900 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_rule__STable__Group__5__Impl_in_rule__STable__Group__52931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__STable__Group__5__Impl2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__STable__Group_3_1__0__Impl_in_rule__STable__Group_3_1__03002 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__STable__Group_3_1__1_in_rule__STable__Group_3_1__03005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__STable__Group_3_1__0__Impl3033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__STable__Group_3_1__1__Impl_in_rule__STable__Group_3_1__13064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__STable__EntitynameAssignment_3_1_1_in_rule__STable__Group_3_1__1__Impl3091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__STable__Group_3_3__0__Impl_in_rule__STable__Group_3_3__03125 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__STable__Group_3_3__1_in_rule__STable__Group_3_3__03128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__STable__Group_3_3__0__Impl3156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__STable__Group_3_3__1__Impl_in_rule__STable__Group_3_3__13187 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__STable__Group_3_3__2_in_rule__STable__Group_3_3__13190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__STable__PrefixAssignment_3_3_1_in_rule__STable__Group_3_3__1__Impl3217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__STable__Group_3_3__2__Impl_in_rule__STable__Group_3_3__23247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__STable__Group_3_3__2__Impl3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumn__Group__0__Impl_in_rule__SColumn__Group__03312 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SColumn__Group__1_in_rule__SColumn__Group__03315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__SColumn__Group__0__Impl3343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumn__Group__1__Impl_in_rule__SColumn__Group__13374 = new BitSet(new long[]{0x000A000007FFE010L});
    public static final BitSet FOLLOW_rule__SColumn__Group__2_in_rule__SColumn__Group__13377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumn__NameAssignment_1_in_rule__SColumn__Group__1__Impl3404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumn__Group__2__Impl_in_rule__SColumn__Group__23434 = new BitSet(new long[]{0x0000120000000000L});
    public static final BitSet FOLLOW_rule__SColumn__Group__3_in_rule__SColumn__Group__23437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumn__Alternatives_2_in_rule__SColumn__Group__2__Impl3464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumn__Group__3__Impl_in_rule__SColumn__Group__33494 = new BitSet(new long[]{0x0000120000000000L});
    public static final BitSet FOLLOW_rule__SColumn__Group__4_in_rule__SColumn__Group__33497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumn__PropsAssignment_3_in_rule__SColumn__Group__3__Impl3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumn__Group__4__Impl_in_rule__SColumn__Group__43555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__SColumn__Group__4__Impl3583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJoinColumn__Group__0__Impl_in_rule__SJoinColumn__Group__03624 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SJoinColumn__Group__1_in_rule__SJoinColumn__Group__03627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__SJoinColumn__Group__0__Impl3655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJoinColumn__Group__1__Impl_in_rule__SJoinColumn__Group__13686 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SJoinColumn__Group__2_in_rule__SJoinColumn__Group__13689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJoinColumn__NameAssignment_1_in_rule__SJoinColumn__Group__1__Impl3716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJoinColumn__Group__2__Impl_in_rule__SJoinColumn__Group__23746 = new BitSet(new long[]{0x0000120000000000L});
    public static final BitSet FOLLOW_rule__SJoinColumn__Group__3_in_rule__SJoinColumn__Group__23749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJoinColumn__ReferencedTypeAssignment_2_in_rule__SJoinColumn__Group__2__Impl3776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJoinColumn__Group__3__Impl_in_rule__SJoinColumn__Group__33806 = new BitSet(new long[]{0x0000120000000000L});
    public static final BitSet FOLLOW_rule__SJoinColumn__Group__4_in_rule__SJoinColumn__Group__33809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJoinColumn__PropsAssignment_3_in_rule__SJoinColumn__Group__3__Impl3836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJoinColumn__Group__4__Impl_in_rule__SJoinColumn__Group__43867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__SJoinColumn__Group__4__Impl3895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumnProps__Group__0__Impl_in_rule__SColumnProps__Group__03936 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__SColumnProps__Group__1_in_rule__SColumnProps__Group__03939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumnProps__Group__1__Impl_in_rule__SColumnProps__Group__13997 = new BitSet(new long[]{0x00C0600000000000L});
    public static final BitSet FOLLOW_rule__SColumnProps__Group__2_in_rule__SColumnProps__Group__14000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__SColumnProps__Group__1__Impl4028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumnProps__Group__2__Impl_in_rule__SColumnProps__Group__24059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumnProps__UnorderedGroup_2_in_rule__SColumnProps__Group__2__Impl4086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumnProps__Group_2_2__0__Impl_in_rule__SColumnProps__Group_2_2__04122 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_rule__SColumnProps__Group_2_2__1_in_rule__SColumnProps__Group_2_2__04125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__SColumnProps__Group_2_2__0__Impl4153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumnProps__Group_2_2__1__Impl_in_rule__SColumnProps__Group_2_2__14184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumnProps__IndexAssignment_2_2_1_in_rule__SColumnProps__Group_2_2__1__Impl4211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumnProps__Group_2_3__0__Impl_in_rule__SColumnProps__Group_2_3__04245 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SColumnProps__Group_2_3__1_in_rule__SColumnProps__Group_2_3__04248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__SColumnProps__Group_2_3__0__Impl4276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumnProps__Group_2_3__1__Impl_in_rule__SColumnProps__Group_2_3__14307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumnProps__JavacolumnAssignment_2_3_1_in_rule__SColumnProps__Group_2_3__1__Impl4334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SEnum__Group__0__Impl_in_rule__SEnum__Group__04368 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SEnum__Group__1_in_rule__SEnum__Group__04371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__SEnum__Group__0__Impl4399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SEnum__Group__1__Impl_in_rule__SEnum__Group__14430 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__SEnum__Group__2_in_rule__SEnum__Group__14433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SEnum__NameAssignment_1_in_rule__SEnum__Group__1__Impl4460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SEnum__Group__2__Impl_in_rule__SEnum__Group__24490 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_rule__SEnum__Group__3_in_rule__SEnum__Group__24493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__SEnum__Group__2__Impl4521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SEnum__Group__3__Impl_in_rule__SEnum__Group__34552 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_rule__SEnum__Group__4_in_rule__SEnum__Group__34555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SEnum__LiteralsAssignment_3_in_rule__SEnum__Group__3__Impl4582 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__SEnum__Group__4__Impl_in_rule__SEnum__Group__44613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__SEnum__Group__4__Impl4641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SEnumLiteral__Group__0__Impl_in_rule__SEnumLiteral__Group__04682 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__SEnumLiteral__Group__1_in_rule__SEnumLiteral__Group__04685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SEnumLiteral__NameAssignment_0_in_rule__SEnumLiteral__Group__0__Impl4712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SEnumLiteral__Group__1__Impl_in_rule__SEnumLiteral__Group__14742 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SEnumLiteral__Group__2_in_rule__SEnumLiteral__Group__14745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__SEnumLiteral__Group__1__Impl4773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SEnumLiteral__Group__2__Impl_in_rule__SEnumLiteral__Group__24804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SEnumLiteral__ValueAssignment_2_in_rule__SEnumLiteral__Group__2__Impl4831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SString__Group__0__Impl_in_rule__SString__Group__04867 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SString__Group__1_in_rule__SString__Group__04870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__SString__Group__0__Impl4898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SString__Group__1__Impl_in_rule__SString__Group__14929 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__SString__Group__2_in_rule__SString__Group__14932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SString__ValueAssignment_1_in_rule__SString__Group__1__Impl4959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SString__Group__2__Impl_in_rule__SString__Group__24989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__SString__Group__2__Impl5017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDecimal__Group__0__Impl_in_rule__SDecimal__Group__05054 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SDecimal__Group__1_in_rule__SDecimal__Group__05057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__SDecimal__Group__0__Impl5085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDecimal__Group__1__Impl_in_rule__SDecimal__Group__15116 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__SDecimal__Group__2_in_rule__SDecimal__Group__15119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDecimal__ValueAssignment_1_in_rule__SDecimal__Group__1__Impl5146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDecimal__Group__2__Impl_in_rule__SDecimal__Group__25176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__SDecimal__Group__2__Impl5204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LFQN__Group__0__Impl_in_rule__LFQN__Group__05241 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__LFQN__Group__1_in_rule__LFQN__Group__05244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LFQN__Group__0__Impl5271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LFQN__Group__1__Impl_in_rule__LFQN__Group__15300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LFQN__Group_1__0_in_rule__LFQN__Group__1__Impl5327 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_rule__LFQN__Group_1__0__Impl_in_rule__LFQN__Group_1__05362 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LFQN__Group_1__1_in_rule__LFQN__Group_1__05365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__LFQN__Group_1__0__Impl5393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LFQN__Group_1__1__Impl_in_rule__LFQN__Group_1__15424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LFQN__Group_1__1__Impl5451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SSettings__UnorderedGroup_2__0_in_rule__SSettings__UnorderedGroup_25485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SSettings__Group_2_0__0_in_rule__SSettings__UnorderedGroup_2__Impl5572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SSettings__Group_2_1__0_in_rule__SSettings__UnorderedGroup_2__Impl5663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SSettings__Group_2_2__0_in_rule__SSettings__UnorderedGroup_2__Impl5754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SSettings__UnorderedGroup_2__Impl_in_rule__SSettings__UnorderedGroup_2__05813 = new BitSet(new long[]{0x0000001C00000002L});
    public static final BitSet FOLLOW_rule__SSettings__UnorderedGroup_2__1_in_rule__SSettings__UnorderedGroup_2__05816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SSettings__UnorderedGroup_2__Impl_in_rule__SSettings__UnorderedGroup_2__15841 = new BitSet(new long[]{0x0000001C00000002L});
    public static final BitSet FOLLOW_rule__SSettings__UnorderedGroup_2__2_in_rule__SSettings__UnorderedGroup_2__15844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SSettings__UnorderedGroup_2__Impl_in_rule__SSettings__UnorderedGroup_2__25869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__STable__UnorderedGroup_3__0_in_rule__STable__UnorderedGroup_35899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__STable__SettingsAssignment_3_0_in_rule__STable__UnorderedGroup_3__Impl5986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__STable__Group_3_1__0_in_rule__STable__UnorderedGroup_3__Impl6077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__STable__CachedAssignment_3_2_in_rule__STable__UnorderedGroup_3__Impl6168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__STable__Group_3_3__0_in_rule__STable__UnorderedGroup_3__Impl6259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__STable__UnorderedGroup_3__Impl_in_rule__STable__UnorderedGroup_3__06318 = new BitSet(new long[]{0x0020018100000002L});
    public static final BitSet FOLLOW_rule__STable__UnorderedGroup_3__1_in_rule__STable__UnorderedGroup_3__06321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__STable__UnorderedGroup_3__Impl_in_rule__STable__UnorderedGroup_3__16346 = new BitSet(new long[]{0x0020018100000002L});
    public static final BitSet FOLLOW_rule__STable__UnorderedGroup_3__2_in_rule__STable__UnorderedGroup_3__16349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__STable__UnorderedGroup_3__Impl_in_rule__STable__UnorderedGroup_3__26374 = new BitSet(new long[]{0x0020018100000002L});
    public static final BitSet FOLLOW_rule__STable__UnorderedGroup_3__3_in_rule__STable__UnorderedGroup_3__26377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__STable__UnorderedGroup_3__Impl_in_rule__STable__UnorderedGroup_3__36402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumnProps__UnorderedGroup_2__0_in_rule__SColumnProps__UnorderedGroup_26434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumnProps__NullableAssignment_2_0_in_rule__SColumnProps__UnorderedGroup_2__Impl6521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumnProps__AesAssignment_2_1_in_rule__SColumnProps__UnorderedGroup_2__Impl6612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumnProps__Group_2_2__0_in_rule__SColumnProps__UnorderedGroup_2__Impl6703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumnProps__Group_2_3__0_in_rule__SColumnProps__UnorderedGroup_2__Impl6794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumnProps__UnorderedGroup_2__Impl_in_rule__SColumnProps__UnorderedGroup_2__06853 = new BitSet(new long[]{0x00C0600000000002L});
    public static final BitSet FOLLOW_rule__SColumnProps__UnorderedGroup_2__1_in_rule__SColumnProps__UnorderedGroup_2__06856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumnProps__UnorderedGroup_2__Impl_in_rule__SColumnProps__UnorderedGroup_2__16881 = new BitSet(new long[]{0x00C0600000000002L});
    public static final BitSet FOLLOW_rule__SColumnProps__UnorderedGroup_2__2_in_rule__SColumnProps__UnorderedGroup_2__16884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumnProps__UnorderedGroup_2__Impl_in_rule__SColumnProps__UnorderedGroup_2__26909 = new BitSet(new long[]{0x00C0600000000002L});
    public static final BitSet FOLLOW_rule__SColumnProps__UnorderedGroup_2__3_in_rule__SColumnProps__UnorderedGroup_2__26912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumnProps__UnorderedGroup_2__Impl_in_rule__SColumnProps__UnorderedGroup_2__36937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SModel__GeneratedFileAssignment_0_16973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSSettings_in_rule__SModel__SettingsAssignment_17004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSArtifact_in_rule__SModel__ArtifactAssignment_27035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SSettings__SchemaAssignment_2_0_17066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLFQN_in_rule__SSettings__JavapackageAssignment_2_1_17097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSDBEngine_in_rule__SSettings__EngineAssignment_2_2_17128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__STable__NameAssignment_17159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSSettings_in_rule__STable__SettingsAssignment_3_07190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__STable__EntitynameAssignment_3_1_17221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__STable__CachedAssignment_3_27257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__STable__PrefixAssignment_3_3_17296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTableMember_in_rule__STable__ColumnsAssignment_47327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SColumn__NameAssignment_17358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLFQN_in_rule__SColumn__ExtTypeAssignment_2_07393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSInlinedSQLType_in_rule__SColumn__InlinedTypeAssignment_2_17428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSSimpleTypes_in_rule__SColumn__SimpleTypeAssignment_2_27459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSColumnProps_in_rule__SColumn__PropsAssignment_37490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SJoinColumn__NameAssignment_17521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLFQN_in_rule__SJoinColumn__ReferencedTypeAssignment_27556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSColumnProps_in_rule__SJoinColumn__PropsAssignment_37591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__SColumnProps__NullableAssignment_2_07627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__SColumnProps__AesAssignment_2_17671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSIndex_in_rule__SColumnProps__IndexAssignment_2_2_17710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SColumnProps__JavacolumnAssignment_2_3_17741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SEnum__NameAssignment_17772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSEnumLiteral_in_rule__SEnum__LiteralsAssignment_37803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SEnumLiteral__NameAssignment_07834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SEnumLiteral__ValueAssignment_27865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SString__ValueAssignment_17896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SDecimal__ValueAssignment_17927 = new BitSet(new long[]{0x0000000000000002L});

}

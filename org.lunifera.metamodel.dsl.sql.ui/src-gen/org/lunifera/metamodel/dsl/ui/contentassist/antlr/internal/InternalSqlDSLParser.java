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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'InnoDB'", "'MyISAM'", "'Int'", "'Tinyint'", "'Smallint'", "'Mediumint'", "'Boolean'", "'Blob'", "'Datetime'", "'Date'", "'Time'", "'Polygon'", "'Point'", "'Foto'", "'Currency'", "'Coordinate'", "'No'", "'Yes'", "'Unique'", "'Spatial'", "'settings {'", "'}'", "'schema='", "'engine='", "'table'", "'{'", "'prefix'", "';'", "'column'", "'joincolumn'", "'with'", "'index='", "'enum'", "'='", "'String('", "')'", "'Decimal('", "'nullable'", "'AES'"
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


    // $ANTLR start "entryRuleSEntityMember"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:172:1: entryRuleSEntityMember : ruleSEntityMember EOF ;
    public final void entryRuleSEntityMember() throws RecognitionException {
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:173:1: ( ruleSEntityMember EOF )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:174:1: ruleSEntityMember EOF
            {
             before(grammarAccess.getSEntityMemberRule()); 
            pushFollow(FOLLOW_ruleSEntityMember_in_entryRuleSEntityMember301);
            ruleSEntityMember();

            state._fsp--;

             after(grammarAccess.getSEntityMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSEntityMember308); 

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
    // $ANTLR end "entryRuleSEntityMember"


    // $ANTLR start "ruleSEntityMember"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:181:1: ruleSEntityMember : ( ( rule__SEntityMember__Alternatives ) ) ;
    public final void ruleSEntityMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:185:2: ( ( ( rule__SEntityMember__Alternatives ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:186:1: ( ( rule__SEntityMember__Alternatives ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:186:1: ( ( rule__SEntityMember__Alternatives ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:187:1: ( rule__SEntityMember__Alternatives )
            {
             before(grammarAccess.getSEntityMemberAccess().getAlternatives()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:188:1: ( rule__SEntityMember__Alternatives )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:188:2: rule__SEntityMember__Alternatives
            {
            pushFollow(FOLLOW_rule__SEntityMember__Alternatives_in_ruleSEntityMember334);
            rule__SEntityMember__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSEntityMemberAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSEntityMember"


    // $ANTLR start "entryRuleSProperty"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:200:1: entryRuleSProperty : ruleSProperty EOF ;
    public final void entryRuleSProperty() throws RecognitionException {
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:201:1: ( ruleSProperty EOF )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:202:1: ruleSProperty EOF
            {
             before(grammarAccess.getSPropertyRule()); 
            pushFollow(FOLLOW_ruleSProperty_in_entryRuleSProperty361);
            ruleSProperty();

            state._fsp--;

             after(grammarAccess.getSPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSProperty368); 

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
    // $ANTLR end "entryRuleSProperty"


    // $ANTLR start "ruleSProperty"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:209:1: ruleSProperty : ( ( rule__SProperty__Group__0 ) ) ;
    public final void ruleSProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:213:2: ( ( ( rule__SProperty__Group__0 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:214:1: ( ( rule__SProperty__Group__0 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:214:1: ( ( rule__SProperty__Group__0 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:215:1: ( rule__SProperty__Group__0 )
            {
             before(grammarAccess.getSPropertyAccess().getGroup()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:216:1: ( rule__SProperty__Group__0 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:216:2: rule__SProperty__Group__0
            {
            pushFollow(FOLLOW_rule__SProperty__Group__0_in_ruleSProperty394);
            rule__SProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSProperty"


    // $ANTLR start "entryRuleSJoinProperty"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:228:1: entryRuleSJoinProperty : ruleSJoinProperty EOF ;
    public final void entryRuleSJoinProperty() throws RecognitionException {
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:229:1: ( ruleSJoinProperty EOF )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:230:1: ruleSJoinProperty EOF
            {
             before(grammarAccess.getSJoinPropertyRule()); 
            pushFollow(FOLLOW_ruleSJoinProperty_in_entryRuleSJoinProperty421);
            ruleSJoinProperty();

            state._fsp--;

             after(grammarAccess.getSJoinPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSJoinProperty428); 

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
    // $ANTLR end "entryRuleSJoinProperty"


    // $ANTLR start "ruleSJoinProperty"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:237:1: ruleSJoinProperty : ( ( rule__SJoinProperty__Group__0 ) ) ;
    public final void ruleSJoinProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:241:2: ( ( ( rule__SJoinProperty__Group__0 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:242:1: ( ( rule__SJoinProperty__Group__0 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:242:1: ( ( rule__SJoinProperty__Group__0 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:243:1: ( rule__SJoinProperty__Group__0 )
            {
             before(grammarAccess.getSJoinPropertyAccess().getGroup()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:244:1: ( rule__SJoinProperty__Group__0 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:244:2: rule__SJoinProperty__Group__0
            {
            pushFollow(FOLLOW_rule__SJoinProperty__Group__0_in_ruleSJoinProperty454);
            rule__SJoinProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSJoinPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSJoinProperty"


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


    // $ANTLR start "ruleSDBEngine"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:427:1: ruleSDBEngine : ( ( rule__SDBEngine__Alternatives ) ) ;
    public final void ruleSDBEngine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:431:1: ( ( ( rule__SDBEngine__Alternatives ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:432:1: ( ( rule__SDBEngine__Alternatives ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:432:1: ( ( rule__SDBEngine__Alternatives ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:433:1: ( rule__SDBEngine__Alternatives )
            {
             before(grammarAccess.getSDBEngineAccess().getAlternatives()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:434:1: ( rule__SDBEngine__Alternatives )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:434:2: rule__SDBEngine__Alternatives
            {
            pushFollow(FOLLOW_rule__SDBEngine__Alternatives_in_ruleSDBEngine853);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:446:1: ruleSSimpleTypes : ( ( rule__SSimpleTypes__Alternatives ) ) ;
    public final void ruleSSimpleTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:450:1: ( ( ( rule__SSimpleTypes__Alternatives ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:451:1: ( ( rule__SSimpleTypes__Alternatives ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:451:1: ( ( rule__SSimpleTypes__Alternatives ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:452:1: ( rule__SSimpleTypes__Alternatives )
            {
             before(grammarAccess.getSSimpleTypesAccess().getAlternatives()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:453:1: ( rule__SSimpleTypes__Alternatives )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:453:2: rule__SSimpleTypes__Alternatives
            {
            pushFollow(FOLLOW_rule__SSimpleTypes__Alternatives_in_ruleSSimpleTypes889);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:465:1: ruleSIndex : ( ( rule__SIndex__Alternatives ) ) ;
    public final void ruleSIndex() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:469:1: ( ( ( rule__SIndex__Alternatives ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:470:1: ( ( rule__SIndex__Alternatives ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:470:1: ( ( rule__SIndex__Alternatives ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:471:1: ( rule__SIndex__Alternatives )
            {
             before(grammarAccess.getSIndexAccess().getAlternatives()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:472:1: ( rule__SIndex__Alternatives )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:472:2: rule__SIndex__Alternatives
            {
            pushFollow(FOLLOW_rule__SIndex__Alternatives_in_ruleSIndex925);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:483:1: rule__SArtifact__Alternatives : ( ( ruleSTable ) | ( ruleSEnum ) );
    public final void rule__SArtifact__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:487:1: ( ( ruleSTable ) | ( ruleSEnum ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==35) ) {
                alt1=1;
            }
            else if ( (LA1_0==43) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:488:1: ( ruleSTable )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:488:1: ( ruleSTable )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:489:1: ruleSTable
                    {
                     before(grammarAccess.getSArtifactAccess().getSTableParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSTable_in_rule__SArtifact__Alternatives960);
                    ruleSTable();

                    state._fsp--;

                     after(grammarAccess.getSArtifactAccess().getSTableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:494:6: ( ruleSEnum )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:494:6: ( ruleSEnum )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:495:1: ruleSEnum
                    {
                     before(grammarAccess.getSArtifactAccess().getSEnumParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSEnum_in_rule__SArtifact__Alternatives977);
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


    // $ANTLR start "rule__SEntityMember__Alternatives"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:505:1: rule__SEntityMember__Alternatives : ( ( ruleSProperty ) | ( ruleSJoinProperty ) );
    public final void rule__SEntityMember__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:509:1: ( ( ruleSProperty ) | ( ruleSJoinProperty ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==39) ) {
                alt2=1;
            }
            else if ( (LA2_0==40) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:510:1: ( ruleSProperty )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:510:1: ( ruleSProperty )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:511:1: ruleSProperty
                    {
                     before(grammarAccess.getSEntityMemberAccess().getSPropertyParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSProperty_in_rule__SEntityMember__Alternatives1009);
                    ruleSProperty();

                    state._fsp--;

                     after(grammarAccess.getSEntityMemberAccess().getSPropertyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:516:6: ( ruleSJoinProperty )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:516:6: ( ruleSJoinProperty )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:517:1: ruleSJoinProperty
                    {
                     before(grammarAccess.getSEntityMemberAccess().getSJoinPropertyParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSJoinProperty_in_rule__SEntityMember__Alternatives1026);
                    ruleSJoinProperty();

                    state._fsp--;

                     after(grammarAccess.getSEntityMemberAccess().getSJoinPropertyParserRuleCall_1()); 

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
    // $ANTLR end "rule__SEntityMember__Alternatives"


    // $ANTLR start "rule__SProperty__Alternatives_2"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:527:1: rule__SProperty__Alternatives_2 : ( ( ( rule__SProperty__ExtTypeAssignment_2_0 ) ) | ( ( rule__SProperty__InlinedTypeAssignment_2_1 ) ) | ( ( rule__SProperty__SimpleTypeAssignment_2_2 ) ) );
    public final void rule__SProperty__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:531:1: ( ( ( rule__SProperty__ExtTypeAssignment_2_0 ) ) | ( ( rule__SProperty__InlinedTypeAssignment_2_1 ) ) | ( ( rule__SProperty__SimpleTypeAssignment_2_2 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case 45:
            case 47:
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
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:532:1: ( ( rule__SProperty__ExtTypeAssignment_2_0 ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:532:1: ( ( rule__SProperty__ExtTypeAssignment_2_0 ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:533:1: ( rule__SProperty__ExtTypeAssignment_2_0 )
                    {
                     before(grammarAccess.getSPropertyAccess().getExtTypeAssignment_2_0()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:534:1: ( rule__SProperty__ExtTypeAssignment_2_0 )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:534:2: rule__SProperty__ExtTypeAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__SProperty__ExtTypeAssignment_2_0_in_rule__SProperty__Alternatives_21058);
                    rule__SProperty__ExtTypeAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSPropertyAccess().getExtTypeAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:538:6: ( ( rule__SProperty__InlinedTypeAssignment_2_1 ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:538:6: ( ( rule__SProperty__InlinedTypeAssignment_2_1 ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:539:1: ( rule__SProperty__InlinedTypeAssignment_2_1 )
                    {
                     before(grammarAccess.getSPropertyAccess().getInlinedTypeAssignment_2_1()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:540:1: ( rule__SProperty__InlinedTypeAssignment_2_1 )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:540:2: rule__SProperty__InlinedTypeAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__SProperty__InlinedTypeAssignment_2_1_in_rule__SProperty__Alternatives_21076);
                    rule__SProperty__InlinedTypeAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSPropertyAccess().getInlinedTypeAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:544:6: ( ( rule__SProperty__SimpleTypeAssignment_2_2 ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:544:6: ( ( rule__SProperty__SimpleTypeAssignment_2_2 ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:545:1: ( rule__SProperty__SimpleTypeAssignment_2_2 )
                    {
                     before(grammarAccess.getSPropertyAccess().getSimpleTypeAssignment_2_2()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:546:1: ( rule__SProperty__SimpleTypeAssignment_2_2 )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:546:2: rule__SProperty__SimpleTypeAssignment_2_2
                    {
                    pushFollow(FOLLOW_rule__SProperty__SimpleTypeAssignment_2_2_in_rule__SProperty__Alternatives_21094);
                    rule__SProperty__SimpleTypeAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSPropertyAccess().getSimpleTypeAssignment_2_2()); 

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
    // $ANTLR end "rule__SProperty__Alternatives_2"


    // $ANTLR start "rule__SInlinedSQLType__Alternatives"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:555:1: rule__SInlinedSQLType__Alternatives : ( ( ruleSString ) | ( ruleSDecimal ) );
    public final void rule__SInlinedSQLType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:559:1: ( ( ruleSString ) | ( ruleSDecimal ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==45) ) {
                alt4=1;
            }
            else if ( (LA4_0==47) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:560:1: ( ruleSString )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:560:1: ( ruleSString )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:561:1: ruleSString
                    {
                     before(grammarAccess.getSInlinedSQLTypeAccess().getSStringParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSString_in_rule__SInlinedSQLType__Alternatives1127);
                    ruleSString();

                    state._fsp--;

                     after(grammarAccess.getSInlinedSQLTypeAccess().getSStringParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:566:6: ( ruleSDecimal )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:566:6: ( ruleSDecimal )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:567:1: ruleSDecimal
                    {
                     before(grammarAccess.getSInlinedSQLTypeAccess().getSDecimalParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSDecimal_in_rule__SInlinedSQLType__Alternatives1144);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:577:1: rule__SDBEngine__Alternatives : ( ( ( 'InnoDB' ) ) | ( ( 'MyISAM' ) ) );
    public final void rule__SDBEngine__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:581:1: ( ( ( 'InnoDB' ) ) | ( ( 'MyISAM' ) ) )
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
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:582:1: ( ( 'InnoDB' ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:582:1: ( ( 'InnoDB' ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:583:1: ( 'InnoDB' )
                    {
                     before(grammarAccess.getSDBEngineAccess().getINNODBEnumLiteralDeclaration_0()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:584:1: ( 'InnoDB' )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:584:3: 'InnoDB'
                    {
                    match(input,11,FOLLOW_11_in_rule__SDBEngine__Alternatives1177); 

                    }

                     after(grammarAccess.getSDBEngineAccess().getINNODBEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:589:6: ( ( 'MyISAM' ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:589:6: ( ( 'MyISAM' ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:590:1: ( 'MyISAM' )
                    {
                     before(grammarAccess.getSDBEngineAccess().getMYISAMEnumLiteralDeclaration_1()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:591:1: ( 'MyISAM' )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:591:3: 'MyISAM'
                    {
                    match(input,12,FOLLOW_12_in_rule__SDBEngine__Alternatives1198); 

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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:601:1: rule__SSimpleTypes__Alternatives : ( ( ( 'Int' ) ) | ( ( 'Tinyint' ) ) | ( ( 'Smallint' ) ) | ( ( 'Mediumint' ) ) | ( ( 'Boolean' ) ) | ( ( 'Blob' ) ) | ( ( 'Datetime' ) ) | ( ( 'Date' ) ) | ( ( 'Time' ) ) | ( ( 'Polygon' ) ) | ( ( 'Point' ) ) | ( ( 'Foto' ) ) | ( ( 'Currency' ) ) | ( ( 'Coordinate' ) ) );
    public final void rule__SSimpleTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:605:1: ( ( ( 'Int' ) ) | ( ( 'Tinyint' ) ) | ( ( 'Smallint' ) ) | ( ( 'Mediumint' ) ) | ( ( 'Boolean' ) ) | ( ( 'Blob' ) ) | ( ( 'Datetime' ) ) | ( ( 'Date' ) ) | ( ( 'Time' ) ) | ( ( 'Polygon' ) ) | ( ( 'Point' ) ) | ( ( 'Foto' ) ) | ( ( 'Currency' ) ) | ( ( 'Coordinate' ) ) )
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
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:606:1: ( ( 'Int' ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:606:1: ( ( 'Int' ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:607:1: ( 'Int' )
                    {
                     before(grammarAccess.getSSimpleTypesAccess().getINTEnumLiteralDeclaration_0()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:608:1: ( 'Int' )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:608:3: 'Int'
                    {
                    match(input,13,FOLLOW_13_in_rule__SSimpleTypes__Alternatives1234); 

                    }

                     after(grammarAccess.getSSimpleTypesAccess().getINTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:613:6: ( ( 'Tinyint' ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:613:6: ( ( 'Tinyint' ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:614:1: ( 'Tinyint' )
                    {
                     before(grammarAccess.getSSimpleTypesAccess().getTINY_INTEnumLiteralDeclaration_1()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:615:1: ( 'Tinyint' )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:615:3: 'Tinyint'
                    {
                    match(input,14,FOLLOW_14_in_rule__SSimpleTypes__Alternatives1255); 

                    }

                     after(grammarAccess.getSSimpleTypesAccess().getTINY_INTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:620:6: ( ( 'Smallint' ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:620:6: ( ( 'Smallint' ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:621:1: ( 'Smallint' )
                    {
                     before(grammarAccess.getSSimpleTypesAccess().getSMALL_INTEnumLiteralDeclaration_2()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:622:1: ( 'Smallint' )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:622:3: 'Smallint'
                    {
                    match(input,15,FOLLOW_15_in_rule__SSimpleTypes__Alternatives1276); 

                    }

                     after(grammarAccess.getSSimpleTypesAccess().getSMALL_INTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:627:6: ( ( 'Mediumint' ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:627:6: ( ( 'Mediumint' ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:628:1: ( 'Mediumint' )
                    {
                     before(grammarAccess.getSSimpleTypesAccess().getMEDIUM_INTEnumLiteralDeclaration_3()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:629:1: ( 'Mediumint' )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:629:3: 'Mediumint'
                    {
                    match(input,16,FOLLOW_16_in_rule__SSimpleTypes__Alternatives1297); 

                    }

                     after(grammarAccess.getSSimpleTypesAccess().getMEDIUM_INTEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:634:6: ( ( 'Boolean' ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:634:6: ( ( 'Boolean' ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:635:1: ( 'Boolean' )
                    {
                     before(grammarAccess.getSSimpleTypesAccess().getBOOLEANEnumLiteralDeclaration_4()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:636:1: ( 'Boolean' )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:636:3: 'Boolean'
                    {
                    match(input,17,FOLLOW_17_in_rule__SSimpleTypes__Alternatives1318); 

                    }

                     after(grammarAccess.getSSimpleTypesAccess().getBOOLEANEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:641:6: ( ( 'Blob' ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:641:6: ( ( 'Blob' ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:642:1: ( 'Blob' )
                    {
                     before(grammarAccess.getSSimpleTypesAccess().getBLOBEnumLiteralDeclaration_5()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:643:1: ( 'Blob' )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:643:3: 'Blob'
                    {
                    match(input,18,FOLLOW_18_in_rule__SSimpleTypes__Alternatives1339); 

                    }

                     after(grammarAccess.getSSimpleTypesAccess().getBLOBEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:648:6: ( ( 'Datetime' ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:648:6: ( ( 'Datetime' ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:649:1: ( 'Datetime' )
                    {
                     before(grammarAccess.getSSimpleTypesAccess().getDATETIMEEnumLiteralDeclaration_6()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:650:1: ( 'Datetime' )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:650:3: 'Datetime'
                    {
                    match(input,19,FOLLOW_19_in_rule__SSimpleTypes__Alternatives1360); 

                    }

                     after(grammarAccess.getSSimpleTypesAccess().getDATETIMEEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:655:6: ( ( 'Date' ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:655:6: ( ( 'Date' ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:656:1: ( 'Date' )
                    {
                     before(grammarAccess.getSSimpleTypesAccess().getDATEEnumLiteralDeclaration_7()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:657:1: ( 'Date' )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:657:3: 'Date'
                    {
                    match(input,20,FOLLOW_20_in_rule__SSimpleTypes__Alternatives1381); 

                    }

                     after(grammarAccess.getSSimpleTypesAccess().getDATEEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:662:6: ( ( 'Time' ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:662:6: ( ( 'Time' ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:663:1: ( 'Time' )
                    {
                     before(grammarAccess.getSSimpleTypesAccess().getTIMEEnumLiteralDeclaration_8()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:664:1: ( 'Time' )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:664:3: 'Time'
                    {
                    match(input,21,FOLLOW_21_in_rule__SSimpleTypes__Alternatives1402); 

                    }

                     after(grammarAccess.getSSimpleTypesAccess().getTIMEEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:669:6: ( ( 'Polygon' ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:669:6: ( ( 'Polygon' ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:670:1: ( 'Polygon' )
                    {
                     before(grammarAccess.getSSimpleTypesAccess().getPOLYGONEnumLiteralDeclaration_9()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:671:1: ( 'Polygon' )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:671:3: 'Polygon'
                    {
                    match(input,22,FOLLOW_22_in_rule__SSimpleTypes__Alternatives1423); 

                    }

                     after(grammarAccess.getSSimpleTypesAccess().getPOLYGONEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:676:6: ( ( 'Point' ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:676:6: ( ( 'Point' ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:677:1: ( 'Point' )
                    {
                     before(grammarAccess.getSSimpleTypesAccess().getPOINTEnumLiteralDeclaration_10()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:678:1: ( 'Point' )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:678:3: 'Point'
                    {
                    match(input,23,FOLLOW_23_in_rule__SSimpleTypes__Alternatives1444); 

                    }

                     after(grammarAccess.getSSimpleTypesAccess().getPOINTEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:683:6: ( ( 'Foto' ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:683:6: ( ( 'Foto' ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:684:1: ( 'Foto' )
                    {
                     before(grammarAccess.getSSimpleTypesAccess().getFOTOEnumLiteralDeclaration_11()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:685:1: ( 'Foto' )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:685:3: 'Foto'
                    {
                    match(input,24,FOLLOW_24_in_rule__SSimpleTypes__Alternatives1465); 

                    }

                     after(grammarAccess.getSSimpleTypesAccess().getFOTOEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:690:6: ( ( 'Currency' ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:690:6: ( ( 'Currency' ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:691:1: ( 'Currency' )
                    {
                     before(grammarAccess.getSSimpleTypesAccess().getCurrencyEnumLiteralDeclaration_12()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:692:1: ( 'Currency' )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:692:3: 'Currency'
                    {
                    match(input,25,FOLLOW_25_in_rule__SSimpleTypes__Alternatives1486); 

                    }

                     after(grammarAccess.getSSimpleTypesAccess().getCurrencyEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:697:6: ( ( 'Coordinate' ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:697:6: ( ( 'Coordinate' ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:698:1: ( 'Coordinate' )
                    {
                     before(grammarAccess.getSSimpleTypesAccess().getCoordinateEnumLiteralDeclaration_13()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:699:1: ( 'Coordinate' )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:699:3: 'Coordinate'
                    {
                    match(input,26,FOLLOW_26_in_rule__SSimpleTypes__Alternatives1507); 

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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:709:1: rule__SIndex__Alternatives : ( ( ( 'No' ) ) | ( ( 'Yes' ) ) | ( ( 'Unique' ) ) | ( ( 'Spatial' ) ) );
    public final void rule__SIndex__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:713:1: ( ( ( 'No' ) ) | ( ( 'Yes' ) ) | ( ( 'Unique' ) ) | ( ( 'Spatial' ) ) )
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
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:714:1: ( ( 'No' ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:714:1: ( ( 'No' ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:715:1: ( 'No' )
                    {
                     before(grammarAccess.getSIndexAccess().getNOEnumLiteralDeclaration_0()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:716:1: ( 'No' )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:716:3: 'No'
                    {
                    match(input,27,FOLLOW_27_in_rule__SIndex__Alternatives1543); 

                    }

                     after(grammarAccess.getSIndexAccess().getNOEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:721:6: ( ( 'Yes' ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:721:6: ( ( 'Yes' ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:722:1: ( 'Yes' )
                    {
                     before(grammarAccess.getSIndexAccess().getYESEnumLiteralDeclaration_1()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:723:1: ( 'Yes' )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:723:3: 'Yes'
                    {
                    match(input,28,FOLLOW_28_in_rule__SIndex__Alternatives1564); 

                    }

                     after(grammarAccess.getSIndexAccess().getYESEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:728:6: ( ( 'Unique' ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:728:6: ( ( 'Unique' ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:729:1: ( 'Unique' )
                    {
                     before(grammarAccess.getSIndexAccess().getUNIQUEEnumLiteralDeclaration_2()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:730:1: ( 'Unique' )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:730:3: 'Unique'
                    {
                    match(input,29,FOLLOW_29_in_rule__SIndex__Alternatives1585); 

                    }

                     after(grammarAccess.getSIndexAccess().getUNIQUEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:735:6: ( ( 'Spatial' ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:735:6: ( ( 'Spatial' ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:736:1: ( 'Spatial' )
                    {
                     before(grammarAccess.getSIndexAccess().getSPATIALEnumLiteralDeclaration_3()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:737:1: ( 'Spatial' )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:737:3: 'Spatial'
                    {
                    match(input,30,FOLLOW_30_in_rule__SIndex__Alternatives1606); 

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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:749:1: rule__SModel__Group__0 : rule__SModel__Group__0__Impl rule__SModel__Group__1 ;
    public final void rule__SModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:753:1: ( rule__SModel__Group__0__Impl rule__SModel__Group__1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:754:2: rule__SModel__Group__0__Impl rule__SModel__Group__1
            {
            pushFollow(FOLLOW_rule__SModel__Group__0__Impl_in_rule__SModel__Group__01639);
            rule__SModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SModel__Group__1_in_rule__SModel__Group__01642);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:761:1: rule__SModel__Group__0__Impl : ( ( rule__SModel__SettingsAssignment_0 )? ) ;
    public final void rule__SModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:765:1: ( ( ( rule__SModel__SettingsAssignment_0 )? ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:766:1: ( ( rule__SModel__SettingsAssignment_0 )? )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:766:1: ( ( rule__SModel__SettingsAssignment_0 )? )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:767:1: ( rule__SModel__SettingsAssignment_0 )?
            {
             before(grammarAccess.getSModelAccess().getSettingsAssignment_0()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:768:1: ( rule__SModel__SettingsAssignment_0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==31) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:768:2: rule__SModel__SettingsAssignment_0
                    {
                    pushFollow(FOLLOW_rule__SModel__SettingsAssignment_0_in_rule__SModel__Group__0__Impl1669);
                    rule__SModel__SettingsAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSModelAccess().getSettingsAssignment_0()); 

            }


            }

        }
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:778:1: rule__SModel__Group__1 : rule__SModel__Group__1__Impl ;
    public final void rule__SModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:782:1: ( rule__SModel__Group__1__Impl )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:783:2: rule__SModel__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SModel__Group__1__Impl_in_rule__SModel__Group__11700);
            rule__SModel__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:789:1: rule__SModel__Group__1__Impl : ( ( rule__SModel__ArtifactAssignment_1 )* ) ;
    public final void rule__SModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:793:1: ( ( ( rule__SModel__ArtifactAssignment_1 )* ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:794:1: ( ( rule__SModel__ArtifactAssignment_1 )* )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:794:1: ( ( rule__SModel__ArtifactAssignment_1 )* )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:795:1: ( rule__SModel__ArtifactAssignment_1 )*
            {
             before(grammarAccess.getSModelAccess().getArtifactAssignment_1()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:796:1: ( rule__SModel__ArtifactAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==35||LA9_0==43) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:796:2: rule__SModel__ArtifactAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__SModel__ArtifactAssignment_1_in_rule__SModel__Group__1__Impl1727);
            	    rule__SModel__ArtifactAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSModelAccess().getArtifactAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__SSettings__Group__0"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:810:1: rule__SSettings__Group__0 : rule__SSettings__Group__0__Impl rule__SSettings__Group__1 ;
    public final void rule__SSettings__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:814:1: ( rule__SSettings__Group__0__Impl rule__SSettings__Group__1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:815:2: rule__SSettings__Group__0__Impl rule__SSettings__Group__1
            {
            pushFollow(FOLLOW_rule__SSettings__Group__0__Impl_in_rule__SSettings__Group__01762);
            rule__SSettings__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SSettings__Group__1_in_rule__SSettings__Group__01765);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:822:1: rule__SSettings__Group__0__Impl : ( () ) ;
    public final void rule__SSettings__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:826:1: ( ( () ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:827:1: ( () )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:827:1: ( () )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:828:1: ()
            {
             before(grammarAccess.getSSettingsAccess().getSSettingsAction_0()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:829:1: ()
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:831:1: 
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:841:1: rule__SSettings__Group__1 : rule__SSettings__Group__1__Impl rule__SSettings__Group__2 ;
    public final void rule__SSettings__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:845:1: ( rule__SSettings__Group__1__Impl rule__SSettings__Group__2 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:846:2: rule__SSettings__Group__1__Impl rule__SSettings__Group__2
            {
            pushFollow(FOLLOW_rule__SSettings__Group__1__Impl_in_rule__SSettings__Group__11823);
            rule__SSettings__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SSettings__Group__2_in_rule__SSettings__Group__11826);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:853:1: rule__SSettings__Group__1__Impl : ( 'settings {' ) ;
    public final void rule__SSettings__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:857:1: ( ( 'settings {' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:858:1: ( 'settings {' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:858:1: ( 'settings {' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:859:1: 'settings {'
            {
             before(grammarAccess.getSSettingsAccess().getSettingsKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__SSettings__Group__1__Impl1854); 
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:872:1: rule__SSettings__Group__2 : rule__SSettings__Group__2__Impl rule__SSettings__Group__3 ;
    public final void rule__SSettings__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:876:1: ( rule__SSettings__Group__2__Impl rule__SSettings__Group__3 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:877:2: rule__SSettings__Group__2__Impl rule__SSettings__Group__3
            {
            pushFollow(FOLLOW_rule__SSettings__Group__2__Impl_in_rule__SSettings__Group__21885);
            rule__SSettings__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SSettings__Group__3_in_rule__SSettings__Group__21888);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:884:1: rule__SSettings__Group__2__Impl : ( ( rule__SSettings__UnorderedGroup_2 ) ) ;
    public final void rule__SSettings__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:888:1: ( ( ( rule__SSettings__UnorderedGroup_2 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:889:1: ( ( rule__SSettings__UnorderedGroup_2 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:889:1: ( ( rule__SSettings__UnorderedGroup_2 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:890:1: ( rule__SSettings__UnorderedGroup_2 )
            {
             before(grammarAccess.getSSettingsAccess().getUnorderedGroup_2()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:891:1: ( rule__SSettings__UnorderedGroup_2 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:891:2: rule__SSettings__UnorderedGroup_2
            {
            pushFollow(FOLLOW_rule__SSettings__UnorderedGroup_2_in_rule__SSettings__Group__2__Impl1915);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:901:1: rule__SSettings__Group__3 : rule__SSettings__Group__3__Impl ;
    public final void rule__SSettings__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:905:1: ( rule__SSettings__Group__3__Impl )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:906:2: rule__SSettings__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SSettings__Group__3__Impl_in_rule__SSettings__Group__31945);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:912:1: rule__SSettings__Group__3__Impl : ( '}' ) ;
    public final void rule__SSettings__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:916:1: ( ( '}' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:917:1: ( '}' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:917:1: ( '}' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:918:1: '}'
            {
             before(grammarAccess.getSSettingsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,32,FOLLOW_32_in_rule__SSettings__Group__3__Impl1973); 
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:939:1: rule__SSettings__Group_2_0__0 : rule__SSettings__Group_2_0__0__Impl rule__SSettings__Group_2_0__1 ;
    public final void rule__SSettings__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:943:1: ( rule__SSettings__Group_2_0__0__Impl rule__SSettings__Group_2_0__1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:944:2: rule__SSettings__Group_2_0__0__Impl rule__SSettings__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__SSettings__Group_2_0__0__Impl_in_rule__SSettings__Group_2_0__02012);
            rule__SSettings__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SSettings__Group_2_0__1_in_rule__SSettings__Group_2_0__02015);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:951:1: rule__SSettings__Group_2_0__0__Impl : ( 'schema=' ) ;
    public final void rule__SSettings__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:955:1: ( ( 'schema=' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:956:1: ( 'schema=' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:956:1: ( 'schema=' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:957:1: 'schema='
            {
             before(grammarAccess.getSSettingsAccess().getSchemaKeyword_2_0_0()); 
            match(input,33,FOLLOW_33_in_rule__SSettings__Group_2_0__0__Impl2043); 
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:970:1: rule__SSettings__Group_2_0__1 : rule__SSettings__Group_2_0__1__Impl ;
    public final void rule__SSettings__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:974:1: ( rule__SSettings__Group_2_0__1__Impl )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:975:2: rule__SSettings__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_rule__SSettings__Group_2_0__1__Impl_in_rule__SSettings__Group_2_0__12074);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:981:1: rule__SSettings__Group_2_0__1__Impl : ( ( rule__SSettings__SchemaAssignment_2_0_1 ) ) ;
    public final void rule__SSettings__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:985:1: ( ( ( rule__SSettings__SchemaAssignment_2_0_1 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:986:1: ( ( rule__SSettings__SchemaAssignment_2_0_1 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:986:1: ( ( rule__SSettings__SchemaAssignment_2_0_1 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:987:1: ( rule__SSettings__SchemaAssignment_2_0_1 )
            {
             before(grammarAccess.getSSettingsAccess().getSchemaAssignment_2_0_1()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:988:1: ( rule__SSettings__SchemaAssignment_2_0_1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:988:2: rule__SSettings__SchemaAssignment_2_0_1
            {
            pushFollow(FOLLOW_rule__SSettings__SchemaAssignment_2_0_1_in_rule__SSettings__Group_2_0__1__Impl2101);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1002:1: rule__SSettings__Group_2_1__0 : rule__SSettings__Group_2_1__0__Impl rule__SSettings__Group_2_1__1 ;
    public final void rule__SSettings__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1006:1: ( rule__SSettings__Group_2_1__0__Impl rule__SSettings__Group_2_1__1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1007:2: rule__SSettings__Group_2_1__0__Impl rule__SSettings__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__SSettings__Group_2_1__0__Impl_in_rule__SSettings__Group_2_1__02135);
            rule__SSettings__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SSettings__Group_2_1__1_in_rule__SSettings__Group_2_1__02138);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1014:1: rule__SSettings__Group_2_1__0__Impl : ( 'engine=' ) ;
    public final void rule__SSettings__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1018:1: ( ( 'engine=' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1019:1: ( 'engine=' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1019:1: ( 'engine=' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1020:1: 'engine='
            {
             before(grammarAccess.getSSettingsAccess().getEngineKeyword_2_1_0()); 
            match(input,34,FOLLOW_34_in_rule__SSettings__Group_2_1__0__Impl2166); 
             after(grammarAccess.getSSettingsAccess().getEngineKeyword_2_1_0()); 

            }


            }

        }
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1033:1: rule__SSettings__Group_2_1__1 : rule__SSettings__Group_2_1__1__Impl ;
    public final void rule__SSettings__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1037:1: ( rule__SSettings__Group_2_1__1__Impl )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1038:2: rule__SSettings__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SSettings__Group_2_1__1__Impl_in_rule__SSettings__Group_2_1__12197);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1044:1: rule__SSettings__Group_2_1__1__Impl : ( ( rule__SSettings__EngineAssignment_2_1_1 ) ) ;
    public final void rule__SSettings__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1048:1: ( ( ( rule__SSettings__EngineAssignment_2_1_1 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1049:1: ( ( rule__SSettings__EngineAssignment_2_1_1 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1049:1: ( ( rule__SSettings__EngineAssignment_2_1_1 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1050:1: ( rule__SSettings__EngineAssignment_2_1_1 )
            {
             before(grammarAccess.getSSettingsAccess().getEngineAssignment_2_1_1()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1051:1: ( rule__SSettings__EngineAssignment_2_1_1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1051:2: rule__SSettings__EngineAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__SSettings__EngineAssignment_2_1_1_in_rule__SSettings__Group_2_1__1__Impl2224);
            rule__SSettings__EngineAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSSettingsAccess().getEngineAssignment_2_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__STable__Group__0"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1065:1: rule__STable__Group__0 : rule__STable__Group__0__Impl rule__STable__Group__1 ;
    public final void rule__STable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1069:1: ( rule__STable__Group__0__Impl rule__STable__Group__1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1070:2: rule__STable__Group__0__Impl rule__STable__Group__1
            {
            pushFollow(FOLLOW_rule__STable__Group__0__Impl_in_rule__STable__Group__02258);
            rule__STable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__STable__Group__1_in_rule__STable__Group__02261);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1077:1: rule__STable__Group__0__Impl : ( 'table' ) ;
    public final void rule__STable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1081:1: ( ( 'table' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1082:1: ( 'table' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1082:1: ( 'table' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1083:1: 'table'
            {
             before(grammarAccess.getSTableAccess().getTableKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__STable__Group__0__Impl2289); 
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1096:1: rule__STable__Group__1 : rule__STable__Group__1__Impl rule__STable__Group__2 ;
    public final void rule__STable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1100:1: ( rule__STable__Group__1__Impl rule__STable__Group__2 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1101:2: rule__STable__Group__1__Impl rule__STable__Group__2
            {
            pushFollow(FOLLOW_rule__STable__Group__1__Impl_in_rule__STable__Group__12320);
            rule__STable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__STable__Group__2_in_rule__STable__Group__12323);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1108:1: rule__STable__Group__1__Impl : ( ( rule__STable__NameAssignment_1 ) ) ;
    public final void rule__STable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1112:1: ( ( ( rule__STable__NameAssignment_1 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1113:1: ( ( rule__STable__NameAssignment_1 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1113:1: ( ( rule__STable__NameAssignment_1 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1114:1: ( rule__STable__NameAssignment_1 )
            {
             before(grammarAccess.getSTableAccess().getNameAssignment_1()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1115:1: ( rule__STable__NameAssignment_1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1115:2: rule__STable__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__STable__NameAssignment_1_in_rule__STable__Group__1__Impl2350);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1125:1: rule__STable__Group__2 : rule__STable__Group__2__Impl rule__STable__Group__3 ;
    public final void rule__STable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1129:1: ( rule__STable__Group__2__Impl rule__STable__Group__3 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1130:2: rule__STable__Group__2__Impl rule__STable__Group__3
            {
            pushFollow(FOLLOW_rule__STable__Group__2__Impl_in_rule__STable__Group__22380);
            rule__STable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__STable__Group__3_in_rule__STable__Group__22383);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1137:1: rule__STable__Group__2__Impl : ( '{' ) ;
    public final void rule__STable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1141:1: ( ( '{' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1142:1: ( '{' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1142:1: ( '{' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1143:1: '{'
            {
             before(grammarAccess.getSTableAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,36,FOLLOW_36_in_rule__STable__Group__2__Impl2411); 
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1156:1: rule__STable__Group__3 : rule__STable__Group__3__Impl rule__STable__Group__4 ;
    public final void rule__STable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1160:1: ( rule__STable__Group__3__Impl rule__STable__Group__4 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1161:2: rule__STable__Group__3__Impl rule__STable__Group__4
            {
            pushFollow(FOLLOW_rule__STable__Group__3__Impl_in_rule__STable__Group__32442);
            rule__STable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__STable__Group__4_in_rule__STable__Group__32445);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1168:1: rule__STable__Group__3__Impl : ( ( rule__STable__Group_3__0 )? ) ;
    public final void rule__STable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1172:1: ( ( ( rule__STable__Group_3__0 )? ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1173:1: ( ( rule__STable__Group_3__0 )? )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1173:1: ( ( rule__STable__Group_3__0 )? )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1174:1: ( rule__STable__Group_3__0 )?
            {
             before(grammarAccess.getSTableAccess().getGroup_3()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1175:1: ( rule__STable__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==37) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1175:2: rule__STable__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__STable__Group_3__0_in_rule__STable__Group__3__Impl2472);
                    rule__STable__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSTableAccess().getGroup_3()); 

            }


            }

        }
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1185:1: rule__STable__Group__4 : rule__STable__Group__4__Impl rule__STable__Group__5 ;
    public final void rule__STable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1189:1: ( rule__STable__Group__4__Impl rule__STable__Group__5 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1190:2: rule__STable__Group__4__Impl rule__STable__Group__5
            {
            pushFollow(FOLLOW_rule__STable__Group__4__Impl_in_rule__STable__Group__42503);
            rule__STable__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__STable__Group__5_in_rule__STable__Group__42506);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1197:1: rule__STable__Group__4__Impl : ( ( rule__STable__EntityMembersAssignment_4 )* ) ;
    public final void rule__STable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1201:1: ( ( ( rule__STable__EntityMembersAssignment_4 )* ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1202:1: ( ( rule__STable__EntityMembersAssignment_4 )* )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1202:1: ( ( rule__STable__EntityMembersAssignment_4 )* )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1203:1: ( rule__STable__EntityMembersAssignment_4 )*
            {
             before(grammarAccess.getSTableAccess().getEntityMembersAssignment_4()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1204:1: ( rule__STable__EntityMembersAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=39 && LA11_0<=40)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1204:2: rule__STable__EntityMembersAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__STable__EntityMembersAssignment_4_in_rule__STable__Group__4__Impl2533);
            	    rule__STable__EntityMembersAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getSTableAccess().getEntityMembersAssignment_4()); 

            }


            }

        }
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1214:1: rule__STable__Group__5 : rule__STable__Group__5__Impl ;
    public final void rule__STable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1218:1: ( rule__STable__Group__5__Impl )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1219:2: rule__STable__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__STable__Group__5__Impl_in_rule__STable__Group__52564);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1225:1: rule__STable__Group__5__Impl : ( '}' ) ;
    public final void rule__STable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1229:1: ( ( '}' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1230:1: ( '}' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1230:1: ( '}' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1231:1: '}'
            {
             before(grammarAccess.getSTableAccess().getRightCurlyBracketKeyword_5()); 
            match(input,32,FOLLOW_32_in_rule__STable__Group__5__Impl2592); 
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


    // $ANTLR start "rule__STable__Group_3__0"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1256:1: rule__STable__Group_3__0 : rule__STable__Group_3__0__Impl rule__STable__Group_3__1 ;
    public final void rule__STable__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1260:1: ( rule__STable__Group_3__0__Impl rule__STable__Group_3__1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1261:2: rule__STable__Group_3__0__Impl rule__STable__Group_3__1
            {
            pushFollow(FOLLOW_rule__STable__Group_3__0__Impl_in_rule__STable__Group_3__02635);
            rule__STable__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__STable__Group_3__1_in_rule__STable__Group_3__02638);
            rule__STable__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STable__Group_3__0"


    // $ANTLR start "rule__STable__Group_3__0__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1268:1: rule__STable__Group_3__0__Impl : ( 'prefix' ) ;
    public final void rule__STable__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1272:1: ( ( 'prefix' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1273:1: ( 'prefix' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1273:1: ( 'prefix' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1274:1: 'prefix'
            {
             before(grammarAccess.getSTableAccess().getPrefixKeyword_3_0()); 
            match(input,37,FOLLOW_37_in_rule__STable__Group_3__0__Impl2666); 
             after(grammarAccess.getSTableAccess().getPrefixKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STable__Group_3__0__Impl"


    // $ANTLR start "rule__STable__Group_3__1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1287:1: rule__STable__Group_3__1 : rule__STable__Group_3__1__Impl rule__STable__Group_3__2 ;
    public final void rule__STable__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1291:1: ( rule__STable__Group_3__1__Impl rule__STable__Group_3__2 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1292:2: rule__STable__Group_3__1__Impl rule__STable__Group_3__2
            {
            pushFollow(FOLLOW_rule__STable__Group_3__1__Impl_in_rule__STable__Group_3__12697);
            rule__STable__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__STable__Group_3__2_in_rule__STable__Group_3__12700);
            rule__STable__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STable__Group_3__1"


    // $ANTLR start "rule__STable__Group_3__1__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1299:1: rule__STable__Group_3__1__Impl : ( ( rule__STable__PrefixAssignment_3_1 ) ) ;
    public final void rule__STable__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1303:1: ( ( ( rule__STable__PrefixAssignment_3_1 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1304:1: ( ( rule__STable__PrefixAssignment_3_1 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1304:1: ( ( rule__STable__PrefixAssignment_3_1 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1305:1: ( rule__STable__PrefixAssignment_3_1 )
            {
             before(grammarAccess.getSTableAccess().getPrefixAssignment_3_1()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1306:1: ( rule__STable__PrefixAssignment_3_1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1306:2: rule__STable__PrefixAssignment_3_1
            {
            pushFollow(FOLLOW_rule__STable__PrefixAssignment_3_1_in_rule__STable__Group_3__1__Impl2727);
            rule__STable__PrefixAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSTableAccess().getPrefixAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STable__Group_3__1__Impl"


    // $ANTLR start "rule__STable__Group_3__2"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1316:1: rule__STable__Group_3__2 : rule__STable__Group_3__2__Impl ;
    public final void rule__STable__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1320:1: ( rule__STable__Group_3__2__Impl )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1321:2: rule__STable__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__STable__Group_3__2__Impl_in_rule__STable__Group_3__22757);
            rule__STable__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STable__Group_3__2"


    // $ANTLR start "rule__STable__Group_3__2__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1327:1: rule__STable__Group_3__2__Impl : ( ';' ) ;
    public final void rule__STable__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1331:1: ( ( ';' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1332:1: ( ';' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1332:1: ( ';' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1333:1: ';'
            {
             before(grammarAccess.getSTableAccess().getSemicolonKeyword_3_2()); 
            match(input,38,FOLLOW_38_in_rule__STable__Group_3__2__Impl2785); 
             after(grammarAccess.getSTableAccess().getSemicolonKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STable__Group_3__2__Impl"


    // $ANTLR start "rule__SProperty__Group__0"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1352:1: rule__SProperty__Group__0 : rule__SProperty__Group__0__Impl rule__SProperty__Group__1 ;
    public final void rule__SProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1356:1: ( rule__SProperty__Group__0__Impl rule__SProperty__Group__1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1357:2: rule__SProperty__Group__0__Impl rule__SProperty__Group__1
            {
            pushFollow(FOLLOW_rule__SProperty__Group__0__Impl_in_rule__SProperty__Group__02822);
            rule__SProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SProperty__Group__1_in_rule__SProperty__Group__02825);
            rule__SProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SProperty__Group__0"


    // $ANTLR start "rule__SProperty__Group__0__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1364:1: rule__SProperty__Group__0__Impl : ( 'column' ) ;
    public final void rule__SProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1368:1: ( ( 'column' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1369:1: ( 'column' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1369:1: ( 'column' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1370:1: 'column'
            {
             before(grammarAccess.getSPropertyAccess().getColumnKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__SProperty__Group__0__Impl2853); 
             after(grammarAccess.getSPropertyAccess().getColumnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SProperty__Group__0__Impl"


    // $ANTLR start "rule__SProperty__Group__1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1383:1: rule__SProperty__Group__1 : rule__SProperty__Group__1__Impl rule__SProperty__Group__2 ;
    public final void rule__SProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1387:1: ( rule__SProperty__Group__1__Impl rule__SProperty__Group__2 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1388:2: rule__SProperty__Group__1__Impl rule__SProperty__Group__2
            {
            pushFollow(FOLLOW_rule__SProperty__Group__1__Impl_in_rule__SProperty__Group__12884);
            rule__SProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SProperty__Group__2_in_rule__SProperty__Group__12887);
            rule__SProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SProperty__Group__1"


    // $ANTLR start "rule__SProperty__Group__1__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1395:1: rule__SProperty__Group__1__Impl : ( ( rule__SProperty__NameAssignment_1 ) ) ;
    public final void rule__SProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1399:1: ( ( ( rule__SProperty__NameAssignment_1 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1400:1: ( ( rule__SProperty__NameAssignment_1 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1400:1: ( ( rule__SProperty__NameAssignment_1 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1401:1: ( rule__SProperty__NameAssignment_1 )
            {
             before(grammarAccess.getSPropertyAccess().getNameAssignment_1()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1402:1: ( rule__SProperty__NameAssignment_1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1402:2: rule__SProperty__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SProperty__NameAssignment_1_in_rule__SProperty__Group__1__Impl2914);
            rule__SProperty__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSPropertyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SProperty__Group__1__Impl"


    // $ANTLR start "rule__SProperty__Group__2"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1412:1: rule__SProperty__Group__2 : rule__SProperty__Group__2__Impl rule__SProperty__Group__3 ;
    public final void rule__SProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1416:1: ( rule__SProperty__Group__2__Impl rule__SProperty__Group__3 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1417:2: rule__SProperty__Group__2__Impl rule__SProperty__Group__3
            {
            pushFollow(FOLLOW_rule__SProperty__Group__2__Impl_in_rule__SProperty__Group__22944);
            rule__SProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SProperty__Group__3_in_rule__SProperty__Group__22947);
            rule__SProperty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SProperty__Group__2"


    // $ANTLR start "rule__SProperty__Group__2__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1424:1: rule__SProperty__Group__2__Impl : ( ( rule__SProperty__Alternatives_2 ) ) ;
    public final void rule__SProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1428:1: ( ( ( rule__SProperty__Alternatives_2 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1429:1: ( ( rule__SProperty__Alternatives_2 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1429:1: ( ( rule__SProperty__Alternatives_2 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1430:1: ( rule__SProperty__Alternatives_2 )
            {
             before(grammarAccess.getSPropertyAccess().getAlternatives_2()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1431:1: ( rule__SProperty__Alternatives_2 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1431:2: rule__SProperty__Alternatives_2
            {
            pushFollow(FOLLOW_rule__SProperty__Alternatives_2_in_rule__SProperty__Group__2__Impl2974);
            rule__SProperty__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getSPropertyAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SProperty__Group__2__Impl"


    // $ANTLR start "rule__SProperty__Group__3"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1441:1: rule__SProperty__Group__3 : rule__SProperty__Group__3__Impl rule__SProperty__Group__4 ;
    public final void rule__SProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1445:1: ( rule__SProperty__Group__3__Impl rule__SProperty__Group__4 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1446:2: rule__SProperty__Group__3__Impl rule__SProperty__Group__4
            {
            pushFollow(FOLLOW_rule__SProperty__Group__3__Impl_in_rule__SProperty__Group__33004);
            rule__SProperty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SProperty__Group__4_in_rule__SProperty__Group__33007);
            rule__SProperty__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SProperty__Group__3"


    // $ANTLR start "rule__SProperty__Group__3__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1453:1: rule__SProperty__Group__3__Impl : ( ( rule__SProperty__PropsAssignment_3 )? ) ;
    public final void rule__SProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1457:1: ( ( ( rule__SProperty__PropsAssignment_3 )? ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1458:1: ( ( rule__SProperty__PropsAssignment_3 )? )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1458:1: ( ( rule__SProperty__PropsAssignment_3 )? )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1459:1: ( rule__SProperty__PropsAssignment_3 )?
            {
             before(grammarAccess.getSPropertyAccess().getPropsAssignment_3()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1460:1: ( rule__SProperty__PropsAssignment_3 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==41) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1460:2: rule__SProperty__PropsAssignment_3
                    {
                    pushFollow(FOLLOW_rule__SProperty__PropsAssignment_3_in_rule__SProperty__Group__3__Impl3034);
                    rule__SProperty__PropsAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSPropertyAccess().getPropsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SProperty__Group__3__Impl"


    // $ANTLR start "rule__SProperty__Group__4"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1470:1: rule__SProperty__Group__4 : rule__SProperty__Group__4__Impl ;
    public final void rule__SProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1474:1: ( rule__SProperty__Group__4__Impl )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1475:2: rule__SProperty__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SProperty__Group__4__Impl_in_rule__SProperty__Group__43065);
            rule__SProperty__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SProperty__Group__4"


    // $ANTLR start "rule__SProperty__Group__4__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1481:1: rule__SProperty__Group__4__Impl : ( ';' ) ;
    public final void rule__SProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1485:1: ( ( ';' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1486:1: ( ';' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1486:1: ( ';' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1487:1: ';'
            {
             before(grammarAccess.getSPropertyAccess().getSemicolonKeyword_4()); 
            match(input,38,FOLLOW_38_in_rule__SProperty__Group__4__Impl3093); 
             after(grammarAccess.getSPropertyAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SProperty__Group__4__Impl"


    // $ANTLR start "rule__SJoinProperty__Group__0"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1510:1: rule__SJoinProperty__Group__0 : rule__SJoinProperty__Group__0__Impl rule__SJoinProperty__Group__1 ;
    public final void rule__SJoinProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1514:1: ( rule__SJoinProperty__Group__0__Impl rule__SJoinProperty__Group__1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1515:2: rule__SJoinProperty__Group__0__Impl rule__SJoinProperty__Group__1
            {
            pushFollow(FOLLOW_rule__SJoinProperty__Group__0__Impl_in_rule__SJoinProperty__Group__03134);
            rule__SJoinProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SJoinProperty__Group__1_in_rule__SJoinProperty__Group__03137);
            rule__SJoinProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJoinProperty__Group__0"


    // $ANTLR start "rule__SJoinProperty__Group__0__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1522:1: rule__SJoinProperty__Group__0__Impl : ( 'joincolumn' ) ;
    public final void rule__SJoinProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1526:1: ( ( 'joincolumn' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1527:1: ( 'joincolumn' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1527:1: ( 'joincolumn' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1528:1: 'joincolumn'
            {
             before(grammarAccess.getSJoinPropertyAccess().getJoincolumnKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__SJoinProperty__Group__0__Impl3165); 
             after(grammarAccess.getSJoinPropertyAccess().getJoincolumnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJoinProperty__Group__0__Impl"


    // $ANTLR start "rule__SJoinProperty__Group__1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1541:1: rule__SJoinProperty__Group__1 : rule__SJoinProperty__Group__1__Impl rule__SJoinProperty__Group__2 ;
    public final void rule__SJoinProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1545:1: ( rule__SJoinProperty__Group__1__Impl rule__SJoinProperty__Group__2 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1546:2: rule__SJoinProperty__Group__1__Impl rule__SJoinProperty__Group__2
            {
            pushFollow(FOLLOW_rule__SJoinProperty__Group__1__Impl_in_rule__SJoinProperty__Group__13196);
            rule__SJoinProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SJoinProperty__Group__2_in_rule__SJoinProperty__Group__13199);
            rule__SJoinProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJoinProperty__Group__1"


    // $ANTLR start "rule__SJoinProperty__Group__1__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1553:1: rule__SJoinProperty__Group__1__Impl : ( ( rule__SJoinProperty__NameAssignment_1 ) ) ;
    public final void rule__SJoinProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1557:1: ( ( ( rule__SJoinProperty__NameAssignment_1 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1558:1: ( ( rule__SJoinProperty__NameAssignment_1 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1558:1: ( ( rule__SJoinProperty__NameAssignment_1 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1559:1: ( rule__SJoinProperty__NameAssignment_1 )
            {
             before(grammarAccess.getSJoinPropertyAccess().getNameAssignment_1()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1560:1: ( rule__SJoinProperty__NameAssignment_1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1560:2: rule__SJoinProperty__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SJoinProperty__NameAssignment_1_in_rule__SJoinProperty__Group__1__Impl3226);
            rule__SJoinProperty__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSJoinPropertyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJoinProperty__Group__1__Impl"


    // $ANTLR start "rule__SJoinProperty__Group__2"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1570:1: rule__SJoinProperty__Group__2 : rule__SJoinProperty__Group__2__Impl rule__SJoinProperty__Group__3 ;
    public final void rule__SJoinProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1574:1: ( rule__SJoinProperty__Group__2__Impl rule__SJoinProperty__Group__3 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1575:2: rule__SJoinProperty__Group__2__Impl rule__SJoinProperty__Group__3
            {
            pushFollow(FOLLOW_rule__SJoinProperty__Group__2__Impl_in_rule__SJoinProperty__Group__23256);
            rule__SJoinProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SJoinProperty__Group__3_in_rule__SJoinProperty__Group__23259);
            rule__SJoinProperty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJoinProperty__Group__2"


    // $ANTLR start "rule__SJoinProperty__Group__2__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1582:1: rule__SJoinProperty__Group__2__Impl : ( ( rule__SJoinProperty__TypeAssignment_2 ) ) ;
    public final void rule__SJoinProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1586:1: ( ( ( rule__SJoinProperty__TypeAssignment_2 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1587:1: ( ( rule__SJoinProperty__TypeAssignment_2 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1587:1: ( ( rule__SJoinProperty__TypeAssignment_2 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1588:1: ( rule__SJoinProperty__TypeAssignment_2 )
            {
             before(grammarAccess.getSJoinPropertyAccess().getTypeAssignment_2()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1589:1: ( rule__SJoinProperty__TypeAssignment_2 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1589:2: rule__SJoinProperty__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__SJoinProperty__TypeAssignment_2_in_rule__SJoinProperty__Group__2__Impl3286);
            rule__SJoinProperty__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSJoinPropertyAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJoinProperty__Group__2__Impl"


    // $ANTLR start "rule__SJoinProperty__Group__3"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1599:1: rule__SJoinProperty__Group__3 : rule__SJoinProperty__Group__3__Impl rule__SJoinProperty__Group__4 ;
    public final void rule__SJoinProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1603:1: ( rule__SJoinProperty__Group__3__Impl rule__SJoinProperty__Group__4 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1604:2: rule__SJoinProperty__Group__3__Impl rule__SJoinProperty__Group__4
            {
            pushFollow(FOLLOW_rule__SJoinProperty__Group__3__Impl_in_rule__SJoinProperty__Group__33316);
            rule__SJoinProperty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SJoinProperty__Group__4_in_rule__SJoinProperty__Group__33319);
            rule__SJoinProperty__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJoinProperty__Group__3"


    // $ANTLR start "rule__SJoinProperty__Group__3__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1611:1: rule__SJoinProperty__Group__3__Impl : ( ( rule__SJoinProperty__PropsAssignment_3 )? ) ;
    public final void rule__SJoinProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1615:1: ( ( ( rule__SJoinProperty__PropsAssignment_3 )? ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1616:1: ( ( rule__SJoinProperty__PropsAssignment_3 )? )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1616:1: ( ( rule__SJoinProperty__PropsAssignment_3 )? )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1617:1: ( rule__SJoinProperty__PropsAssignment_3 )?
            {
             before(grammarAccess.getSJoinPropertyAccess().getPropsAssignment_3()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1618:1: ( rule__SJoinProperty__PropsAssignment_3 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==41) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1618:2: rule__SJoinProperty__PropsAssignment_3
                    {
                    pushFollow(FOLLOW_rule__SJoinProperty__PropsAssignment_3_in_rule__SJoinProperty__Group__3__Impl3346);
                    rule__SJoinProperty__PropsAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSJoinPropertyAccess().getPropsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJoinProperty__Group__3__Impl"


    // $ANTLR start "rule__SJoinProperty__Group__4"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1628:1: rule__SJoinProperty__Group__4 : rule__SJoinProperty__Group__4__Impl ;
    public final void rule__SJoinProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1632:1: ( rule__SJoinProperty__Group__4__Impl )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1633:2: rule__SJoinProperty__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SJoinProperty__Group__4__Impl_in_rule__SJoinProperty__Group__43377);
            rule__SJoinProperty__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJoinProperty__Group__4"


    // $ANTLR start "rule__SJoinProperty__Group__4__Impl"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1639:1: rule__SJoinProperty__Group__4__Impl : ( ';' ) ;
    public final void rule__SJoinProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1643:1: ( ( ';' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1644:1: ( ';' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1644:1: ( ';' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1645:1: ';'
            {
             before(grammarAccess.getSJoinPropertyAccess().getSemicolonKeyword_4()); 
            match(input,38,FOLLOW_38_in_rule__SJoinProperty__Group__4__Impl3405); 
             after(grammarAccess.getSJoinPropertyAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJoinProperty__Group__4__Impl"


    // $ANTLR start "rule__SColumnProps__Group__0"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1668:1: rule__SColumnProps__Group__0 : rule__SColumnProps__Group__0__Impl rule__SColumnProps__Group__1 ;
    public final void rule__SColumnProps__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1672:1: ( rule__SColumnProps__Group__0__Impl rule__SColumnProps__Group__1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1673:2: rule__SColumnProps__Group__0__Impl rule__SColumnProps__Group__1
            {
            pushFollow(FOLLOW_rule__SColumnProps__Group__0__Impl_in_rule__SColumnProps__Group__03446);
            rule__SColumnProps__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SColumnProps__Group__1_in_rule__SColumnProps__Group__03449);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1680:1: rule__SColumnProps__Group__0__Impl : ( () ) ;
    public final void rule__SColumnProps__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1684:1: ( ( () ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1685:1: ( () )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1685:1: ( () )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1686:1: ()
            {
             before(grammarAccess.getSColumnPropsAccess().getSColumnPropsAction_0()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1687:1: ()
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1689:1: 
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1699:1: rule__SColumnProps__Group__1 : rule__SColumnProps__Group__1__Impl rule__SColumnProps__Group__2 ;
    public final void rule__SColumnProps__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1703:1: ( rule__SColumnProps__Group__1__Impl rule__SColumnProps__Group__2 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1704:2: rule__SColumnProps__Group__1__Impl rule__SColumnProps__Group__2
            {
            pushFollow(FOLLOW_rule__SColumnProps__Group__1__Impl_in_rule__SColumnProps__Group__13507);
            rule__SColumnProps__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SColumnProps__Group__2_in_rule__SColumnProps__Group__13510);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1711:1: rule__SColumnProps__Group__1__Impl : ( 'with' ) ;
    public final void rule__SColumnProps__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1715:1: ( ( 'with' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1716:1: ( 'with' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1716:1: ( 'with' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1717:1: 'with'
            {
             before(grammarAccess.getSColumnPropsAccess().getWithKeyword_1()); 
            match(input,41,FOLLOW_41_in_rule__SColumnProps__Group__1__Impl3538); 
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1730:1: rule__SColumnProps__Group__2 : rule__SColumnProps__Group__2__Impl ;
    public final void rule__SColumnProps__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1734:1: ( rule__SColumnProps__Group__2__Impl )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1735:2: rule__SColumnProps__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SColumnProps__Group__2__Impl_in_rule__SColumnProps__Group__23569);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1741:1: rule__SColumnProps__Group__2__Impl : ( ( rule__SColumnProps__UnorderedGroup_2 ) ) ;
    public final void rule__SColumnProps__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1745:1: ( ( ( rule__SColumnProps__UnorderedGroup_2 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1746:1: ( ( rule__SColumnProps__UnorderedGroup_2 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1746:1: ( ( rule__SColumnProps__UnorderedGroup_2 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1747:1: ( rule__SColumnProps__UnorderedGroup_2 )
            {
             before(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1748:1: ( rule__SColumnProps__UnorderedGroup_2 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1748:2: rule__SColumnProps__UnorderedGroup_2
            {
            pushFollow(FOLLOW_rule__SColumnProps__UnorderedGroup_2_in_rule__SColumnProps__Group__2__Impl3596);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1764:1: rule__SColumnProps__Group_2_2__0 : rule__SColumnProps__Group_2_2__0__Impl rule__SColumnProps__Group_2_2__1 ;
    public final void rule__SColumnProps__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1768:1: ( rule__SColumnProps__Group_2_2__0__Impl rule__SColumnProps__Group_2_2__1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1769:2: rule__SColumnProps__Group_2_2__0__Impl rule__SColumnProps__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__SColumnProps__Group_2_2__0__Impl_in_rule__SColumnProps__Group_2_2__03632);
            rule__SColumnProps__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SColumnProps__Group_2_2__1_in_rule__SColumnProps__Group_2_2__03635);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1776:1: rule__SColumnProps__Group_2_2__0__Impl : ( 'index=' ) ;
    public final void rule__SColumnProps__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1780:1: ( ( 'index=' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1781:1: ( 'index=' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1781:1: ( 'index=' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1782:1: 'index='
            {
             before(grammarAccess.getSColumnPropsAccess().getIndexKeyword_2_2_0()); 
            match(input,42,FOLLOW_42_in_rule__SColumnProps__Group_2_2__0__Impl3663); 
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1795:1: rule__SColumnProps__Group_2_2__1 : rule__SColumnProps__Group_2_2__1__Impl ;
    public final void rule__SColumnProps__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1799:1: ( rule__SColumnProps__Group_2_2__1__Impl )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1800:2: rule__SColumnProps__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SColumnProps__Group_2_2__1__Impl_in_rule__SColumnProps__Group_2_2__13694);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1806:1: rule__SColumnProps__Group_2_2__1__Impl : ( ( rule__SColumnProps__IndexAssignment_2_2_1 ) ) ;
    public final void rule__SColumnProps__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1810:1: ( ( ( rule__SColumnProps__IndexAssignment_2_2_1 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1811:1: ( ( rule__SColumnProps__IndexAssignment_2_2_1 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1811:1: ( ( rule__SColumnProps__IndexAssignment_2_2_1 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1812:1: ( rule__SColumnProps__IndexAssignment_2_2_1 )
            {
             before(grammarAccess.getSColumnPropsAccess().getIndexAssignment_2_2_1()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1813:1: ( rule__SColumnProps__IndexAssignment_2_2_1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1813:2: rule__SColumnProps__IndexAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__SColumnProps__IndexAssignment_2_2_1_in_rule__SColumnProps__Group_2_2__1__Impl3721);
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


    // $ANTLR start "rule__SEnum__Group__0"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1827:1: rule__SEnum__Group__0 : rule__SEnum__Group__0__Impl rule__SEnum__Group__1 ;
    public final void rule__SEnum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1831:1: ( rule__SEnum__Group__0__Impl rule__SEnum__Group__1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1832:2: rule__SEnum__Group__0__Impl rule__SEnum__Group__1
            {
            pushFollow(FOLLOW_rule__SEnum__Group__0__Impl_in_rule__SEnum__Group__03755);
            rule__SEnum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SEnum__Group__1_in_rule__SEnum__Group__03758);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1839:1: rule__SEnum__Group__0__Impl : ( 'enum' ) ;
    public final void rule__SEnum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1843:1: ( ( 'enum' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1844:1: ( 'enum' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1844:1: ( 'enum' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1845:1: 'enum'
            {
             before(grammarAccess.getSEnumAccess().getEnumKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__SEnum__Group__0__Impl3786); 
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1858:1: rule__SEnum__Group__1 : rule__SEnum__Group__1__Impl rule__SEnum__Group__2 ;
    public final void rule__SEnum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1862:1: ( rule__SEnum__Group__1__Impl rule__SEnum__Group__2 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1863:2: rule__SEnum__Group__1__Impl rule__SEnum__Group__2
            {
            pushFollow(FOLLOW_rule__SEnum__Group__1__Impl_in_rule__SEnum__Group__13817);
            rule__SEnum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SEnum__Group__2_in_rule__SEnum__Group__13820);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1870:1: rule__SEnum__Group__1__Impl : ( ( rule__SEnum__NameAssignment_1 ) ) ;
    public final void rule__SEnum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1874:1: ( ( ( rule__SEnum__NameAssignment_1 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1875:1: ( ( rule__SEnum__NameAssignment_1 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1875:1: ( ( rule__SEnum__NameAssignment_1 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1876:1: ( rule__SEnum__NameAssignment_1 )
            {
             before(grammarAccess.getSEnumAccess().getNameAssignment_1()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1877:1: ( rule__SEnum__NameAssignment_1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1877:2: rule__SEnum__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SEnum__NameAssignment_1_in_rule__SEnum__Group__1__Impl3847);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1887:1: rule__SEnum__Group__2 : rule__SEnum__Group__2__Impl rule__SEnum__Group__3 ;
    public final void rule__SEnum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1891:1: ( rule__SEnum__Group__2__Impl rule__SEnum__Group__3 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1892:2: rule__SEnum__Group__2__Impl rule__SEnum__Group__3
            {
            pushFollow(FOLLOW_rule__SEnum__Group__2__Impl_in_rule__SEnum__Group__23877);
            rule__SEnum__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SEnum__Group__3_in_rule__SEnum__Group__23880);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1899:1: rule__SEnum__Group__2__Impl : ( '{' ) ;
    public final void rule__SEnum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1903:1: ( ( '{' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1904:1: ( '{' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1904:1: ( '{' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1905:1: '{'
            {
             before(grammarAccess.getSEnumAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,36,FOLLOW_36_in_rule__SEnum__Group__2__Impl3908); 
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1918:1: rule__SEnum__Group__3 : rule__SEnum__Group__3__Impl rule__SEnum__Group__4 ;
    public final void rule__SEnum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1922:1: ( rule__SEnum__Group__3__Impl rule__SEnum__Group__4 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1923:2: rule__SEnum__Group__3__Impl rule__SEnum__Group__4
            {
            pushFollow(FOLLOW_rule__SEnum__Group__3__Impl_in_rule__SEnum__Group__33939);
            rule__SEnum__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SEnum__Group__4_in_rule__SEnum__Group__33942);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1930:1: rule__SEnum__Group__3__Impl : ( ( rule__SEnum__LiteralsAssignment_3 )* ) ;
    public final void rule__SEnum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1934:1: ( ( ( rule__SEnum__LiteralsAssignment_3 )* ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1935:1: ( ( rule__SEnum__LiteralsAssignment_3 )* )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1935:1: ( ( rule__SEnum__LiteralsAssignment_3 )* )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1936:1: ( rule__SEnum__LiteralsAssignment_3 )*
            {
             before(grammarAccess.getSEnumAccess().getLiteralsAssignment_3()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1937:1: ( rule__SEnum__LiteralsAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1937:2: rule__SEnum__LiteralsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__SEnum__LiteralsAssignment_3_in_rule__SEnum__Group__3__Impl3969);
            	    rule__SEnum__LiteralsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1947:1: rule__SEnum__Group__4 : rule__SEnum__Group__4__Impl ;
    public final void rule__SEnum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1951:1: ( rule__SEnum__Group__4__Impl )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1952:2: rule__SEnum__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SEnum__Group__4__Impl_in_rule__SEnum__Group__44000);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1958:1: rule__SEnum__Group__4__Impl : ( '}' ) ;
    public final void rule__SEnum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1962:1: ( ( '}' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1963:1: ( '}' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1963:1: ( '}' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1964:1: '}'
            {
             before(grammarAccess.getSEnumAccess().getRightCurlyBracketKeyword_4()); 
            match(input,32,FOLLOW_32_in_rule__SEnum__Group__4__Impl4028); 
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1987:1: rule__SEnumLiteral__Group__0 : rule__SEnumLiteral__Group__0__Impl rule__SEnumLiteral__Group__1 ;
    public final void rule__SEnumLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1991:1: ( rule__SEnumLiteral__Group__0__Impl rule__SEnumLiteral__Group__1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1992:2: rule__SEnumLiteral__Group__0__Impl rule__SEnumLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__SEnumLiteral__Group__0__Impl_in_rule__SEnumLiteral__Group__04069);
            rule__SEnumLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SEnumLiteral__Group__1_in_rule__SEnumLiteral__Group__04072);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:1999:1: rule__SEnumLiteral__Group__0__Impl : ( ( rule__SEnumLiteral__NameAssignment_0 ) ) ;
    public final void rule__SEnumLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2003:1: ( ( ( rule__SEnumLiteral__NameAssignment_0 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2004:1: ( ( rule__SEnumLiteral__NameAssignment_0 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2004:1: ( ( rule__SEnumLiteral__NameAssignment_0 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2005:1: ( rule__SEnumLiteral__NameAssignment_0 )
            {
             before(grammarAccess.getSEnumLiteralAccess().getNameAssignment_0()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2006:1: ( rule__SEnumLiteral__NameAssignment_0 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2006:2: rule__SEnumLiteral__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__SEnumLiteral__NameAssignment_0_in_rule__SEnumLiteral__Group__0__Impl4099);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2016:1: rule__SEnumLiteral__Group__1 : rule__SEnumLiteral__Group__1__Impl rule__SEnumLiteral__Group__2 ;
    public final void rule__SEnumLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2020:1: ( rule__SEnumLiteral__Group__1__Impl rule__SEnumLiteral__Group__2 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2021:2: rule__SEnumLiteral__Group__1__Impl rule__SEnumLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__SEnumLiteral__Group__1__Impl_in_rule__SEnumLiteral__Group__14129);
            rule__SEnumLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SEnumLiteral__Group__2_in_rule__SEnumLiteral__Group__14132);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2028:1: rule__SEnumLiteral__Group__1__Impl : ( '=' ) ;
    public final void rule__SEnumLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2032:1: ( ( '=' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2033:1: ( '=' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2033:1: ( '=' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2034:1: '='
            {
             before(grammarAccess.getSEnumLiteralAccess().getEqualsSignKeyword_1()); 
            match(input,44,FOLLOW_44_in_rule__SEnumLiteral__Group__1__Impl4160); 
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2047:1: rule__SEnumLiteral__Group__2 : rule__SEnumLiteral__Group__2__Impl ;
    public final void rule__SEnumLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2051:1: ( rule__SEnumLiteral__Group__2__Impl )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2052:2: rule__SEnumLiteral__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SEnumLiteral__Group__2__Impl_in_rule__SEnumLiteral__Group__24191);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2058:1: rule__SEnumLiteral__Group__2__Impl : ( ( rule__SEnumLiteral__ValueAssignment_2 ) ) ;
    public final void rule__SEnumLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2062:1: ( ( ( rule__SEnumLiteral__ValueAssignment_2 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2063:1: ( ( rule__SEnumLiteral__ValueAssignment_2 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2063:1: ( ( rule__SEnumLiteral__ValueAssignment_2 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2064:1: ( rule__SEnumLiteral__ValueAssignment_2 )
            {
             before(grammarAccess.getSEnumLiteralAccess().getValueAssignment_2()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2065:1: ( rule__SEnumLiteral__ValueAssignment_2 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2065:2: rule__SEnumLiteral__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__SEnumLiteral__ValueAssignment_2_in_rule__SEnumLiteral__Group__2__Impl4218);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2081:1: rule__SString__Group__0 : rule__SString__Group__0__Impl rule__SString__Group__1 ;
    public final void rule__SString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2085:1: ( rule__SString__Group__0__Impl rule__SString__Group__1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2086:2: rule__SString__Group__0__Impl rule__SString__Group__1
            {
            pushFollow(FOLLOW_rule__SString__Group__0__Impl_in_rule__SString__Group__04254);
            rule__SString__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SString__Group__1_in_rule__SString__Group__04257);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2093:1: rule__SString__Group__0__Impl : ( 'String(' ) ;
    public final void rule__SString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2097:1: ( ( 'String(' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2098:1: ( 'String(' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2098:1: ( 'String(' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2099:1: 'String('
            {
             before(grammarAccess.getSStringAccess().getStringKeyword_0()); 
            match(input,45,FOLLOW_45_in_rule__SString__Group__0__Impl4285); 
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2112:1: rule__SString__Group__1 : rule__SString__Group__1__Impl rule__SString__Group__2 ;
    public final void rule__SString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2116:1: ( rule__SString__Group__1__Impl rule__SString__Group__2 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2117:2: rule__SString__Group__1__Impl rule__SString__Group__2
            {
            pushFollow(FOLLOW_rule__SString__Group__1__Impl_in_rule__SString__Group__14316);
            rule__SString__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SString__Group__2_in_rule__SString__Group__14319);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2124:1: rule__SString__Group__1__Impl : ( ( rule__SString__ValueAssignment_1 ) ) ;
    public final void rule__SString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2128:1: ( ( ( rule__SString__ValueAssignment_1 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2129:1: ( ( rule__SString__ValueAssignment_1 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2129:1: ( ( rule__SString__ValueAssignment_1 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2130:1: ( rule__SString__ValueAssignment_1 )
            {
             before(grammarAccess.getSStringAccess().getValueAssignment_1()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2131:1: ( rule__SString__ValueAssignment_1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2131:2: rule__SString__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__SString__ValueAssignment_1_in_rule__SString__Group__1__Impl4346);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2141:1: rule__SString__Group__2 : rule__SString__Group__2__Impl ;
    public final void rule__SString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2145:1: ( rule__SString__Group__2__Impl )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2146:2: rule__SString__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SString__Group__2__Impl_in_rule__SString__Group__24376);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2152:1: rule__SString__Group__2__Impl : ( ')' ) ;
    public final void rule__SString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2156:1: ( ( ')' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2157:1: ( ')' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2157:1: ( ')' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2158:1: ')'
            {
             before(grammarAccess.getSStringAccess().getRightParenthesisKeyword_2()); 
            match(input,46,FOLLOW_46_in_rule__SString__Group__2__Impl4404); 
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2177:1: rule__SDecimal__Group__0 : rule__SDecimal__Group__0__Impl rule__SDecimal__Group__1 ;
    public final void rule__SDecimal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2181:1: ( rule__SDecimal__Group__0__Impl rule__SDecimal__Group__1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2182:2: rule__SDecimal__Group__0__Impl rule__SDecimal__Group__1
            {
            pushFollow(FOLLOW_rule__SDecimal__Group__0__Impl_in_rule__SDecimal__Group__04441);
            rule__SDecimal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SDecimal__Group__1_in_rule__SDecimal__Group__04444);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2189:1: rule__SDecimal__Group__0__Impl : ( 'Decimal(' ) ;
    public final void rule__SDecimal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2193:1: ( ( 'Decimal(' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2194:1: ( 'Decimal(' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2194:1: ( 'Decimal(' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2195:1: 'Decimal('
            {
             before(grammarAccess.getSDecimalAccess().getDecimalKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__SDecimal__Group__0__Impl4472); 
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2208:1: rule__SDecimal__Group__1 : rule__SDecimal__Group__1__Impl rule__SDecimal__Group__2 ;
    public final void rule__SDecimal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2212:1: ( rule__SDecimal__Group__1__Impl rule__SDecimal__Group__2 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2213:2: rule__SDecimal__Group__1__Impl rule__SDecimal__Group__2
            {
            pushFollow(FOLLOW_rule__SDecimal__Group__1__Impl_in_rule__SDecimal__Group__14503);
            rule__SDecimal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SDecimal__Group__2_in_rule__SDecimal__Group__14506);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2220:1: rule__SDecimal__Group__1__Impl : ( ( rule__SDecimal__ValueAssignment_1 ) ) ;
    public final void rule__SDecimal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2224:1: ( ( ( rule__SDecimal__ValueAssignment_1 ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2225:1: ( ( rule__SDecimal__ValueAssignment_1 ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2225:1: ( ( rule__SDecimal__ValueAssignment_1 ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2226:1: ( rule__SDecimal__ValueAssignment_1 )
            {
             before(grammarAccess.getSDecimalAccess().getValueAssignment_1()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2227:1: ( rule__SDecimal__ValueAssignment_1 )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2227:2: rule__SDecimal__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__SDecimal__ValueAssignment_1_in_rule__SDecimal__Group__1__Impl4533);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2237:1: rule__SDecimal__Group__2 : rule__SDecimal__Group__2__Impl ;
    public final void rule__SDecimal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2241:1: ( rule__SDecimal__Group__2__Impl )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2242:2: rule__SDecimal__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SDecimal__Group__2__Impl_in_rule__SDecimal__Group__24563);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2248:1: rule__SDecimal__Group__2__Impl : ( ')' ) ;
    public final void rule__SDecimal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2252:1: ( ( ')' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2253:1: ( ')' )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2253:1: ( ')' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2254:1: ')'
            {
             before(grammarAccess.getSDecimalAccess().getRightParenthesisKeyword_2()); 
            match(input,46,FOLLOW_46_in_rule__SDecimal__Group__2__Impl4591); 
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


    // $ANTLR start "rule__SSettings__UnorderedGroup_2"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2274:1: rule__SSettings__UnorderedGroup_2 : ( rule__SSettings__UnorderedGroup_2__0 )? ;
    public final void rule__SSettings__UnorderedGroup_2() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getSSettingsAccess().getUnorderedGroup_2());
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2279:1: ( ( rule__SSettings__UnorderedGroup_2__0 )? )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2280:2: ( rule__SSettings__UnorderedGroup_2__0 )?
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2280:2: ( rule__SSettings__UnorderedGroup_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( LA15_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 0) ) {
                alt15=1;
            }
            else if ( LA15_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 1) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2280:2: rule__SSettings__UnorderedGroup_2__0
                    {
                    pushFollow(FOLLOW_rule__SSettings__UnorderedGroup_2__0_in_rule__SSettings__UnorderedGroup_24629);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2290:1: rule__SSettings__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__SSettings__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__SSettings__Group_2_1__0 ) ) ) ) ) ;
    public final void rule__SSettings__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2295:1: ( ( ({...}? => ( ( ( rule__SSettings__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__SSettings__Group_2_1__0 ) ) ) ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2296:3: ( ({...}? => ( ( ( rule__SSettings__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__SSettings__Group_2_1__0 ) ) ) ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2296:3: ( ({...}? => ( ( ( rule__SSettings__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__SSettings__Group_2_1__0 ) ) ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( LA16_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 0) ) {
                alt16=1;
            }
            else if ( LA16_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 1) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2298:4: ({...}? => ( ( ( rule__SSettings__Group_2_0__0 ) ) ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2298:4: ({...}? => ( ( ( rule__SSettings__Group_2_0__0 ) ) ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2299:5: {...}? => ( ( ( rule__SSettings__Group_2_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 0) ) {
                        throw new FailedPredicateException(input, "rule__SSettings__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 0)");
                    }
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2299:106: ( ( ( rule__SSettings__Group_2_0__0 ) ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2300:6: ( ( rule__SSettings__Group_2_0__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2306:6: ( ( rule__SSettings__Group_2_0__0 ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2308:7: ( rule__SSettings__Group_2_0__0 )
                    {
                     before(grammarAccess.getSSettingsAccess().getGroup_2_0()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2309:7: ( rule__SSettings__Group_2_0__0 )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2309:8: rule__SSettings__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__SSettings__Group_2_0__0_in_rule__SSettings__UnorderedGroup_2__Impl4716);
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
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2315:4: ({...}? => ( ( ( rule__SSettings__Group_2_1__0 ) ) ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2315:4: ({...}? => ( ( ( rule__SSettings__Group_2_1__0 ) ) ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2316:5: {...}? => ( ( ( rule__SSettings__Group_2_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 1) ) {
                        throw new FailedPredicateException(input, "rule__SSettings__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 1)");
                    }
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2316:106: ( ( ( rule__SSettings__Group_2_1__0 ) ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2317:6: ( ( rule__SSettings__Group_2_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2323:6: ( ( rule__SSettings__Group_2_1__0 ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2325:7: ( rule__SSettings__Group_2_1__0 )
                    {
                     before(grammarAccess.getSSettingsAccess().getGroup_2_1()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2326:7: ( rule__SSettings__Group_2_1__0 )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2326:8: rule__SSettings__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__SSettings__Group_2_1__0_in_rule__SSettings__UnorderedGroup_2__Impl4807);
                    rule__SSettings__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSSettingsAccess().getGroup_2_1()); 

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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2341:1: rule__SSettings__UnorderedGroup_2__0 : rule__SSettings__UnorderedGroup_2__Impl ( rule__SSettings__UnorderedGroup_2__1 )? ;
    public final void rule__SSettings__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2345:1: ( rule__SSettings__UnorderedGroup_2__Impl ( rule__SSettings__UnorderedGroup_2__1 )? )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2346:2: rule__SSettings__UnorderedGroup_2__Impl ( rule__SSettings__UnorderedGroup_2__1 )?
            {
            pushFollow(FOLLOW_rule__SSettings__UnorderedGroup_2__Impl_in_rule__SSettings__UnorderedGroup_2__04866);
            rule__SSettings__UnorderedGroup_2__Impl();

            state._fsp--;

            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2347:2: ( rule__SSettings__UnorderedGroup_2__1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( LA17_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 0) ) {
                alt17=1;
            }
            else if ( LA17_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), 1) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2347:2: rule__SSettings__UnorderedGroup_2__1
                    {
                    pushFollow(FOLLOW_rule__SSettings__UnorderedGroup_2__1_in_rule__SSettings__UnorderedGroup_2__04869);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2354:1: rule__SSettings__UnorderedGroup_2__1 : rule__SSettings__UnorderedGroup_2__Impl ;
    public final void rule__SSettings__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2358:1: ( rule__SSettings__UnorderedGroup_2__Impl )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2359:2: rule__SSettings__UnorderedGroup_2__Impl
            {
            pushFollow(FOLLOW_rule__SSettings__UnorderedGroup_2__Impl_in_rule__SSettings__UnorderedGroup_2__14894);
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
    // $ANTLR end "rule__SSettings__UnorderedGroup_2__1"


    // $ANTLR start "rule__SColumnProps__UnorderedGroup_2"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2370:1: rule__SColumnProps__UnorderedGroup_2 : ( rule__SColumnProps__UnorderedGroup_2__0 )? ;
    public final void rule__SColumnProps__UnorderedGroup_2() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2());
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2375:1: ( ( rule__SColumnProps__UnorderedGroup_2__0 )? )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2376:2: ( rule__SColumnProps__UnorderedGroup_2__0 )?
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2376:2: ( rule__SColumnProps__UnorderedGroup_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( LA18_0 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 0) ) {
                alt18=1;
            }
            else if ( LA18_0 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 1) ) {
                alt18=1;
            }
            else if ( LA18_0 ==42 && getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 2) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2376:2: rule__SColumnProps__UnorderedGroup_2__0
                    {
                    pushFollow(FOLLOW_rule__SColumnProps__UnorderedGroup_2__0_in_rule__SColumnProps__UnorderedGroup_24922);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2386:1: rule__SColumnProps__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__SColumnProps__NullableAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__SColumnProps__AesAssignment_2_1 ) ) ) ) | ({...}? => ( ( ( rule__SColumnProps__Group_2_2__0 ) ) ) ) ) ;
    public final void rule__SColumnProps__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2391:1: ( ( ({...}? => ( ( ( rule__SColumnProps__NullableAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__SColumnProps__AesAssignment_2_1 ) ) ) ) | ({...}? => ( ( ( rule__SColumnProps__Group_2_2__0 ) ) ) ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2392:3: ( ({...}? => ( ( ( rule__SColumnProps__NullableAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__SColumnProps__AesAssignment_2_1 ) ) ) ) | ({...}? => ( ( ( rule__SColumnProps__Group_2_2__0 ) ) ) ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2392:3: ( ({...}? => ( ( ( rule__SColumnProps__NullableAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__SColumnProps__AesAssignment_2_1 ) ) ) ) | ({...}? => ( ( ( rule__SColumnProps__Group_2_2__0 ) ) ) ) )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( LA19_0 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 0) ) {
                alt19=1;
            }
            else if ( LA19_0 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 1) ) {
                alt19=2;
            }
            else if ( LA19_0 ==42 && getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 2) ) {
                alt19=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2394:4: ({...}? => ( ( ( rule__SColumnProps__NullableAssignment_2_0 ) ) ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2394:4: ({...}? => ( ( ( rule__SColumnProps__NullableAssignment_2_0 ) ) ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2395:5: {...}? => ( ( ( rule__SColumnProps__NullableAssignment_2_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 0) ) {
                        throw new FailedPredicateException(input, "rule__SColumnProps__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 0)");
                    }
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2395:109: ( ( ( rule__SColumnProps__NullableAssignment_2_0 ) ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2396:6: ( ( rule__SColumnProps__NullableAssignment_2_0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2402:6: ( ( rule__SColumnProps__NullableAssignment_2_0 ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2404:7: ( rule__SColumnProps__NullableAssignment_2_0 )
                    {
                     before(grammarAccess.getSColumnPropsAccess().getNullableAssignment_2_0()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2405:7: ( rule__SColumnProps__NullableAssignment_2_0 )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2405:8: rule__SColumnProps__NullableAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__SColumnProps__NullableAssignment_2_0_in_rule__SColumnProps__UnorderedGroup_2__Impl5009);
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
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2411:4: ({...}? => ( ( ( rule__SColumnProps__AesAssignment_2_1 ) ) ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2411:4: ({...}? => ( ( ( rule__SColumnProps__AesAssignment_2_1 ) ) ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2412:5: {...}? => ( ( ( rule__SColumnProps__AesAssignment_2_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 1) ) {
                        throw new FailedPredicateException(input, "rule__SColumnProps__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 1)");
                    }
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2412:109: ( ( ( rule__SColumnProps__AesAssignment_2_1 ) ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2413:6: ( ( rule__SColumnProps__AesAssignment_2_1 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2419:6: ( ( rule__SColumnProps__AesAssignment_2_1 ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2421:7: ( rule__SColumnProps__AesAssignment_2_1 )
                    {
                     before(grammarAccess.getSColumnPropsAccess().getAesAssignment_2_1()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2422:7: ( rule__SColumnProps__AesAssignment_2_1 )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2422:8: rule__SColumnProps__AesAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__SColumnProps__AesAssignment_2_1_in_rule__SColumnProps__UnorderedGroup_2__Impl5100);
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
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2428:4: ({...}? => ( ( ( rule__SColumnProps__Group_2_2__0 ) ) ) )
                    {
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2428:4: ({...}? => ( ( ( rule__SColumnProps__Group_2_2__0 ) ) ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2429:5: {...}? => ( ( ( rule__SColumnProps__Group_2_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 2) ) {
                        throw new FailedPredicateException(input, "rule__SColumnProps__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 2)");
                    }
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2429:109: ( ( ( rule__SColumnProps__Group_2_2__0 ) ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2430:6: ( ( rule__SColumnProps__Group_2_2__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2436:6: ( ( rule__SColumnProps__Group_2_2__0 ) )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2438:7: ( rule__SColumnProps__Group_2_2__0 )
                    {
                     before(grammarAccess.getSColumnPropsAccess().getGroup_2_2()); 
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2439:7: ( rule__SColumnProps__Group_2_2__0 )
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2439:8: rule__SColumnProps__Group_2_2__0
                    {
                    pushFollow(FOLLOW_rule__SColumnProps__Group_2_2__0_in_rule__SColumnProps__UnorderedGroup_2__Impl5191);
                    rule__SColumnProps__Group_2_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSColumnPropsAccess().getGroup_2_2()); 

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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2454:1: rule__SColumnProps__UnorderedGroup_2__0 : rule__SColumnProps__UnorderedGroup_2__Impl ( rule__SColumnProps__UnorderedGroup_2__1 )? ;
    public final void rule__SColumnProps__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2458:1: ( rule__SColumnProps__UnorderedGroup_2__Impl ( rule__SColumnProps__UnorderedGroup_2__1 )? )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2459:2: rule__SColumnProps__UnorderedGroup_2__Impl ( rule__SColumnProps__UnorderedGroup_2__1 )?
            {
            pushFollow(FOLLOW_rule__SColumnProps__UnorderedGroup_2__Impl_in_rule__SColumnProps__UnorderedGroup_2__05250);
            rule__SColumnProps__UnorderedGroup_2__Impl();

            state._fsp--;

            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2460:2: ( rule__SColumnProps__UnorderedGroup_2__1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( LA20_0 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 0) ) {
                alt20=1;
            }
            else if ( LA20_0 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 1) ) {
                alt20=1;
            }
            else if ( LA20_0 ==42 && getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 2) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2460:2: rule__SColumnProps__UnorderedGroup_2__1
                    {
                    pushFollow(FOLLOW_rule__SColumnProps__UnorderedGroup_2__1_in_rule__SColumnProps__UnorderedGroup_2__05253);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2467:1: rule__SColumnProps__UnorderedGroup_2__1 : rule__SColumnProps__UnorderedGroup_2__Impl ( rule__SColumnProps__UnorderedGroup_2__2 )? ;
    public final void rule__SColumnProps__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2471:1: ( rule__SColumnProps__UnorderedGroup_2__Impl ( rule__SColumnProps__UnorderedGroup_2__2 )? )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2472:2: rule__SColumnProps__UnorderedGroup_2__Impl ( rule__SColumnProps__UnorderedGroup_2__2 )?
            {
            pushFollow(FOLLOW_rule__SColumnProps__UnorderedGroup_2__Impl_in_rule__SColumnProps__UnorderedGroup_2__15278);
            rule__SColumnProps__UnorderedGroup_2__Impl();

            state._fsp--;

            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2473:2: ( rule__SColumnProps__UnorderedGroup_2__2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( LA21_0 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 0) ) {
                alt21=1;
            }
            else if ( LA21_0 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 1) ) {
                alt21=1;
            }
            else if ( LA21_0 ==42 && getUnorderedGroupHelper().canSelect(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), 2) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2473:2: rule__SColumnProps__UnorderedGroup_2__2
                    {
                    pushFollow(FOLLOW_rule__SColumnProps__UnorderedGroup_2__2_in_rule__SColumnProps__UnorderedGroup_2__15281);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2480:1: rule__SColumnProps__UnorderedGroup_2__2 : rule__SColumnProps__UnorderedGroup_2__Impl ;
    public final void rule__SColumnProps__UnorderedGroup_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2484:1: ( rule__SColumnProps__UnorderedGroup_2__Impl )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2485:2: rule__SColumnProps__UnorderedGroup_2__Impl
            {
            pushFollow(FOLLOW_rule__SColumnProps__UnorderedGroup_2__Impl_in_rule__SColumnProps__UnorderedGroup_2__25306);
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
    // $ANTLR end "rule__SColumnProps__UnorderedGroup_2__2"


    // $ANTLR start "rule__SModel__SettingsAssignment_0"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2498:1: rule__SModel__SettingsAssignment_0 : ( ruleSSettings ) ;
    public final void rule__SModel__SettingsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2502:1: ( ( ruleSSettings ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2503:1: ( ruleSSettings )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2503:1: ( ruleSSettings )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2504:1: ruleSSettings
            {
             before(grammarAccess.getSModelAccess().getSettingsSSettingsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSSettings_in_rule__SModel__SettingsAssignment_05340);
            ruleSSettings();

            state._fsp--;

             after(grammarAccess.getSModelAccess().getSettingsSSettingsParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SModel__SettingsAssignment_0"


    // $ANTLR start "rule__SModel__ArtifactAssignment_1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2513:1: rule__SModel__ArtifactAssignment_1 : ( ruleSArtifact ) ;
    public final void rule__SModel__ArtifactAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2517:1: ( ( ruleSArtifact ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2518:1: ( ruleSArtifact )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2518:1: ( ruleSArtifact )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2519:1: ruleSArtifact
            {
             before(grammarAccess.getSModelAccess().getArtifactSArtifactParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSArtifact_in_rule__SModel__ArtifactAssignment_15371);
            ruleSArtifact();

            state._fsp--;

             after(grammarAccess.getSModelAccess().getArtifactSArtifactParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SModel__ArtifactAssignment_1"


    // $ANTLR start "rule__SSettings__SchemaAssignment_2_0_1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2528:1: rule__SSettings__SchemaAssignment_2_0_1 : ( RULE_ID ) ;
    public final void rule__SSettings__SchemaAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2532:1: ( ( RULE_ID ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2533:1: ( RULE_ID )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2533:1: ( RULE_ID )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2534:1: RULE_ID
            {
             before(grammarAccess.getSSettingsAccess().getSchemaIDTerminalRuleCall_2_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SSettings__SchemaAssignment_2_0_15402); 
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


    // $ANTLR start "rule__SSettings__EngineAssignment_2_1_1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2543:1: rule__SSettings__EngineAssignment_2_1_1 : ( ruleSDBEngine ) ;
    public final void rule__SSettings__EngineAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2547:1: ( ( ruleSDBEngine ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2548:1: ( ruleSDBEngine )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2548:1: ( ruleSDBEngine )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2549:1: ruleSDBEngine
            {
             before(grammarAccess.getSSettingsAccess().getEngineSDBEngineEnumRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleSDBEngine_in_rule__SSettings__EngineAssignment_2_1_15433);
            ruleSDBEngine();

            state._fsp--;

             after(grammarAccess.getSSettingsAccess().getEngineSDBEngineEnumRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SSettings__EngineAssignment_2_1_1"


    // $ANTLR start "rule__STable__NameAssignment_1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2558:1: rule__STable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__STable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2562:1: ( ( RULE_ID ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2563:1: ( RULE_ID )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2563:1: ( RULE_ID )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2564:1: RULE_ID
            {
             before(grammarAccess.getSTableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__STable__NameAssignment_15464); 
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


    // $ANTLR start "rule__STable__PrefixAssignment_3_1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2573:1: rule__STable__PrefixAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__STable__PrefixAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2577:1: ( ( RULE_ID ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2578:1: ( RULE_ID )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2578:1: ( RULE_ID )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2579:1: RULE_ID
            {
             before(grammarAccess.getSTableAccess().getPrefixIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__STable__PrefixAssignment_3_15495); 
             after(grammarAccess.getSTableAccess().getPrefixIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STable__PrefixAssignment_3_1"


    // $ANTLR start "rule__STable__EntityMembersAssignment_4"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2588:1: rule__STable__EntityMembersAssignment_4 : ( ruleSEntityMember ) ;
    public final void rule__STable__EntityMembersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2592:1: ( ( ruleSEntityMember ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2593:1: ( ruleSEntityMember )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2593:1: ( ruleSEntityMember )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2594:1: ruleSEntityMember
            {
             before(grammarAccess.getSTableAccess().getEntityMembersSEntityMemberParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleSEntityMember_in_rule__STable__EntityMembersAssignment_45526);
            ruleSEntityMember();

            state._fsp--;

             after(grammarAccess.getSTableAccess().getEntityMembersSEntityMemberParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__STable__EntityMembersAssignment_4"


    // $ANTLR start "rule__SProperty__NameAssignment_1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2603:1: rule__SProperty__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SProperty__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2607:1: ( ( RULE_ID ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2608:1: ( RULE_ID )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2608:1: ( RULE_ID )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2609:1: RULE_ID
            {
             before(grammarAccess.getSPropertyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SProperty__NameAssignment_15557); 
             after(grammarAccess.getSPropertyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SProperty__NameAssignment_1"


    // $ANTLR start "rule__SProperty__ExtTypeAssignment_2_0"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2618:1: rule__SProperty__ExtTypeAssignment_2_0 : ( ( RULE_ID ) ) ;
    public final void rule__SProperty__ExtTypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2622:1: ( ( ( RULE_ID ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2623:1: ( ( RULE_ID ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2623:1: ( ( RULE_ID ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2624:1: ( RULE_ID )
            {
             before(grammarAccess.getSPropertyAccess().getExtTypeSExtDeclaredSQLTypeCrossReference_2_0_0()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2625:1: ( RULE_ID )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2626:1: RULE_ID
            {
             before(grammarAccess.getSPropertyAccess().getExtTypeSExtDeclaredSQLTypeIDTerminalRuleCall_2_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SProperty__ExtTypeAssignment_2_05592); 
             after(grammarAccess.getSPropertyAccess().getExtTypeSExtDeclaredSQLTypeIDTerminalRuleCall_2_0_0_1()); 

            }

             after(grammarAccess.getSPropertyAccess().getExtTypeSExtDeclaredSQLTypeCrossReference_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SProperty__ExtTypeAssignment_2_0"


    // $ANTLR start "rule__SProperty__InlinedTypeAssignment_2_1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2637:1: rule__SProperty__InlinedTypeAssignment_2_1 : ( ruleSInlinedSQLType ) ;
    public final void rule__SProperty__InlinedTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2641:1: ( ( ruleSInlinedSQLType ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2642:1: ( ruleSInlinedSQLType )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2642:1: ( ruleSInlinedSQLType )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2643:1: ruleSInlinedSQLType
            {
             before(grammarAccess.getSPropertyAccess().getInlinedTypeSInlinedSQLTypeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleSInlinedSQLType_in_rule__SProperty__InlinedTypeAssignment_2_15627);
            ruleSInlinedSQLType();

            state._fsp--;

             after(grammarAccess.getSPropertyAccess().getInlinedTypeSInlinedSQLTypeParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SProperty__InlinedTypeAssignment_2_1"


    // $ANTLR start "rule__SProperty__SimpleTypeAssignment_2_2"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2652:1: rule__SProperty__SimpleTypeAssignment_2_2 : ( ruleSSimpleTypes ) ;
    public final void rule__SProperty__SimpleTypeAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2656:1: ( ( ruleSSimpleTypes ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2657:1: ( ruleSSimpleTypes )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2657:1: ( ruleSSimpleTypes )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2658:1: ruleSSimpleTypes
            {
             before(grammarAccess.getSPropertyAccess().getSimpleTypeSSimpleTypesEnumRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleSSimpleTypes_in_rule__SProperty__SimpleTypeAssignment_2_25658);
            ruleSSimpleTypes();

            state._fsp--;

             after(grammarAccess.getSPropertyAccess().getSimpleTypeSSimpleTypesEnumRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SProperty__SimpleTypeAssignment_2_2"


    // $ANTLR start "rule__SProperty__PropsAssignment_3"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2667:1: rule__SProperty__PropsAssignment_3 : ( ruleSColumnProps ) ;
    public final void rule__SProperty__PropsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2671:1: ( ( ruleSColumnProps ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2672:1: ( ruleSColumnProps )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2672:1: ( ruleSColumnProps )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2673:1: ruleSColumnProps
            {
             before(grammarAccess.getSPropertyAccess().getPropsSColumnPropsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSColumnProps_in_rule__SProperty__PropsAssignment_35689);
            ruleSColumnProps();

            state._fsp--;

             after(grammarAccess.getSPropertyAccess().getPropsSColumnPropsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SProperty__PropsAssignment_3"


    // $ANTLR start "rule__SJoinProperty__NameAssignment_1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2682:1: rule__SJoinProperty__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SJoinProperty__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2686:1: ( ( RULE_ID ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2687:1: ( RULE_ID )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2687:1: ( RULE_ID )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2688:1: RULE_ID
            {
             before(grammarAccess.getSJoinPropertyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SJoinProperty__NameAssignment_15720); 
             after(grammarAccess.getSJoinPropertyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJoinProperty__NameAssignment_1"


    // $ANTLR start "rule__SJoinProperty__TypeAssignment_2"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2697:1: rule__SJoinProperty__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__SJoinProperty__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2701:1: ( ( ( RULE_ID ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2702:1: ( ( RULE_ID ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2702:1: ( ( RULE_ID ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2703:1: ( RULE_ID )
            {
             before(grammarAccess.getSJoinPropertyAccess().getTypeSTableCrossReference_2_0()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2704:1: ( RULE_ID )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2705:1: RULE_ID
            {
             before(grammarAccess.getSJoinPropertyAccess().getTypeSTableIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SJoinProperty__TypeAssignment_25755); 
             after(grammarAccess.getSJoinPropertyAccess().getTypeSTableIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getSJoinPropertyAccess().getTypeSTableCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJoinProperty__TypeAssignment_2"


    // $ANTLR start "rule__SJoinProperty__PropsAssignment_3"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2716:1: rule__SJoinProperty__PropsAssignment_3 : ( ruleSColumnProps ) ;
    public final void rule__SJoinProperty__PropsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2720:1: ( ( ruleSColumnProps ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2721:1: ( ruleSColumnProps )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2721:1: ( ruleSColumnProps )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2722:1: ruleSColumnProps
            {
             before(grammarAccess.getSJoinPropertyAccess().getPropsSColumnPropsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSColumnProps_in_rule__SJoinProperty__PropsAssignment_35790);
            ruleSColumnProps();

            state._fsp--;

             after(grammarAccess.getSJoinPropertyAccess().getPropsSColumnPropsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJoinProperty__PropsAssignment_3"


    // $ANTLR start "rule__SColumnProps__NullableAssignment_2_0"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2731:1: rule__SColumnProps__NullableAssignment_2_0 : ( ( 'nullable' ) ) ;
    public final void rule__SColumnProps__NullableAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2735:1: ( ( ( 'nullable' ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2736:1: ( ( 'nullable' ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2736:1: ( ( 'nullable' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2737:1: ( 'nullable' )
            {
             before(grammarAccess.getSColumnPropsAccess().getNullableNullableKeyword_2_0_0()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2738:1: ( 'nullable' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2739:1: 'nullable'
            {
             before(grammarAccess.getSColumnPropsAccess().getNullableNullableKeyword_2_0_0()); 
            match(input,48,FOLLOW_48_in_rule__SColumnProps__NullableAssignment_2_05826); 
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2754:1: rule__SColumnProps__AesAssignment_2_1 : ( ( 'AES' ) ) ;
    public final void rule__SColumnProps__AesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2758:1: ( ( ( 'AES' ) ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2759:1: ( ( 'AES' ) )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2759:1: ( ( 'AES' ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2760:1: ( 'AES' )
            {
             before(grammarAccess.getSColumnPropsAccess().getAesAESKeyword_2_1_0()); 
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2761:1: ( 'AES' )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2762:1: 'AES'
            {
             before(grammarAccess.getSColumnPropsAccess().getAesAESKeyword_2_1_0()); 
            match(input,49,FOLLOW_49_in_rule__SColumnProps__AesAssignment_2_15870); 
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2777:1: rule__SColumnProps__IndexAssignment_2_2_1 : ( ruleSIndex ) ;
    public final void rule__SColumnProps__IndexAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2781:1: ( ( ruleSIndex ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2782:1: ( ruleSIndex )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2782:1: ( ruleSIndex )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2783:1: ruleSIndex
            {
             before(grammarAccess.getSColumnPropsAccess().getIndexSIndexEnumRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleSIndex_in_rule__SColumnProps__IndexAssignment_2_2_15909);
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


    // $ANTLR start "rule__SEnum__NameAssignment_1"
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2792:1: rule__SEnum__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SEnum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2796:1: ( ( RULE_ID ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2797:1: ( RULE_ID )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2797:1: ( RULE_ID )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2798:1: RULE_ID
            {
             before(grammarAccess.getSEnumAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SEnum__NameAssignment_15940); 
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2807:1: rule__SEnum__LiteralsAssignment_3 : ( ruleSEnumLiteral ) ;
    public final void rule__SEnum__LiteralsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2811:1: ( ( ruleSEnumLiteral ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2812:1: ( ruleSEnumLiteral )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2812:1: ( ruleSEnumLiteral )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2813:1: ruleSEnumLiteral
            {
             before(grammarAccess.getSEnumAccess().getLiteralsSEnumLiteralParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSEnumLiteral_in_rule__SEnum__LiteralsAssignment_35971);
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2822:1: rule__SEnumLiteral__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SEnumLiteral__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2826:1: ( ( RULE_ID ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2827:1: ( RULE_ID )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2827:1: ( RULE_ID )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2828:1: RULE_ID
            {
             before(grammarAccess.getSEnumLiteralAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SEnumLiteral__NameAssignment_06002); 
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2837:1: rule__SEnumLiteral__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__SEnumLiteral__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2841:1: ( ( RULE_INT ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2842:1: ( RULE_INT )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2842:1: ( RULE_INT )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2843:1: RULE_INT
            {
             before(grammarAccess.getSEnumLiteralAccess().getValueINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SEnumLiteral__ValueAssignment_26033); 
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2852:1: rule__SString__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__SString__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2856:1: ( ( RULE_INT ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2857:1: ( RULE_INT )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2857:1: ( RULE_INT )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2858:1: RULE_INT
            {
             before(grammarAccess.getSStringAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SString__ValueAssignment_16064); 
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
    // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2867:1: rule__SDecimal__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__SDecimal__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2871:1: ( ( RULE_INT ) )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2872:1: ( RULE_INT )
            {
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2872:1: ( RULE_INT )
            // ../org.lunifera.metamodel.dsl.sql.ui/src-gen/org/lunifera/metamodel/dsl/ui/contentassist/antlr/internal/InternalSqlDSL.g:2873:1: RULE_INT
            {
             before(grammarAccess.getSDecimalAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SDecimal__ValueAssignment_16095); 
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
    public static final BitSet FOLLOW_ruleSEntityMember_in_entryRuleSEntityMember301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSEntityMember308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SEntityMember__Alternatives_in_ruleSEntityMember334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSProperty_in_entryRuleSProperty361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSProperty368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SProperty__Group__0_in_ruleSProperty394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJoinProperty_in_entryRuleSJoinProperty421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSJoinProperty428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJoinProperty__Group__0_in_ruleSJoinProperty454 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_rule__SDBEngine__Alternatives_in_ruleSDBEngine853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SSimpleTypes__Alternatives_in_ruleSSimpleTypes889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SIndex__Alternatives_in_ruleSIndex925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTable_in_rule__SArtifact__Alternatives960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSEnum_in_rule__SArtifact__Alternatives977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSProperty_in_rule__SEntityMember__Alternatives1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJoinProperty_in_rule__SEntityMember__Alternatives1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SProperty__ExtTypeAssignment_2_0_in_rule__SProperty__Alternatives_21058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SProperty__InlinedTypeAssignment_2_1_in_rule__SProperty__Alternatives_21076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SProperty__SimpleTypeAssignment_2_2_in_rule__SProperty__Alternatives_21094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSString_in_rule__SInlinedSQLType__Alternatives1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSDecimal_in_rule__SInlinedSQLType__Alternatives1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__SDBEngine__Alternatives1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SDBEngine__Alternatives1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SSimpleTypes__Alternatives1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SSimpleTypes__Alternatives1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SSimpleTypes__Alternatives1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SSimpleTypes__Alternatives1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SSimpleTypes__Alternatives1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SSimpleTypes__Alternatives1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__SSimpleTypes__Alternatives1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SSimpleTypes__Alternatives1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SSimpleTypes__Alternatives1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SSimpleTypes__Alternatives1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SSimpleTypes__Alternatives1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__SSimpleTypes__Alternatives1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__SSimpleTypes__Alternatives1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__SSimpleTypes__Alternatives1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__SIndex__Alternatives1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__SIndex__Alternatives1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__SIndex__Alternatives1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__SIndex__Alternatives1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SModel__Group__0__Impl_in_rule__SModel__Group__01639 = new BitSet(new long[]{0x0000080800000000L});
    public static final BitSet FOLLOW_rule__SModel__Group__1_in_rule__SModel__Group__01642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SModel__SettingsAssignment_0_in_rule__SModel__Group__0__Impl1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SModel__Group__1__Impl_in_rule__SModel__Group__11700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SModel__ArtifactAssignment_1_in_rule__SModel__Group__1__Impl1727 = new BitSet(new long[]{0x0000080800000002L});
    public static final BitSet FOLLOW_rule__SSettings__Group__0__Impl_in_rule__SSettings__Group__01762 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__SSettings__Group__1_in_rule__SSettings__Group__01765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SSettings__Group__1__Impl_in_rule__SSettings__Group__11823 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_rule__SSettings__Group__2_in_rule__SSettings__Group__11826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__SSettings__Group__1__Impl1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SSettings__Group__2__Impl_in_rule__SSettings__Group__21885 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__SSettings__Group__3_in_rule__SSettings__Group__21888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SSettings__UnorderedGroup_2_in_rule__SSettings__Group__2__Impl1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SSettings__Group__3__Impl_in_rule__SSettings__Group__31945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__SSettings__Group__3__Impl1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SSettings__Group_2_0__0__Impl_in_rule__SSettings__Group_2_0__02012 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SSettings__Group_2_0__1_in_rule__SSettings__Group_2_0__02015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__SSettings__Group_2_0__0__Impl2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SSettings__Group_2_0__1__Impl_in_rule__SSettings__Group_2_0__12074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SSettings__SchemaAssignment_2_0_1_in_rule__SSettings__Group_2_0__1__Impl2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SSettings__Group_2_1__0__Impl_in_rule__SSettings__Group_2_1__02135 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__SSettings__Group_2_1__1_in_rule__SSettings__Group_2_1__02138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__SSettings__Group_2_1__0__Impl2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SSettings__Group_2_1__1__Impl_in_rule__SSettings__Group_2_1__12197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SSettings__EngineAssignment_2_1_1_in_rule__SSettings__Group_2_1__1__Impl2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__STable__Group__0__Impl_in_rule__STable__Group__02258 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__STable__Group__1_in_rule__STable__Group__02261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__STable__Group__0__Impl2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__STable__Group__1__Impl_in_rule__STable__Group__12320 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__STable__Group__2_in_rule__STable__Group__12323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__STable__NameAssignment_1_in_rule__STable__Group__1__Impl2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__STable__Group__2__Impl_in_rule__STable__Group__22380 = new BitSet(new long[]{0x000001A100000000L});
    public static final BitSet FOLLOW_rule__STable__Group__3_in_rule__STable__Group__22383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__STable__Group__2__Impl2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__STable__Group__3__Impl_in_rule__STable__Group__32442 = new BitSet(new long[]{0x000001A100000000L});
    public static final BitSet FOLLOW_rule__STable__Group__4_in_rule__STable__Group__32445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__STable__Group_3__0_in_rule__STable__Group__3__Impl2472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__STable__Group__4__Impl_in_rule__STable__Group__42503 = new BitSet(new long[]{0x000001A100000000L});
    public static final BitSet FOLLOW_rule__STable__Group__5_in_rule__STable__Group__42506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__STable__EntityMembersAssignment_4_in_rule__STable__Group__4__Impl2533 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_rule__STable__Group__5__Impl_in_rule__STable__Group__52564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__STable__Group__5__Impl2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__STable__Group_3__0__Impl_in_rule__STable__Group_3__02635 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__STable__Group_3__1_in_rule__STable__Group_3__02638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__STable__Group_3__0__Impl2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__STable__Group_3__1__Impl_in_rule__STable__Group_3__12697 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__STable__Group_3__2_in_rule__STable__Group_3__12700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__STable__PrefixAssignment_3_1_in_rule__STable__Group_3__1__Impl2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__STable__Group_3__2__Impl_in_rule__STable__Group_3__22757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__STable__Group_3__2__Impl2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SProperty__Group__0__Impl_in_rule__SProperty__Group__02822 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SProperty__Group__1_in_rule__SProperty__Group__02825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__SProperty__Group__0__Impl2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SProperty__Group__1__Impl_in_rule__SProperty__Group__12884 = new BitSet(new long[]{0x0000A00007FFE010L});
    public static final BitSet FOLLOW_rule__SProperty__Group__2_in_rule__SProperty__Group__12887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SProperty__NameAssignment_1_in_rule__SProperty__Group__1__Impl2914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SProperty__Group__2__Impl_in_rule__SProperty__Group__22944 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_rule__SProperty__Group__3_in_rule__SProperty__Group__22947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SProperty__Alternatives_2_in_rule__SProperty__Group__2__Impl2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SProperty__Group__3__Impl_in_rule__SProperty__Group__33004 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_rule__SProperty__Group__4_in_rule__SProperty__Group__33007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SProperty__PropsAssignment_3_in_rule__SProperty__Group__3__Impl3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SProperty__Group__4__Impl_in_rule__SProperty__Group__43065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__SProperty__Group__4__Impl3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJoinProperty__Group__0__Impl_in_rule__SJoinProperty__Group__03134 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SJoinProperty__Group__1_in_rule__SJoinProperty__Group__03137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__SJoinProperty__Group__0__Impl3165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJoinProperty__Group__1__Impl_in_rule__SJoinProperty__Group__13196 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SJoinProperty__Group__2_in_rule__SJoinProperty__Group__13199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJoinProperty__NameAssignment_1_in_rule__SJoinProperty__Group__1__Impl3226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJoinProperty__Group__2__Impl_in_rule__SJoinProperty__Group__23256 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_rule__SJoinProperty__Group__3_in_rule__SJoinProperty__Group__23259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJoinProperty__TypeAssignment_2_in_rule__SJoinProperty__Group__2__Impl3286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJoinProperty__Group__3__Impl_in_rule__SJoinProperty__Group__33316 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_rule__SJoinProperty__Group__4_in_rule__SJoinProperty__Group__33319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJoinProperty__PropsAssignment_3_in_rule__SJoinProperty__Group__3__Impl3346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJoinProperty__Group__4__Impl_in_rule__SJoinProperty__Group__43377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__SJoinProperty__Group__4__Impl3405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumnProps__Group__0__Impl_in_rule__SColumnProps__Group__03446 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__SColumnProps__Group__1_in_rule__SColumnProps__Group__03449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumnProps__Group__1__Impl_in_rule__SColumnProps__Group__13507 = new BitSet(new long[]{0x0003040000000000L});
    public static final BitSet FOLLOW_rule__SColumnProps__Group__2_in_rule__SColumnProps__Group__13510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__SColumnProps__Group__1__Impl3538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumnProps__Group__2__Impl_in_rule__SColumnProps__Group__23569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumnProps__UnorderedGroup_2_in_rule__SColumnProps__Group__2__Impl3596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumnProps__Group_2_2__0__Impl_in_rule__SColumnProps__Group_2_2__03632 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_rule__SColumnProps__Group_2_2__1_in_rule__SColumnProps__Group_2_2__03635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__SColumnProps__Group_2_2__0__Impl3663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumnProps__Group_2_2__1__Impl_in_rule__SColumnProps__Group_2_2__13694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumnProps__IndexAssignment_2_2_1_in_rule__SColumnProps__Group_2_2__1__Impl3721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SEnum__Group__0__Impl_in_rule__SEnum__Group__03755 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SEnum__Group__1_in_rule__SEnum__Group__03758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__SEnum__Group__0__Impl3786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SEnum__Group__1__Impl_in_rule__SEnum__Group__13817 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__SEnum__Group__2_in_rule__SEnum__Group__13820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SEnum__NameAssignment_1_in_rule__SEnum__Group__1__Impl3847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SEnum__Group__2__Impl_in_rule__SEnum__Group__23877 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_rule__SEnum__Group__3_in_rule__SEnum__Group__23880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__SEnum__Group__2__Impl3908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SEnum__Group__3__Impl_in_rule__SEnum__Group__33939 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_rule__SEnum__Group__4_in_rule__SEnum__Group__33942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SEnum__LiteralsAssignment_3_in_rule__SEnum__Group__3__Impl3969 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__SEnum__Group__4__Impl_in_rule__SEnum__Group__44000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__SEnum__Group__4__Impl4028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SEnumLiteral__Group__0__Impl_in_rule__SEnumLiteral__Group__04069 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__SEnumLiteral__Group__1_in_rule__SEnumLiteral__Group__04072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SEnumLiteral__NameAssignment_0_in_rule__SEnumLiteral__Group__0__Impl4099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SEnumLiteral__Group__1__Impl_in_rule__SEnumLiteral__Group__14129 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SEnumLiteral__Group__2_in_rule__SEnumLiteral__Group__14132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__SEnumLiteral__Group__1__Impl4160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SEnumLiteral__Group__2__Impl_in_rule__SEnumLiteral__Group__24191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SEnumLiteral__ValueAssignment_2_in_rule__SEnumLiteral__Group__2__Impl4218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SString__Group__0__Impl_in_rule__SString__Group__04254 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SString__Group__1_in_rule__SString__Group__04257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__SString__Group__0__Impl4285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SString__Group__1__Impl_in_rule__SString__Group__14316 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__SString__Group__2_in_rule__SString__Group__14319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SString__ValueAssignment_1_in_rule__SString__Group__1__Impl4346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SString__Group__2__Impl_in_rule__SString__Group__24376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__SString__Group__2__Impl4404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDecimal__Group__0__Impl_in_rule__SDecimal__Group__04441 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SDecimal__Group__1_in_rule__SDecimal__Group__04444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__SDecimal__Group__0__Impl4472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDecimal__Group__1__Impl_in_rule__SDecimal__Group__14503 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__SDecimal__Group__2_in_rule__SDecimal__Group__14506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDecimal__ValueAssignment_1_in_rule__SDecimal__Group__1__Impl4533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDecimal__Group__2__Impl_in_rule__SDecimal__Group__24563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__SDecimal__Group__2__Impl4591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SSettings__UnorderedGroup_2__0_in_rule__SSettings__UnorderedGroup_24629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SSettings__Group_2_0__0_in_rule__SSettings__UnorderedGroup_2__Impl4716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SSettings__Group_2_1__0_in_rule__SSettings__UnorderedGroup_2__Impl4807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SSettings__UnorderedGroup_2__Impl_in_rule__SSettings__UnorderedGroup_2__04866 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_rule__SSettings__UnorderedGroup_2__1_in_rule__SSettings__UnorderedGroup_2__04869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SSettings__UnorderedGroup_2__Impl_in_rule__SSettings__UnorderedGroup_2__14894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumnProps__UnorderedGroup_2__0_in_rule__SColumnProps__UnorderedGroup_24922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumnProps__NullableAssignment_2_0_in_rule__SColumnProps__UnorderedGroup_2__Impl5009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumnProps__AesAssignment_2_1_in_rule__SColumnProps__UnorderedGroup_2__Impl5100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumnProps__Group_2_2__0_in_rule__SColumnProps__UnorderedGroup_2__Impl5191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumnProps__UnorderedGroup_2__Impl_in_rule__SColumnProps__UnorderedGroup_2__05250 = new BitSet(new long[]{0x0003040000000002L});
    public static final BitSet FOLLOW_rule__SColumnProps__UnorderedGroup_2__1_in_rule__SColumnProps__UnorderedGroup_2__05253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumnProps__UnorderedGroup_2__Impl_in_rule__SColumnProps__UnorderedGroup_2__15278 = new BitSet(new long[]{0x0003040000000002L});
    public static final BitSet FOLLOW_rule__SColumnProps__UnorderedGroup_2__2_in_rule__SColumnProps__UnorderedGroup_2__15281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SColumnProps__UnorderedGroup_2__Impl_in_rule__SColumnProps__UnorderedGroup_2__25306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSSettings_in_rule__SModel__SettingsAssignment_05340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSArtifact_in_rule__SModel__ArtifactAssignment_15371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SSettings__SchemaAssignment_2_0_15402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSDBEngine_in_rule__SSettings__EngineAssignment_2_1_15433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__STable__NameAssignment_15464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__STable__PrefixAssignment_3_15495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSEntityMember_in_rule__STable__EntityMembersAssignment_45526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SProperty__NameAssignment_15557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SProperty__ExtTypeAssignment_2_05592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSInlinedSQLType_in_rule__SProperty__InlinedTypeAssignment_2_15627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSSimpleTypes_in_rule__SProperty__SimpleTypeAssignment_2_25658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSColumnProps_in_rule__SProperty__PropsAssignment_35689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SJoinProperty__NameAssignment_15720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SJoinProperty__TypeAssignment_25755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSColumnProps_in_rule__SJoinProperty__PropsAssignment_35790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__SColumnProps__NullableAssignment_2_05826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__SColumnProps__AesAssignment_2_15870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSIndex_in_rule__SColumnProps__IndexAssignment_2_2_15909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SEnum__NameAssignment_15940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSEnumLiteral_in_rule__SEnum__LiteralsAssignment_35971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SEnumLiteral__NameAssignment_06002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SEnumLiteral__ValueAssignment_26033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SString__ValueAssignment_16064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SDecimal__ValueAssignment_16095 = new BitSet(new long[]{0x0000000000000002L});

}

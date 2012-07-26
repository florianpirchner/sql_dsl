/*
* generated by Xtext
*/
package org.lunifera.metamodel.dsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.lunifera.metamodel.dsl.services.SqlDSLGrammarAccess;

public class SqlDSLParser extends AbstractContentAssistParser {
	
	@Inject
	private SqlDSLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.lunifera.metamodel.dsl.ui.contentassist.antlr.internal.InternalSqlDSLParser createParser() {
		org.lunifera.metamodel.dsl.ui.contentassist.antlr.internal.InternalSqlDSLParser result = new org.lunifera.metamodel.dsl.ui.contentassist.antlr.internal.InternalSqlDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getSArtifactAccess().getAlternatives(), "rule__SArtifact__Alternatives");
					put(grammarAccess.getSEntityMemberAccess().getAlternatives(), "rule__SEntityMember__Alternatives");
					put(grammarAccess.getSPropertyAccess().getAlternatives_2(), "rule__SProperty__Alternatives_2");
					put(grammarAccess.getSInlinedSQLTypeAccess().getAlternatives(), "rule__SInlinedSQLType__Alternatives");
					put(grammarAccess.getSDBEngineAccess().getAlternatives(), "rule__SDBEngine__Alternatives");
					put(grammarAccess.getSSimpleTypesAccess().getAlternatives(), "rule__SSimpleTypes__Alternatives");
					put(grammarAccess.getSIndexAccess().getAlternatives(), "rule__SIndex__Alternatives");
					put(grammarAccess.getSModelAccess().getGroup(), "rule__SModel__Group__0");
					put(grammarAccess.getSSettingsAccess().getGroup(), "rule__SSettings__Group__0");
					put(grammarAccess.getSSettingsAccess().getGroup_2_0(), "rule__SSettings__Group_2_0__0");
					put(grammarAccess.getSSettingsAccess().getGroup_2_1(), "rule__SSettings__Group_2_1__0");
					put(grammarAccess.getSTableAccess().getGroup(), "rule__STable__Group__0");
					put(grammarAccess.getSTableAccess().getGroup_3(), "rule__STable__Group_3__0");
					put(grammarAccess.getSPropertyAccess().getGroup(), "rule__SProperty__Group__0");
					put(grammarAccess.getSJoinPropertyAccess().getGroup(), "rule__SJoinProperty__Group__0");
					put(grammarAccess.getSColumnPropsAccess().getGroup(), "rule__SColumnProps__Group__0");
					put(grammarAccess.getSColumnPropsAccess().getGroup_2_2(), "rule__SColumnProps__Group_2_2__0");
					put(grammarAccess.getSEnumAccess().getGroup(), "rule__SEnum__Group__0");
					put(grammarAccess.getSEnumLiteralAccess().getGroup(), "rule__SEnumLiteral__Group__0");
					put(grammarAccess.getSStringAccess().getGroup(), "rule__SString__Group__0");
					put(grammarAccess.getSDecimalAccess().getGroup(), "rule__SDecimal__Group__0");
					put(grammarAccess.getSModelAccess().getSettingsAssignment_0(), "rule__SModel__SettingsAssignment_0");
					put(grammarAccess.getSModelAccess().getArtifactAssignment_1(), "rule__SModel__ArtifactAssignment_1");
					put(grammarAccess.getSSettingsAccess().getSchemaAssignment_2_0_1(), "rule__SSettings__SchemaAssignment_2_0_1");
					put(grammarAccess.getSSettingsAccess().getEngineAssignment_2_1_1(), "rule__SSettings__EngineAssignment_2_1_1");
					put(grammarAccess.getSTableAccess().getNameAssignment_1(), "rule__STable__NameAssignment_1");
					put(grammarAccess.getSTableAccess().getPrefixAssignment_3_1(), "rule__STable__PrefixAssignment_3_1");
					put(grammarAccess.getSTableAccess().getEntityMembersAssignment_4(), "rule__STable__EntityMembersAssignment_4");
					put(grammarAccess.getSPropertyAccess().getNameAssignment_1(), "rule__SProperty__NameAssignment_1");
					put(grammarAccess.getSPropertyAccess().getExtTypeAssignment_2_0(), "rule__SProperty__ExtTypeAssignment_2_0");
					put(grammarAccess.getSPropertyAccess().getInlinedTypeAssignment_2_1(), "rule__SProperty__InlinedTypeAssignment_2_1");
					put(grammarAccess.getSPropertyAccess().getSimpleTypeAssignment_2_2(), "rule__SProperty__SimpleTypeAssignment_2_2");
					put(grammarAccess.getSPropertyAccess().getPropsAssignment_3(), "rule__SProperty__PropsAssignment_3");
					put(grammarAccess.getSJoinPropertyAccess().getNameAssignment_1(), "rule__SJoinProperty__NameAssignment_1");
					put(grammarAccess.getSJoinPropertyAccess().getTypeAssignment_2(), "rule__SJoinProperty__TypeAssignment_2");
					put(grammarAccess.getSJoinPropertyAccess().getPropsAssignment_3(), "rule__SJoinProperty__PropsAssignment_3");
					put(grammarAccess.getSColumnPropsAccess().getNullableAssignment_2_0(), "rule__SColumnProps__NullableAssignment_2_0");
					put(grammarAccess.getSColumnPropsAccess().getAesAssignment_2_1(), "rule__SColumnProps__AesAssignment_2_1");
					put(grammarAccess.getSColumnPropsAccess().getIndexAssignment_2_2_1(), "rule__SColumnProps__IndexAssignment_2_2_1");
					put(grammarAccess.getSEnumAccess().getNameAssignment_1(), "rule__SEnum__NameAssignment_1");
					put(grammarAccess.getSEnumAccess().getLiteralsAssignment_3(), "rule__SEnum__LiteralsAssignment_3");
					put(grammarAccess.getSEnumLiteralAccess().getNameAssignment_0(), "rule__SEnumLiteral__NameAssignment_0");
					put(grammarAccess.getSEnumLiteralAccess().getValueAssignment_2(), "rule__SEnumLiteral__ValueAssignment_2");
					put(grammarAccess.getSStringAccess().getValueAssignment_1(), "rule__SString__ValueAssignment_1");
					put(grammarAccess.getSDecimalAccess().getValueAssignment_1(), "rule__SDecimal__ValueAssignment_1");
					put(grammarAccess.getSSettingsAccess().getUnorderedGroup_2(), "rule__SSettings__UnorderedGroup_2");
					put(grammarAccess.getSColumnPropsAccess().getUnorderedGroup_2(), "rule__SColumnProps__UnorderedGroup_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.lunifera.metamodel.dsl.ui.contentassist.antlr.internal.InternalSqlDSLParser typedParser = (org.lunifera.metamodel.dsl.ui.contentassist.antlr.internal.InternalSqlDSLParser) parser;
			typedParser.entryRuleSModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public SqlDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SqlDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

package org.lunifera.metamodel.dsl.serializer;

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
import org.lunifera.metamodel.dsl.services.SqlDSLGrammarAccess;
import org.lunifera.metamodel.dsl.sqlDSL.SColumnProps;
import org.lunifera.metamodel.dsl.sqlDSL.SDecimal;
import org.lunifera.metamodel.dsl.sqlDSL.SEnum;
import org.lunifera.metamodel.dsl.sqlDSL.SEnumLiteral;
import org.lunifera.metamodel.dsl.sqlDSL.SJoinProperty;
import org.lunifera.metamodel.dsl.sqlDSL.SModel;
import org.lunifera.metamodel.dsl.sqlDSL.SProperty;
import org.lunifera.metamodel.dsl.sqlDSL.SSettings;
import org.lunifera.metamodel.dsl.sqlDSL.SString;
import org.lunifera.metamodel.dsl.sqlDSL.STable;
import org.lunifera.metamodel.dsl.sqlDSL.SqlDSLPackage;

@SuppressWarnings("all")
public class SqlDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SqlDSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SqlDSLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SqlDSLPackage.SCOLUMN_PROPS:
				if(context == grammarAccess.getSColumnPropsRule()) {
					sequence_SColumnProps(context, (SColumnProps) semanticObject); 
					return; 
				}
				else break;
			case SqlDSLPackage.SDECIMAL:
				if(context == grammarAccess.getSDecimalRule() ||
				   context == grammarAccess.getSInlinedSQLTypeRule()) {
					sequence_SDecimal(context, (SDecimal) semanticObject); 
					return; 
				}
				else break;
			case SqlDSLPackage.SENUM:
				if(context == grammarAccess.getSArtifactRule() ||
				   context == grammarAccess.getSEnumRule() ||
				   context == grammarAccess.getSExtDeclaredSQLTypeRule()) {
					sequence_SEnum(context, (SEnum) semanticObject); 
					return; 
				}
				else break;
			case SqlDSLPackage.SENUM_LITERAL:
				if(context == grammarAccess.getSEnumLiteralRule()) {
					sequence_SEnumLiteral(context, (SEnumLiteral) semanticObject); 
					return; 
				}
				else break;
			case SqlDSLPackage.SJOIN_PROPERTY:
				if(context == grammarAccess.getSEntityMemberRule() ||
				   context == grammarAccess.getSJoinPropertyRule()) {
					sequence_SJoinProperty(context, (SJoinProperty) semanticObject); 
					return; 
				}
				else break;
			case SqlDSLPackage.SMODEL:
				if(context == grammarAccess.getSModelRule()) {
					sequence_SModel(context, (SModel) semanticObject); 
					return; 
				}
				else break;
			case SqlDSLPackage.SPROPERTY:
				if(context == grammarAccess.getSEntityMemberRule() ||
				   context == grammarAccess.getSPropertyRule()) {
					sequence_SProperty(context, (SProperty) semanticObject); 
					return; 
				}
				else break;
			case SqlDSLPackage.SSETTINGS:
				if(context == grammarAccess.getSSettingsRule()) {
					sequence_SSettings(context, (SSettings) semanticObject); 
					return; 
				}
				else break;
			case SqlDSLPackage.SSTRING:
				if(context == grammarAccess.getSInlinedSQLTypeRule() ||
				   context == grammarAccess.getSStringRule()) {
					sequence_SString(context, (SString) semanticObject); 
					return; 
				}
				else break;
			case SqlDSLPackage.STABLE:
				if(context == grammarAccess.getSArtifactRule() ||
				   context == grammarAccess.getSTableRule()) {
					sequence_STable(context, (STable) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (nullable?='nullable'? aes?='AES'? index=SIndex?)
	 */
	protected void sequence_SColumnProps(EObject context, SColumnProps semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_SDecimal(EObject context, SDecimal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqlDSLPackage.Literals.SINLINED_SQL_TYPE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqlDSLPackage.Literals.SINLINED_SQL_TYPE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSDecimalAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=INT)
	 */
	protected void sequence_SEnumLiteral(EObject context, SEnumLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqlDSLPackage.Literals.SENUM_LITERAL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqlDSLPackage.Literals.SENUM_LITERAL__NAME));
			if(transientValues.isValueTransient(semanticObject, SqlDSLPackage.Literals.SENUM_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqlDSLPackage.Literals.SENUM_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSEnumLiteralAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSEnumLiteralAccess().getValueINTTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID literals+=SEnumLiteral*)
	 */
	protected void sequence_SEnum(EObject context, SEnum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=[STable|ID] props=SColumnProps?)
	 */
	protected void sequence_SJoinProperty(EObject context, SJoinProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (settings=SSettings? artifact+=SArtifact*)
	 */
	protected void sequence_SModel(EObject context, SModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (extType=[SExtDeclaredSQLType|ID] | inlinedType=SInlinedSQLType | simpleType=SSimpleTypes) props=SColumnProps?)
	 */
	protected void sequence_SProperty(EObject context, SProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (schema=ID? engine=SDBEngine?)
	 */
	protected void sequence_SSettings(EObject context, SSettings semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_SString(EObject context, SString semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SqlDSLPackage.Literals.SINLINED_SQL_TYPE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SqlDSLPackage.Literals.SINLINED_SQL_TYPE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSStringAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID settings=SSettings? prefix=ID? entityMembers+=SEntityMember*)
	 */
	protected void sequence_STable(EObject context, STable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

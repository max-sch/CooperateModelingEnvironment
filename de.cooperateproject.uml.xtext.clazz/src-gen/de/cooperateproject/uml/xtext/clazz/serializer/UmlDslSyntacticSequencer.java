/*
 * generated by Xtext
 */
package de.cooperateproject.uml.xtext.clazz.serializer;

import com.google.inject.Inject;
import de.cooperateproject.uml.xtext.clazz.services.UmlDslGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class UmlDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected UmlDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Attribute_FinalKeyword_1_q;
	protected AbstractElementAlias match_Attribute_StaticKeyword_0_q;
	protected AbstractElementAlias match_ClassDef_ClassKeyword_0_0_or_InterfaceKeyword_0_1;
	protected AbstractElementAlias match_Class_AbstractKeyword_0_q;
	protected AbstractElementAlias match_ConnectorCardinalitiy_VerticalLineKeyword_3_0_q;
	protected AbstractElementAlias match_ConnectorCardinalitiy___GreaterThanSignKeyword_4_2_1_or_LessThanSignKeyword_4_2_0__q;
	protected AbstractElementAlias match_ConnectorCardinalitiy___VerticalLineKeyword_4_0___GreaterThanSignKeyword_4_2_1_or_LessThanSignKeyword_4_2_0__q__q;
	protected AbstractElementAlias match_Methode_AbstractKeyword_0_q;
	protected AbstractElementAlias match_Methode_FinalKeyword_2_q;
	protected AbstractElementAlias match_Methode_StaticKeyword_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (UmlDslGrammarAccess) access;
		match_Attribute_FinalKeyword_1_q = new TokenAlias(false, true, grammarAccess.getAttributeAccess().getFinalKeyword_1());
		match_Attribute_StaticKeyword_0_q = new TokenAlias(false, true, grammarAccess.getAttributeAccess().getStaticKeyword_0());
		match_ClassDef_ClassKeyword_0_0_or_InterfaceKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getClassDefAccess().getClassKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getClassDefAccess().getInterfaceKeyword_0_1()));
		match_Class_AbstractKeyword_0_q = new TokenAlias(false, true, grammarAccess.getClassAccess().getAbstractKeyword_0());
		match_ConnectorCardinalitiy_VerticalLineKeyword_3_0_q = new TokenAlias(false, true, grammarAccess.getConnectorCardinalitiyAccess().getVerticalLineKeyword_3_0());
		match_ConnectorCardinalitiy___GreaterThanSignKeyword_4_2_1_or_LessThanSignKeyword_4_2_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getConnectorCardinalitiyAccess().getGreaterThanSignKeyword_4_2_1()), new TokenAlias(false, false, grammarAccess.getConnectorCardinalitiyAccess().getLessThanSignKeyword_4_2_0()));
		match_ConnectorCardinalitiy___VerticalLineKeyword_4_0___GreaterThanSignKeyword_4_2_1_or_LessThanSignKeyword_4_2_0__q__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getConnectorCardinalitiyAccess().getVerticalLineKeyword_4_0()), new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getConnectorCardinalitiyAccess().getGreaterThanSignKeyword_4_2_1()), new TokenAlias(false, false, grammarAccess.getConnectorCardinalitiyAccess().getLessThanSignKeyword_4_2_0())));
		match_Methode_AbstractKeyword_0_q = new TokenAlias(false, true, grammarAccess.getMethodeAccess().getAbstractKeyword_0());
		match_Methode_FinalKeyword_2_q = new TokenAlias(false, true, grammarAccess.getMethodeAccess().getFinalKeyword_2());
		match_Methode_StaticKeyword_1_q = new TokenAlias(false, true, grammarAccess.getMethodeAccess().getStaticKeyword_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Attribute_FinalKeyword_1_q.equals(syntax))
				emit_Attribute_FinalKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Attribute_StaticKeyword_0_q.equals(syntax))
				emit_Attribute_StaticKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClassDef_ClassKeyword_0_0_or_InterfaceKeyword_0_1.equals(syntax))
				emit_ClassDef_ClassKeyword_0_0_or_InterfaceKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Class_AbstractKeyword_0_q.equals(syntax))
				emit_Class_AbstractKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ConnectorCardinalitiy_VerticalLineKeyword_3_0_q.equals(syntax))
				emit_ConnectorCardinalitiy_VerticalLineKeyword_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ConnectorCardinalitiy___GreaterThanSignKeyword_4_2_1_or_LessThanSignKeyword_4_2_0__q.equals(syntax))
				emit_ConnectorCardinalitiy___GreaterThanSignKeyword_4_2_1_or_LessThanSignKeyword_4_2_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ConnectorCardinalitiy___VerticalLineKeyword_4_0___GreaterThanSignKeyword_4_2_1_or_LessThanSignKeyword_4_2_0__q__q.equals(syntax))
				emit_ConnectorCardinalitiy___VerticalLineKeyword_4_0___GreaterThanSignKeyword_4_2_1_or_LessThanSignKeyword_4_2_0__q__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Methode_AbstractKeyword_0_q.equals(syntax))
				emit_Methode_AbstractKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Methode_FinalKeyword_2_q.equals(syntax))
				emit_Methode_FinalKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Methode_StaticKeyword_1_q.equals(syntax))
				emit_Methode_StaticKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'final'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'static'? (ambiguity) name=ID
	 */
	protected void emit_Attribute_FinalKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'static'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'final'? name=ID
	 */
	protected void emit_Attribute_StaticKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'class' | 'interface'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '{' classes+=ClassName
	 */
	protected void emit_ClassDef_ClassKeyword_0_0_or_InterfaceKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'abstract'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) type=[ClassName|ID]
	 */
	protected void emit_Class_AbstractKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '|'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '[' (ambiguity) '|' right=ConnectorLabel
	 *     (rule start) '[' (ambiguity) ('|' ('<' | '>')?)? ']' (rule start)
	 *     left=Cardinality (ambiguity) '|' right=ConnectorLabel
	 *     left=Cardinality (ambiguity) ('|' ('<' | '>')?)? ']' (rule end)
	 */
	protected void emit_ConnectorCardinalitiy_VerticalLineKeyword_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('<' | '>')?
	 *
	 * This ambiguous syntax occurs at:
	 *     right=ConnectorLabel (ambiguity) ']' (rule end)
	 */
	protected void emit_ConnectorCardinalitiy___GreaterThanSignKeyword_4_2_1_or_LessThanSignKeyword_4_2_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('|' ('<' | '>')?)?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '[' '|'? (ambiguity) ']' (rule start)
	 *     left=Cardinality '|'? (ambiguity) ']' (rule end)
	 *     middle=Cardinality (ambiguity) ']' (rule end)
	 */
	protected void emit_ConnectorCardinalitiy___VerticalLineKeyword_4_0___GreaterThanSignKeyword_4_2_1_or_LessThanSignKeyword_4_2_0__q__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'abstract'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'static'? 'final'? name=ID
	 */
	protected void emit_Methode_AbstractKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'final'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'abstract'? 'static'? (ambiguity) name=ID
	 */
	protected void emit_Methode_FinalKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'static'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'abstract'? (ambiguity) 'final'? name=ID
	 */
	protected void emit_Methode_StaticKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}

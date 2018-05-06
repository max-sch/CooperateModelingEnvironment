/*
 * generated by Xtext 2.12.0
 */
package de.cooperateproject.modeling.textual.activity.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ActGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ActivityDiagramElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cooperateproject.modeling.textual.activity.Act.ActivityDiagram");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cActivityDiagramAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cStartActdKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTitleAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTitleSTRINGTerminalRuleCall_2_0 = (RuleCall)cTitleAssignment_2.eContents().get(0);
		private final Assignment cRootPackageAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cRootPackageRootPackageParserRuleCall_3_0 = (RuleCall)cRootPackageAssignment_3.eContents().get(0);
		private final Keyword cEndActdKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//ActivityDiagram:
		//	{ActivityDiagram}
		//	'@start-actd' title=STRING
		//	rootPackage=RootPackage
		//	'@end-actd';
		@Override public ParserRule getRule() { return rule; }
		
		//{ActivityDiagram} '@start-actd' title=STRING rootPackage=RootPackage '@end-actd'
		public Group getGroup() { return cGroup; }
		
		//{ActivityDiagram}
		public Action getActivityDiagramAction_0() { return cActivityDiagramAction_0; }
		
		//'@start-actd'
		public Keyword getStartActdKeyword_1() { return cStartActdKeyword_1; }
		
		//title=STRING
		public Assignment getTitleAssignment_2() { return cTitleAssignment_2; }
		
		//STRING
		public RuleCall getTitleSTRINGTerminalRuleCall_2_0() { return cTitleSTRINGTerminalRuleCall_2_0; }
		
		//rootPackage=RootPackage
		public Assignment getRootPackageAssignment_3() { return cRootPackageAssignment_3; }
		
		//RootPackage
		public RuleCall getRootPackageRootPackageParserRuleCall_3_0() { return cRootPackageRootPackageParserRuleCall_3_0; }
		
		//'@end-actd'
		public Keyword getEndActdKeyword_4() { return cEndActdKeyword_4; }
	}
	public class RootPackageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cooperateproject.modeling.textual.activity.Act.RootPackage");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cRootPackageAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cRootPackageKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cNameAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cNameFQNParserRuleCall_1_1_0 = (RuleCall)cNameAssignment_1_1.eContents().get(0);
		private final Assignment cActivityAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cActivityActivityParserRuleCall_2_0 = (RuleCall)cActivityAssignment_2.eContents().get(0);
		
		//RootPackage:
		//	{RootPackage} ('rootPackage' name=FQN)?
		//	activity=Activity;
		@Override public ParserRule getRule() { return rule; }
		
		//{RootPackage} ('rootPackage' name=FQN)? activity=Activity
		public Group getGroup() { return cGroup; }
		
		//{RootPackage}
		public Action getRootPackageAction_0() { return cRootPackageAction_0; }
		
		//('rootPackage' name=FQN)?
		public Group getGroup_1() { return cGroup_1; }
		
		//'rootPackage'
		public Keyword getRootPackageKeyword_1_0() { return cRootPackageKeyword_1_0; }
		
		//name=FQN
		public Assignment getNameAssignment_1_1() { return cNameAssignment_1_1; }
		
		//FQN
		public RuleCall getNameFQNParserRuleCall_1_1_0() { return cNameFQNParserRuleCall_1_1_0; }
		
		//activity=Activity
		public Assignment getActivityAssignment_2() { return cActivityAssignment_2; }
		
		//Activity
		public RuleCall getActivityActivityParserRuleCall_2_0() { return cActivityActivityParserRuleCall_2_0; }
	}
	public class ActivityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cooperateproject.modeling.textual.activity.Act.Activity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cActivityAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cActivityNameKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cNameAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_1_0 = (RuleCall)cNameAssignment_1_1.eContents().get(0);
		private final Assignment cChildrenAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cChildrenSwimlaneParserRuleCall_2_0 = (RuleCall)cChildrenAssignment_2.eContents().get(0);
		private final Assignment cNodesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNodesNodeParserRuleCall_3_0 = (RuleCall)cNodesAssignment_3.eContents().get(0);
		private final Assignment cRelationsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cRelationsFlowParserRuleCall_4_0 = (RuleCall)cRelationsAssignment_4.eContents().get(0);
		
		//Activity:
		//	{Activity} ('activityName' name=STRING)?
		//	children+=Swimlane*
		//	nodes+=Node*
		//	relations+=Flow*;
		@Override public ParserRule getRule() { return rule; }
		
		//{Activity} ('activityName' name=STRING)? children+=Swimlane* nodes+=Node* relations+=Flow*
		public Group getGroup() { return cGroup; }
		
		//{Activity}
		public Action getActivityAction_0() { return cActivityAction_0; }
		
		//('activityName' name=STRING)?
		public Group getGroup_1() { return cGroup_1; }
		
		//'activityName'
		public Keyword getActivityNameKeyword_1_0() { return cActivityNameKeyword_1_0; }
		
		//name=STRING
		public Assignment getNameAssignment_1_1() { return cNameAssignment_1_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_1_0() { return cNameSTRINGTerminalRuleCall_1_1_0; }
		
		//children+=Swimlane*
		public Assignment getChildrenAssignment_2() { return cChildrenAssignment_2; }
		
		//Swimlane
		public RuleCall getChildrenSwimlaneParserRuleCall_2_0() { return cChildrenSwimlaneParserRuleCall_2_0; }
		
		//nodes+=Node*
		public Assignment getNodesAssignment_3() { return cNodesAssignment_3; }
		
		//Node
		public RuleCall getNodesNodeParserRuleCall_3_0() { return cNodesNodeParserRuleCall_3_0; }
		
		//relations+=Flow*
		public Assignment getRelationsAssignment_4() { return cRelationsAssignment_4; }
		
		//Flow
		public RuleCall getRelationsFlowParserRuleCall_4_0() { return cRelationsFlowParserRuleCall_4_0; }
	}
	public class NodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cooperateproject.modeling.textual.activity.Act.Node");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cActionNodeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cControlNodeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Node:
		//	ActionNode | ControlNode;
		@Override public ParserRule getRule() { return rule; }
		
		//ActionNode | ControlNode
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ActionNode
		public RuleCall getActionNodeParserRuleCall_0() { return cActionNodeParserRuleCall_0; }
		
		//ControlNode
		public RuleCall getControlNodeParserRuleCall_1() { return cControlNodeParserRuleCall_1; }
	}
	public class ActionNodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cooperateproject.modeling.textual.activity.Act.ActionNode");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cActnKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_1_0_0 = (RuleCall)cNameAssignment_1_0.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Assignment cAliasAssignment_1_1_0 = (Assignment)cGroup_1_1.eContents().get(0);
		private final RuleCall cAliasIDTerminalRuleCall_1_1_0_0 = (RuleCall)cAliasAssignment_1_1_0.eContents().get(0);
		private final Keyword cAsKeyword_1_1_1 = (Keyword)cGroup_1_1.eContents().get(1);
		private final Assignment cNameAssignment_1_1_2 = (Assignment)cGroup_1_1.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_1_2_0 = (RuleCall)cNameAssignment_1_1_2.eContents().get(0);
		
		//ActionNode:
		//	'actn' (name=ID | alias=ID 'as' name=STRING);
		@Override public ParserRule getRule() { return rule; }
		
		//'actn' (name=ID | alias=ID 'as' name=STRING)
		public Group getGroup() { return cGroup; }
		
		//'actn'
		public Keyword getActnKeyword_0() { return cActnKeyword_0; }
		
		//name=ID | alias=ID 'as' name=STRING
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//name=ID
		public Assignment getNameAssignment_1_0() { return cNameAssignment_1_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0_0() { return cNameIDTerminalRuleCall_1_0_0; }
		
		//alias=ID 'as' name=STRING
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//alias=ID
		public Assignment getAliasAssignment_1_1_0() { return cAliasAssignment_1_1_0; }
		
		//ID
		public RuleCall getAliasIDTerminalRuleCall_1_1_0_0() { return cAliasIDTerminalRuleCall_1_1_0_0; }
		
		//'as'
		public Keyword getAsKeyword_1_1_1() { return cAsKeyword_1_1_1; }
		
		//name=STRING
		public Assignment getNameAssignment_1_1_2() { return cNameAssignment_1_1_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_1_2_0() { return cNameSTRINGTerminalRuleCall_1_1_2_0; }
	}
	public class ControlNodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cooperateproject.modeling.textual.activity.Act.ControlNode");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cInitialNodeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cFinalNodeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cFlowFinalNodeParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cDecisionNodeParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cMergeNodeParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cForkNodeParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cJoinNodeParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		
		//ControlNode:
		//	InitialNode | FinalNode | FlowFinalNode | DecisionNode | MergeNode | ForkNode | JoinNode;
		@Override public ParserRule getRule() { return rule; }
		
		//InitialNode | FinalNode | FlowFinalNode | DecisionNode | MergeNode | ForkNode | JoinNode
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//InitialNode
		public RuleCall getInitialNodeParserRuleCall_0() { return cInitialNodeParserRuleCall_0; }
		
		//FinalNode
		public RuleCall getFinalNodeParserRuleCall_1() { return cFinalNodeParserRuleCall_1; }
		
		//FlowFinalNode
		public RuleCall getFlowFinalNodeParserRuleCall_2() { return cFlowFinalNodeParserRuleCall_2; }
		
		//DecisionNode
		public RuleCall getDecisionNodeParserRuleCall_3() { return cDecisionNodeParserRuleCall_3; }
		
		//MergeNode
		public RuleCall getMergeNodeParserRuleCall_4() { return cMergeNodeParserRuleCall_4; }
		
		//ForkNode
		public RuleCall getForkNodeParserRuleCall_5() { return cForkNodeParserRuleCall_5; }
		
		//JoinNode
		public RuleCall getJoinNodeParserRuleCall_6() { return cJoinNodeParserRuleCall_6; }
	}
	public class InitialNodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cooperateproject.modeling.textual.activity.Act.InitialNode");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIniKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//InitialNode:
		//	'ini' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'ini' name=ID
		public Group getGroup() { return cGroup; }
		
		//'ini'
		public Keyword getIniKeyword_0() { return cIniKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class FinalNodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cooperateproject.modeling.textual.activity.Act.FinalNode");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFinKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//FinalNode:
		//	'fin' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'fin' name=ID
		public Group getGroup() { return cGroup; }
		
		//'fin'
		public Keyword getFinKeyword_0() { return cFinKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class FlowFinalNodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cooperateproject.modeling.textual.activity.Act.FlowFinalNode");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFfinKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//FlowFinalNode:
		//	'ffin' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'ffin' name=ID
		public Group getGroup() { return cGroup; }
		
		//'ffin'
		public Keyword getFfinKeyword_0() { return cFfinKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class DecisionNodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cooperateproject.modeling.textual.activity.Act.DecisionNode");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDecnKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//DecisionNode:
		//	'decn' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'decn' name=ID
		public Group getGroup() { return cGroup; }
		
		//'decn'
		public Keyword getDecnKeyword_0() { return cDecnKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class MergeNodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cooperateproject.modeling.textual.activity.Act.MergeNode");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMrgnKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//MergeNode:
		//	'mrgn' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'mrgn' name=ID
		public Group getGroup() { return cGroup; }
		
		//'mrgn'
		public Keyword getMrgnKeyword_0() { return cMrgnKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class ForkNodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cooperateproject.modeling.textual.activity.Act.ForkNode");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cForkKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//ForkNode:
		//	'fork' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'fork' name=ID
		public Group getGroup() { return cGroup; }
		
		//'fork'
		public Keyword getForkKeyword_0() { return cForkKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class JoinNodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cooperateproject.modeling.textual.activity.Act.JoinNode");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cJoinKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//JoinNode:
		//	'join' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'join' name=ID
		public Group getGroup() { return cGroup; }
		
		//'join'
		public Keyword getJoinKeyword_0() { return cJoinKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class FlowElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cooperateproject.modeling.textual.activity.Act.Flow");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFlwKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cRelatedElementsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cRelatedElementsNodeCrossReference_2_0 = (CrossReference)cRelatedElementsAssignment_2.eContents().get(0);
		private final RuleCall cRelatedElementsNodeFQNParserRuleCall_2_0_1 = (RuleCall)cRelatedElementsNodeCrossReference_2_0.eContents().get(1);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCommaKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cRelatedElementsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cRelatedElementsNodeCrossReference_3_1_0 = (CrossReference)cRelatedElementsAssignment_3_1.eContents().get(0);
		private final RuleCall cRelatedElementsNodeFQNParserRuleCall_3_1_0_1 = (RuleCall)cRelatedElementsNodeCrossReference_3_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cLeftSquareBracketKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cConditionAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cConditionSTRINGTerminalRuleCall_5_1_0 = (RuleCall)cConditionAssignment_5_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_5_2 = (Keyword)cGroup_5.eContents().get(2);
		
		//Flow:
		//	'flw' '(' relatedElements+=[Node|FQN] (',' relatedElements+=[Node|FQN])+ ')' ('[' condition=STRING ']')?;
		@Override public ParserRule getRule() { return rule; }
		
		//'flw' '(' relatedElements+=[Node|FQN] (',' relatedElements+=[Node|FQN])+ ')' ('[' condition=STRING ']')?
		public Group getGroup() { return cGroup; }
		
		//'flw'
		public Keyword getFlwKeyword_0() { return cFlwKeyword_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//relatedElements+=[Node|FQN]
		public Assignment getRelatedElementsAssignment_2() { return cRelatedElementsAssignment_2; }
		
		//[Node|FQN]
		public CrossReference getRelatedElementsNodeCrossReference_2_0() { return cRelatedElementsNodeCrossReference_2_0; }
		
		//FQN
		public RuleCall getRelatedElementsNodeFQNParserRuleCall_2_0_1() { return cRelatedElementsNodeFQNParserRuleCall_2_0_1; }
		
		//(',' relatedElements+=[Node|FQN])+
		public Group getGroup_3() { return cGroup_3; }
		
		//','
		public Keyword getCommaKeyword_3_0() { return cCommaKeyword_3_0; }
		
		//relatedElements+=[Node|FQN]
		public Assignment getRelatedElementsAssignment_3_1() { return cRelatedElementsAssignment_3_1; }
		
		//[Node|FQN]
		public CrossReference getRelatedElementsNodeCrossReference_3_1_0() { return cRelatedElementsNodeCrossReference_3_1_0; }
		
		//FQN
		public RuleCall getRelatedElementsNodeFQNParserRuleCall_3_1_0_1() { return cRelatedElementsNodeFQNParserRuleCall_3_1_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
		
		//('[' condition=STRING ']')?
		public Group getGroup_5() { return cGroup_5; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_5_0() { return cLeftSquareBracketKeyword_5_0; }
		
		//condition=STRING
		public Assignment getConditionAssignment_5_1() { return cConditionAssignment_5_1; }
		
		//STRING
		public RuleCall getConditionSTRINGTerminalRuleCall_5_1_0() { return cConditionSTRINGTerminalRuleCall_5_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_5_2() { return cRightSquareBracketKeyword_5_2; }
	}
	public class SwimlaneElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cooperateproject.modeling.textual.activity.Act.Swimlane");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSwlKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNodesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNodesNodeParserRuleCall_3_0 = (RuleCall)cNodesAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Swimlane:
		//	'swl' name=ID '{'
		//	nodes+=Node*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'swl' name=ID '{' nodes+=Node* '}'
		public Group getGroup() { return cGroup; }
		
		//'swl'
		public Keyword getSwlKeyword_0() { return cSwlKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//nodes+=Node*
		public Assignment getNodesAssignment_3() { return cNodesAssignment_3; }
		
		//Node
		public RuleCall getNodesNodeParserRuleCall_3_0() { return cNodesNodeParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class FQNElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cooperateproject.modeling.textual.activity.Act.FQN");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//FQN:
		//	ID ("." ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ("." ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//("." ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	
	
	private final ActivityDiagramElements pActivityDiagram;
	private final RootPackageElements pRootPackage;
	private final ActivityElements pActivity;
	private final NodeElements pNode;
	private final ActionNodeElements pActionNode;
	private final ControlNodeElements pControlNode;
	private final InitialNodeElements pInitialNode;
	private final FinalNodeElements pFinalNode;
	private final FlowFinalNodeElements pFlowFinalNode;
	private final DecisionNodeElements pDecisionNode;
	private final MergeNodeElements pMergeNode;
	private final ForkNodeElements pForkNode;
	private final JoinNodeElements pJoinNode;
	private final FlowElements pFlow;
	private final SwimlaneElements pSwimlane;
	private final FQNElements pFQN;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ActGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pActivityDiagram = new ActivityDiagramElements();
		this.pRootPackage = new RootPackageElements();
		this.pActivity = new ActivityElements();
		this.pNode = new NodeElements();
		this.pActionNode = new ActionNodeElements();
		this.pControlNode = new ControlNodeElements();
		this.pInitialNode = new InitialNodeElements();
		this.pFinalNode = new FinalNodeElements();
		this.pFlowFinalNode = new FlowFinalNodeElements();
		this.pDecisionNode = new DecisionNodeElements();
		this.pMergeNode = new MergeNodeElements();
		this.pForkNode = new ForkNodeElements();
		this.pJoinNode = new JoinNodeElements();
		this.pFlow = new FlowElements();
		this.pSwimlane = new SwimlaneElements();
		this.pFQN = new FQNElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("de.cooperateproject.modeling.textual.activity.Act".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//ActivityDiagram:
	//	{ActivityDiagram}
	//	'@start-actd' title=STRING
	//	rootPackage=RootPackage
	//	'@end-actd';
	public ActivityDiagramElements getActivityDiagramAccess() {
		return pActivityDiagram;
	}
	
	public ParserRule getActivityDiagramRule() {
		return getActivityDiagramAccess().getRule();
	}
	
	//RootPackage:
	//	{RootPackage} ('rootPackage' name=FQN)?
	//	activity=Activity;
	public RootPackageElements getRootPackageAccess() {
		return pRootPackage;
	}
	
	public ParserRule getRootPackageRule() {
		return getRootPackageAccess().getRule();
	}
	
	//Activity:
	//	{Activity} ('activityName' name=STRING)?
	//	children+=Swimlane*
	//	nodes+=Node*
	//	relations+=Flow*;
	public ActivityElements getActivityAccess() {
		return pActivity;
	}
	
	public ParserRule getActivityRule() {
		return getActivityAccess().getRule();
	}
	
	//Node:
	//	ActionNode | ControlNode;
	public NodeElements getNodeAccess() {
		return pNode;
	}
	
	public ParserRule getNodeRule() {
		return getNodeAccess().getRule();
	}
	
	//ActionNode:
	//	'actn' (name=ID | alias=ID 'as' name=STRING);
	public ActionNodeElements getActionNodeAccess() {
		return pActionNode;
	}
	
	public ParserRule getActionNodeRule() {
		return getActionNodeAccess().getRule();
	}
	
	//ControlNode:
	//	InitialNode | FinalNode | FlowFinalNode | DecisionNode | MergeNode | ForkNode | JoinNode;
	public ControlNodeElements getControlNodeAccess() {
		return pControlNode;
	}
	
	public ParserRule getControlNodeRule() {
		return getControlNodeAccess().getRule();
	}
	
	//InitialNode:
	//	'ini' name=ID;
	public InitialNodeElements getInitialNodeAccess() {
		return pInitialNode;
	}
	
	public ParserRule getInitialNodeRule() {
		return getInitialNodeAccess().getRule();
	}
	
	//FinalNode:
	//	'fin' name=ID;
	public FinalNodeElements getFinalNodeAccess() {
		return pFinalNode;
	}
	
	public ParserRule getFinalNodeRule() {
		return getFinalNodeAccess().getRule();
	}
	
	//FlowFinalNode:
	//	'ffin' name=ID;
	public FlowFinalNodeElements getFlowFinalNodeAccess() {
		return pFlowFinalNode;
	}
	
	public ParserRule getFlowFinalNodeRule() {
		return getFlowFinalNodeAccess().getRule();
	}
	
	//DecisionNode:
	//	'decn' name=ID;
	public DecisionNodeElements getDecisionNodeAccess() {
		return pDecisionNode;
	}
	
	public ParserRule getDecisionNodeRule() {
		return getDecisionNodeAccess().getRule();
	}
	
	//MergeNode:
	//	'mrgn' name=ID;
	public MergeNodeElements getMergeNodeAccess() {
		return pMergeNode;
	}
	
	public ParserRule getMergeNodeRule() {
		return getMergeNodeAccess().getRule();
	}
	
	//ForkNode:
	//	'fork' name=ID;
	public ForkNodeElements getForkNodeAccess() {
		return pForkNode;
	}
	
	public ParserRule getForkNodeRule() {
		return getForkNodeAccess().getRule();
	}
	
	//JoinNode:
	//	'join' name=ID;
	public JoinNodeElements getJoinNodeAccess() {
		return pJoinNode;
	}
	
	public ParserRule getJoinNodeRule() {
		return getJoinNodeAccess().getRule();
	}
	
	//Flow:
	//	'flw' '(' relatedElements+=[Node|FQN] (',' relatedElements+=[Node|FQN])+ ')' ('[' condition=STRING ']')?;
	public FlowElements getFlowAccess() {
		return pFlow;
	}
	
	public ParserRule getFlowRule() {
		return getFlowAccess().getRule();
	}
	
	//Swimlane:
	//	'swl' name=ID '{'
	//	nodes+=Node*
	//	'}';
	public SwimlaneElements getSwimlaneAccess() {
		return pSwimlane;
	}
	
	public ParserRule getSwimlaneRule() {
		return getSwimlaneAccess().getRule();
	}
	
	//FQN:
	//	ID ("." ID)*;
	public FQNElements getFQNAccess() {
		return pFQN;
	}
	
	public ParserRule getFQNRule() {
		return getFQNAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}

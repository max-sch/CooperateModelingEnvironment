/*
 * generated by Xtext 2.12.0
 */
package de.cooperateproject.modeling.textual.activity.ide.contentassist.antlr;

import com.google.inject.Inject;
import de.cooperateproject.modeling.textual.activity.ide.contentassist.antlr.internal.InternalActParser;
import de.cooperateproject.modeling.textual.activity.services.ActGrammarAccess;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class ActParser extends AbstractContentAssistParser {

	@Inject
	private ActGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalActParser createParser() {
		InternalActParser result = new InternalActParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getNodeAccess().getAlternatives(), "rule__Node__Alternatives");
					put(grammarAccess.getActivityNodeAccess().getAlternatives_1(), "rule__ActivityNode__Alternatives_1");
					put(grammarAccess.getNodeTypeAccess().getAlternatives(), "rule__NodeType__Alternatives");
					put(grammarAccess.getActivityDiagramAccess().getGroup(), "rule__ActivityDiagram__Group__0");
					put(grammarAccess.getActivityDiagramAccess().getGroup_4(), "rule__ActivityDiagram__Group_4__0");
					put(grammarAccess.getRootPackageAccess().getGroup(), "rule__RootPackage__Group__0");
					put(grammarAccess.getRootPackageAccess().getGroup_1(), "rule__RootPackage__Group_1__0");
					put(grammarAccess.getActivityNodeAccess().getGroup(), "rule__ActivityNode__Group__0");
					put(grammarAccess.getActivityNodeAccess().getGroup_1_1(), "rule__ActivityNode__Group_1_1__0");
					put(grammarAccess.getControlNodeAccess().getGroup(), "rule__ControlNode__Group__0");
					put(grammarAccess.getFlowAccess().getGroup(), "rule__Flow__Group__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getActivityDiagramAccess().getTitleAssignment_2(), "rule__ActivityDiagram__TitleAssignment_2");
					put(grammarAccess.getActivityDiagramAccess().getRootPackageAssignment_3(), "rule__ActivityDiagram__RootPackageAssignment_3");
					put(grammarAccess.getActivityDiagramAccess().getActivityNameAssignment_4_1(), "rule__ActivityDiagram__ActivityNameAssignment_4_1");
					put(grammarAccess.getRootPackageAccess().getNameAssignment_1_1(), "rule__RootPackage__NameAssignment_1_1");
					put(grammarAccess.getRootPackageAccess().getNodesAssignment_2(), "rule__RootPackage__NodesAssignment_2");
					put(grammarAccess.getRootPackageAccess().getRelationsAssignment_3(), "rule__RootPackage__RelationsAssignment_3");
					put(grammarAccess.getActivityNodeAccess().getNameAssignment_1_0(), "rule__ActivityNode__NameAssignment_1_0");
					put(grammarAccess.getActivityNodeAccess().getNameAssignment_1_1_0(), "rule__ActivityNode__NameAssignment_1_1_0");
					put(grammarAccess.getActivityNodeAccess().getAliasAssignment_1_1_2(), "rule__ActivityNode__AliasAssignment_1_1_2");
					put(grammarAccess.getControlNodeAccess().getTypeAssignment_0(), "rule__ControlNode__TypeAssignment_0");
					put(grammarAccess.getControlNodeAccess().getNameAssignment_1(), "rule__ControlNode__NameAssignment_1");
					put(grammarAccess.getFlowAccess().getRelatedElementsAssignment_2(), "rule__Flow__RelatedElementsAssignment_2");
					put(grammarAccess.getFlowAccess().getRelatedElementsAssignment_4(), "rule__Flow__RelatedElementsAssignment_4");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ActGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ActGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

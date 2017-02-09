/*
 * generated by Xtext 2.10.0
 */
package de.cooperateproject.modeling.textual.usecase.ide.contentassist.antlr;

import com.google.inject.Inject;
import de.cooperateproject.modeling.textual.usecase.ide.contentassist.antlr.internal.InternalUsecaseParser;
import de.cooperateproject.modeling.textual.usecase.services.UsecaseGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class UsecaseParser extends AbstractContentAssistParser {

	@Inject
	private UsecaseGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalUsecaseParser createParser() {
		InternalUsecaseParser result = new InternalUsecaseParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getActorAccess().getAlternatives_3(), "rule__Actor__Alternatives_3");
					put(grammarAccess.getUseCaseAccess().getAlternatives_3(), "rule__UseCase__Alternatives_3");
					put(grammarAccess.getExtensionPointAccess().getAlternatives_1(), "rule__ExtensionPoint__Alternatives_1");
					put(grammarAccess.getRelationshipAccess().getAlternatives(), "rule__Relationship__Alternatives");
					put(grammarAccess.getCardinalityBoundAccess().getAlternatives(), "rule__CardinalityBound__Alternatives");
					put(grammarAccess.getVisibilityAccess().getAlternatives(), "rule__Visibility__Alternatives");
					put(grammarAccess.getActorTypeAccess().getAlternatives(), "rule__ActorType__Alternatives");
					put(grammarAccess.getUseCaseDiagramAccess().getGroup(), "rule__UseCaseDiagram__Group__0");
					put(grammarAccess.getRootPackageAccess().getGroup(), "rule__RootPackage__Group__0");
					put(grammarAccess.getActorAccess().getGroup(), "rule__Actor__Group__0");
					put(grammarAccess.getActorAccess().getGroup_3_1(), "rule__Actor__Group_3_1__0");
					put(grammarAccess.getActorAccess().getGroup_4(), "rule__Actor__Group_4__0");
					put(grammarAccess.getSystemAccess().getGroup(), "rule__System__Group__0");
					put(grammarAccess.getUseCaseAccess().getGroup(), "rule__UseCase__Group__0");
					put(grammarAccess.getUseCaseAccess().getGroup_3_1(), "rule__UseCase__Group_3_1__0");
					put(grammarAccess.getUseCaseAccess().getGroup_4(), "rule__UseCase__Group_4__0");
					put(grammarAccess.getExtensionPointAccess().getGroup(), "rule__ExtensionPoint__Group__0");
					put(grammarAccess.getExtensionPointAccess().getGroup_1_1(), "rule__ExtensionPoint__Group_1_1__0");
					put(grammarAccess.getAssociationAccess().getGroup(), "rule__Association__Group__0");
					put(grammarAccess.getAssociationAccess().getGroup_3(), "rule__Association__Group_3__0");
					put(grammarAccess.getGeneralizationAccess().getGroup(), "rule__Generalization__Group__0");
					put(grammarAccess.getIncludeAccess().getGroup(), "rule__Include__Group__0");
					put(grammarAccess.getExtendAccess().getGroup(), "rule__Extend__Group__0");
					put(grammarAccess.getExtendAccess().getGroup_5(), "rule__Extend__Group_5__0");
					put(grammarAccess.getCommentAccess().getGroup(), "rule__Comment__Group__0");
					put(grammarAccess.getCardinalityAccess().getGroup(), "rule__Cardinality__Group__0");
					put(grammarAccess.getCardinalityAccess().getGroup_1(), "rule__Cardinality__Group_1__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getUseCaseDiagramAccess().getTitleAssignment_1(), "rule__UseCaseDiagram__TitleAssignment_1");
					put(grammarAccess.getUseCaseDiagramAccess().getRootPackageAssignment_2(), "rule__UseCaseDiagram__RootPackageAssignment_2");
					put(grammarAccess.getRootPackageAccess().getNameAssignment_1(), "rule__RootPackage__NameAssignment_1");
					put(grammarAccess.getRootPackageAccess().getActorsAssignment_2(), "rule__RootPackage__ActorsAssignment_2");
					put(grammarAccess.getRootPackageAccess().getSystemsAssignment_3(), "rule__RootPackage__SystemsAssignment_3");
					put(grammarAccess.getRootPackageAccess().getRelationshipsAssignment_4(), "rule__RootPackage__RelationshipsAssignment_4");
					put(grammarAccess.getActorAccess().getVisibilityAssignment_0(), "rule__Actor__VisibilityAssignment_0");
					put(grammarAccess.getActorAccess().getAbstractAssignment_1(), "rule__Actor__AbstractAssignment_1");
					put(grammarAccess.getActorAccess().getNameAssignment_3_0(), "rule__Actor__NameAssignment_3_0");
					put(grammarAccess.getActorAccess().getNameAssignment_3_1_0(), "rule__Actor__NameAssignment_3_1_0");
					put(grammarAccess.getActorAccess().getAliasAssignment_3_1_2(), "rule__Actor__AliasAssignment_3_1_2");
					put(grammarAccess.getActorAccess().getTypeAssignment_4_1(), "rule__Actor__TypeAssignment_4_1");
					put(grammarAccess.getSystemAccess().getNameAssignment_1(), "rule__System__NameAssignment_1");
					put(grammarAccess.getSystemAccess().getUsecasesAssignment_3(), "rule__System__UsecasesAssignment_3");
					put(grammarAccess.getUseCaseAccess().getVisibilityAssignment_0(), "rule__UseCase__VisibilityAssignment_0");
					put(grammarAccess.getUseCaseAccess().getAbstractAssignment_1(), "rule__UseCase__AbstractAssignment_1");
					put(grammarAccess.getUseCaseAccess().getNameAssignment_3_0(), "rule__UseCase__NameAssignment_3_0");
					put(grammarAccess.getUseCaseAccess().getNameAssignment_3_1_0(), "rule__UseCase__NameAssignment_3_1_0");
					put(grammarAccess.getUseCaseAccess().getAliasAssignment_3_1_2(), "rule__UseCase__AliasAssignment_3_1_2");
					put(grammarAccess.getUseCaseAccess().getExtensionPointsAssignment_4_1(), "rule__UseCase__ExtensionPointsAssignment_4_1");
					put(grammarAccess.getExtensionPointAccess().getNameAssignment_1_0(), "rule__ExtensionPoint__NameAssignment_1_0");
					put(grammarAccess.getExtensionPointAccess().getNameAssignment_1_1_0(), "rule__ExtensionPoint__NameAssignment_1_1_0");
					put(grammarAccess.getExtensionPointAccess().getAliasAssignment_1_1_2(), "rule__ExtensionPoint__AliasAssignment_1_1_2");
					put(grammarAccess.getAssociationAccess().getActorAssignment_0(), "rule__Association__ActorAssignment_0");
					put(grammarAccess.getAssociationAccess().getUsecaseAssignment_2(), "rule__Association__UsecaseAssignment_2");
					put(grammarAccess.getAssociationAccess().getLeftCardinalityAssignment_3_1(), "rule__Association__LeftCardinalityAssignment_3_1");
					put(grammarAccess.getAssociationAccess().getRightCardinalityAssignment_3_3(), "rule__Association__RightCardinalityAssignment_3_3");
					put(grammarAccess.getGeneralizationAccess().getSpecificAssignment_0(), "rule__Generalization__SpecificAssignment_0");
					put(grammarAccess.getGeneralizationAccess().getGeneralAssignment_2(), "rule__Generalization__GeneralAssignment_2");
					put(grammarAccess.getIncludeAccess().getIncludingCaseAssignment_0(), "rule__Include__IncludingCaseAssignment_0");
					put(grammarAccess.getIncludeAccess().getAdditionAssignment_2(), "rule__Include__AdditionAssignment_2");
					put(grammarAccess.getExtendAccess().getExtensionAssignment_0(), "rule__Extend__ExtensionAssignment_0");
					put(grammarAccess.getExtendAccess().getExtendedCaseAssignment_2(), "rule__Extend__ExtendedCaseAssignment_2");
					put(grammarAccess.getExtendAccess().getExtensionLocationAssignment_4(), "rule__Extend__ExtensionLocationAssignment_4");
					put(grammarAccess.getExtendAccess().getConditionAssignment_5_1(), "rule__Extend__ConditionAssignment_5_1");
					put(grammarAccess.getCommentAccess().getCommentedElementAssignment_0(), "rule__Comment__CommentedElementAssignment_0");
					put(grammarAccess.getCommentAccess().getCommentAssignment_2(), "rule__Comment__CommentAssignment_2");
					put(grammarAccess.getCardinalityAccess().getLowerBoundAssignment_0(), "rule__Cardinality__LowerBoundAssignment_0");
					put(grammarAccess.getCardinalityAccess().getUpperBoundAssignment_1_1(), "rule__Cardinality__UpperBoundAssignment_1_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalUsecaseParser typedParser = (InternalUsecaseParser) parser;
			typedParser.entryRuleUseCaseDiagram();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public UsecaseGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(UsecaseGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

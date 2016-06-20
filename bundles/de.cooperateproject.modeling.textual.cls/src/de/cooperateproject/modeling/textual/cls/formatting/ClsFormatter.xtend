/*
 * generated by Xtext
 */
package de.cooperateproject.modeling.textual.cls.formatting
//import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter
import org.eclipse.xtext.formatting.impl.FormattingConfig

// import com.google.inject.Inject;
import de.cooperateproject.modeling.textual.cls.services.ClsGrammarAccess
//import com.google.inject.Inject
//import org.eclipse.xtext.RuleCall

/**
 * This class contains custom formatting declarations.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#formatting
 * on how and when to use it.
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
class ClsFormatter extends AbstractDeclarativeFormatter {

	//@Inject extension ClsGrammarAccess grammar
	override protected void configureFormatting(FormattingConfig c) {
		val access = grammarAccess as ClsGrammarAccess
		//val allKeywords = GrammarUtil.getAllKeywords(grammar.grammar)
		//val allRules = GrammarUtil.getAllAlternatives(grammar.grammar)
		//val alt = access.connectorAccess
		//val alt2 = access.connectorAccess.alternatives.elements
		//val f = access.connectorAccess.rule
		/*c.setLinewrap.before(access.connectorRule)*/
		/*for (alt : access.connectorAccess.alternatives.elements) {
			val rule = (alt as RuleCall).rule
			c.setLinewrap.before(rule)
		}*/
		/*c.setLinewrap.before(access.generalizationRule.)
		c.setLinewrap.before(access.associationRule)
		c.setLinewrap.before(access.implementationRule)
		c.setLinewrap.before(access.commentRule)*/
		// c.setLinewrap.between(access.connectorRule, access.connectorRule)
		
		c.setLinewrap.around(access.connectorRule)
		
		c.setLinewrap.after(access.classifierRule)
		c.setLinewrap.after(access.memberRule)
		
		c.setLinewrap(1, 2, 2).after(access.findKeywords("@startclass").get(0))
		c.setLinewrap.before(access.findKeywords("@endclass").get(0))
		
		c.setLinewrap.after(access.packageImportRule)
		c.setLinewrap.around(access.packageImportRule)

		// set no space around all parentheses
		for (p : access.findKeywordPairs("(", ")")) {
			c.setNoSpace().around(p.getFirst());
			c.setNoSpace().before(p.getSecond());
		}

		// set indentation inside all curly brackets 
		// set line wrap after each left curly bracket
		// set line wrap around each right curly bracket
		for (p : access.findKeywordPairs("{", "}")) {
			c.setIndentationIncrement().after(p.getFirst());
			c.setIndentationDecrement().before(p.getSecond());
			c.setLinewrap().after(p.getFirst());
			c.setLinewrap().around(p.getSecond());
		}

		// set no space before all commas
		for (comma : access.findKeywords(",")) {
			c.setNoSpace().before(comma);
		}

	}
}

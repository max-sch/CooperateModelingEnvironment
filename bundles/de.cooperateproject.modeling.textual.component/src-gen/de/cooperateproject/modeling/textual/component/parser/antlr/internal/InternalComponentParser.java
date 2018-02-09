package de.cooperateproject.modeling.textual.component.parser.antlr.internal;

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
import de.cooperateproject.modeling.textual.component.services.ComponentGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalComponentParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@start-cpd'", "'@end-cpd'", "'rootPackage'", "'component'", "'as'", "'{'", "'}'", "'class'", "'isa'", "'('", "','", "')'", "'note'", "'port'", "'realizes'", "'~'", "'conjugated'", "'interface'", "'con'", "'.'", "'provide'", "'require'", "'abstract'", "'static'", "':'", "'+'", "'public'", "'-'", "'private'", "'#'", "'protected'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalComponentParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalComponentParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalComponentParser.tokenNames; }
    public String getGrammarFileName() { return "InternalComponent.g"; }



     	private ComponentGrammarAccess grammarAccess;

        public InternalComponentParser(TokenStream input, ComponentGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ComponentDiagram";
       	}

       	@Override
       	protected ComponentGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleComponentDiagram"
    // InternalComponent.g:65:1: entryRuleComponentDiagram returns [EObject current=null] : iv_ruleComponentDiagram= ruleComponentDiagram EOF ;
    public final EObject entryRuleComponentDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentDiagram = null;


        try {
            // InternalComponent.g:65:57: (iv_ruleComponentDiagram= ruleComponentDiagram EOF )
            // InternalComponent.g:66:2: iv_ruleComponentDiagram= ruleComponentDiagram EOF
            {
             newCompositeNode(grammarAccess.getComponentDiagramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentDiagram=ruleComponentDiagram();

            state._fsp--;

             current =iv_ruleComponentDiagram; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComponentDiagram"


    // $ANTLR start "ruleComponentDiagram"
    // InternalComponent.g:72:1: ruleComponentDiagram returns [EObject current=null] : ( () otherlv_1= '@start-cpd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootpackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-cpd' ) ;
    public final EObject ruleComponentDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_title_2_0=null;
        Token otherlv_4=null;
        EObject lv_rootpackage_3_0 = null;



        	enterRule();

        try {
            // InternalComponent.g:78:2: ( ( () otherlv_1= '@start-cpd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootpackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-cpd' ) )
            // InternalComponent.g:79:2: ( () otherlv_1= '@start-cpd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootpackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-cpd' )
            {
            // InternalComponent.g:79:2: ( () otherlv_1= '@start-cpd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootpackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-cpd' )
            // InternalComponent.g:80:3: () otherlv_1= '@start-cpd' ( (lv_title_2_0= RULE_STRING ) ) ( (lv_rootpackage_3_0= ruleRootPackage ) ) otherlv_4= '@end-cpd'
            {
            // InternalComponent.g:80:3: ()
            // InternalComponent.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentDiagramAccess().getComponentDiagramAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentDiagramAccess().getStartCpdKeyword_1());
            		
            // InternalComponent.g:91:3: ( (lv_title_2_0= RULE_STRING ) )
            // InternalComponent.g:92:4: (lv_title_2_0= RULE_STRING )
            {
            // InternalComponent.g:92:4: (lv_title_2_0= RULE_STRING )
            // InternalComponent.g:93:5: lv_title_2_0= RULE_STRING
            {
            lv_title_2_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_title_2_0, grammarAccess.getComponentDiagramAccess().getTitleSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentDiagramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalComponent.g:109:3: ( (lv_rootpackage_3_0= ruleRootPackage ) )
            // InternalComponent.g:110:4: (lv_rootpackage_3_0= ruleRootPackage )
            {
            // InternalComponent.g:110:4: (lv_rootpackage_3_0= ruleRootPackage )
            // InternalComponent.g:111:5: lv_rootpackage_3_0= ruleRootPackage
            {

            					newCompositeNode(grammarAccess.getComponentDiagramAccess().getRootpackageRootPackageParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_rootpackage_3_0=ruleRootPackage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentDiagramRule());
            					}
            					set(
            						current,
            						"rootpackage",
            						lv_rootpackage_3_0,
            						"de.cooperateproject.modeling.textual.component.Component.RootPackage");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getComponentDiagramAccess().getEndCpdKeyword_4());
            		

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
    // $ANTLR end "ruleComponentDiagram"


    // $ANTLR start "entryRuleClassifierRelation"
    // InternalComponent.g:136:1: entryRuleClassifierRelation returns [EObject current=null] : iv_ruleClassifierRelation= ruleClassifierRelation EOF ;
    public final EObject entryRuleClassifierRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierRelation = null;


        try {
            // InternalComponent.g:136:59: (iv_ruleClassifierRelation= ruleClassifierRelation EOF )
            // InternalComponent.g:137:2: iv_ruleClassifierRelation= ruleClassifierRelation EOF
            {
             newCompositeNode(grammarAccess.getClassifierRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassifierRelation=ruleClassifierRelation();

            state._fsp--;

             current =iv_ruleClassifierRelation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClassifierRelation"


    // $ANTLR start "ruleClassifierRelation"
    // InternalComponent.g:143:1: ruleClassifierRelation returns [EObject current=null] : this_Generalization_0= ruleGeneralization ;
    public final EObject ruleClassifierRelation() throws RecognitionException {
        EObject current = null;

        EObject this_Generalization_0 = null;



        	enterRule();

        try {
            // InternalComponent.g:149:2: (this_Generalization_0= ruleGeneralization )
            // InternalComponent.g:150:2: this_Generalization_0= ruleGeneralization
            {

            		newCompositeNode(grammarAccess.getClassifierRelationAccess().getGeneralizationParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Generalization_0=ruleGeneralization();

            state._fsp--;


            		current = this_Generalization_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleClassifierRelation"


    // $ANTLR start "entryRuleClassifier"
    // InternalComponent.g:161:1: entryRuleClassifier returns [EObject current=null] : iv_ruleClassifier= ruleClassifier EOF ;
    public final EObject entryRuleClassifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifier = null;


        try {
            // InternalComponent.g:161:51: (iv_ruleClassifier= ruleClassifier EOF )
            // InternalComponent.g:162:2: iv_ruleClassifier= ruleClassifier EOF
            {
             newCompositeNode(grammarAccess.getClassifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassifier=ruleClassifier();

            state._fsp--;

             current =iv_ruleClassifier; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClassifier"


    // $ANTLR start "ruleClassifier"
    // InternalComponent.g:168:1: ruleClassifier returns [EObject current=null] : (this_Interface_0= ruleInterface | this_Component_1= ruleComponent | this_Class_2= ruleClass ) ;
    public final EObject ruleClassifier() throws RecognitionException {
        EObject current = null;

        EObject this_Interface_0 = null;

        EObject this_Component_1 = null;

        EObject this_Class_2 = null;



        	enterRule();

        try {
            // InternalComponent.g:174:2: ( (this_Interface_0= ruleInterface | this_Component_1= ruleComponent | this_Class_2= ruleClass ) )
            // InternalComponent.g:175:2: (this_Interface_0= ruleInterface | this_Component_1= ruleComponent | this_Class_2= ruleClass )
            {
            // InternalComponent.g:175:2: (this_Interface_0= ruleInterface | this_Component_1= ruleComponent | this_Class_2= ruleClass )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt1=1;
                }
                break;
            case 14:
                {
                alt1=2;
                }
                break;
            case 18:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalComponent.g:176:3: this_Interface_0= ruleInterface
                    {

                    			newCompositeNode(grammarAccess.getClassifierAccess().getInterfaceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Interface_0=ruleInterface();

                    state._fsp--;


                    			current = this_Interface_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComponent.g:185:3: this_Component_1= ruleComponent
                    {

                    			newCompositeNode(grammarAccess.getClassifierAccess().getComponentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Component_1=ruleComponent();

                    state._fsp--;


                    			current = this_Component_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalComponent.g:194:3: this_Class_2= ruleClass
                    {

                    			newCompositeNode(grammarAccess.getClassifierAccess().getClassParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Class_2=ruleClass();

                    state._fsp--;


                    			current = this_Class_2;
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
    // $ANTLR end "ruleClassifier"


    // $ANTLR start "entryRuleInterfaceRelation"
    // InternalComponent.g:206:1: entryRuleInterfaceRelation returns [EObject current=null] : iv_ruleInterfaceRelation= ruleInterfaceRelation EOF ;
    public final EObject entryRuleInterfaceRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceRelation = null;


        try {
            // InternalComponent.g:206:58: (iv_ruleInterfaceRelation= ruleInterfaceRelation EOF )
            // InternalComponent.g:207:2: iv_ruleInterfaceRelation= ruleInterfaceRelation EOF
            {
             newCompositeNode(grammarAccess.getInterfaceRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterfaceRelation=ruleInterfaceRelation();

            state._fsp--;

             current =iv_ruleInterfaceRelation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInterfaceRelation"


    // $ANTLR start "ruleInterfaceRelation"
    // InternalComponent.g:213:1: ruleInterfaceRelation returns [EObject current=null] : (this_Provide_0= ruleProvide | this_Require_1= ruleRequire ) ;
    public final EObject ruleInterfaceRelation() throws RecognitionException {
        EObject current = null;

        EObject this_Provide_0 = null;

        EObject this_Require_1 = null;



        	enterRule();

        try {
            // InternalComponent.g:219:2: ( (this_Provide_0= ruleProvide | this_Require_1= ruleRequire ) )
            // InternalComponent.g:220:2: (this_Provide_0= ruleProvide | this_Require_1= ruleRequire )
            {
            // InternalComponent.g:220:2: (this_Provide_0= ruleProvide | this_Require_1= ruleRequire )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==31) ) {
                alt2=1;
            }
            else if ( (LA2_0==32) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalComponent.g:221:3: this_Provide_0= ruleProvide
                    {

                    			newCompositeNode(grammarAccess.getInterfaceRelationAccess().getProvideParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Provide_0=ruleProvide();

                    state._fsp--;


                    			current = this_Provide_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComponent.g:230:3: this_Require_1= ruleRequire
                    {

                    			newCompositeNode(grammarAccess.getInterfaceRelationAccess().getRequireParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Require_1=ruleRequire();

                    state._fsp--;


                    			current = this_Require_1;
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
    // $ANTLR end "ruleInterfaceRelation"


    // $ANTLR start "entryRuleMember"
    // InternalComponent.g:242:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalComponent.g:242:47: (iv_ruleMember= ruleMember EOF )
            // InternalComponent.g:243:2: iv_ruleMember= ruleMember EOF
            {
             newCompositeNode(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMember=ruleMember();

            state._fsp--;

             current =iv_ruleMember; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalComponent.g:249:1: ruleMember returns [EObject current=null] : (this_Method_0= ruleMethod | this_Attribute_1= ruleAttribute ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject this_Method_0 = null;

        EObject this_Attribute_1 = null;



        	enterRule();

        try {
            // InternalComponent.g:255:2: ( (this_Method_0= ruleMethod | this_Attribute_1= ruleAttribute ) )
            // InternalComponent.g:256:2: (this_Method_0= ruleMethod | this_Attribute_1= ruleAttribute )
            {
            // InternalComponent.g:256:2: (this_Method_0= ruleMethod | this_Attribute_1= ruleAttribute )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalComponent.g:257:3: this_Method_0= ruleMethod
                    {

                    			newCompositeNode(grammarAccess.getMemberAccess().getMethodParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Method_0=ruleMethod();

                    state._fsp--;


                    			current = this_Method_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComponent.g:266:3: this_Attribute_1= ruleAttribute
                    {

                    			newCompositeNode(grammarAccess.getMemberAccess().getAttributeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Attribute_1=ruleAttribute();

                    state._fsp--;


                    			current = this_Attribute_1;
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
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleRootPackage"
    // InternalComponent.g:278:1: entryRuleRootPackage returns [EObject current=null] : iv_ruleRootPackage= ruleRootPackage EOF ;
    public final EObject entryRuleRootPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootPackage = null;


        try {
            // InternalComponent.g:278:52: (iv_ruleRootPackage= ruleRootPackage EOF )
            // InternalComponent.g:279:2: iv_ruleRootPackage= ruleRootPackage EOF
            {
             newCompositeNode(grammarAccess.getRootPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRootPackage=ruleRootPackage();

            state._fsp--;

             current =iv_ruleRootPackage; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRootPackage"


    // $ANTLR start "ruleRootPackage"
    // InternalComponent.g:285:1: ruleRootPackage returns [EObject current=null] : ( () (otherlv_1= 'rootPackage' ( (lv_name_2_0= ruleFQN ) ) )? ( (lv_classifiers_3_0= ruleClassifier ) )* ( (lv_relations_4_0= ruleClassifierRelation ) )* ) ;
    public final EObject ruleRootPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_classifiers_3_0 = null;

        EObject lv_relations_4_0 = null;



        	enterRule();

        try {
            // InternalComponent.g:291:2: ( ( () (otherlv_1= 'rootPackage' ( (lv_name_2_0= ruleFQN ) ) )? ( (lv_classifiers_3_0= ruleClassifier ) )* ( (lv_relations_4_0= ruleClassifierRelation ) )* ) )
            // InternalComponent.g:292:2: ( () (otherlv_1= 'rootPackage' ( (lv_name_2_0= ruleFQN ) ) )? ( (lv_classifiers_3_0= ruleClassifier ) )* ( (lv_relations_4_0= ruleClassifierRelation ) )* )
            {
            // InternalComponent.g:292:2: ( () (otherlv_1= 'rootPackage' ( (lv_name_2_0= ruleFQN ) ) )? ( (lv_classifiers_3_0= ruleClassifier ) )* ( (lv_relations_4_0= ruleClassifierRelation ) )* )
            // InternalComponent.g:293:3: () (otherlv_1= 'rootPackage' ( (lv_name_2_0= ruleFQN ) ) )? ( (lv_classifiers_3_0= ruleClassifier ) )* ( (lv_relations_4_0= ruleClassifierRelation ) )*
            {
            // InternalComponent.g:293:3: ()
            // InternalComponent.g:294:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRootPackageAccess().getRootPackageAction_0(),
            					current);
            			

            }

            // InternalComponent.g:300:3: (otherlv_1= 'rootPackage' ( (lv_name_2_0= ruleFQN ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalComponent.g:301:4: otherlv_1= 'rootPackage' ( (lv_name_2_0= ruleFQN ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getRootPackageAccess().getRootPackageKeyword_1_0());
                    			
                    // InternalComponent.g:305:4: ( (lv_name_2_0= ruleFQN ) )
                    // InternalComponent.g:306:5: (lv_name_2_0= ruleFQN )
                    {
                    // InternalComponent.g:306:5: (lv_name_2_0= ruleFQN )
                    // InternalComponent.g:307:6: lv_name_2_0= ruleFQN
                    {

                    						newCompositeNode(grammarAccess.getRootPackageAccess().getNameFQNParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_name_2_0=ruleFQN();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRootPackageRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"de.cooperateproject.modeling.textual.component.Component.FQN");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponent.g:325:3: ( (lv_classifiers_3_0= ruleClassifier ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14||LA5_0==18||LA5_0==28) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalComponent.g:326:4: (lv_classifiers_3_0= ruleClassifier )
            	    {
            	    // InternalComponent.g:326:4: (lv_classifiers_3_0= ruleClassifier )
            	    // InternalComponent.g:327:5: lv_classifiers_3_0= ruleClassifier
            	    {

            	    					newCompositeNode(grammarAccess.getRootPackageAccess().getClassifiersClassifierParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_classifiers_3_0=ruleClassifier();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"classifiers",
            	    						lv_classifiers_3_0,
            	    						"de.cooperateproject.modeling.textual.component.Component.Classifier");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalComponent.g:344:3: ( (lv_relations_4_0= ruleClassifierRelation ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalComponent.g:345:4: (lv_relations_4_0= ruleClassifierRelation )
            	    {
            	    // InternalComponent.g:345:4: (lv_relations_4_0= ruleClassifierRelation )
            	    // InternalComponent.g:346:5: lv_relations_4_0= ruleClassifierRelation
            	    {

            	    					newCompositeNode(grammarAccess.getRootPackageAccess().getRelationsClassifierRelationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_relations_4_0=ruleClassifierRelation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"relations",
            	    						lv_relations_4_0,
            	    						"de.cooperateproject.modeling.textual.component.Component.ClassifierRelation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleRootPackage"


    // $ANTLR start "entryRuleComponent"
    // InternalComponent.g:367:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalComponent.g:367:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalComponent.g:368:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalComponent.g:374:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'component' ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) ) ) ( ( (lv_comments_5_0= ruleComment ) )? | (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_interfaceRelation_8_0= ruleInterfaceRelation ) )* ( (lv_port_9_0= rulePort ) )* ( (lv_attributes_10_0= ruleComponentTypeAttribute ) )* ( (lv_connectors_11_0= ruleConnector ) )* ( (lv_packagedElements_12_0= ruleClassifier ) )* otherlv_13= '}' ) ) ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_alias_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_6=null;
        Token otherlv_13=null;
        EObject lv_comments_5_0 = null;

        EObject lv_comments_7_0 = null;

        EObject lv_interfaceRelation_8_0 = null;

        EObject lv_port_9_0 = null;

        EObject lv_attributes_10_0 = null;

        EObject lv_connectors_11_0 = null;

        EObject lv_packagedElements_12_0 = null;



        	enterRule();

        try {
            // InternalComponent.g:380:2: ( (otherlv_0= 'component' ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) ) ) ( ( (lv_comments_5_0= ruleComment ) )? | (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_interfaceRelation_8_0= ruleInterfaceRelation ) )* ( (lv_port_9_0= rulePort ) )* ( (lv_attributes_10_0= ruleComponentTypeAttribute ) )* ( (lv_connectors_11_0= ruleConnector ) )* ( (lv_packagedElements_12_0= ruleClassifier ) )* otherlv_13= '}' ) ) ) )
            // InternalComponent.g:381:2: (otherlv_0= 'component' ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) ) ) ( ( (lv_comments_5_0= ruleComment ) )? | (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_interfaceRelation_8_0= ruleInterfaceRelation ) )* ( (lv_port_9_0= rulePort ) )* ( (lv_attributes_10_0= ruleComponentTypeAttribute ) )* ( (lv_connectors_11_0= ruleConnector ) )* ( (lv_packagedElements_12_0= ruleClassifier ) )* otherlv_13= '}' ) ) )
            {
            // InternalComponent.g:381:2: (otherlv_0= 'component' ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) ) ) ( ( (lv_comments_5_0= ruleComment ) )? | (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_interfaceRelation_8_0= ruleInterfaceRelation ) )* ( (lv_port_9_0= rulePort ) )* ( (lv_attributes_10_0= ruleComponentTypeAttribute ) )* ( (lv_connectors_11_0= ruleConnector ) )* ( (lv_packagedElements_12_0= ruleClassifier ) )* otherlv_13= '}' ) ) )
            // InternalComponent.g:382:3: otherlv_0= 'component' ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) ) ) ( ( (lv_comments_5_0= ruleComment ) )? | (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_interfaceRelation_8_0= ruleInterfaceRelation ) )* ( (lv_port_9_0= rulePort ) )* ( (lv_attributes_10_0= ruleComponentTypeAttribute ) )* ( (lv_connectors_11_0= ruleConnector ) )* ( (lv_packagedElements_12_0= ruleClassifier ) )* otherlv_13= '}' ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
            		
            // InternalComponent.g:386:3: ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==EOF||LA7_1==12||LA7_1==14||(LA7_1>=16 && LA7_1<=19)||LA7_1==23||LA7_1==28) ) {
                    alt7=1;
                }
                else if ( (LA7_1==15) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalComponent.g:387:4: ( (lv_name_1_0= RULE_ID ) )
                    {
                    // InternalComponent.g:387:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalComponent.g:388:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalComponent.g:388:5: (lv_name_1_0= RULE_ID )
                    // InternalComponent.g:389:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"de.cooperateproject.modeling.textual.component.Component.ID");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalComponent.g:406:4: ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) )
                    {
                    // InternalComponent.g:406:4: ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) )
                    // InternalComponent.g:407:5: ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) )
                    {
                    // InternalComponent.g:407:5: ( (lv_alias_2_0= RULE_ID ) )
                    // InternalComponent.g:408:6: (lv_alias_2_0= RULE_ID )
                    {
                    // InternalComponent.g:408:6: (lv_alias_2_0= RULE_ID )
                    // InternalComponent.g:409:7: lv_alias_2_0= RULE_ID
                    {
                    lv_alias_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    							newLeafNode(lv_alias_2_0, grammarAccess.getComponentAccess().getAliasIDTerminalRuleCall_1_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getComponentRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"alias",
                    								lv_alias_2_0,
                    								"de.cooperateproject.modeling.textual.component.Component.ID");
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,15,FOLLOW_3); 

                    					newLeafNode(otherlv_3, grammarAccess.getComponentAccess().getAsKeyword_1_1_1());
                    				
                    // InternalComponent.g:429:5: ( (lv_name_4_0= RULE_STRING ) )
                    // InternalComponent.g:430:6: (lv_name_4_0= RULE_STRING )
                    {
                    // InternalComponent.g:430:6: (lv_name_4_0= RULE_STRING )
                    // InternalComponent.g:431:7: lv_name_4_0= RULE_STRING
                    {
                    lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    							newLeafNode(lv_name_4_0, grammarAccess.getComponentAccess().getNameSTRINGTerminalRuleCall_1_1_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getComponentRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_4_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalComponent.g:449:3: ( ( (lv_comments_5_0= ruleComment ) )? | (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_interfaceRelation_8_0= ruleInterfaceRelation ) )* ( (lv_port_9_0= rulePort ) )* ( (lv_attributes_10_0= ruleComponentTypeAttribute ) )* ( (lv_connectors_11_0= ruleConnector ) )* ( (lv_packagedElements_12_0= ruleClassifier ) )* otherlv_13= '}' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==EOF||LA15_0==12||LA15_0==14||(LA15_0>=17 && LA15_0<=19)||LA15_0==23||LA15_0==28) ) {
                alt15=1;
            }
            else if ( (LA15_0==16) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalComponent.g:450:4: ( (lv_comments_5_0= ruleComment ) )?
                    {
                    // InternalComponent.g:450:4: ( (lv_comments_5_0= ruleComment ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==23) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalComponent.g:451:5: (lv_comments_5_0= ruleComment )
                            {
                            // InternalComponent.g:451:5: (lv_comments_5_0= ruleComment )
                            // InternalComponent.g:452:6: lv_comments_5_0= ruleComment
                            {

                            						newCompositeNode(grammarAccess.getComponentAccess().getCommentsCommentParserRuleCall_2_0_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_comments_5_0=ruleComment();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getComponentRule());
                            						}
                            						add(
                            							current,
                            							"comments",
                            							lv_comments_5_0,
                            							"de.cooperateproject.modeling.textual.component.Component.Comment");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalComponent.g:470:4: (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_interfaceRelation_8_0= ruleInterfaceRelation ) )* ( (lv_port_9_0= rulePort ) )* ( (lv_attributes_10_0= ruleComponentTypeAttribute ) )* ( (lv_connectors_11_0= ruleConnector ) )* ( (lv_packagedElements_12_0= ruleClassifier ) )* otherlv_13= '}' )
                    {
                    // InternalComponent.g:470:4: (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_interfaceRelation_8_0= ruleInterfaceRelation ) )* ( (lv_port_9_0= rulePort ) )* ( (lv_attributes_10_0= ruleComponentTypeAttribute ) )* ( (lv_connectors_11_0= ruleConnector ) )* ( (lv_packagedElements_12_0= ruleClassifier ) )* otherlv_13= '}' )
                    // InternalComponent.g:471:5: otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_interfaceRelation_8_0= ruleInterfaceRelation ) )* ( (lv_port_9_0= rulePort ) )* ( (lv_attributes_10_0= ruleComponentTypeAttribute ) )* ( (lv_connectors_11_0= ruleConnector ) )* ( (lv_packagedElements_12_0= ruleClassifier ) )* otherlv_13= '}'
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_11); 

                    					newLeafNode(otherlv_6, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2_1_0());
                    				
                    // InternalComponent.g:475:5: ( (lv_comments_7_0= ruleComment ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==23) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalComponent.g:476:6: (lv_comments_7_0= ruleComment )
                            {
                            // InternalComponent.g:476:6: (lv_comments_7_0= ruleComment )
                            // InternalComponent.g:477:7: lv_comments_7_0= ruleComment
                            {

                            							newCompositeNode(grammarAccess.getComponentAccess().getCommentsCommentParserRuleCall_2_1_1_0());
                            						
                            pushFollow(FOLLOW_12);
                            lv_comments_7_0=ruleComment();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getComponentRule());
                            							}
                            							add(
                            								current,
                            								"comments",
                            								lv_comments_7_0,
                            								"de.cooperateproject.modeling.textual.component.Component.Comment");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalComponent.g:494:5: ( (lv_interfaceRelation_8_0= ruleInterfaceRelation ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>=31 && LA10_0<=32)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalComponent.g:495:6: (lv_interfaceRelation_8_0= ruleInterfaceRelation )
                    	    {
                    	    // InternalComponent.g:495:6: (lv_interfaceRelation_8_0= ruleInterfaceRelation )
                    	    // InternalComponent.g:496:7: lv_interfaceRelation_8_0= ruleInterfaceRelation
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentAccess().getInterfaceRelationInterfaceRelationParserRuleCall_2_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_interfaceRelation_8_0=ruleInterfaceRelation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interfaceRelation",
                    	    								lv_interfaceRelation_8_0,
                    	    								"de.cooperateproject.modeling.textual.component.Component.InterfaceRelation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    // InternalComponent.g:513:5: ( (lv_port_9_0= rulePort ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==24||LA11_0==26||(LA11_0>=36 && LA11_0<=41)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalComponent.g:514:6: (lv_port_9_0= rulePort )
                    	    {
                    	    // InternalComponent.g:514:6: (lv_port_9_0= rulePort )
                    	    // InternalComponent.g:515:7: lv_port_9_0= rulePort
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentAccess().getPortPortParserRuleCall_2_1_3_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_port_9_0=rulePort();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"port",
                    	    								lv_port_9_0,
                    	    								"de.cooperateproject.modeling.textual.component.Component.Port");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    // InternalComponent.g:532:5: ( (lv_attributes_10_0= ruleComponentTypeAttribute ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ID) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalComponent.g:533:6: (lv_attributes_10_0= ruleComponentTypeAttribute )
                    	    {
                    	    // InternalComponent.g:533:6: (lv_attributes_10_0= ruleComponentTypeAttribute )
                    	    // InternalComponent.g:534:7: lv_attributes_10_0= ruleComponentTypeAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentAccess().getAttributesComponentTypeAttributeParserRuleCall_2_1_4_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_attributes_10_0=ruleComponentTypeAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_10_0,
                    	    								"de.cooperateproject.modeling.textual.component.Component.ComponentTypeAttribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    // InternalComponent.g:551:5: ( (lv_connectors_11_0= ruleConnector ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==29) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalComponent.g:552:6: (lv_connectors_11_0= ruleConnector )
                    	    {
                    	    // InternalComponent.g:552:6: (lv_connectors_11_0= ruleConnector )
                    	    // InternalComponent.g:553:7: lv_connectors_11_0= ruleConnector
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentAccess().getConnectorsConnectorParserRuleCall_2_1_5_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_connectors_11_0=ruleConnector();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"connectors",
                    	    								lv_connectors_11_0,
                    	    								"de.cooperateproject.modeling.textual.component.Component.Connector");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    // InternalComponent.g:570:5: ( (lv_packagedElements_12_0= ruleClassifier ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==14||LA14_0==18||LA14_0==28) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalComponent.g:571:6: (lv_packagedElements_12_0= ruleClassifier )
                    	    {
                    	    // InternalComponent.g:571:6: (lv_packagedElements_12_0= ruleClassifier )
                    	    // InternalComponent.g:572:7: lv_packagedElements_12_0= ruleClassifier
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentAccess().getPackagedElementsClassifierParserRuleCall_2_1_6_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_packagedElements_12_0=ruleClassifier();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"packagedElements",
                    	    								lv_packagedElements_12_0,
                    	    								"de.cooperateproject.modeling.textual.component.Component.Classifier");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(otherlv_13, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_2_1_7());
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleClass"
    // InternalComponent.g:599:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalComponent.g:599:46: (iv_ruleClass= ruleClass EOF )
            // InternalComponent.g:600:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalComponent.g:606:1: ruleClass returns [EObject current=null] : (otherlv_0= 'class' ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) ) ) ( ( (lv_comments_5_0= ruleComment ) )? | (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_interfaceRelation_8_0= ruleInterfaceRelation ) )* otherlv_9= '}' ) ) ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_alias_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_comments_5_0 = null;

        EObject lv_comments_7_0 = null;

        EObject lv_interfaceRelation_8_0 = null;



        	enterRule();

        try {
            // InternalComponent.g:612:2: ( (otherlv_0= 'class' ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) ) ) ( ( (lv_comments_5_0= ruleComment ) )? | (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_interfaceRelation_8_0= ruleInterfaceRelation ) )* otherlv_9= '}' ) ) ) )
            // InternalComponent.g:613:2: (otherlv_0= 'class' ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) ) ) ( ( (lv_comments_5_0= ruleComment ) )? | (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_interfaceRelation_8_0= ruleInterfaceRelation ) )* otherlv_9= '}' ) ) )
            {
            // InternalComponent.g:613:2: (otherlv_0= 'class' ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) ) ) ( ( (lv_comments_5_0= ruleComment ) )? | (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_interfaceRelation_8_0= ruleInterfaceRelation ) )* otherlv_9= '}' ) ) )
            // InternalComponent.g:614:3: otherlv_0= 'class' ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) ) ) ( ( (lv_comments_5_0= ruleComment ) )? | (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_interfaceRelation_8_0= ruleInterfaceRelation ) )* otherlv_9= '}' ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getClassAccess().getClassKeyword_0());
            		
            // InternalComponent.g:618:3: ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==15) ) {
                    alt16=2;
                }
                else if ( (LA16_1==EOF||LA16_1==12||LA16_1==14||(LA16_1>=16 && LA16_1<=19)||LA16_1==23||LA16_1==28) ) {
                    alt16=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalComponent.g:619:4: ( (lv_name_1_0= RULE_ID ) )
                    {
                    // InternalComponent.g:619:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalComponent.g:620:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalComponent.g:620:5: (lv_name_1_0= RULE_ID )
                    // InternalComponent.g:621:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"de.cooperateproject.modeling.textual.component.Component.ID");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalComponent.g:638:4: ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) )
                    {
                    // InternalComponent.g:638:4: ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) )
                    // InternalComponent.g:639:5: ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) )
                    {
                    // InternalComponent.g:639:5: ( (lv_alias_2_0= RULE_ID ) )
                    // InternalComponent.g:640:6: (lv_alias_2_0= RULE_ID )
                    {
                    // InternalComponent.g:640:6: (lv_alias_2_0= RULE_ID )
                    // InternalComponent.g:641:7: lv_alias_2_0= RULE_ID
                    {
                    lv_alias_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    							newLeafNode(lv_alias_2_0, grammarAccess.getClassAccess().getAliasIDTerminalRuleCall_1_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getClassRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"alias",
                    								lv_alias_2_0,
                    								"de.cooperateproject.modeling.textual.component.Component.ID");
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,15,FOLLOW_3); 

                    					newLeafNode(otherlv_3, grammarAccess.getClassAccess().getAsKeyword_1_1_1());
                    				
                    // InternalComponent.g:661:5: ( (lv_name_4_0= RULE_STRING ) )
                    // InternalComponent.g:662:6: (lv_name_4_0= RULE_STRING )
                    {
                    // InternalComponent.g:662:6: (lv_name_4_0= RULE_STRING )
                    // InternalComponent.g:663:7: lv_name_4_0= RULE_STRING
                    {
                    lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    							newLeafNode(lv_name_4_0, grammarAccess.getClassAccess().getNameSTRINGTerminalRuleCall_1_1_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getClassRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_4_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalComponent.g:681:3: ( ( (lv_comments_5_0= ruleComment ) )? | (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_interfaceRelation_8_0= ruleInterfaceRelation ) )* otherlv_9= '}' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==EOF||LA20_0==12||LA20_0==14||(LA20_0>=17 && LA20_0<=19)||LA20_0==23||LA20_0==28) ) {
                alt20=1;
            }
            else if ( (LA20_0==16) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalComponent.g:682:4: ( (lv_comments_5_0= ruleComment ) )?
                    {
                    // InternalComponent.g:682:4: ( (lv_comments_5_0= ruleComment ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==23) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalComponent.g:683:5: (lv_comments_5_0= ruleComment )
                            {
                            // InternalComponent.g:683:5: (lv_comments_5_0= ruleComment )
                            // InternalComponent.g:684:6: lv_comments_5_0= ruleComment
                            {

                            						newCompositeNode(grammarAccess.getClassAccess().getCommentsCommentParserRuleCall_2_0_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_comments_5_0=ruleComment();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getClassRule());
                            						}
                            						add(
                            							current,
                            							"comments",
                            							lv_comments_5_0,
                            							"de.cooperateproject.modeling.textual.component.Component.Comment");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalComponent.g:702:4: (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_interfaceRelation_8_0= ruleInterfaceRelation ) )* otherlv_9= '}' )
                    {
                    // InternalComponent.g:702:4: (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_interfaceRelation_8_0= ruleInterfaceRelation ) )* otherlv_9= '}' )
                    // InternalComponent.g:703:5: otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_interfaceRelation_8_0= ruleInterfaceRelation ) )* otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_17); 

                    					newLeafNode(otherlv_6, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_2_1_0());
                    				
                    // InternalComponent.g:707:5: ( (lv_comments_7_0= ruleComment ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==23) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalComponent.g:708:6: (lv_comments_7_0= ruleComment )
                            {
                            // InternalComponent.g:708:6: (lv_comments_7_0= ruleComment )
                            // InternalComponent.g:709:7: lv_comments_7_0= ruleComment
                            {

                            							newCompositeNode(grammarAccess.getClassAccess().getCommentsCommentParserRuleCall_2_1_1_0());
                            						
                            pushFollow(FOLLOW_18);
                            lv_comments_7_0=ruleComment();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getClassRule());
                            							}
                            							add(
                            								current,
                            								"comments",
                            								lv_comments_7_0,
                            								"de.cooperateproject.modeling.textual.component.Component.Comment");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalComponent.g:726:5: ( (lv_interfaceRelation_8_0= ruleInterfaceRelation ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0>=31 && LA19_0<=32)) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalComponent.g:727:6: (lv_interfaceRelation_8_0= ruleInterfaceRelation )
                    	    {
                    	    // InternalComponent.g:727:6: (lv_interfaceRelation_8_0= ruleInterfaceRelation )
                    	    // InternalComponent.g:728:7: lv_interfaceRelation_8_0= ruleInterfaceRelation
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassAccess().getInterfaceRelationInterfaceRelationParserRuleCall_2_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_interfaceRelation_8_0=ruleInterfaceRelation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interfaceRelation",
                    	    								lv_interfaceRelation_8_0,
                    	    								"de.cooperateproject.modeling.textual.component.Component.InterfaceRelation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(otherlv_9, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_2_1_3());
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleGeneralization"
    // InternalComponent.g:755:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // InternalComponent.g:755:55: (iv_ruleGeneralization= ruleGeneralization EOF )
            // InternalComponent.g:756:2: iv_ruleGeneralization= ruleGeneralization EOF
            {
             newCompositeNode(grammarAccess.getGeneralizationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneralization=ruleGeneralization();

            state._fsp--;

             current =iv_ruleGeneralization; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGeneralization"


    // $ANTLR start "ruleGeneralization"
    // InternalComponent.g:762:1: ruleGeneralization returns [EObject current=null] : (otherlv_0= 'isa' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ( (lv_comments_6_0= ruleComment ) )? ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_comments_6_0 = null;



        	enterRule();

        try {
            // InternalComponent.g:768:2: ( (otherlv_0= 'isa' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ( (lv_comments_6_0= ruleComment ) )? ) )
            // InternalComponent.g:769:2: (otherlv_0= 'isa' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ( (lv_comments_6_0= ruleComment ) )? )
            {
            // InternalComponent.g:769:2: (otherlv_0= 'isa' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ( (lv_comments_6_0= ruleComment ) )? )
            // InternalComponent.g:770:3: otherlv_0= 'isa' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ( (lv_comments_6_0= ruleComment ) )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getGeneralizationAccess().getIsaKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getGeneralizationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalComponent.g:778:3: ( (otherlv_2= RULE_ID ) )
            // InternalComponent.g:779:4: (otherlv_2= RULE_ID )
            {
            // InternalComponent.g:779:4: (otherlv_2= RULE_ID )
            // InternalComponent.g:780:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_2, grammarAccess.getGeneralizationAccess().getLeftClassifierInterfaceCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getGeneralizationAccess().getCommaKeyword_3());
            		
            // InternalComponent.g:795:3: ( (otherlv_4= RULE_ID ) )
            // InternalComponent.g:796:4: (otherlv_4= RULE_ID )
            {
            // InternalComponent.g:796:4: (otherlv_4= RULE_ID )
            // InternalComponent.g:797:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_4, grammarAccess.getGeneralizationAccess().getRightClassifierInterfaceCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getGeneralizationAccess().getRightParenthesisKeyword_5());
            		
            // InternalComponent.g:812:3: ( (lv_comments_6_0= ruleComment ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalComponent.g:813:4: (lv_comments_6_0= ruleComment )
                    {
                    // InternalComponent.g:813:4: (lv_comments_6_0= ruleComment )
                    // InternalComponent.g:814:5: lv_comments_6_0= ruleComment
                    {

                    					newCompositeNode(grammarAccess.getGeneralizationAccess().getCommentsCommentParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_comments_6_0=ruleComment();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getGeneralizationRule());
                    					}
                    					add(
                    						current,
                    						"comments",
                    						lv_comments_6_0,
                    						"de.cooperateproject.modeling.textual.component.Component.Comment");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleGeneralization"


    // $ANTLR start "entryRuleComment"
    // InternalComponent.g:835:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalComponent.g:835:48: (iv_ruleComment= ruleComment EOF )
            // InternalComponent.g:836:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // InternalComponent.g:842:1: ruleComment returns [EObject current=null] : (otherlv_0= 'note' ( (lv_body_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_body_1_0=null;


        	enterRule();

        try {
            // InternalComponent.g:848:2: ( (otherlv_0= 'note' ( (lv_body_1_0= RULE_STRING ) ) ) )
            // InternalComponent.g:849:2: (otherlv_0= 'note' ( (lv_body_1_0= RULE_STRING ) ) )
            {
            // InternalComponent.g:849:2: (otherlv_0= 'note' ( (lv_body_1_0= RULE_STRING ) ) )
            // InternalComponent.g:850:3: otherlv_0= 'note' ( (lv_body_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCommentAccess().getNoteKeyword_0());
            		
            // InternalComponent.g:854:3: ( (lv_body_1_0= RULE_STRING ) )
            // InternalComponent.g:855:4: (lv_body_1_0= RULE_STRING )
            {
            // InternalComponent.g:855:4: (lv_body_1_0= RULE_STRING )
            // InternalComponent.g:856:5: lv_body_1_0= RULE_STRING
            {
            lv_body_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_body_1_0, grammarAccess.getCommentAccess().getBodySTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"body",
            						lv_body_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRulePort"
    // InternalComponent.g:876:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalComponent.g:876:45: (iv_rulePort= rulePort EOF )
            // InternalComponent.g:877:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalComponent.g:883:1: rulePort returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'port' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'realizes' ( ( (lv_conjugated_4_1= '~' | lv_conjugated_4_2= 'conjugated' ) ) )? ( ( ruleFQN ) ) ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_conjugated_4_1=null;
        Token lv_conjugated_4_2=null;
        Enumerator lv_visibility_0_0 = null;



        	enterRule();

        try {
            // InternalComponent.g:889:2: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'port' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'realizes' ( ( (lv_conjugated_4_1= '~' | lv_conjugated_4_2= 'conjugated' ) ) )? ( ( ruleFQN ) ) ) )
            // InternalComponent.g:890:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'port' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'realizes' ( ( (lv_conjugated_4_1= '~' | lv_conjugated_4_2= 'conjugated' ) ) )? ( ( ruleFQN ) ) )
            {
            // InternalComponent.g:890:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'port' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'realizes' ( ( (lv_conjugated_4_1= '~' | lv_conjugated_4_2= 'conjugated' ) ) )? ( ( ruleFQN ) ) )
            // InternalComponent.g:891:3: ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'port' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'realizes' ( ( (lv_conjugated_4_1= '~' | lv_conjugated_4_2= 'conjugated' ) ) )? ( ( ruleFQN ) )
            {
            // InternalComponent.g:891:3: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==26||(LA22_0>=36 && LA22_0<=41)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalComponent.g:892:4: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalComponent.g:892:4: (lv_visibility_0_0= ruleVisibility )
                    // InternalComponent.g:893:5: lv_visibility_0_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getPortAccess().getVisibilityVisibilityEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_23);
                    lv_visibility_0_0=ruleVisibility();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPortRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_0_0,
                    						"de.cooperateproject.modeling.textual.component.Component.Visibility");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getPortAccess().getPortKeyword_1());
            		
            // InternalComponent.g:914:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalComponent.g:915:4: (lv_name_2_0= RULE_ID )
            {
            // InternalComponent.g:915:4: (lv_name_2_0= RULE_ID )
            // InternalComponent.g:916:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPortAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.cooperateproject.modeling.textual.component.Component.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getPortAccess().getRealizesKeyword_3());
            		
            // InternalComponent.g:936:3: ( ( (lv_conjugated_4_1= '~' | lv_conjugated_4_2= 'conjugated' ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=26 && LA24_0<=27)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalComponent.g:937:4: ( (lv_conjugated_4_1= '~' | lv_conjugated_4_2= 'conjugated' ) )
                    {
                    // InternalComponent.g:937:4: ( (lv_conjugated_4_1= '~' | lv_conjugated_4_2= 'conjugated' ) )
                    // InternalComponent.g:938:5: (lv_conjugated_4_1= '~' | lv_conjugated_4_2= 'conjugated' )
                    {
                    // InternalComponent.g:938:5: (lv_conjugated_4_1= '~' | lv_conjugated_4_2= 'conjugated' )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==26) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==27) ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalComponent.g:939:6: lv_conjugated_4_1= '~'
                            {
                            lv_conjugated_4_1=(Token)match(input,26,FOLLOW_6); 

                            						newLeafNode(lv_conjugated_4_1, grammarAccess.getPortAccess().getConjugatedTildeKeyword_4_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getPortRule());
                            						}
                            						setWithLastConsumed(current, "conjugated", true, null);
                            					

                            }
                            break;
                        case 2 :
                            // InternalComponent.g:950:6: lv_conjugated_4_2= 'conjugated'
                            {
                            lv_conjugated_4_2=(Token)match(input,27,FOLLOW_6); 

                            						newLeafNode(lv_conjugated_4_2, grammarAccess.getPortAccess().getConjugatedConjugatedKeyword_4_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getPortRule());
                            						}
                            						setWithLastConsumed(current, "conjugated", true, null);
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalComponent.g:963:3: ( ( ruleFQN ) )
            // InternalComponent.g:964:4: ( ruleFQN )
            {
            // InternalComponent.g:964:4: ( ruleFQN )
            // InternalComponent.g:965:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPortRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPortAccess().getRealizedClassifierClassifierCrossReference_5_0());
            				
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleInterface"
    // InternalComponent.g:983:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalComponent.g:983:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalComponent.g:984:2: iv_ruleInterface= ruleInterface EOF
            {
             newCompositeNode(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterface=ruleInterface();

            state._fsp--;

             current =iv_ruleInterface; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // InternalComponent.g:990:1: ruleInterface returns [EObject current=null] : (otherlv_0= 'interface' ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) ) ) ( ( (lv_comments_5_0= ruleComment ) )? | (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_members_8_0= ruleMember ) )* otherlv_9= '}' ) ) ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_alias_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_comments_5_0 = null;

        EObject lv_comments_7_0 = null;

        EObject lv_members_8_0 = null;



        	enterRule();

        try {
            // InternalComponent.g:996:2: ( (otherlv_0= 'interface' ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) ) ) ( ( (lv_comments_5_0= ruleComment ) )? | (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_members_8_0= ruleMember ) )* otherlv_9= '}' ) ) ) )
            // InternalComponent.g:997:2: (otherlv_0= 'interface' ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) ) ) ( ( (lv_comments_5_0= ruleComment ) )? | (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_members_8_0= ruleMember ) )* otherlv_9= '}' ) ) )
            {
            // InternalComponent.g:997:2: (otherlv_0= 'interface' ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) ) ) ( ( (lv_comments_5_0= ruleComment ) )? | (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_members_8_0= ruleMember ) )* otherlv_9= '}' ) ) )
            // InternalComponent.g:998:3: otherlv_0= 'interface' ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) ) ) ( ( (lv_comments_5_0= ruleComment ) )? | (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_members_8_0= ruleMember ) )* otherlv_9= '}' ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getInterfaceAccess().getInterfaceKeyword_0());
            		
            // InternalComponent.g:1002:3: ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==15) ) {
                    alt25=2;
                }
                else if ( (LA25_1==EOF||LA25_1==12||LA25_1==14||(LA25_1>=16 && LA25_1<=19)||LA25_1==23||LA25_1==28) ) {
                    alt25=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalComponent.g:1003:4: ( (lv_name_1_0= RULE_ID ) )
                    {
                    // InternalComponent.g:1003:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalComponent.g:1004:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalComponent.g:1004:5: (lv_name_1_0= RULE_ID )
                    // InternalComponent.g:1005:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInterfaceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"de.cooperateproject.modeling.textual.component.Component.ID");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalComponent.g:1022:4: ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) )
                    {
                    // InternalComponent.g:1022:4: ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) )
                    // InternalComponent.g:1023:5: ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) )
                    {
                    // InternalComponent.g:1023:5: ( (lv_alias_2_0= RULE_ID ) )
                    // InternalComponent.g:1024:6: (lv_alias_2_0= RULE_ID )
                    {
                    // InternalComponent.g:1024:6: (lv_alias_2_0= RULE_ID )
                    // InternalComponent.g:1025:7: lv_alias_2_0= RULE_ID
                    {
                    lv_alias_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    							newLeafNode(lv_alias_2_0, grammarAccess.getInterfaceAccess().getAliasIDTerminalRuleCall_1_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getInterfaceRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"alias",
                    								lv_alias_2_0,
                    								"de.cooperateproject.modeling.textual.component.Component.ID");
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,15,FOLLOW_3); 

                    					newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getAsKeyword_1_1_1());
                    				
                    // InternalComponent.g:1045:5: ( (lv_name_4_0= RULE_STRING ) )
                    // InternalComponent.g:1046:6: (lv_name_4_0= RULE_STRING )
                    {
                    // InternalComponent.g:1046:6: (lv_name_4_0= RULE_STRING )
                    // InternalComponent.g:1047:7: lv_name_4_0= RULE_STRING
                    {
                    lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    							newLeafNode(lv_name_4_0, grammarAccess.getInterfaceAccess().getNameSTRINGTerminalRuleCall_1_1_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getInterfaceRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_4_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalComponent.g:1065:3: ( ( (lv_comments_5_0= ruleComment ) )? | (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_members_8_0= ruleMember ) )* otherlv_9= '}' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==EOF||LA29_0==12||LA29_0==14||(LA29_0>=17 && LA29_0<=19)||LA29_0==23||LA29_0==28) ) {
                alt29=1;
            }
            else if ( (LA29_0==16) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalComponent.g:1066:4: ( (lv_comments_5_0= ruleComment ) )?
                    {
                    // InternalComponent.g:1066:4: ( (lv_comments_5_0= ruleComment ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==23) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalComponent.g:1067:5: (lv_comments_5_0= ruleComment )
                            {
                            // InternalComponent.g:1067:5: (lv_comments_5_0= ruleComment )
                            // InternalComponent.g:1068:6: lv_comments_5_0= ruleComment
                            {

                            						newCompositeNode(grammarAccess.getInterfaceAccess().getCommentsCommentParserRuleCall_2_0_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_comments_5_0=ruleComment();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getInterfaceRule());
                            						}
                            						add(
                            							current,
                            							"comments",
                            							lv_comments_5_0,
                            							"de.cooperateproject.modeling.textual.component.Component.Comment");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalComponent.g:1086:4: (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_members_8_0= ruleMember ) )* otherlv_9= '}' )
                    {
                    // InternalComponent.g:1086:4: (otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_members_8_0= ruleMember ) )* otherlv_9= '}' )
                    // InternalComponent.g:1087:5: otherlv_6= '{' ( (lv_comments_7_0= ruleComment ) )? ( (lv_members_8_0= ruleMember ) )* otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_26); 

                    					newLeafNode(otherlv_6, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_2_1_0());
                    				
                    // InternalComponent.g:1091:5: ( (lv_comments_7_0= ruleComment ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==23) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalComponent.g:1092:6: (lv_comments_7_0= ruleComment )
                            {
                            // InternalComponent.g:1092:6: (lv_comments_7_0= ruleComment )
                            // InternalComponent.g:1093:7: lv_comments_7_0= ruleComment
                            {

                            							newCompositeNode(grammarAccess.getInterfaceAccess().getCommentsCommentParserRuleCall_2_1_1_0());
                            						
                            pushFollow(FOLLOW_27);
                            lv_comments_7_0=ruleComment();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getInterfaceRule());
                            							}
                            							add(
                            								current,
                            								"comments",
                            								lv_comments_7_0,
                            								"de.cooperateproject.modeling.textual.component.Component.Comment");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalComponent.g:1110:5: ( (lv_members_8_0= ruleMember ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==RULE_ID||LA28_0==26||(LA28_0>=33 && LA28_0<=34)||(LA28_0>=36 && LA28_0<=41)) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalComponent.g:1111:6: (lv_members_8_0= ruleMember )
                    	    {
                    	    // InternalComponent.g:1111:6: (lv_members_8_0= ruleMember )
                    	    // InternalComponent.g:1112:7: lv_members_8_0= ruleMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getInterfaceAccess().getMembersMemberParserRuleCall_2_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_members_8_0=ruleMember();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"members",
                    	    								lv_members_8_0,
                    	    								"de.cooperateproject.modeling.textual.component.Component.Member");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(otherlv_9, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_2_1_3());
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleConnector"
    // InternalComponent.g:1139:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // InternalComponent.g:1139:50: (iv_ruleConnector= ruleConnector EOF )
            // InternalComponent.g:1140:2: iv_ruleConnector= ruleConnector EOF
            {
             newCompositeNode(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnector=ruleConnector();

            state._fsp--;

             current =iv_ruleConnector; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConnector"


    // $ANTLR start "ruleConnector"
    // InternalComponent.g:1146:1: ruleConnector returns [EObject current=null] : (otherlv_0= 'con' ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) ) ) otherlv_5= '(' ( (lv_connectorEnds_6_0= ruleConnectorEnd ) ) (otherlv_7= ',' ( (lv_connectorEnds_8_0= ruleConnectorEnd ) ) )* otherlv_9= ')' ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_alias_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_connectorEnds_6_0 = null;

        EObject lv_connectorEnds_8_0 = null;



        	enterRule();

        try {
            // InternalComponent.g:1152:2: ( (otherlv_0= 'con' ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) ) ) otherlv_5= '(' ( (lv_connectorEnds_6_0= ruleConnectorEnd ) ) (otherlv_7= ',' ( (lv_connectorEnds_8_0= ruleConnectorEnd ) ) )* otherlv_9= ')' ) )
            // InternalComponent.g:1153:2: (otherlv_0= 'con' ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) ) ) otherlv_5= '(' ( (lv_connectorEnds_6_0= ruleConnectorEnd ) ) (otherlv_7= ',' ( (lv_connectorEnds_8_0= ruleConnectorEnd ) ) )* otherlv_9= ')' )
            {
            // InternalComponent.g:1153:2: (otherlv_0= 'con' ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) ) ) otherlv_5= '(' ( (lv_connectorEnds_6_0= ruleConnectorEnd ) ) (otherlv_7= ',' ( (lv_connectorEnds_8_0= ruleConnectorEnd ) ) )* otherlv_9= ')' )
            // InternalComponent.g:1154:3: otherlv_0= 'con' ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) ) ) otherlv_5= '(' ( (lv_connectorEnds_6_0= ruleConnectorEnd ) ) (otherlv_7= ',' ( (lv_connectorEnds_8_0= ruleConnectorEnd ) ) )* otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getConnectorAccess().getConKeyword_0());
            		
            // InternalComponent.g:1158:3: ( ( (lv_name_1_0= RULE_ID ) ) | ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==15) ) {
                    alt30=2;
                }
                else if ( (LA30_1==20) ) {
                    alt30=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalComponent.g:1159:4: ( (lv_name_1_0= RULE_ID ) )
                    {
                    // InternalComponent.g:1159:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalComponent.g:1160:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalComponent.g:1160:5: (lv_name_1_0= RULE_ID )
                    // InternalComponent.g:1161:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConnectorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"de.cooperateproject.modeling.textual.component.Component.ID");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalComponent.g:1178:4: ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) )
                    {
                    // InternalComponent.g:1178:4: ( ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) ) )
                    // InternalComponent.g:1179:5: ( (lv_alias_2_0= RULE_ID ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_STRING ) )
                    {
                    // InternalComponent.g:1179:5: ( (lv_alias_2_0= RULE_ID ) )
                    // InternalComponent.g:1180:6: (lv_alias_2_0= RULE_ID )
                    {
                    // InternalComponent.g:1180:6: (lv_alias_2_0= RULE_ID )
                    // InternalComponent.g:1181:7: lv_alias_2_0= RULE_ID
                    {
                    lv_alias_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    							newLeafNode(lv_alias_2_0, grammarAccess.getConnectorAccess().getAliasIDTerminalRuleCall_1_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getConnectorRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"alias",
                    								lv_alias_2_0,
                    								"de.cooperateproject.modeling.textual.component.Component.ID");
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,15,FOLLOW_3); 

                    					newLeafNode(otherlv_3, grammarAccess.getConnectorAccess().getAsKeyword_1_1_1());
                    				
                    // InternalComponent.g:1201:5: ( (lv_name_4_0= RULE_STRING ) )
                    // InternalComponent.g:1202:6: (lv_name_4_0= RULE_STRING )
                    {
                    // InternalComponent.g:1202:6: (lv_name_4_0= RULE_STRING )
                    // InternalComponent.g:1203:7: lv_name_4_0= RULE_STRING
                    {
                    lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

                    							newLeafNode(lv_name_4_0, grammarAccess.getConnectorAccess().getNameSTRINGTerminalRuleCall_1_1_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getConnectorRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_4_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getConnectorAccess().getLeftParenthesisKeyword_2());
            		
            // InternalComponent.g:1225:3: ( (lv_connectorEnds_6_0= ruleConnectorEnd ) )
            // InternalComponent.g:1226:4: (lv_connectorEnds_6_0= ruleConnectorEnd )
            {
            // InternalComponent.g:1226:4: (lv_connectorEnds_6_0= ruleConnectorEnd )
            // InternalComponent.g:1227:5: lv_connectorEnds_6_0= ruleConnectorEnd
            {

            					newCompositeNode(grammarAccess.getConnectorAccess().getConnectorEndsConnectorEndParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
            lv_connectorEnds_6_0=ruleConnectorEnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectorRule());
            					}
            					add(
            						current,
            						"connectorEnds",
            						lv_connectorEnds_6_0,
            						"de.cooperateproject.modeling.textual.component.Component.ConnectorEnd");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponent.g:1244:3: (otherlv_7= ',' ( (lv_connectorEnds_8_0= ruleConnectorEnd ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==21) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalComponent.g:1245:4: otherlv_7= ',' ( (lv_connectorEnds_8_0= ruleConnectorEnd ) )
            	    {
            	    otherlv_7=(Token)match(input,21,FOLLOW_6); 

            	    				newLeafNode(otherlv_7, grammarAccess.getConnectorAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalComponent.g:1249:4: ( (lv_connectorEnds_8_0= ruleConnectorEnd ) )
            	    // InternalComponent.g:1250:5: (lv_connectorEnds_8_0= ruleConnectorEnd )
            	    {
            	    // InternalComponent.g:1250:5: (lv_connectorEnds_8_0= ruleConnectorEnd )
            	    // InternalComponent.g:1251:6: lv_connectorEnds_8_0= ruleConnectorEnd
            	    {

            	    						newCompositeNode(grammarAccess.getConnectorAccess().getConnectorEndsConnectorEndParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_connectorEnds_8_0=ruleConnectorEnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConnectorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"connectorEnds",
            	    							lv_connectorEnds_8_0,
            	    							"de.cooperateproject.modeling.textual.component.Component.ConnectorEnd");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_9=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getConnectorAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleConnector"


    // $ANTLR start "entryRuleConnectorEnd"
    // InternalComponent.g:1277:1: entryRuleConnectorEnd returns [EObject current=null] : iv_ruleConnectorEnd= ruleConnectorEnd EOF ;
    public final EObject entryRuleConnectorEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorEnd = null;


        try {
            // InternalComponent.g:1277:53: (iv_ruleConnectorEnd= ruleConnectorEnd EOF )
            // InternalComponent.g:1278:2: iv_ruleConnectorEnd= ruleConnectorEnd EOF
            {
             newCompositeNode(grammarAccess.getConnectorEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnectorEnd=ruleConnectorEnd();

            state._fsp--;

             current =iv_ruleConnectorEnd; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConnectorEnd"


    // $ANTLR start "ruleConnectorEnd"
    // InternalComponent.g:1284:1: ruleConnectorEnd returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleConnectorEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalComponent.g:1290:2: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (otherlv_2= RULE_ID ) ) ) )
            // InternalComponent.g:1291:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalComponent.g:1291:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (otherlv_2= RULE_ID ) ) )
            // InternalComponent.g:1292:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (otherlv_2= RULE_ID ) )
            {
            // InternalComponent.g:1292:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==30) ) {
                    alt32=1;
                }
            }
            switch (alt32) {
                case 1 :
                    // InternalComponent.g:1293:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.'
                    {
                    // InternalComponent.g:1293:4: ( (otherlv_0= RULE_ID ) )
                    // InternalComponent.g:1294:5: (otherlv_0= RULE_ID )
                    {
                    // InternalComponent.g:1294:5: (otherlv_0= RULE_ID )
                    // InternalComponent.g:1295:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConnectorEndRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_0, grammarAccess.getConnectorEndAccess().getPartAttributeCrossReference_0_0_0());
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,30,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getConnectorEndAccess().getFullStopKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalComponent.g:1311:3: ( (otherlv_2= RULE_ID ) )
            // InternalComponent.g:1312:4: (otherlv_2= RULE_ID )
            {
            // InternalComponent.g:1312:4: (otherlv_2= RULE_ID )
            // InternalComponent.g:1313:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectorEndRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getConnectorEndAccess().getRolePortCrossReference_1_0());
            				

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
    // $ANTLR end "ruleConnectorEnd"


    // $ANTLR start "entryRuleProvide"
    // InternalComponent.g:1328:1: entryRuleProvide returns [EObject current=null] : iv_ruleProvide= ruleProvide EOF ;
    public final EObject entryRuleProvide() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvide = null;


        try {
            // InternalComponent.g:1328:48: (iv_ruleProvide= ruleProvide EOF )
            // InternalComponent.g:1329:2: iv_ruleProvide= ruleProvide EOF
            {
             newCompositeNode(grammarAccess.getProvideRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProvide=ruleProvide();

            state._fsp--;

             current =iv_ruleProvide; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProvide"


    // $ANTLR start "ruleProvide"
    // InternalComponent.g:1335:1: ruleProvide returns [EObject current=null] : ( () otherlv_1= 'provide' ( ( (lv_name_2_0= RULE_ID ) ) | ( ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_STRING ) ) ) ) ( ( ruleFQN ) ) ) ;
    public final EObject ruleProvide() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_alias_3_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;


        	enterRule();

        try {
            // InternalComponent.g:1341:2: ( ( () otherlv_1= 'provide' ( ( (lv_name_2_0= RULE_ID ) ) | ( ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_STRING ) ) ) ) ( ( ruleFQN ) ) ) )
            // InternalComponent.g:1342:2: ( () otherlv_1= 'provide' ( ( (lv_name_2_0= RULE_ID ) ) | ( ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_STRING ) ) ) ) ( ( ruleFQN ) ) )
            {
            // InternalComponent.g:1342:2: ( () otherlv_1= 'provide' ( ( (lv_name_2_0= RULE_ID ) ) | ( ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_STRING ) ) ) ) ( ( ruleFQN ) ) )
            // InternalComponent.g:1343:3: () otherlv_1= 'provide' ( ( (lv_name_2_0= RULE_ID ) ) | ( ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_STRING ) ) ) ) ( ( ruleFQN ) )
            {
            // InternalComponent.g:1343:3: ()
            // InternalComponent.g:1344:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProvideAccess().getProvideAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getProvideAccess().getProvideKeyword_1());
            		
            // InternalComponent.g:1354:3: ( ( (lv_name_2_0= RULE_ID ) ) | ( ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_STRING ) ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==RULE_ID) ) {
                    alt33=1;
                }
                else if ( (LA33_1==15) ) {
                    alt33=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalComponent.g:1355:4: ( (lv_name_2_0= RULE_ID ) )
                    {
                    // InternalComponent.g:1355:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalComponent.g:1356:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalComponent.g:1356:5: (lv_name_2_0= RULE_ID )
                    // InternalComponent.g:1357:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getProvideAccess().getNameIDTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProvideRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"de.cooperateproject.modeling.textual.component.Component.ID");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalComponent.g:1374:4: ( ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_STRING ) ) )
                    {
                    // InternalComponent.g:1374:4: ( ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_STRING ) ) )
                    // InternalComponent.g:1375:5: ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_STRING ) )
                    {
                    // InternalComponent.g:1375:5: ( (lv_alias_3_0= RULE_ID ) )
                    // InternalComponent.g:1376:6: (lv_alias_3_0= RULE_ID )
                    {
                    // InternalComponent.g:1376:6: (lv_alias_3_0= RULE_ID )
                    // InternalComponent.g:1377:7: lv_alias_3_0= RULE_ID
                    {
                    lv_alias_3_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    							newLeafNode(lv_alias_3_0, grammarAccess.getProvideAccess().getAliasIDTerminalRuleCall_2_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getProvideRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"alias",
                    								lv_alias_3_0,
                    								"de.cooperateproject.modeling.textual.component.Component.ID");
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,15,FOLLOW_3); 

                    					newLeafNode(otherlv_4, grammarAccess.getProvideAccess().getAsKeyword_2_1_1());
                    				
                    // InternalComponent.g:1397:5: ( (lv_name_5_0= RULE_STRING ) )
                    // InternalComponent.g:1398:6: (lv_name_5_0= RULE_STRING )
                    {
                    // InternalComponent.g:1398:6: (lv_name_5_0= RULE_STRING )
                    // InternalComponent.g:1399:7: lv_name_5_0= RULE_STRING
                    {
                    lv_name_5_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    							newLeafNode(lv_name_5_0, grammarAccess.getProvideAccess().getNameSTRINGTerminalRuleCall_2_1_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getProvideRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_5_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalComponent.g:1417:3: ( ( ruleFQN ) )
            // InternalComponent.g:1418:4: ( ruleFQN )
            {
            // InternalComponent.g:1418:4: ( ruleFQN )
            // InternalComponent.g:1419:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProvideRule());
            					}
            				

            					newCompositeNode(grammarAccess.getProvideAccess().getInterfaceInterfaceCrossReference_3_0());
            				
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleProvide"


    // $ANTLR start "entryRuleRequire"
    // InternalComponent.g:1437:1: entryRuleRequire returns [EObject current=null] : iv_ruleRequire= ruleRequire EOF ;
    public final EObject entryRuleRequire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequire = null;


        try {
            // InternalComponent.g:1437:48: (iv_ruleRequire= ruleRequire EOF )
            // InternalComponent.g:1438:2: iv_ruleRequire= ruleRequire EOF
            {
             newCompositeNode(grammarAccess.getRequireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequire=ruleRequire();

            state._fsp--;

             current =iv_ruleRequire; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRequire"


    // $ANTLR start "ruleRequire"
    // InternalComponent.g:1444:1: ruleRequire returns [EObject current=null] : ( () otherlv_1= 'require' ( ( (lv_name_2_0= RULE_ID ) ) | ( ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_STRING ) ) ) ) ( ( ruleFQN ) ) ) ;
    public final EObject ruleRequire() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_alias_3_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;


        	enterRule();

        try {
            // InternalComponent.g:1450:2: ( ( () otherlv_1= 'require' ( ( (lv_name_2_0= RULE_ID ) ) | ( ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_STRING ) ) ) ) ( ( ruleFQN ) ) ) )
            // InternalComponent.g:1451:2: ( () otherlv_1= 'require' ( ( (lv_name_2_0= RULE_ID ) ) | ( ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_STRING ) ) ) ) ( ( ruleFQN ) ) )
            {
            // InternalComponent.g:1451:2: ( () otherlv_1= 'require' ( ( (lv_name_2_0= RULE_ID ) ) | ( ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_STRING ) ) ) ) ( ( ruleFQN ) ) )
            // InternalComponent.g:1452:3: () otherlv_1= 'require' ( ( (lv_name_2_0= RULE_ID ) ) | ( ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_STRING ) ) ) ) ( ( ruleFQN ) )
            {
            // InternalComponent.g:1452:3: ()
            // InternalComponent.g:1453:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRequireAccess().getRequireAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getRequireAccess().getRequireKeyword_1());
            		
            // InternalComponent.g:1463:3: ( ( (lv_name_2_0= RULE_ID ) ) | ( ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_STRING ) ) ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==RULE_ID) ) {
                    alt34=1;
                }
                else if ( (LA34_1==15) ) {
                    alt34=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalComponent.g:1464:4: ( (lv_name_2_0= RULE_ID ) )
                    {
                    // InternalComponent.g:1464:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalComponent.g:1465:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalComponent.g:1465:5: (lv_name_2_0= RULE_ID )
                    // InternalComponent.g:1466:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getRequireAccess().getNameIDTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRequireRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"de.cooperateproject.modeling.textual.component.Component.ID");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalComponent.g:1483:4: ( ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_STRING ) ) )
                    {
                    // InternalComponent.g:1483:4: ( ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_STRING ) ) )
                    // InternalComponent.g:1484:5: ( (lv_alias_3_0= RULE_ID ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_STRING ) )
                    {
                    // InternalComponent.g:1484:5: ( (lv_alias_3_0= RULE_ID ) )
                    // InternalComponent.g:1485:6: (lv_alias_3_0= RULE_ID )
                    {
                    // InternalComponent.g:1485:6: (lv_alias_3_0= RULE_ID )
                    // InternalComponent.g:1486:7: lv_alias_3_0= RULE_ID
                    {
                    lv_alias_3_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    							newLeafNode(lv_alias_3_0, grammarAccess.getRequireAccess().getAliasIDTerminalRuleCall_2_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getRequireRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"alias",
                    								lv_alias_3_0,
                    								"de.cooperateproject.modeling.textual.component.Component.ID");
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,15,FOLLOW_3); 

                    					newLeafNode(otherlv_4, grammarAccess.getRequireAccess().getAsKeyword_2_1_1());
                    				
                    // InternalComponent.g:1506:5: ( (lv_name_5_0= RULE_STRING ) )
                    // InternalComponent.g:1507:6: (lv_name_5_0= RULE_STRING )
                    {
                    // InternalComponent.g:1507:6: (lv_name_5_0= RULE_STRING )
                    // InternalComponent.g:1508:7: lv_name_5_0= RULE_STRING
                    {
                    lv_name_5_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    							newLeafNode(lv_name_5_0, grammarAccess.getRequireAccess().getNameSTRINGTerminalRuleCall_2_1_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getRequireRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_5_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalComponent.g:1526:3: ( ( ruleFQN ) )
            // InternalComponent.g:1527:4: ( ruleFQN )
            {
            // InternalComponent.g:1527:4: ( ruleFQN )
            // InternalComponent.g:1528:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequireRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRequireAccess().getInterfaceInterfaceCrossReference_3_0());
            				
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleRequire"


    // $ANTLR start "entryRuleMethod"
    // InternalComponent.g:1546:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalComponent.g:1546:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalComponent.g:1547:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalComponent.g:1553:1: ruleMethod returns [EObject current=null] : ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_abstract_2_0= 'abstract' ) )? ( (lv_static_3_0= 'static' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( ( ruleFQN ) ) )? ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_2_0=null;
        Token lv_static_3_0=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Enumerator lv_visibility_1_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_parameters_8_0 = null;



        	enterRule();

        try {
            // InternalComponent.g:1559:2: ( ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_abstract_2_0= 'abstract' ) )? ( (lv_static_3_0= 'static' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( ( ruleFQN ) ) )? ) )
            // InternalComponent.g:1560:2: ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_abstract_2_0= 'abstract' ) )? ( (lv_static_3_0= 'static' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( ( ruleFQN ) ) )? )
            {
            // InternalComponent.g:1560:2: ( () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_abstract_2_0= 'abstract' ) )? ( (lv_static_3_0= 'static' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( ( ruleFQN ) ) )? )
            // InternalComponent.g:1561:3: () ( (lv_visibility_1_0= ruleVisibility ) )? ( (lv_abstract_2_0= 'abstract' ) )? ( (lv_static_3_0= 'static' ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )* otherlv_9= ')' (otherlv_10= ':' ( ( ruleFQN ) ) )?
            {
            // InternalComponent.g:1561:3: ()
            // InternalComponent.g:1562:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMethodAccess().getMethodAction_0(),
            					current);
            			

            }

            // InternalComponent.g:1568:3: ( (lv_visibility_1_0= ruleVisibility ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==26||(LA35_0>=36 && LA35_0<=41)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalComponent.g:1569:4: (lv_visibility_1_0= ruleVisibility )
                    {
                    // InternalComponent.g:1569:4: (lv_visibility_1_0= ruleVisibility )
                    // InternalComponent.g:1570:5: lv_visibility_1_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getMethodAccess().getVisibilityVisibilityEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_30);
                    lv_visibility_1_0=ruleVisibility();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMethodRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_1_0,
                    						"de.cooperateproject.modeling.textual.component.Component.Visibility");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalComponent.g:1587:3: ( (lv_abstract_2_0= 'abstract' ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==33) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalComponent.g:1588:4: (lv_abstract_2_0= 'abstract' )
                    {
                    // InternalComponent.g:1588:4: (lv_abstract_2_0= 'abstract' )
                    // InternalComponent.g:1589:5: lv_abstract_2_0= 'abstract'
                    {
                    lv_abstract_2_0=(Token)match(input,33,FOLLOW_31); 

                    					newLeafNode(lv_abstract_2_0, grammarAccess.getMethodAccess().getAbstractAbstractKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMethodRule());
                    					}
                    					setWithLastConsumed(current, "abstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            // InternalComponent.g:1601:3: ( (lv_static_3_0= 'static' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==34) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalComponent.g:1602:4: (lv_static_3_0= 'static' )
                    {
                    // InternalComponent.g:1602:4: (lv_static_3_0= 'static' )
                    // InternalComponent.g:1603:5: lv_static_3_0= 'static'
                    {
                    lv_static_3_0=(Token)match(input,34,FOLLOW_6); 

                    					newLeafNode(lv_static_3_0, grammarAccess.getMethodAccess().getStaticStaticKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMethodRule());
                    					}
                    					setWithLastConsumed(current, "static", true, "static");
                    				

                    }


                    }
                    break;

            }

            // InternalComponent.g:1615:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalComponent.g:1616:4: (lv_name_4_0= RULE_ID )
            {
            // InternalComponent.g:1616:4: (lv_name_4_0= RULE_ID )
            // InternalComponent.g:1617:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_4_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"de.cooperateproject.modeling.textual.component.Component.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_32); 

            			newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_5());
            		
            // InternalComponent.g:1637:3: ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID||LA39_0==26||(LA39_0>=36 && LA39_0<=41)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalComponent.g:1638:4: ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )*
            	    {
            	    // InternalComponent.g:1638:4: ( (lv_parameters_6_0= ruleParameter ) )
            	    // InternalComponent.g:1639:5: (lv_parameters_6_0= ruleParameter )
            	    {
            	    // InternalComponent.g:1639:5: (lv_parameters_6_0= ruleParameter )
            	    // InternalComponent.g:1640:6: lv_parameters_6_0= ruleParameter
            	    {

            	    						newCompositeNode(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_6_0_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    lv_parameters_6_0=ruleParameter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMethodRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_6_0,
            	    							"de.cooperateproject.modeling.textual.component.Component.Parameter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalComponent.g:1657:4: (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )*
            	    loop38:
            	    do {
            	        int alt38=2;
            	        int LA38_0 = input.LA(1);

            	        if ( (LA38_0==21) ) {
            	            alt38=1;
            	        }


            	        switch (alt38) {
            	    	case 1 :
            	    	    // InternalComponent.g:1658:5: otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,21,FOLLOW_34); 

            	    	    					newLeafNode(otherlv_7, grammarAccess.getMethodAccess().getCommaKeyword_6_1_0());
            	    	    				
            	    	    // InternalComponent.g:1662:5: ( (lv_parameters_8_0= ruleParameter ) )
            	    	    // InternalComponent.g:1663:6: (lv_parameters_8_0= ruleParameter )
            	    	    {
            	    	    // InternalComponent.g:1663:6: (lv_parameters_8_0= ruleParameter )
            	    	    // InternalComponent.g:1664:7: lv_parameters_8_0= ruleParameter
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_6_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_33);
            	    	    lv_parameters_8_0=ruleParameter();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getMethodRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"parameters",
            	    	    								lv_parameters_8_0,
            	    	    								"de.cooperateproject.modeling.textual.component.Component.Parameter");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop38;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            otherlv_9=(Token)match(input,22,FOLLOW_35); 

            			newLeafNode(otherlv_9, grammarAccess.getMethodAccess().getRightParenthesisKeyword_7());
            		
            // InternalComponent.g:1687:3: (otherlv_10= ':' ( ( ruleFQN ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==35) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalComponent.g:1688:4: otherlv_10= ':' ( ( ruleFQN ) )
                    {
                    otherlv_10=(Token)match(input,35,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getMethodAccess().getColonKeyword_8_0());
                    			
                    // InternalComponent.g:1692:4: ( ( ruleFQN ) )
                    // InternalComponent.g:1693:5: ( ruleFQN )
                    {
                    // InternalComponent.g:1693:5: ( ruleFQN )
                    // InternalComponent.g:1694:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMethodRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMethodAccess().getTypeClassifierCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleAttribute"
    // InternalComponent.g:1713:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalComponent.g:1713:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalComponent.g:1714:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalComponent.g:1720:1: ruleAttribute returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_static_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_visibility_0_0 = null;



        	enterRule();

        try {
            // InternalComponent.g:1726:2: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) ) )
            // InternalComponent.g:1727:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) )
            {
            // InternalComponent.g:1727:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) ) )
            // InternalComponent.g:1728:3: ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleFQN ) )
            {
            // InternalComponent.g:1728:3: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==26||(LA41_0>=36 && LA41_0<=41)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalComponent.g:1729:4: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalComponent.g:1729:4: (lv_visibility_0_0= ruleVisibility )
                    // InternalComponent.g:1730:5: lv_visibility_0_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getAttributeAccess().getVisibilityVisibilityEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_31);
                    lv_visibility_0_0=ruleVisibility();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAttributeRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_0_0,
                    						"de.cooperateproject.modeling.textual.component.Component.Visibility");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalComponent.g:1747:3: ( (lv_static_1_0= 'static' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==34) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalComponent.g:1748:4: (lv_static_1_0= 'static' )
                    {
                    // InternalComponent.g:1748:4: (lv_static_1_0= 'static' )
                    // InternalComponent.g:1749:5: lv_static_1_0= 'static'
                    {
                    lv_static_1_0=(Token)match(input,34,FOLLOW_6); 

                    					newLeafNode(lv_static_1_0, grammarAccess.getAttributeAccess().getStaticStaticKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "static", true, "static");
                    				

                    }


                    }
                    break;

            }

            // InternalComponent.g:1761:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalComponent.g:1762:4: (lv_name_2_0= RULE_ID )
            {
            // InternalComponent.g:1762:4: (lv_name_2_0= RULE_ID )
            // InternalComponent.g:1763:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(lv_name_2_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.cooperateproject.modeling.textual.component.Component.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getColonKeyword_3());
            		
            // InternalComponent.g:1783:3: ( ( ruleFQN ) )
            // InternalComponent.g:1784:4: ( ruleFQN )
            {
            // InternalComponent.g:1784:4: ( ruleFQN )
            // InternalComponent.g:1785:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeClassifierCrossReference_4_0());
            				
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleComponentTypeAttribute"
    // InternalComponent.g:1803:1: entryRuleComponentTypeAttribute returns [EObject current=null] : iv_ruleComponentTypeAttribute= ruleComponentTypeAttribute EOF ;
    public final EObject entryRuleComponentTypeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentTypeAttribute = null;


        try {
            // InternalComponent.g:1803:63: (iv_ruleComponentTypeAttribute= ruleComponentTypeAttribute EOF )
            // InternalComponent.g:1804:2: iv_ruleComponentTypeAttribute= ruleComponentTypeAttribute EOF
            {
             newCompositeNode(grammarAccess.getComponentTypeAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentTypeAttribute=ruleComponentTypeAttribute();

            state._fsp--;

             current =iv_ruleComponentTypeAttribute; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComponentTypeAttribute"


    // $ANTLR start "ruleComponentTypeAttribute"
    // InternalComponent.g:1810:1: ruleComponentTypeAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleComponentTypeAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalComponent.g:1816:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) ) )
            // InternalComponent.g:1817:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) )
            {
            // InternalComponent.g:1817:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) )
            // InternalComponent.g:1818:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) )
            {
            // InternalComponent.g:1818:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalComponent.g:1819:4: (lv_name_0_0= RULE_ID )
            {
            // InternalComponent.g:1819:4: (lv_name_0_0= RULE_ID )
            // InternalComponent.g:1820:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(lv_name_0_0, grammarAccess.getComponentTypeAttributeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentTypeAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"de.cooperateproject.modeling.textual.component.Component.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentTypeAttributeAccess().getColonKeyword_1());
            		
            // InternalComponent.g:1840:3: ( ( ruleFQN ) )
            // InternalComponent.g:1841:4: ( ruleFQN )
            {
            // InternalComponent.g:1841:4: ( ruleFQN )
            // InternalComponent.g:1842:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentTypeAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComponentTypeAttributeAccess().getTypeComponentCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleComponentTypeAttribute"


    // $ANTLR start "entryRuleParameter"
    // InternalComponent.g:1860:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalComponent.g:1860:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalComponent.g:1861:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalComponent.g:1867:1: ruleParameter returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_visibility_0_0 = null;



        	enterRule();

        try {
            // InternalComponent.g:1873:2: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ) )
            // InternalComponent.g:1874:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) )
            {
            // InternalComponent.g:1874:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) )
            // InternalComponent.g:1875:3: ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) )
            {
            // InternalComponent.g:1875:3: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==26||(LA43_0>=36 && LA43_0<=41)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalComponent.g:1876:4: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalComponent.g:1876:4: (lv_visibility_0_0= ruleVisibility )
                    // InternalComponent.g:1877:5: lv_visibility_0_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getParameterAccess().getVisibilityVisibilityEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_visibility_0_0=ruleVisibility();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParameterRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_0_0,
                    						"de.cooperateproject.modeling.textual.component.Component.Visibility");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalComponent.g:1894:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponent.g:1895:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponent.g:1895:4: (lv_name_1_0= RULE_ID )
            // InternalComponent.g:1896:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(lv_name_1_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.cooperateproject.modeling.textual.component.Component.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getColonKeyword_2());
            		
            // InternalComponent.g:1916:3: ( ( ruleFQN ) )
            // InternalComponent.g:1917:4: ( ruleFQN )
            {
            // InternalComponent.g:1917:4: ( ruleFQN )
            // InternalComponent.g:1918:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeClassifierCrossReference_3_0());
            				
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleFQN"
    // InternalComponent.g:1936:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalComponent.g:1936:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalComponent.g:1937:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalComponent.g:1943:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalComponent.g:1949:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalComponent.g:1950:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalComponent.g:1950:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalComponent.g:1951:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_37); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalComponent.g:1958:3: (kw= '.' this_ID_2= RULE_ID )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==30) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalComponent.g:1959:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,30,FOLLOW_6); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_37); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop44;
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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "ruleVisibility"
    // InternalComponent.g:1976:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalComponent.g:1982:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) ) )
            // InternalComponent.g:1983:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) )
            {
            // InternalComponent.g:1983:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= '-' ) | (enumLiteral_3= 'private' ) | (enumLiteral_4= '#' ) | (enumLiteral_5= 'protected' ) | (enumLiteral_6= '~' ) )
            int alt45=7;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt45=1;
                }
                break;
            case 37:
                {
                alt45=2;
                }
                break;
            case 38:
                {
                alt45=3;
                }
                break;
            case 39:
                {
                alt45=4;
                }
                break;
            case 40:
                {
                alt45=5;
                }
                break;
            case 41:
                {
                alt45=6;
                }
                break;
            case 26:
                {
                alt45=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalComponent.g:1984:3: (enumLiteral_0= '+' )
                    {
                    // InternalComponent.g:1984:3: (enumLiteral_0= '+' )
                    // InternalComponent.g:1985:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalComponent.g:1992:3: (enumLiteral_1= 'public' )
                    {
                    // InternalComponent.g:1992:3: (enumLiteral_1= 'public' )
                    // InternalComponent.g:1993:4: enumLiteral_1= 'public'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalComponent.g:2000:3: (enumLiteral_2= '-' )
                    {
                    // InternalComponent.g:2000:3: (enumLiteral_2= '-' )
                    // InternalComponent.g:2001:4: enumLiteral_2= '-'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalComponent.g:2008:3: (enumLiteral_3= 'private' )
                    {
                    // InternalComponent.g:2008:3: (enumLiteral_3= 'private' )
                    // InternalComponent.g:2009:4: enumLiteral_3= 'private'
                    {
                    enumLiteral_3=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalComponent.g:2016:3: (enumLiteral_4= '#' )
                    {
                    // InternalComponent.g:2016:3: (enumLiteral_4= '#' )
                    // InternalComponent.g:2017:4: enumLiteral_4= '#'
                    {
                    enumLiteral_4=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalComponent.g:2024:3: (enumLiteral_5= 'protected' )
                    {
                    // InternalComponent.g:2024:3: (enumLiteral_5= 'protected' )
                    // InternalComponent.g:2025:4: enumLiteral_5= 'protected'
                    {
                    enumLiteral_5=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalComponent.g:2032:3: (enumLiteral_6= '~' )
                    {
                    // InternalComponent.g:2032:3: (enumLiteral_6= '~' )
                    // InternalComponent.g:2033:4: enumLiteral_6= '~'
                    {
                    enumLiteral_6=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPackageEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getVisibilityAccess().getPackageEnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "ruleVisibility"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\10\5\1\uffff\1\5\1\24\1\uffff";
    static final String dfa_3s = "\1\51\7\42\1\uffff\1\5\1\43\1\uffff";
    static final String dfa_4s = "\10\uffff\1\1\2\uffff\1\2";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\12\24\uffff\1\7\6\uffff\1\10\1\11\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6",
            "\1\12\33\uffff\1\10\1\11",
            "\1\12\33\uffff\1\10\1\11",
            "\1\12\33\uffff\1\10\1\11",
            "\1\12\33\uffff\1\10\1\11",
            "\1\12\33\uffff\1\10\1\11",
            "\1\12\33\uffff\1\10\1\11",
            "\1\12\33\uffff\1\10\1\11",
            "",
            "\1\12",
            "\1\10\16\uffff\1\13",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "256:2: (this_Method_0= ruleMethod | this_Attribute_1= ruleAttribute )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000100C7000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000100C4002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000810002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000003F1B5864020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000003F1B5064020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000003F035064020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000030064020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000030064000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010064000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000180820000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000180020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000000C000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000003F604820020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000003F604020020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000600000020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000003F004400020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000003F004600020L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000003F004000020L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000040000002L});

}
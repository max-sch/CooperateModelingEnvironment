package de.cooperateproject.modeling.transformation.component.tests;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;

import de.cooperateproject.modeling.textual.component.component.ComponentPackage;
import de.cooperateproject.modeling.transformation.component.ComponentActivator;

public class TextualToGraphicalComponentTest extends ComponentDirectionalTransformationTestBase {

    private static final URI TRANSFORMATION_URI = createTransformationURI(ComponentActivator.PLUGIN_ID,
            "Textual_to_Graphical_for_Component.qvto");

    static {
        ComponentPackage.eINSTANCE.eClass();
    }

    public TextualToGraphicalComponentTest() {
        super(TRANSFORMATION_URI, "xmi", "notation", TestEnvironmentConstants.TEST_PLUGIN_ID);
    }

    @Test
    public void testMinimal() throws Exception {
        testRegular("ComponentMinimal");
    }

    @Test
    public void testSingleComponent() throws Exception {
        testRegular("ComponentDiagramSingleComponent");
    }

    @Test
    public void testMinimalIncremental() throws Exception {
        testIncremental("ComponentMinimal");
    }

    @Test
    public void testSingleInterface() throws Exception {
        testRegular("ComponentDiagramSingleInterface");
    }

    @Test
    public void testMultipleClassifiers() throws Exception {
        testRegular("ComponentDiagramMultipleClassifiers");
    }

    @Test
    public void testInnerClassifiers() throws Exception {
        testRegular("ComponentDiagramInnerClassifiers");
    }

    @Test
    public void testInterfaceAttribute() throws Exception {
        testRegular("ComponentDiagramInterfaceAttribute");
    }

    @Test
    public void testInterfaceMembers() throws Exception {
        testRegular("ComponentDiagramInterfaceMembers");
    }

    @Test
    public void testProvideInterface() throws Exception {
        testRegular("ComponentDiagramProvide");
    }

    @Test
    public void testMultipleProvide() throws Exception {
        testRegular("ComponentDiagramMultipleProvide");
    }

    @Test
    public void testRequireInterface() throws Exception {
        testRegular("ComponentDiagramRequire");
    }

    @Test
    public void testMultipleRequire() throws Exception {
        testRegular("ComponentDiagramMultipleRequire");
    }

    @Test
    public void testComponentDiagramPorts() throws Exception {
        testRegular("ComponentDiagramPorts");
    }

    @Test
    public void testComponentDiagramSinglePort() throws Exception {
        testRegular("ComponentDiagramSinglePort");
    }

    @Test
    public void testComponentDiagramPortRelation() throws Exception {
        testRegular("ComponentDiagramPortRelation");
    }

    @Test
    public void testComponentDiagramAliasedClassifier() throws Exception {
        testRegular("ComponentDiagramAliasedClassifier");
    }
    
    @Test
    public void testComponentDiagramPortTypeClass() throws Exception {
        testRegular("ComponentDiagramPortTypeClass");
    }
    
    @Test
    public void testComponentDiagramNestedClass() throws Exception {
        testRegular("ComponentDiagramNestedClass");
    }
    
    @Test
    public void testComponentDiagramSingleClass() throws Exception {
        testRegular("ComponentDiagramSingleClass");
    }
    
    @Test
    public void testComponentDiagramComponentNote() throws Exception {
        testRegular("ComponentDiagramComponentNote");
    }
    
    @Test
    public void testComponentDiagramCommentedGeneralization() throws Exception {
        testRegular("ComponentDiagramCommentedGeneralization");
    }
    
    @Test
    public void testComponentDiagramCommentedInterfaceRel() throws Exception {
    	testRegular("ComponentDiagramCommentedInterfaceRel");
    }
    
}


/*
 * generated by Xtext
 */
package de.cooperateproject.modeling.textual.cls.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * Manual modifications go to {de.cooperateproject.modeling.textual.cls.ui.ClsUiModule}
 */
@SuppressWarnings("all")
public abstract class AbstractClsUiModule extends org.eclipse.xtext.ui.DefaultUiModule {

    public AbstractClsUiModule(AbstractUIPlugin plugin) {
        super(plugin);
    }

    // contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
    public com.google.inject.Provider<org.eclipse.xtext.resource.containers.IAllContainersState> provideIAllContainersState() {
        return org.eclipse.xtext.ui.shared.Access.getJavaProjectsState();
    }

    // contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
    public Class<? extends org.eclipse.xtext.ui.editor.contentassist.IProposalConflictHelper> bindIProposalConflictHelper() {
        return org.eclipse.xtext.ui.editor.contentassist.antlr.AntlrProposalConflictHelper.class;
    }

    // contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
    public void configureHighlightingLexer(com.google.inject.Binder binder) {
        binder.bind(org.eclipse.xtext.parser.antlr.Lexer.class)
                .annotatedWith(com.google.inject.name.Names.named(org.eclipse.xtext.ide.LexerIdeBindings.HIGHLIGHTING))
                .to(de.cooperateproject.modeling.textual.cls.parser.antlr.internal.InternalClsLexer.class);
    }

    // contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
    public void configureHighlightingTokenDefProvider(com.google.inject.Binder binder) {
        binder.bind(org.eclipse.xtext.parser.antlr.ITokenDefProvider.class)
                .annotatedWith(com.google.inject.name.Names.named(org.eclipse.xtext.ide.LexerIdeBindings.HIGHLIGHTING))
                .to(org.eclipse.xtext.parser.antlr.AntlrTokenDefProvider.class);
    }

    // contributed by org.eclipse.xtext.generator.exporting.QualifiedNamesFragment
    public Class<? extends org.eclipse.xtext.ui.editor.contentassist.PrefixMatcher> bindPrefixMatcher() {
        return org.eclipse.xtext.ui.editor.contentassist.FQNPrefixMatcher.class;
    }

    // contributed by org.eclipse.xtext.generator.exporting.QualifiedNamesFragment
    public Class<? extends org.eclipse.xtext.ui.refactoring.IDependentElementsCalculator> bindIDependentElementsCalculator() {
        return org.eclipse.xtext.ui.refactoring.impl.DefaultDependentElementsCalculator.class;
    }

    // contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
    public void configureIResourceDescriptionsBuilderScope(com.google.inject.Binder binder) {
        binder.bind(org.eclipse.xtext.resource.IResourceDescriptions.class)
                .annotatedWith(com.google.inject.name.Names
                        .named(org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider.NAMED_BUILDER_SCOPE))
                .to(org.eclipse.xtext.builder.clustering.CurrentDescriptions.ResourceSetAware.class);
    }

    // contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
    public Class<? extends org.eclipse.xtext.ui.editor.IXtextEditorCallback> bindIXtextEditorCallback() {
        return org.eclipse.xtext.builder.nature.NatureAddingEditorCallback.class;
    }

    // contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
    public Class<? extends org.eclipse.xtext.generator.IContextualOutputConfigurationProvider> bindIContextualOutputConfigurationProvider() {
        return org.eclipse.xtext.builder.EclipseOutputConfigurationProvider.class;
    }

    // contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
    public void configureIResourceDescriptionsPersisted(com.google.inject.Binder binder) {
        binder.bind(org.eclipse.xtext.resource.IResourceDescriptions.class)
                .annotatedWith(com.google.inject.name.Names
                        .named(org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider.PERSISTED_DESCRIPTIONS))
                .to(org.eclipse.xtext.builder.builderState.IBuilderState.class);
    }

    // contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
    public Class<? extends org.eclipse.xtext.ui.editor.DocumentBasedDirtyResource> bindDocumentBasedDirtyResource() {
        return org.eclipse.xtext.builder.impl.PersistentDataAwareDirtyResource.class;
    }

    // contributed by org.eclipse.xtext.generator.generator.GeneratorFragment
    public Class<? extends org.eclipse.xtext.builder.IXtextBuilderParticipant> bindIXtextBuilderParticipant() {
        return org.eclipse.xtext.builder.BuilderParticipant.class;
    }

    // contributed by org.eclipse.xtext.generator.generator.GeneratorFragment
    public org.eclipse.core.resources.IWorkspaceRoot bindIWorkspaceRootToInstance() {
        return org.eclipse.core.resources.ResourcesPlugin.getWorkspace().getRoot();
    }

    // contributed by org.eclipse.xtext.generator.generator.GeneratorFragment
    public void configureBuilderPreferenceStoreInitializer(com.google.inject.Binder binder) {
        binder.bind(org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreInitializer.class)
                .annotatedWith(com.google.inject.name.Names.named("builderPreferenceInitializer"))
                .to(org.eclipse.xtext.builder.preferences.BuilderPreferenceAccess.Initializer.class);
    }

    // contributed by org.eclipse.xtext.generator.formatting2.Formatter2Fragment
    public Class<? extends org.eclipse.xtext.ui.editor.formatting.IContentFormatterFactory> bindIContentFormatterFactory() {
        return org.eclipse.xtext.ui.editor.formatting2.ContentFormatterFactory.class;
    }

    // contributed by org.eclipse.xtext.ui.generator.labeling.LabelProviderFragment
    public Class<? extends org.eclipse.jface.viewers.ILabelProvider> bindILabelProvider() {
        return de.cooperateproject.modeling.textual.cls.ui.labeling.ClsLabelProvider.class;
    }

    // contributed by org.eclipse.xtext.ui.generator.labeling.LabelProviderFragment
    public void configureResourceUIServiceLabelProvider(com.google.inject.Binder binder) {
        binder.bind(org.eclipse.jface.viewers.ILabelProvider.class)
                .annotatedWith(org.eclipse.xtext.ui.resource.ResourceServiceDescriptionLabelProvider.class)
                .to(de.cooperateproject.modeling.textual.cls.ui.labeling.ClsDescriptionLabelProvider.class);
    }

    // contributed by org.eclipse.xtext.ui.generator.outline.OutlineTreeProviderFragment
    public Class<? extends org.eclipse.xtext.ui.editor.outline.IOutlineTreeProvider> bindIOutlineTreeProvider() {
        return de.cooperateproject.modeling.textual.cls.ui.outline.ClsOutlineTreeProvider.class;
    }

    // contributed by org.eclipse.xtext.ui.generator.outline.OutlineTreeProviderFragment
    public Class<? extends org.eclipse.xtext.ui.editor.outline.impl.IOutlineTreeStructureProvider> bindIOutlineTreeStructureProvider() {
        return de.cooperateproject.modeling.textual.cls.ui.outline.ClsOutlineTreeProvider.class;
    }

    // contributed by org.eclipse.xtext.ui.generator.quickfix.QuickfixProviderFragment
    public Class<? extends org.eclipse.xtext.ui.editor.quickfix.IssueResolutionProvider> bindIssueResolutionProvider() {
        return de.cooperateproject.modeling.textual.cls.ui.quickfix.ClsQuickfixProvider.class;
    }

    // contributed by org.eclipse.xtext.ui.generator.contentAssist.ContentAssistFragment
    public Class<? extends org.eclipse.xtext.ui.editor.contentassist.IContentProposalProvider> bindIContentProposalProvider() {
        return de.cooperateproject.modeling.textual.cls.ui.contentassist.ClsProposalProvider.class;
    }

    // contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrUiGeneratorFragment
    public Class<? extends org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext.Factory> bindContentAssistContext$Factory() {
        return org.eclipse.xtext.ui.editor.contentassist.antlr.DelegatingContentAssistContextFactory.class;
    }

    // contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrUiGeneratorFragment
    public Class<? extends org.eclipse.xtext.ide.editor.contentassist.antlr.IContentAssistParser> bindIContentAssistParser() {
        return de.cooperateproject.modeling.textual.cls.ide.contentassist.antlr.ClsParser.class;
    }

    // contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrUiGeneratorFragment
    public void configureContentAssistLexerProvider(com.google.inject.Binder binder) {
        binder.bind(de.cooperateproject.modeling.textual.cls.ide.contentassist.antlr.internal.InternalClsLexer.class)
                .toProvider(org.eclipse.xtext.parser.antlr.LexerProvider.create(
                        de.cooperateproject.modeling.textual.cls.ide.contentassist.antlr.internal.InternalClsLexer.class));
    }

    // contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrUiGeneratorFragment
    public void configureContentAssistLexer(com.google.inject.Binder binder) {
        binder.bind(org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer.class)
                .annotatedWith(
                        com.google.inject.name.Names.named(org.eclipse.xtext.ide.LexerIdeBindings.CONTENT_ASSIST))
                .to(de.cooperateproject.modeling.textual.cls.ide.contentassist.antlr.internal.InternalClsLexer.class);
    }

    // contributed by org.eclipse.xtext.ui.generator.refactoring.RefactorElementNameFragment
    public Class<? extends org.eclipse.xtext.ui.refactoring.IRenameStrategy> bindIRenameStrategy() {
        return org.eclipse.xtext.ui.refactoring.impl.DefaultRenameStrategy.class;
    }

    // contributed by org.eclipse.xtext.ui.generator.refactoring.RefactorElementNameFragment
    public Class<? extends org.eclipse.xtext.ui.refactoring.IReferenceUpdater> bindIReferenceUpdater() {
        return org.eclipse.xtext.ui.refactoring.impl.DefaultReferenceUpdater.class;
    }

    // contributed by org.eclipse.xtext.ui.generator.refactoring.RefactorElementNameFragment
    public void configureIPreferenceStoreInitializer(com.google.inject.Binder binder) {
        binder.bind(org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreInitializer.class)
                .annotatedWith(com.google.inject.name.Names.named("RefactoringPreferences"))
                .to(org.eclipse.xtext.ui.refactoring.ui.RefactoringPreferences.Initializer.class);
    }

    // contributed by org.eclipse.xtext.ui.generator.refactoring.RefactorElementNameFragment
    public Class<? extends org.eclipse.xtext.ui.refactoring.IRenameRefactoringProvider> bindIRenameRefactoringProvider() {
        return org.eclipse.xtext.ui.refactoring.impl.DefaultRenameRefactoringProvider.class;
    }

    // contributed by org.eclipse.xtext.ui.generator.refactoring.RefactorElementNameFragment
    public Class<? extends org.eclipse.xtext.ui.refactoring.ui.IRenameSupport.Factory> bindIRenameSupport$Factory() {
        return org.eclipse.xtext.ui.refactoring.ui.DefaultRenameSupport.Factory.class;
    }

    // contributed by org.eclipse.xtext.ui.generator.templates.CodetemplatesGeneratorFragment
    public com.google.inject.Provider<org.eclipse.xtext.ui.codetemplates.ui.preferences.TemplatesLanguageConfiguration> provideTemplatesLanguageConfiguration() {
        return org.eclipse.xtext.ui.codetemplates.ui.AccessibleCodetemplatesActivator
                .getTemplatesLanguageConfigurationProvider();
    }

    // contributed by org.eclipse.xtext.ui.generator.templates.CodetemplatesGeneratorFragment
    public com.google.inject.Provider<org.eclipse.xtext.ui.codetemplates.ui.registry.LanguageRegistry> provideLanguageRegistry() {
        return org.eclipse.xtext.ui.codetemplates.ui.AccessibleCodetemplatesActivator.getLanguageRegistry();
    }

    // contributed by org.eclipse.xtext.ui.generator.templates.CodetemplatesGeneratorFragment
    @org.eclipse.xtext.service.SingletonBinding(eager = true)
    public Class<? extends org.eclipse.xtext.ui.codetemplates.ui.registry.LanguageRegistrar> bindLanguageRegistrar() {
        return org.eclipse.xtext.ui.codetemplates.ui.registry.LanguageRegistrar.class;
    }

    // contributed by org.eclipse.xtext.ui.generator.templates.CodetemplatesGeneratorFragment
    public Class<? extends org.eclipse.xtext.ui.editor.templates.XtextTemplatePreferencePage> bindXtextTemplatePreferencePage() {
        return org.eclipse.xtext.ui.codetemplates.ui.preferences.AdvancedTemplatesPreferencePage.class;
    }

    // contributed by org.eclipse.xtext.ui.generator.templates.CodetemplatesGeneratorFragment
    public Class<? extends org.eclipse.xtext.ide.editor.partialEditing.IPartialEditingContentAssistParser> bindIPartialEditingContentAssistParser() {
        return de.cooperateproject.modeling.textual.cls.ide.contentassist.antlr.PartialClsContentAssistParser.class;
    }

    // contributed by org.eclipse.xtext.ui.generator.templates.CodetemplatesGeneratorFragment
    public Class<? extends org.eclipse.xtext.ui.codetemplates.ui.partialEditing.IPartialEditingContentAssistContextFactory> bindIPartialEditingContentAssistContextFactory() {
        return org.eclipse.xtext.ui.codetemplates.ui.partialEditing.PartialEditingContentAssistContextFactory.class;
    }

    // contributed by org.eclipse.xtext.ui.generator.compare.CompareFragment
    public Class<? extends org.eclipse.compare.IViewerCreator> bindIViewerCreator() {
        return org.eclipse.xtext.ui.compare.DefaultViewerCreator.class;
    }

    // contributed by net.winklerweb.cdoxtext.generator.AddCDOXtextBindingsFragment
    public Class<? extends org.eclipse.xtext.ui.editor.model.IResourceForEditorInputFactory> bindIResourceForEditorInputFactory() {
        return net.winklerweb.cdoxtext.runtime.CDOResourceForEditorInputFactory.class;
    }

    // contributed by net.winklerweb.cdoxtext.generator.AddCDOXtextBindingsFragment
    public Class<? extends org.eclipse.xtext.ui.editor.XtextEditor> bindXtextEditor() {
        return net.winklerweb.cdoxtext.runtime.CDOXtextEditor.class;
    }

    // contributed by net.winklerweb.cdoxtext.generator.AddCDOXtextBindingsFragment
    public void configureLanguageSpecificURIEditorOpener(com.google.inject.Binder binder) {
        if (org.eclipse.ui.PlatformUI.isWorkbenchRunning())
            binder.bind(org.eclipse.xtext.ui.editor.IURIEditorOpener.class)
                    .annotatedWith(org.eclipse.xtext.ui.LanguageSpecific.class)
                    .to(net.winklerweb.cdoxtext.runtime.CDOLanguageSpecificURIEditorOpener.class);
    }

    // contributed by net.winklerweb.cdoxtext.generator.emfcompare.EMFCompareMatcherFragment
    public Class<? extends org.eclipse.emf.compare.match.IMatchEngine.Factory> bindIMatchEngine$Factory() {
        return de.cooperateproject.modeling.textual.cls.ui.cdoxtext.ClsMatchEngineFactory.class;
    }

    // contributed by net.winklerweb.cdoxtext.generator.emfcompare.EMFCompareMatcherFragment
    public Class<? extends org.eclipse.emf.compare.match.eobject.ProximityEObjectMatcher.DistanceFunction> bindProximityEObjectMatcher$DistanceFunction() {
        return de.cooperateproject.modeling.textual.cls.ui.cdoxtext.ClsDistanceFunction.class;
    }

    // contributed by
    // de.cooperateproject.modeling.textual.xtext.generator.resources.CooperateResourceHandlingBindingsFragment
    public Class<? extends org.eclipse.xtext.ui.editor.model.XtextDocument> bindXtextDocument() {
        return de.cooperateproject.modeling.textual.xtext.runtime.editor.CooperateXtextDocument.class;
    }

    // contributed by
    // de.cooperateproject.modeling.textual.xtext.generator.resources.CooperateResourceHandlingBindingsFragment
    public Class<? extends org.eclipse.xtext.ui.editor.model.XtextDocumentProvider> bindXtextDocumentProvider() {
        return de.cooperateproject.modeling.textual.xtext.runtime.editor.CooperateCDOXtextDocumentProvider.class;
    }

    // contributed by
    // de.cooperateproject.modeling.textual.xtext.generator.resources.CooperateResourceHandlingBindingsFragment
    public Class<? extends org.eclipse.xtext.ui.resource.IResourceSetProvider> bindIResourceSetProvider() {
        return org.eclipse.xtext.ui.resource.XtextLiveScopeResourceSetProvider.class;
    }

}

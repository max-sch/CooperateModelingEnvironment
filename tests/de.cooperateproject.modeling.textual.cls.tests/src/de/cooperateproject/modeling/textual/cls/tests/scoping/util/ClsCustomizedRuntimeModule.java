package de.cooperateproject.modeling.textual.cls.tests.scoping.util;

import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.reflections.util.FilterBuilder;

import com.google.inject.Inject;
import com.google.inject.Injector;

import de.cooperateproject.modeling.textual.cls.ClsRuntimeModule;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.derivedstate.calculator.AssociationMemberEndCalculator;
import de.cooperateproject.modeling.textual.cls.derivedstate.initializer.XtextAssociationInitializer;
import de.cooperateproject.modeling.textual.cls.derivedstate.remover.XtextAssociationRemover;
import de.cooperateproject.modeling.textual.cls.tests.ClsInjectorProvider;
import de.cooperateproject.modeling.textual.common.derivedstate.calculator.UMLReferencingElementCalculator;
import de.cooperateproject.modeling.textual.common.derivedstate.initializer.VisibilityHavingElementInitializer;
import de.cooperateproject.modeling.textual.common.derivedstate.remover.UMLReferencingElementRemover;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.IAtomicDerivedStateProcessor;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.IAtomicDerivedStateProcessorRegistry;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionFactory;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.automatedfixing.IAutomatedIssueResolutionFactoryRegistry;
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IUMLUriFinder;

/**
 * Runtime module for cls diagrams that injects test mocks.
 * 
 * This module enables running the tests as JUnit tests rather than plugin tests.
 */
public class ClsCustomizedRuntimeModule extends ClsRuntimeModule {

    private static class DummyFactoryRegistry implements IAutomatedIssueResolutionFactoryRegistry {
        @Override
        public Collection<EPackage> coveredPackages() {
            return Arrays.asList(ClsPackage.eINSTANCE, TextualCommonsPackage.eINSTANCE);
        }

        @Override
        public Collection<String> getAvailableIssueCodes() {
            return Collections.emptyList();
        }

        @Override
        public Collection<IAutomatedIssueResolutionFactory> findFactories(Collection<EPackage> ePackages,
                String issueId) {
            return Collections.emptyList();
        }

        @Override
        public Collection<IAutomatedIssueResolutionFactory> findFactories(Collection<EPackage> ePackages) {
            return Collections.emptyList();
        }

    }

    private static class DummyAtomicProcessorRegistry implements IAtomicDerivedStateProcessorRegistry {

        private static final Class<?>[] RELEVANT_CLASSES = { IAtomicDerivedStateProcessor.class,
                AssociationMemberEndCalculator.class, UMLReferencingElementCalculator.class,
                XtextAssociationRemover.class, UMLReferencingElementRemover.class, XtextAssociationInitializer.class,
                VisibilityHavingElementInitializer.class };
        @SuppressWarnings("rawtypes")
        private static final Map<DerivedStateProcessorApplicability, Map<Class<?>, IAtomicDerivedStateProcessor>> PROCESSORS = getProcessors();

        @Inject
        public DummyAtomicProcessorRegistry(Injector injector) {
            PROCESSORS.values().stream().map(Map::values).flatMap(Collection::stream).distinct()
                    .forEach(injector::injectMembers);
        }

        @SuppressWarnings("rawtypes")
        private static Map<DerivedStateProcessorApplicability, Map<Class<?>, IAtomicDerivedStateProcessor>> getProcessors() {

            Map<DerivedStateProcessorApplicability, Map<Class<?>, IAtomicDerivedStateProcessor>> categories = new HashMap<>();
            for (DerivedStateProcessorApplicability applicability : DerivedStateProcessorApplicability.values()) {
                categories.put(applicability, new HashMap<>());
            }

            List<Class<?>> packageProvidingClasses = Arrays.asList(RELEVANT_CLASSES);
            Collection<URL> urls = packageProvidingClasses.stream()
                    .map(cls -> ClasspathHelper.forPackage(cls.getPackage().getName(), cls.getClassLoader()))
                    .flatMap(Collection::stream).collect(Collectors.toSet());
            String[] packageNames = packageProvidingClasses.stream().map(Class::getPackage).map(Package::getName)
                    .collect(Collectors.toSet()).toArray(new String[0]);
            Reflections reflections = new Reflections(
                    new ConfigurationBuilder().setUrls(urls).setScanners(new SubTypesScanner(false))
                            .filterInputsBy(new FilterBuilder().includePackage(packageNames)));
            Set<Class<? extends IAtomicDerivedStateProcessor>> subTypes = reflections
                    .getSubTypesOf(IAtomicDerivedStateProcessor.class).stream().filter(c -> !c.isInterface()
                            && !Modifier.isAbstract(c.getModifiers()) && Modifier.isPublic(c.getModifiers()))
                    .collect(Collectors.toSet());

            for (Class<? extends IAtomicDerivedStateProcessor> type : subTypes) {
                IAtomicDerivedStateProcessor<?> instance;
                try {
                    instance = type.newInstance();
                } catch (InstantiationException | IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
                Applicability applicabilities = instance.getClass().getAnnotation(Applicability.class);
                for (DerivedStateProcessorApplicability applicability : applicabilities.applicabilities()) {
                    categories.get(applicability).put(instance.getType(), instance);
                }
            }

            return categories;
        }

        @Override
        @SuppressWarnings("unchecked")
        public <T extends EObject> Optional<IAtomicDerivedStateProcessor<T>> findInitializer(Class<T> type) {
            return Optional.ofNullable(
                    PROCESSORS.get(DerivedStateProcessorApplicability.INITIALIZATION).getOrDefault(type, null));
        }

        @Override
        @SuppressWarnings("unchecked")
        public <T extends EObject> Optional<IAtomicDerivedStateProcessor<T>> findCleaner(Class<T> type) {
            return Optional
                    .ofNullable(PROCESSORS.get(DerivedStateProcessorApplicability.CLEANING).getOrDefault(type, null));
        }

        @Override
        @SuppressWarnings("unchecked")
        public <T extends EObject> Optional<IAtomicDerivedStateProcessor<T>> findCalculator(Class<T> type) {
            return Optional.ofNullable(
                    PROCESSORS.get(DerivedStateProcessorApplicability.CALCULATION).getOrDefault(type, null));
        }

    }

    @Override
    public ClassLoader bindClassLoaderToInstance() {
        return ClsInjectorProvider.class.getClassLoader();
    }

    @Override
    public Class<? extends IUMLUriFinder> bindIUMLUriFinder() {
        return SameNameUMLURIFinder.class;
    }

    @Override
    public Class<? extends IAutomatedIssueResolutionFactoryRegistry> bindIAutomatedIssueResolutionFactoryRegistry() {
        return DummyFactoryRegistry.class;
    }

    @Override
    public Class<? extends IAtomicDerivedStateProcessorRegistry> bindIAtomicDerivedStateProcessorRegistry() {
        return DummyAtomicProcessorRegistry.class;
    }

}

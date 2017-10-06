/*
 * generated by Xtext 2.11.0
 */
package de.cooperateproject.modeling.textual.usecase.validation;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;

import com.google.common.base.Strings;
import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.usecase.usecase.Actor;
import de.cooperateproject.modeling.textual.usecase.usecase.Extend;
import de.cooperateproject.modeling.textual.usecase.usecase.ExtensionPoint;
import de.cooperateproject.modeling.textual.usecase.usecase.RootPackage;
import de.cooperateproject.modeling.textual.usecase.usecase.System;
import de.cooperateproject.modeling.textual.usecase.usecase.UseCase;
import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.IIssueCodeRegistry;
import de.cooperateproject.modeling.textual.xtext.runtime.validator.ICooperateAutomatedValidator;

/**
 * This class contains custom validation rules.
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class UsecaseValidator extends AbstractUsecaseValidator {

    private static final String NAME_TAKEN = "name_taken";
    private static final String ALIAS_TAKEN = "alias_taken";
    private static final String EXTEND_AMBIGUOUS = "extend_ambiguous";

    @Inject
    @SuppressWarnings("unused")
    private ICooperateAutomatedValidator automatedValidator;

    @Inject
    @SuppressWarnings("unused")
    private IIssueCodeRegistry issueCodeRegistry;

    @Check
    private void checkUniqueActor(RootPackage rootPackage) {
        EList<Actor> actors = rootPackage.getActors();
        for (Actor actor : actors) {
            compareNamedElements(actors, actor, UsecasePackage.Literals.ROOT_PACKAGE__ACTORS, NAME_TAKEN);
            compareAliasedElements(actors, actor, UsecasePackage.Literals.ROOT_PACKAGE__ACTORS, ALIAS_TAKEN);
        }
    }

    @Check
    private void checkUniqueUseCase(UseCase useCase) {
        EList<UseCase> useCases = useCase.getSystem().getUsecases();
        compareNamedElements(useCases, useCase, UsecasePackage.Literals.USE_CASE__SYSTEM, NAME_TAKEN);
        compareAliasedElements(useCases, useCase, UsecasePackage.Literals.USE_CASE__SYSTEM, ALIAS_TAKEN);
    }

    @Check
    private void checkUniqueSystems(System system) {
        EList<System> systems = system.getPackage().getSystems();
        compareNamedElements(systems, system, UsecasePackage.Literals.SYSTEM__PACKAGE, NAME_TAKEN);
    }

    @Check
    private void checkConditionGivenForMultipleExtensions(RootPackage rootPackage) {
        Map<ExtensionPoint, List<Extend>> extensions = rootPackage.getRelationships().stream()
                .filter(Extend.class::isInstance).map(Extend.class::cast)
                .collect(Collectors.groupingBy(Extend::getExtensionLocation));
        extensions.entrySet().stream().map(Entry::getValue).filter(collection -> collection.size() > 1)
                .flatMap(collection -> collection.stream().filter(e -> Strings.isNullOrEmpty(e.getCondition())))
                .forEach(e -> error("A condition is required if more than one extension exists for an extension point.",
                        e, UsecasePackage.Literals.EXTEND__CONDITION, EXTEND_AMBIGUOUS, new String[0]));

    }

    private void compareNamedElements(List<? extends NamedElement> elements, NamedElement comparableElement,
            EStructuralFeature feature, String code) {
        for (NamedElement element : elements) {
            if (element.equals(comparableElement)) {
                continue;
            }
            if (element.getName().equals(comparableElement.getName())) {
                error("\"" + element.getName() + "\"" + " no duplicates!", feature, code);
            }

        }
    }

    private void compareAliasedElements(List<? extends AliasedElement> elements, AliasedElement comparableElement,
            EStructuralFeature feature, String code) {
        for (AliasedElement element : elements) {
            if (element.equals(comparableElement)) {
                continue;
            }
            if (element.getAlias().equals(comparableElement.getAlias())) {
                error("\"" + element.getAlias() + "\"" + " alias taken!", feature, code);
            }

        }
    }
}

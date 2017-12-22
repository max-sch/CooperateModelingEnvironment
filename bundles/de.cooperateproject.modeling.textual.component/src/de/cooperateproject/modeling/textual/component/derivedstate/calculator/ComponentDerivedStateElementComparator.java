/*
 * generated by Xtext 2.12.0
 */
package de.cooperateproject.modeling.textual.component.derivedstate.calculator;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import de.cooperateproject.modeling.textual.component.cmp.CmpPackage;
import de.cooperateproject.modeling.textual.component.cmp.RootPackage;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.TypeBasedDerivedStateComputerSorter;

public class ComponentDerivedStateElementComparator extends TypeBasedDerivedStateComputerSorter {

	public ComponentDerivedStateElementComparator() {
		super(createPriorityOrder());
	}

	@Override
	public int compare(EObject arg0, EObject arg1) {
		int result = super.compare(arg0, arg1);

		if (isRoot(arg0)) {
			return -1;
		} else if (isRoot(arg1)) {
			return 1;
		}

		return result;
	}

	private static List<EClass> createPriorityOrder() {
		return Arrays.asList(CmpPackage.Literals.CLASSIFIER, CmpPackage.Literals.PORT, CmpPackage.Literals.ATTRIBUTE,
				CmpPackage.Literals.CONNECTOR, CmpPackage.Literals.CONNECTOR_END);
	}

	private static boolean isRoot(EObject element) {
		return element instanceof RootPackage && ((RootPackage) element).getOwningPackage() == null;
	}
}
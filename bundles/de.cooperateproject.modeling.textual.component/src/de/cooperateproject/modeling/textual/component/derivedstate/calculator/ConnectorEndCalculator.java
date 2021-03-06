package de.cooperateproject.modeling.textual.component.derivedstate.calculator;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.component.component.Classifier;
import de.cooperateproject.modeling.textual.component.component.Component;
import de.cooperateproject.modeling.textual.component.component.Connector;
import de.cooperateproject.modeling.textual.component.component.ConnectorEnd;
import de.cooperateproject.modeling.textual.component.component.Port;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability;

/**
 * State calculator for ConnectorEnd.
 */
@Applicability(applicabilities = DerivedStateProcessorApplicability.CALCULATION)
public class ConnectorEndCalculator extends AtomicDerivedStateProcessorBase<ConnectorEnd> {

	public ConnectorEndCalculator() {
		super(ConnectorEnd.class);
	}

	@Override
	protected void applyTyped(ConnectorEnd object) {

		if (object.eContainer() instanceof Connector) {
			Connector connector = (Connector) object.eContainer();

			if (connector.getReferencedElement() != null && object.getRole() != null && object.getRole().getReferencedElement() != null) {

				final org.eclipse.uml2.uml.Connector umlConnector =connector.getReferencedElement();
				final org.eclipse.uml2.uml.Port umlPort = object.getRole().getReferencedElement();

				Optional<org.eclipse.uml2.uml.ConnectorEnd> umlEnd;

				if (object.getPart() != null && object.getPart().getReferencedElement() != null) {
					final Property umlPart = object.getPart().getReferencedElement();
					umlEnd = umlConnector.getEnds().stream()
							.filter(e -> e.getRole() == umlPort && e.getPartWithPort() == umlPart).findFirst();
				} else {
					umlEnd = umlConnector.getEnds().stream().filter(e -> e.getRole() == umlPort).findFirst();
				}

				if (umlEnd.isPresent()) {
					object.setReferencedElement(umlEnd.get());
				}

			}
		}
	}

	@Override
	public Collection<Class<? extends EObject>> getReplacements() {
		return Arrays.asList(UMLReferencingElement.class);
	}

}

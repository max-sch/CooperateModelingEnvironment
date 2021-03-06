/**
 */
package de.cooperateproject.modeling.textual.cls.cls;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import org.eclipse.uml2.uml.DirectedRelationship;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.TypedConnector#getLeft <em>Left</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.TypedConnector#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getTypedConnector()
 * @model abstract="true"
 * @generated
 */
public interface TypedConnector<T extends DirectedRelationship> extends Connector, UMLReferencingElement<T> {
    /**
     * Returns the value of the '<em><b>Left</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Left</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Left</em>' reference.
     * @see #setLeft(Classifier)
     * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getTypedConnector_Left()
     * @model required="true" transient="true"
     * @generated
     */
    Classifier<? extends org.eclipse.uml2.uml.Classifier> getLeft();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.TypedConnector#getLeft <em>Left</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Left</em>' reference.
     * @see #getLeft()
     * @generated
     */
    void setLeft(Classifier<? extends org.eclipse.uml2.uml.Classifier> value);

    /**
     * Returns the value of the '<em><b>Right</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Right</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Right</em>' reference.
     * @see #setRight(Classifier)
     * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getTypedConnector_Right()
     * @model required="true" transient="true"
     * @generated
     */
    Classifier<? extends org.eclipse.uml2.uml.Classifier> getRight();

    /**
     * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.TypedConnector#getRight <em>Right</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Right</em>' reference.
     * @see #getRight()
     * @generated
     */
    void setRight(Classifier<? extends org.eclipse.uml2.uml.Classifier> value);

} // TypedConnector

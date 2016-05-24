/**
 * generated by Xtext 2.9.2
 */
package de.cooperateproject.modeling.textual.cls.cls;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.AssociationEnd#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getAssociationEnd()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface AssociationEnd extends CDOObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(ClassName)
   * @see de.cooperateproject.modeling.textual.cls.cls.ClsPackage#getAssociationEnd_Type()
   * @model
   * @generated
   */
  ClassName getType();

  /**
   * Sets the value of the '{@link de.cooperateproject.modeling.textual.cls.cls.AssociationEnd#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(ClassName value);

} // AssociationEnd
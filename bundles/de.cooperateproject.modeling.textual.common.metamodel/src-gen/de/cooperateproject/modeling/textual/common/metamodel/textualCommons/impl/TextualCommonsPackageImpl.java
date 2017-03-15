/**
 */
package de.cooperateproject.modeling.textual.common.metamodel.textualCommons.impl;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Comment;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Commentable;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Element;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageImport;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageableElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsFactory;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Visibility;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextualCommonsPackageImpl extends EPackageImpl implements TextualCommonsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aliasedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlReferencingElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TextualCommonsPackageImpl() {
		super(eNS_URI, TextualCommonsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TextualCommonsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TextualCommonsPackage init() {
		if (isInited) return (TextualCommonsPackage)EPackage.Registry.INSTANCE.getEPackage(TextualCommonsPackage.eNS_URI);

		// Obtain or create and register package
		TextualCommonsPackageImpl theTextualCommonsPackage = (TextualCommonsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TextualCommonsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TextualCommonsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTextualCommonsPackage.createPackageContents();

		// Initialize created meta-data
		theTextualCommonsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTextualCommonsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TextualCommonsPackage.eNS_URI, theTextualCommonsPackage);
		return theTextualCommonsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__GetNearestPackage() {
		return elementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAliasedElement() {
		return aliasedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasedElement_Alias() {
		return (EAttribute)aliasedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLReferencingElement() {
		return umlReferencingElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLReferencingElement_ReferencedElement() {
		return (EReference)umlReferencingElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageBase() {
		return packageBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageBase_OwningPackage() {
		return (EReference)packageBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageBase_Packages() {
		return (EReference)packageBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageBase_PackageImports() {
		return (EReference)packageBaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommentable() {
		return commentableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommentable_Comments() {
		return (EReference)commentableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComment_CommentedElement() {
		return (EReference)commentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Body() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardinality() {
		return cardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardinality_LowerBound() {
		return (EAttribute)cardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardinality_UpperBound() {
		return (EAttribute)cardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageableElement() {
		return packageableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageImport() {
		return packageImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageImport_ImportedPackage() {
		return (EAttribute)packageImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageImport_ImportingPackage() {
		return (EReference)packageImportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibility() {
		return visibilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextualCommonsFactory getTextualCommonsFactory() {
		return (TextualCommonsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		elementEClass = createEClass(ELEMENT);
		createEOperation(elementEClass, ELEMENT___GET_NEAREST_PACKAGE);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		aliasedElementEClass = createEClass(ALIASED_ELEMENT);
		createEAttribute(aliasedElementEClass, ALIASED_ELEMENT__ALIAS);

		umlReferencingElementEClass = createEClass(UML_REFERENCING_ELEMENT);
		createEReference(umlReferencingElementEClass, UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT);

		packageBaseEClass = createEClass(PACKAGE_BASE);
		createEReference(packageBaseEClass, PACKAGE_BASE__OWNING_PACKAGE);
		createEReference(packageBaseEClass, PACKAGE_BASE__PACKAGES);
		createEReference(packageBaseEClass, PACKAGE_BASE__PACKAGE_IMPORTS);

		commentableEClass = createEClass(COMMENTABLE);
		createEReference(commentableEClass, COMMENTABLE__COMMENTS);

		commentEClass = createEClass(COMMENT);
		createEReference(commentEClass, COMMENT__COMMENTED_ELEMENT);
		createEAttribute(commentEClass, COMMENT__BODY);

		cardinalityEClass = createEClass(CARDINALITY);
		createEAttribute(cardinalityEClass, CARDINALITY__LOWER_BOUND);
		createEAttribute(cardinalityEClass, CARDINALITY__UPPER_BOUND);

		packageableElementEClass = createEClass(PACKAGEABLE_ELEMENT);

		packageImportEClass = createEClass(PACKAGE_IMPORT);
		createEAttribute(packageImportEClass, PACKAGE_IMPORT__IMPORTED_PACKAGE);
		createEReference(packageImportEClass, PACKAGE_IMPORT__IMPORTING_PACKAGE);

		// Create enums
		visibilityEEnum = createEEnum(VISIBILITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters
		ETypeParameter umlReferencingElementEClass_UMLType = addETypeParameter(umlReferencingElementEClass, "UMLType");
		ETypeParameter packageBaseEClass_PackageType = addETypeParameter(packageBaseEClass, "PackageType");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(theUMLPackage.getElement());
		umlReferencingElementEClass_UMLType.getEBounds().add(g1);
		g1 = createEGenericType(this.getPackageBase());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		packageBaseEClass_PackageType.getEBounds().add(g1);

		// Add supertypes to classes
		namedElementEClass.getESuperTypes().add(this.getElement());
		aliasedElementEClass.getESuperTypes().add(this.getNamedElement());
		umlReferencingElementEClass.getESuperTypes().add(this.getElement());
		g1 = createEGenericType(this.getUMLReferencingElement());
		g2 = createEGenericType(theUMLPackage.getPackage());
		g1.getETypeArguments().add(g2);
		packageBaseEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getNamedElement());
		packageBaseEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUMLReferencingElement());
		g2 = createEGenericType(theUMLPackage.getComment());
		g1.getETypeArguments().add(g2);
		commentEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUMLReferencingElement());
		g2 = createEGenericType(theUMLPackage.getPackageImport());
		g1.getETypeArguments().add(g2);
		packageImportEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getElement__GetNearestPackage(), null, "getNearestPackage", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getPackageBase());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aliasedElementEClass, AliasedElement.class, "AliasedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAliasedElement_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, AliasedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlReferencingElementEClass, UMLReferencingElement.class, "UMLReferencingElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(umlReferencingElementEClass_UMLType);
		initEReference(getUMLReferencingElement_ReferencedElement(), g1, null, "referencedElement", null, 0, 1, UMLReferencingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageBaseEClass, PackageBase.class, "PackageBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(packageBaseEClass_PackageType);
		initEReference(getPackageBase_OwningPackage(), g1, this.getPackageBase_Packages(), "owningPackage", null, 0, 1, PackageBase.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(packageBaseEClass_PackageType);
		initEReference(getPackageBase_Packages(), g1, this.getPackageBase_OwningPackage(), "packages", null, 0, -1, PackageBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageBase_PackageImports(), this.getPackageImport(), this.getPackageImport_ImportingPackage(), "packageImports", null, 0, -1, PackageBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commentableEClass, Commentable.class, "Commentable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommentable_Comments(), this.getComment(), this.getComment_CommentedElement(), "comments", null, 0, -1, Commentable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComment_CommentedElement(), this.getCommentable(), this.getCommentable_Comments(), "commentedElement", null, 1, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComment_Body(), ecorePackage.getEString(), "body", null, 1, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardinalityEClass, Cardinality.class, "Cardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCardinality_LowerBound(), theEcorePackage.getEInt(), "lowerBound", null, 0, 1, Cardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardinality_UpperBound(), ecorePackage.getEInt(), "upperBound", null, 0, 1, Cardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageableElementEClass, PackageableElement.class, "PackageableElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(packageImportEClass, PackageImport.class, "PackageImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackageImport_ImportedPackage(), ecorePackage.getEString(), "importedPackage", null, 1, 1, PackageImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getPackageBase());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getPackageImport_ImportingPackage(), g1, this.getPackageBase_PackageImports(), "importingPackage", null, 1, 1, PackageImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(visibilityEEnum, Visibility.class, "Visibility");
		addEEnumLiteral(visibilityEEnum, Visibility.UNDEFINED);
		addEEnumLiteral(visibilityEEnum, Visibility.PUBLIC);
		addEEnumLiteral(visibilityEEnum, Visibility.PRIVATE);
		addEEnumLiteral(visibilityEEnum, Visibility.PROTECTED);
		addEEnumLiteral(visibilityEEnum, Visibility.PACKAGE);

		// Create resource
		createResource(eNS_URI);
	}

} //TextualCommonsPackageImpl
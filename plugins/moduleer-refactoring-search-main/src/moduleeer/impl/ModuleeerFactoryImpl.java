/**
 */
package moduleeer.impl;

import moduleeer.Aggregation;
import moduleeer.AttributeType;
import moduleeer.CardinalityType;
import moduleeer.CompletenessType;
import moduleeer.CompositeAttribute;
import moduleeer.DisjointnessType;
import moduleeer.EntityType;
import moduleeer.Generalization;
import moduleeer.LinkToEntity;
import moduleeer.MEERModel;
import moduleeer.ModuleeerFactory;
import moduleeer.ModuleeerPackage;
import moduleeer.RelationshipType;
import moduleeer.SingleAttribute;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModuleeerFactoryImpl extends EFactoryImpl implements ModuleeerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModuleeerFactory init() {
		try {
			ModuleeerFactory theModuleeerFactory = (ModuleeerFactory)EPackage.Registry.INSTANCE.getEFactory(ModuleeerPackage.eNS_URI);
			if (theModuleeerFactory != null) {
				return theModuleeerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModuleeerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleeerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModuleeerPackage.MEER_MODEL: return (EObject)createMEERModel();
			case ModuleeerPackage.MODULE: return (EObject)createModule();
			case ModuleeerPackage.ENTITY_TYPE: return (EObject)createEntityType();
			case ModuleeerPackage.RELATIONSHIP_TYPE: return (EObject)createRelationshipType();
			case ModuleeerPackage.SINGLE_ATTRIBUTE: return (EObject)createSingleAttribute();
			case ModuleeerPackage.COMPOSITE_ATTRIBUTE: return (EObject)createCompositeAttribute();
			case ModuleeerPackage.GENERALIZATION: return (EObject)createGeneralization();
			case ModuleeerPackage.AGGREGATION: return (EObject)createAggregation();
			case ModuleeerPackage.LINK_TO_ENTITY: return (EObject)createLinkToEntity();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ModuleeerPackage.ATTRIBUTE_TYPE:
				return createAttributeTypeFromString(eDataType, initialValue);
			case ModuleeerPackage.CARDINALITY_TYPE:
				return createCardinalityTypeFromString(eDataType, initialValue);
			case ModuleeerPackage.DISJOINTNESS_TYPE:
				return createDisjointnessTypeFromString(eDataType, initialValue);
			case ModuleeerPackage.COMPLETENESS_TYPE:
				return createCompletenessTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ModuleeerPackage.ATTRIBUTE_TYPE:
				return convertAttributeTypeToString(eDataType, instanceValue);
			case ModuleeerPackage.CARDINALITY_TYPE:
				return convertCardinalityTypeToString(eDataType, instanceValue);
			case ModuleeerPackage.DISJOINTNESS_TYPE:
				return convertDisjointnessTypeToString(eDataType, instanceValue);
			case ModuleeerPackage.COMPLETENESS_TYPE:
				return convertCompletenessTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MEERModel createMEERModel() {
		MEERModelImpl meerModel = new MEERModelImpl();
		return meerModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public moduleeer.Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType createEntityType() {
		EntityTypeImpl entityType = new EntityTypeImpl();
		return entityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipType createRelationshipType() {
		RelationshipTypeImpl relationshipType = new RelationshipTypeImpl();
		return relationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleAttribute createSingleAttribute() {
		SingleAttributeImpl singleAttribute = new SingleAttributeImpl();
		return singleAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeAttribute createCompositeAttribute() {
		CompositeAttributeImpl compositeAttribute = new CompositeAttributeImpl();
		return compositeAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization createGeneralization() {
		GeneralizationImpl generalization = new GeneralizationImpl();
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aggregation createAggregation() {
		AggregationImpl aggregation = new AggregationImpl();
		return aggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkToEntity createLinkToEntity() {
		LinkToEntityImpl linkToEntity = new LinkToEntityImpl();
		return linkToEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeType createAttributeTypeFromString(EDataType eDataType, String initialValue) {
		AttributeType result = AttributeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardinalityType createCardinalityTypeFromString(EDataType eDataType, String initialValue) {
		CardinalityType result = CardinalityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCardinalityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisjointnessType createDisjointnessTypeFromString(EDataType eDataType, String initialValue) {
		DisjointnessType result = DisjointnessType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisjointnessTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompletenessType createCompletenessTypeFromString(EDataType eDataType, String initialValue) {
		CompletenessType result = CompletenessType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompletenessTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleeerPackage getModuleeerPackage() {
		return (ModuleeerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModuleeerPackage getPackage() {
		return ModuleeerPackage.eINSTANCE;
	}

} //ModuleeerFactoryImpl

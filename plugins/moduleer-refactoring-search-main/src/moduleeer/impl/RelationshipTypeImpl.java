/**
 */
package moduleeer.impl;

import moduleeer.Aggregation;
import moduleeer.LinkToEntity;
import moduleeer.ModuleeerPackage;
import moduleeer.RelationshipType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link moduleeer.impl.RelationshipTypeImpl#getGeneralizes <em>Generalizes</em>}</li>
 *   <li>{@link moduleeer.impl.RelationshipTypeImpl#getLinksToEntities <em>Links To Entities</em>}</li>
 *   <li>{@link moduleeer.impl.RelationshipTypeImpl#getAggregations <em>Aggregations</em>}</li>
 *   <li>{@link moduleeer.impl.RelationshipTypeImpl#getAssociations <em>Associations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipTypeImpl extends ElementImpl implements RelationshipType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModuleeerPackage.Literals.RELATIONSHIP_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<RelationshipType> getGeneralizes() {
		return (EList<RelationshipType>)eGet(ModuleeerPackage.Literals.RELATIONSHIP_TYPE__GENERALIZES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<LinkToEntity> getLinksToEntities() {
		return (EList<LinkToEntity>)eGet(ModuleeerPackage.Literals.RELATIONSHIP_TYPE__LINKS_TO_ENTITIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Aggregation> getAggregations() {
		return (EList<Aggregation>)eGet(ModuleeerPackage.Literals.RELATIONSHIP_TYPE__AGGREGATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<LinkToEntity> getAssociations() {
		return (EList<LinkToEntity>)eGet(ModuleeerPackage.Literals.RELATIONSHIP_TYPE__ASSOCIATIONS, true);
	}

} //RelationshipTypeImpl

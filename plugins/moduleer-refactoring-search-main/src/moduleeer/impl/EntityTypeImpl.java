/**
 */
package moduleeer.impl;

import moduleeer.EntityType;
import moduleeer.Generalization;
import moduleeer.LinkToEntity;
import moduleeer.ModuleeerPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link moduleeer.impl.EntityTypeImpl#getGeneralizations <em>Generalizations</em>}</li>
 *   <li>{@link moduleeer.impl.EntityTypeImpl#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link moduleeer.impl.EntityTypeImpl#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityTypeImpl extends ElementImpl implements EntityType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModuleeerPackage.Literals.ENTITY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Generalization> getGeneralizations() {
		return (EList<Generalization>)eGet(ModuleeerPackage.Literals.ENTITY_TYPE__GENERALIZATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Generalization> getSpecializations() {
		return (EList<Generalization>)eGet(ModuleeerPackage.Literals.ENTITY_TYPE__SPECIALIZATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<LinkToEntity> getLinks() {
		return (EList<LinkToEntity>)eGet(ModuleeerPackage.Literals.ENTITY_TYPE__LINKS, true);
	}

} //EntityTypeImpl

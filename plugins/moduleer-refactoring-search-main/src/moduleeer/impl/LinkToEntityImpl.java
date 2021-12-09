/**
 */
package moduleeer.impl;

import moduleeer.EntityType;
import moduleeer.LinkToEntity;
import moduleeer.ModuleeerPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link To Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link moduleeer.impl.LinkToEntityImpl#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkToEntityImpl extends LinkImpl implements LinkToEntity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkToEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModuleeerPackage.Literals.LINK_TO_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType getEntity() {
		return (EntityType)eGet(ModuleeerPackage.Literals.LINK_TO_ENTITY__ENTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(EntityType newEntity) {
		eSet(ModuleeerPackage.Literals.LINK_TO_ENTITY__ENTITY, newEntity);
	}

} //LinkToEntityImpl

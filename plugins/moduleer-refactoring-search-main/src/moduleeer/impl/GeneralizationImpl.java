/**
 */
package moduleeer.impl;

import moduleeer.CompletenessType;
import moduleeer.DisjointnessType;
import moduleeer.EntityType;
import moduleeer.Generalization;
import moduleeer.ModuleeerPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link moduleeer.impl.GeneralizationImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link moduleeer.impl.GeneralizationImpl#getCompleteness <em>Completeness</em>}</li>
 *   <li>{@link moduleeer.impl.GeneralizationImpl#getDisjointness <em>Disjointness</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneralizationImpl extends NameElementImpl implements Generalization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModuleeerPackage.Literals.GENERALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType getEntity() {
		return (EntityType)eGet(ModuleeerPackage.Literals.GENERALIZATION__ENTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(EntityType newEntity) {
		eSet(ModuleeerPackage.Literals.GENERALIZATION__ENTITY, newEntity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompletenessType getCompleteness() {
		return (CompletenessType)eGet(ModuleeerPackage.Literals.GENERALIZATION__COMPLETENESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompleteness(CompletenessType newCompleteness) {
		eSet(ModuleeerPackage.Literals.GENERALIZATION__COMPLETENESS, newCompleteness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisjointnessType getDisjointness() {
		return (DisjointnessType)eGet(ModuleeerPackage.Literals.GENERALIZATION__DISJOINTNESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisjointness(DisjointnessType newDisjointness) {
		eSet(ModuleeerPackage.Literals.GENERALIZATION__DISJOINTNESS, newDisjointness);
	}

} //GeneralizationImpl

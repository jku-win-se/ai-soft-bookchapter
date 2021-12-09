/**
 */
package moduleeer.impl;

import moduleeer.CardinalityType;
import moduleeer.CompletenessType;
import moduleeer.Link;
import moduleeer.ModuleeerPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link moduleeer.impl.LinkImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link moduleeer.impl.LinkImpl#getCompleteness <em>Completeness</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LinkImpl extends NameElementImpl implements Link {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModuleeerPackage.Literals.LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardinalityType getCardinality() {
		return (CardinalityType)eGet(ModuleeerPackage.Literals.LINK__CARDINALITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(CardinalityType newCardinality) {
		eSet(ModuleeerPackage.Literals.LINK__CARDINALITY, newCardinality);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompletenessType getCompleteness() {
		return (CompletenessType)eGet(ModuleeerPackage.Literals.LINK__COMPLETENESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompleteness(CompletenessType newCompleteness) {
		eSet(ModuleeerPackage.Literals.LINK__COMPLETENESS, newCompleteness);
	}

} //LinkImpl

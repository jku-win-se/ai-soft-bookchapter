/**
 */
package moduleeer.impl;

import moduleeer.Aggregation;
import moduleeer.ModuleeerPackage;
import moduleeer.RelationshipType;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link moduleeer.impl.AggregationImpl#getTo <em>To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AggregationImpl extends LinkImpl implements Aggregation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModuleeerPackage.Literals.AGGREGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipType getTo() {
		return (RelationshipType)eGet(ModuleeerPackage.Literals.AGGREGATION__TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(RelationshipType newTo) {
		eSet(ModuleeerPackage.Literals.AGGREGATION__TO, newTo);
	}

} //AggregationImpl

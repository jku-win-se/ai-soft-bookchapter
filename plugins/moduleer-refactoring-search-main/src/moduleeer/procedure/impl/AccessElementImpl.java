/**
 */
package moduleeer.procedure.impl;

import moduleeer.Element;

import moduleeer.procedure.AccessElement;
import moduleeer.procedure.OperationType;
import moduleeer.procedure.ProcedurePackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link moduleeer.procedure.impl.AccessElementImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link moduleeer.procedure.impl.AccessElementImpl#getAccessType <em>Access Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessElementImpl extends CDOObjectImpl implements AccessElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcedurePackage.Literals.ACCESS_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getEntity() {
		return (Element)eGet(ProcedurePackage.Literals.ACCESS_ELEMENT__ENTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(Element newEntity) {
		eSet(ProcedurePackage.Literals.ACCESS_ELEMENT__ENTITY, newEntity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationType getAccessType() {
		return (OperationType)eGet(ProcedurePackage.Literals.ACCESS_ELEMENT__ACCESS_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessType(OperationType newAccessType) {
		eSet(ProcedurePackage.Literals.ACCESS_ELEMENT__ACCESS_TYPE, newAccessType);
	}

} //AccessElementImpl

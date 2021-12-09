/**
 */
package moduleeer.procedure.impl;

import moduleeer.impl.ModularizableElementImpl;

import moduleeer.procedure.AccessElement;
import moduleeer.procedure.Event;
import moduleeer.procedure.Procedure;
import moduleeer.procedure.ProcedurePackage;
import moduleeer.procedure.ProcedureType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link moduleeer.procedure.impl.ProcedureImpl#getProcedureType <em>Procedure Type</em>}</li>
 *   <li>{@link moduleeer.procedure.impl.ProcedureImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link moduleeer.procedure.impl.ProcedureImpl#getAccessElements <em>Access Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcedureImpl extends ModularizableElementImpl implements Procedure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcedurePackage.Literals.PROCEDURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureType getProcedureType() {
		return (ProcedureType)eGet(ProcedurePackage.Literals.PROCEDURE__PROCEDURE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcedureType(ProcedureType newProcedureType) {
		eSet(ProcedurePackage.Literals.PROCEDURE__PROCEDURE_TYPE, newProcedureType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getEvent() {
		return (Event)eGet(ProcedurePackage.Literals.PROCEDURE__EVENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(Event newEvent) {
		eSet(ProcedurePackage.Literals.PROCEDURE__EVENT, newEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AccessElement> getAccessElements() {
		return (EList<AccessElement>)eGet(ProcedurePackage.Literals.PROCEDURE__ACCESS_ELEMENTS, true);
	}

} //ProcedureImpl

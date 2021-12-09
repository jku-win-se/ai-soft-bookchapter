/**
 */
package moduleeer.procedure.impl;

import moduleeer.impl.NameElementImpl;

import moduleeer.procedure.Event;
import moduleeer.procedure.Procedure;
import moduleeer.procedure.ProcedurePackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link moduleeer.procedure.impl.EventImpl#getIntegrityProcedures <em>Integrity Procedures</em>}</li>
 *   <li>{@link moduleeer.procedure.impl.EventImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventImpl extends NameElementImpl implements Event {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcedurePackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Procedure> getIntegrityProcedures() {
		return (EList<Procedure>)eGet(ProcedurePackage.Literals.EVENT__INTEGRITY_PROCEDURES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(ProcedurePackage.Literals.EVENT__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(ProcedurePackage.Literals.EVENT__DESCRIPTION, newDescription);
	}

} //EventImpl

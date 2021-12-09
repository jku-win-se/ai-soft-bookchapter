/**
 */
package moduleeer.procedure;

import moduleeer.NameElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link moduleeer.procedure.Event#getIntegrityProcedures <em>Integrity Procedures</em>}</li>
 *   <li>{@link moduleeer.procedure.Event#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see moduleeer.procedure.ProcedurePackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends NameElement {
	/**
	 * Returns the value of the '<em><b>Integrity Procedures</b></em>' reference list.
	 * The list contents are of type {@link moduleeer.procedure.Procedure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integrity Procedures</em>' reference list.
	 * @see moduleeer.procedure.ProcedurePackage#getEvent_IntegrityProcedures()
	 * @model
	 * @generated
	 */
	EList<Procedure> getIntegrityProcedures();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see moduleeer.procedure.ProcedurePackage#getEvent_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link moduleeer.procedure.Event#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Event

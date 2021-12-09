/**
 */
package moduleeer.procedure;

import moduleeer.Element;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link moduleeer.procedure.AccessElement#getEntity <em>Entity</em>}</li>
 *   <li>{@link moduleeer.procedure.AccessElement#getAccessType <em>Access Type</em>}</li>
 * </ul>
 *
 * @see moduleeer.procedure.ProcedurePackage#getAccessElement()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface AccessElement extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link moduleeer.Element#getAccessElement <em>Access Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Element)
	 * @see moduleeer.procedure.ProcedurePackage#getAccessElement_Entity()
	 * @see moduleeer.Element#getAccessElement
	 * @model opposite="accessElement" required="true"
	 * @generated
	 */
	Element getEntity();

	/**
	 * Sets the value of the '{@link moduleeer.procedure.AccessElement#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Element value);

	/**
	 * Returns the value of the '<em><b>Access Type</b></em>' attribute.
	 * The literals are from the enumeration {@link moduleeer.procedure.OperationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Type</em>' attribute.
	 * @see moduleeer.procedure.OperationType
	 * @see #setAccessType(OperationType)
	 * @see moduleeer.procedure.ProcedurePackage#getAccessElement_AccessType()
	 * @model
	 * @generated
	 */
	OperationType getAccessType();

	/**
	 * Sets the value of the '{@link moduleeer.procedure.AccessElement#getAccessType <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Type</em>' attribute.
	 * @see moduleeer.procedure.OperationType
	 * @see #getAccessType()
	 * @generated
	 */
	void setAccessType(OperationType value);

} // AccessElement

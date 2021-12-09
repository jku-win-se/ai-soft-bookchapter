/**
 */
package moduleeer;

import org.eclipse.emf.cdo.*;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link moduleeer.NameElement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see moduleeer.ModuleeerPackage#getNameElement()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface NameElement extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see moduleeer.ModuleeerPackage#getNameElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link moduleeer.NameElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // NameElement

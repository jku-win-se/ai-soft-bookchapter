/**
 */
package moduleeer;

import moduleeer.procedure.Event;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link moduleeer.Module#getEvents <em>Events</em>}</li>
 *   <li>{@link moduleeer.Module#getModularizableElements <em>Modularizable Elements</em>}</li>
 * </ul>
 *
 * @see moduleeer.ModuleeerPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends ModularizableElement {
	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link moduleeer.procedure.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see moduleeer.ModuleeerPackage#getModule_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Modularizable Elements</b></em>' containment reference list.
	 * The list contents are of type {@link moduleeer.ModularizableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modularizable Elements</em>' containment reference list.
	 * @see moduleeer.ModuleeerPackage#getModule_ModularizableElements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ModularizableElement> getModularizableElements();

} // Module

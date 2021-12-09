/**
 */
package moduleeer;

import moduleeer.subsystem.ModuleSubsystem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MEER Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link moduleeer.MEERModel#getSubsystems <em>Subsystems</em>}</li>
 *   <li>{@link moduleeer.MEERModel#getModules <em>Modules</em>}</li>
 * </ul>
 *
 * @see moduleeer.ModuleeerPackage#getMEERModel()
 * @model
 * @generated
 */
public interface MEERModel extends NameElement {
	/**
	 * Returns the value of the '<em><b>Subsystems</b></em>' containment reference list.
	 * The list contents are of type {@link moduleeer.subsystem.ModuleSubsystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsystems</em>' containment reference list.
	 * @see moduleeer.ModuleeerPackage#getMEERModel_Subsystems()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModuleSubsystem> getSubsystems();

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link moduleeer.Module}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see moduleeer.ModuleeerPackage#getMEERModel_Modules()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<moduleeer.Module> getModules();

} // MEERModel

/**
 */
package moduleeer.subsystem;

import moduleeer.NameElement;

import moduleeer.procedure.Procedure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Subsystem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link moduleeer.subsystem.ModuleSubsystem#getProcedures <em>Procedures</em>}</li>
 * </ul>
 *
 * @see moduleeer.subsystem.SubsystemPackage#getModuleSubsystem()
 * @model
 * @generated
 */
public interface ModuleSubsystem extends NameElement {
	/**
	 * Returns the value of the '<em><b>Procedures</b></em>' reference list.
	 * The list contents are of type {@link moduleeer.procedure.Procedure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedures</em>' reference list.
	 * @see moduleeer.subsystem.SubsystemPackage#getModuleSubsystem_Procedures()
	 * @model
	 * @generated
	 */
	EList<Procedure> getProcedures();

} // ModuleSubsystem

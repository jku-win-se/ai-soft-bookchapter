/**
 */
package moduleeer.subsystem.impl;

import moduleeer.impl.NameElementImpl;

import moduleeer.procedure.Procedure;

import moduleeer.subsystem.ModuleSubsystem;
import moduleeer.subsystem.SubsystemPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Subsystem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link moduleeer.subsystem.impl.ModuleSubsystemImpl#getProcedures <em>Procedures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleSubsystemImpl extends NameElementImpl implements ModuleSubsystem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleSubsystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SubsystemPackage.Literals.MODULE_SUBSYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Procedure> getProcedures() {
		return (EList<Procedure>)eGet(SubsystemPackage.Literals.MODULE_SUBSYSTEM__PROCEDURES, true);
	}

} //ModuleSubsystemImpl

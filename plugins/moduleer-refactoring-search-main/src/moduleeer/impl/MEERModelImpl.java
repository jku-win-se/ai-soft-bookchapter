/**
 */
package moduleeer.impl;

import moduleeer.MEERModel;
import moduleeer.ModuleeerPackage;

import moduleeer.subsystem.ModuleSubsystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MEER Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link moduleeer.impl.MEERModelImpl#getSubsystems <em>Subsystems</em>}</li>
 *   <li>{@link moduleeer.impl.MEERModelImpl#getModules <em>Modules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MEERModelImpl extends NameElementImpl implements MEERModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MEERModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModuleeerPackage.Literals.MEER_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ModuleSubsystem> getSubsystems() {
		return (EList<ModuleSubsystem>)eGet(ModuleeerPackage.Literals.MEER_MODEL__SUBSYSTEMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<moduleeer.Module> getModules() {
		return (EList<moduleeer.Module>)eGet(ModuleeerPackage.Literals.MEER_MODEL__MODULES, true);
	}

} //MEERModelImpl

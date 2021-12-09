/**
 */
package moduleeer.impl;

import moduleeer.ModularizableElement;
import moduleeer.ModuleeerPackage;

import moduleeer.procedure.Event;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link moduleeer.impl.ModuleImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link moduleeer.impl.ModuleImpl#getModularizableElements <em>Modularizable Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleImpl extends ModularizableElementImpl implements moduleeer.Module {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModuleeerPackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Event> getEvents() {
		return (EList<Event>)eGet(ModuleeerPackage.Literals.MODULE__EVENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ModularizableElement> getModularizableElements() {
		return (EList<ModularizableElement>)eGet(ModuleeerPackage.Literals.MODULE__MODULARIZABLE_ELEMENTS, true);
	}

} //ModuleImpl

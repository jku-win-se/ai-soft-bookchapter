/**
 */
package moduleeer.impl;

import moduleeer.Attribute;
import moduleeer.Element;
import moduleeer.ModuleeerPackage;

import moduleeer.procedure.AccessElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link moduleeer.impl.ElementImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link moduleeer.impl.ElementImpl#getAccessElement <em>Access Element</em>}</li>
 *   <li>{@link moduleeer.impl.ElementImpl#isIsWeak <em>Is Weak</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ElementImpl extends ModularizableElementImpl implements Element {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModuleeerPackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Attribute> getAttributes() {
		return (EList<Attribute>)eGet(ModuleeerPackage.Literals.ELEMENT__ATTRIBUTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AccessElement> getAccessElement() {
		return (EList<AccessElement>)eGet(ModuleeerPackage.Literals.ELEMENT__ACCESS_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsWeak() {
		return (Boolean)eGet(ModuleeerPackage.Literals.ELEMENT__IS_WEAK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsWeak(boolean newIsWeak) {
		eSet(ModuleeerPackage.Literals.ELEMENT__IS_WEAK, newIsWeak);
	}

} //ElementImpl

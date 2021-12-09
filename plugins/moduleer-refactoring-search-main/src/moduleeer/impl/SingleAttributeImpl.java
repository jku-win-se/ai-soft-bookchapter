/**
 */
package moduleeer.impl;

import moduleeer.AttributeType;
import moduleeer.ModuleeerPackage;
import moduleeer.SingleAttribute;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link moduleeer.impl.SingleAttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link moduleeer.impl.SingleAttributeImpl#isIsKey <em>Is Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleAttributeImpl extends AttributeImpl implements SingleAttribute {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModuleeerPackage.Literals.SINGLE_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeType getType() {
		return (AttributeType)eGet(ModuleeerPackage.Literals.SINGLE_ATTRIBUTE__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(AttributeType newType) {
		eSet(ModuleeerPackage.Literals.SINGLE_ATTRIBUTE__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsKey() {
		return (Boolean)eGet(ModuleeerPackage.Literals.SINGLE_ATTRIBUTE__IS_KEY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsKey(boolean newIsKey) {
		eSet(ModuleeerPackage.Literals.SINGLE_ATTRIBUTE__IS_KEY, newIsKey);
	}

} //SingleAttributeImpl

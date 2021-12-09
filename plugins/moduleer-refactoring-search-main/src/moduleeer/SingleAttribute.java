/**
 */
package moduleeer;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link moduleeer.SingleAttribute#getType <em>Type</em>}</li>
 *   <li>{@link moduleeer.SingleAttribute#isIsKey <em>Is Key</em>}</li>
 * </ul>
 *
 * @see moduleeer.ModuleeerPackage#getSingleAttribute()
 * @model
 * @generated
 */
public interface SingleAttribute extends Attribute {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link moduleeer.AttributeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see moduleeer.AttributeType
	 * @see #setType(AttributeType)
	 * @see moduleeer.ModuleeerPackage#getSingleAttribute_Type()
	 * @model
	 * @generated
	 */
	AttributeType getType();

	/**
	 * Sets the value of the '{@link moduleeer.SingleAttribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see moduleeer.AttributeType
	 * @see #getType()
	 * @generated
	 */
	void setType(AttributeType value);

	/**
	 * Returns the value of the '<em><b>Is Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Key</em>' attribute.
	 * @see #setIsKey(boolean)
	 * @see moduleeer.ModuleeerPackage#getSingleAttribute_IsKey()
	 * @model
	 * @generated
	 */
	boolean isIsKey();

	/**
	 * Sets the value of the '{@link moduleeer.SingleAttribute#isIsKey <em>Is Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Key</em>' attribute.
	 * @see #isIsKey()
	 * @generated
	 */
	void setIsKey(boolean value);

} // SingleAttribute

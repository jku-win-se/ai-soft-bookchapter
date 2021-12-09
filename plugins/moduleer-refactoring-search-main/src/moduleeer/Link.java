/**
 */
package moduleeer;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link moduleeer.Link#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link moduleeer.Link#getCompleteness <em>Completeness</em>}</li>
 * </ul>
 *
 * @see moduleeer.ModuleeerPackage#getLink()
 * @model abstract="true"
 * @generated
 */
public interface Link extends NameElement {
	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * The literals are from the enumeration {@link moduleeer.CardinalityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see moduleeer.CardinalityType
	 * @see #setCardinality(CardinalityType)
	 * @see moduleeer.ModuleeerPackage#getLink_Cardinality()
	 * @model
	 * @generated
	 */
	CardinalityType getCardinality();

	/**
	 * Sets the value of the '{@link moduleeer.Link#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see moduleeer.CardinalityType
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(CardinalityType value);

	/**
	 * Returns the value of the '<em><b>Completeness</b></em>' attribute.
	 * The literals are from the enumeration {@link moduleeer.CompletenessType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completeness</em>' attribute.
	 * @see moduleeer.CompletenessType
	 * @see #setCompleteness(CompletenessType)
	 * @see moduleeer.ModuleeerPackage#getLink_Completeness()
	 * @model
	 * @generated
	 */
	CompletenessType getCompleteness();

	/**
	 * Sets the value of the '{@link moduleeer.Link#getCompleteness <em>Completeness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completeness</em>' attribute.
	 * @see moduleeer.CompletenessType
	 * @see #getCompleteness()
	 * @generated
	 */
	void setCompleteness(CompletenessType value);

} // Link

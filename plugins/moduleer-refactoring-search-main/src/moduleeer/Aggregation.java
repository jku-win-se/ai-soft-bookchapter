/**
 */
package moduleeer;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link moduleeer.Aggregation#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see moduleeer.ModuleeerPackage#getAggregation()
 * @model
 * @generated
 */
public interface Aggregation extends Link {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(RelationshipType)
	 * @see moduleeer.ModuleeerPackage#getAggregation_To()
	 * @model required="true"
	 * @generated
	 */
	RelationshipType getTo();

	/**
	 * Sets the value of the '{@link moduleeer.Aggregation#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(RelationshipType value);

} // Aggregation

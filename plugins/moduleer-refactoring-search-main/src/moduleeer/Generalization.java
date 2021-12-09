/**
 */
package moduleeer;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link moduleeer.Generalization#getEntity <em>Entity</em>}</li>
 *   <li>{@link moduleeer.Generalization#getCompleteness <em>Completeness</em>}</li>
 *   <li>{@link moduleeer.Generalization#getDisjointness <em>Disjointness</em>}</li>
 * </ul>
 *
 * @see moduleeer.ModuleeerPackage#getGeneralization()
 * @model
 * @generated
 */
public interface Generalization extends NameElement {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link moduleeer.EntityType#getSpecializations <em>Specializations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(EntityType)
	 * @see moduleeer.ModuleeerPackage#getGeneralization_Entity()
	 * @see moduleeer.EntityType#getSpecializations
	 * @model opposite="specializations"
	 * @generated
	 */
	EntityType getEntity();

	/**
	 * Sets the value of the '{@link moduleeer.Generalization#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(EntityType value);

	/**
	 * Returns the value of the '<em><b>Completeness</b></em>' attribute.
	 * The literals are from the enumeration {@link moduleeer.CompletenessType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completeness</em>' attribute.
	 * @see moduleeer.CompletenessType
	 * @see #setCompleteness(CompletenessType)
	 * @see moduleeer.ModuleeerPackage#getGeneralization_Completeness()
	 * @model
	 * @generated
	 */
	CompletenessType getCompleteness();

	/**
	 * Sets the value of the '{@link moduleeer.Generalization#getCompleteness <em>Completeness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completeness</em>' attribute.
	 * @see moduleeer.CompletenessType
	 * @see #getCompleteness()
	 * @generated
	 */
	void setCompleteness(CompletenessType value);

	/**
	 * Returns the value of the '<em><b>Disjointness</b></em>' attribute.
	 * The literals are from the enumeration {@link moduleeer.DisjointnessType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disjointness</em>' attribute.
	 * @see moduleeer.DisjointnessType
	 * @see #setDisjointness(DisjointnessType)
	 * @see moduleeer.ModuleeerPackage#getGeneralization_Disjointness()
	 * @model
	 * @generated
	 */
	DisjointnessType getDisjointness();

	/**
	 * Sets the value of the '{@link moduleeer.Generalization#getDisjointness <em>Disjointness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disjointness</em>' attribute.
	 * @see moduleeer.DisjointnessType
	 * @see #getDisjointness()
	 * @generated
	 */
	void setDisjointness(DisjointnessType value);

} // Generalization

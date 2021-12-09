/**
 */
package moduleeer;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link To Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link moduleeer.LinkToEntity#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see moduleeer.ModuleeerPackage#getLinkToEntity()
 * @model
 * @generated
 */
public interface LinkToEntity extends Link {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link moduleeer.EntityType#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(EntityType)
	 * @see moduleeer.ModuleeerPackage#getLinkToEntity_Entity()
	 * @see moduleeer.EntityType#getLinks
	 * @model opposite="links" required="true"
	 * @generated
	 */
	EntityType getEntity();

	/**
	 * Sets the value of the '{@link moduleeer.LinkToEntity#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(EntityType value);

} // LinkToEntity

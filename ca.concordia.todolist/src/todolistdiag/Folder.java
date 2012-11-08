/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package todolistdiag;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Folder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link todolistdiag.Folder#getTasks <em>Tasks</em>}</li>
 *   <li>{@link todolistdiag.Folder#getSubFolders <em>Sub Folders</em>}</li>
 *   <li>{@link todolistdiag.Folder#getParent <em>Parent</em>}</li>
 *   <li>{@link todolistdiag.Folder#getId <em>Id</em>}</li>
 *   <li>{@link todolistdiag.Folder#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see todolistdiag.TodolistdiagPackage#getFolder()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='folderInFolder'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot folderInFolder='parent.id >= 0'"
 * @generated
 */
public interface Folder extends EObject {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link todolistdiag.Task}.
	 * It is bidirectional and its opposite is '{@link todolistdiag.Task#getParentFolders <em>Parent Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see todolistdiag.TodolistdiagPackage#getFolder_Tasks()
	 * @see todolistdiag.Task#getParentFolders
	 * @model type="todolistdiag.Task" opposite="parentFolders"
	 * @generated
	 */
	List getTasks();

	/**
	 * Returns the value of the '<em><b>Sub Folders</b></em>' reference list.
	 * The list contents are of type {@link todolistdiag.Folder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Folders</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Folders</em>' reference list.
	 * @see todolistdiag.TodolistdiagPackage#getFolder_SubFolders()
	 * @model type="todolistdiag.Folder"
	 * @generated
	 */
	List getSubFolders();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see todolistdiag.TodolistdiagPackage#getFolder_Name()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' namespace=''"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link todolistdiag.Folder#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see todolistdiag.TodolistdiagPackage#getFolder_Id()
	 * @model required="true"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link todolistdiag.Folder#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Folder)
	 * @see todolistdiag.TodolistdiagPackage#getFolder_Parent()
	 * @model
	 * @generated
	 */
	Folder getParent();

	/**
	 * Sets the value of the '{@link todolistdiag.Folder#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Folder value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean hasSubFolder();

} // Folder

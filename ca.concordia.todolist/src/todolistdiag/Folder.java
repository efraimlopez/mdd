/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package todolistdiag;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Folder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link todolistdiag.Folder#getSubFolders <em>Sub Folders</em>}</li>
 *   <li>{@link todolistdiag.Folder#getParent <em>Parent</em>}</li>
 *   <li>{@link todolistdiag.Folder#getId <em>Id</em>}</li>
 *   <li>{@link todolistdiag.Folder#getName <em>Name</em>}</li>
 *   <li>{@link todolistdiag.Folder#getOrderedTasks <em>Ordered Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @see todolistdiag.TodolistdiagPackage#getFolder()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueNamesSubFolders folderName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot uniqueNamesSubFolders='self.subFolders->forAll(f1 : Folder, f2 : Folder | f1 <> f2 implies f1.name <> f2.name)' folderName='self.name <> null'"
 * @generated
 */
public interface Folder extends EObject {
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
	 * Returns the value of the '<em><b>Ordered Tasks</b></em>' reference list.
	 * The list contents are of type {@link todolistdiag.TaskFolderOrder}.
	 * It is bidirectional and its opposite is '{@link todolistdiag.TaskFolderOrder#getFolder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordered Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordered Tasks</em>' reference list.
	 * @see todolistdiag.TodolistdiagPackage#getFolder_OrderedTasks()
	 * @see todolistdiag.TaskFolderOrder#getFolder
	 * @model type="todolistdiag.TaskFolderOrder" opposite="folder"
	 * @generated
	 */
	List getOrderedTasks();

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	List getAssociatedTasks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	List getOrderedTaskInOrder();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean sortTasks(SortingType sortingType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" tfUpdatedMany="false"
	 * @generated
	 */
	boolean moveTask(Task task, boolean up, EList tfUpdated);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" tfUpdatedMany="false"
	 */
	boolean moveTask(Task task, boolean up, List tfUpdated);

} // Folder

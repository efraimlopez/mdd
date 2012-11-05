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
 * A representation of the model object '<em><b>To Do List Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link todolistdiag.ToDoListManager#getRootFolder <em>Root Folder</em>}</li>
 *   <li>{@link todolistdiag.ToDoListManager#getFolderManagerListener <em>Folder Manager Listener</em>}</li>
 *   <li>{@link todolistdiag.ToDoListManager#getFolders <em>Folders</em>}</li>
 *   <li>{@link todolistdiag.ToDoListManager#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @see todolistdiag.TodolistdiagPackage#getToDoListManager()
 * @model
 * @generated
 */
public interface ToDoListManager extends EObject {
	/**
	 * Returns the value of the '<em><b>Root Folder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Folder</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Folder</em>' reference.
	 * @see #setRootFolder(Folder)
	 * @see todolistdiag.TodolistdiagPackage#getToDoListManager_RootFolder()
	 * @model required="true"
	 * @generated
	 */
	Folder getRootFolder();

	/**
	 * Sets the value of the '{@link todolistdiag.ToDoListManager#getRootFolder <em>Root Folder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Folder</em>' reference.
	 * @see #getRootFolder()
	 * @generated
	 */
	void setRootFolder(Folder value);

	/**
	 * Returns the value of the '<em><b>Folder Manager Listener</b></em>' reference list.
	 * The list contents are of type {@link todolistdiag.FolderManagerListener}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Folder Manager Listener</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folder Manager Listener</em>' reference list.
	 * @see todolistdiag.TodolistdiagPackage#getToDoListManager_FolderManagerListener()
	 * @model type="todolistdiag.FolderManagerListener"
	 * @generated
	 */
	List getFolderManagerListener();

	/**
	 * Returns the value of the '<em><b>Folders</b></em>' reference list.
	 * The list contents are of type {@link todolistdiag.Folder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Folders</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folders</em>' reference list.
	 * @see todolistdiag.TodolistdiagPackage#getToDoListManager_Folders()
	 * @model type="todolistdiag.Folder" required="true"
	 * @generated
	 */
	List getFolders();

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link todolistdiag.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see todolistdiag.TodolistdiagPackage#getToDoListManager_Tasks()
	 * @model type="todolistdiag.Task"
	 * @generated
	 */
	List getTasks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	Task createTask();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void editTask(Task task);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void deleteTask(Task task);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addFolderManagerListener(FolderManagerListener listener);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeFolderManagerListener(FolderManagerListener listener);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	Folder createFolder(String folderName, Folder parentFolder);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void editFolder(Folder folder);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void deleteFolder(Folder folder);

} // ToDoListManager

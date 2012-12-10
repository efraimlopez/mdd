/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package todolistdiag;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Folder Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link todolistdiag.TaskFolderOrder#getTask <em>Task</em>}</li>
 *   <li>{@link todolistdiag.TaskFolderOrder#getFolder <em>Folder</em>}</li>
 *   <li>{@link todolistdiag.TaskFolderOrder#getId <em>Id</em>}</li>
 *   <li>{@link todolistdiag.TaskFolderOrder#getTaskPosition <em>Task Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see todolistdiag.TodolistdiagPackage#getTaskFolderOrder()
 * @model
 * @generated
 */
public interface TaskFolderOrder extends EObject {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link todolistdiag.Task#getOrderedTasks <em>Ordered Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(Task)
	 * @see todolistdiag.TodolistdiagPackage#getTaskFolderOrder_Task()
	 * @see todolistdiag.Task#getOrderedTasks
	 * @model opposite="orderedTasks" required="true"
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link todolistdiag.TaskFolderOrder#getTask <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

	/**
	 * Returns the value of the '<em><b>Folder</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link todolistdiag.Folder#getOrderedTasks <em>Ordered Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Folder</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folder</em>' reference.
	 * @see #setFolder(Folder)
	 * @see todolistdiag.TodolistdiagPackage#getTaskFolderOrder_Folder()
	 * @see todolistdiag.Folder#getOrderedTasks
	 * @model opposite="orderedTasks" required="true"
	 *        extendedMetaData="name='folder' namespace=''"
	 * @generated
	 */
	Folder getFolder();

	/**
	 * Sets the value of the '{@link todolistdiag.TaskFolderOrder#getFolder <em>Folder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Folder</em>' reference.
	 * @see #getFolder()
	 * @generated
	 */
	void setFolder(Folder value);

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
	 * @see todolistdiag.TodolistdiagPackage#getTaskFolderOrder_Id()
	 * @model required="true"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link todolistdiag.TaskFolderOrder#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>Task Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Position</em>' attribute.
	 * @see #setTaskPosition(long)
	 * @see todolistdiag.TodolistdiagPackage#getTaskFolderOrder_TaskPosition()
	 * @model required="true"
	 * @generated
	 */
	long getTaskPosition();

	/**
	 * Sets the value of the '{@link todolistdiag.TaskFolderOrder#getTaskPosition <em>Task Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Position</em>' attribute.
	 * @see #getTaskPosition()
	 * @generated
	 */
	void setTaskPosition(long value);

} // TaskFolderOrder

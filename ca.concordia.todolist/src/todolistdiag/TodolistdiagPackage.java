/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package todolistdiag;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see todolistdiag.TodolistdiagFactory
 * @model kind="package"
 *        annotation="OneToMany owner='null'"
 * @generated
 */
public interface TodolistdiagPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "todolistdiag";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://todolistdiag/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "todolistdiag";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TodolistdiagPackage eINSTANCE = todolistdiag.impl.TodolistdiagPackageImpl.init();

	/**
	 * The meta object id for the '{@link todolistdiag.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see todolistdiag.impl.TaskImpl
	 * @see todolistdiag.impl.TodolistdiagPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Importance Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IMPORTANCE_LEVEL = 2;

	/**
	 * The feature id for the '<em><b>Parent Folders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PARENT_FOLDERS = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ID = 5;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link todolistdiag.impl.FolderImpl <em>Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see todolistdiag.impl.FolderImpl
	 * @see todolistdiag.impl.TodolistdiagPackageImpl#getFolder()
	 * @generated
	 */
	int FOLDER = 1;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__TASKS = 0;

	/**
	 * The feature id for the '<em><b>Sub Folders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__SUB_FOLDERS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__NAME = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__ID = 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__PARENT = 4;

	/**
	 * The number of structural features of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link todolistdiag.impl.ToDoListManagerImpl <em>To Do List Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see todolistdiag.impl.ToDoListManagerImpl
	 * @see todolistdiag.impl.TodolistdiagPackageImpl#getToDoListManager()
	 * @generated
	 */
	int TO_DO_LIST_MANAGER = 2;

	/**
	 * The feature id for the '<em><b>Root Folder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DO_LIST_MANAGER__ROOT_FOLDER = 0;

	/**
	 * The feature id for the '<em><b>Folder Manager Listener</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DO_LIST_MANAGER__FOLDER_MANAGER_LISTENER = 1;

	/**
	 * The feature id for the '<em><b>Folders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DO_LIST_MANAGER__FOLDERS = 2;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DO_LIST_MANAGER__TASKS = 3;

	/**
	 * The number of structural features of the '<em>To Do List Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DO_LIST_MANAGER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link todolistdiag.FolderManagerListener <em>Folder Manager Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see todolistdiag.FolderManagerListener
	 * @see todolistdiag.impl.TodolistdiagPackageImpl#getFolderManagerListener()
	 * @generated
	 */
	int FOLDER_MANAGER_LISTENER = 3;

	/**
	 * The number of structural features of the '<em>Folder Manager Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_MANAGER_LISTENER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link todolistdiag.Status <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see todolistdiag.Status
	 * @see todolistdiag.impl.TodolistdiagPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 4;

	/**
	 * The meta object id for the '{@link todolistdiag.Importance <em>Importance</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see todolistdiag.Importance
	 * @see todolistdiag.impl.TodolistdiagPackageImpl#getImportance()
	 * @generated
	 */
	int IMPORTANCE = 5;

	/**
	 * The meta object id for the '<em>Folder Manager Event</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.EventObject
	 * @see todolistdiag.impl.TodolistdiagPackageImpl#getFolderManagerEvent()
	 * @generated
	 */
	int FOLDER_MANAGER_EVENT = 6;


	/**
	 * Returns the meta object for class '{@link todolistdiag.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see todolistdiag.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link todolistdiag.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see todolistdiag.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the attribute '{@link todolistdiag.Task#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see todolistdiag.Task#getStatus()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Status();

	/**
	 * Returns the meta object for the attribute '{@link todolistdiag.Task#getImportanceLevel <em>Importance Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Importance Level</em>'.
	 * @see todolistdiag.Task#getImportanceLevel()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_ImportanceLevel();

	/**
	 * Returns the meta object for the reference list '{@link todolistdiag.Task#getParentFolders <em>Parent Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent Folders</em>'.
	 * @see todolistdiag.Task#getParentFolders()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_ParentFolders();

	/**
	 * Returns the meta object for the attribute '{@link todolistdiag.Task#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see todolistdiag.Task#getDescription()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Description();

	/**
	 * Returns the meta object for the attribute '{@link todolistdiag.Task#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see todolistdiag.Task#getId()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Id();

	/**
	 * Returns the meta object for class '{@link todolistdiag.Folder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder</em>'.
	 * @see todolistdiag.Folder
	 * @generated
	 */
	EClass getFolder();

	/**
	 * Returns the meta object for the reference list '{@link todolistdiag.Folder#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see todolistdiag.Folder#getTasks()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_Tasks();

	/**
	 * Returns the meta object for the reference list '{@link todolistdiag.Folder#getSubFolders <em>Sub Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Folders</em>'.
	 * @see todolistdiag.Folder#getSubFolders()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_SubFolders();

	/**
	 * Returns the meta object for the attribute '{@link todolistdiag.Folder#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see todolistdiag.Folder#getName()
	 * @see #getFolder()
	 * @generated
	 */
	EAttribute getFolder_Name();

	/**
	 * Returns the meta object for the attribute '{@link todolistdiag.Folder#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see todolistdiag.Folder#getId()
	 * @see #getFolder()
	 * @generated
	 */
	EAttribute getFolder_Id();

	/**
	 * Returns the meta object for the reference '{@link todolistdiag.Folder#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see todolistdiag.Folder#getParent()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_Parent();

	/**
	 * Returns the meta object for class '{@link todolistdiag.ToDoListManager <em>To Do List Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Do List Manager</em>'.
	 * @see todolistdiag.ToDoListManager
	 * @generated
	 */
	EClass getToDoListManager();

	/**
	 * Returns the meta object for the reference '{@link todolistdiag.ToDoListManager#getRootFolder <em>Root Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Folder</em>'.
	 * @see todolistdiag.ToDoListManager#getRootFolder()
	 * @see #getToDoListManager()
	 * @generated
	 */
	EReference getToDoListManager_RootFolder();

	/**
	 * Returns the meta object for the reference list '{@link todolistdiag.ToDoListManager#getFolderManagerListener <em>Folder Manager Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Folder Manager Listener</em>'.
	 * @see todolistdiag.ToDoListManager#getFolderManagerListener()
	 * @see #getToDoListManager()
	 * @generated
	 */
	EReference getToDoListManager_FolderManagerListener();

	/**
	 * Returns the meta object for the reference list '{@link todolistdiag.ToDoListManager#getFolders <em>Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Folders</em>'.
	 * @see todolistdiag.ToDoListManager#getFolders()
	 * @see #getToDoListManager()
	 * @generated
	 */
	EReference getToDoListManager_Folders();

	/**
	 * Returns the meta object for the reference list '{@link todolistdiag.ToDoListManager#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see todolistdiag.ToDoListManager#getTasks()
	 * @see #getToDoListManager()
	 * @generated
	 */
	EReference getToDoListManager_Tasks();

	/**
	 * Returns the meta object for class '{@link todolistdiag.FolderManagerListener <em>Folder Manager Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder Manager Listener</em>'.
	 * @see todolistdiag.FolderManagerListener
	 * @generated
	 */
	EClass getFolderManagerListener();

	/**
	 * Returns the meta object for enum '{@link todolistdiag.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status</em>'.
	 * @see todolistdiag.Status
	 * @generated
	 */
	EEnum getStatus();

	/**
	 * Returns the meta object for enum '{@link todolistdiag.Importance <em>Importance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Importance</em>'.
	 * @see todolistdiag.Importance
	 * @generated
	 */
	EEnum getImportance();

	/**
	 * Returns the meta object for data type '{@link java.util.EventObject <em>Folder Manager Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Folder Manager Event</em>'.
	 * @see java.util.EventObject
	 * @model instanceClass="java.util.EventObject"
	 * @generated
	 */
	EDataType getFolderManagerEvent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TodolistdiagFactory getTodolistdiagFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link todolistdiag.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see todolistdiag.impl.TaskImpl
		 * @see todolistdiag.impl.TodolistdiagPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__STATUS = eINSTANCE.getTask_Status();

		/**
		 * The meta object literal for the '<em><b>Importance Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__IMPORTANCE_LEVEL = eINSTANCE.getTask_ImportanceLevel();

		/**
		 * The meta object literal for the '<em><b>Parent Folders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__PARENT_FOLDERS = eINSTANCE.getTask_ParentFolders();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__DESCRIPTION = eINSTANCE.getTask_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__ID = eINSTANCE.getTask_Id();

		/**
		 * The meta object literal for the '{@link todolistdiag.impl.FolderImpl <em>Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see todolistdiag.impl.FolderImpl
		 * @see todolistdiag.impl.TodolistdiagPackageImpl#getFolder()
		 * @generated
		 */
		EClass FOLDER = eINSTANCE.getFolder();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__TASKS = eINSTANCE.getFolder_Tasks();

		/**
		 * The meta object literal for the '<em><b>Sub Folders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__SUB_FOLDERS = eINSTANCE.getFolder_SubFolders();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOLDER__NAME = eINSTANCE.getFolder_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOLDER__ID = eINSTANCE.getFolder_Id();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__PARENT = eINSTANCE.getFolder_Parent();

		/**
		 * The meta object literal for the '{@link todolistdiag.impl.ToDoListManagerImpl <em>To Do List Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see todolistdiag.impl.ToDoListManagerImpl
		 * @see todolistdiag.impl.TodolistdiagPackageImpl#getToDoListManager()
		 * @generated
		 */
		EClass TO_DO_LIST_MANAGER = eINSTANCE.getToDoListManager();

		/**
		 * The meta object literal for the '<em><b>Root Folder</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_DO_LIST_MANAGER__ROOT_FOLDER = eINSTANCE.getToDoListManager_RootFolder();

		/**
		 * The meta object literal for the '<em><b>Folder Manager Listener</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_DO_LIST_MANAGER__FOLDER_MANAGER_LISTENER = eINSTANCE.getToDoListManager_FolderManagerListener();

		/**
		 * The meta object literal for the '<em><b>Folders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_DO_LIST_MANAGER__FOLDERS = eINSTANCE.getToDoListManager_Folders();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_DO_LIST_MANAGER__TASKS = eINSTANCE.getToDoListManager_Tasks();

		/**
		 * The meta object literal for the '{@link todolistdiag.FolderManagerListener <em>Folder Manager Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see todolistdiag.FolderManagerListener
		 * @see todolistdiag.impl.TodolistdiagPackageImpl#getFolderManagerListener()
		 * @generated
		 */
		EClass FOLDER_MANAGER_LISTENER = eINSTANCE.getFolderManagerListener();

		/**
		 * The meta object literal for the '{@link todolistdiag.Status <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see todolistdiag.Status
		 * @see todolistdiag.impl.TodolistdiagPackageImpl#getStatus()
		 * @generated
		 */
		EEnum STATUS = eINSTANCE.getStatus();

		/**
		 * The meta object literal for the '{@link todolistdiag.Importance <em>Importance</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see todolistdiag.Importance
		 * @see todolistdiag.impl.TodolistdiagPackageImpl#getImportance()
		 * @generated
		 */
		EEnum IMPORTANCE = eINSTANCE.getImportance();

		/**
		 * The meta object literal for the '<em>Folder Manager Event</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.EventObject
		 * @see todolistdiag.impl.TodolistdiagPackageImpl#getFolderManagerEvent()
		 * @generated
		 */
		EDataType FOLDER_MANAGER_EVENT = eINSTANCE.getFolderManagerEvent();

	}

} //TodolistdiagPackage

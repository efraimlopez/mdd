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
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
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
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__STATUS = 2;

	/**
	 * The feature id for the '<em><b>Importance Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IMPORTANCE_LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Ordered Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ORDERED_TASKS = 5;

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
	 * The feature id for the '<em><b>Sub Folders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__SUB_FOLDERS = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__PARENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__ID = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__NAME = 3;

	/**
	 * The feature id for the '<em><b>Ordered Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__ORDERED_TASKS = 4;

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
	 * The feature id for the '<em><b>Persistance Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DO_LIST_MANAGER__PERSISTANCE_PROVIDER = 4;

	/**
	 * The number of structural features of the '<em>To Do List Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_DO_LIST_MANAGER_FEATURE_COUNT = 5;

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
	 * The meta object id for the '{@link todolistdiag.impl.PersistenceProviderImpl <em>Persistence Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see todolistdiag.impl.PersistenceProviderImpl
	 * @see todolistdiag.impl.TodolistdiagPackageImpl#getPersistenceProvider()
	 * @generated
	 */
	int PERSISTENCE_PROVIDER = 4;

	/**
	 * The feature id for the '<em><b>PERSISTENCE UNIT NAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_PROVIDER__PERSISTENCE_UNIT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_PROVIDER__FACTORY = 1;

	/**
	 * The feature id for the '<em><b>Entitymanager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_PROVIDER__ENTITYMANAGER = 2;

	/**
	 * The number of structural features of the '<em>Persistence Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_PROVIDER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link todolistdiag.impl.TaskFolderOrderImpl <em>Task Folder Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see todolistdiag.impl.TaskFolderOrderImpl
	 * @see todolistdiag.impl.TodolistdiagPackageImpl#getTaskFolderOrder()
	 * @generated
	 */
	int TASK_FOLDER_ORDER = 5;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FOLDER_ORDER__TASK = 0;

	/**
	 * The feature id for the '<em><b>Folder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FOLDER_ORDER__FOLDER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FOLDER_ORDER__ID = 2;

	/**
	 * The feature id for the '<em><b>Task Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FOLDER_ORDER__TASK_POSITION = 3;

	/**
	 * The number of structural features of the '<em>Task Folder Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FOLDER_ORDER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link todolistdiag.Status <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see todolistdiag.Status
	 * @see todolistdiag.impl.TodolistdiagPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 6;

	/**
	 * The meta object id for the '{@link todolistdiag.Importance <em>Importance</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see todolistdiag.Importance
	 * @see todolistdiag.impl.TodolistdiagPackageImpl#getImportance()
	 * @generated
	 */
	int IMPORTANCE = 7;

	/**
	 * The meta object id for the '{@link todolistdiag.SortingType <em>Sorting Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see todolistdiag.SortingType
	 * @see todolistdiag.impl.TodolistdiagPackageImpl#getSortingType()
	 * @generated
	 */
	int SORTING_TYPE = 8;

	/**
	 * The meta object id for the '<em>Folder Manager Event</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.EventObject
	 * @see todolistdiag.impl.TodolistdiagPackageImpl#getFolderManagerEvent()
	 * @generated
	 */
	int FOLDER_MANAGER_EVENT = 9;


	/**
	 * The meta object id for the '<em>Entity Manager Factory</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.persistence.EntityManagerFactory
	 * @see todolistdiag.impl.TodolistdiagPackageImpl#getEntityManagerFactory()
	 * @generated
	 */
	int ENTITY_MANAGER_FACTORY = 10;

	/**
	 * The meta object id for the '<em>Entity Manager</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.persistence.EntityManager
	 * @see todolistdiag.impl.TodolistdiagPackageImpl#getEntityManager()
	 * @generated
	 */
	int ENTITY_MANAGER = 11;


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
	 * Returns the meta object for the reference list '{@link todolistdiag.Task#getOrderedTasks <em>Ordered Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ordered Tasks</em>'.
	 * @see todolistdiag.Task#getOrderedTasks()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_OrderedTasks();

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
	 * Returns the meta object for the reference list '{@link todolistdiag.Folder#getOrderedTasks <em>Ordered Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ordered Tasks</em>'.
	 * @see todolistdiag.Folder#getOrderedTasks()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_OrderedTasks();

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
	 * Returns the meta object for the reference '{@link todolistdiag.ToDoListManager#getPersistanceProvider <em>Persistance Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Persistance Provider</em>'.
	 * @see todolistdiag.ToDoListManager#getPersistanceProvider()
	 * @see #getToDoListManager()
	 * @generated
	 */
	EReference getToDoListManager_PersistanceProvider();

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
	 * Returns the meta object for class '{@link todolistdiag.PersistenceProvider <em>Persistence Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistence Provider</em>'.
	 * @see todolistdiag.PersistenceProvider
	 * @generated
	 */
	EClass getPersistenceProvider();

	/**
	 * Returns the meta object for the attribute '{@link todolistdiag.PersistenceProvider#getPERSISTENCE_UNIT_NAME <em>PERSISTENCE UNIT NAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PERSISTENCE UNIT NAME</em>'.
	 * @see todolistdiag.PersistenceProvider#getPERSISTENCE_UNIT_NAME()
	 * @see #getPersistenceProvider()
	 * @generated
	 */
	EAttribute getPersistenceProvider_PERSISTENCE_UNIT_NAME();

	/**
	 * Returns the meta object for the attribute '{@link todolistdiag.PersistenceProvider#getFactory <em>Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factory</em>'.
	 * @see todolistdiag.PersistenceProvider#getFactory()
	 * @see #getPersistenceProvider()
	 * @generated
	 */
	EAttribute getPersistenceProvider_Factory();

	/**
	 * Returns the meta object for the attribute '{@link todolistdiag.PersistenceProvider#getEntitymanager <em>Entitymanager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entitymanager</em>'.
	 * @see todolistdiag.PersistenceProvider#getEntitymanager()
	 * @see #getPersistenceProvider()
	 * @generated
	 */
	EAttribute getPersistenceProvider_Entitymanager();

	/**
	 * Returns the meta object for class '{@link todolistdiag.TaskFolderOrder <em>Task Folder Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Folder Order</em>'.
	 * @see todolistdiag.TaskFolderOrder
	 * @generated
	 */
	EClass getTaskFolderOrder();

	/**
	 * Returns the meta object for the reference '{@link todolistdiag.TaskFolderOrder#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see todolistdiag.TaskFolderOrder#getTask()
	 * @see #getTaskFolderOrder()
	 * @generated
	 */
	EReference getTaskFolderOrder_Task();

	/**
	 * Returns the meta object for the reference '{@link todolistdiag.TaskFolderOrder#getFolder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Folder</em>'.
	 * @see todolistdiag.TaskFolderOrder#getFolder()
	 * @see #getTaskFolderOrder()
	 * @generated
	 */
	EReference getTaskFolderOrder_Folder();

	/**
	 * Returns the meta object for the attribute '{@link todolistdiag.TaskFolderOrder#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see todolistdiag.TaskFolderOrder#getId()
	 * @see #getTaskFolderOrder()
	 * @generated
	 */
	EAttribute getTaskFolderOrder_Id();

	/**
	 * Returns the meta object for the attribute '{@link todolistdiag.TaskFolderOrder#getTaskPosition <em>Task Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task Position</em>'.
	 * @see todolistdiag.TaskFolderOrder#getTaskPosition()
	 * @see #getTaskFolderOrder()
	 * @generated
	 */
	EAttribute getTaskFolderOrder_TaskPosition();

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
	 * Returns the meta object for enum '{@link todolistdiag.SortingType <em>Sorting Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sorting Type</em>'.
	 * @see todolistdiag.SortingType
	 * @generated
	 */
	EEnum getSortingType();

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
	 * Returns the meta object for data type '{@link javax.persistence.EntityManagerFactory <em>Entity Manager Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Entity Manager Factory</em>'.
	 * @see javax.persistence.EntityManagerFactory
	 * @model instanceClass="javax.persistence.EntityManagerFactory"
	 * @generated
	 */
	EDataType getEntityManagerFactory();

	/**
	 * Returns the meta object for data type '{@link javax.persistence.EntityManager <em>Entity Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Entity Manager</em>'.
	 * @see javax.persistence.EntityManager
	 * @model instanceClass="javax.persistence.EntityManager"
	 * @generated
	 */
	EDataType getEntityManager();

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
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__DESCRIPTION = eINSTANCE.getTask_Description();

		/**
		 * The meta object literal for the '<em><b>Ordered Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__ORDERED_TASKS = eINSTANCE.getTask_OrderedTasks();

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
		 * The meta object literal for the '<em><b>Ordered Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__ORDERED_TASKS = eINSTANCE.getFolder_OrderedTasks();

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
		 * The meta object literal for the '<em><b>Persistance Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_DO_LIST_MANAGER__PERSISTANCE_PROVIDER = eINSTANCE.getToDoListManager_PersistanceProvider();

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
		 * The meta object literal for the '{@link todolistdiag.impl.PersistenceProviderImpl <em>Persistence Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see todolistdiag.impl.PersistenceProviderImpl
		 * @see todolistdiag.impl.TodolistdiagPackageImpl#getPersistenceProvider()
		 * @generated
		 */
		EClass PERSISTENCE_PROVIDER = eINSTANCE.getPersistenceProvider();

		/**
		 * The meta object literal for the '<em><b>PERSISTENCE UNIT NAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_PROVIDER__PERSISTENCE_UNIT_NAME = eINSTANCE.getPersistenceProvider_PERSISTENCE_UNIT_NAME();

		/**
		 * The meta object literal for the '<em><b>Factory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_PROVIDER__FACTORY = eINSTANCE.getPersistenceProvider_Factory();

		/**
		 * The meta object literal for the '<em><b>Entitymanager</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_PROVIDER__ENTITYMANAGER = eINSTANCE.getPersistenceProvider_Entitymanager();

		/**
		 * The meta object literal for the '{@link todolistdiag.impl.TaskFolderOrderImpl <em>Task Folder Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see todolistdiag.impl.TaskFolderOrderImpl
		 * @see todolistdiag.impl.TodolistdiagPackageImpl#getTaskFolderOrder()
		 * @generated
		 */
		EClass TASK_FOLDER_ORDER = eINSTANCE.getTaskFolderOrder();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_FOLDER_ORDER__TASK = eINSTANCE.getTaskFolderOrder_Task();

		/**
		 * The meta object literal for the '<em><b>Folder</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_FOLDER_ORDER__FOLDER = eINSTANCE.getTaskFolderOrder_Folder();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_FOLDER_ORDER__ID = eINSTANCE.getTaskFolderOrder_Id();

		/**
		 * The meta object literal for the '<em><b>Task Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_FOLDER_ORDER__TASK_POSITION = eINSTANCE.getTaskFolderOrder_TaskPosition();

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
		 * The meta object literal for the '{@link todolistdiag.SortingType <em>Sorting Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see todolistdiag.SortingType
		 * @see todolistdiag.impl.TodolistdiagPackageImpl#getSortingType()
		 * @generated
		 */
		EEnum SORTING_TYPE = eINSTANCE.getSortingType();

		/**
		 * The meta object literal for the '<em>Folder Manager Event</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.EventObject
		 * @see todolistdiag.impl.TodolistdiagPackageImpl#getFolderManagerEvent()
		 * @generated
		 */
		EDataType FOLDER_MANAGER_EVENT = eINSTANCE.getFolderManagerEvent();

		/**
		 * The meta object literal for the '<em>Entity Manager Factory</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.persistence.EntityManagerFactory
		 * @see todolistdiag.impl.TodolistdiagPackageImpl#getEntityManagerFactory()
		 * @generated
		 */
		EDataType ENTITY_MANAGER_FACTORY = eINSTANCE.getEntityManagerFactory();

		/**
		 * The meta object literal for the '<em>Entity Manager</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.persistence.EntityManager
		 * @see todolistdiag.impl.TodolistdiagPackageImpl#getEntityManager()
		 * @generated
		 */
		EDataType ENTITY_MANAGER = eINSTANCE.getEntityManager();

	}

} //TodolistdiagPackage

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package todolistdiag.impl;

import java.util.EventObject;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import todolistdiag.Folder;
import todolistdiag.FolderManagerListener;
import todolistdiag.Importance;
import todolistdiag.Status;
import todolistdiag.Task;
import todolistdiag.ToDoListManager;
import todolistdiag.TodolistdiagFactory;
import todolistdiag.TodolistdiagPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TodolistdiagPackageImpl extends EPackageImpl implements TodolistdiagPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass folderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toDoListManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass folderManagerListenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum importanceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType folderManagerEventEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see todolistdiag.TodolistdiagPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TodolistdiagPackageImpl() {
		super(eNS_URI, TodolistdiagFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TodolistdiagPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TodolistdiagPackage init() {
		if (isInited) return (TodolistdiagPackage)EPackage.Registry.INSTANCE.getEPackage(TodolistdiagPackage.eNS_URI);

		// Obtain or create and register package
		TodolistdiagPackageImpl theTodolistdiagPackage = (TodolistdiagPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TodolistdiagPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TodolistdiagPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTodolistdiagPackage.createPackageContents();

		// Initialize created meta-data
		theTodolistdiagPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTodolistdiagPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TodolistdiagPackage.eNS_URI, theTodolistdiagPackage);
		return theTodolistdiagPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Name() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Status() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_ImportanceLevel() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_ParentFolders() {
		return (EReference)taskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Description() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Id() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFolder() {
		return folderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFolder_Tasks() {
		return (EReference)folderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFolder_SubFolders() {
		return (EReference)folderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFolder_Name() {
		return (EAttribute)folderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFolder_Id() {
		return (EAttribute)folderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFolder_Parent() {
		return (EReference)folderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToDoListManager() {
		return toDoListManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToDoListManager_RootFolder() {
		return (EReference)toDoListManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToDoListManager_FolderManagerListener() {
		return (EReference)toDoListManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToDoListManager_Folders() {
		return (EReference)toDoListManagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToDoListManager_Tasks() {
		return (EReference)toDoListManagerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFolderManagerListener() {
		return folderManagerListenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStatus() {
		return statusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getImportance() {
		return importanceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFolderManagerEvent() {
		return folderManagerEventEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TodolistdiagFactory getTodolistdiagFactory() {
		return (TodolistdiagFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__NAME);
		createEAttribute(taskEClass, TASK__STATUS);
		createEAttribute(taskEClass, TASK__IMPORTANCE_LEVEL);
		createEReference(taskEClass, TASK__PARENT_FOLDERS);
		createEAttribute(taskEClass, TASK__DESCRIPTION);
		createEAttribute(taskEClass, TASK__ID);

		folderEClass = createEClass(FOLDER);
		createEReference(folderEClass, FOLDER__TASKS);
		createEReference(folderEClass, FOLDER__SUB_FOLDERS);
		createEAttribute(folderEClass, FOLDER__NAME);
		createEAttribute(folderEClass, FOLDER__ID);
		createEReference(folderEClass, FOLDER__PARENT);

		toDoListManagerEClass = createEClass(TO_DO_LIST_MANAGER);
		createEReference(toDoListManagerEClass, TO_DO_LIST_MANAGER__ROOT_FOLDER);
		createEReference(toDoListManagerEClass, TO_DO_LIST_MANAGER__FOLDER_MANAGER_LISTENER);
		createEReference(toDoListManagerEClass, TO_DO_LIST_MANAGER__FOLDERS);
		createEReference(toDoListManagerEClass, TO_DO_LIST_MANAGER__TASKS);

		folderManagerListenerEClass = createEClass(FOLDER_MANAGER_LISTENER);

		// Create enums
		statusEEnum = createEEnum(STATUS);
		importanceEEnum = createEEnum(IMPORTANCE);

		// Create data types
		folderManagerEventEDataType = createEDataType(FOLDER_MANAGER_EVENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_Name(), ecorePackage.getEString(), "name", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Status(), this.getStatus(), "status", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_ImportanceLevel(), this.getImportance(), "importanceLevel", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_ParentFolders(), this.getFolder(), this.getFolder_Tasks(), "parentFolders", null, 1, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Description(), ecorePackage.getEString(), "description", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Id(), ecorePackage.getELong(), "id", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(taskEClass, null, "statusNotStarted");

		addEOperation(taskEClass, null, "statusInProgress");

		addEOperation(taskEClass, null, "statusDone");

		initEClass(folderEClass, Folder.class, "Folder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFolder_Tasks(), this.getTask(), this.getTask_ParentFolders(), "tasks", null, 0, -1, Folder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFolder_SubFolders(), this.getFolder(), null, "subFolders", null, 0, -1, Folder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFolder_Name(), ecorePackage.getEString(), "name", null, 1, 1, Folder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFolder_Id(), ecorePackage.getELong(), "id", null, 1, 1, Folder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFolder_Parent(), this.getFolder(), null, "parent", null, 0, 1, Folder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(folderEClass, ecorePackage.getEBoolean(), "hasSubFolder", 0, 1);

		EOperation op = addEOperation(folderEClass, null, "setAsParent");
		addEParameter(op, this.getFolder(), "parentFolder", 0, 1);

		op = addEOperation(folderEClass, null, "setAsChild");
		addEParameter(op, this.getFolder(), "childFolder", 0, 1);

		initEClass(toDoListManagerEClass, ToDoListManager.class, "ToDoListManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToDoListManager_RootFolder(), this.getFolder(), null, "rootFolder", null, 1, 1, ToDoListManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToDoListManager_FolderManagerListener(), this.getFolderManagerListener(), null, "folderManagerListener", null, 0, -1, ToDoListManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToDoListManager_Folders(), this.getFolder(), null, "folders", null, 1, -1, ToDoListManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToDoListManager_Tasks(), this.getTask(), null, "tasks", null, 0, -1, ToDoListManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(toDoListManagerEClass, this.getTask(), "createTask", 1, 1);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1);
		addEParameter(op, this.getImportance(), "importance", 0, 1);
		addEParameter(op, this.getStatus(), "status", 0, 1);
		addEParameter(op, ecorePackage.getEEList(), "folders", 0, 1);

		op = addEOperation(toDoListManagerEClass, null, "editTask");
		addEParameter(op, this.getTask(), "task", 0, 1);

		op = addEOperation(toDoListManagerEClass, null, "deleteTask");
		addEParameter(op, this.getTask(), "task", 0, 1);

		op = addEOperation(toDoListManagerEClass, null, "addFolderManagerListener");
		addEParameter(op, this.getFolderManagerListener(), "listener", 0, 1);

		op = addEOperation(toDoListManagerEClass, null, "removeFolderManagerListener");
		addEParameter(op, this.getFolderManagerListener(), "listener", 0, 1);

		op = addEOperation(toDoListManagerEClass, this.getFolder(), "createFolder", 1, 1);
		addEParameter(op, ecorePackage.getEString(), "folderName", 0, 1);
		addEParameter(op, this.getFolder(), "parentFolder", 0, 1);

		op = addEOperation(toDoListManagerEClass, null, "editFolder");
		addEParameter(op, this.getFolder(), "folder", 0, 1);

		op = addEOperation(toDoListManagerEClass, null, "deleteFolder");
		addEParameter(op, this.getFolder(), "folder", 0, 1);

		initEClass(folderManagerListenerEClass, FolderManagerListener.class, "FolderManagerListener", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(folderManagerListenerEClass, null, "folderAdded");
		addEParameter(op, this.getFolderManagerEvent(), "event", 0, 1);

		op = addEOperation(folderManagerListenerEClass, null, "folderDeleted");
		addEParameter(op, this.getFolderManagerEvent(), "event", 0, 1);

		op = addEOperation(folderManagerListenerEClass, null, "folderModified");
		addEParameter(op, this.getFolderManagerEvent(), "event", 0, 1);

		// Initialize enums and add enum literals
		initEEnum(statusEEnum, Status.class, "Status");
		addEEnumLiteral(statusEEnum, Status.NOT_STARTED_LITERAL);
		addEEnumLiteral(statusEEnum, Status.IN_PROGRESS_LITERAL);
		addEEnumLiteral(statusEEnum, Status.DONE_LITERAL);

		initEEnum(importanceEEnum, Importance.class, "Importance");
		addEEnumLiteral(importanceEEnum, Importance.LOW_LITERAL);
		addEEnumLiteral(importanceEEnum, Importance.MEDIUM_LITERAL);
		addEEnumLiteral(importanceEEnum, Importance.HIGH_LITERAL);

		// Initialize data types
		initEDataType(folderManagerEventEDataType, EventObject.class, "FolderManagerEvent", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// OneToMany
		createOneToManyAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>OneToMany</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOneToManyAnnotations() {
		String source = "OneToMany";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "owner", null
		   });	
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";			
		addAnnotation
		  (getFolder_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "namespace", ""
		   });
	}

} //TodolistdiagPackageImpl

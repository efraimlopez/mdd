/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package todolistdiag.impl;

import java.util.EventObject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import todolistdiag.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TodolistdiagFactoryImpl extends EFactoryImpl implements TodolistdiagFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TodolistdiagFactory init() {
		try {
			TodolistdiagFactory theTodolistdiagFactory = (TodolistdiagFactory)EPackage.Registry.INSTANCE.getEFactory("http://todolistdiag/1.0"); 
			if (theTodolistdiagFactory != null) {
				return theTodolistdiagFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TodolistdiagFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TodolistdiagFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TodolistdiagPackage.TASK: return createTask();
			case TodolistdiagPackage.FOLDER: return createFolder();
			case TodolistdiagPackage.TO_DO_LIST_MANAGER: return createToDoListManager();
			case TodolistdiagPackage.PERSISTENCE_PROVIDER: return createPersistenceProvider();
			case TodolistdiagPackage.TASK_FOLDER_ORDER: return createTaskFolderOrder();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TodolistdiagPackage.STATUS:
				return createStatusFromString(eDataType, initialValue);
			case TodolistdiagPackage.IMPORTANCE:
				return createImportanceFromString(eDataType, initialValue);
			case TodolistdiagPackage.SORTING_TYPE:
				return createSortingTypeFromString(eDataType, initialValue);
			case TodolistdiagPackage.FOLDER_MANAGER_EVENT:
				return createFolderManagerEventFromString(eDataType, initialValue);
			case TodolistdiagPackage.ENTITY_MANAGER_FACTORY:
				return createEntityManagerFactoryFromString(eDataType, initialValue);
			case TodolistdiagPackage.ENTITY_MANAGER:
				return createEntityManagerFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TodolistdiagPackage.STATUS:
				return convertStatusToString(eDataType, instanceValue);
			case TodolistdiagPackage.IMPORTANCE:
				return convertImportanceToString(eDataType, instanceValue);
			case TodolistdiagPackage.SORTING_TYPE:
				return convertSortingTypeToString(eDataType, instanceValue);
			case TodolistdiagPackage.FOLDER_MANAGER_EVENT:
				return convertFolderManagerEventToString(eDataType, instanceValue);
			case TodolistdiagPackage.ENTITY_MANAGER_FACTORY:
				return convertEntityManagerFactoryToString(eDataType, instanceValue);
			case TodolistdiagPackage.ENTITY_MANAGER:
				return convertEntityManagerToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Folder createFolder() {
		FolderImpl folder = new FolderImpl();
		return folder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToDoListManager createToDoListManager() {
		ToDoListManagerImpl toDoListManager = new ToDoListManagerImpl();
		return toDoListManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceProvider createPersistenceProvider() {
		PersistenceProviderImpl persistenceProvider = new PersistenceProviderImpl();
		return persistenceProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskFolderOrder createTaskFolderOrder() {
		TaskFolderOrderImpl taskFolderOrder = new TaskFolderOrderImpl();
		return taskFolderOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status createStatusFromString(EDataType eDataType, String initialValue) {
		Status result = Status.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Importance createImportanceFromString(EDataType eDataType, String initialValue) {
		Importance result = Importance.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImportanceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingType createSortingTypeFromString(EDataType eDataType, String initialValue) {
		SortingType result = SortingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSortingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventObject createFolderManagerEventFromString(EDataType eDataType, String initialValue) {
		return (EventObject)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFolderManagerEventToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityManagerFactory createEntityManagerFactoryFromString(EDataType eDataType, String initialValue) {
		return (EntityManagerFactory)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEntityManagerFactoryToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityManager createEntityManagerFromString(EDataType eDataType, String initialValue) {
		return (EntityManager)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEntityManagerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TodolistdiagPackage getTodolistdiagPackage() {
		return (TodolistdiagPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static TodolistdiagPackage getPackage() {
		return TodolistdiagPackage.eINSTANCE;
	}

} //TodolistdiagFactoryImpl

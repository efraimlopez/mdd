/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package todolistdiag.util;

import java.util.EventObject;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.persistence.internal.sessions.remote.SequencingFunctionCall.GetNextValue;

import todolistdiag.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see todolistdiag.TodolistdiagPackage
 * @generated
 */
public class TodolistdiagValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TodolistdiagValidator INSTANCE = new TodolistdiagValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "todolistdiag";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TodolistdiagValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPackage getEPackage() {
	  return TodolistdiagPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map context) {
		switch (classifierID) {
			case TodolistdiagPackage.TASK:
				return validateTask((Task)value, diagnostics, context);
			case TodolistdiagPackage.FOLDER:
				return validateFolder((Folder)value, diagnostics, context);
			case TodolistdiagPackage.TO_DO_LIST_MANAGER:
				return validateToDoListManager((ToDoListManager)value, diagnostics, context);
			case TodolistdiagPackage.FOLDER_MANAGER_LISTENER:
				return validateFolderManagerListener((FolderManagerListener)value, diagnostics, context);
			case TodolistdiagPackage.PERSISTENCE_PROVIDER:
				return validatePersistenceProvider((PersistenceProvider)value, diagnostics, context);
			case TodolistdiagPackage.STATUS:
				return validateStatus((Status)value, diagnostics, context);
			case TodolistdiagPackage.IMPORTANCE:
				return validateImportance((Importance)value, diagnostics, context);
			case TodolistdiagPackage.FOLDER_MANAGER_EVENT:
				return validateFolderManagerEvent((EventObject)value, diagnostics, context);
			case TodolistdiagPackage.ENTITY_MANAGER_FACTORY:
				return validateEntityManagerFactory((EntityManagerFactory)value, diagnostics, context);
			case TodolistdiagPackage.ENTITY_MANAGER:
				return validateEntityManager((EntityManager)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask(Task task, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_taskInFolder(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_taskName(task, diagnostics, context);
		return result;
	}

	/**
	 * Validates the taskInFolder constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean validateTask_taskInFolder(Task task, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (task.getParentFolders().size()<1) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "taskInFolder", getObjectLabel(task, context) }),
						 new Object[] { task }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the taskName constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean validateTask_taskName(Task task, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (task.getName() == null || task.getName().length()==0) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "taskName", getObjectLabel(task, context) }),
						 new Object[] { task }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFolder(Folder folder, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(folder, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(folder, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(folder, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(folder, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(folder, diagnostics, context);
		if (result || diagnostics != null) result &= validateFolder_uniqueNamesSubFolders(folder, diagnostics, context);
		if (result || diagnostics != null) result &= validateFolder_folderName(folder, diagnostics, context);
		if (result || diagnostics != null) result &= validateFolder_uniqueNames(folder, diagnostics, context);
		return result;
	}

	/**
	 * Validates the uniqueNamesSubFolders constraint of '<em>Folder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean validateFolder_uniqueNamesSubFolders(Folder folder, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		boolean ok = true;
		if(folder.getName()!=null && folder.getParent()!=null){
			List siblingFolders = folder.getParent().getSubFolders();
			for(Object o : siblingFolders){
				Folder f = (Folder) o;
				if(f.getId()!=folder.getId() && f.getName().equals(folder.getName())){
					ok = false;
					break;
				}
			}
		}
		if (!ok) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "uniqueNamesSubFolders", getObjectLabel(folder, context) }),
						 new Object[] { folder }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the folderName constraint of '<em>Folder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean validateFolder_folderName(Folder folder, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (folder.getName()==null || folder.getName().trim().length()==0) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "folderName", getObjectLabel(folder, context) }),
						 new Object[] { folder }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the uniqueNames constraint of '<em>Folder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFolder_uniqueNames(Folder folder, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "uniqueNames", getObjectLabel(folder, context) }),
						 new Object[] { folder }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateToDoListManager(ToDoListManager toDoListManager, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(toDoListManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(toDoListManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(toDoListManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(toDoListManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(toDoListManager, diagnostics, context);
		if (result || diagnostics != null) result &= validateToDoListManager_rootFolderParent(toDoListManager, diagnostics, context);
		if (result || diagnostics != null) result &= validateToDoListManager_uniqueTaskId(toDoListManager, diagnostics, context);
		if (result || diagnostics != null) result &= validateToDoListManager_uniqueFolderId(toDoListManager, diagnostics, context);
		return result;
	}

	/**
	 * Validates the rootFolderParent constraint of '<em>To Do List Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateToDoListManager_rootFolderParent(ToDoListManager toDoListManager, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "rootFolderParent", getObjectLabel(toDoListManager, context) }),
						 new Object[] { toDoListManager }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the uniqueFolderId constraint of '<em>To Do List Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateToDoListManager_uniqueFolderId(ToDoListManager toDoListManager, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "uniqueFolderId", getObjectLabel(toDoListManager, context) }),
						 new Object[] { toDoListManager }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the uniqueTaskId constraint of '<em>To Do List Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateToDoListManager_uniqueTaskId(ToDoListManager toDoListManager, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "uniqueTaskId", getObjectLabel(toDoListManager, context) }),
						 new Object[] { toDoListManager }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean validateFolderManagerListener(FolderManagerListener folderManagerListener, DiagnosticChain diagnostics, Map context) {
		//return validate_EveryDefaultConstraint(folderManagerListener, diagnostics, context);
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersistenceProvider(PersistenceProvider persistenceProvider, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(persistenceProvider, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatus(Status status, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImportance(Importance importance, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFolderManagerEvent(EventObject folderManagerEvent, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntityManagerFactory(EntityManagerFactory entityManagerFactory, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntityManager(EntityManager entityManager, DiagnosticChain diagnostics, Map context) {
		return true;
	}

} //TodolistdiagValidator

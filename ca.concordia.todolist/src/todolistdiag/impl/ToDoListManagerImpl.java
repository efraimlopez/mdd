/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package todolistdiag.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EventObject;
import java.util.List;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import ca.concordia.todolist.util.EMFManager;
import ca.concordia.todolist.util.PersistenceProvider;

import todolistdiag.Folder;
import todolistdiag.FolderManagerListener;
import todolistdiag.Task;
import todolistdiag.ToDoListManager;
import todolistdiag.TodolistdiagPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Do List Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link todolistdiag.impl.ToDoListManagerImpl#getRootFolder <em>Root Folder</em>}</li>
 *   <li>{@link todolistdiag.impl.ToDoListManagerImpl#getFolderManagerListener <em>Folder Manager Listener</em>}</li>
 *   <li>{@link todolistdiag.impl.ToDoListManagerImpl#getFolders <em>Folders</em>}</li>
 *   <li>{@link todolistdiag.impl.ToDoListManagerImpl#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ToDoListManagerImpl extends EObjectImpl implements ToDoListManager {
	/**
	 * The cached value of the '{@link #getRootFolder() <em>Root Folder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootFolder()
	 * @generated
	 * @ordered
	 */
	protected Folder rootFolder;

	/**
	 * The cached value of the '{@link #getFolderManagerListener() <em>Folder Manager Listener</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFolderManagerListener()
	 * @ordered
	 */
	protected List folderManagerListener;

	/**
	 * The cached value of the '{@link #getFolders() <em>Folders</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFolders()
	 * @generated
	 * @ordered
	 */
	protected EList folders;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList tasks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToDoListManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return TodolistdiagPackage.Literals.TO_DO_LIST_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Folder getRootFolder() {
		if (rootFolder != null && rootFolder.eIsProxy()) {
			InternalEObject oldRootFolder = (InternalEObject)rootFolder;
			rootFolder = (Folder)eResolveProxy(oldRootFolder);
			if (rootFolder != oldRootFolder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TodolistdiagPackage.TO_DO_LIST_MANAGER__ROOT_FOLDER, oldRootFolder, rootFolder));
			}
		}
		if(rootFolder==null){
			List<Folder> allFolders = PersistenceProvider.getInstance().getAllObjects(FolderImpl.class);
			for(Iterator<Folder> it = allFolders.iterator(); it.hasNext(); ){
				Folder f = it.next();
				if(f.getParent()==null){
					rootFolder = f;
					break;
				}
			}
		}
		return rootFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Folder basicGetRootFolder() {
		return rootFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootFolder(Folder newRootFolder) {
		Folder oldRootFolder = rootFolder;
		rootFolder = newRootFolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TodolistdiagPackage.TO_DO_LIST_MANAGER__ROOT_FOLDER, oldRootFolder, rootFolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public List getFolderManagerListener() {
		if (folderManagerListener == null) {
			folderManagerListener = new ArrayList();
		}
		return folderManagerListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList getFolders() {
		if (folders == null) {
			folders = new EObjectResolvingEList(Folder.class, this, TodolistdiagPackage.TO_DO_LIST_MANAGER__FOLDERS);
			folders.addAll(PersistenceProvider.getInstance().getAllObjects(FolderImpl.class));
		}
		return folders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList getTasks() {
		if (tasks == null) {
			tasks = new EObjectResolvingEList(Task.class, this, TodolistdiagPackage.TO_DO_LIST_MANAGER__TASKS);
			tasks.addAll(PersistenceProvider.getInstance().getAllObjects(TaskImpl.class));
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void editTask(Task task) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteTask(Task task) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addFolderManagerListener(FolderManagerListener listener) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		getFolderManagerListener().add(listener);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void removeFolderManagerListener(FolderManagerListener listener) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		getFolderManagerListener().remove(listener);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Folder createFolder(String folderName, Folder parentFolder) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		Folder folder = EMFManager.getInstance().getFactory().createFolder();
		folder.setName(folderName);
		folder.setParent(parentFolder);
		PersistenceProvider.getInstance().persist(folder);
		parentFolder.getSubFolders().add(folder);
		//notify all the listeners
		for(Iterator it = getFolderManagerListener().iterator(); it.hasNext(); ){
			FolderManagerListener listener = (FolderManagerListener) it.next();
			listener.folderAdded(new EventObject(parentFolder));
		}
		return folder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void editFolder(Folder folder) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		PersistenceProvider.getInstance().update(folder);
		//notify all the listeners
		for(Iterator it = getFolderManagerListener().iterator(); it.hasNext(); ){
			FolderManagerListener listener = (FolderManagerListener) it.next();
			listener.folderModified(new EventObject(folder));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void deleteFolder(Folder folder) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		folder.getParent().getSubFolders().remove(folder);
		PersistenceProvider.getInstance().delete(folder);
		//notify all the listeners
		for(Iterator it = getFolderManagerListener().iterator(); it.hasNext(); ){
			FolderManagerListener listener = (FolderManagerListener) it.next();
			listener.folderDeleted(new EventObject(folder));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TodolistdiagPackage.TO_DO_LIST_MANAGER__ROOT_FOLDER:
				if (resolve) return getRootFolder();
				return basicGetRootFolder();
			case TodolistdiagPackage.TO_DO_LIST_MANAGER__FOLDER_MANAGER_LISTENER:
				return getFolderManagerListener();
			case TodolistdiagPackage.TO_DO_LIST_MANAGER__FOLDERS:
				return getFolders();
			case TodolistdiagPackage.TO_DO_LIST_MANAGER__TASKS:
				return getTasks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TodolistdiagPackage.TO_DO_LIST_MANAGER__ROOT_FOLDER:
				setRootFolder((Folder)newValue);
				return;
			case TodolistdiagPackage.TO_DO_LIST_MANAGER__FOLDER_MANAGER_LISTENER:
				getFolderManagerListener().clear();
				getFolderManagerListener().addAll((Collection)newValue);
				return;
			case TodolistdiagPackage.TO_DO_LIST_MANAGER__FOLDERS:
				getFolders().clear();
				getFolders().addAll((Collection)newValue);
				return;
			case TodolistdiagPackage.TO_DO_LIST_MANAGER__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case TodolistdiagPackage.TO_DO_LIST_MANAGER__ROOT_FOLDER:
				setRootFolder((Folder)null);
				return;
			case TodolistdiagPackage.TO_DO_LIST_MANAGER__FOLDER_MANAGER_LISTENER:
				getFolderManagerListener().clear();
				return;
			case TodolistdiagPackage.TO_DO_LIST_MANAGER__FOLDERS:
				getFolders().clear();
				return;
			case TodolistdiagPackage.TO_DO_LIST_MANAGER__TASKS:
				getTasks().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TodolistdiagPackage.TO_DO_LIST_MANAGER__ROOT_FOLDER:
				return rootFolder != null;
			case TodolistdiagPackage.TO_DO_LIST_MANAGER__FOLDER_MANAGER_LISTENER:
				return folderManagerListener != null && !folderManagerListener.isEmpty();
			case TodolistdiagPackage.TO_DO_LIST_MANAGER__FOLDERS:
				return folders != null && !folders.isEmpty();
			case TodolistdiagPackage.TO_DO_LIST_MANAGER__TASKS:
				return tasks != null && !tasks.isEmpty();
		}
		return super.eIsSet(featureID);
	}
} //ToDoListManagerImpl
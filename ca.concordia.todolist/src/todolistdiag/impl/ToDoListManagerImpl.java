/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package todolistdiag.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
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
//import ca.concordia.todolist.util.PersistenceProvider;

import todolistdiag.Folder;
import todolistdiag.FolderManagerListener;
import todolistdiag.Importance;
import todolistdiag.PersistenceProvider;
import todolistdiag.SortingType;
import todolistdiag.Status;
import todolistdiag.Task;
import todolistdiag.TaskFolderOrder;
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
 *   <li>{@link todolistdiag.impl.ToDoListManagerImpl#getPersistanceProvider <em>Persistance Provider</em>}</li>
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
	 * The cached value of the '{@link #getPersistanceProvider() <em>Persistance Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistanceProvider()
	 * @generated
	 * @ordered
	 */
	protected PersistenceProvider persistanceProvider;

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
			List<Folder> allFolders = getPersistanceProvider().getAllObjects(FolderImpl.class);
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
			folders.addAll(getPersistanceProvider().getAllObjects(FolderImpl.class));
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
			tasks.addAll(getPersistanceProvider().getAllObjects(TaskImpl.class));
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public PersistenceProvider getPersistanceProvider() {
		if (persistanceProvider != null && persistanceProvider.eIsProxy()) {
			InternalEObject oldPersistanceProvider = (InternalEObject)persistanceProvider;
			persistanceProvider = (PersistenceProvider)eResolveProxy(oldPersistanceProvider);
			if (persistanceProvider != oldPersistanceProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TodolistdiagPackage.TO_DO_LIST_MANAGER__PERSISTANCE_PROVIDER, oldPersistanceProvider, persistanceProvider));
			}
		}
		if(persistanceProvider==null){
			persistanceProvider = EMFManager.getInstance().getFactory().createPersistenceProvider();
		}
		return persistanceProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceProvider basicGetPersistanceProvider() {
		return persistanceProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistanceProvider(PersistenceProvider newPersistanceProvider) {
		PersistenceProvider oldPersistanceProvider = persistanceProvider;
		persistanceProvider = newPersistanceProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TodolistdiagPackage.TO_DO_LIST_MANAGER__PERSISTANCE_PROVIDER, oldPersistanceProvider, persistanceProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask(String name, Importance importance, Status status, String description, EList folders) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Task createTask(String name, Importance importance, Status status, String description, List folders) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		Task task = EMFManager.getInstance().getFactory().createTask();
		task.setName(name);
		task.setImportanceLevel(importance);
		task.setStatus(status);
		task.setDescription(description);
		getPersistanceProvider().persist(task);
		for(Object o : folders){
			Folder f = (Folder) o;

			TaskFolderOrder tf = EMFManager.getInstance().getFactory().createTaskFolderOrder();
			tf.setFolder(f);
			tf.setTask(task);
			tf.setTaskPosition(f.getOrderedTasks().size());
			getPersistanceProvider().persist(tf);
			
			task.getOrderedTasks().add(tf);
			f.getOrderedTasks().add(tf);
		}		
		getPersistanceProvider().persist(task);
		//notify all the listeners
		for(Iterator it = getFolderManagerListener().iterator(); it.hasNext(); ){
			FolderManagerListener listener = (FolderManagerListener) it.next();
			listener.folderModified(null);
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void editTask(Task task, Task newInfo) {
		// TODO: implement this method
		//first we removed every reference of this task from every folder it belongs 
		//to, and subsequently we remove the reference from database
		for(Object o : task.getOrderedTasks()){
			TaskFolderOrder tf = (TaskFolderOrder) o;
			tf.getFolder().getOrderedTasks().remove(tf);
			//we have to update the the task's positions in the container folder
			int i = 0;
			for(Object innerO : tf.getFolder().getOrderedTaskInOrder()){
				TaskFolderOrder innerTf = (TaskFolderOrder) innerO;
				innerTf.setTaskPosition(i++);
				getPersistanceProvider().update(innerTf);
			}
			//and we delete the reference from db
			getPersistanceProvider().delete(tf);
		}
		task.getOrderedTasks().removeAll(task.getOrderedTasks());
		
		task.setImportanceLevel(newInfo.getImportanceLevel());
		task.setName(newInfo.getName());
		task.setDescription(newInfo.getDescription());
		task.setStatus(newInfo.getStatus());
		
		//then we add the updated reference of this task to the related folders
		for(Object o : newInfo.getOrderedTasks()){
			TaskFolderOrder tf = (TaskFolderOrder) o;
			tf.setTaskPosition(tf.getFolder().getOrderedTasks().size());
			tf.setTask(task);
			getPersistanceProvider().persist(tf);
			tf.getFolder().getOrderedTasks().add(tf);
			task.getOrderedTasks().add(tf);
		}	
		getPersistanceProvider().update(task);
		
		//notify all the listeners
		for(Iterator it = getFolderManagerListener().iterator(); it.hasNext(); ){
			FolderManagerListener listener = (FolderManagerListener) it.next();
			listener.folderModified(null);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void deleteTask(Task task) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		for(Object o : task.getOrderedTasks()){
			TaskFolderOrder tf = (TaskFolderOrder) o;		
			tf.getFolder().getOrderedTasks().remove(tf);
			tf.getTask().getOrderedTasks().remove(tf);
			//we have to update the the task's positions in the container folder
			int i = 0;
			for(Object innerO : tf.getFolder().getOrderedTaskInOrder()){
				TaskFolderOrder innerTf = (TaskFolderOrder) innerO;
				innerTf.setTaskPosition(i++);
				getPersistanceProvider().update(innerTf);
			}
			//we also remove the connector/reference
			getPersistanceProvider().delete(tf);
		}
		getPersistanceProvider().delete(task);
		//notify all the listeners
		for(Iterator it = getFolderManagerListener().iterator(); it.hasNext(); ){
			FolderManagerListener listener = (FolderManagerListener) it.next();
			listener.folderModified(null);
		}
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
		getPersistanceProvider().persist(folder);
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
		getPersistanceProvider().update(folder);
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
		getPersistanceProvider().delete(folder);
		//notify all the listeners
		for(Iterator it = getFolderManagerListener().iterator(); it.hasNext(); ){
			FolderManagerListener listener = (FolderManagerListener) it.next();
			listener.folderDeleted(new EventObject(folder));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void sortTasks(SortingType sortingType, Folder folder) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//String type = sortingType;
		List<TaskFolderOrder> orderedTasks = folder.getOrderedTasks();
		if(orderedTasks==null && orderedTasks.size()==0){
			return;
		}
		if(sortingType==SortingType.BY_NAME_LITERAL){
			Collections.sort(orderedTasks, new Comparator<TaskFolderOrder>() {
				@Override
				public int compare(TaskFolderOrder t1, TaskFolderOrder t2) {
					return t1.getTask().getName().compareTo(t2.getTask().getName());
				}
			});
		}
		if(sortingType==SortingType.BY_STATUS_LITERAL){
			Collections.sort(orderedTasks, new Comparator<TaskFolderOrder>() {
				@Override
				public int compare(TaskFolderOrder t1, TaskFolderOrder t2) {
					return t2.getTask().getStatus().getValue()-t1.getTask().getStatus().getValue();
				}			
			});
		}
		if(sortingType==SortingType.BY_IMPORTANCE_LITERAL){
			Collections.sort(orderedTasks, new Comparator<TaskFolderOrder>() {
				@Override
				public int compare(TaskFolderOrder t1, TaskFolderOrder t2) {
					return t2.getTask().getImportanceLevel().getValue()-t1.getTask().getImportanceLevel().getValue();
				}	
			});
		}
		int i = 0;
		for(Object o : orderedTasks){
			TaskFolderOrder tf = (TaskFolderOrder) o;
			tf.setTaskPosition(i++);
			getPersistanceProvider().update(tf);
		}
		notifyFolderModified();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void moveTask(Task task, Folder folder, boolean up) {
		TaskFolderOrder aux = null;
		TaskFolderOrder ref = null;
		int totalElements = folder.getOrderedTaskInOrder().size();
		for(Object o : folder.getOrderedTaskInOrder()){
			TaskFolderOrder tf = (TaskFolderOrder) o;
			if(!up && ref !=null){
				aux = tf;
				break;
			}
			if(tf.getTask().equals(task)){
				ref = tf;
			}
			if(up && ref!=null) break;
			aux = tf;
		}
		long currPos = ref.getTaskPosition();
		boolean notify = false;
		if(up && currPos>0){
			ref.setTaskPosition(currPos-1);
			aux.setTaskPosition(currPos);
			notify = true;
		}else if (!up && currPos < totalElements-1){
			ref.setTaskPosition(currPos+1);
			aux.setTaskPosition(currPos);
			notify = true;
		}
		if(notify){
			getPersistanceProvider().update(aux);
			getPersistanceProvider().update(ref);
			notifyFolderModified();
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
			case TodolistdiagPackage.TO_DO_LIST_MANAGER__PERSISTANCE_PROVIDER:
				if (resolve) return getPersistanceProvider();
				return basicGetPersistanceProvider();
		}
		return eDynamicGet(featureID, resolve, coreType);
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
			case TodolistdiagPackage.TO_DO_LIST_MANAGER__PERSISTANCE_PROVIDER:
				setPersistanceProvider((PersistenceProvider)newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
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
			case TodolistdiagPackage.TO_DO_LIST_MANAGER__PERSISTANCE_PROVIDER:
				setPersistanceProvider((PersistenceProvider)null);
				return;
		}
		eDynamicUnset(featureID);
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
			case TodolistdiagPackage.TO_DO_LIST_MANAGER__PERSISTANCE_PROVIDER:
				return persistanceProvider != null;
		}
		return eDynamicIsSet(featureID);
	}
	
	public void notifyFolderModified(){
		for(Iterator it = getFolderManagerListener().iterator(); it.hasNext(); ){
			FolderManagerListener listener = (FolderManagerListener) it.next();
			listener.folderModified(null);
		}
	}
} //ToDoListManagerImpl

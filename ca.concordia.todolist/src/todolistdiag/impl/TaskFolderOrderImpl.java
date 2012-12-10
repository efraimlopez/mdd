/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package todolistdiag.impl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import todolistdiag.Folder;
import todolistdiag.Task;
import todolistdiag.TaskFolderOrder;
import todolistdiag.TodolistdiagPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Folder Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link todolistdiag.impl.TaskFolderOrderImpl#getTask <em>Task</em>}</li>
 *   <li>{@link todolistdiag.impl.TaskFolderOrderImpl#getFolder <em>Folder</em>}</li>
 *   <li>{@link todolistdiag.impl.TaskFolderOrderImpl#getId <em>Id</em>}</li>
 *   <li>{@link todolistdiag.impl.TaskFolderOrderImpl#getTaskPosition <em>Task Position</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@Entity
public class TaskFolderOrderImpl extends EObjectImpl implements TaskFolderOrder {
	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @ordered
	 */
	@ManyToOne(targetEntity=TaskImpl.class)
	protected Task task;

	/**
	 * The cached value of the '{@link #getFolder() <em>Folder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFolder()
	 * @generated
	 * @ordered
	 */
	@ManyToOne(targetEntity=FolderImpl.class)
	protected Folder folder;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	protected long id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaskPosition() <em>Task Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskPosition()
	 * @generated
	 * @ordered
	 */
	protected static final long TASK_POSITION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTaskPosition() <em>Task Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskPosition()
	 * @generated
	 * @ordered
	 */
	protected long taskPosition = TASK_POSITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskFolderOrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return TodolistdiagPackage.Literals.TASK_FOLDER_ORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getTask() {
		if (task != null && task.eIsProxy()) {
			InternalEObject oldTask = (InternalEObject)task;
			task = (Task)eResolveProxy(oldTask);
			if (task != oldTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TodolistdiagPackage.TASK_FOLDER_ORDER__TASK, oldTask, task));
			}
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetTask() {
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTask(Task newTask, NotificationChain msgs) {
		Task oldTask = task;
		task = newTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TodolistdiagPackage.TASK_FOLDER_ORDER__TASK, oldTask, newTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setTask(Task newTask) {
		if (newTask != task) {
			this.task = newTask;
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TodolistdiagPackage.TASK_FOLDER_ORDER__TASK, newTask, newTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Folder getFolder() {
		if (folder != null && folder.eIsProxy()) {
			InternalEObject oldFolder = (InternalEObject)folder;
			folder = (Folder)eResolveProxy(oldFolder);
			if (folder != oldFolder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TodolistdiagPackage.TASK_FOLDER_ORDER__FOLDER, oldFolder, folder));
			}
		}
		return folder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Folder basicGetFolder() {
		return folder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFolder(Folder newFolder, NotificationChain msgs) {
		Folder oldFolder = folder;
		folder = newFolder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TodolistdiagPackage.TASK_FOLDER_ORDER__FOLDER, oldFolder, newFolder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setFolder(Folder newFolder) {
		if (newFolder != folder) {
			this.folder = newFolder;
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TodolistdiagPackage.TASK_FOLDER_ORDER__FOLDER, newFolder, newFolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(long newId) {
		long oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TodolistdiagPackage.TASK_FOLDER_ORDER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTaskPosition() {
		return taskPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskPosition(long newTaskPosition) {
		long oldTaskPosition = taskPosition;
		taskPosition = newTaskPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TodolistdiagPackage.TASK_FOLDER_ORDER__TASK_POSITION, oldTaskPosition, taskPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TodolistdiagPackage.TASK_FOLDER_ORDER__TASK:
				if (task != null)
					msgs = ((InternalEObject)task).eInverseRemove(this, TodolistdiagPackage.TASK__ORDERED_TASKS, Task.class, msgs);
				return basicSetTask((Task)otherEnd, msgs);
			case TodolistdiagPackage.TASK_FOLDER_ORDER__FOLDER:
				if (folder != null)
					msgs = ((InternalEObject)folder).eInverseRemove(this, TodolistdiagPackage.FOLDER__ORDERED_TASKS, Folder.class, msgs);
				return basicSetFolder((Folder)otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TodolistdiagPackage.TASK_FOLDER_ORDER__TASK:
				return basicSetTask(null, msgs);
			case TodolistdiagPackage.TASK_FOLDER_ORDER__FOLDER:
				return basicSetFolder(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TodolistdiagPackage.TASK_FOLDER_ORDER__TASK:
				if (resolve) return getTask();
				return basicGetTask();
			case TodolistdiagPackage.TASK_FOLDER_ORDER__FOLDER:
				if (resolve) return getFolder();
				return basicGetFolder();
			case TodolistdiagPackage.TASK_FOLDER_ORDER__ID:
				return new Long(getId());
			case TodolistdiagPackage.TASK_FOLDER_ORDER__TASK_POSITION:
				return new Long(getTaskPosition());
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
			case TodolistdiagPackage.TASK_FOLDER_ORDER__TASK:
				setTask((Task)newValue);
				return;
			case TodolistdiagPackage.TASK_FOLDER_ORDER__FOLDER:
				setFolder((Folder)newValue);
				return;
			case TodolistdiagPackage.TASK_FOLDER_ORDER__ID:
				setId(((Long)newValue).longValue());
				return;
			case TodolistdiagPackage.TASK_FOLDER_ORDER__TASK_POSITION:
				setTaskPosition(((Long)newValue).longValue());
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
			case TodolistdiagPackage.TASK_FOLDER_ORDER__TASK:
				setTask((Task)null);
				return;
			case TodolistdiagPackage.TASK_FOLDER_ORDER__FOLDER:
				setFolder((Folder)null);
				return;
			case TodolistdiagPackage.TASK_FOLDER_ORDER__ID:
				setId(ID_EDEFAULT);
				return;
			case TodolistdiagPackage.TASK_FOLDER_ORDER__TASK_POSITION:
				setTaskPosition(TASK_POSITION_EDEFAULT);
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
			case TodolistdiagPackage.TASK_FOLDER_ORDER__TASK:
				return task != null;
			case TodolistdiagPackage.TASK_FOLDER_ORDER__FOLDER:
				return folder != null;
			case TodolistdiagPackage.TASK_FOLDER_ORDER__ID:
				return id != ID_EDEFAULT;
			case TodolistdiagPackage.TASK_FOLDER_ORDER__TASK_POSITION:
				return taskPosition != TASK_POSITION_EDEFAULT;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", taskPosition: ");
		result.append(taskPosition);
		result.append(')');
		return result.toString();
	}

} //TaskFolderOrderImpl

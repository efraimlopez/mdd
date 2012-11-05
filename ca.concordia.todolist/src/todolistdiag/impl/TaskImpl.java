/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package todolistdiag.impl;

import java.util.Collection;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import todolistdiag.Folder;
import todolistdiag.Importance;
import todolistdiag.Status;
import todolistdiag.Task;
import todolistdiag.TodolistdiagPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link todolistdiag.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link todolistdiag.impl.TaskImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link todolistdiag.impl.TaskImpl#getImportanceLevel <em>Importance Level</em>}</li>
 *   <li>{@link todolistdiag.impl.TaskImpl#getParentFolders <em>Parent Folders</em>}</li>
 *   <li>{@link todolistdiag.impl.TaskImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link todolistdiag.impl.TaskImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@Entity
public class TaskImpl extends EObjectImpl implements Task {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	@Transient
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	@Transient
	protected static final Status STATUS_EDEFAULT = Status.NOT_STARTED_LITERAL;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	@Transient
	protected Status status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getImportanceLevel() <em>Importance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportanceLevel()
	 * @generated
	 * @ordered
	 */
	@Transient
	protected static final Importance IMPORTANCE_LEVEL_EDEFAULT = Importance.LOW_LITERAL;

	/**
	 * The cached value of the '{@link #getImportanceLevel() <em>Importance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportanceLevel()
	 * @generated
	 * @ordered
	 */
	@Transient
	protected Importance importanceLevel = IMPORTANCE_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParentFolders() <em>Parent Folders</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentFolders()
	 * @generated
	 * @ordered
	 */
	@ManyToMany(targetEntity=FolderImpl.class,mappedBy="tasks",fetch=FetchType.EAGER)
	protected List parentFolders;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	@Transient
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	protected long id = ID_EDEFAULT;

	protected String statusPersistanceable = this.getStatus().toString();
	protected String importancePersistanceable = this.getImportanceLevel().toString();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return TodolistdiagPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TodolistdiagPackage.TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setStatus(Status newStatus) {
		Status oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		this.setStatusPersistanceable(status.toString());
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TodolistdiagPackage.TASK__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Importance getImportanceLevel() {
		return importanceLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportanceLevel(Importance newImportanceLevel) {
		Importance oldImportanceLevel = importanceLevel;
		importanceLevel = newImportanceLevel == null ? IMPORTANCE_LEVEL_EDEFAULT : newImportanceLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TodolistdiagPackage.TASK__IMPORTANCE_LEVEL, oldImportanceLevel, importanceLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getParentFolders() {
		if (parentFolders == null) {
			parentFolders = new EObjectWithInverseResolvingEList.ManyInverse(Folder.class, this, TodolistdiagPackage.TASK__PARENT_FOLDERS, TodolistdiagPackage.FOLDER__TASKS);
		}
		return parentFolders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TodolistdiagPackage.TASK__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TodolistdiagPackage.TASK__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void statusNotStarted() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void statusInProgress() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void statusDone() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TodolistdiagPackage.TASK__PARENT_FOLDERS:
				return ((InternalEList)getParentFolders()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TodolistdiagPackage.TASK__PARENT_FOLDERS:
				return ((InternalEList)getParentFolders()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TodolistdiagPackage.TASK__NAME:
				return getName();
			case TodolistdiagPackage.TASK__STATUS:
				return getStatus();
			case TodolistdiagPackage.TASK__IMPORTANCE_LEVEL:
				return getImportanceLevel();
			case TodolistdiagPackage.TASK__PARENT_FOLDERS:
				return getParentFolders();
			case TodolistdiagPackage.TASK__DESCRIPTION:
				return getDescription();
			case TodolistdiagPackage.TASK__ID:
				return new Long(getId());
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
			case TodolistdiagPackage.TASK__NAME:
				setName((String)newValue);
				return;
			case TodolistdiagPackage.TASK__STATUS:
				setStatus((Status)newValue);
				return;
			case TodolistdiagPackage.TASK__IMPORTANCE_LEVEL:
				setImportanceLevel((Importance)newValue);
				return;
			case TodolistdiagPackage.TASK__PARENT_FOLDERS:
				getParentFolders().clear();
				getParentFolders().addAll((Collection)newValue);
				return;
			case TodolistdiagPackage.TASK__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TodolistdiagPackage.TASK__ID:
				setId(((Long)newValue).longValue());
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
			case TodolistdiagPackage.TASK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TodolistdiagPackage.TASK__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case TodolistdiagPackage.TASK__IMPORTANCE_LEVEL:
				setImportanceLevel(IMPORTANCE_LEVEL_EDEFAULT);
				return;
			case TodolistdiagPackage.TASK__PARENT_FOLDERS:
				getParentFolders().clear();
				return;
			case TodolistdiagPackage.TASK__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TodolistdiagPackage.TASK__ID:
				setId(ID_EDEFAULT);
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
			case TodolistdiagPackage.TASK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TodolistdiagPackage.TASK__STATUS:
				return status != STATUS_EDEFAULT;
			case TodolistdiagPackage.TASK__IMPORTANCE_LEVEL:
				return importanceLevel != IMPORTANCE_LEVEL_EDEFAULT;
			case TodolistdiagPackage.TASK__PARENT_FOLDERS:
				return parentFolders != null && !parentFolders.isEmpty();
			case TodolistdiagPackage.TASK__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TodolistdiagPackage.TASK__ID:
				return id != ID_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", status: ");
		result.append(status);
		result.append(", importanceLevel: ");
		result.append(importanceLevel);
		result.append(", description: ");
		result.append(description);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}
	/**
	 * workaround the persist emf enumeration state
	 * @return
	 */
	public String getStatusPersistanceable(){
		return this.statusPersistanceable;
	}
	/**
	 * workaround the persist emf enumeration state
	 * @param status
	 */
	public void setStatusPersistanceable(String status){
		this.statusPersistanceable = status;
	}
	/**
	 * workaround the persist emf enumeration state
	 * @return
	 */
	public String getImportancePersistanceable(){
		return this.statusPersistanceable;
	}
	/**
	 * workaround the persist emf enumeration state
	 * @param importance
	 */
	public void setImportancePersistanceable(String importance){
		this.statusPersistanceable = importance;
	}

} //TaskImpl

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
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import todolistdiag.Folder;
import todolistdiag.Task;
import todolistdiag.TaskFolderOrder;
import todolistdiag.TodolistdiagPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Folder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link todolistdiag.impl.FolderImpl#getSubFolders <em>Sub Folders</em>}</li>
 *   <li>{@link todolistdiag.impl.FolderImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link todolistdiag.impl.FolderImpl#getId <em>Id</em>}</li>
 *   <li>{@link todolistdiag.impl.FolderImpl#getName <em>Name</em>}</li>
 *   <li>{@link todolistdiag.impl.FolderImpl#getOrderedTasks <em>Ordered Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@Entity
public class FolderImpl extends EObjectImpl implements Folder {

	/**
	 * The cached value of the '{@link #getSubFolders() <em>Sub Folders</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubFolders()
	 * @ordered
	 */
	@OneToMany(targetEntity=FolderImpl.class,fetch=FetchType.EAGER,mappedBy="parent",cascade=CascadeType.REMOVE)
	//@JoinColumn(name="id",referencedColumnName="parent_id")
	protected List subFolders;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	@ManyToOne(targetEntity=FolderImpl.class)
	//@JoinColumn(name="parent_id",referencedColumnName="id",nullable=true)
	protected Folder parent;

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
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
	 * The cached value of the '{@link #getOrderedTasks() <em>Ordered Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderedTasks()
	 * @ordered
	 */
	@OneToMany(targetEntity=TaskFolderOrderImpl.class,mappedBy="folder",fetch=FetchType.EAGER)
	protected List orderedTasks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return TodolistdiagPackage.Literals.FOLDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getSubFolders() {
		if (subFolders == null) {
			subFolders = new EObjectResolvingEList(Folder.class, this, TodolistdiagPackage.FOLDER__SUB_FOLDERS);
		}
		return subFolders;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TodolistdiagPackage.FOLDER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public List getOrderedTasks() {
		if (orderedTasks == null) {
			//parentFolders = new EObjectWithInverseResolvingEList.ManyInverse(Folder.class, this, TodolistdiagPackage.TASK__PARENT_FOLDERS, TodolistdiagPackage.FOLDER__TASKS);
			orderedTasks = new ArrayList();
		}
		return orderedTasks;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TodolistdiagPackage.FOLDER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Folder getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (Folder)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TodolistdiagPackage.FOLDER__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Folder basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Folder newParent) {
		Folder oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TodolistdiagPackage.FOLDER__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean hasSubFolder() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		return getSubFolders().size()>0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public List getAssociatedTasks() {
		List r = new ArrayList();
		List oderedTasks = this.getOrderedTaskInOrder();
		if(oderedTasks!=null)
			for(Object o : oderedTasks){
				TaskFolderOrder tf = (TaskFolderOrder) o;
				r.add(tf.getTask());
			}
		return r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public List getOrderedTaskInOrder() {
		if(orderedTasks!=null)
			Collections.sort(orderedTasks, new Comparator<TaskFolderOrder>() {
				@Override
				public int compare(TaskFolderOrder t1, TaskFolderOrder t2) {
					return (int) (t1.getTaskPosition()-t2.getTaskPosition());
				}			
			});
		return orderedTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TodolistdiagPackage.FOLDER__ORDERED_TASKS:
				return ((InternalEList)getOrderedTasks()).basicAdd(otherEnd, msgs);
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
			case TodolistdiagPackage.FOLDER__ORDERED_TASKS:
				return ((InternalEList)getOrderedTasks()).basicRemove(otherEnd, msgs);
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
			case TodolistdiagPackage.FOLDER__SUB_FOLDERS:
				return getSubFolders();
			case TodolistdiagPackage.FOLDER__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case TodolistdiagPackage.FOLDER__ID:
				return new Long(getId());
			case TodolistdiagPackage.FOLDER__NAME:
				return getName();
			case TodolistdiagPackage.FOLDER__ORDERED_TASKS:
				return getOrderedTasks();
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
			case TodolistdiagPackage.FOLDER__SUB_FOLDERS:
				getSubFolders().clear();
				getSubFolders().addAll((Collection)newValue);
				return;
			case TodolistdiagPackage.FOLDER__PARENT:
				setParent((Folder)newValue);
				return;
			case TodolistdiagPackage.FOLDER__ID:
				setId(((Long)newValue).longValue());
				return;
			case TodolistdiagPackage.FOLDER__NAME:
				setName((String)newValue);
				return;
			case TodolistdiagPackage.FOLDER__ORDERED_TASKS:
				getOrderedTasks().clear();
				getOrderedTasks().addAll((Collection)newValue);
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
			case TodolistdiagPackage.FOLDER__SUB_FOLDERS:
				getSubFolders().clear();
				return;
			case TodolistdiagPackage.FOLDER__PARENT:
				setParent((Folder)null);
				return;
			case TodolistdiagPackage.FOLDER__ID:
				setId(ID_EDEFAULT);
				return;
			case TodolistdiagPackage.FOLDER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TodolistdiagPackage.FOLDER__ORDERED_TASKS:
				getOrderedTasks().clear();
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
			case TodolistdiagPackage.FOLDER__SUB_FOLDERS:
				return subFolders != null && !subFolders.isEmpty();
			case TodolistdiagPackage.FOLDER__PARENT:
				return parent != null;
			case TodolistdiagPackage.FOLDER__ID:
				return id != ID_EDEFAULT;
			case TodolistdiagPackage.FOLDER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TodolistdiagPackage.FOLDER__ORDERED_TASKS:
				return orderedTasks != null && !orderedTasks.isEmpty();
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
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FolderImpl

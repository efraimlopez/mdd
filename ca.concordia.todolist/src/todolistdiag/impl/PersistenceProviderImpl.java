/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package todolistdiag.impl;

import java.util.List;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import ca.concordia.todolist.util.EMFManager;

import todolistdiag.Folder;
import todolistdiag.Importance;
import todolistdiag.PersistenceProvider;
import todolistdiag.Status;
import todolistdiag.Task;
import todolistdiag.TodolistdiagPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persistence Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link todolistdiag.impl.PersistenceProviderImpl#getPERSISTENCE_UNIT_NAME <em>PERSISTENCE UNIT NAME</em>}</li>
 *   <li>{@link todolistdiag.impl.PersistenceProviderImpl#getFactory <em>Factory</em>}</li>
 *   <li>{@link todolistdiag.impl.PersistenceProviderImpl#getEntitymanager <em>Entitymanager</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersistenceProviderImpl extends EObjectImpl implements PersistenceProvider {
	/**
	 * The default value of the '{@link #getPERSISTENCE_UNIT_NAME() <em>PERSISTENCE UNIT NAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPERSISTENCE_UNIT_NAME()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSISTENCE_UNIT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPERSISTENCE_UNIT_NAME() <em>PERSISTENCE UNIT NAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPERSISTENCE_UNIT_NAME()
	 * @generated
	 * @ordered
	 */
	protected String persistencE_UNIT_NAME = PERSISTENCE_UNIT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFactory() <em>Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactory()
	 * @generated
	 * @ordered
	 */
	protected static final EntityManagerFactory FACTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFactory() <em>Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactory()
	 * @generated
	 * @ordered
	 */
	protected EntityManagerFactory factory = FACTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntitymanager() <em>Entitymanager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntitymanager()
	 * @generated
	 * @ordered
	 */
	protected static final EntityManager ENTITYMANAGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntitymanager() <em>Entitymanager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntitymanager()
	 * @generated
	 * @ordered
	 */
	protected EntityManager entitymanager = ENTITYMANAGER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersistenceProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return TodolistdiagPackage.Literals.PERSISTENCE_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPERSISTENCE_UNIT_NAME() {
		return persistencE_UNIT_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityManagerFactory getFactory() {
		return factory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactory(EntityManagerFactory newFactory) {
		EntityManagerFactory oldFactory = factory;
		factory = newFactory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TodolistdiagPackage.PERSISTENCE_PROVIDER__FACTORY, oldFactory, factory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityManager getEntitymanager() {
		return entitymanager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntitymanager(EntityManager newEntitymanager) {
		EntityManager oldEntitymanager = entitymanager;
		entitymanager = newEntitymanager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TodolistdiagPackage.PERSISTENCE_PROVIDER__ENTITYMANAGER, oldEntitymanager, entitymanager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void startEmbeddedDB() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
	    factory = Persistence.createEntityManagerFactory("todolist");
	    entitymanager = factory.createEntityManager();
	    Query q = entitymanager.createQuery("select t from FolderImpl t");
	    List<Folder> todoList = q.getResultList();
	    
	    if(todoList == null || todoList.size()<1){
	    	Folder rootFolder = EMFManager.getInstance().getFactory().createFolder();
	    	rootFolder.setName("root");
	    	rootFolder.setParent(null);  	
	    	persist(rootFolder);
	    }
	    
	    q = entitymanager.createQuery("select t from TaskImpl t");
	    List<Task> todoList2 = q.getResultList();
	    if(todoList2!=null){
	    	for(Object o : todoList2){
	    		TaskImpl t = (TaskImpl) o;
	    		t.updateEnumerators();
	    		System.out.println("Task->"+t.getId()+"/name="+t.getName()+"/importance="+t.getImportanceLevel()+"/status="+t.getStatus()+"/description="+t.getDescription());
	    	}
	    }
		// Registers a shutdown hook for the apache derbi instance so that it
	    // shuts down nicely when the VM exits (even if you "Ctrl-C" the
	    // running example before it's completed)
	    Runtime.getRuntime().addShutdownHook( new Thread()
	    {
	        @Override
	        public void run()
	        {
	        	entitymanager.close();
	        	factory.close();
	        }
	    } );
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void persist(Object o) {
		entitymanager.getTransaction().begin();
		try {
		entitymanager.persist(o);
		entitymanager.getTransaction().commit();
		} catch (EntityExistsException|IllegalStateException|IllegalArgumentException e) {
		entitymanager.getTransaction().rollback();
		e.printStackTrace();
		} 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void update(Object o) {
		entitymanager.getTransaction().begin();
		try {
		entitymanager.persist(entitymanager.merge(o));
		entitymanager.getTransaction().commit();
		} catch (IllegalStateException|IllegalArgumentException e) {
		entitymanager.getTransaction().rollback();
		e.printStackTrace();
		} 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void delete(Object o) {
		entitymanager.getTransaction().begin();
		try {
		entitymanager.remove(entitymanager.merge(o));
		entitymanager.getTransaction().commit();
		} catch (IllegalStateException|IllegalArgumentException e) {
		entitymanager.getTransaction().rollback();
		e.printStackTrace();
		} 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void init() {
		startEmbeddedDB();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getAllObjects(EClass entityType) {
		Query q = entitymanager.createQuery("select t from "+entityType.getName()+" t");
		   return q.getResultList();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public List getAllObjects(Class entityType) {
		Query q = entitymanager.createQuery("select t from "+entityType.getName()+" t");
		   return q.getResultList();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TodolistdiagPackage.PERSISTENCE_PROVIDER__PERSISTENCE_UNIT_NAME:
				return getPERSISTENCE_UNIT_NAME();
			case TodolistdiagPackage.PERSISTENCE_PROVIDER__FACTORY:
				return getFactory();
			case TodolistdiagPackage.PERSISTENCE_PROVIDER__ENTITYMANAGER:
				return getEntitymanager();
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
			case TodolistdiagPackage.PERSISTENCE_PROVIDER__FACTORY:
				setFactory((EntityManagerFactory)newValue);
				return;
			case TodolistdiagPackage.PERSISTENCE_PROVIDER__ENTITYMANAGER:
				setEntitymanager((EntityManager)newValue);
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
			case TodolistdiagPackage.PERSISTENCE_PROVIDER__FACTORY:
				setFactory(FACTORY_EDEFAULT);
				return;
			case TodolistdiagPackage.PERSISTENCE_PROVIDER__ENTITYMANAGER:
				setEntitymanager(ENTITYMANAGER_EDEFAULT);
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
			case TodolistdiagPackage.PERSISTENCE_PROVIDER__PERSISTENCE_UNIT_NAME:
				return PERSISTENCE_UNIT_NAME_EDEFAULT == null ? persistencE_UNIT_NAME != null : !PERSISTENCE_UNIT_NAME_EDEFAULT.equals(persistencE_UNIT_NAME);
			case TodolistdiagPackage.PERSISTENCE_PROVIDER__FACTORY:
				return FACTORY_EDEFAULT == null ? factory != null : !FACTORY_EDEFAULT.equals(factory);
			case TodolistdiagPackage.PERSISTENCE_PROVIDER__ENTITYMANAGER:
				return ENTITYMANAGER_EDEFAULT == null ? entitymanager != null : !ENTITYMANAGER_EDEFAULT.equals(entitymanager);
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
		result.append(" (PERSISTENCE_UNIT_NAME: ");
		result.append(persistencE_UNIT_NAME);
		result.append(", factory: ");
		result.append(factory);
		result.append(", entitymanager: ");
		result.append(entitymanager);
		result.append(')');
		return result.toString();
	}

} //PersistenceProviderImpl

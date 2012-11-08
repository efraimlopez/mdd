/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package todolistdiag;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persistence Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link todolistdiag.PersistenceProvider#getPERSISTENCE_UNIT_NAME <em>PERSISTENCE UNIT NAME</em>}</li>
 *   <li>{@link todolistdiag.PersistenceProvider#getFactory <em>Factory</em>}</li>
 *   <li>{@link todolistdiag.PersistenceProvider#getEntitymanager <em>Entitymanager</em>}</li>
 * </ul>
 * </p>
 *
 * @see todolistdiag.TodolistdiagPackage#getPersistenceProvider()
 * @model
 * @generated
 */
public interface PersistenceProvider extends EObject {
	/**
	 * Returns the value of the '<em><b>PERSISTENCE UNIT NAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PERSISTENCE UNIT NAME</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PERSISTENCE UNIT NAME</em>' attribute.
	 * @see todolistdiag.TodolistdiagPackage#getPersistenceProvider_PERSISTENCE_UNIT_NAME()
	 * @model required="true" changeable="false"
	 * @generated
	 */
	String getPERSISTENCE_UNIT_NAME();

	/**
	 * Returns the value of the '<em><b>Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factory</em>' attribute.
	 * @see #setFactory(EntityManagerFactory)
	 * @see todolistdiag.TodolistdiagPackage#getPersistenceProvider_Factory()
	 * @model dataType="todolistdiag.EntityManagerFactory"
	 * @generated
	 */
	EntityManagerFactory getFactory();

	/**
	 * Sets the value of the '{@link todolistdiag.PersistenceProvider#getFactory <em>Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factory</em>' attribute.
	 * @see #getFactory()
	 * @generated
	 */
	void setFactory(EntityManagerFactory value);

	/**
	 * Returns the value of the '<em><b>Entitymanager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entitymanager</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entitymanager</em>' attribute.
	 * @see #setEntitymanager(EntityManager)
	 * @see todolistdiag.TodolistdiagPackage#getPersistenceProvider_Entitymanager()
	 * @model dataType="todolistdiag.EntityManager"
	 * @generated
	 */
	EntityManager getEntitymanager();

	/**
	 * Sets the value of the '{@link todolistdiag.PersistenceProvider#getEntitymanager <em>Entitymanager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entitymanager</em>' attribute.
	 * @see #getEntitymanager()
	 * @generated
	 */
	void setEntitymanager(EntityManager value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void startEmbeddedDB();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='entitymanager.getTransaction().begin();\ntry {\nentitymanager.persist(o);\nentitymanager.getTransaction().commit();\n} catch (EntityExistsException|IllegalStateException|IllegalArgumentException e) {\nentitymanager.getTransaction().rollback();\ne.printStackTrace();\n} '"
	 * @generated
	 */
	void persist(Object o);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='entitymanager.getTransaction().begin();\ntry {\nentitymanager.persist(entitymanager.merge(o));\nentitymanager.getTransaction().commit();\n} catch (IllegalStateException|IllegalArgumentException e) {\nentitymanager.getTransaction().rollback();\ne.printStackTrace();\n} '"
	 * @generated
	 */
	void update(Object o);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='entitymanager.getTransaction().begin();\ntry {\nentitymanager.remove(entitymanager.merge(o));\nentitymanager.getTransaction().commit();\n} catch (IllegalStateException|IllegalArgumentException e) {\nentitymanager.getTransaction().rollback();\ne.printStackTrace();\n} '"
	 * @generated
	 */
	void delete(Object o);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='startEmbeddedDB();'"
	 * @generated
	 */
	void init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="todolistdiag.Folder"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='Query q = entitymanager.createQuery(\"select t from \"+entityType.getName()+\" t\");\n   return q.getResultList();'"
	 * @generated
	 */
	List getAllObjects(EClass entityType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="todolistdiag.Folder"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='Query q = entitymanager.createQuery(\"select t from \"+entityType.getName()+\" t\");\n   return q.getResultList();'"
	 */
	List getAllObjects(Class entityType);

} // PersistenceProvider

/**
  * Copyright (C) 2012 - Concordia University, CANADA
  *
  * This program is free software; you can redistribute it and/or modify
  * it under the terms of the GNU General Public License, version 3 only,
  * as published by the Free Software Foundation.
  *
  * This program is distributed in the hope that it will be useful, but WITHOUT
  * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
  * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
  * more details.
  *
  * You should have received a copy of the GNU General Public License along
  * with this program; if not, write to the Free Software Foundation, Inc.,
  * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
  */
package ca.concordia.todolist.util;

import java.util.List;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import todolistdiag.Folder;
import todolistdiag.Importance;
import todolistdiag.Status;
import todolistdiag.Task;

/**
 * @author Efraim J Lopez
 *
 */
public class PersistenceProvider {
	/**
	 * The unique instance of the database wrapper
	 */
	private static PersistenceProvider singleton;
	/**
	 * the persistence unit, for more check jpa javadoc
	 */
	private final String PERSISTENCE_UNIT_NAME = "todolist";
	/**
	 * the entity manager factory used to create entity managers
	 */
	private EntityManagerFactory factory;
	/**
	 * the entity manager used to persist, update entities
	 */
	private EntityManager entityManager;
	
	private PersistenceProvider(){
		//nothing to do here
	}
	
	public static PersistenceProvider getInstance(){
		if(singleton==null){
			singleton = new PersistenceProvider();
		}
		return singleton;
	}
	/**
	 * initialize the database service
	 */
	public void init(){
		System.setProperty("derby.system.home", System.getProperty("user.home"));
		startEmbeddedDB();
	}
	/**
	 * Starts the Database
	 */
	private void startEmbeddedDB(){
	    factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	    entityManager = factory.createEntityManager();
	    Query q = entityManager.createQuery("select t from FolderImpl t");
	    List<Folder> todoList = q.getResultList();

	    if(todoList == null || todoList.size()<1){
	    	Folder rootFolder = EMFManager.getInstance().getFactory().createFolder();
	    	rootFolder.setName("root");
	    	rootFolder.setParent(null);  	
	    	persist(rootFolder);
	    	
	    	Folder subFolder = EMFManager.getInstance().getFactory().createFolder();
	    	subFolder.setName("subFolder");
	    	subFolder.setParent(rootFolder);    	
	    	persist(subFolder);
	    	
	    	rootFolder.getSubFolders().add(subFolder);
	    	
	    	Task task1 = EMFManager.getInstance().getFactory().createTask();
	    	task1.setImportanceLevel(Importance.HIGH_LITERAL);
	    	task1.setName("Finish this Project");
	    	task1.setDescription("this is a test task");
	    	task1.setStatus(Status.IN_PROGRESS_LITERAL);
	    	task1.getParentFolders().add(subFolder);
	    	persist(task1);
	    }
	    q = entityManager.createQuery("select t from TaskImpl t");
	    List<Task> todoList2 = q.getResultList();
	    if(todoList2!=null){
	    	for(Object o : todoList2){
	    		Task t = (Task) o;
	    		System.out.println("task = "+t.getName() + " /// "+ t.getParentFolders().toString());
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
	        	entityManager.close();
	        	factory.close();
	        }
	    } );
	}
	/**
	 * persist the object in the embedded database
	 * @param o
	 */
	public void persist(Object o){
		entityManager.getTransaction().begin();
		try {
			entityManager.persist(o);
			entityManager.getTransaction().commit();
		} catch (EntityExistsException|IllegalStateException|IllegalArgumentException e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace();
		} 
	}
	/**
	 * update the object in the embedded database
	 * @param o
	 */
	public void update(Object o){
		entityManager.getTransaction().begin();
		try {
			entityManager.persist(entityManager.merge(o));
			entityManager.getTransaction().commit();
		} catch (IllegalStateException|IllegalArgumentException e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace();
		} 
	}
	public Object merge(Object o){
		Object ret = null;
		entityManager.getTransaction().begin();
		try {
			ret = entityManager.merge(o);
			entityManager.getTransaction().commit();
		} catch (IllegalStateException|IllegalArgumentException e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace();
		}
		return ret;
	}
	/**
	 * removes the object from the embedded database
	 * @param o
	 */
	public void delete(Object o){
		entityManager.getTransaction().begin();
		try {
			entityManager.remove(entityManager.merge(o));
			entityManager.getTransaction().commit();
		} catch (IllegalStateException|IllegalArgumentException e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace();
		} 		
	}
	/**
	 * returns all objects of the given type from the embedded database
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Folder> getAllObjects(Class entityType){
	    Query q = entityManager.createQuery("select t from "+entityType.getName()+" t");
	    return q.getResultList();
	}
	/**
	 * Find the object associated with the given id
	 * @param id
	 * @param entityType
	 * @return
	 */
	public <T> T findById(Long id, Class<T> entityType){
		return entityManager.find(entityType, id);
	}
}

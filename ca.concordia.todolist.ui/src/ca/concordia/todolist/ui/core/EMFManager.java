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
package ca.concordia.todolist.ui.core;

import todolistdiag.FoldersManager;
import todolistdiag.TodolistdiagFactory;
import todolistdiag.impl.TodolistdiagPackageImpl;

/**
 * @author Efraim J Lopez
 *
 */
public class EMFManager {
	/**
	 * The unique instance of the manager
	 */
	private static EMFManager singleton;
	/**
	 * The unique instance of the folders manager
	 */
	private FoldersManager foldersManager = null;
	/**
	 * the constructor
	 */
	private EMFManager(){
		//nothing to do here
	}
	/**
	 * returns the singleton instance of this manager
	 * @return the singleton instance of this manager
	 */
	public static EMFManager getInstance(){
		if(singleton==null){
			singleton = new EMFManager();
		}
		return singleton;
	}
	/**
	 * initialize the emf manager service
	 */
	public void init(){
		initializaEMFComponents();
	}
	/**
	 * Initializes the core EMF components
	 */
	private void initializaEMFComponents(){
		TodolistdiagPackageImpl.init();
		// Retrieve the default factory singleton
		TodolistdiagFactory factory = TodolistdiagFactory.eINSTANCE;
		// Create an instance of foldersManager
		foldersManager = factory.createFoldersManager();
	}
	
	/**
	 * returns the instance of the {@link FoldersManager}
	 * @return the instance of the {@link FoldersManager}
	 */
	public FoldersManager getFoldersManager(){
		return this.foldersManager;
	}
	
	/**
	 * Gets the factory that must be used to create EMF generated components
	 * @return the factory that must be used to create EMF generated components
	 */
	public TodolistdiagFactory getFactory(){
		return TodolistdiagFactory.eINSTANCE;
	}
}

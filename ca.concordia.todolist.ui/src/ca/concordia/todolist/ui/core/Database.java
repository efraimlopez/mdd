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

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;

/**
 * @author Efraim J Lopez
 *
 */
public class Database {
	/**
	 * The unique instance of the database wrapper
	 */
	private static Database singleton;
	/**
	 * indicates the relative path to the embedded database
	 */
	private static final String DB_PATH = "db";
	/**
	 * the instance of the embedded database
	 */
	private static GraphDatabaseService graphDb = null;
	
	private Database(){
		//nothing to do here
	}
	
	public static Database getInstance(){
		if(singleton==null){
			singleton = new Database();
		}
		return singleton;
	}
	
	/**
	 * initialize the database service
	 */
	public void init(){
		startEmbeddedDB();
	}
	/**
	 * Starts the Database
	 */
	private void startEmbeddedDB(){
		graphDb = new GraphDatabaseFactory().newEmbeddedDatabase( DB_PATH );
		// Registers a shutdown hook for the Neo4j instance so that it
	    // shuts down nicely when the VM exits (even if you "Ctrl-C" the
	    // running example before it's completed)
	    Runtime.getRuntime().addShutdownHook( new Thread()
	    {
	        @Override
	        public void run()
	        {
	            graphDb.shutdown();
	        }
	    } );
	}
}

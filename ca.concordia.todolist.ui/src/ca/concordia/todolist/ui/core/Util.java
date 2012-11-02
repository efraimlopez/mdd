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

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.jface.resource.ImageDescriptor;

/**
 * @author Efraim J Lopez
 *
 */
public class Util {	
	/**
	 * Holds the name of the file used to graphically represent a folder
	 */
	public static String FOLDER_IMG_FILE = "folder.png";
	/**
	 * Holds the name of the file used to graphically represent a task
	 */
	public static String TASK_IMG_FILE = "task.png";
	/**
	 * Returns the associated image descriptor for the given image file name
	 * @param name the image file name
	 * @return the associated image descriptor for the given image file name
	 */
	public static ImageDescriptor getImageDescriptor(String name) {
		String iconPath = "icons/";
		try {
		    File currentDir = new File(System.getProperty("user.dir"));
		    URL baseUrl = currentDir.toURI().toURL();
			URL url = new URL(baseUrl, iconPath + name);
			return ImageDescriptor.createFromURL(url);
		} catch (MalformedURLException e) {
			return ImageDescriptor.getMissingImageDescriptor();
		}
	}
}

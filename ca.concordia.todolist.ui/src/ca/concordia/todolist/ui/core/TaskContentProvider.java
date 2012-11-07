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

import java.util.EventObject;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;

import todolistdiag.Folder;
import todolistdiag.FolderManagerListener;
import todolistdiag.ToDoListManager;

/**
 * @author Efraim J Lopez
 *
 */
public class TaskContentProvider implements IStructuredContentProvider,FolderManagerListener{
	/**
	 * the viewer to which this content provider is associated
	 */
	private TableViewer fViewer = null;
	/**
	 * the model manager {@link FoldersManager}
	 *
	 */
	private ToDoListManager manager = null;
	/**
	 * The folder containing the tasks being shown by this table viewer
	 */
	private Folder containerFolder = null;
	/**
	 * Class constructor
	 */
	public TaskContentProvider(ToDoListManager manager){
		this.manager = manager;
		//we have to register to the listener here
	}
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		this.fViewer = (TableViewer) viewer;
		if (manager != null)
			manager.removeFolderManagerListener(this);
		containerFolder = (Folder) newInput;
		if (manager != null)
			manager.addFolderManagerListener(this);
	}
	@Override
	public Object[] getElements(Object arg0) {
		return containerFolder.getTasks().toArray();
	}
	@Override
	public void folderAdded(EventObject event) {
		// TODO Auto-generated method stub
		//nothing here
	}
	@Override
	public void folderDeleted(EventObject event) {
		// TODO Auto-generated method stub
		//nothing here
	}
	@Override
	public void folderModified(EventObject event) {
		// TODO Auto-generated method stub
		updateViewer();
	}
	private void updateViewer(){
        // Ignore update if disposed
        if (fViewer.getTable().isDisposed()) {
            return;
        }
        fViewer.getTable().getDisplay().asyncExec(new Runnable() {
            @Override
            public void run() {
                if (!fViewer.getTable().isDisposed()) {
            		fViewer.refresh();
                }
            }
        });			
	}

}

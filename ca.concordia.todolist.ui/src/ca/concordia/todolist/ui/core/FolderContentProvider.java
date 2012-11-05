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

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;

import ca.concordia.todolist.util.PersistenceProvider;

import todolistdiag.Folder;
import todolistdiag.FolderManagerListener;
import todolistdiag.ToDoListManager;

/**
 * @author Efraim J Lopez
 *
 */
public class FolderContentProvider implements ITreeContentProvider,FolderManagerListener{
	/**
	 * the viewer to which this content provider is associated
	 */
	private TreeViewer fViewer = null;
	/**
	 * the model manager {@link FoldersManager}
	 */
	private ToDoListManager manager = null;
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.Object)
	 */
	@Override
	public Object[] getChildren(Object obj) {
		if(obj instanceof Folder && manager!=null){
			Folder f = (Folder) obj;
			return f.getSubFolders().toArray();
		}
		return null;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object)
	 */
	@Override
	public Object getParent(Object obj) {
		if(obj instanceof Folder  && manager!=null){
			Folder f = (Folder) obj;
			return f.getParent();
		}
		return null;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.Object)
	 */
	@Override
	public boolean hasChildren(Object obj) {
		if(obj instanceof Folder  && manager!=null){
			Folder f = (Folder) obj;
			return f.hasSubFolder();
		}
		return false;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	@Override
	public void dispose() {
		// nothing to do here
	}
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
	 */
	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		this.fViewer = (TreeViewer) viewer;
		if (manager != null)
			manager.removeFolderManagerListener(this);
		manager = (ToDoListManager) newInput;
		if (manager != null)
			manager.addFolderManagerListener(this);
	}
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getElements(java.lang.Object)
	 */
	@Override
	public Object[] getElements(Object inputElement) {
		if(manager!=null){	
			return new Object[]{manager.getRootFolder()};
		}
		return null;
	}
	/* (non-Javadoc)
	 * @see todolistdiag.FolderManagerListener#folderAdded(java.util.EventObject)
	 */
	@Override
	public void folderAdded(EventObject event){
		updateViewer();
	}
	/* (non-Javadoc)
	 * @see todolistdiag.FolderManagerListener#folderDeleted(java.util.EventObject)
	 */
	@Override
	public void folderDeleted(EventObject event){
		updateViewer();
	}
	/* (non-Javadoc)
	 * @see todolistdiag.FolderManagerListener#folderModified(java.util.EventObject)
	 */
	@Override
	public void folderModified(EventObject event){
		updateViewer();
	}
	private void updateViewer(){
        // Ignore update if disposed
        if (fViewer.getTree().isDisposed()) {
            return;
        }
        fViewer.getTree().getDisplay().asyncExec(new Runnable() {
            @Override
            public void run() {
                if (!fViewer.getTree().isDisposed()) {
            		fViewer.refresh();
                    fViewer.expandToLevel(2);
                }
            }
        });			
	}
}

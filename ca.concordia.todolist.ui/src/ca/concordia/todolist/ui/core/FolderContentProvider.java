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

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;

import todolistdiag.Folder;
import todolistdiag.FoldersManager;

/**
 * @author Efraim J Lopez
 *
 */
public class FolderContentProvider implements ITreeContentProvider{
	/**
	 * the viewer to which this content provider is associated
	 */
	private TreeViewer fViewer = null;
	/**
	 * the model manager {@link FoldersManager}
	 *
	 */
	private FoldersManager manager = null;
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.Object)
	 */
	@Override
	public Object[] getChildren(Object obj) {
		if(obj instanceof Folder && manager!=null){
			//return manager.getChildren((Folder) obj);
			Folder child1 = EMFManager.getInstance().getFactory().createFolder();
			child1.setName("Child_1");
			Folder child2 = EMFManager.getInstance().getFactory().createFolder();
			child2.setName("Child_2");
			return new Object[]{child1,child2};
		}
		return null;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object)
	 */
	@Override
	public Object getParent(Object obj) {
		if(obj instanceof Folder  && manager!=null){
			//return manager.getParent((Folder)obj);
		}
		return null;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.Object)
	 */
	@Override
	public boolean hasChildren(Object element) {
		if(element instanceof Folder  && manager!=null){
			//return manager.hasChildren((Folder)element);
			return true;
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
		//if (manager != null)
			//manager.removeTreeItemsManagerListener(this);
		manager = (FoldersManager) newInput;
		//if (manager != null)
			//manager.addTreeItemsManagerListener(this);
	}
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getElements(java.lang.Object)
	 */
	@Override
	public Object[] getElements(Object inputElement) {
		if(manager!=null){
			//return manager.getRootElements();
			Folder root = EMFManager.getInstance().getFactory().createFolder();
			root.setName("Root Folder");
			return new Object[]{root};
		}
		return null;
	}

	/*
	@Override
	public void itemsChanged(TreeItemsManagerEvent event) {
		//so far nothing here
	}

	@Override
	public void tracesChanged(TreeItemsManagerEvent event) {
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
	*/

}

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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import todolistdiag.Task;

/**
 * @author Efraim J Lopez
 *
 */
public class TaskLabelProvider extends LabelProvider implements ITableLabelProvider {
	/**
	 * To avoid loading different images for every folder element, we
	 * rather create this cache to hold only unique instances
	 */
	private Map<ImageDescriptor, Image> imageCache = new HashMap<>();
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnImage(java.lang.Object, int)
	 */
	@Override
	public Image getColumnImage(Object element, int index) {
		if(index!=0) 
			return null;
		ImageDescriptor descriptor = null;
		if (element instanceof Task) {
			descriptor = Util.getImageDescriptor(Util.TASK_IMG_FILE);
		} else {
			return null;
		}
		//obtain the cached image corresponding to the descriptor
		Image image = (Image)imageCache.get(descriptor);
		if (image == null) {
			image = descriptor.createImage();
			imageCache.put(descriptor, image);
		}
		return image;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnText(java.lang.Object, int)
	 */
	@Override
	public String getColumnText(Object element, int index) {
		Task task = (Task) element;
		switch (index) {
		case 0 :
			return task.getName();
		case 1 :
			return task.getImportanceLevel().toString();
		case 2 :
			return task.getStatus().toString();
		case 3 :
			return task.getDescription();
		default :
			return "unknown " + index;
		}
	}
}

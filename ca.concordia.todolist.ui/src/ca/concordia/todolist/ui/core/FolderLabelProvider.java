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

import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.lang.model.element.UnknownElementException;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IViewerLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;

import todolistdiag.Folder;

/**
 * @author Efraim J Lopez
 *
 */
public class FolderLabelProvider extends LabelProvider implements
		IViewerLabelProvider {
	/**
	 * To avoid loading different images for every folder element, we
	 * rather create this cache to hold only unique instances
	 */
	private Map<ImageDescriptor, Image> imageCache = new HashMap<>();
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IViewerLabelProvider#updateLabel(org.eclipse.jface.viewers.ViewerLabel, java.lang.Object)
	 */
	@Override
	public void updateLabel(ViewerLabel label, Object element) {
		if(element!=null){
			Folder item = (Folder) element;
			label.setImage(getImage(element));
			label.setText(item.getName());
		}else{
			label.setText("");	
		}
	}
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.LabelProvider#getImage(java.lang.Object)
	 */
	@Override
	public Image getImage(Object element) {
		ImageDescriptor descriptor = null;
		if (element instanceof Folder) {
			descriptor = Util.getImageDescriptor(Util.FOLDER_IMG_FILE);
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
	 * @see org.eclipse.jface.viewers.BaseLabelProvider#dispose()
	 */
	@Override
	public void dispose() {
		for (Iterator<Image> i = imageCache.values().iterator(); i.hasNext();) {
			((Image) i.next()).dispose();
		}
		imageCache.clear();
	}

}

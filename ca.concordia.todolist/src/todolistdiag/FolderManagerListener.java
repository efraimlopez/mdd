/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package todolistdiag;

import java.util.EventObject;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Folder Manager Listener</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see todolistdiag.TodolistdiagPackage#getFolderManagerListener()
 * @model interface="true" abstract="true"
 */
public interface FolderManagerListener{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model eventDataType="todolistdiag.FolderManagerEvent"
	 * @generated
	 */
	void folderAdded(EventObject event);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model eventDataType="todolistdiag.FolderManagerEvent"
	 * @generated
	 */
	void folderDeleted(EventObject event);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model eventDataType="todolistdiag.FolderManagerEvent"
	 * @generated
	 */
	void folderModified(EventObject event);

} // FolderManagerListener

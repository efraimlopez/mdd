/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package todolistdiag.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import todolistdiag.TodolistdiagPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TodolistdiagXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TodolistdiagXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		TodolistdiagPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the TodolistdiagResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new TodolistdiagResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new TodolistdiagResourceFactoryImpl());
		}
		return registrations;
	}

} //TodolistdiagXMLProcessor

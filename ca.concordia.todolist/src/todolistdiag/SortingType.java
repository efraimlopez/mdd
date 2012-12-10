/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package todolistdiag;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sorting Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see todolistdiag.TodolistdiagPackage#getSortingType()
 * @model
 * @generated
 */
public final class SortingType extends AbstractEnumerator {
	/**
	 * The '<em><b>BY NAME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BY NAME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BY_NAME_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BY_NAME = 0;

	/**
	 * The '<em><b>BY STATUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BY STATUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BY_STATUS_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BY_STATUS = 1;

	/**
	 * The '<em><b>BY IMPORTANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BY IMPORTANCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BY_IMPORTANCE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BY_IMPORTANCE = 2;

	/**
	 * The '<em><b>BY NAME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BY_NAME
	 * @generated
	 * @ordered
	 */
	public static final SortingType BY_NAME_LITERAL = new SortingType(BY_NAME, "BY_NAME", "BY_NAME");

	/**
	 * The '<em><b>BY STATUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BY_STATUS
	 * @generated
	 * @ordered
	 */
	public static final SortingType BY_STATUS_LITERAL = new SortingType(BY_STATUS, "BY_STATUS", "BY_STATUS");

	/**
	 * The '<em><b>BY IMPORTANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BY_IMPORTANCE
	 * @generated
	 * @ordered
	 */
	public static final SortingType BY_IMPORTANCE_LITERAL = new SortingType(BY_IMPORTANCE, "BY_IMPORTANCE", "BY_IMPORTANCE");

	/**
	 * An array of all the '<em><b>Sorting Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SortingType[] VALUES_ARRAY =
		new SortingType[] {
			BY_NAME_LITERAL,
			BY_STATUS_LITERAL,
			BY_IMPORTANCE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Sorting Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sorting Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SortingType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SortingType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sorting Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SortingType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SortingType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sorting Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SortingType get(int value) {
		switch (value) {
			case BY_NAME: return BY_NAME_LITERAL;
			case BY_STATUS: return BY_STATUS_LITERAL;
			case BY_IMPORTANCE: return BY_IMPORTANCE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SortingType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //SortingType

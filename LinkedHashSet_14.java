/*LinkedHashSet:-
 *1) LinkedHashSet class extends the HashSet class which is in java.util package.
 *2) LinkedHashSet is the child class of HashSet class.
 *3) LinkedHashSet was introduced in JDK 1.4 version.
 *4) HashSet underline data structure is "Hashtable + LinkedList". (that is hybrid data-structure)
 *5) Syntax:-
 *	 Package java.util;
 *	 class LinkedHashSet extends HashSet
 *	 {
 *	  	//Constructors
 *		//there is only one overridden method  public Spliterator<E> spliterator() {};
 *	 }
 *6) The underline data structure of LinkedHashSet is "doubly LinkedHashSet" or "circular LinkedHashSet".
 *
 *Properties of LinkedHashSet:-
 *1) LinkedHashSet are not an index based data structure. They store the elements according
 *	 to their "Hashcode" values.
 *2) LinkedHashSet does not store duplicate elements.
 *3) LinkedHashSet cannot store multiple null values.
 *4) LinkedHashSet can store different data-types i.e. heterogeneous elements.
 *5) LinkedHashSet follows the "insertion order".
 *6) LinkedHashSet does not follows the "sorting order".
 *7) LinkedHashSet are non-synchronized data structure.
 *
 **/

package com.java.collections;

import java.util.LinkedHashSet;

public class LinkedHashSet_14 {}


//Use to LinkedHashSet
class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		
		LinkedHashSet lhs = new LinkedHashSet<>();
		lhs.add(30);
		lhs.add(10);	//duplicate elements not allowed
		lhs.add(30);
		lhs.add(20);
		lhs.add(50);
		lhs.add("Deepak");
		lhs.add('c');
		lhs.add(10.1f);
		System.out.println(lhs);
	}
}
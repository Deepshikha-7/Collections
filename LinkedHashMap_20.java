/*LinkedHashMap:-
 *1) LinkedHashMap extends the HashMap which comes in java.util package.
 *2) Syntax:-
 *	 Package java.util;
 *	 class LinkedHashMap
 *	 {
 *		//Constructors
 *		//Methods
 *	 }
 *3) It was introduced in JDK 1.2 version
 *4) It underline data structure is doubly-linked-list
 *
 *
 **/

package com.java.collections;

import java.util.LinkedHashMap;

public class LinkedHashMap_20 {}	//This class is not for use only for class file naming purpose.


//Use of LinkedList
class LinkedHashMapDemo {
	
	public static void main(String[] args) {
		
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put(101, 'a');
		lhm.put(102, 'b');
		lhm.put(102, "Monu");
		lhm.put(105, 101);
		lhm.put(103, "Hello");
		lhm.put(null, null);
		System.out.println(lhm);
		
	}
}
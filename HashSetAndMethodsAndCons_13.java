/*HashSet:-
 *1) It is an implemented class of Set interface which is present in java.util package.
 *2) Syntax:-
 *	 Package java.util;
 *	 class HashSet implements Set
 *	 {
 *		//Constructors
 *		//Methods
 *	 }
 *3) HashSet underline data structure is "Hashtable".
 *-> HashSet is backed up by "Map".
 *4) HashSet was introduced in JDK 1.2 version
 *
 *Properties of HashSet:-
 *1) HashSet are not an index based data structure. They store the elements according
 *	 to their "Hashcode" values.
 *2) HashSet does not store duplicate elements.
 *3) HashSet cannot store multiple null values.
 *4) HashSet can store different data-types i.e. heterogeneous elements.
 *5) HashSet does not follows the "insertion order".
 *6) HashSet does not follows the "sorting order".
 *7) HashSet are non-synchronized data structure.
 *
 *HashSet class constructor:- There are four constructors in HashSet class.
 *1) public HashSet() {};
 *2) public HashSet(int initialCapacity) {};
 *3) public HashSet(int initialCapacity, float loadFactor) {};
 *4) public HashSet(Collection c) {};
 *
 *HashSet class methods:- 
 *HashSet implements the methods of Set and Collection interface
 *1) add() :- In this method we are storing the elements in the form of Map because it is backed up by the Map that's why it does not allow the duplicate elements.
 *2) addAll() :- In this method we can add one collection to another collection and in the HashSet we can directly add the ArrayList, LinkedList, Vector, Stack etc. object reference also.
 *3) iterator();
 *4) clear();
 *5) remove();
 *6) size();
 *7) contain(); 
 *	-------etc.
 **/

package com.java.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetAndMethodsAndCons_13 {}	//This class is not for use only for class file naming purpose.


//Use of HashSet
class HashSetDemo {
	
	public static void main(String[] args) {
		
		//default constructor
		HashSet hs = new HashSet<>();
		hs.add(10);
		hs.add(10);	//duplicate elements not allowed in HashSet
		hs.add("Darshan");
		hs.add('a');
		hs.add(1.11);
		System.out.println(hs);
		
		//parameterized constructor(Provide initial capacity)
		HashSet hs2 = new HashSet(6);
		hs2.add(20);
		hs2.add("Mohit");
		System.out.println(hs2);
		
		//parameterized constructor(Provide initial capacity and load factor default load factor is .75f)
		HashSet hs3 = new HashSet(6,.10f);
		hs3.add(30);
		hs3.add("Rohit");
		System.out.println(hs3);
		
		//parameterized constructor(Provide collection object reference)
		HashSet hs4 = new HashSet(hs3);
		hs4.add(40);
		hs4.add("Sohit");
		System.out.println(hs4);
		
		
		//ArrayList
		ArrayList al = new ArrayList<>();
		al.add(100);
		al.add("Soni");
		al.add("Monu");
		al.add(10.10);
		System.out.println(al);
		
		//storing ArrayList into HashSet (by HashSet constructor and you can do it with addAll() method also)
		HashSet hs5 = new HashSet<>(al);
		hs5.addAll(hs4);
		hs5.add(20);
		hs5.add("Mohit");
		System.out.println(hs5);

		System.out.println("--------------------------");
		
		//iterator() method
		Iterator itr = hs5.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("--------------------------");
		
		//size() method
		System.out.println(hs5.size());
		
		//contain() method
		System.out.println("Is hs5 contains Sonu: "+hs5.contains("Sonu"));
		System.out.println("Is hs5 contains Monu: "+hs5.contains("Monu"));
		
		//remove() method
		hs5.remove("Monu");
		System.out.println(hs5);
		
		//clear() method
		hs5.clear();
		System.out.println(hs5);
		
	}
}

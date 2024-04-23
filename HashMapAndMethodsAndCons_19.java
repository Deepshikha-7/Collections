/*HashMap:-
 *1) HashMap is an implemented class of Map interface.
 *2) Syntax:-
 *	 Package java.util;
 *	 class HashMap implements Map
 *	 {
 *	 	//Constructor
 *		//Methods
 *	 }
 *3) HashMap was introduced in JDK 1.2 version.
 *4) HashMap underline data structure is "Hashtable".
 *
 *Properties of HashMap:-
 *1) HashMap stores the value in key-value pair.
 *	->Each key-value pair is known as Entry.
 *2) In HashMap keys should always be unique but values can be duplicate.
 *3) HashMap contains max one null value in key but it can store multiple null values in value.
 *4) HashMap can store heterogeneous elements.
 *5) HashMap does not follow the sorting and insertion order.
 *6) HashMap is non-synchronized data structure.
 *
 *HashMap capacity:-
 *-> HashMap capacity means the number of buckets in the hash table (Note that, HashMap underline data-structure is hash table).
 *-> When we create HashMap, initial capacity will be 16 which we can changed.
 *
 *Load Factor:-
 *-> Load Factor is a threshold, when we add the elements in HashMap and it crosses this threshold then the capacity of HashMap will get increased.
 *-> Default load factor of HashMap is .75
 *
 *We can retrieve HashMap elements by 2 ways:-
 *1. Using Set and Iterator interface
 *2. Directly i.e. without using Set and Iterator interface
 *NOTE: In both cases we use Map.Entry interface
 *
 *HashMap class constructors:-
 *1) public HashMap() {};
 *2) public HashMap(int initialCapacity) {};
 *3) public HashMap(int initialCapacity, float loadFactor) {};
 *4) public HashMap(Map m) {};
 *
 *HashMap class methods:-
 * It implements the methods of Map interface
 * 1) entrySet()
 * 2) public final boolean equals(Object o);
 * 3) size();
 * 4) isEmpty();
 * 5) get();
 * 6) containsKey();
 * 7) containsValue();
 * 8) putAll();
 * 9) remove();
 * 10) replace();
 * 	---------etc.
 *
 **/

package com.java.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapAndMethodsAndCons_19 {}	//This class is not for use only for class file naming purpose.


//Use of HashMap
class HashMapDemo {
	
	public static void main(String[] args) {
		
		//default constructor
		HashMap<Integer,String> hm = new HashMap<>();	//default capacity of HashMap is 16
		hm.put(101, "Rahul");
		hm.put(102, "Mannu");
		hm.put(103, "Balram");
		hm.put(104, "Krishna");
		System.out.println(hm);
		
		//parameterized constructor (Provide initial capacity)
		HashMap hm2 = new HashMap<>(4);
		hm2.put(105, "Ram");
		hm2.put(106, "Sita");
		hm2.put(107, "Laxman");
		hm2.put(108, "Bharat");
		System.out.println(hm2);
		
		//parameterized constructor (Provide initial capacity and load factor)
		HashMap hm3 = new HashMap<>(4,.10f);
		hm3.put(109, "Damyanti");
		hm3.put(110, "Nakul");
		hm3.put(111, "Sehdev");
		hm3.put(112, "Pandu");
		System.out.println(hm3);
		
		//parameterized constructor (Provide Map object reference)
		HashMap hm4 = new HashMap<>(hm3);
		hm4.put(113, "Kunti");
		hm4.put(114, "Subhadra");
		hm4.put(115, "Krumi");
		hm4.put(116, "Amba");
		System.out.println(hm4);	//retrieving elements in Map
		
		//retrieving element Using Set interface
		Set set = hm4.entrySet();
		System.out.println(set);	//In this we retrieve the elements in Set 
		
		//Using set retrieving elements by iterator() method
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
//			System.out.println(itr.next());	// it will get elements in key-value pair
			
			//retrieve elements not in key-value pair (retrieve differently)
			Map.Entry entry = (Map.Entry) itr.next();	//(Map.Entry) this is type casting to get element one by one
			System.out.println(entry.getKey()+" -> "+entry.getValue());
		}
		
		System.out.println("---------------------------------");
		
		//Using for-each loop to retrieve the elements
		for(Map.Entry me : hm.entrySet()) {
			System.out.println(me.getKey()+" -> "+me.getValue());
		}
			
		
		//equals() method
		System.out.println(hm.equals(hm2));
		HashMap<Integer,String> hm5 = new HashMap<>();	
		hm5.put(101, "Rahul");
		hm5.put(102, "Mannu");
		hm5.put(103, "Balram");
		hm5.put(104, "Krishna");
		System.out.println(hm.equals(hm5));
		
		//containsKey() method
		System.out.println(hm.containsKey(104));
		
		//containsValue() method
		System.out.println(hm.containsValue("Rohit"));
		System.out.println(hm.containsValue("Rahul"));
		
		//keySet() method
		System.out.println(hm.keySet());
		
		//get() method
		System.out.println(hm.get(101));	 
		
		//replace() method
		hm.replace(101, "Harish");
		System.out.println(hm);
		
		//remove() method
		hm.remove(101);
		System.out.println(hm);
		
		//size() method
		System.out.println(hm.size());
		
		//putAll() method
		hm.putAll(hm2);
		System.out.println(hm);
		
		//clear() method
		hm.clear();
		System.out.println(hm);

	}
}
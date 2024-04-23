/*Collection Framework (API):-
 *->Collection:- It is the single entity or object which can store multiple date.
 *->Framework:- It represent the library 
 *->It is the set of predefined classes and interface which is used to store multiple
 *	data.
 *->It contains 2 main parts(packages)
 *	1) java.util.Collection	(In Collection we can store the data directly)
 *	2) java.util.Map (In Map we stores the data in key-value pair)
 *->Hierarchy of Collection :- inside the collection (interface) 3 parts comes 
 *							  1)List(interface) 2)Set(interface) 3)Queue(interface)
 *1)List:- in the List 3 parts comes i)ArrayList(Class) ii)LinkedList(Class) iii)Vector(Legacy Class) inside the Vector Stack(Legacy Class) comes. 
 *2)Set:- in the Set 2 parts comes i)HashSet(Class) inside HashSet LinkedHashSet(Class) comes
 *								   ii)SortedSet(interface) inside SortedSet NavigableSet(interface) comes and inside the NavigableSet TreeSet(Class) comes
 *3)Queue:- in the Queue 2 parts comes i)PriorityQueue(Class) ii)Deque(Class) inside the Deque ArrayDeque(Class) comes.
 *-> Hierarchy of Map :- inside the map(interface)  comes
 *1)HashMap(Class) inside HashMap LinkedHashMap(Class) comes
 *2)IdentityHashMap(Class)
 *3)WeakHashMap(Class)
 *4)SortedMap(interface) inside SortedMap NavigableMap(interface) comes and inside NavigableMap TreeMap(Class) comes
 *5)Hashtable(Class) inside Hashtable Properties(Class) comes
 *6)Dictionary(Class)
 *
 *What is Collection framework, Collection & Collections ?
 *Collection framework (API) :- It is an API which contains predefined classes & interfaces
 *Collection (Interface):- It is the root interface (Present in java.util package) of all the collection objects
 *Collections (Utility Class) :- It is the utility class which contains only static methods
 *
 *What is Legacy Class?
 *Collection framework was not present in early versions of java. Instead it defines
 *only several classes and one interface to store the objects.
 *But when Collection Framework came, these old classes were re-engineered or modified
 *to support the Collection Framework. These old classes are known are legacy classes.
 *
 **/

package com.java.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

//Use of List: ArrayList and HashSet and creating object with interface reference which will point to the classes
public class CollectionAndMapHierarchy_3 {

	public static void main(String[] args) {
		
		//Creating ArrayList object
		ArrayList al = new ArrayList();
		
		al.add(10);	//creating objects it'll get save in the al object or inside collection object
		al.add("deepak");
		al.add('c');
		
		System.out.println(al);
		
		//Creating HashSet object
		HashSet hs = new HashSet();
		hs.add("Rahul");	// creating objects it'll get save in the hs object or inside collection object
		hs.add(20);
		hs.add('a');
		
		System.out.println(hs);
		
		//Create object with interface reference
		List l = new ArrayList();	//List is an interface we can not create the object of the interface but with the reference of interface we can point to particular class
		l.add(30);
		l.add("Sham");
		l.add('b');
		
		System.out.println(l);
		
		//Create object with interface reference
		List l2 = new LinkedList();
		l2.add(40);
		l2.add("Monu");
		l2.add('d');
		
		System.out.println(l2);
		
	}
};



//Use of Map: HashMap and LinkedHashMap (Store data in key & value pair)
class DemoMap {
	
	public static void main(String[] args) {
		
		//Creating HashMap object
		HashMap hm = new HashMap();
		
		//You can put data in the collection or Map interface in key-value pair
		hm.put(101, "Aman");	//creating objects it'll get save in the hm object or inside collection/Map object
		hm.put(102, "Annu");
		hm.put(103, "Akku");
		
		System.out.println(hm);
		
		//Create object with interface reference
		Map m = new LinkedHashMap();
		m.put(104, "Bhanu");
		m.put(105, "Bhuvan");
		m.put(106, "Bittu");
		
		System.out.println(m);
	}
}


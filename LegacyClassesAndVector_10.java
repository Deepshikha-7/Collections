/*Legacy classes:- Some classes i.e. Vector, Stack, Hashtable etc. was introduced in
 * JDK 1.0 version but when Collection Framework was introduced in JDK 1.2 version
 * these classes were modified or say re-engineered so that they can be adjusted
 * in new collection hierarchy, so these older classes are known as legacy classes.
 * 
 * ->JDK 1.0 version: In this version java provides classes and interfaces in which we
 * can store the data/objects. For eg:- Vector, Stack, Hashtable, Properties, Dictionary.
 * ->JDK 1.2 version: In this version Collection framework was introduced.
 * 
 *Vector:-
 *1) Vector is a legacy class which was introduced in JDL 1.0 version.
 *2) Vector is an implemented class of List interface which is present in java.util
 *	 package.
 *->Syntax:-
 *	package java.util;
 *	class Vector implements List
 *	{
 *		//Constructors
 *		//Methods
 *	};
 *4) The underline data structure of vector is "growable array" or "resizable array".
 *Note:- All legacy classes are synchronized.
 *
 *Properties of Vector:-
 *1) Vector is an index based data- structure.
 *2) Vector can store different data-types or heterogeneous data-type.
 *3) We can store duplicate elements.
 *4) We can store multiple null values.
 *5) Vector follows the insertion order.
 *6) Vector does not follows the sorting order.
 *7) Vector are synchronized collection.
 * 
 *Vector class Constructor: There are four constructor in Vector class
 *1) public Vector() {};
 *2) public Vector(int initialCapacity) {};
 *3) public Vector(int initialCapacity, int capacityIncrement) {};
 *4) public Vector(Collection c) {};	
 *
 *
 *Vector class Methods:-
 *1) It contain List and Collection interface methods.
 *2) addElement(Object obj);
 *3) firstElement();
 *4) lastElement();
 *5) removeElement(Object obj);
 *6) removeElementAt(int index);
 *7) removeAllElements();
 *8) capacity();
 *9) setElementAt();
 *	-----------etc.
 *
 * */

package com.java.collections;

import java.util.Vector;

public class LegacyClassesAndVector_10 {}	//This class is not for use only for class file naming purpose.

//Use of Vector
class VectorDemo {
	
	public static void main(String[] args) {
		
		//default constructor
		Vector v = new Vector();	//default capacity of Vector class is 10
		v.add(100);
		v.add("Darshan");
		v.add('a');
		v.add(1.11);
		System.out.println(v);
		
		//parameterized constructor (provide initial capacity)
		Vector  v2 = new Vector(4);	//passing the initial capacity to the Vector class cons. and it increases it's capacity *2 automatically.
		v2.addElement(200);
		v2.addElement("Rahul");
		v2.addElement('b');
		v2.addElement(2.22);
		System.out.println(v2);
		
		//parameterized constructor (provide initial capacity and increment)
		Vector v3 = new Vector(2,3);	//passing the initial capacity and increment rate which is 3 it means it will increase it's capacity +3 now.
		v3.add(300);
		v3.addElement("Harsh");
		System.out.println(v3);
		
		//parameterized constructor (provide collection object reference)
		Vector v4 = new Vector(v3);	//passing the v3 collection object reference
		v4.add('c');
		v4.addElement(3.33);
		System.out.println(v4);
		
		//firstElement() method
		System.out.println(v4.firstElement());
		
		//lastElement() method
		System.out.println(v4.lastElement());
		
		//removeElement() method
		v4.remove("Harsh");
		System.out.println(v4);
		
		//removeElementAt() method
		v4.removeElementAt(1);
		System.out.println(v4);
		
		//removeAllElement() method
		v4.removeAllElements();
		System.out.println(v4);
		
		//capacity() method
		System.out.println("Capacity of v colleciotn: "+v.capacity());
		System.out.println("Capacity of v2 colleciotn: "+v2.capacity());
		System.out.println("Capacity of v3 colleciotn: "+v3.capacity());
		System.out.println("Capacity of v4 colleciotn: "+v4.capacity());
		
		System.out.println("--------------------------------");
		
		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);
		v.addElement(5);
		v.addElement(6);
		v.addElement(7);
		System.out.println(v);
		System.out.println("Capacity of v colleciotn: "+v.capacity());
		
		v2.addElement(1);
		System.out.println(v2);
		System.out.println("Capacity of v2 colleciotn: "+v2.capacity());
		
		v3.addElement(1);
		System.out.println(v3);
		System.out.println("Capacity of v3 colleciotn: "+v3.capacity());
		v3.addElement(2);
		v3.addElement(3);
		v3.addElement(4);
		System.out.println(v3);
		System.out.println("Capacity of v3 colleciotn: "+v3.capacity());
		
		
		v4.addElement(1);
		v4.addElement(2);
		v4.addElement(3);
		v4.addElement(4);
		v4.addElement(5);
		System.out.println(v4);
		System.out.println("Capacity of v4 colleciotn: "+v4.capacity());
		
		System.out.println("------------------------------");
		
		//setElementAt() method
		v4.setElementAt("Bye Bye", 1);
		System.out.println(v4);
	}
};

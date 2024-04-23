/*ArrayList:- 
 *1) ArrayList is an implemented class of List interface which is present in
 *	 java.util Package
 *2) Syntax:-
 *	 Package java.util;
 *	 class ArrayList implements List
 *	 {
 *		//constructors
 *		//methods
 *	 }
 *3) ArrayList is created on the bases of growable or resizable array.
 *
 *4) Properties of ArrayList:-
 *a) ArrayList are index based data structure.
 *b) ArrayList can store different data-types or hetrogeneous(same) data-types.
 *c) ArrayList can store duplicate values.
 *d) ArrayList can store any number of null values.
 *e) ArrayList follows the insertion order(as we put data in index form same we get data from the ArrayList).
 *f) ArrayList does not follows the sorting order.
 *g) ArrayList are non-sychronized data structure.
 *
 *ArrayList Constructors:- There are 3 constructors in ArrayList
 *1) public ArrayList() :- It is used to build an empty array list with initial capacity 10.
 *2) public ArrayList(int initialCapacity) :- It is used to build an array list that has the specified initial capacity.
 *3) public ArrayList(Collection c) :- It is used to build an array list that is initialized with the elements of the collection c.
 *
 *ArrayList Methods:- there are some main methods below
 *1) boolean add() :- This method is used to add the elements or objects in an ArrayList or say collection object.
 *2) boolean addAll() :- This method is used to add or append the elements in the specified collection to the end of ArrayList or say collection object. 
 *3) boolean remove() :- This method is used to remove the element at the specified position in the ArrayList.
 *4) boolean removeAll() :- This method is used to remove the elements from the current ArrayList which are contained in the specified ArrayList or say collection object.
 *5) void clear() :- This method is used to remove all of the elements from the ArrayList or say collection object
 *6) boolean contains() :- This method is used to check if the specified element is present in the given ArrayList or not, if its present it will return true else false.
 *7) boolean conatainsAll() :- This method is used to check if all the collection's elements are present in the ArrayList or not, if its present it will return true else false.
 *8) int size() :- This method is used to return the number of elements in the ArrayList i.e. the size.
 *9) get(int index) :- This method is used to get the element of a specified index within the ArrayList.
 *10) set(int index, Object obj) :- This method is used to replace the element at the specified index position in the ArrayList with the specified element.
 *11) int index(Object Obj) :- This method is used to return the index of first occurrence of the element in the ArrayList if this list does not contain the element then it will return -1
 *12) Iterator iterator() :- This method is used to get an iterator over the elements in this list in proper sequence.
 *	//and many more methods 
 *
 **/

package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAndConstructorsAndMethods_7 {}	//This class is not for use only for class file naming purpose.


//use of constructors and methods
class ArrayListDemo {
	
	public static void main(String[] args) {
		
		//default constructor (In this by default capacity of the ArrayList is 10 but it is growable or resizable and size is 0)
		ArrayList al1 = new ArrayList();
		al1.add(0,100);
		al1.add(1,"Mohan");
		System.out.println(al1);
		
		//parameterized constructor where you can give initial capacity
		ArrayList al2 = new ArrayList(4);	//giving the initial capacity to the ArrayList but it is growable or resizable
		al2.add(10);
		al2.add(20);
		al2.add(30);
		al2.add(40);
		al2.add(50);
		System.out.println(al2);
		
		//parameterized constructor where you can give collection object to add one collection object elements to another collection object
		ArrayList al3 = new ArrayList(al2);	//passing the ArrayList object reference to add the all the al2 object elements into al3 object
		al3.add("First");
		al3.add("Second");
		System.out.println(al3);
		
		//addAll() method
		al3.addAll(al1);
		System.out.println(al3);
		
		//remove() method
		al2.remove(4);
		System.out.println(al2);
		
		//removeAll() method
		al3.removeAll(al2);	// (i got a doubt i have removed the 50 in al2 object by remove method in above but when i'm using removeAll method 50 is printing in the output screen because when you using removeAll method and taking al2 so it is containing now only 4 elements that is 10,20,30 and 40 so it is only removing these elements not elements 50)
		System.out.println(al3);
		
		//clear() method
		al1.clear();
		System.out.println(al1);
		
		//contains() method
		System.out.println(al3);
		System.out.println(al3.contains("First"));	//true
		System.out.println(al3.contains(50));	//true
		
		//containsAll() method
		System.out.println(al3);
		System.out.println(al3.containsAll(al2));	//false
		System.out.println(al3.containsAll(al1));	//true
		
		//size() method
		System.out.println(al3.size());
		
		//get() method
		System.out.println(al3.get(4));
		
		//set() method
		al3.set(4, "Mamta");
		System.out.println(al3);
		
		//indexOf() method
		System.out.println(al3.indexOf("Mamta"));
		
		//iterator() method
		System.out.println("--------------------");
		Iterator itr = al3.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println("--------------------");
		
	}
}

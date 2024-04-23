/*Collection:- 
 *1) Collection is an interface which is present in java.util package.(java 1.2 version)
 *2) Syntax:-
 *public interface Collection<E> extends Iterable<E>
 *{
 *	//methods
 *}
 *3) Hierarchy of Collection interface:- 1)List 2)Set and 3)Queue
 *4) Methods of Collection interface:-
 *	 1) public boolean add(Object obj):- This method is used to add the data/object into entity/collection and it return the boolean value 
 *	 2) public boolean addAll(Collection c):- This method is used to add the collection object into another collection object.
 *	 3) public boolean remove(Object obj):-
 *	 4) public boolean removeAll(Collection c):-
 *	 5) public void clear():-
 *	 6) public boolean contains(Object obj):-
 *	 7) public boolean containAll(Collection c):-
 *	 8) public boolean isEmpty():-
 *	 9) public int size():-
 *	 10)Iterator iterator():- This method is used to iterate the elements
 *		etc. 
 *
 **/

package com.java.collections;

import java.util.ArrayList;

public class CollectionInterfaceAndMethods_4 {}	//This class is not for use only for class file naming purpose.


//Use of some Collection methods
class DemoCollection {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		//add() method
		al.add(100);
		al.add(200);
		al.add(300);
		
		System.out.println("al object: "+al);
		System.out.println(al.add(400));	// it will add the data into collection and then provide the boolean value.
		System.out.println(al.add(500));
		System.out.println("al object: "+al);
		
		ArrayList al2 = new ArrayList();
		al2.add("AAA");
		al2.add("BBB");
		al2.add("CCC");
		System.out.println("al2 objects: "+al2);
		
		//addAll() method
		al.addAll(al2);
		System.out.println("al object after adding al2 object or collection: "+al);
		
		//contains() method
		System.out.println("al2 object contains the BBB: "+al2.contains("BBB"));	// It will check in the collection object the given data/element is present or not
		System.out.println("al2 object contains the DDD: "+al2.contains("DDD"));
		
		//containsAll() method
		System.out.println("al objects conatains al2 objects: "+al.containsAll(al2));	//It will check it contains all collection object to another collection object
		System.out.println("al2 objects conatains al objects: "+al2.containsAll(al));
		
		//isEmpty() method
		System.out.println("Is al2 object empty: "+al2.isEmpty());	// This method will check given collection object is empty or not
		System.out.println("Is al object empty: "+al.isEmpty());
		
		//size() method
		System.out.println("Size of al object is: "+ al.size());	// By this method you can check how many elements are present in the collection object
		System.out.println("Size of al2 object is: "+ al2.size());
		
		//remove() method (if you we to remove the integer type of element use index number if you want remove String type of element you can provide String/object data inside remove method)
		System.out.println(al);
		al.remove(0); //It will remove the element form index no. 0 (100 will be removed)
		System.out.println(al);
		al.remove("AAA");	//It will remove the given String from the collection.
		System.out.println(al);
		
		//removeAll() method(It removes the same type of data/elements in the collection)
		al.removeAll(al2);	//It has removed all the al2 objects elements in the al object (which was same in the al object which was present in the al2 object)
		System.out.println(al);
		System.out.println(al2);
		
		//clear() method
		al2.clear();	//It will clear all the data/elements in the al2 object
		System.out.println(al2);
		
	}
}

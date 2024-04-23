/*TreeSet:- 
 *1) TreeSet is the direct implement class of NavigableSet but indirectly implements
 *	 SortedSed and Set interface.
 *2) Syntax:-
 *	 class TreeSet implements NavigableSet
 *	 {
 *		//Constructors
 *		//Methods
 *	 }
 *3) TreeSet was introduced in JDK 1.2 version.
 *4) TreeSet underline data structure is "Balanced Tree".
 *
 *Properties of TreeSet:-
 *1) It is not an index based data structure.
 *2) It does not follows the insertion order.
 *3) It follows the sorting order. In this  it users the compareTo(Object obj) method it is
 *	 Comparable interface method which is used to compare the current object with the specified
 *	 object. It returns as follows:-
 *	-> +ve integer: if the current object is greater than the specified object
 *	-> -ve integer: if the current object is less than the specified object
 *	-> 0 : if the current object is equal to the specified object
 *	eg: there the some elements see how it get store in TreeSet using compareTo() method.
 *		elements are:- 40,60,20,30,50,10
 *	When we store the first element 40 so it will go to the parent node the second element
 *	60 it will compare with 40 and return the +ve value so it will get store in right side
 *	of parent node (Note: if the elements the greater the parent node so it will get store
 *	in right side as as child node otherwise it will get store in left side of parent node
 *	as a child node). third element 20 now 20 will compare with 40 and check is it greater
 *	then 40 or not if not than it will give -ve value then it will get store in left side 
 *	of parent node forth element 30 it will compare will 40 first then it will return -ve
 *	value then it will compare with 20 now 30 is greater the 20 so it will return +ve value
 *	and get store in right side of it's parent node 20 as a child node the fifth element
 *	50 it will again compare with 40 the it will return +ve value and it will go the right
 *	side of parent node and check if there any element is parent and it will compare with it
 *	so now it will compare with 60 and return the -ve value and get store in left side of
 *	it it's parent node 60, sixth element 10 it will again compare with 40 the return -ve
 *	value then it will with 20 again it will return -ve value and get store in left side
 *	of it's parent node 20.
 *	when we will retrieve the elements so it will be retrieved as "left top and right".
 *	and we will get element like 10,20,30,40,50,60.
 *4) It stores homogeneous elements i.e. same data-types.
 *5) It cannot store the duplicate elements.
 *6) It non-synchronized data structure.
 *7) null value cannot be inserted in TreeSet otherwise it will throw the exception of NullPointerException
 * 
 *TreeSet class Constructors:- There are four constructors in TreeSet
 *1) public TreeSet() {};
 *2) public TreeSet(Comparator comparator) {};
 *3) public TreeSet(Collection c) {};
 *4) public TreeSet(SortedSet s) {};
 *
 *TreeSet class Methods:-
 * It implements the methods of NavigableSet, SortedSet, Set and Collection interface. 
 *1) public Iterator iterator();
 *2) public Iterator descendingIterator();
 *3) public NavigableSet<E> descendingSet();
 *4) public int size();
 *5) public boolean isEmpty();
 *6) public boolean contains(Object o);
 *7) public boolean add(E e);
 *8) public  boolean addAll(Collection c);
 *9) public boolean remove(Object o);
 *10) public void clear();
 *11) public SortedSet<E> subSet(E fromElement, E toElement);
 *12) public SortedSet<E> headSet(E toElement);
 *13) public SortedSet<E> tailSet(E fromElement);
 *14) public E ceiling(E e);
 *15) public E higher(E e);
 *	-------------etc. 
 **/


package com.java.collections;

import java.util.TreeSet;

public class TreeSetAndMethodsAndCons_15 {}	//This class is not for use only for class file naming purpose.


//Use of TreeSet
class TreeSetDemo {
	
	public static void main(String[] args) {

		//default constructor
		TreeSet ts = new TreeSet<>();
		ts.add(40);
		ts.add(60);
		ts.add(20);
		ts.add(30);
		ts.add(50);
		ts.add(10);
		ts.add(10);	//duplicate elements not accepted in the TreeSet
//		ts.add("Hello");	//different data-types is not allowed otherwise it will throw the exception of ClassCastException.
//		ts.add(null);	//null value is not allowed otherwise it will throw the NullPointerException
		System.out.println(ts);
		
		//default constructor
		TreeSet ts2 = new TreeSet<>();
		ts2.add("Mohit");
		ts2.add("Mohit");
		ts2.add("Ramesh");
		ts2.add("Ram");
		ts2.add("Amit");
		ts2.add("Balram");
		System.out.println(ts2);
		
		//Parameterized Constructor(provide collection object reference)
		TreeSet ts3 = new TreeSet(ts2);
		ts3.add("Balpreet");
		ts3.add("Aakash");
		System.out.println(ts3);
		
		//size() method
		System.out.println(ts3.size());
		
		//subSet() method
		System.out.println(ts3.subSet("Amit", "Ram"));	//It is similar as subString() method.
		
		//headSet() method
		System.out.println(ts3.headSet("Ram"));	//it will print the element from given Object-1 to till staring Object
		
		//tailSet() method
		System.out.println(ts3.tailSet("Amit"));	//It will print the element form given object to till end Object
		
		//ceiling() method
		System.out.println(ts3.ceiling("Bal"));
		System.out.println(ts3.ceiling("Ra")); //Returns the least element in this set greater than or equal tothe given element, or null if there is no such element.
		
		//higher() method
		System.out.println(ts3.higher("Ram"));	//It provide the element which is higher(Returns the least element in this set strictly greater than the given element, or null if there is no such element.)
	}
}

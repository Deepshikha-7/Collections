/*Iterator and ListIterator:- It is an Interface and ListIterator extends the Iterator
 *and it is used to iterate or retrieve the collection elements one by one it is 
 *used like cursors 
 *
 *Cursors:- There are 3 types of cursors- 
 *1) Iterator 
 *2) ListIterator 
 *3) Enumeration
 *Note:- by default cursor is placed/situated in the top or first from the elements.
 *
 *Difference between Iterator and ListIterator:-
 *Iterator:-
 *1) We can get Iterator cursor by iterator() method 
 *	 eg:- Iterator itr = l.iterator();	// l is an List reference and array list object.
 *2) Iterator cursor can be used with any collection object.
 *3) Iterator methods are:-
 *	 hasNext(), next(), remove()
 *4) By using Iterator cursor, we can retrieve the elements only in forward direction.
 *5) By using Iterator cursor, we can read and remove the elements.
 *
 *ListItrtstor:-
 *1) We can get ListIterator cursor by listIterator() method
 *	 eg:- ListIterator li = l.listIterator();
 *2) ListIterator cursor can be used only with List implemented classes i.e. ArrayList,
 *	 LinkedList, Vector, Stack.
 *3) ListIterator methods are:-
 *	 hasNext(), next(), hasPrevious(), previous(), remove(), set()
 *4) By using ListIterator cursor, we can retrieve the elements in forward  and 
 *	 backward directions.
 *5) By using ListIterator cursor, we can read, remove, replace and add the elements.
 *
 *
 *Enumeration:-
 *1) Enumeration is the cursor which is used to retrieve collection objects one by one.
 *2) Enumeration was introduce in JDK 1.0 version.
 *3) Enumeration cursor can be used only with legacy classes i.e. Vector and Stack.
 *4) Enumeration cursor can be get by element() method.
 *	 eg:- Enumeration e = v.elements;	// v is Vector class object
 *5) Method of Enumeration cursor are:-
 *	 hasMoreElements(), nextElements()
 *6) Enumeration cursor can be used to retrieve the elements only in forward direction.
 *7) Enumeration cursor can be used only for read operations.
 *
 **/

package com.java.collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class IteratorAndListIteratorAndEnumeration_6 {}	// This class is not for use only for class file naming purpose. 


//Use of Iterator
class IteratorDemo {
	
	public static void main(String[] args) {
		
		List l = new ArrayList();
		l.add(10);
		l.add("deepak");
		l.add("Rahul");
		
		System.out.println(l);
		
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());	//next() method helps to retrieve the elements and move the cursor
		}
		
		//remove() method in Iterator
		l.remove("deepak");
		System.out.println(l);
		l.remove(0);
		System.out.println(l);
	}
};


//Use of ListIterator
class ListIteratorDemo {
	
	public static void main(String[] args) {
		
		List l = new ArrayList();
		l.add(10);
		l.add("deepak");
		l.add("Rahul");
		
		System.out.println(l);
		
		ListIterator li = l.listIterator();
		
		//printing forward direction
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		System.out.println("-----------------1");
		
		//printing backward direction (Note:- to print the elements form backward direction cursor should be placed/situated in the end/last from the elements)
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		System.out.println("-----------------2");
		
		//Print directly form backward direction
		ListIterator li2 = l.listIterator();
		li2.next();	// moving cursor top to bottom one by one manually
		li2.next();
		li2.next();
		while(li2.hasPrevious()) {
			System.out.println(li2.previous());	//previous() method helps to retrieve the elements and move the cursor
		}
		
		//add() method in ListIterator
		li.add(100);	//adding 100 at 1st position because cursor was at 1st position
		System.out.println(l);
		
		//set() method in ListIterator (it replace the element where cursor is present)
		li.next();	// cursor is at now pointing to element 10
		li.set(200);	// replaced 10 with 200
		System.out.println(l);
		
		//remove() method in ListIterator
		l.remove(2);	// element deepak removed from the list
		System.out.println(l);
	}
};


//Use of Enumeration
class EnumerationDemo {
	
	public static void main(String[] args) {
		
		//Vector
		Vector v = new Vector();
		v.add(10);
		v.add("deepak");
		v.add("Rahul");
		
		System.out.println(v);
		
		//Enumeration
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		System.out.println("-----------------");
		
		//Stack
		Stack s = new Stack();
		s.add(20);
		s.add("Ramu");
		s.add("Sonu");
		
		System.out.println(s);
		
		//Enumeration		
		Enumeration e2 = s.elements();
		while(e2.hasMoreElements()) {
			System.out.println(e2.nextElement());
		}
	}
}
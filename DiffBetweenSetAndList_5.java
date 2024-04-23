/*Difference between List and Set:-
 *List:-
 *1) List is an index based data structure.
 *2) List can store duplicate elements.
 *3) List can store any numbers of null values.
 *4) List follows the insertion order.
 *5) We can iterate(get) the List elements by Iterator & ListIterator.
 *6) 
 *
 *Set:-
 *1) Set is not an index based data structure. It stores the data according to the
 *	 hashcode values.
 *2) Set does not allow to store the duplicate elements.
 *3) Set can store only one null value.
 *4) Set does not follows the insertion order.
 *5) We can iterate the Set elements by Iterator only.
 *
 **/

package com.java.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class DiffBetweenSetAndList_5 {}		//This class is not for use only for class file naming purpose.


//Use of List
class DemoList {
	
	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add(10);
		l.add(1, 20);	// you can add elements by index number also in the list
		l.add(2,30);
		l.add(1,10);	// you can add duplicate value in the list also
		l.add(40);
		l.add(null);
		l.add(null);
		System.out.println(l);
		
		System.out.println("-------------------------------");
		
		//Iterator (It help to provide the elements one by one in forward direction)
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-------------------------------");
		
		//ListIterator (It help to provide the elements one by one in forward & backward direction)
		ListIterator li = l.listIterator();
		li.next();	//Moving the cursor top to down
		li.next();li.next();li.next();li.next();li.next();li.next();
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}
}



//Use of Set
class DemoSet {
	
	public static void main(String[] args) {
		
		Set s = new HashSet();
		
		s.add(10);
//		s.add(1, 20);	// you can not add elements by index number in the Set
		s.add(10);	// you can not add duplicate value in the Set
		s.add(40);
		s.add(null);
		s.add(null);	// you can not add duplicate value in the Set
		System.out.println(s);
		
		System.out.println("-------------------------------");
		
		//Iterator 
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-------------------------------");
		
		//ListIterator
//		ListIterator li = s.listIterator();	// ListIterator is not allowed in the Set
//		while(li.hasNext()) {
//			System.out.println(li.next());
//		}
	}
};
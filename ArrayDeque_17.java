/*ArrayDeque:-
 *1) ArrayDeque class implements the Deque interface.
 *2) 
 * */
package com.java.collections;

import java.util.ArrayDeque;

public class ArrayDeque_17 {}	//This class is not for use only for class file naming purpose.


//Use of ArrayDeque
class ArrayDequeDemo {
	
	public static void main(String[] args) {
		
		ArrayDeque ad = new ArrayDeque(); // No need to add datatype two times here in FIFO
		ad.push("Darshan"); //you use use heterogeneous data-types
		ad.push("Rahul");	//It work on LIFO operation when you use push() method
		ad.push(101);		//It does not follow the sorting order
		ad.push('c');
		ad.push(10.12);
		System.out.println(ad);
		
		ArrayDeque ad2 = new ArrayDeque();
		ad2.add("Darshan"); //you use use heterogeneous data-types
		ad2.add("Rahul");	//It work on index based data structure when you use add() method
		ad2.add(101);		// it follows the inser
		ad2.add('c');		
		ad2.add(10.12);
		System.out.println(ad2);
		
		//pop() method
		ad2.pop (); // remove the first value
		System.out.println(ad2);
		
		//addAll() method
		ad2.addAll(ad);
		System.out.println(ad2);
		
		//element()	
		System.out.println(ad2.element());	//retrieve the first element
		System.out.println(ad.element());
		System.out.println(ad);
		
		
	}
}

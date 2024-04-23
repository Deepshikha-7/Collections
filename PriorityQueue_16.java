/*Queue:- Queue is used for FIFO operation
 *PriorityQueue:- 
 *1) It is an class of Collection framework
 *2) Syntax:-
 *	 class PriorityQueue
 *	 {
 *		//Constructors
 *		//Methods
 *	 }
 *3) It was introduced in JDL 1.2 version.
 *4) 
 *
 **/

package com.java.collections;

import java.util.PriorityQueue;

public class PriorityQueue_16 {}	//This class is not for use only for class file naming purpose.


//Use of PriorityQueue
class PriorityQueueDemo {
	
	public static void main(String[] args) {
		
		//default constructor
		PriorityQueue pq= new PriorityQueue<>();
		
		pq.add(100);
		pq.add(500);
		pq.add(300);
		pq.add(400);
//		pq.add("Dashan");	//it can store different data-types
		System.out.println(pq);
		
		//Peek()
		System.out.println(pq.peek());
		
		//poll()
		System.out.println(pq.poll());	//Retrieves and removes the head of this queue,or returns null if this queue is empty.
		System.out.println(pq);
		
		//element() 
		System.out.println(pq.element());	//Retrieves, but does not remove, the head of this queue. This methoddiffers from peek only in that it throws an exception if this queue is empty. This implementation returns the result of peek unless the queue is empty.

		
		//offer()
		System.out.println(pq.offer(600));	//Inserts the specified element into this priority queue.
		System.out.println(pq);
	}
}

/*LinkedList:- 
 *1)It is an implemented class of List interface which is present in java.util package.
 *2)Syntax:-
 *Package java.util;
 *class LinkedList implemented List, Deque 
 *{
 *	//Constructors
 *	//Methods
 *}
 *3)The underline data structure of LinkedList is "doubly LinkedList" or "circular LinkedList".
 *	in the doubly LinkedList it is works on previous and next node address for example:
 *	if there is a single node so it contains data and next node address which show the
 *	next node address to point that data but in doubly LinkedList there is a node which
 *	contains previous node address and then data then next node address and when we keep
 *	data/elements in the doubly linked list so it's first and last node contains null i.e.
 *	|null|data|next-node-address| 	then	|previous-node-address|data|next-node-address|	then	|previous-node-address|data|null|
 *	and in circular LinkedList it contains data similar to the doubly Linked list but in 
 *	the first and list node we provide the address which was null in the doubly LinkedList
 *	for example:- we have data "Ram" "Sonu" "Monu
 *	First node->	|1003|Ram|1002| 	then second node->	|1001|Sonu|1002|	then third node->	|1002|Monu|1001|
 *	in this 1st node address is 1001 and second 1002 and third 1003 and we have
 *	provided last node address in the first previous node address and in the last
 *	node we have provided the first node address to make it as circular LinkedList.
 *
 *Advantages of LinkedList or doubly LinkedList:-
 *1) Insertion an deletion operation are efficient or fast. for example in Array/ArrayList
 *	 suppose we have lacks of data and we want to add one more data/element in the mid
 *	 or particular index position so we will have to shift the further elements in the
 *	 Array which will take more time to shift the elements where as in LinkedList there
 *	 is no need to shift the element while adding the new element in the middle of the
 *	 list you can simply create a node and point/edit the previous node address or next
 *	 node address in the new node which will point the it's previous node and next node
 *	 which is time efficient in the system.
 *2) We can traverse the list in forward and backward direction in the the LinkedList
 *	 because in the LinkedList there is provide previous node address and next node address.
 *
 *Disadvantages of LinkedList or doubly LinkedList:-
 *1) It occupy extra space for previous node address.
 *2) In case of insertion and deletion of element in between we have to manage previous
 *	 and next node.
 *
 *4)Properties of LinkedList:-
 *a) LinkedList are index based data structure.
 *b) LinkedList can store heterogeneous element of different data-types.
 *c) LinkedList can store duplicate elements.
 *d) LinkedList can store multiple null values.
 *e) LinkedList follows the insertion order.
 *f) LinkedList does not follows the sorting order.
 *g) LinkedList are non-synchronized collection.
 *
 *
 *LinkedList constructor:- there are 2 constructors in LinkedList
 *1)public LinkedList() {};
 *2) public LinkedList(Collection c) {};
 *
 *LinkedList methods:-
 *interface Collection
 *{
 *	1) boolean add(Object obj);
 *	2) boolean allAll(Collection c); 
 *	3) boolean remove(Object obje);
 *	4) boolean removeAll(Collection c);
 *	5) void clear();
 *	6) boolean contains(Object obj);
 *	7) boolean conatainsAll(Collection c);
 *	8) boolean isEmpty();
 *	9) int size();
 *	10) Iterator iterator();
 *	---------etc.
 *}
 *interface List extends Collection
 *{
 *	1) void add(int index, Object obj);
 *	2) void addAll(int index, Collection c);
 *	3) Object get(int index);
 *	4) Object remove(int index);
 *	5) Object set(int index, Object newobj);
 *	6) int indexOf(Object obj);
 *	7) int lastIndexOf(Object obj);
 *	------------etc.
 *}
 *class LinkedList implements List, Deque
 *{
 *	//contains Collection, List, and Deque methods
 *	
 *	1) void addFirst(Object obj);
 *	2) void addLast(Object obj);
 *	3) Object getFirst();
 *	4) Object getLast();
 *	5) Object removeFirst();
 *	6) Object removeLast();
 *}
 *
 **/

package com.java.collections;

import java.util.LinkedList;
import java.util.Spliterator;

public class LinkedListAndConstructorsAndMethods_8 {}	//This class is not for use only for class file naming purpose.


//Use of Constructor
class LinkedListDemo  {
	
	public static void main(String[] args) {
		
		//default constructor
		LinkedList l = new LinkedList();
		l.add(100);
		l.add("Darshan");
		l.add('c');
		l.add(12.5);
		System.out.println(l);
		
		//parameterized constructor
		LinkedList l2 = new LinkedList(l);	//passing one collection object to another collection
		l2.add(1,200);
		l2.add(2,"Darshan_Bisht");
		l2.add(3,'d');
		l2.add(4,13.55);
		System.out.println(l2);
		
		//addFirst() method
		l2.addFirst("Aman");
		System.out.println(l2);
		
		//addLast() method
		l2.addLast("Bye Bye");
		System.out.println(l2);
		
		//getFirst() method
		System.out.println(l2.getFirst());
		
		//getLast() method
		System.out.println(l2.getLast());
		
		//removeFirst() method
		l2.removeFirst();
		System.out.println(l2);
		
		//removeLast() method
		l2.removeLast();
		System.out.println(l2);
		
	}
};

/*Stack:-
 *1) Stack is the legacy class which was introduced in JDK 1.0 version.
 *2) Stack is the child class of Vector class which is present in java.util package.
 *->Syntax:-
 *package java.util;
 *class Stack extends Vector
 *{
 *	//Constructors
 *	//Methods
 *}
 *
 *Properties of Stack class:-
 *1) Stack class was designed on the basis of LIFO(Last In First Out).
 *2) Stack can be implemented on the basis of arrays, ArrayList, LinkedList or Vector.
 *3) Stack is an index based data structure.
 *
 *Stack class constructor:- There is only one default constructor
 *1) public Stack(){};
 *
 *Stack class methods:- 
 *It implements the List and Collection interface methods
 *1) push();	//add element in the Stack
 *2) pop();		//remove and get the element from Stack
 *3) peek();	//get the element;
 *4) search();	//provide the position value of the element if not present return the  -1 value
 *5) empty(); 	//checks is Stack empty of not and return the boolean value.
 * 
 * */

package com.java.collections;

import java.util.Stack;

public class StackPropertiesAndMethods_12 {}	//This class is not for use only for class file naming purpose.


//Use of Stack
class StackDemo {
	
	public static void main(String[] args) {
		
		//default constructor
		Stack s = new Stack();
		s.add(50);
		s.push(100);
		s.push("Darshan");
		s.push('c');
		s.push(1.25);
		System.out.println(s);
		
		//push() method
		s.push("Hello");
		System.out.println(s);
		
		//pop() method
		System.out.println(s.pop());
		System.out.println(s);
		
		//peek() method
		System.out.println(s.peek());
		System.out.println(s);
		
		//search() method
		System.out.println(s.search(100));
		
		//empty() method
		System.out.println(s.empty());
	}
};
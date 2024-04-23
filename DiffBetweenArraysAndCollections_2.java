/*Difference between Arrays and Collection framework:-
 *Arrays:-
 *1)Arrays can store primitive and non-primitive(objects) type of data.
 *	eg:- 1) int[] a = {10,20,30};	// primitive type
 *		 2) class Test
 *			{
 *				Test obj1 = new Test();
 *				Test obj2 = new Test();
 *				Test obj3 = new Test();
 *				Test[] t = {obj1, obj2, obj3}; 	// non-primitive type (objects)
 *
 *				String[] s = new String[5];	// non-primitive type (objects)
 *			};
 *2)Arrays can store only homogeneous(same) type of data.
 *	In case of int array we can provide character also because here character will be
 *	type casted into int automatically but we cannot provide any other type like
 *	boolean, long, float, double etc. so we can write int[] a={10,'z',30}; but we
 *	cannot write int[]= a={10,10.2,30};
 *3)Array size is fixed, we cannot increase or decrease the size of an array at runtime.
 *4)Array are inbuilt feature of java and thus we have to develop algorithms like
 *	sorting searching etc.
 *
 *Collection framework:-
 *1)Collection framework can contain only non-primitive type of data
 *	eg:- 1) ArrayList<"write the class name here"> al = new ArrayList();
 *			al.add(obj1);	// passing the object
 *			al.add(10);	// passing the object Integer not a int Integer is a wrapper class object(Integer i = new Integer)
 *			al.ass('z')	// character wrapper class object. 
 *2)We can store heterogeneous(different) type of data.
 *3)We can increase or decrease the size of collections at runtime.
 *4)Collection framework is an API which provides predefined classes, interfaces and methods.
 *
 **/
package com.java.collections;

import java.util.ArrayList;

//non-primitive type Array and collection
public class DiffBetweenArraysAndCollections_2 {

	public static void main(String[] args) {
		DiffBetweenArraysAndCollections_2 obj1 = new DiffBetweenArraysAndCollections_2();
		DiffBetweenArraysAndCollections_2 obj2 = new DiffBetweenArraysAndCollections_2();
		DiffBetweenArraysAndCollections_2 obj3 = new DiffBetweenArraysAndCollections_2();
		
		//Using Array (non-primitive type)
		DiffBetweenArraysAndCollections_2[] d= {obj1,obj2,obj3};	// passing objects into Array
		
		for(DiffBetweenArraysAndCollections_2 i: d)
			System.out.println(i);
		
		System.out.println("----------------------------------------------------------------");
		
		//Using collection framework
		ArrayList<DiffBetweenArraysAndCollections_2> al = new ArrayList<>();
		al.add(obj1);
		al.add(obj2);
		al.add(obj3);
		
		for(DiffBetweenArraysAndCollections_2 i: al)
			System.out.println(i);
		
		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(10);
		al2.add(20);
		
		for(Integer i: al2)
		System.out.print(i+",");
		
	}
};
/*TreeMap:-
 *1) It is an implemented class of NavigableMap but it also inherit the properties of
 *	 SortedMap and Map interface.
 *2) Syntax:-
 *	 Package java.util;
 *	 class TreeMap implements NavigableMap
 *	 {
 *		//Constructors
 *		//Methods
 *	 }
 *3) It was introduced in JDK 1.2 version.
 *4) TreeMap underline data structure is "Red-Black tree".
 *Properties of Red-Black Tree:-
 *1. Every node is either red or black color.
 *2. The root node is always black.
 *3. Every leaf node (NULL node) is black.
 *4. If node is red (parent node), then both it's children are black or visa-versa.
 *5. For each node, all paths from the node to it's descendant leaf nodes contain the 
 *	 same number of black nodes.
 *
 *Properties of TreeMap:-
 *1) We store the data in key-value pair in which keys should  be unique but values can be duplicate.
 *2) TreeMap does not follow the insertion order but follows the sorting order with respect to keys.
 *3) It can store homogeneous (if we are not using comparator and using default sorting nature means storing elements directly) elements and heterogeneous (If we do not use default sorting nature in this case we will have to use comparator(in this we tell how to do sorting)) elements in keys.
 *4) TreeMap cannot store null values.
 *5) TreeMap is non-synchronized data structure.
 *
 *TreeMap class constructors:- There are four constructors in TreeMap
 *1) public TreeMap() {};
 *2) public TreeMap(Comparator comparator) {};	//By using comparator you can build you sorting order otherwise TreeSet uses the default sorting order.
 *3) public TreeMap(Map m) {};
 *4) public TreeMap(SortedMap m) {};
 *
 *TreeMap class methods:-
 * it implements the methods of NavigableMap, SortedMap and Map interface.
 *1) ceilingEntry();
 *2) ceilingKey();
 *3) clear();
 *4) containsKey();
 *5) firstEntry();
 *6) floorEntry();
 *7) get();
 *8) headMap();
 *9) higherEntry();
 *10) keySet();
 *11) lastEntry();
 *12) pollFirstEntry();
 *13) pollLastEntry();
 *14) remove();
 *15) replace();
 *16) size();
 *17) subMap();
 *	--------etc;
 *
 **/

package com.java.collections;

import java.util.TreeMap;

public class TreeMap_21 {}	//This class is not for use only for class file naming purpose.


//Use of TreeMap
class TreeMapDemo {
	
	public static void main(String[] args) {
	
		//default constructor
		TreeMap tm = new TreeMap();
		tm.put(98, "Darshan");
		tm.put(100, "Rohit");
		tm.put(103, "Sohit");
		tm.put(104, "Kaanu");
		tm.put(104, "Mannu");	//If you use duplicate key it will replace the value element.
//		tm.put(null, "Kaanu");	//null is not allowed in key otherwise it will throw the NullPointerException 
		tm.put(105, null);
		System.out.println(tm);
	
		//parameterized constructor (Provide Map object reference)
		TreeMap tm2 = new TreeMap(tm);
		tm2.put(110, "Harsh");
		tm2.put(108, "Vikash");
		tm2.put(109, "Monti");
		tm2.put(106, "mital");
		tm2.put(107, "Hemant");
		System.out.println(tm2);
		
		//default sorting of TreeSet
		TreeMap tm3 = new TreeMap();
		tm3.put("Balam", 101);
		tm3.put("Amit", 103);
		tm3.put("Zon", 104);
		tm3.put("Chintamani", 105);
		tm3.put("Deepak", 106);
		System.out.println(tm3);
		
		//ceilingEntry() method
		System.out.println(tm.ceilingEntry(100));	// if key present then it return the entry if key not present but keys bigger value is present then it returns that entry.
		System.out.println(tm.ceilingEntry(101));
		
		//ceilingKey() method
		System.out.println(tm.ceilingKey(100));
		System.out.println(tm.ceilingKey(101));
		
		//clear() method
		tm.clear();
		System.out.println(tm);
		
		//containsKey() method
		System.out.println(tm2.containsKey(100));
		System.out.println(tm2.containsKey(101));
		
		//firstEntry() method
		System.out.println("First Entry value in tm2 is: "+tm2.firstEntry());	// it returns the first entry value only which is not in curly braces
		
		//floorEntry() method
		System.out.println(tm2.floorEntry(100));	// if key present then it return the entry if key not present but keys lower value is present then it returns that entry. (similar as ceiling() method)
		System.out.println(tm2.floorEntry(101));
		
		//get() method
		System.out.println(tm2.get(100));	//it will return the key's value only if key not present return the null value.
		System.out.println(tm2.get(101));
		
		//headMap() method
		System.out.println(tm2.headMap(100));	//it will return the SortedMap of first entry which is in curly braces
		
		//higherEntry() method
		System.out.println(tm2.higherEntry(100));	//it will return the higher value
		System.out.println(tm2.higherEntry(98));
		
		//keySet() method
		System.out.println(tm2.keySet()); //it will return the set of keys
		
		//lastEntry() method
		System.out.println(tm2.lastEntry());	//it will return the last entry of TreeMap
		
		//pollFirstEntry() method
		System.out.println(tm2.pollFirstEntry());	//it will return the first entry and remove that entry form TreeMap.
		System.out.println(tm2);
		
		//pollLastEntry() method
		System.out.println(tm2.pollLastEntry());
		System.out.println(tm2);
		
		//remove() method
		tm2.remove(100);
		System.out.println(tm2);
		
		//replace() method
		tm2.replace(103, "Harsh");
		System.out.println(tm2);
		
		//size() method
		System.out.println(tm2.size());
		
		//subMap() method
		System.out.println(tm2.subMap(103, 105));	//it will return the values with -1
		
		
	}
}

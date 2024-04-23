/*Collection Framework:- There are two interface in Collection framework 
 *1) Collection Interface
 *2) Map Interface (Now we will do Map interface Collection framework)
 *
 *Map:-
 *1) Map is an interface which is present in java.util package.
 *	->Map does not inherit Collection interface.
 *2) Syntax:-
 *	 Package java.util;
 *	 public interface Map
 *	 {
 *		//Methods
 *	 }
 *3) Map was introduced in JDK 1.2 version.
 *4) Hierarchy of Map interface:-
 *	 1)In the Map Hierarchy first implemented class comes HashMap(class) and inside HashMap
 *	   LinkedHashMap(class) comes which extends the HashMap class 
 *	 2)then second comes SortedMap(interface) inside SortedMap NavigableMap(interface)
 *	   comes and inside NavigableMap TreeMap(class)comes which is an implemented class of Map interface
 *	 3)then third Hashtable(class) comes.
 *
 *Properties of Map:-
 *1) Map stores the data in key-value pair.(a single key-value pair element is called Entry)
 *2) In Map keys should be unique but value can be different.
 *3) In Map we can store maximum one null value in key but in values we can store any numbers of null values.
 *4) Map does not follow the sorting and insertion order.
 *
 *
 *Map interface methods:-
 *1) put(Object key, Object value);
 *2) clear();
 *3) containsKey(Object key);	//returns the boolean value
 *4) containsValue(Object value);	//returns the boolean value
 *5) entrySet();
 *6) get(Object key);	//return the value if present otherwise returns null
 *7) keySet();
 *8) putAll(Map m);	//One Map with get store in another Map
 *9) remove(Object key);	//to remove the entry
 *10) replace(Object key, Object value);
 *11) size();
 *	---------etc.
 *
 **/

package com.java.collections;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceAndMethods_18 {}	//This class is not for use only for class file naming purpose.


//Use of Map
class MapDemo {
	
	public static void main(String[] args) {
		
		Map m = new HashMap();
		
		m.put(101, "Darshan");
		m.put(103,"Rahul");
		m.put(105,"Amit");
		m.put(104,"Darshan");	//You can use duplicate value not the key
		m.put(102,"Mohit");
		m.put(102, "Sonu"); //if you use duplicate key then it will replace the previous entry.
		m.put(null, null);	//you can use only single null value in key side and you can use multiple null values in value side. 
		System.out.println(m);
		
		//it does not follow the sorting order but when we provide key as numeric value so it sort the numeric value but when we use null value it print it in the first
		Map m2 = new HashMap();
		m2.put("Ram", 101);
		m2.put("Mohit", 103);
		m2.put("Bablu", 102);
		m2.put("Amit", 105);
		m2.put("Sham", 104);
		System.out.println(m2);
		
		//containsKey() method
		System.out.println(m.containsKey(105));
		
		//containsValue() method
		System.out.println(m.containsValue("Mohit"));
		System.out.println(m.containsValue("Sonu"));
		
		//keySet() method
		System.out.println(m.keySet());
		
		//get() method
		System.out.println(m.get(101));	 
		
		//replace() method
		m.replace(101, "Harish");
		System.out.println(m);
		
		//remover() method
		m.remove(101);
		System.out.println(m);
		
		//size() method
		System.out.println(m.size());
		
		//putAll() method
		m.putAll(m2);
		System.out.println(m);
		
		//clear() method
		m.clear();
		System.out.println(m);
		
	}
}

package hashSet_Basics;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Demo_1 {

	public static void main(String[] args) {
			
		//Declaring HashSet
		
		//Type-1
		//HashSet hs = new HashSet(); //default capacity is 16 and default load factor is 0.75%
		
		//Type-2
		//HashSet hs = new HashSet(100); //capacity changed from 16 to 100
		
		//Type-3
		//HashSet hs = new HashSet(100,(float)0.90); //capacity is 100 and load factor is 0.90%
		
		//HashSet<Integer> hs = new HashSet<Integer>(); //Homogeneous data type syntax with wrapper class
		
		HashSet hs = new HashSet();
		hs.add(100);
		hs.add("welcome");
		hs.add(15.5);
		hs.add('A');
		hs.add(true);
		hs.add(null);
		
		System.out.println(hs);
		
		//remove an object/element
		hs.remove(15.5);
		System.out.println(hs);
		
		//contains method
		System.out.println(hs.contains("Mango"));
		System.out.println(hs.contains(100));
		
		//isEmpty method
		System.out.println(hs.isEmpty());
		
		System.out.println();
		//read data from hashset
		System.out.println("----For Each Loop----");
		for(Object o:hs) {
			System.out.println(o);
		}
		
		System.out.println();
		//read data through iterator
		System.out.println("----Iterator----");
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		

	}

}

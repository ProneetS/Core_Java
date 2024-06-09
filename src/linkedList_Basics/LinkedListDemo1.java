package linkedList_Basics;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		
		//Declaration
		//LinkedList l = new LinkedList(); --->Accept heterogeneous data
		//LinkedList<Integer> l = new LinkedList<Integer>(); ----> Accept homogeneous data with wrapper class
		
		LinkedList l = new LinkedList();
		l.add(100);
		l.add("Welcome");
		l.add(15.5);
		l.add('A');
		l.add(true);
		l.add(null);
		
		System.out.println("Elements present inside LinkedList: " + l);
		
		System.out.println("Size of Linked List is " + l.size());
		
		//remove value through index
		l.remove(3);
		System.out.println("After removing index 3 value, new list " + l);
		
		//insert/adding element in the middle of LinkedlIst
		l.add(3,"Java");
		System.out.println("After adding value at index 3, new list " + l);
		
		//retrieving value by passing index value
		System.out.println(l.get(2));
		
		//change the value of a particular index
		l.set(0, 200);
		System.out.println("After replacing index 0 value with new value, new list " + l);
		
		//contains
		System.out.println(l.contains("Apple"));
		System.out.println(l.contains(200));
		
		//isEmpty()
		System.out.println(l.isEmpty());
		
		System.out.println();
		//read data using for loop
		System.out.println("-----for loop-----");
		for(int i = 0; i<l.size(); i++) {
			System.out.println(l.get(i));
		}
		
		System.out.println();
		//read data using for each loop
		System.out.println("-----For each loop-----");
		for(Object o:l) {
			System.out.println(o);
		}
		
		
		System.out.println();
		//read data using Iterator
		System.out.println("-----Iterator-----");
		Iterator it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}

}

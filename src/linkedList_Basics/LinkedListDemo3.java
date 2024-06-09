package linkedList_Basics;

import java.util.LinkedList;

public class LinkedListDemo3 {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		l.add("dog");
		l.add("dog"); //duplicates are allowed in LinkedlIst
		l.add("cat");
		l.add("mouse");
		
		System.out.println(l);
		
		//add element in the 1st position
		l.addFirst("Tiger");
		
		//add element in the last position
		l.addLast("Elephant");
		
		System.out.println("After adding 1st and last element: " + l);
		
		//extract 1st and last element
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		
		//remove 1st and last element
		l.removeFirst();
		l.removeLast();
		
		System.out.println("After removing 1st and last element: " + l);
	}

}

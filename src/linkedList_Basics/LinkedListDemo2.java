package linkedList_Basics;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		
		
		LinkedList l = new LinkedList();
		l.add("X");
		l.add("Y");
		l.add("Z");
		l.add("A");
		l.add("B");
		l.add("C");
		
		//adding linkedlinst l collection to new linkedlist new_ll
		LinkedList new_ll = new LinkedList();
		new_ll.addAll(l);
		System.out.println(new_ll);
		
		//removing collection from new_ll linkedlist
		new_ll.removeAll(l);
		System.out.println(new_ll);
		
		//sorting the linkedlist l
		Collections.sort(l);
		System.out.println(l);
		
		//reverse order sorting
		Collections.sort(l, Collections.reverseOrder());
		System.out.println(l);
		
		//shuffling elements of Linkedlist
		Collections.shuffle(l);
		System.out.println(l);
		
		
		
		

	}

}

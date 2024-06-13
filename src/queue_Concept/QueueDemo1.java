package queue_Concept;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo1 {

	public static void main(String[] args) {
		
		PriorityQueue q = new PriorityQueue();
		
		//adding elements add() offer()
		q.add("A");
		q.add("B");
		q.add("C");
		q.add("D");
		q.add("C");
		
		System.out.println("Queue :  " + q); //Insertion Order Preserved and Duplicates allowed
		System.out.println();
		
		//get head elements --> element() peek()
		System.out.println("head element: " + q.peek());
		System.out.println("head element: " + q.element());
		System.out.println();
		
		//return and remove element from queue --> remove() pull()
		System.out.println("return and remove: " + q.remove());
		System.out.println("return and remove: " + q.poll());
		System.out.println();
		
		System.out.println("After removing 2 times from head, The queue is : " + q);
		
		//traversing through queue element
		System.out.println();
		System.out.println("----Iterator----");
		Iterator it = q.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}

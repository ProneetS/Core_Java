package linked_HashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {

	public static void main(String[] args) {
		
		//Declaration
		LinkedHashSet lset = new LinkedHashSet();
		
		//LinkedHashSet<Integer> lset = new LinkedHashSet<Integer>();
		
		lset.add(100);
		lset.add(200);
		lset.add(300);
		lset.add(400);
		lset.add(500);
		
		System.out.println("Linked Hash Set " + lset);
		//Insertion order is preserved.
		
		//all the method available is Hash Set is applicable here.
		
		System.out.println(lset.isEmpty());
		
		System.out.println(lset.contains(300));
		
		//read data of LinkedHashSet
		System.out.println();
		System.out.println("----ForEach Loop----");
		for(Object o:lset) {
			System.out.println(o);
		}
		
		System.out.println();
		
		System.out.println("----Iterator----");
		Iterator it = lset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		

	}

}

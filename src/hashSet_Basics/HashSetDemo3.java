package hashSet_Basics;

import java.util.HashSet;

public class HashSetDemo3 {

	public static void main(String[] args) {
		
		HashSet<Integer> hs1 = new HashSet<Integer>();
		hs1.add(1);
		hs1.add(2);
		hs1.add(3);
		hs1.add(4);
		hs1.add(5);
		
		HashSet<Integer> hs2 = new HashSet<Integer>();
		hs2.add(3);
		hs2.add(6);
		hs2.add(7);
		hs2.add(5);
		
		//union
		hs1.addAll(hs2);
		System.out.println("Union: " + hs1);
		
		//Intersection
		hs1.retainAll(hs2);
		System.out.println("Intersection: " + hs1);
		
		//difference
		hs1.removeAll(hs2);
		System.out.println("Difference: " + hs1);
		
		//subset
		System.out.println(hs1.containsAll(hs2));
		

	}

}

package hashSet_Basics;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		
		HashSet<Integer> evenNum = new HashSet<Integer>();
		evenNum.add(2);
		evenNum.add(4);
		evenNum.add(6);
		
		System.out.println("Old HashSet objects/elements: " + evenNum);
		System.out.println();
		
		
		//creating another HashSet and copying all the value of old HashSet to new HashSet
		HashSet<Integer> newhs = new HashSet<Integer>();
		//copying all old HashSet value to new HashSet
		newhs.addAll(evenNum);
		//adding new element to new hs
		newhs.add(10);
		
		System.out.println("New HashSet value after copying old HashSet value and adding 10 to it: " + newhs);
		
		

	}

}

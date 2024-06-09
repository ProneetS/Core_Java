package collection_Framework_ArrayList_Basic;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethodsDemo {

	public static void main(String[] args) {
		
		//Declaring ArrayList in multiple Ways
		
		//ways-1 (Can store Heterogeneous Data)
		//ArrayList al = new ArrayList();
		
		//ways-2 (Can store Homogeneous data)
		//ArrayList<Integer> al = new ArrayList<Integer>();  //store only Integer data type
		
		//ways-3 (Can be derived from List Interface)
		//List al = new ArrayList();
		
		//working in heterogeneous data type
		ArrayList al = new ArrayList();
		
		//adding elements
		al.add(100);
		al.add("Welcome");
		al.add(15.5);
		al.add('A');
		al.add(true);
		
		//printing out all elements
		System.out.println("Elements present in arraylist are: "+al);
		
		//size of array list
		System.out.println("size of array list is "+al.size());
		
		//remove "welcome" from the array list
		al.remove("Welcome");
		System.out.println("after removing 'welcome' from array list via Object " + al);
		
		//index changed after removing welcome
		al.remove(2);
		System.out.println("after removing 'A' from array list via Index " + al);
		
		//Insert a new element in a particular place
		al.add(2,"Apple");
		System.out.println(al);
		
		//retrieve specific value/element
		System.out.println(al.get(0));
		
		//change the value of existing element
		al.set(2, "Banana");
		System.out.println(al);
		
		//search an element 
		System.out.println("Is Apple present in array list? "+al.contains("Apple"));
		System.out.println("Is Banana present in array list? "+al.contains("Banana"));
		
		//check empty array list
		System.out.println("Is array list empty? "+al.isEmpty());
		
	}

}

package collection_Framework_ArrayList_Basic;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		//working in heterogeneous data type
		ArrayList al = new ArrayList();
		
		//adding elements
		al.add('X');
		al.add('D');
		al.add('Y');
		al.add('E');
		al.add('A');
		
		//Add all 
		ArrayList al_Dup = new ArrayList();
		al_Dup.addAll(al);
		System.out.println("After adding: " + al_Dup);
		
		//Remove all
		al_Dup.removeAll(al);
		System.out.println("After removing: " + al_Dup);
		
		//sorting
		Collections.sort(al);
		System.out.println(al);
		
		//Reverse order sorting
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		

	}

}

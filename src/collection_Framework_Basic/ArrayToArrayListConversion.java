package collection_Framework_Basic;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayListConversion {

	public static void main(String[] args) {
		
		
		String arr[] = {"dog", "tiger", "Elephant", "Lion"};
		for(String val:arr) {
			System.out.println(val);
		}
		
		System.out.println();
		
		//convert array to arraylist
		ArrayList al = new ArrayList(Arrays.asList(arr));
		System.out.println(al);
		

	}

}

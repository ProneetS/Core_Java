package collection_Framework_Basic;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTraverse {

	public static void main(String[] args) {
		
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
				System.out.println();
				
				//traverse through for loop
				System.out.println("------For Loop------");
				for(int i = 0; i<al.size(); i++) {
					System.out.println(al.get(i));
				}
				
				System.out.println();
				
				//traverse though for each loop
				System.out.println("------For Each Loop------");
				for(Object o:al) {
					System.out.println(o);
				}
				
				System.out.println();
				
				//traverse through Iterator
				System.out.println("------Iterator------");
				Iterator it = al.iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}
				
	}

}

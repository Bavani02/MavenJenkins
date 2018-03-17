package collections_classwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnGenerics {

	public static void main(String[] args) {

		// Earlier to Java 1.5
		/*ArrayList<Integer> list = new ArrayList<Integer>(); 
		// Create a List
		//list.add("gopi");
		list.add(10);
		list.add(20);
		list.add(30);*/
		
		ArrayList<String> list = new ArrayList<String>(); 
		
		// Add mentors to the List -- Note the order

		list.add("Raj");
		list.add("Krishnan");
		list.add("Baba");
			
		for(String Names:list){
			System.out.println(Names);
		}

		
		
				

	}

}




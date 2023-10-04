package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo {
	
	public static void main(String[] args) {
		  ArrayList<String> list = new ArrayList<>();
		  list.add("Mango");//Adding object in arraylist    
	      list.add("Apple");    
	      list.add("Banana");    
	      list.add("Grapes");  
	      
	      System.out.println(list);
	      
	//Iterating ArrayList using Iterator
	    Iterator itr = list.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	   System.out.println("-----------------------------"); 
    // Iterating ArrayList using For-each loop
	    for(String fruit:list ) {
	    	list.set(2, "Bluebarray");
	    	System.out.println(fruit);
	    }
	    
	    System.out.println("-----------------------------");
	//Get and Set ArrayList
		System.out.println(list.get(2));
	   System.out.println("-------------------------------");

		
	}

}

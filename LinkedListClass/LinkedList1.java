package LinkedListClass;

import java.util.LinkedList;

public class LinkedList1 {
     public static void main(String[] args) {
		LinkedList<String> al = new LinkedList<>();
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay"); 
		  
		  System.out.println("Linked List item : " + al);
		  
		  for(String items : al) {
			  System.out.println(items);
		  }
	}
}

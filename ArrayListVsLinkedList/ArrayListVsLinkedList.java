package ArrayListVsLinkedList;
import java.util.*;
public class ArrayListVsLinkedList {
      public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		  al.add("Ravi"); 
		  al.add("Vijay");    
		  al.add("Ravi");    
		  al.add("Ajay");
		  
		  
		  
		  List<String> ll = new LinkedList<>();
		  ll.add("James");//adding object in linkedlist    
		  ll.add("Serena");    
		  ll.add("Swati");    
		  ll.add("Junaid"); 
		  
		  
		  System.out.println("Array List : " +al);
		  System.out.println("Linked List : " +ll);
	}
}

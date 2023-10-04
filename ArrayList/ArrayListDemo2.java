package ArrayList;
import java.util.*;
public class ArrayListDemo2 {
     public static void main(String[] args) {
		 ArrayList<String> list1 = new ArrayList<>();
		  list1.add("Mango");  
		  list1.add("Apple");  
		  list1.add("Banana");  
		  list1.add("Grapes"); 
		  Collections.sort(list1);
		  
	    Iterator itr1 = list1.iterator();
	    while(itr1.hasNext()) {
	    	System.out.println(itr1.next());
	    }
	    
	    System.out.println("Sorting numbers...");  
	    
	    ArrayList<Integer> list2 = new ArrayList<>();
	    list2.add(21);  
	    list2.add(11);  
	    list2.add(51);  
	    list2.add(1);  
	    Collections.sort(list2);
	    
	    for(int number : list2) {
	    	System.out.println(number);
	    }
	}
}

package LinkedHashSetClass;
import java.util.LinkedHashSet;
import java.util.Iterator;
public class LinkedHashSet1 {
     public static void main(String[] args) {
		
    	 LinkedHashSet<String> set = new LinkedHashSet<>();
    	 set.add("One");    
         set.add("Two");    
         set.add("Three");   
         set.add("Four");  
         set.add("Five");
         set.add("One"); // ignoring dublicte elements
      // Removing an element from the above linked Set  
        System.out.println(set.remove("Two")); 
        
        
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()) {
    	   System.out.println(itr.next());
       }
        
	}
}

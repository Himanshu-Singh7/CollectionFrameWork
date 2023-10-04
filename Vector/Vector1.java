package Vector;
import java.util.*;
public class Vector1 {
	public static void main(String[] args) {
		
		Vector<String> vec = new Vector<>();
		vec.add("Tiger");  
        vec.add("Lion");  
        vec.add("Dog");  
        vec.add("Elephant"); 
        
        vec.addElement("Rat");
        vec.addElement("Cat");  
        vec.addElement("Deer");  
        System.out.println(vec);
        
     Iterator itr  = vec.iterator();
     while(itr.hasNext()) {
    	 System.out.println(itr.next());
     }
		
	}

}

package Vector;
import java.util.*;
public class Vector2 {
     public static void main(String[] args) {
		Vector<String> vec = new Vector<>();
		vec.add("Tiger");  
        vec.add("Lion");  
        vec.add("Dog");  
        vec.add("Elephant");  
        
       //Check size and capacity  
        System.out.println("Size of Vector : " + vec.size());
        System.out.println("Default capacity is: " +vec.capacity());
        System.out.println("Display the elemnet : "+ vec);
        
        vec.addElement("Rat");
        vec.addElement("Cat");  
        vec.addElement("Deer"); 
        //Again check size and capacity after two insertions  
        
        System.out.println("Size after addition: " + vec.size());
        System.out.println("Capacity after addition is: " + vec.capacity());
        System.out.println("Elements are: "+vec); 
      //Checking if Tiger is present or not in this vector
        if(vec.contains("Tiger")) {
        	System.out.println("Tiger is Preasent in index : " + vec.indexOf("Tiger"));
        }else {
        	System.out.println("Tiger is not present in this index");
        }
        
        System.out.println("The first animal of the vector is = " + vec.firstElement());
        System.out.println("The Last animal of the vector is = " + vec.lastElement());
        
	}
}

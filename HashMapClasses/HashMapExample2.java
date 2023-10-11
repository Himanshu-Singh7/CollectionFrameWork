package HashMapClasses;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
     public static void main(String[] args) {
		
    	 HashMap<Integer,String> map = new HashMap<>();
    	 map.put(1,"Mango");  //Put elements in Map  
    	 map.put(2,"Apple");    
    	 map.put(3,"Banana");   
    	 map.put(1,"Grapes"); //trying duplicate key  
    	       
    	 System.out.println("Iterating Hashmap..."); 
    	 for(Map.Entry me : map.entrySet()) {
    		System.out.println(me.getKey() + ": " + me.getValue());
    	 }
    	 // Add extra element
    	 map.putIfAbsent(4, "Berray");
    	 System.out.println("After invoking putIfAbsent() method ");  
    	 for(Map.Entry me1 : map.entrySet()) {
    		 System.out.println(me1.getKey() + ":"+ me1.getValue());
    	 }
    	 
    	 HashMap<Integer , String > map1 = new HashMap<>();
    	 map1.put(102, "AppleSeeds");
    	 map1.put(101, "MangoSeeds");
    	// map1.replace(101, "OrangeSeeds");
    	 map1.putAll(map);
    	 
    	 for(Map.Entry me3 : map1.entrySet()) {
    		 System.out.println(me3.getKey() + ":" + me3.getValue());
    	 }
    	 
    	 //Remove the elements
    	 
    	 
    	 
	}
}

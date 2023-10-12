package LinkedHashMapclass;
import java.util.LinkedHashMap;
public class LinkedHashMap2 {
     public static void main(String[] args) {
		LinkedHashMap<Integer ,String> lhm = new LinkedHashMap<>();
		lhm.put(101, "Amit");
   	    lhm.put(102, "Himanshu");
   	    lhm.put(104, "Rahul");
   	    lhm.put(000, "Rahul");
     	//Fetching key  
   	    System.out.println("Key :" + lhm.keySet());
   	   //Fetching value 
   	    System.out.println("Values : "+ lhm.values());
   	   //Fetching key-value pair 
   	    System.out.println("Key values pair :"+ lhm.entrySet());
	}
}

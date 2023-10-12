package TreeMapClass;
import java.util.Map;
import java.util.TreeMap;
public class TreeMap1 {
     public static void main(String[] args) {
		
    	 TreeMap<Integer,String> map = new TreeMap<>();
    	 map.put(100,"Amit");    
         map.put(102,"Ravi");    
         map.put(101,"Vijay");    
         map.put(103,"Rahul");  
         
         for(Map.Entry<Integer , String> itr : map.entrySet()) {
        	 System.out.println(itr.getKey() + ":"+ itr.getValue());
         }
	}
}

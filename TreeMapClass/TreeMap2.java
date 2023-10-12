package TreeMapClass;
import java.util.Map;
import java.util.TreeMap;
public class TreeMap2 {
    public static void main(String[] args) {
		
    	TreeMap<Integer, String> map = new TreeMap<>();
		map.put(100,"Amit");    
	    map.put(102,"Ravi");    
	    map.put(101,"Vijay");    
	    map.put(103,"Rahul");
	    
	    System.out.println("Before invoking remove() method");  
	    for(Map.Entry<Integer,String> itr : map.entrySet()) {
	    	System.out.println(itr.getKey() + ":"+ itr.getValue());
	    }
	    
	    map.remove(101);
	    
	    System.out.println("After invoking remove() method"); 
	    for(Map.Entry<Integer,String> itr1 : map.entrySet()) {
	    	System.out.println(itr1.getKey() +" "+ itr1.getValue());
	    }
	    
	    System.out.println(map.descendingMap());
	}
}

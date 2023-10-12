package LinkedHashMapclass;
import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedHashMap1 {
     public static void main(String[] args) {
		
    	 LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();
    	 lhm.put(101, "Amit");
    	 lhm.put(102, "Himanshu");
    	 lhm.put(104, "Rahul");
    	 lhm.put(000, "Rahul");
    	 
    	 System.out.println(lhm);
    	 for(Map.Entry itr : lhm.entrySet()) {
    		 System.out.println(itr.getKey() + ":" + itr.getValue());
    	 }
    	 
    	 
	}
}

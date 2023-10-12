package HashTableClass;

import java.util.Hashtable;
import java.util.Map;

public class HashTable1 {
     public static void main(String[] args) {
		Hashtable<Integer ,String> table = new Hashtable<>();
		table.put(100,"Amit");  
		table.put(102,"Ravi");  
		table.put(101,"Vijay");  
		table.put(103,"Rahul");
		 System.out.println("Before remove");  
		for(Map.Entry<Integer,String> itr : table.entrySet()) {
			System.out.println(itr.getKey()+":" + itr.getValue());
		}
		System.out.println("After remove: ");  
		table.remove(102);
		for(Map.Entry<Integer, String> itr1 : table.entrySet()) {
			System.out.println(itr1.getKey() +":"+ itr1.getValue());
		}
	}
}

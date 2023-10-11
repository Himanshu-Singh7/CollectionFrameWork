package HashMapClasses;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class HashMap1 {
     public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		
		System.out.println("Initial : " + map);
		//Add the elements
		map.put("Java", 8);
		map.put("JavaScript", 1);
		map.put("Python", 3);
		
		System.out.println("HashMap : " + map);
//--------------------------------------------------------------------------		
//		Set set = map.entrySet();  // HashMap entry convert into set
//		//System.out.println(set);
//		Iterator itr = set.iterator();
//		while(itr.hasNext()) {
//		Map.Entry entry = (Entry) itr.next();
//		System.out.println(entry.getKey() +": " + entry.getValue());
//		}
//------------------------------------------------------------------------------
		for(Map.Entry me : map.entrySet()) {
			System.out.println(me.getKey() + " :"+ me.getValue());
		}
		
		
	}
}

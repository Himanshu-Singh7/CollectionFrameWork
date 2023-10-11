package HashMapClasses;
import java.util.HashMap;
public class HashMap1 {
     public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		
		System.out.println("Initial : " + map);
		//Add the elements
		map.put("Java", 8);
		map.put("JavaScript", 1);
		map.put("Python", 3);
		
		System.out.println("HashMap : " + map);
		
		
		
	}
}

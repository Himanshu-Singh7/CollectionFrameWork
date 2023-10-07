package HashSet;
import java.util.HashSet;
import java.util.Iterator;
public class HashSet1 {
      public static void main(String[] args) {
		HashSet<String> carData = new HashSet<>();
		carData.add("Nano");
		carData.add("Toyota");
		carData.add("Volkswagen");
		
		System.out.println(carData);// Print
		
	   Iterator itr = carData.iterator();
	   while(itr.hasNext()) {
		   System.out.println(itr.next());
	   }
	   
	   
		
	}
}

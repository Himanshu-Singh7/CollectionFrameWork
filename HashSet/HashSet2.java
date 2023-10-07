package HashSet;
import java.util.HashSet;
import java.util.Iterator;
public class HashSet2 {
    public static void main(String[] args) {
		HashSet<String> carData = new HashSet<>();
		carData.add("Nano");
	    carData.add("Toyota");
	    carData.add("Volkswagen");
	    System.out.println("Before Removal: " + carData);

	    
//	   Iterator<String> itr = carData.iterator();
//	   while(itr.hasNext()) {
//		   System.out.println(itr.next());
//	   }
	   
	    carData .remove("Toyota");
	    System.out.println("After Removal: " + carData);
	    
	}
}

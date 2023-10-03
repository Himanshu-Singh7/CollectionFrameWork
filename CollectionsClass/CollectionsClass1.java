package CollectionsClass;
import java.util.*;
public class CollectionsClass1 {
    public static void main(String[] args) {
		
    	List<String> items = new ArrayList<>();
    	items.add("Goa");
    	items.add("Mumbai");
    	items.add("Karnataka");
    	items.add("UttarPradesh");
    	items.add("Bihar");
    	// Sort the List
    	Collections.sort(items);
    	System.out.println("Total items : "+items);
    	
    	// BinarySearch on the List
    	System.out.println("Search Bihar : " +Collections.binarySearch(items,"Bihar"));
    	System.out.println("Search UttarPradesh : "+ Collections.binarySearch(items,"UttarPradesh"));
	}
}

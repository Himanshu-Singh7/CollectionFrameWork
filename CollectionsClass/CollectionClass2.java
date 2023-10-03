package CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionClass2 {
	public static void main(String[] args) {
		
		List<String> destination_List = new ArrayList<>();
		destination_List.add("Shoes");
        destination_List.add("Toys");
        destination_List.add("Horse");
        destination_List.add("Tiger");
        
        
        System.out.println("The Original Destination list is :");
        for(int i = 0 ; i < destination_List.size(); i++) {
        	System.out.println(destination_List.get(i) + " ");
        }
        
     // Create source list
        List<String> source_List = new ArrayList<>();
  
        // Add elements
        source_List.add("Bat");
        source_List.add("Frog");
        source_List.add("Lion");
        
     // Copy the elements from source to destination
        Collections.copy(destination_List, source_List);
        System.out.println("The Destination List After copying is ");
        for(int i = 0 ; i < destination_List.size() ; i++) {
        	System.out.println(destination_List.get(i));
        }
	}

}

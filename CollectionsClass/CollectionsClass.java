package CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClass {
	public static void main(String[] args) {
		List<String> items = new ArrayList<>();
		items.add("Bag");
		items.add("Books");
		// Adding one or more elements using addAll()
		
		Collections.addAll(items,"Fruit","Bat","Ball");
		//Sorting the elemnts using sort()
		Collections.sort(items);
		for(int i = 0; i < items.size() ; i++) {
			System.out.println(items.get(i));	
		}
		
		// Sorting according to reverse ordering
		Collections.sort(items, Collections.reverseOrder());
		for(int i = 0; i < items.size() ; i++) {
			System.out.println("Reverse item"+ items.get(i));
		}
		
		
		
		
	}

}

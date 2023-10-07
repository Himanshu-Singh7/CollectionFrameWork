package HashSet;
import java.util.*;
public class MyHashSet3 {
    public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(1);
		
		HashSet<Integer> set = new HashSet<Integer>(list);
		set.add(5);
		
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

package EnumSetClass;
import java.util.EnumSet;
import java.util.Set;
import java.util.Iterator;
public class EnumSetExample1 {
 public static void main(String[] args) {
	
	 Set<Days> set = EnumSet.allOf(Days.class);
	 
	Iterator<Days> itr = set.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	Set<Days> set2 = EnumSet.noneOf(Days.class); 
	System.out.println("Week Days:" + set2);
}
}

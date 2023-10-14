package EnumSetClass;
import java.util.Iterator;
import java.util.EnumSet;
import java.util.Set;

public class EnumSetExample {
    public static void main(String[] args) {
		
    	Set<Days> set = EnumSet.of(Days.SATURDAY,Days.THURSDAY);
    	Iterator<Days> itr = set.iterator();
    	while(itr.hasNext()) {
    		System.out.println(itr.next());
    	}
	}
}

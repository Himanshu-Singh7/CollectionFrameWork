package TreeSetClass;
import java.util.TreeSet;
import java.util.Iterator;
public class TreeSet1 {
    public static void main(String[] args) {
		
    	TreeSet<String> al = new TreeSet<>();
    	  al.add("Ravi");  
    	  al.add("Vijay");  
    	  al.add("Ravi");  
    	  al.add("Ajay");  
    	  
    	Iterator itr = al.iterator();
    	while(itr.hasNext()) {
    		System.out.println(itr.next());
    	}
    	
    	
	}
}

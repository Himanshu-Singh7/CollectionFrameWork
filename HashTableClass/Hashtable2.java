package HashTableClass;
import java.util.Hashtable;
public class Hashtable2 {
    public static void main(String[] args) {
		Hashtable<Integer,String> map = new Hashtable<Integer,String>();
		map.put(100,"Amit");    
	    map.put(102,"Ravi");   
	    map.put(101,"Vijay");    
	    map.put(103,"Rahul"); 
	  //Here, we specify the if and else statement as arguments of the method  
	    System.out.println(map.getOrDefault(101, "NotFound"));
	    System.out.println(map.getOrDefault(105, "Notfound"));
	}
}

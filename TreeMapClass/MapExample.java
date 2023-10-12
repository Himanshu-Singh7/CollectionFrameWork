package TreeMapClass;
import java.util.Map;
import java.util.TreeMap;
public class MapExample {
     public static void main(String[] args) {
    	 Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);    
    	 Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
    	 Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
    	 
    	 TreeMap<Integer,Book> map = new TreeMap<Integer,Book>();
    	 
    	 map.put(2, b2);
    	 map.put(1, b1);
    	 map.put(3, b3);
    	 
    	 for(Map.Entry<Integer, Book> itr : map.entrySet()) {
    		 int key = itr.getKey();
    		 Book b = itr.getValue();
    		 System.out.println(key + " = Deatil");
    		 System.out.println(b.id+":"+b.name+":"+b.author+":"+b.publisher+":"+b.quantity);
			
    	 }
	}
}

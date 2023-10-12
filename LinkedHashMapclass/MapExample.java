package LinkedHashMapclass;
import java.util.LinkedHashMap;
import java.util.Map;
public class MapExample {
   public static void main(String[] args) {
	   Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);    
	   Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
	   Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
	   
	   LinkedHashMap<Integer ,Book> map = new LinkedHashMap<>();
	   map.put(2, b2);
	   map.put(1, b1);
	   map.put(3, b3);
	   
	   for(Map.Entry<Integer, Book> itr : map.entrySet()) {
		 int k =  itr.getKey();
		 Book b = itr.getValue();
		 System.out.println(k+" Details:");  
		 System.out.println(b.id + ":"+b.name+":"+b.author+":"+b.publisher+":"+b.quantity);
	   }
  }
}

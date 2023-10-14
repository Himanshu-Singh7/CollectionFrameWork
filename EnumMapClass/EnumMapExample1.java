package EnumMapClass;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapExample1 {
	public enum Key {
	  One,Two,Three	
	};
   public static void main(String[] args) {
	   Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);    
	   Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
	   Book b3=new Book(103,"Operating System","Galvin","Wiley",6); 
	   
	   EnumMap<Key,Book> map = new EnumMap<Key,Book>(Key.class);
	   map.put(Key.One, b1);
	   map.put(Key.Two, b2);
	   map.put(Key.Three, b3);
	   
	   for(Map.Entry<Key,Book> entry : map.entrySet()) {
		   
		   Book b = entry.getValue();
		   Key k =  entry.getKey();
		   System.out.println("KeyValue"+" : "+k);
		   System.out.println(b.id+":"+b.name+":"+b.author+":"+b.publisher+":"+b.quantity);
	   }
  }
}

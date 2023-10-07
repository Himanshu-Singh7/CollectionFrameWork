package LinkedHashSetClass;
import java.util.LinkedHashSet;
public class MyLinkedHash {
     public static void main(String[] args) {
    	 Book b1=new  Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
    	 Book b2=new  Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    	 Book b3=new  Book(103,"Operating System","Galvin","Wiley",6);
    	 Book b4 =new Book(101,"Let us java","Yashwant Kanetka","BPP",9);
    	 
    	 
    	 LinkedHashSet<Book> hs = new LinkedHashSet<Book>();
    	 hs.add(b1);
    	 hs.add(b2);
    	 hs.add(b3);
    	 hs.add(b4);
    	 
    	 for(Book b : hs) {
    	    System.out.println(b.id + ":"+ b.name + ":" + b.author + ":" + b.publisher+":"+b.quantity );
    	 }
	}
}

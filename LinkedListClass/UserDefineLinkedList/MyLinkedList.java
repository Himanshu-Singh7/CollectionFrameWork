package UserDefineLinkedList;

import java.util.LinkedList;

public class MyLinkedList {
	
	public static void main(String[] args) {
		
		LinkedList<Book> ll = new LinkedList<>();
		
		Book b1= new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
	    Book b2= new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
	    Book b3= new Book(103,"Operating System","Galvin","Wiley",6);  
	    ll.add(b1);
	    ll.add(b2);
	    ll.add(b3);
	    for(Book b : ll) {
	    	System.out.println(b.id+":"+ b.name+ ":" +b.author+":"+b.publisher+":"+b.quantity);
	    }
	}

}

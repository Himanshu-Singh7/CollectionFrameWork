package PriorityQueueClass;

import java.util.PriorityQueue;

public class MyPriorityQueue {
   public static void main(String[] args) {
	
	  PriorityQueue<Book> pq = new PriorityQueue<>();
	  Book b1=new Book(121,"Let us C","Yashwant Kanetkar","BPB",8);  
	  Book b2=new Book(233,"Operating System","Galvin","Wiley",6);  
	  Book b3=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
	  pq.add(b1);
	  pq.add(b2);
	  pq.add(b3);
	  System.out.println("Traversing the queue elements:");  
	  
	  for(Book b : pq) {
		  System.out.println(b.id+ ":"+ b.name+ ":" + b.author + ":" + ":"+ b.publisher + ":"+ b.quantity);
	  }
	  
	  pq.remove();
	  System.out.println("After removing one book record:");
	  for(Book b : pq) {
		  System.out.println(b.id+ ":"+ b.name+ ":" + b.author + ":" + ":"+ b.publisher + ":"+ b.quantity);
	  }
}
}

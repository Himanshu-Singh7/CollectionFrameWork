package ArrayDequeclass;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
		Deque<Book> deq = new ArrayDeque<Book>();
    	Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);    
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6); 
        deq.offer(b1);
        deq.offer(b2);
        deq.offer(b3);
        
        for(Book b : deq) {
        	System.out.println(b.id+":"+b.name+":"+b.author+":"+b.publisher+":"+b.quantity);
        }
	}
}

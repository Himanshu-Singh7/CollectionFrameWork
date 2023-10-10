package ArrayDequeclass;
import java.util.*;
public class ArrayDeque1 {
    public static void main(String[] args) {
	 
    	Deque<String> deque = new ArrayDeque<String>();
    	deque.add("Ravi");    
    	deque.add("Vijay");     
    	deque.add("Ajay"); 
    	deque.offer("Himanshu");
    	deque.offerFirst("Rahul");
        Iterator itr = deque.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
        
        
        deque.pollLast();
        System.out.println("After pollLast() Traversal...");  
        Iterator itr2 = deque.iterator();
        while(itr2.hasNext()) {
        	System.out.println(itr2.next());
        }
	}
}

package LinkedListClass;

import java.util.LinkedList;

public class LinkedList2 {
    public static void main(String[] args) {
		LinkedList<String> ls = new LinkedList<>();
		System.out.println("Initial list of elements: "+ls);  
        ls.add("Ravi");  
        ls.add("Vijay");  
        ls.add("Ajay"); 
        System.out.println("After invoking add(E e) method: "+ls);
      //Adding an element at the specific position  
        ls.add(1, "Himanshu");
        System.out.println("After invoking add(int index, E element) method: "+ls); 
        
        LinkedList<String> ls1 = new LinkedList<>();
        ls1.add("Sonoo");  
        ls1.add("Hanumat");  
        
        ls.addAll(ls1);
        System.out.println("After invoking addAll(Collection<? extends E> c) method: "+ls);
        
        LinkedList<String> ls2 = new LinkedList<>();
        ls2.add("John");  
        ls2.add("Rahul");  
        ls.addAll(1, ls2);
        System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+ls);
        ls.addFirst("Pratiksha");
        System.out.println("After invoking addFirst(E e) method: "+ls);
        ls.addLast("Khusi");
        System.out.println("After invoking addLast(E e) method: "+ls);  
	}
}

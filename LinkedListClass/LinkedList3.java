package LinkedListClass;

import java.util.LinkedList;

public class LinkedList3 {
    public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Pratiksha");  
        ll.add("Khusi");  
        ll.add("Kushboo");  
        ll.add("Anuj");  
        ll.add("Gaurav");  
        ll.add("Harsh");  
        ll.add("Virat");  
        ll.add("Gaurav");  
        ll.add("Harsh");  
        ll.add("Amit");  
        System.out.println("Initial list of elements: "+ll); 
        //Removing specific element from arraylist  
        ll.remove("Kushboo");
        System.out.println(ll);
      //Removing element on the basis of specific position 
        ll.remove(3);
        System.out.println(ll);
        LinkedList<String> ll2=new LinkedList<String>();  
        ll2.add("Ravi");  
        ll2.add("Hanumat"); 
        ll.addAll(ll2);  
        System.out.println("Updated list : "+ll);  
        //Removing all the new elements from arraylist  
        ll.removeAll(ll2);
        System.out.println("New List is remmove :" + ll);
        
       //Removing first element from the list 
        ll.removeFirst();
        System.out.println("When the remove the first index : " + ll);
        
        //Removing first element from the list 
        ll.removeLast();
        System.out.println("Remove last element : " + ll);
      //Removing first occurrence of element from the list  
        ll.removeFirstOccurrence("Khusi");
        System.out.println("Remove first occurance element :" +ll);
        // clear all element
        
        ll.clear();
        System.out.println("Claer all list :"+ll);
        System.out.println("exist");
	}
}

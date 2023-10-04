package IteratorAndListIterator;

import java.util.List;
import java.util.ListIterator;
import java.util.Vector;
public class ListIteratorDemo {
     
	public static void main(String[] args) {
		 List li = new Vector();
		 li.add(10);
		 li.add(21);
		 li.add(42);
		 li.add(2, 32);
		 
		// System.out.println(li);
		ListIterator litr = li.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next()); //--- Forward Direction
		}
		
		//litr.next();
		//litr.next();
		//litr.next();
		//litr.next();
		
		
		System.out.println("------------------------");
		while(litr.hasPrevious()){
			System.out.println(litr.previous());
		}
		 
	}
}

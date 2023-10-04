package IteratorAndListIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
	
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(10);
		l.add("Himanshu");
		l.add("Rahul");
		System.out.println(l);
		
		Iterator itr = l.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	
	}

}

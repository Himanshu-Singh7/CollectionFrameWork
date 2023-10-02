package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionFrameWork {
	public static void main(String[] args) {
		
		//List Interface  & ArayList calss
		//List<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(1, 60);//list.add("himanshu"); The method add(Integer) in the type List<Integer>is not applicable for the arguments (String)
		System.out.println(list);
		
		//LinkList Class
		
	    List linkedList = new LinkedList<>();
	    linkedList.add(0, 20);
		linkedList.add(10);
		linkedList.add(1, 15);
		linkedList.remove(1);
		System.out.println(linkedList);
		
		//Vector
		Vector<String> vector = new Vector<>();
		vector.add("11");
		vector.add("22");
		vector.add("33");
		vector.add("44");
		System.out.println(vector);
		vector.clear();
		System.out.println(vector);
		
		
		//Stack
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(20);
		stack.push(30);
		
		System.out.println("Stack : "+stack);
		stack.pop();
		System.out.println("Last element : "+stack.peek());
		
		//Set=?
		//HashSet
		Set<Integer> set = new HashSet();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(2);
		set.add(2);
		System.out.println("Set : "+set);
		
		//LinkedHas Set
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet();
		lhs.add(10);
		lhs.add(20);
		lhs.add(20);
		lhs.add(30);
		System.out.println("Linked hash set "+lhs);
		boolean p =lhs.contains(20);
		System.out.println("20 present in set : " + p);
		
		
		//TreeSet
		
		TreeSet <Integer> treeSet = new TreeSet<>();
		treeSet.add(20);
		treeSet.add(10);
		treeSet.add(10);
		treeSet.add(40);
		treeSet.add(60);
		treeSet.add(50);
		
		System.out.println("Tree set : "+treeSet);
		
	
		
	}

}

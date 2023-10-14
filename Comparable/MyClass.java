package Comparable;
import java.util.ArrayList;
import java.util.Collections;
public class MyClass {
    public static void main(String[] args) {
		ArrayList<Emp> list = new ArrayList<Emp>();
		
		Emp e1 = new Emp(104,"Himanshu",40000);
		Emp e2 = new Emp(109,"Rahul",430000);
		Emp e3 = new Emp(106,"Aprajit",22000);
	    list.add(e1);
	    list.add(e2);
	    list.add(e3);
	    
	    System.out.println(list);
	    Collections.sort(list);
	    System.out.println("update list :"+list);
		
	}
}

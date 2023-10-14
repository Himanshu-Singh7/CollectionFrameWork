package ComparatorInterface;
import java.util.ArrayList;
import java.util.Collections;
public class MyClass1 {
    public static void main(String[] args) {
		ArrayList<Emp> emp = new ArrayList<>();
		emp.add(new Emp("Himanshu", "9310664280",12));
		emp.add(new Emp("Rahul", "9569596433",11));
		emp.add(new Emp("Bachau", "7376234858",45));
		
		System.out.println(emp);
		Collections.sort(emp,new IdComparator());
		System.out.println("Sortinng data : " + emp);
		
		ArrayList<Emp> emp1 = new ArrayList<Emp>(emp);
		
		Collections.sort(emp1 ,new NameComprator());
		
		System.out.println("New Sorted Array list : " + emp1);
		
	}
}

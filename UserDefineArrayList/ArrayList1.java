package UserDefineArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
     
	public static void main(String[] args) {
		 
		Student s1 = new Student(101,"Pritksha", 25);
		Student s2 = new Student(102,"Meghana", 30);
		Student s3 = new Student(103,"Himanshu", 26);
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.println(st.rollno + ":" +st.name+ ":" + st.age);
		}
	}
}

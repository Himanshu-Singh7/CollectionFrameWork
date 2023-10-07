package HashSet;
import java.util.HashSet;
public class MyHashSet {
    public static void main(String[] args) {
    	
    	Student s1 = new Student(10, "Ram");
        Student s2 = new Student(20, "Shyam");
        Student s3 = new Student(30, "Sundar");
    	
        HashSet <Student> stuData = new HashSet<>();
        stuData.add(s1);
        stuData.add(s2);
        stuData.add(s3);
        
         for(Student s : stuData) {
        	 System.out.println(s.rollNo + " : " + s.name);
         }
		
	}
}

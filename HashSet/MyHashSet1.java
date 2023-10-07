package HashSet;
import java.util.HashSet;
public class MyHashSet1 {
     public static void main(String[] args) {
		
    	 Student1 s1 = new Student1(10, "Ram");
    	 Student1 s2 = new Student1(10, "Shyam");
    	 Student1 s3 = new Student1(20, "Sundar");
    	 
    	 HashSet<Student1> studentData = new HashSet<>();
    	 studentData.add(s1);
    	 studentData.add(s2);
    	 studentData.add(s3);
    	 
    	 for(Student1 s : studentData) {
    		 System.out.println(s.rollNo + ":" + s.name);
    	 }
     }  
}

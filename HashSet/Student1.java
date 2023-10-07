package HashSet;
import java.util.*;
public class Student1 {
	  int rollNo;
	  String name;
	public Student1(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	  
	
	public boolean equals(Object o) {
		 Student1 s = (Student1) o;
		return (this.rollNo == s.rollNo);
		
	}
	
	public int hashcode() {
	  return rollNo;
	}
	 
	  
	  
}

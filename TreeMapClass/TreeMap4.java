package TreeMapClass;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap4 {
   public static void main(String[] args) {
	SortedMap<Integer , String> map = new  TreeMap<>();
	map.put(100,"Amit");    
    map.put(102,"Ravi");    
    map.put(101,"Vijay");    
    map.put(103,"Rahul"); 
    
    System.out.println("Head Map :" + map.headMap(102));
    System.out.println("tail Map : " + map.tailMap(102));
    System.out.println("Sub Map :" + map.subMap(100, 102));
}
}

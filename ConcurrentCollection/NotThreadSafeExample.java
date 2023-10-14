package ConcurrentCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class NotThreadSafeExample {
     public static void main(String[] args) {
		
    	 List<String> list = new CopyOnWriteArrayList<String>();
    	 list.add("first");
    	 list.add("second");
    	 list.add("third");
    	 list.add("first");
    	 list.add("fourth");
    	 list.add("fift");
    	 list.add("sixeth");
    	 list.add("first");
    	 list.add("first");
    	 list.add("Last");
    	 
    	 Runnable t1 = () -> {
    		 for(String str : list) {
    			 System.out.println(str);
    			 try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
    		 }
    	 };
    	 
    	 Runnable t2 = () -> {
    		 list.add("new items");
    		 list.add("new items");
    		 list.add("new items");
    	 };
    	new Thread(t1).start();
    	new Thread(t2).start();
    	
    	
	}
}

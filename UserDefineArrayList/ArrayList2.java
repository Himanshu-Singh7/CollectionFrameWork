package UserDefineArrayList;

import java.util.ArrayList;

public class ArrayList2 {
     public static void main(String[] args) {
    	Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
    	Book b2=new Book(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);  
    	Book b3=new Book(103,"Operating System","Galvin","Wiley",6); 
    	
    	ArrayList<Book> book = new ArrayList<>();
    	book.add(b1);
    	book.add(b2);
    	book.add(b3);
    	
    	for(Book b : book) {
    		System.out.println(b.id + ":" +b.name + ":" + b.author +":"+ b.publisher +":"+b.quantity);
    	}
    	
	}
}

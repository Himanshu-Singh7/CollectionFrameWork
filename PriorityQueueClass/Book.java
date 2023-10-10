package PriorityQueueClass;

public class Book implements Comparable<Book>{
	int id;  
	String name,author,publisher;  
	int quantity;
	public Book(int id, String name, String author, String publisher, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	@Override
	public int compareTo(Book o) {
		if(id > o.id) {
			return 1;  
		}else if (id < o.id){
			return -1;
		}else {
			return 0;
		}
		
	}  
}

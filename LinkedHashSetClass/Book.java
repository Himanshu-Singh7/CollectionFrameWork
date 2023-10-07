package LinkedHashSetClass;

public class Book {
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
	
	 public boolean equals(Object o) {
		 Book b = (Book) o;
		 return (this.id == b.id);
	 }
	 
	 public int hashcode() {
	  
		 return id;
		 
	 }
}

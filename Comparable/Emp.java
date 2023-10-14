package Comparable;

public class Emp implements Comparable<Emp> {
    private int id ;
    private String name ;
    private long salary;
    
    @Override
    public int compareTo(Emp o) {
    	
    	return this.id-o.id;
    }
	// to string method
    @Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
    

	// Getter And Setter Method
    protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected long getSalary() {
		return salary;
	}

	protected void setSalary(long salary) {
		this.salary = salary;
	}

	// default Constructor
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
   //Constructor
	public Emp(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}  
    
}

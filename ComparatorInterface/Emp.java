package ComparatorInterface;

public class Emp {
    private String name ;
    private String phone;
    private int emId;
	
    public Emp(String name, String phone, int emId) {
		super();
		this.name = name;
		this.phone = phone;
		this.emId = emId;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getPhone() {
		return phone;
	}

	protected void setPhone(String phone) {
		this.phone = phone;
	}

	protected int getEmId() {
		return emId;
	}

	protected void setEmId(int emId) {
		this.emId = emId;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", phone=" + phone + ", emId=" + emId + "]";
	}
    
}

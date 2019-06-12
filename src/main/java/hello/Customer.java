package hello;

public class Customer {
	static int idCtr = 0;
	private Integer id;
	private String firstName;
	private String lastName;
	  
	public Customer() {
	}
		
	public Customer(String firstname, String lastName) {
		this.id = new Integer(idCtr);
		idCtr ++;
		this.firstName = firstname;
		this.lastName = lastName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
}

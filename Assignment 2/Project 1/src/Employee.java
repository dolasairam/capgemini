//You need to maintain the details of all employees of an Organization.
//The following details of the employee needs to be maintained
//First Name
//Last Name
//Mobile Number
//Email
//Address
//There is no higher limit to store the number of employee in our application. Get the number of
//employees first before getting all the employee details.
//Collect all employee details and store them in an appropriate collection type, so that when the
//collection is printed, it prints the employee details sorted by their first name.
//Use Generics.
public class Employee {
	private String firstName;
	private String lastName;
	private long mobileNumber;
	private String email;
	private String address;
	public Employee(String firstName, String lastName, long mobileNumber, String email, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.address = address;
	}
	public Employee() {
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
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String toString()
	{
		return firstName+"\t"+lastName+"\t"+mobileNumber+"\t"+email+"\t"+address+"\n";
		
	}
	
	
	
}

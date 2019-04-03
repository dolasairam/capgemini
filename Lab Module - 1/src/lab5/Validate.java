package lab5;
/**
 * 
 * @author DOLA SAI RAM
 *
 */

class MyException extends Exception
{
	public String printMessage()
	{
		return "NO null valeus ";
	}
}

class Employee 
{
	private String firstName;
	private String lastName;
	
	public Employee() {
		super();
	}
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName)  {
		try {
			if(firstName==null)
			{
				throw new MyException();
			}
		}
		catch(MyException e)
		{
			System.out.println(e.printMessage());
		}
			this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		try {
			if(firstName==null)
			{
				throw new MyException();
			}
		}
		catch(MyException e)
		{
			System.out.println(e.printMessage());
		}
		this.lastName = lastName;
	}
	
}

public class Validate {
	public static void main(String args[])
	{
		Employee emp=new Employee();
		emp.setFirstName(null);
		emp.setLastName(null);
	}
}

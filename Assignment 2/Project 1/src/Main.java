import java.util.Scanner;

public class Main {
	public static void main(String args[])
	{
		Employee emp;
		int count=0;
		DataFlow df=new DataFlow();
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("enter the First Name");
			emp=new Employee();
			String firstName;
			firstName=sc.next();
			emp.setFirstName(firstName);
			System.out.println("enter the Last Name");
			String lastName;
			lastName=sc.next();
			emp.setLastName(lastName);
			System.out.println("Enter the Mobile Number");
			String mobile=sc.next();
			emp.setMobileNumber(Long.parseLong(mobile));
			String email;
			System.out.println("Enter the email");
			email =sc.next();
			emp.setEmail(email);
			System.out.println("Enter the Adress");
			String address=sc.next();
			emp.setAddress(address);
			System.out.println("1.To enter another record");
			System.out.println("2.To display the records");
			System.out.println("3.Exit");
			int temp;
			temp=sc.nextInt();
			df.inputs(emp);
			if(temp==1)
			{
				count++;
			}
			else if(temp==2)
			{
				df.sortingByName();
				count=0;
			}
			else
			{
				count=0;
			}
		}while(count!=0);
		
	}
}

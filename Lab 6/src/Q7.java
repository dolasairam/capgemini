import java.util.Scanner;

//You are asked to create an application for registering the details of jobseeker. 
//The requirement is:
//Username should always end with _job and there should be at least minimum of 
//8 characters to the left of _job. Write a function to validate the same. 
//Return true in case the validation is passed. In case of validation failure return false.


class JobSeeker
{
	private StringBuffer userName;

	public StringBuffer getUserName() {
		return userName;
	}

	public boolean setUserName(StringBuffer userName) {
		
		//str=userName.substring(userName.length()-4).toString();
		if(userName.substring(userName.length()-4).toString().equals("_job"))
		{	
			if(userName.length()>12)
			{
				userName.append("_job");
				this.userName=userName;
				return true;
			}
			else
			{
				System.out.println("The username is less than 8 characters");
				return false;
			}
		}
		else 
		{
			System.out.println("Username should end wiht _job");
			return false;
		}
	}

	public JobSeeker(StringBuffer userName) {
		setUserName(userName);
	}

	public JobSeeker() {
		super();
	}
	
}
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JobSeeker js=new JobSeeker();
		String str;
		System.out.println("username:");
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		StringBuffer sb=new StringBuffer(str);
		System.out.println(js.setUserName(sb));
		
	}

}

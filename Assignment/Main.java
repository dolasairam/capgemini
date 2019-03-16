import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		FDAccount fd;
		SBAccount sb;
		RDAccount rd;
		int choice;
			System.out.println("1. Interest Calculator –SB");
			System.out.println("2. Interest Calculator –FD");
			System.out.println("3. Interest Calculator –RD");
			choice=sc.nextInt();
			if(choice==1)
			{
				sb=new SBAccount();
				int x;
				System.out.println("1. Normal");
				System.out.println("2. NRI");
				x=sc.nextInt();
				if(x==1)
				{
					sb.setType("Normal");
				}
				else if(x==2)
				{
					sb.setType("NRI");
				}
				else
				{
					System.out.println("Error");
				}
				System.out.println("Enter the Amount");
				double amount=sc.nextDouble();
				sb.setAmount(amount);
				if(sb.calculateInterest()!=0)
					System.out.println("Interest gained is"+sb.calculateInterest());
			}
			else if(choice==2)
			{
				fd=new FDAccount();
				System.out.println("Enter the FD amount:");
				double amount=sc.nextDouble();
				fd.setAmount(amount);
				System.out.println("Enter your age:");
				int age=sc.nextInt();
				fd.setAgeOfACHolder(age);
				System.out.println("Enter the number of days:");
				int noOfDays=sc.nextInt();
				fd.setNoOfDays(noOfDays);
				if(fd.calculateInterest()!=0)
					System.out.println(fd.calculateInterest());
			}
			else if(choice==3)
			{
				rd=new RDAccount();
				System.out.println("Enter the RD amount: ");
				double amount=sc.nextDouble();
				rd.setAmount(amount);
				System.out.println("Enter your age:");
				int age=sc.nextInt();
				rd.setAge(age);
				System.out.println("Enter the months:");
				int noOfMonths=sc.nextInt();
				rd.setNoOfMonths(noOfMonths);
				if(rd.calculateInterest()!=0)
					System.out.println(rd.calculateInterest());
			}
			else
			{
				choice=4;
			}
	}
}

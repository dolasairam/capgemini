
public class RDAccount extends Account{
	double amount;
	int noOfMonths;
	double monthlyAmount;
	int age;
	public RDAccount(double amount, int noOfMonths,int age) {
		super();
		this.amount = amount;
		this.noOfMonths = noOfMonths;
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public RDAccount() {
		super();
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getNoOfMonths() {
		return noOfMonths;
	}
	public void setNoOfMonths(int noOfMonths) {
		this.noOfMonths = noOfMonths;
	}
	public double getMonthlyAmount() {
		return monthlyAmount;
	}
	public void setMonthlyAmount(double monthlyAmount) {
		this.monthlyAmount = monthlyAmount;
	}
	@Override
	double calculateInterest() {
		// TODO Auto-generated method stub
		if(age<60 && age>0)
		{
		if(noOfMonths==6)
		{
			return (amount*7.5)/100;
		}
		else if(noOfMonths==9)
		{
			return (amount*7.75)/100;
		}
		else if(noOfMonths==12)
		{
			return (amount*8.0)/100;
		}
		else if(noOfMonths==15)
		{
			return (amount*8.25)/100;
		}
		else if(noOfMonths==18)
		{
			return (amount*8.50)/100;
		}
		else if(noOfMonths==21)
		{
			return (amount*8.75)/100;
		}
		else
		{
			System.out.println("Invalid NO OF MONTHS. Please enter correct values.");
		}
		}
		else if(age>=60)
		{
			if(noOfMonths==6)
			{
				return (amount*8.0)/100;
			}
			else if(noOfMonths==9)
			{
				return (amount*8.25)/100;
			}
			else if(noOfMonths==12)
			{
				return (amount*8.5)/100;
			}
			else if(noOfMonths==15)
			{
				return (amount*8.75)/100;
			}
			else if(noOfMonths==18)
			{
				return (amount*9.0)/100;
			}
			else if(noOfMonths==21)
			{
				return (amount*9.25)/100;
			}
			else
			{
				System.out.println("Invalid NO OF MONTHS. Please enter correct values.");
			}
		}
		else
		{
			System.out.print("Invalid AGE. Please enter correct values.");
		}
		return 0;
	}
	

}

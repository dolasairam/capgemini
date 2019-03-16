
public class FDAccount extends Account {

	//private double interestRate;
	private double amount;
	private int noOfDays;
	private int ageOfACHolder;
	
	public FDAccount() {
		super();
	}

	public FDAccount(double amount, int noOfDays, int ageOfACHolder) {
		super();
		this.amount = amount;
		this.noOfDays = noOfDays;
		this.ageOfACHolder = ageOfACHolder;
	}
	

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public int getAgeOfACHolder() {
		return ageOfACHolder;
	}

	public void setAgeOfACHolder(int ageOfACHolder) {
		this.ageOfACHolder = ageOfACHolder;
	}

	@Override
	double calculateInterest() {
		// TODO Auto-generated method stub
		if(amount<10000000L && amount>0) {
			if(ageOfACHolder<60 && ageOfACHolder>0)
			{
				if(noOfDays<=14 && noOfDays>=7)
				{
					return (4.5*amount)/100;
				}
				else if(noOfDays<=29 && noOfDays>=15)
				{
					return (4.75*amount)/100;
				}

				else if(noOfDays<=45 && noOfDays>=30)
				{
					return (5.50*amount)/100;
				}

				else if(noOfDays<=60 && noOfDays>=45)
				{
					return (7*amount)/100;
				}

				else if(noOfDays<=184 && noOfDays>=61)
				{
					return (7.50*amount)/100;
				}

				else if(noOfDays<=366 && noOfDays>=185)
				{
					return (8*amount)/100;
				}
				else
				{
					System.out.println("Invalid NO OF DAYS. Please enter correct values.");
				}
			}
			else if(ageOfACHolder>=60)
			{
				if(amount<10000000L)
				{
					if(noOfDays<=14 && noOfDays>=7)
					{
						return (5*amount)/100;
					}
					else if(noOfDays<=29 && noOfDays>=15)
					{
						return (5.25*amount)/100;
					}

					else if(noOfDays<=45 && noOfDays>=30)
					{
						return (6.0*amount)/100;
					}

					else if(noOfDays<=60 && noOfDays>=45)
					{
						return (7.5*amount)/100;
					}

					else if(noOfDays<=184 && noOfDays>=61)
					{
						return (8.0*amount)/100;
					}

					else if(noOfDays<=366 && noOfDays>=185)
					{
						return (8.5*amount)/100;
					}
					else
					{
						System.out.println("Invalid NO OF DAYS. Please enter correct values.");
						
					}
				}
			}
			else
			{
				System.out.println("Invalid Age, Please enter correct values.");
			}
		}
		else if(amount>10000000)
		{
			if(noOfDays<=14 && noOfDays>=7)
			{
				return (6.5*amount)/100;
			}
			else if(noOfDays<=29 && noOfDays>=15)
			{
				return (6.75*amount)/100;
			}

			else if(noOfDays<=45 && noOfDays>=30)
			{
				return (6.75*amount)/100;
			}

			else if(noOfDays<=60 && noOfDays>=45)
			{
				return (8*amount)/100;
			}

			else if(noOfDays<=184 && noOfDays>=61)
			{
				return (8.5*amount)/100;
			}

			else if(noOfDays<=366 && noOfDays>=185)
			{
				return (10.0*amount)/100;
			}
			else
			{
				System.out.println("Invalid NO OF DAYS. Please enter correct values.");
			}
		}
		else
		{
			System.out.println("Invalid Account");
		}
		
		return 0;
	}
}

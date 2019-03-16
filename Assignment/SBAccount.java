
public class SBAccount extends Account {
	//double interestRate;
	double amount;
	String type;
	public SBAccount() {
		super();
	}
	public SBAccount(String type, double amount) {
		super();
		//this.interestRate = interestRate;
		this.amount = amount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	//	public double getInterestRate() {
//		return interestRate;
//	}
//	public void setInterestRate(double interestRate) {
//		this.interestRate = interestRate;
//	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	double calculateInterest() {
		// TODO Auto-generated method stub
		if(type.equals("Normal"))
		{
			return (amount*4)/100;
		}
		else if(type.equals("NRI")) {
			return (amount*6)/100;
		}
		else
		{
			System.out.println("Invalid TYPE. Please enter correct values.");
		}
		return 0;
	}
	
}

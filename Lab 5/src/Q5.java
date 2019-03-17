//Validate the age of a person and 
//display proper message by using user defined exception. Age of a person should be above 15.
class MyException1 extends Exception
{
//	MyException1()
//	{
//		System.out.println("Error");
//	}
	public void printMessage()
	{
		System.out.println("Enter a valid age between 0 to 100");
	}
}

public class Q5 {
	private int age;
	public void setAge(int age) throws MyException1
	{
		if(age>0 && age<100)
		{
			this.age=age;
			System.out.println("age is "+ this.age);
		}
		else
		{
			throw new MyException1();
		}
	}
	public static void main(String args[]) throws MyException1
	{
		Q5 q5=new Q5();
		try {
			q5.setAge(45);
			q5.setAge(-1);
			
		} catch (MyException1 e) {
			// TODO Auto-generated catch block
			e.printMessage();
			}
//		q5.setAge(-1);
	}
}

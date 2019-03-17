//The Fibonacci sequence is defined by the following rule.
//The first 2 values in the sequence are 1, 1.
//Every subsequent value is the sum of the 2 values preceding it.
//Write a Java program that uses both recursive and non recursive
//functions to print the nth value of the Fibonacci sequence?
public class Q2 {
	public boolean fibonocii(int a)
	{
		int temp=1;
		int temp1=1;
		int f;
		for(int i=0;i<=a;i++)
		{
			if(a==temp)
			{
				return true;
			}
			else
			{
				f=temp+temp1;
				temp=temp1;
				temp1=f;
			}
		}
		return false;
	}
	public static void main(String args[])
	{
		Q2 q2=new Q2();
		System.out.println(q2.fibonocii(21));
	}
}

package lab1;

import java.util.Scanner;

/**
 * 
 * @author DOLA SAI RAM
 *
 */
public class Calculate {
	public int calculateSum(int n)
	{
		int sum=0;
		for( int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
	public static void main(String args[])
	{
		Calculate cal=new Calculate();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		int temp=sc.nextInt();
		System.out.println(cal.calculateSum(temp));
	}
}

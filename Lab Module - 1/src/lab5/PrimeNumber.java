package lab5;

import java.util.Scanner;

/***
 * 
 * @author DOLA SAI RAM
 *
 */

public class PrimeNumber {
	public void prime(int n)
	{
		int count=0;
		for(int i=2;i<=n;i++)
		{
			for(int j=2;j<=i;j++)
			{
				if(i%j==0)
				{
					count=count+1;
				}
			}
			if(count<=1)
			{
				System.out.println(i+" ");
			}
			count=0;
		}
	}
	public static void main(String args[])
	{
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		PrimeNumber q3=new PrimeNumber();
		q3.prime(no);
	}
}

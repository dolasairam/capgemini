import java.util.Scanner;

//Write a Java program that prompts the user 
//for an integer and then prints out all the prime numbers up to that Integer?
public class Q3 {
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
		Q3 q3=new Q3();
		q3.prime(no);
	}
}

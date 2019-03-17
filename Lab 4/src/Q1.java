import java.util.Scanner;

//Create a method to find the sum of the cubes of the digits of an n digit number
public class Q1 {
	public int sumOfCubes(int a)
	{
		int temp=a;
		int sum=0;
		while(temp!=0)
		{
			int b=temp%10;
			sum=sum+b*b*b;
			temp=temp/10;
		}
		return sum;
	}
	public static void main(String args[])
	{
		Q1 q1=new Q1();
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println(q1.sumOfCubes(a));
	}
}

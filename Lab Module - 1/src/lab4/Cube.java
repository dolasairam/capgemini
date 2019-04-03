package lab4;

import java.util.Scanner;
/***
 * 
 * @author DOLA SAI RAM
 *
 */
public class Cube {
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
		Cube q1=new Cube();
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println(q1.sumOfCubes(a));
	}
}

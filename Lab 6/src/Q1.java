//Write a Java program that reads a line of integers
//and then displays each integer and the sum of all integers. (Use StringTokenizer class)?
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q1 {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str;
		str=sc.nextLine();
		int sum=0;
		StringTokenizer st=new StringTokenizer(str, " ");
		while(st.hasMoreTokens())
		{
			int x=Integer.parseInt(st.nextToken());
			System.out.println(x);
			sum=sum+x;
		}
		System.out.println("sum:"+sum);
	}
}

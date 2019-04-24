package lab6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SumOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			String str;
			System.out.println("Enter the number in line");
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

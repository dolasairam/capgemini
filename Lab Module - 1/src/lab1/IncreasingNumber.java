package lab1;

import java.util.Scanner;

/**
 * 
 * @author DOLA SAI RAM
 *
 */

public class IncreasingNumber {
	
	public boolean checkNumber(int n)
	{
		int temp=n;
		int count=0;
		while(temp!=0)
		{
			temp=temp/10;
			count=count+1;
		}
		int arr[] = new int[count];
		temp=n;
		for(int i=0;temp!=0;i++)
		{
			arr[i]=temp%10;
			temp=temp/10;
		}
		for(int i=0;i<count-1;i++)
		{
			if(arr[i]<arr[i+1])
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String args[])
	{
		IncreasingNumber in = new IncreasingNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a number to check");
		int temp=sc.nextInt();
		System.out.println(in.checkNumber(temp));
	}

}

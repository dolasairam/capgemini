package lab1;

import java.util.Scanner;

/**
 * 
 * @author DOLA SAI RAM
 *
 */
public class Power {
	
	public boolean checkNumber(int n)
	{
		int temp=2;
		
		for(int i=1;n>=temp;i++)
		{
			temp=(int)Math.pow(2,i);
			if(temp==n)
			{
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Power po = new Power();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		int temp=sc.nextInt();
		System.out.println(po.checkNumber(temp));

	}

}

package lab1;

import java.util.Scanner;

/**
 * 
 * @author DOLA SAI RAM
 *
 */
public class DifferenceSquare {
	
	public int calculateDifference(int n)
	{
		int sumOfSquares=0;
		
		for(int i=1;i<=n;i++)
		{
			sumOfSquares=sumOfSquares+(int)Math.pow(i, 2);
		}
		System.out.println(sumOfSquares);
		
		int squareOfSum=0;
		int temp=0;
		for(int i=1;i<=n;i++)
		{
			temp=temp+i;
		}
		squareOfSum=(int)Math.pow(temp, 2);
		System.out.println(squareOfSum);
		
		return sumOfSquares - squareOfSum;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DifferenceSquare cal = new DifferenceSquare();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		int temp=sc.nextInt();
		System.out.println(cal.calculateDifference(temp));
	}

}

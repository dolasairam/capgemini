package lab3;

import java.util.Arrays;

/**
 * 
 * @author DOLA SAI RAM
 *
 */
public class Q3 {
	public int[] getSorted(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			String str=""+a[i];
			StringBuilder str1=new StringBuilder(str);
			str=str1.reverse().toString();
			a[i]=Integer.parseInt(str);
		}
		Arrays.sort(a);
		return a;
		
	}
	public static void main(String args[])
	{
		int[] a= {17,27,37,47,57,57,67,28};
		Q3 q3 = new Q3();
		a=q3.getSorted(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}

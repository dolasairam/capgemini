import java.util.Arrays;

//Create a method which accepts an integer array,
//reverse the numbers in the array and returns the resulting array in sorted order
public class Q3 {
	public int[] reverse(int a[])
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
		a=q3.reverse(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
}

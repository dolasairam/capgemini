import java.util.*;;

//Create a method that can accept an array of 
//String objects and sort in alphabetical order.
//The elements in the left half should be completely in upper case and the
//elements in the right half should be completely in lower case. Return the resulting array.
public class Q2 {
	public String[] accept(String a[])
	{	
		Arrays.sort(a);
		if(a.length%2==0)
		{	
		for(int i=0;i<(a.length)/2;i++)
		{
			a[i]=a[i].toUpperCase();
		}
		for(int i=(a.length/2)+1;i<a.length;i++)
		{
			a[i]=a[i].toLowerCase();
		}
		}
		else
		{
			for(int i=0;i<(a.length)/2+1;i++)
			{
				a[i]=a[i].toUpperCase();
			}
			for(int i=(a.length/2)+2;i<a.length;i++)
			{
				a[i]=a[i].toLowerCase();
			}
		}
		return a;
	}
	public static void main(String args[])
	{
		Q2 q2=new Q2();
		String[] a= {"sairam","yoga","satyam","himanshu","abdc"};
		String[] b=q2.accept(a);
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}
}

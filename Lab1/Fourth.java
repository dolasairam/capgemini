// Create a method to check if a number is a power of two or not 
import java.lang.*;
class Power
{
	boolean checkNumber(int n)
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
}

/*class Power1
{
	boolean checkNumber(int n)
	{
		int temp=n;
		while(temp!=0)
		{
			if(temp%2!=0)
			{
				return false;
			}
			else
			{
				temp=temp/2;
			}
		}
		return true;
	}
}*/

class Fourth
{
	public static void main(String args[])
	{
		Power p=new Power();
		System.out.println(p.checkNumber(16));
/*		Power1 p1=new Power1();
		System.out.println(p1.checkNumber(16));
		*/
	}
}
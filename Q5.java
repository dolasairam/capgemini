//Write a program to find weather a number is Prime or not.

class Prime
{
	boolean checkPrime(int n)
	{
	int count=0;
		for (int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				count=count+1;
			}
		}
		if(count>=2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class Q5
{
	public static void main(String[] args)
	{
		Prime p=new Prime();
		System.out.println(p.checkPrime(10));
		System.out.println(p.checkPrime(17));
	}
}
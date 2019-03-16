class Natural
{
	int sum=0;
	
	int calculateSum(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
}

class Main
{
	public static void main(String ags[])
	{
		Natural nat=new Natural();
		System.out.println(nat.calculateSum(5));
	}
}
//Create a method to check if a number is an increasing number 

class Increase
{
	boolean checkNumber(int n)
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
			//System.out.println(arr[i]);
			if(arr[i]<arr[i+1])
			{
				return false;
			}
		}
		return true;
	}
}

class Third
{
	public static void main(String args[])
	{
		Increase in=new Increase();
		System.out.println(in.checkNumber(134468));
	}
}
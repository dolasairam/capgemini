//Write a program to calculate average of the n number using a separate function other than main. 

class Average
{
	int avg(int a[])
	{
		int sum=0;
		int avg=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		avg=sum/a.length;
		return avg;
	}
	public static void main(String args[])
	{
		Average a= new Average();
		int n[]={12,30,40,89};
		System.out.println(a.avg(n));
	}
}
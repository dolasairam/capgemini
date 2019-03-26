
class Fibonociii {
	public int fibonocii(int a)
	{
		int[] arr = new int[a];
		int temp=1;
		int temp1=1;
		int f;
		arr[0]=1;
		for(int i=1;i<a;i++)
		{
				f=temp+temp1;
				temp=temp1;
				temp1=f;
				arr[i]=temp;
		}
		return arr[a-1];
	}
	int fib(int n) 
    	{ 
    		if (n <= 1) 
       			return n; 
    		return fib(n-1) + fib(n-2); 
   	 }
	
	public static void main(String args[])
	{
		Fibonociii q2=new Fibonociii();
		int arr=q2.fibonocii(5);
		int arr1=q2.fib(5);
		System.out.println(arr);
		System.out.println(arr1);
	
		
	}
}
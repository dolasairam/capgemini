package lab3;
/**
 * 
 * @author DOLA SAI RAM
 *
 */
public class SecondSmallestNo {
	
	public int secondSmallest(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[1];
		
	}
	public static void main(String args[])
	{
		int arr[]={12,33,4,9,5};
		SecondSmallestNo ssn=new SecondSmallestNo();
		System.out.println(ssn.secondSmallest(arr));
	}

}

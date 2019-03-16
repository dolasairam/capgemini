class Sort
{
	public static void main(String args[])
	{
		for(int i=0;i<args.length;i++)
		{
			for(int j=0;j<args.length-1;j++)
			{
				if(Integer.parseInt(args[i])<Integer.parseInt(args[j]))
				{
					int temp=Integer.parseInt(args[i]);
					args[i]=args[j];
					args[j]=""+temp;
				}
			}
		}
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
	}
}
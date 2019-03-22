
public class Q5 {
	public boolean acceptString(String str)
	{
		str=str.toUpperCase();
		char c[]=str.toCharArray();
		for(int i=0;i<c.length-1;i++)
		{
			if(c[i]>c[i+1])
				{
					return false;
				}
		}
		return true;
	}
	public static void main(String args[])
	{
		Q5 q5=new Q5();
		//System.out.println(q5.acceptString("ANT"));
		if(q5.acceptString("Amit"))
				{
			System.out.println("The String is a Positive String");
				}
		else
		{
			System.out.println("The String is a Negative String");
		}
			
	}
}

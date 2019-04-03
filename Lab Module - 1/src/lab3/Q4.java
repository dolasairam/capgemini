package lab3;

/**
 * 
 * @author DOLA SAI RAM
 *
 */
public class Q4 {
	public void noOfcharater(char[] c)
	{
		String str=new String(c);
		while(str.length()>0)
		{
			char ch=str.charAt(0);
			System.out.println(ch+" "+countChar(str,ch));
			str=str.replace(""+ch, "");
		}
	}
	public int countChar(String str,char ch)
	{
		int count=0;
		while(str.indexOf(ch)!=-1)
		{
			count++;
			str=str.substring(str.indexOf(ch)+1);
		}
		return count;
		
	}
	public static void main(String args[])
	{
		char[] ch={'a','p','l','e','p'};
		Q4 q4=new Q4();
		q4.noOfcharater(ch);
	}

}

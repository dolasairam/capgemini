package lab7;

import java.util.HashMap;
import java.util.Map;
/***
 * 
 * @author DOLA SAI RAM
 *
 */
public class Occurence {
	public Map<String,Integer> countCharacter(char[] a)
	{
		Map<String,Integer> m=new HashMap<String,Integer>();
		for(int i=0;i<a.length;i++)
		{
			String str=""+a[i];
			if(m.containsKey(str))
			{
				int temp=m.get(str);
				m.put(str, temp+1);
			}
			else
			{
				m.put(str,1);
			}
		}
		return m;
	}
	
	public static void main(String args[])
	{
		char c[]={'a','b','d','a','a','a'};
		Occurence q2=new Occurence();
		System.out.println(q2.countCharacter(c));
	}
	
}

import java.util.HashMap;
import java.util.Map;

//Create a method that accepts a character array
//and count the number of times each character is present 
//in the array. Add how many times each character is present
//to a hash map with the character as key and the repetitions
//count as value


public class Q2 {
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
		Q2 q2=new Q2();
		System.out.println(q2.countCharacter(c));
	}
}

package lab7;

import java.util.HashMap;
import java.util.Map;
/**
 * 
 * @author DOLA SAI RAM
 *
 */
public class CollectionsQ3 {
	public Map<Integer,Integer> accepts(int a[])
	{
		Map<Integer,Integer> m=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(!m.containsKey(a[i]))
			{
				m.put(a[i], a[i]*a[i]);
			}
		}
		return m;
	}
	public static void main(String args[])
	{
		CollectionsQ3 q3=new CollectionsQ3();
		int a[]= {1,2,5,4};
		System.out.println(q3.accepts(a));
	}

}

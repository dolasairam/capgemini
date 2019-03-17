import java.util.*;
import java.util.Collections.*;

public class Q1{
	public void getValues(HashMap<String,Integer> m)
	{
		List<String> list=new ArrayList<String>(m.keySet());
		System.out.println(list);
		Collections.sort(list);
		for(String s:list)
			System.out.println(s+"\t"+m.get(s));
		
	}
	public static void main(String args[])
	{
		Q1 s=new Q1();
		HashMap<String,Integer> m=new HashMap<String,Integer>();
		m.put("A",1);
		m.put("AA",3);
		m.put("B",2);
		System.out.println(m);
		s.getValues(m);
	}
}

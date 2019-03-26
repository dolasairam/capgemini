import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	public static void main(String args[])
	{
		Map<Cards,Integer> m=new HashMap<Cards, Integer>();
		int n;
		System.out.println("Enter the no of Card");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int i=1;
		Cards cards;
		while(n!=0)
		{
			
			System.out.println("Enter the Card "+i);
			String key=sc.next();
			Integer value=sc.nextInt();
			cards=new Cards(key,value);
			m.put(cards, i);
			i++;
			n--;
		}
		//Distinct Symbols
		Set<Cards> distinct = new TreeSet<Cards>();
		distinct=m.keySet();
		Set<String> cardKey=new TreeSet<String>();
		for(Cards c:distinct)
		{
			Cards c1=c;
			cardKey.add(c1.getKey());
		}
		System.out.println("Unique Cards are:"+cardKey);
		
		for(String str:cardKey)
		{
			i=0;
			n=0;
			System.out.println("Cards in "+ str +" Symbol");
			for(Cards c:distinct)
			{
				
				if(c.getKey().contains(str))
				{
					System.out.println(c);
					i++;
					n=c.getValue()+n;
				}
				
			}
			System.out.println("Number of cards :"+i);
			System.out.println("Sum of Numbers :"+n);
		}
	}
}

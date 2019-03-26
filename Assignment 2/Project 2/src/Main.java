//Write a Program to perform the basic operations like insert, delete, display 
//and search in list. List contains
//String object items where these operations are to be performed.

import java.util.*;
public class Main {
	public static void main(String ars[])
	{
		List<String> list=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		int temp;
		do
		{
			System.out.println("Sample Input and Output :\n1. Insert\n2. Search\n3. Delete\n4. Display\n5. Exit");
			System.out.println("Enter your choice :");
			temp=sc.nextInt();
			switch (temp) {
			case 1:
				System.out.println("Enter the item to be inserted:");
				String str=sc.next();
				list.add(str);
				break;
			case 2:
				System.out.println("Enter the item to search :");
				str=sc.next();
				if(list.contains(str))
				{
					System.out.println("Item found in the list.");
				}
				else
				{
					System.out.println("Item not found in the list.");
				}
				break;
			case 3:
				System.out.println("Enter the item to delete :");
				str=sc.next();
				if(list.contains(str))
				{
					list.remove(str);
				}
				else
				{
					System.out.println("Item not found in the list.");
				}
				break;
			case 4:
				System.out.println("The Items in the list are :");
				for(String s:list)
				{
					System.out.println(s);
				}
				break;
			case 5:
				System.out.println("Bye--Bye");
				break;
			}
		}while(temp!=5);
	}

}

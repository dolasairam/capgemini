import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
public class UniqueSet {
	public static void main(String args[])
	{
		HashSet<Box> hs=new HashSet<Box>();
		System.out.println("Enter the number of Box");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		for(int i=0;i<no;i++)
		{
			System.out.println("Enter the Box "+ i +" details");
			System.out.println("Enter the Length:");
			double length=sc.nextDouble();
			System.out.println("Enter the width:");
			double width=sc.nextDouble();
			System.out.println("Enter the height");
			double height=sc.nextDouble();
			double volume =length*width*height;
			hs.add(new Box(length,width,height,volume));
			
		}
		System.out.println(hs);
	}

}

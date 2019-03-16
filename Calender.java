//Write a program using Switch–case to print number of days in a month. For the month of February   check for leap year and calculate. 
import java.util.*;
class Calender
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int year;
		int month;
		System.out.println("Enter the year ");
		year=sc.nextInt();
		System.out.println("Enter the month");
		month=sc.nextInt();
		switch(month)
		{
			case 1:
				System.out.println("Jan:31");
				break;
			case 2:
				if(year%4==0)
					if(year%100==0)
						if(year%400==0)
							System.out.println("leap year feb:29");
						else
							System.out.println("Not leap Year feb:28");
				break;
			case 3:
				System.out.println("March:31");
				break;
			case 4:
				System.out.println("April:30");
				break;
			case 5:
				System.out.println("May:31");
				break;
			case 6:
				System.out.println("June:30");
				break;
			case 7:
				System.out.println("July:31");
				break;
			case 8:
				System.out.println("Aug:31");
				break;
			case 9:
				System.out.println("sep:30");
				break;
			case 10:
				System.out.println("Out:30");
				break;
			case 11:
				System.out.println("Nov:30");
				break;
			case 12:
				System.out.println("Dec:30");
				break;
		}
	}
}
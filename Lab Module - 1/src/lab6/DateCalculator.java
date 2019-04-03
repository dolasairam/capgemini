package lab6;

import java.text.ParseException;
/**
 * @author DOLA SAI RAM
 */
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateCalculator {
	public void acceptDate(Date d, Date d2)
	{
		if(d.compareTo(d2)>0)
		{
			long l=d.getTime()-d2.getTime();
			float f=(l)/(1000*60*60*24);
			System.out.println("NO of days in between "+f);
			System.out.println("No of years in between "+(int)(f/365));
			System.out.println("No of months in between "+((f/365)*12));
			
		}
	}
	
	public static void main(String args[])
	{
		Date current=new Date();
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		DateCalculator q6=new DateCalculator();
		System.out.println("Enter the date in the format: dd-MM-yyyy");
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		String str=sc.next();
		Date d =new Date();
		try {
			d=sdf.parse(str);
			System.out.println(d.getTime());
			System.out.println(current.getTime());
			q6.acceptDate(current, d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}

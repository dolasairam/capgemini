package lab6;

import java.util.Scanner;

public class JobSeekerMain {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			JobSeeker js=new JobSeeker();
			String str;
			System.out.println("username:");
			Scanner sc=new Scanner(System.in);
			str=sc.next();
			StringBuffer sb=new StringBuffer(str);
			System.out.println(js.setUserName(sb));
			
		}
}

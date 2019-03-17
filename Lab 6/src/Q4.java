import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Write a Java program that reads on file name from the user, 
//then displays information about whether the file exists, 
//whether the file is readable, whether the file is writable, 
//the type of file and the length of the file in bytes?  
public class Q4 {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file name:");
		String str=sc.next();
		File f=new File(str);
		try {
			//f.createNewFile();
			FileReader fr=new FileReader(f);
			if(f.isFile())
			{
				System.out.println("The file is a existing file");
			}
			f.setReadable(false,true);
			if(f.canRead())
			{
				System.out.println("The file is a readable file");
			}
			FileWriter fw = new FileWriter(f);
//			fw.write("Hello java");
//			fw.flush();
//			String str1="";
//			BufferedReader br=new BufferedReader(fr);
//			while((str=br.readLine())!=null)
//			{
//				System.out.println(str);
//			}
			if(f.canWrite())
			{
				System.out.println("The file can be written");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File is not found");
		}
		catch(Exception e)
		{}
	}
}

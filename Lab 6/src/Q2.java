import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

//Write a Java program that reads a file 
//and displays the file on the screen, with a line number before each line?
public class Q2 {
	public static void main(String args[])
	{
		File f=new File("d:Main.java");
		try {
			FileReader fr=new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			String str="";
			int count=1;
			while((str=br.readLine())!=null)
					{
						System.out.println(count+" "+str);
						count++;
					}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

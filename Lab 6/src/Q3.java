import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.StringTokenizer;

//Write a Java program that displays the number of characters, lines and words in a text? 
public class Q3 {
	public static void main(String args[])
	{
		File f=new File("D:/Main.java");
		try {
			FileReader fr=new FileReader(f);
			int a=0;
			int count=0;
			while((a=fr.read())!=-1)
			{
				count++;
			}
			System.out.println("No of character:"+count);
			BufferedReader br=new BufferedReader(fr);
			String str="";
			count=1;
			while((str=br.readLine())!=null)
			{
				count++;
			}
			System.out.println("NO of Line in file:"+count);
			FileReader fr1=new FileReader(f);
			count=0;
			str="";
			BufferedReader br1=new BufferedReader(fr1);
			while((str=br1.readLine())!=null) {
				System.out.println("line"+" "+str);
				StringTokenizer st=new StringTokenizer(str," ");
				while(st.hasMoreTokens())
				{
					count++;
					System.out.println(count+" "+st.nextToken());
				}
			}
			System.out.println("No of the words file:"+count);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

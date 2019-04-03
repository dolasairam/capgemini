package lab8;

import java.io.File;

/**
 * 
 * @author DOLA SAI RAM
 *
 */
public class FileProgram {
	public static void main(String args[])
	{
		CopyDataThread cdt1=new CopyDataThread(new File("d://Main.java"),new File("d://s.txt"));
		Thread t=new Thread(cdt1,"CopyData");
		t.start();
	}
}

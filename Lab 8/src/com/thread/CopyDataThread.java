package com.thread;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//•	This class will be designed to copy the content
//from one file “source.txt ” to another file “target.txt”
//and after every 10 characters copied,
//“10 characters are copied” message  will be shown to user.
//(Keep delay of 5 seconds after every 10 characters  read.)
public class CopyDataThread extends Thread {
	
	File f;
	File f1;
	public CopyDataThread(File f, File f1) {
		// TODO Auto-generated constructor stub
		this.f=f;
		this.f1=f1;
	}
	public void run()
	{
		try {
			FileReader fr=new FileReader(f);
			FileWriter fw=new FileWriter(f1,true);
			int a=0;
			int count=0;
			int temp=0;
			while((a=fr.read())!=-1)
			{
				fw.write(a);
				count++;
				fw.flush();
				temp++;
				if(count==10)
				{
					System.out.println("10 characters are copied");
					Thread.sleep(5000);
					count=0;
				}
			}
			System.out.println(temp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


package com.thread;

import java.io.File;

//•	Create another class “FileProgram.java” which will
//create above thread. Pass required File Stream classes
//to  CopyDataThread constructor and implement the above functionality
public class FileProgram extends Thread{
	public static void main(String args[])
	{
		CopyDataThread cdt1=new CopyDataThread(new File("d://Main.java"),new File("d://s.txt"));
		Thread t=new Thread(cdt1,"CopyData");
		t.start();
	}
}

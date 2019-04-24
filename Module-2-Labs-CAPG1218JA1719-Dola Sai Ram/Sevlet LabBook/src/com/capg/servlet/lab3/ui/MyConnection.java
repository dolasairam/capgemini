package com.capg.servlet.lab3.ui;


import java.sql.Connection;
import java.sql.DriverManager;
/**
**
**@author : Dola Sai Ram
**
**/


public class MyConnection {
	private static Connection con;
	static
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","hr","hr");
			System.out.println("Connected!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static Connection getConnection()
	{
		return con;
	}
}

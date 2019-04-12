package com.capgemini.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccountUtility {
	private static Connection com;
	static
	{
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			com=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			System.out.println("connected");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} 
	}
	
	public static Connection getConnection()
	{
		return com;
	}

}

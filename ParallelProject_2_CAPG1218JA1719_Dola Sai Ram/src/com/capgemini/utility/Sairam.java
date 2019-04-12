package com.capgemini.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.capgemini.bean.Account;

public class Sairam {
	public static Connection com;
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Account account = new Account();
		System.out.println("First Name: ");
		String str = sc.nextLine();
		str = sc.nextLine();
		account.setFirstName(str);
		System.out.println("Last Name: ");
		String lastName=sc.nextLine();
		account.setLastName(lastName);
		System.out.println("Father's Name: ");
		String fatherName=sc.nextLine();
		account.setFathersName(fatherName);
		System.out.println("Mother's Name: ");
		String motherName=sc.nextLine();
		account.setMothersName(motherName);
		System.out.println("Address:");
		String address=sc.nextLine();
		account.setAddress(address);
		System.out.println("Password");
		String password = sc.next();
		System.out.println("Re-enter Password:");
		String rePassword = sc.next();
		System.out.println("Enter the account id");
		Long accoundId=sc.nextLong();
		account.setAccountId(accoundId);
		Sairam sai = new Sairam();
		
		System.out.println(sai.addAccount(account));
		
	}
	public String addAccount(Account a) {
		try {
			PreparedStatement ps = com.prepareStatement("insert into account values(?, ?, ?,"
												+ "	?, ?, ?, ?, ?)");
			ps.setString(1, a.getFirstName());
			ps.setString(2, a.getLastName());
			ps.setString(3, a.getFathersName());
			ps.setString(4, a.getMothersName());
			ps.setLong(5, a.getAccountId());
			ps.setString(6, a.getPassword());
			ps.setString(7, a.getAddress());
			ps.setDouble(8, a.getBalance());
			int count = ps.executeUpdate();
			System.out.println(count);
			if(count>0)
			{
				com.commit();
				return "success";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Not added";
	}

}

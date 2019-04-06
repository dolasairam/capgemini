package com.capgemini.jdbc.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.capgemini.jdbc.beam.Author;
import com.capgemini.jdbc.beam.Book;
/**
 * 
 * @author DOLA SAI RAM
 *
 */
public class AuthorUtility {
	static Connection com;
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
	
	public String addData(Author author)
	{
		try {
//			System.out.println("database");
			System.out.println(author.getAuthorFirstName());
			PreparedStatement ps1= com.prepareStatement("insert into author values(sequence_2.nextval,?,?,?,?)");
			ps1.setString(1, author.getAuthorFirstName());
			ps1.setString(2,author.getAuthorMiddleName());
			ps1.setString(3, author.getAuthorMiddleName());
			ps1.setLong(4,author.getAuthorPhoneNumber());
			int a = ps1.executeUpdate();
			if(a>0)
			{
				com.commit();
				return "success";
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "added";
	}
	
	public String addBook(Book book)
	{
		try {
//			System.out.println("database");
			PreparedStatement ps = com.prepareStatement("insert into books values(sequence_3.nextval,?,?,?)");
			ps.setString(1, book.getTitle());
			ps.setInt(2, book.getPrice());
			ps.setInt(3, book.getAuthorId());
			int count = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "added";
	}
	
	public ResultSet authors()
	{
		PreparedStatement ps;
		ResultSet rs = null;
		try {
			ps = com.prepareStatement("select AUTHORID,  FIRSTNAME from author order by firstname");
			rs= ps.executeQuery();
//			Statement start = com.createStatement();
//			rs = start.executeQuery("select * from author");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	public ResultSet bookAuthor(int id)
	{
		PreparedStatement ps;
		ResultSet rs = null;
		try
		{
//			System.out.println("database");
			ps = com.prepareStatement("select b.authorid, b.title , a.firstname from books b inner join author a on b.authorid = a.authorid where a.authorid=?" );
			ps.setInt(1,id);
			rs=ps.executeQuery();
//			System.out.println("database1");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return rs;
	}
	
	public ResultSet updatingOnAuthorName(String name)
	{
		PreparedStatement ps;
		ResultSet rs = null;
		try
		{
//			System.out.println("database");
			ps = com.prepareStatement("select a.firstname, b.title , b.price from books b inner join author a on b.authorid = a.authorid where a.authorid="
					+ "(select authorid from author where lower(firstname)=lower(?))");
			ps.setString(1,name);
			rs=ps.executeQuery();
//			System.out.println("database1");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return rs;
	}
}

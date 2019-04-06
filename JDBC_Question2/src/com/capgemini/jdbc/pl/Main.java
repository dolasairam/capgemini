package com.capgemini.jdbc.pl;

import java.sql.ResultSet;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

import com.capgemini.jdbc.beam.Author;
import com.capgemini.jdbc.beam.Book;
import com.capgemini.jdbc.service.ServiceClass;

/**
 * 
 * @author DOLA SAI RAM
 *
 */
public class Main {

	public static void main(String args[])
	{
		ServiceClass service;
		System.out.println("1. To add the book in the dataBase ");
		System.out.println("2. To add a new Author to the database");
		System.out.println("3. To display all the books of the Author");
		System.out.println("4. Getting the price of the books when author name is entered");
		Book book;
		Author author;
		Scanner sc = new Scanner(System.in);
		int count;
		try {
			count = sc.nextInt();
		switch(count)
		{
		case 1:
			book=new Book();
			System.out.println("Enter the Book Name");
			String title = sc.nextLine();
			title = sc.nextLine();
			book.setTitle(title);
			System.out.println("Enter the Price");
			int price = sc.nextInt();
			book.setPrice(price);
			service = new ServiceClass();
			ResultSet rs = service.author();
			while(rs.next())
			{
				System.out.println("Author id: " +rs.getInt(1)+ "\t" + "Name : " +rs.getString(2));
			}
			System.out.println("If the Author exits then enter y else n");
			String str = sc.next();
			if(str.equalsIgnoreCase("y"))
			{
				System.out.println("enter the author id");
				int id = sc.nextInt();
				if(service.checkValid(id))
				{
					book.setAuthorId(id);
					service.addBook(book);
				}
				
				else
				{
					System.out.println("you enter invalid data");
				}
			}
			else
			{
				System.out.println(author());
			}
			break;
		case 2:
//			service = new ServiceClass();
			System.out.println(author());
//			ResultSet rs1 = service.author();
//			while(rs1.next())
//			{
//				System.out.println("Author id: " +rs1.getInt(1)+ "\t" + "Name : " +rs1.getString(2));
//			}
		case 3:
			service = new ServiceClass();
			rs = service.author();
			while(rs.next())
			{
				System.out.println("Author id: " +rs.getInt(1)+ "\t" + "Name : " +rs.getString(2));
			}
			System.out.println("Enter the author id to get books of the author");
			int id = sc.nextInt();
			ResultSet rs1=service.getAuthorBooks(id);
			while(rs1.next())
			{
				System.out.println("Author id: "+rs1.getInt(1)+"\t"+rs1.getString(2)+"\t"+rs1.getString(3));
			}
			break;
		case 4:
			service = new ServiceClass();
			System.out.println("Enter the author id to get books of the author");
			String name = sc.next();
			ResultSet rs2=service.updatingOnAuthorName(name);
			while(rs2.next())
			{
				System.out.println("Author id: "+rs2.getString(1)+"\t"+rs2.getString(2)+"\t"+rs2.getInt(3));
			}
		}
		}
		catch(Exception e)
		{
			System.out.println(e.getStackTrace());
		}
	}
	
	public static String author()
	{
		Author author =new Author();
		Scanner sc = new Scanner(System.in);
		System.out.println("First Name:");
		String firstName = sc.next();
		author.setAuthorFirstName(firstName);
		System.out.println("Middle Name:");
		String authorMiddleName=sc.nextLine();
		authorMiddleName=sc.nextLine();
		author.setAuthorMiddleName(authorMiddleName);
		System.out.println("Last Name:");
		String authorLastName=sc.nextLine();
		author.setAuthorLastName(authorLastName);
		System.out.println("Enter the phno");
		Long authorPhoneNumber = sc.nextLong();
		author.setAuthorPhoneNumber(authorPhoneNumber);
		ServiceClass service = new ServiceClass();
		return service.addAuthor(author);
	}

}

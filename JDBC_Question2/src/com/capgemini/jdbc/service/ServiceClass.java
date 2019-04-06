package com.capgemini.jdbc.service;

import java.sql.ResultSet;
import java.util.List;

import com.capgemini.jdbc.beam.Author;
import com.capgemini.jdbc.beam.Book;
import com.capgemini.jdbc.dao.DaoClass;
import com.capgemini.jdbc.utility.AuthorUtility;

public class ServiceClass implements ServiceInterface {

	DaoClass dc;
	@Override
	public String addAuthor(Author a) {
		if(a.getAuthorFirstName().length()>=4)
		{
			dc = new DaoClass();
			System.out.println("Service");
			return dc.addAuthor(a);
		}
		return "Invalid";
	}

	@Override
	public String addBook(Book b) {
		dc=new DaoClass();
		String str = null;
		if(b.getPrice()>0)
		{
			System.out.println("service");
			str = dc.addBook(b);
			return str;
		}
		return "invalid";
	}
	
	public ResultSet author()
	{
		dc=new DaoClass();
		return dc.author();
	}
	
	public boolean checkValid(int value)
	{
		dc=new DaoClass();
		List<Integer> list=dc.authorIds();
		if(list.contains(value))
		{
			return true;
		}
		return false;
	}
	
	public ResultSet getAuthorBooks(int id)
	{
		dc = new DaoClass();
		if(checkValid(id))
		{
			return dc.getAuthorsBooks(id);
		}
		else
			
		{
			try
			{
				throw new AuthorException();
			}
			catch(AuthorException e)
			{
				e.notFound();
			}
		}
		return null;
	}
	public ResultSet updatingOnAuthorName(String name)
	{
		dc=new DaoClass();
		return dc.updatingOnAuthorName(name);
	}

}

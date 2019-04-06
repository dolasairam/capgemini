package com.capgemini.jdbc.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import com.capgemini.jdbc.beam.Author;
import com.capgemini.jdbc.beam.Book;
import com.capgemini.jdbc.utility.AuthorUtility;

public class DaoClass implements DaoInterface {

	AuthorUtility au;
	@Override
	public String addAuthor(Author a) {
		au=new AuthorUtility();
		
		if(au.addData(a).equalsIgnoreCase("success"))
		{
			return "added";
		}
//		System.out.println("dao");
		return "not added";
		
	}

	@Override
	public String addBook(Book b) {
		au=new AuthorUtility();
		au.addBook(b);
		System.out.println("dao");
		return "added";
	}
	
	public ResultSet author()
	{
		au = new AuthorUtility();
		return au.authors();
	}
	
	public List<Integer> authorIds()
	{
		ResultSet rs = author();
		List<Integer> list=new ArrayList<Integer>();
		try {
			while(rs.next())
			{
				list.add(rs.getInt(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	public ResultSet getAuthorsBooks(int id)
	{
		au = new AuthorUtility();
		return au.bookAuthor(id);
	}

	public ResultSet updatingOnAuthorName(String name)
	{
		au=new AuthorUtility();
		return au.updatingOnAuthorName(name);
	}
}

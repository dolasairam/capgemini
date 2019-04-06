package com.capgemini.jdbc.dao;

import com.capgemini.jdbc.beam.Author;
import com.capgemini.jdbc.beam.Book;

public interface DaoInterface {
	
	public String addAuthor(Author a);
	public String addBook(Book b);

}

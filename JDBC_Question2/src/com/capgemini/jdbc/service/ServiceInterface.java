package com.capgemini.jdbc.service;

import com.capgemini.jdbc.beam.Author;
import com.capgemini.jdbc.beam.Book;

public interface ServiceInterface {
	
	public String addAuthor(Author a);
	public String addBook(Book b);

}

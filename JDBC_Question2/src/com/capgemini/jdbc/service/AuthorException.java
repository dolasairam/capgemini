package com.capgemini.jdbc.service;

public class AuthorException extends Exception{
	
	public void notFound()
	{
		System.out.println("The id is not found in database");
	}

}

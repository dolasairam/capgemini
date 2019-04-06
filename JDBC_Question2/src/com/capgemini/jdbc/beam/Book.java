package com.capgemini.jdbc.beam;

public class Book {
	
	private int isbn;
	private String title;
	private int price;
	private int authorId;
	public Book() {
		super();
	}
	public Book(int isbn, String title, int price, int authorId) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.price = price;
		this.authorId = authorId;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	
	

}

package com.capgemini.jdbc.beam;

public class Author {
	
	private int authorId;
	private String authorFirstName;
	private String authorMiddleName;
	private String authorLastName;
	private Long authorPhoneNumber;
	
	
	public Author() {
		super();
	}


	public Author(int authorId, String authorFirstName, String authorMiddleName, String authorLastName,
			Long authorPhoneNumber) {
		super();
		this.authorId = authorId;
		this.authorFirstName = authorFirstName;
		this.authorMiddleName = authorMiddleName;
		this.authorLastName = authorLastName;
		this.authorPhoneNumber = authorPhoneNumber;
	}


	public int getAuthorId() {
		return authorId;
	}


	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}


	public String getAuthorFirstName() {
		return authorFirstName;
	}


	public void setAuthorFirstName(String authorFirstName) {
		this.authorFirstName = authorFirstName;
	}


	public String getAuthorMiddleName() {
		return authorMiddleName;
	}


	public void setAuthorMiddleName(String authorMiddleName) {
		this.authorMiddleName = authorMiddleName;
	}


	public String getAuthorLastName() {
		return authorLastName;
	}


	public void setAuthorLastName(String authorLastName) {
		this.authorLastName = authorLastName;
	}


	public Long getAuthorPhoneNumber() {
		return authorPhoneNumber;
	}


	public void setAuthorPhoneNumber(Long authorPhoneNumber) {
		this.authorPhoneNumber = authorPhoneNumber;
	}
	
}

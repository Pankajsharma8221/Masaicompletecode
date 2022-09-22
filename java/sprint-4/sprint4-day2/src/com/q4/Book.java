package com.q4;

public class Book {
	private int isbn;
	private String bookName;
	private String authorName;
	
	public Book() {
		
	}
	public Book(int isbn, String bookName, String authorName) {
		super();
		this.isbn = isbn;
		this.bookName = bookName;
		this.authorName = authorName;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
}

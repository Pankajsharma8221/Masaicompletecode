package com.q4;

import java.util.ArrayList;
import java.util.List;


public class Library {
	
	public List<Book> bookList = new ArrayList<>();
	
	public void addBook(Book book) {
		bookList.add(book);
	}
	
	public boolean isEmpty() {
		return bookList.isEmpty();
	}
	
	public List<Book> viewAllBooks(){
		return bookList;
	}
	
	public List<Book> viewBooksByAuthor(String author){
		List<Book> book=new ArrayList<>();
		for(Book b:bookList) {
			String bk=b.getAuthorName();
			if(bk.toUpperCase().equals(author.toUpperCase())) {
				book.add(b);
			}
			
		}
		return book;
	}

	public int countNoOfBooks(String bookName) {
		int co=0;
		for(Book b:bookList) {
			String bk=b.getBookName();
			if(bk.toUpperCase().equals(bookName.toUpperCase())) {
				co++;
			}
		}
		return co;
	}
	
	
}

package com.q4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		Library l=new Library();
		
		while(true) {
			System.out.println("1. Add Book");
			System.out.println("2. Display all book details");
			System.out.println("3. Search book by author");
			System.out.println("4. Count Number of book by book name");
			System.out.println("5. Exit");
			
			Integer c=sc.nextInt();
			
			
			if(c.equals(1)) {
				
				System.out.println("Enter the isbn no: ");
				int isbn=sc.nextInt();
				
				System.out.println("Enter the book name");
				String name=sc.next();
				
				System.out.println("Enter the author name");
				String authorName=sc.next();
				
				Book b=new Book(isbn,name,authorName);
				l.addBook(b);
				
				System.out.println("Book added Successfully");
				
			}
			if(c.equals(2)) {
				
				List<Book> book=l.viewAllBooks();
				
				for(Book b:book) {
					System.out.println("Book isby no: "+b.getIsbn());
					System.out.println("Book Name: "+b.getBookName());
					System.out.println("Author Name: "+b.getAuthorName());
					System.out.println("==============================");
				}
			}
			
			if(c.equals(3)){
				System.out.println("Enter the Author name");
				
				String aname=sc.next();
				
				List<Book> abook=l.viewBooksByAuthor(aname);
				
				if(abook.size()>0) {
					for(Book b:abook) {
						System.out.println("Book isby no: "+b.getIsbn());
						System.out.println("Book Name: "+b.getBookName());
						System.out.println("Author Name: "+b.getAuthorName());
						System.out.println("==============================");
					}
				}else {
					System.out.println("Non of the book publish bt the "+aname);
				}
				
			}
			if(c.equals(4)) {
				
			System.out.println("Enter the book name");
			
			String bname=sc.next();
			
			int counting=l.countNoOfBooks(bname);
				
				System.out.println("No of book by book name "+bname+" is "+counting);
				
			}		
			
			if(c.equals(5)) {
				System.out.println("Thank You..!!");
				break;
			}
			
			
			
			
		}
		
		
	}
}
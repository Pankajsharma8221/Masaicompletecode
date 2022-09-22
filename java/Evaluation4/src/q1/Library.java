package q1;

import java.util.HashSet;

public class Library {
	public static void main(String[] args) {
		HashSet<Book> booksCollection =new HashSet<>();
		booksCollection.add(new Book(1,"Name1","Author1"));
		booksCollection.add(new Book(2,"Name2","Author1"));
		booksCollection.add(new Book(3,"Name1","Author1"));
		booksCollection.add(new Book(1,"Name4","Author2"));
		for(Book b:booksCollection) {
			System.out.println(b);
		}
	}
}

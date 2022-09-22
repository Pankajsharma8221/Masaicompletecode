package q1;

public class Bean {
private int isbn;
private String bookName;
private String author;
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
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public Bean(int isbn, String bookName, String author) {
	super();
	this.isbn = isbn;
	this.bookName = bookName;
	this.author = author;
}
public Bean() {
	super();
}
}

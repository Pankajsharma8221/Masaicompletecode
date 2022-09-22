package q1;
import java.util.*;

public class Library {


public static ArrayList<Book>  addBook(ArrayList<Book> b)throws BookException {
if(true) {
	
}else {
	BookException pad=new BookException("Please not add duplicate");
	
	throw pad;
}
	return b;
}
public static ArrayList<Book> viewAllBooks() throws BookException{
	
	if(true) {
		
	}else {
		BookException pad=new BookException("there is no book of this name");
		throw pad;
	}
	return book;
	
}
public static List  viewBooksByAuthor(String author)throws BookException{
	if(true) {
		
	}else {
		BookException pad=new BookException("there is no autho of this name");
		
	}
}
public static Book getBookByISBN(int isbn)throws BookException{
	return null;
	
}
public static void main(String[] args)  {
	
	ArrayList<Book> b=new ArrayList<>();
	Book x=new Book();
	
	b.add(new Book(1,"prem","RajaharishChandra"));
	b.add(new Book(1,"prem","RajaharishChandra"));
	b.add(new Book(1,"Soja","Kundanchimkandi"));
	b.add(new Book(1,"bhag","chalhat"));
	b.add(new Book(1,"karan","Karnal"));
	b.add(new Book(1,"bhag","ramamrmama"));
	try {
		addBook(b);
		viewAllBooks();
		viewBooksByAuthor(b.getBookName());
	}catch(BookException w){
		System.out.println(w.getMessage());
	}


}


}

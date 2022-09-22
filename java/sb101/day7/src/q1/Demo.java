package q1;
import java.util.*;
import java.util.stream.Stream;



//Q1/- Create a Product bean class with the following properties:
//productId
//productName
//price
//quantity
//● From the main method of the Demo class performs the following operations:
//1. Create a List of 5 product objects.
//2. From the product list filter the products whose quantity is more than 10 in a
//separate List of Products.
//3. Sort the Filtered List of Products by the price in ascending order.
//4. Print all the products one by one from both Lists (original list and Filtered list)
//Note: for filtering and printing and sorting make use of Stream or Lambda
//expressions.



public class Demo {
public static void main(String[] args) {
	List<Product> l=new ArrayList<>();
	l.add(new Product(1,"Pankaj",200,1));
	l.add(new Product(2,"bharat",300,3000));
	l.add(new Product(3,"balram",400,4000));
	l.add(new Product(4,"shyam",500,5000));
	l.add(new Product(5,"ram",600,6000));
	
	Stream<Product> st=l.stream();
	
	Stream<Product> st1=st.filter(s -> s.getQuantity()>10);
	l.stream().filter(s-> s.getQuantity()>10).forEach(s-> System.out.println(s));
	
	 
}
}

package q5;
import java.util.*;

//Q5/- Create a Product bean class having the following properties:
//productId: int,
//productName: String,
//quantity: int,
//price :int
//Inside the main method of Demo class , create a List of 5 products and sort that list by using
//price (in descending order)
//Note: for sorting, make use of Lambda expression.
public class Demo {

	public static void main(String[] args) {
		List<Product> l = new ArrayList<>();
		l.add(new Product(1,"Pankaj",200,1000));
		l.add(new Product(2,"bharat",300,3000));
		l.add(new Product(3,"balram",400,4000));
		l.add(new Product(4,"shyam",500,5000));
		l.add(new Product(5,"ram",600,6000));
		
//		Collections.sort(l, new Comparator<Product>() {
//
//			@Override
//			public int compare(Product o1, Product o2) {
//				// TODO Auto-generated method stub
//				return o1.getPrice()>o2.getPrice()?+1:-1;
//			}
//			
//		});
		Collections.sort(l, (s1,s2) -> s2.getPrice() > s1.getPrice() ? +1: -1);

		l.forEach(s ->{
			System.out.println(s);
			System.out.println("------------------------------------");
		});
		
		}
	}


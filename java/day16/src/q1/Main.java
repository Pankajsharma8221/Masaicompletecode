package q1;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main{
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	 
	     
		System.out.println("how many product you add ");
		int n=sc.nextInt();
		
		
		TreeSet<Product> pr=new TreeSet<>(new ProductPrice());// here we creat the tree to relate the product TreeSet]
		// here TreeSet<Product> pr=new TreeSet<> (new ProductPrice())

		
		
		for(int i=1; i<=n; i++) {

			System.out.println("productId");
			int productId=sc.nextInt();
			
			
		
			System.out.println("productName");
			String productName=sc.next();
			
			
			
			System.out.println("productPrice");
			int productPrice=sc.nextInt();
			
			
			
			pr.add(new Product(productId, productName,productPrice));
			
			for( Product pr1:pr) {
				System.out.println(pr);
			}
			
			
		}
		
		
		System.out.println("Enter the choice");
		int ch=sc.nextInt();
		
		if(ch==1) {
			new TreeSet<>(new ProductPrice());
			
		 System.out.println(pr);
		}else if(ch==2) {
			new TreeSet<>(new ProductName());
			 System.out.println(pr);
		}else if(ch==3) {
			new TreeSet<>(new ProductId());
			 System.out.println(pr);
		}else {
			new TreeSet<>(new ProductId());
			 System.out.println(pr);
		}
		
	
	
		
		
	
	}

}
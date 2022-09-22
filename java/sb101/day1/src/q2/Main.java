package q2;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	Product pr=new Product();
	
	Queue<Product> q=new PriorityQueue<>(new Pricecompare());
	System.out.println("Enter the no. of product");
	int n=sc.nextInt();
	for(int a=0;a<n;a++) {

		System.err.println("Enter prodcut id");
		int pi=sc.nextInt();
		pr.setProductId(pi);
		
		
		System.out.println("Enter the productname");
		String name= sc.next();
		pr.setProductName(name);
		
		
		System.out.println("Enter the product price");
		int pp=sc.nextInt();
		pr.setProdcutPrice(pp);
		q.add(new Product(pi,name,pp));
		
		
	}
	Product s;
	while((s=q.poll())!=null) {
		System.out.println(s);
	}
	}

}

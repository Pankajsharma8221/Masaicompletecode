package com.q1;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=1;
		
		System.out.println("Product Details 1");
		System.out.println("Enter the product id");
		int id=sc.nextInt();
		System.out.println("Enter the product name");
		String name=sc.next();
		System.out.println("Enter the product price");
		int price =sc.nextInt();
		Product p=new Product(id,name,price);
		System.out.println("Product Details 2");
		System.out.println("Enter the product id");
		int id1=sc.nextInt();
		System.out.println("Enter the product name");
		String name1=sc.next();
		System.out.println("Enter the product price");
		int price1 =sc.nextInt();
		Product p1=new Product(id1,name1,price1);
		System.out.println("Product Details 3");
		System.out.println("Enter the product id");
		int id2=sc.nextInt();
		System.out.println("Enter the product name");
		String name2=sc.next();
		System.out.println("Enter the product price");
		int price2 =sc.nextInt();
		Product p2=new Product(id2,name2,price2);
		System.out.println("Product Details 4");
		System.out.println("Enter the product id");
		int id3=sc.nextInt();
		System.out.println("Enter the product name");
		String name3=sc.next();
		System.out.println("Enter the product price");
		int price3 =sc.nextInt();
		Product p3=new Product(id3,name3,price3);
		TreeSet<Product> ts;
		System.out.println("○ 1 for sorting the product according to the productPrice\r\n"
				+ "○ 2 for sorting the product according to the productName\r\n"
				+ "○ 3 for sorting the product according to the productId\r\n"
				+ "");
		int choice =sc.nextInt();
		if(choice == 1) {
			ts=new TreeSet<>(new SortPrice());
			ts.add(p);
			ts.add(p1);
			ts.add(p2);
			ts.add(p3);
		}else if(choice==2) {
			ts=new TreeSet<>(new SortName());
			ts.add(p);
			ts.add(p1);
			ts.add(p2);
			ts.add(p3);
		}else {
			ts=new TreeSet<>(new SortId());
			ts.add(p);
			ts.add(p1);
			ts.add(p2);
			ts.add(p3);
		}
		
		System.out.println(ts);
	}

}

package q4;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Ecommerce ecommerce=new Ecommerce();
		ecommerce.addProduct(new Product("Shoes",2000,"Adidas",12));
		ecommerce.addProduct(new Product("Ipad",100000,"Apple",2));
		ecommerce.addProduct(new Product("Ipad",100000,"Apple",4));
		ecommerce.addProduct(new Product("Shoes",4000,"Nike",4));
		ecommerce.addProduct(new Product("Shoes",2000,"Adidas",8));
		System.out.println(ecommerce.showAllProduct());
		ArrayList<> arr= new ArrayList<>();
 }

}
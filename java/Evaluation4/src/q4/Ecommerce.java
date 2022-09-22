package q4;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;
public class Ecommerce {
	List<Product> productList=new ArrayList<>();
	void addProduct(Product product) {
		
       	if(productList.size()>1) {

       		int c=0;
       		for(Product p:productList) {
       			if(p.getCompany().equals(product.company)  &&p.getName().equals(product.name)){
       				p.count=p.count+product.count;
       				System.out.println("Count updated Product already exists");
       				c++;
       			}
       			
       		}
       		if(c==0) {
   				System.out.println("Product added successfully");
   	       		productList.add(product);	
   			}
       		
       	}
       	else {
       		System.out.println("Product added successfully");
       		productList.add(product);
       	}

	}
	
	List<Product> showAllProduct(){
		
		return productList;
	}
	
}
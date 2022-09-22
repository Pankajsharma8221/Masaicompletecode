package q2;

import java.util.Comparator;

public class Pricecompare implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		if(o2.getProdcutPrice()>o1.getProdcutPrice()) {
			return 1;
		}else if(o2.getProdcutPrice()<o1.getProdcutPrice()) {
			return -1;
		}else {
			return 0;	
		}
		
	}

}

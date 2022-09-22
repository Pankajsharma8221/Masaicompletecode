package com.q1;

import java.util.Comparator;

public class SortId implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Product p1=(Product)o1;
		Product p2=(Product)o2;
		if(p1.getProductId()>p2.getProductId()) {
			return 1;
		}else if(p1.getProductId()<p2.getProductId()) {
			return -1;
		}else {
			return 0;
		}
	}

}

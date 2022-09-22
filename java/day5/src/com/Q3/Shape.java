package com.Q3;

public class Shape {
	public void area(Circle circle) {
		int b=circle.radius;
		
		double x=((3.14)*(Math.pow(b, 2)));
		System.out.println(x);

	}
	public void area(Rectangle rectangle) {
		int a=rectangle.length;
		int b=rectangle.breadth;
	int area = a*b;
	System.out.println(area);
	}
	public void area (Square square) {
	  int a=square.side;
	  double b=Math.pow(a, 2);
	  System.out.println(b);
	}
	
	public static void main(String[] args) {
		
	
	         
	 
	}

}

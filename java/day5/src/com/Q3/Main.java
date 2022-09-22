package com.Q3;

public class Main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape=new Shape();
		  Circle circle =new Circle();
	        circle.radius=3;
	       shape.area(circle);
	       
	       
	        Rectangle rectangle= new Rectangle();
	         rectangle.length=3;
	         rectangle.breadth=6;
	         shape.area(rectangle);
	         
	         
	         Square square=new Square();
	         square.side=6;
	         shape.area(square);
	         
	}

}

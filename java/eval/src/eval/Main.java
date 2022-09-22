package eval;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car c=new Car();
Scanner s= new Scanner(System.in);

System.out.println("Number of Passenger");

 int n= s.nextInt();
  c.setNumberOfPassenger(n);
     
     System.out.println("Number of Kms");
     int b=s.nextInt();
     
     c.setNumberOfKms(b);
     
     
     OLA myOla = new OLA();
     Car myCar = myOla.bookCar(c.getNumberOfPassenger(), c.getNumberOfKms());
     int res = myOla.calculateBill(myCar);
     System.out.println("The total fare amount is"+ res);
	}

}

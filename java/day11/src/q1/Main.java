package q1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter number of passenger");
   int ps=sc.nextInt();
   System.out.println("Enter number of Kms");
   int km = sc.nextInt();
   
   Car c=new Car();
   c.setNumberOfKms(km);
   c.setNumberOfPassenger(ps);
   
   OLA o=new OLA();
   
  Car mycar=o.bookCar(ps,km);
  int res= o.calculateBill(mycar);
  
  System.out.println("The total fare amont is "+res);
   
   
	}

}

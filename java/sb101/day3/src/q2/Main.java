package q2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   try {
	   String date=sc.next();
	   System.out.println(date);
	   LocalDate d= LocalDate.now();
	   if(date.equals(d)) {
		   
	   }else {
		   System.out.println("Please put valid date");
	   }
	 
		
   }catch(Exception a) {
	   System.out.println("Please enter the date in correct format");
	   
   }
	   
   }


}

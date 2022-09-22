package q4;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 try {
	 int a=sc.nextInt();
		int b= sc.nextInt();
		int c= a/b;
		double d=Math.floor(c);
		System.out.println(" The quotent of ="+d);
	 
 }catch(ArithmeticException a) {
	 System.out.println("divide by zero exception caught");
 }
	finally {
		System.out.println("Inside finally");
	}
	}

}

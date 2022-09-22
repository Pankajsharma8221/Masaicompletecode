package q1;

import java.util.*;

public class Main {
	public static void main(String args[]) {
		System.out.println("start of main..");
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter num1");
			int num1 = sc.nextInt();
			System.out.println("Enter num2");


int num2 = sc.nextInt();
String message = null;
int num3 = num1 / num2;
if (num3 > 10) {
	message = "Welcome to Exception Handling ";
}
System.out.println("Message is :" + message.toUpperCase());
System.out.println("end of main");

	
		
				


		} catch (InputMismatchException s) {
			System.out.println("Please Enter the number");
		}catch (NullPointerException a) {
			System.out.println("Please enter the value greater than 0");
		
		
		}catch(Exception e) {
			System.out.println("String value is null ");
		}

	}
}

package q2;

import java.util.Scanner;

public class Employees {

	
	public static void main(String[] args) {
		
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Total no. of employess");
		int c=scanner.nextInt();
		
		int bag=0;
		int x=1;
		while(c>=x) {
			System.out.println("Enter the age for"+(x)+"employees");
			int val=scanner.nextInt();
			bag=bag+val;
			x++;
		}
		
		System.out.println("The average age is"+bag/x);
		
		
		}
}

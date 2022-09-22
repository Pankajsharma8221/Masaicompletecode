package q4;
import java.util.Scanner;

public class Demo {
	
	

	public static void main(String[] args) {
	      
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a String =>");
		String name=sc.next();
		
		
		System.out.println("Enter a position =>");
		int pl=sc.nextInt();
		
		int n=name.length();
		if(pl>n) {
			System.out.println("Invalid position, Please enter a valid position =>");
		   pl=  sc.nextInt();
		}else {
			char pos=name.charAt(pl);
			System.out.println(pos);
			System.out.println("Character at the position "+pl+" => "+pos);
		}
	
		
	}
}

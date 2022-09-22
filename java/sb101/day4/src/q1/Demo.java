package q1;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("Enter the value");
			String val= sc.next();
			int x=Integer.parseInt(val);
		
			 System.out.println("the square is "+x*x);
		}catch(NumberFormatException s) {
			System.out.println("Enter the valid format");
		}
		
		 
		 System.out.println("Work has been done successfully");
	}

}

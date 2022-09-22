package Q2;
import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the String");
        
        String name= a.nextLine();
       
        
        System.out.println("Enter the character you want to access");
        
        int val=a.nextInt();
        
        
        System.out.println("character at position ");
        char x=a.next().charAt(0);
        
        
        System.out.println("Enter the String"+name);
        System.out.println("Enter the character you want to access"+val);
        System.out.println("character at position "+x);
	}

}

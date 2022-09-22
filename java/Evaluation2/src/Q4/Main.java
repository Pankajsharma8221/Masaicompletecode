package Q4;
import java.util.Scanner;

public class Main {

	public static Laptop getLaptop(String laptopPurpose) {
        if(laptopPurpose=="gaming") {
        	return ;
        	
        	
        
        }else if(laptopPurpose=="business") {
        	return null;
        }
	}

	public static void main(String[] args) {
	
		Laptop gamingLaptop=getLaptop("gaming");
		
		Scanner s=new Scanner(System.in);
		
	System.out.println("Laptop name ");
	String name = s.next();
	
	System.out.println("Company Name ");
	String c = s.next();
	System.out.println("Laptop color ");
	String l = s.next();
	System.out.println("Cpu Manufacture ");
	String Manu = s.next();
	
	System.out.println("Cpu processor ");
	String pro = s.next();
	System.out.println("Cpu ClockSpeed ");
	String clock = s.next();
	System.out.println("Graphic card Manufacture ");
	String Gr = s.next();
	System.out.println("Graphic card's series ");
	String series = s.next();
	System.out.println("Graphic card's capacity ");
	String capacity = s.next();
	


	
		Laptop bussinessLaptop=getLaptop("business");
	
		Laptop laptop=getLaptop("Entertainment");
		
		
		
	}
	
	

	
	
}

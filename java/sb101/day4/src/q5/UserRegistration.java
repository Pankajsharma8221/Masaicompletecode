package q5;
import java.util.*;


public class UserRegistration {

	public void registerUser(String username, String userCountry)throws InvalidCountryException {
		
		if(userCountry.equals("India")) {
			System.out.println("User Registraion done succesfully");
			
		}
		else {
			InvalidCountryException a=new InvalidCountryException("Invalid country "+userCountry);
			throw a;
		}

	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the user name");
	String username=sc.next();
	System.out.println("Enter the usercountry");
	String userCountry= sc.next();
	UserRegistration u=new UserRegistration();
	try {
		
		
		u.registerUser(username,userCountry);
		
	}catch(InvalidCountryException a) {
		System.out.println(a.getMessage());
	}finally {
		System.out.println("Thank you");
	}
	
	}
}

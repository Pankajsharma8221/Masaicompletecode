package q3;
import java.util.*;

public class AccountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
Account x= new Account();
int am= sc.nextInt();
try {
	x.withdraw(am);
}catch(InsufficientFundsException a) {
	System.out.println(a.getMessage());
}

	}

}
  
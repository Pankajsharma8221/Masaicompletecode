package q3;

public class Account {

	
	String accountNumber;
	double balance;
	
	public void deposit(int amount){
	balance+= amount;
	}
	
	
	
	
	public double withdraw(int amount)throws InsufficientFundsException {

if(amount>balance) {
	InsufficientFundsException a= new  InsufficientFundsException("Low balance"+balance);
	throw a;
}else {
	System.out.println("Withdraw succesfull");
}
return balance;
		
	}
	
}


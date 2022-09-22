package q4;

public class Bank {
private Bank() {
	System.out.println("Inside private constructor of Bank");
}

Bank(int name){
	this();
}

public static void getdeclare(){
	Bank bank=new Bank();
}
}

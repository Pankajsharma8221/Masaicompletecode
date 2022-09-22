package com.q3;

public class Main {
	public static void main(String[] args) {
		
		Loan loan=Loan.byPass();
		double permanentEmployeeLoan=loan.calculateLoanAmount(new PermanentEmployee(1,"Name1",1000));
		double temporaryEmployeeLoan=loan.calculateLoanAmount(new TemporaryEmployee(2,"Name2",20,100));
		PermanentEmployee p=new PermanentEmployee(1,"Name1",1000);
		System.out.println("Loan Amount for Permanent Employee => "+permanentEmployeeLoan);
		System.out.println("Loan Amount for Temporary Employee => "+temporaryEmployeeLoan);

	}
}

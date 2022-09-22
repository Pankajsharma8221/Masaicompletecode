package com.q3;

public class Loan {
	private Loan() {
		
	}
	public static Loan byPass() {
		Loan l=new Loan();
		return l;
	}
	public double calculateLoanAmount(Employee employeeObj) {
		double loan;
		if(employeeObj instanceof PermanentEmployee) {
			loan = employeeObj.salary *0.15;
			
		}else {
			loan=employeeObj.salary*0.1;
		}
		return loan;
	}

}

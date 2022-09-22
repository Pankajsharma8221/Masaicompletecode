package com.q3;

public class PermanentEmployee extends Employee{
	private double basicPay;
	public PermanentEmployee(int employeeid, String employeeName,double basicPay) {
		super(employeeid, employeeName);
		this.basicPay=basicPay;
		this.calculateSalary();
	}
	
	@Override
	void calculateSalary() {
		salary=basicPay-(basicPay*0.12);
	}

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	
}

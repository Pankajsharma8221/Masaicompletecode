package com.q4;

public class AxisBank extends Bank{
	double rateOfInterest;

	@Override
	void displayDetails() {
		System.out.println("Branch Name - "+branchName);
		System.out.println("Ifsc Code - "+ifscCode);
		System.out.println("Rate of interest - "+rateOfInterest);
	}
	
	void creditCard() {
		System.out.println("Get the credit card from the Axis Bank");
	}

	public AxisBank(String branchName, String ifscCode, double rateOfInterest) {
		super(branchName, ifscCode);
		this.rateOfInterest = rateOfInterest;
	}
	
}

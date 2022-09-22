package com.q4;

public class ICICIBank extends Bank{
	double rateOfInterest;

	@Override
	void displayDetails() {
		System.out.println("Branch Name - "+branchName);
		System.out.println("Ifsc Code - "+ifscCode);
		System.out.println("Rate of interest - "+rateOfInterest);
	}

	public ICICIBank(String branchName, String ifscCode, double rateOfInterest) {
		super(branchName, ifscCode);
		this.rateOfInterest = rateOfInterest;
	}
	
}

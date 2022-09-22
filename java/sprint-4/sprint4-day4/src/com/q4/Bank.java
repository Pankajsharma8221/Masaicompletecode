package com.q4;

public class Bank {
	public String branchName;
	public String ifscCode;
	
	void displayDetails() {
		System.out.println("Branch Name : "+branchName);
		System.out.println("Ifsc Code : "+ifscCode);
	}

	public Bank(String branchName, String ifscCode) {
		super();
		this.branchName = branchName;
		this.ifscCode = ifscCode;
	}
	
}

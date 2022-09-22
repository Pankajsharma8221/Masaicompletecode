package com.q4;

import java.util.Scanner;

public class Demo {
	public static Bank getBank(String bank) {
		if(bank.equals("axis")) {
			AxisBank a=new AxisBank("axis","axisbank123",8);
			return a;
		}else if(bank.equals("icici")) {
			ICICIBank i=new ICICIBank("icici","icicibank123",9);
			return i;
		}else {
			return null;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the bank name");
		String bank=sc.next();
		
		Bank ban=Demo.getBank(bank);
		if(ban instanceof AxisBank) {
			ban.displayDetails();
			((AxisBank) ban).creditCard();
		}else if(ban instanceof ICICIBank) {
			ban.displayDetails();
		}else {
			System.out.println("Enter valid input");
		}
		
		
	}
}

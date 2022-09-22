package com.day5;

public class Demo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isSnowing=false;
		boolean isRaining=true;
		double temperature=60.0;
		
		if(isSnowing ||isRaining||temperature>50) {
			System.out.println("Let's stay home.");
		}else {
			System.out.println("Let's go out!");
		}
		
	}

}

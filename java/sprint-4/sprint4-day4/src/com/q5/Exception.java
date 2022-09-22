package com.q5;

public class Exception {
	public static void main(String[] args) {
		int[] arr= {1,2,3};
		try {
			System.out.println(arr[5]);
		}catch(ArrayIndexOutOfBoundsException a){
			System.out.println(a.getMessage());
			System.out.println(a.getCause());
			System.out.println(a.getLocalizedMessage());
			System.out.println(a);
		}
		
	}
}

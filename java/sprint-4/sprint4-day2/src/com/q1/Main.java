package com.q1;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<>();
		arr.add("Suraj");
		arr.add("Ranjeet");
		arr.add("Sanajit");
		System.out.println("Printing arr");
		System.out.println(arr);
		System.out.println("Printing size of arr");
		System.out.println(arr.size());
		
//		Using inhanced loop 
		System.out.println("Printing using enhancd for loop");
		for(String str:arr) {
			System.out.println(str);
		}
		
//		Using for loop
		System.out.println("Printing using for loop");
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
}

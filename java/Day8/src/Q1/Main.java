package Q1;

import java.util.Scanner;




class Main{
public static String reversString(String input){
//write the logic
	String rev="";
	for(int a=input.length()-1;a>=0;a--) {
		rev=rev+input.charAt(a);
	}
	return rev;
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a String to reverse");
String orignalString = sc.nextLine();
String result = reversString(orignalString);
System.out.println("Original String is :"+ orignalString);
System.out.println("Reversed String is :"+ result);
}
}

package q4;

import java.util.Scanner;

public class Student {
private int roll;
private String name;
private int marks;
private char grade;
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public char getGrade() {
	return grade;
}
public void setGrade(char grade) {
	this.grade = grade;
}

public void displayDetails() {
	Scanner sc= new Scanner(System.in); 
	System.out.println("Roll number");
	int r=sc.nextInt();
	System.out.println("name");
	String n=sc.next();
	System.out.println("marks");
	int marks=sc.nextInt();
	
	
	char z=calculateGrade(marks);
	
	System.out.println("Roll number"+r);
	System.out.println("Name is"+n);
    System.out.println("result"+z);
}


@Override
public String toString() {
	return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", grade=" + grade + "]";
}
public char calculateGrade(int marks) {
	String a="A";
	String b="B";
	String c="C";
			
			char x=a.charAt(0);
	char y=b.charAt(0);
	char z=c.charAt(0);
	
	if(marks>=500) {
		return  x;
	}
		
	else if(marks<500 && marks>500) {
		return y;
	}
		
	else if(marks<400){
		return z;
	}
	return z;
	

		
	
	

}
}

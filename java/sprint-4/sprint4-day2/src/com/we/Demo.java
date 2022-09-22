package com.we;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
ArrayList<Student> students = new ArrayList<>();
		
		int count = 1;
		
		while(true) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter details of Student "+(count++));
			
			System.out.println("Enter Roll");
			int roll= sc.nextInt();
			
			System.out.println("Enter Name");
			String name= sc.next();
			
			System.out.println("Enter Marks");
			int marks= sc.nextInt();
			
			Student student = new Student(roll, name, marks);
			
			students.add(student);
			
			System.out.println("Student object added sucessfully...");
			
			System.out.println("Want more(y/n) ?");
			String choice=  sc.next();

			if(choice.equalsIgnoreCase("n"))
				break;
				
		}
		
		
		
		for(Student student: students) {
			
			System.out.println("Roll is :"+student.getRoll());
			System.out.println("Name is :"+student.getName());
			System.out.println("Marks is :"+student.getMarks());
			
			System.out.println("================================");
		}
	}
}

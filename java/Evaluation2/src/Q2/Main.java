package Q2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Student s1 = new Student();

		System.out.println("Enter Number of Students you want to enter");
		Scanner sc = new Scanner(System.in);

		int stud = sc.nextInt();

		System.out.println("========================");

		for (int i = 1; i <= stud; i++) {

			System.out.println("Enter the  name :");
			String name = sc.next();
			s1.setStudentName(name);

			System.out.println("Enter the Roll Number :");
			int roll = sc.nextInt();
			s1.setRollNumber(roll);

			System.out.println("Enter the  marks :");
			int marks = sc.nextInt();
			s1.setMarks(marks);

			System.out.println("student name is :" + s1.getStudentName());
			System.out.println("Rollnumber is :" + s1.getRollNumber());
			System.out.println("student marks is:" + s1.getMarks());

		}

	}

}
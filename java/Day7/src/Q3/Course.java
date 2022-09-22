package Q3;

import java.util.Scanner;

public class Course {
	int courseId;
	String courseName;
	int courseFee;
	public static void main(String[] args) {
		authenticate("Admin", "1234");
		authenticate("USer","3456");
	}
	


	void displayCourseDetails() {
		System.out.println("Course id is "+ courseId);
		System.out.println("Course name is "+courseName);
		System.out.println("Course fee is "+courseFee);
	}
	
	static void authenticate(String username, String password) {
		if(username=="Admin" && password=="1234") {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter course name ");
			String n1=sc.nextLine();
			System.out.println("Enter course id ");
			int i1=sc.nextInt();
			System.out.println("Enter course fee ");
			int f1=sc.nextInt();
			Course c1=new Course();
			c1.courseId=i1;
			c1.courseName=n1;
			c1.courseFee=f1;
			c1.displayCourseDetails();
		}else {
			System.out.println("Invalid Username or Password");
		}
	}
}

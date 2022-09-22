package Q5;

import java.util.Scanner;

public class Demo {
	
	static void func() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo d1= new Demo();
		
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("How many Student ?");
		
		int num= sc.nextInt();
		
		Student[] student=new Student[num];
		
		int sum=0;
		for(int a=0;a<student.length;a++) {
			
			System.out.println("Enter details of student"+(a+1));
			
			
			System.out.println("Enter roll:");
		    int roll=sc.nextInt();
		    
		    System.out.println("Enter Name");
		    String name=sc.next();
		    
		    System.out.println("Enter marks");
		     int marks= sc.nextInt();
		     student[a]=new Student();
		    student[a].setRoll(roll);
		    student[a].setName(name);
		    student[a].setMarks(a);
		    System.out.println(student[a].getRoll());
		    System.out.println(student[a].getName());
		    System.out.println(student[a].getMarks());
		}
		
	}
	
	
	

}

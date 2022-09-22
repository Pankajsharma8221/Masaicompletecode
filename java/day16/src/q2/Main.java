package q2;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("how many product you add");
	int n=sc.nextInt();
	
	TreeSet<Employee> e=new TreeSet<>(new salary());
	
	for(int a=1;a<=n;a++) {
		System.out.println("empid");
		int empId=sc.nextInt();
		
		System.out.println("empName");
		String empName=sc.next();
	
		System.out.println("salary");
		int salary= sc.nextInt();
		
		
		e.add(new Employee(empId,empName,salary));
		for(Employee x:e) {
			System.out.println(e);
		}
		
	}
	System.out.println("Enter the choice");
	int ch=sc.nextInt();
	if(ch==1) {
		new TreeSet<>(new empId());
	}else if(ch==2) {
		new TreeSet<>(new empName());
	}else if(ch==3) {
		new TreeSet<>(new salary());
	}else {
		new TreeSet<>(new empId());
		System.out.println(e);
	}
}
}

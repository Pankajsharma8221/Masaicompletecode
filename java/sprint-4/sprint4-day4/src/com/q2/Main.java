package com.q2;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeSet<Employee> ts=new TreeSet<>(new SortSalary());
		for(int i=0; i<4; i++) {
			System.out.println("Enter employee id");
			int empid=sc.nextInt();
			System.out.println("Enter employee name");
			String name=sc.next();
			System.out.println("Enter emloyee salary");
			double salary=sc.nextDouble();
			Employee e=new Employee(empid,name,salary);
			ts.add(e);
		}
		for(Employee e:ts) {
			System.out.println("Employee Details Sorted by Salary");
			System.out.println(e.getEmpId());
			System.out.println(e.getEmpName());
			System.out.println(e.getSalary());
			System.out.println("=========================");
		}
	}
}

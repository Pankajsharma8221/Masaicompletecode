package com.q4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Main {
	Collection<Employee> arrL=new ArrayList<>();
	public static void main(String[] args) {
		Main main=new Main();
		Scanner sc=new Scanner(System.in);
		System.out.println("....Welcome to Employee Management System....");
		int l=1;
		while(true) {
			System.out.println("Do you want to Enter the detail of Employee:?(y/n)");
			String c=sc.next();
			if(c.equals("y")) {
				System.out.println("Enter the Employee Details : "+ l++);
				System.out.println("--------------------------------------");
				System.out.println("Enter the Employee Id");
				int id=sc.nextInt();
				System.out.println("Enter the Employee Name");
				String name=sc.next();
				System.out.println("Enter the Employee Salary");
				double salary=sc.nextDouble();
				System.out.println("Enter the Department Id");
				int depid=sc.nextInt();
				System.out.println("Enter the Department Name");
				String dname=sc.next();
				System.out.println("Employee Details Added Successfully");
				Department d=new Department(depid,dname);
				Employee e=new Employee(id,name,salary,d);
				main.arrL.add(e);
			}else if(c.equals("n")) {
				System.out.println("Thank You!");
				while(true) {
					System.out.println("Enter the your choice\r\n"
							+ "1: Find Employee in Particular Department\r\n"
							+ "2: Remove Particular Employee\r\n"
							+ "3: Print Employees in All Departments");
					int choice =sc.nextInt();
					if(choice==3) {
						Collection<Employee> arr=main.arrL;
						List<Employee> employee =(List<Employee>)arr;
						for(int i=0; i<employee.size(); i++) {
							System.out.println(employee.get(i));
						}
						System.out.println("Do you want to Exit: ? (Y/N)");
						String exit=sc.next();
						if(exit.equals("y")) {
							System.out.println("Thanks");
							break;
						}
					}else if(choice==1) {
						System.out.println("Enter the Department Id:");
						int dep=sc.nextInt();
						Collection<Employee> arr=main.arrL;
						List<Employee> employee =(List<Employee>)arr;
						for(int i=0; i<employee.size(); i++) {
							if(employee.get(i).getDepartment().getDepartmentId()==dep) {
								System.out.println("Employee in Department:" + dep);
								System.out.println("Employee Name :" + employee.get(i).getEmployeeName());
								System.out.println("Employee id :" + employee.get(i).getEmployeeId());
								System.out.println("Employee Salary : " + employee.get(i).getEmployeeSalary());
								
								System.out.println("========================");
						}
								
						}
						System.out.println("Do you want to Exit: ? (Y/N)");
						String exit = sc.next();
						if(exit.equals("y")) {
							break;
						}
					}else if(choice==2) {
						System.out.println("Enter the Department Id: ");
						int Did = sc.nextInt();
						System.out.println("Enter the Employee Id: ");
						int Eid = sc.nextInt();
						Collection<Employee> arr = main.arrL;
						List<Employee> aR  =(List<Employee>)arr;
						for(int i=0;i<aR.size();i++) {
							if(aR.get(i).getDepartment().getDepartmentId()==Did && aR.get(i).getEmployeeId()==Eid) {
							    String nam = aR.get(i).getEmployeeName();
							    int D = aR.get(i).getDepartment().getDepartmentId();
								aR.remove(i);
								
								System.out.println(nam +  " Employee is removed from the department " +  D + " successfully " );
								
							}
							
						}
						System.out.println("Do you want to Exit: ? (Y/N)");
						String exit = sc.next();	
						if(exit.equals("y")) {
							break;
						}
						
					}
				}
				System.out.println("Thank you ---");	
				break;
			}
		}
	}
}

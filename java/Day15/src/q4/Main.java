package q4;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Main {
Collection<Employee> arr=new ArrayDeque<>();

public static void main(String[] args) {
	Main main =new Main();
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Welcome to employee management system");
	
	int l=1;
	while(true) {
		System.out.println("Do  yo want to entere the details of Employee:(y/n)");
		String c=sc.next();
		if(c.equals("y")) {
			System.out.println("Enter the employee detaisl"+l++);
			System.out.println("Enter the employee id");
			int id=sc.nextInt();
			System.out.println("Enter the employee name");
			String name=sc.next();
			System.out.println("Enter the employee salary");
			double salary=sc.nextDouble();
			System.out.println("Enter the department id");
			int depid=sc.nextInt();
			System.out.println("Ente the department name");
			String dn=sc.next();
			System.out.println("employee details added succesfully");
			Department d=new Department(depid,dn);
			Employee e=new Employee(id,name,salary,d);
			main.arr.add(e);
			
		}else if(c.equals("n")) {
			System.out.println("thanks");
			while(true) {
				System.out.println("Enter the you choice \r\n"+"Find employee particular department\r\n"+"Print employees in all departments");
				int choice =sc.nextInt();
				if(choice==3) {
					Collection<Employee> arr1= main.arr;
					List<Employee> employee =(List<Employee>)arr1;
					for(int a=0;a<employee.size();a++) {
						System.out.println(employee.get(a));
						
					}
					System.out.println("Do you wan to exit:?(y/n)");
					String ex=sc.next();
				}
			}
		}
	}
}
}

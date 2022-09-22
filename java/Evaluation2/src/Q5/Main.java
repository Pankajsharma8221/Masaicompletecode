package Q5;

import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        Employee emp = getEmployeeDetails();
        double fp = getPFPercentage();

        System.out.println();
        System.out.println(" employee details: ");
        System.out.println("id : " + emp.getEmployeeId());
        System.out.println("name : " + emp.getEmployeeName());
        System.out.println("salary : " + emp.getSalary());

        emp.calculateNetSalary(fp);
        System.out.println("Net Salary : " + emp.getNetSalary());
    }
    
    public static Employee getEmployeeDetails() {
        Employee employee = new Employee();
        System.out.println("Enter Id: ");
        employee.setEmployeeId(scanner.nextInt());
        System.out.println("Enter Name: ");
        employee.setEmployeeName(scanner.next());
        System.out.println("Enter salary: ");
        employee.setSalary(scanner.nextDouble());
        return employee;
    }

    public static double getPFPercentage(){
        System.out.println("Enter PF percentage:");
        double fp = scanner.nextDouble();
        return fp;
    }

}
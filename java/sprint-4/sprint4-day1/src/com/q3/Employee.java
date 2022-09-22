package com.q3;

public abstract class Employee {
	protected int employeeid;
	protected String employeeName;
	protected double salary;
	public Employee(int employeeid, String employeeName) {
		super();
		this.employeeid = employeeid;
		this.employeeName = employeeName;
	}
	
	abstract void calculateSalary();

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	
	
}

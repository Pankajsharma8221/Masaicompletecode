package com.q3;

public class TemporaryEmployee extends Employee{
	private int hoursWorked;
	private int houryWages;
	public TemporaryEmployee(int employeeid, String employeeName,int hoursWorked,int hourlyWages) {
		super(employeeid, employeeName);
		this.hoursWorked=hoursWorked;
		this.houryWages=hourlyWages;
		this.calculateSalary();
	}

	@Override
	void calculateSalary() {
		salary=hoursWorked*houryWages;
		
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public int getHouryWages() {
		return houryWages;
	}

	public void setHouryWages(int houryWages) {
		this.houryWages = houryWages;
	}
}

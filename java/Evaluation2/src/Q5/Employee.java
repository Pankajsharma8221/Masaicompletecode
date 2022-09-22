package Q5;

public class Employee {

	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	private void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public void calculateNetSalary(double fp) {
		double pfAmount = salary * (fp / 100);
		double netSalary = salary - pfAmount;
		this.setNetSalary(netSalary);
	}

}
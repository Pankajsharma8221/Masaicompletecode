package q4;

public class Employee {
private Integer employeeId;
private String employeeName;
private double employeeSalary;
private Department department;
public Integer getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(Integer employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public double getEmployeeSalary() {
	return employeeSalary;
}
public void setEmployeeSalary(double employeeSalary) {
	this.employeeSalary = employeeSalary;
}
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}
public Employee(Integer employeeId, String employeeName, double employeeSalary, Department department) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.employeeSalary = employeeSalary;
	this.department = department;
}
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
			+ employeeSalary + "]";
}

}

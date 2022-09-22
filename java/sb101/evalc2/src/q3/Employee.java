package q3;

public class Employee {
private int empId;
private String name;
private int salary;
private String address;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Employee(int empId, String name, int salary, String address) {
	super();
	this.empId = empId;
	this.name = name;
	this.salary = salary;
	this.address = address;
}
public Employee() {
	super();
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
}

}

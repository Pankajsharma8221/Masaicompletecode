package q1;

import java.util.Map;
import java.util.TreeMap;
public class Employee implements Comparable <Employee> {
    int empId;
    String name;
    double salary;
    public Employee(int empId, String name,  double salary) {
        super();
        this.empId = empId;
        this.name = name;
        this.salary =  salary;
    }
    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", name=" + name + ", address=" + salary + "]";
    }
    public static void main(String[] args) {
        Map<Employee, Integer> details=new TreeMap<>();
        Employee emp1=new Employee(01,"ch",5000);
        Employee emp2=new Employee(02,"m",4000);
        Employee emp3=new Employee(03,"Su",5000);
        Employee emp4=new Employee(04,"K",3000);
        Employee emp5=new Employee(05,"c",1000);
        details.put(emp1,1000);
        details.put(emp2,2000);
        details.put(emp3,3000);
        details.put(emp4,4000);
        details.put(emp5,5000);
        System.out.println(details);
    }
    @Override
    public int compareTo(Employee E) {
        return  name.compareTo(E.name);
    }
}
package q3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Manager obj= new Manager();
		Employee obj1= new Employee();
		
		obj1.name="Pankaj";
		obj1.age=22;
		obj1.Address="near hanuman mandir sunaro wali gali";
		obj1.Phone="8221066124";
		obj1.Salary=32322.22;
		obj1.printSalary();
		obj1.Specilization="jfak";
		obj1.Department="Cjaf";
		
		obj.name="Pankaj";
		obj.age=22;
		obj.Address="near hanuman mandir sunaro wali gali";
		obj.Phone="8221066124";
		obj.Salary=32322.22;
		obj.Specilization="Sleeping";
		obj.Department="Cutting";
		obj.printSalary();
	 System.out.println(obj1.Salary);
	 System.out.println(obj.Salary);
		
	}

}

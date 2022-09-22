package q2;

import java.util.Comparator;

public class empName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return	o1.getEmpName().compareTo(o2.getEmpName());
	}
	

}

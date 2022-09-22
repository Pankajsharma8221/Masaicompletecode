package q2;

import java.util.Comparator;

public class empId implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getEmpId()>o2.getEmpId()) {
			return 1;
		}else if(o1.getEmpId()<o2.getEmpId()) {
			return -1;
		}else {
			return 0;
		}
	}

	
	
}

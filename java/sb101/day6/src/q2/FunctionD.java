package q2;

import java.util.function.Function;

public class FunctionD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    
		
		Function<Student, String> f2 = s -> s.getMarks() > 500?"Pass": "Fail";
		System.out.println(f2.apply(new Student(10, "N1", 850)));
	

	}

}

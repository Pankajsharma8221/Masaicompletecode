package q2;

import java.util.function.Supplier;

public class supplierD {
	
public static int getANumber() {
		
		return 1000;
	}
	
	public static void main(String[] args) {
	//	example 1
        Supplier<Integer> s4 = supplierD::getANumber;
		
		System.out.println(s4.get());
		
	//	example 2;
		
		Supplier<Student> c1=()->new Student(10,"kundan",450);
		System.out.println(c1.get());
		

		//example 3;
		
		Supplier<String> s2 = () -> "This message from the LE";
		
		System.out.println(s2.get());
	}


}

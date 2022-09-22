package q2;

import java.util.function.Supplier;

public class supplierd {
	
public static int getANumber() {
		
		return 1000;
	}
	
	public static void main(String[] args) {

        Supplier<Integer> s4 = supplierd::getANumber;
		
		System.out.println(s4.get());

		Supplier<Student> c1=()->new Student(10,"Pankaj",450);
		System.out.println(c1.get());
		
		
		Supplier<String> s2 = () -> "This message from the LE";
		
		System.out.println(s2.get());
	}
}


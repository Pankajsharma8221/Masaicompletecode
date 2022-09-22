package q2;

//Q2/- Create a List of 5 Student objects and from that List get the highest marks Student by
//using Stream API.
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Student> students = new ArrayList<>();
		
		students.add(new Student(10, "N1", 750));
		students.add(new Student(12, "N2", 450));
		students.add(new Student(13, "N3", 650));
		students.add(new Student(14, "N4", 850));
		students.add(new Student(15, "N5", 410));
		
		Student minStudent= students.stream().min((s1,s2) -> s1.getMarks() > s2.getMarks() ? +1: -1).get();
			System.out.println(minStudent);
	}

}

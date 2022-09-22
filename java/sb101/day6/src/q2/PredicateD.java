package q2;
import java.util.function.Predicate;

public class PredicateD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Student> c1=s-> s.getMarks()>500;
		System.out.println(c1.test(new Student(10,"kundan",550)));

	}

}
package q3;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	
	public static void main(String[] args) {
		
		List<Student> l= new ArrayList<>();
		
		List<Employee> em =new ArrayList<>();
		l.add(new Student(21,"Pankaj",600,"karnal"));
		l.add(new Student(1,"karan",400,"delhi"));
		l.add(new Student(2,"dabang",200,"dhuri"));
		l.add(new Student(211,"karan",300,"massouri"));
		l.add(new Student(212,"Pankaj",500,"karnal"));
		
	l.stream().filter(s-> s.getMarks()>500).forEach(i-> em.add(new Employee(i.getRoll(),i.getName(),i.getMarks()*10000,i.getAddress())));
		
		em.stream().forEach(i -> System.out.println(i));
		
		
	}
}

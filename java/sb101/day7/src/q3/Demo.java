package q3;
import java.util.*;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		
		List<Integer> l=new  ArrayList<>();
		
		l.add(4);
		l.add(6);
		l.add(9);
		l.add(12);
		
	
		List<Integer> mod= l.stream().map(s->(s*s)).collect(Collectors.toList());
		mod.forEach(System.out::println);
		
		l.forEach(System.out::println);
		
//		System.out.println(l+""+mod);
		
		
		
	}
}

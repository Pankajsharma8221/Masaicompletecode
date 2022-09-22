package q2;
import java.util.*;

public class City {
public static void main(String[] args) {
	


	
	List<String> l=new ArrayList<>();
	l.add("Chennai");
	l.add("Delhi");
	l.add("Mumbai");
	l.add("Banglore");
	
	l.sort((s1,s2)->-1*s1.compareTo(s2));
	l.forEach(System.out::println);
	
	
//	List<String> city=Arrays.asList("nagpur","nashik","amravti","mumbai");
//	
//	
//	Collections.sort(city,(a1,a2)->a2.compareTo(a1));	
//	
//	System.out.println(city);
}

}

package q4;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {


		List<String> names = Arrays.asList("chuni", "nunu", "guni", "amu", "lamu", "babu", "kaka", "shaka", "laka", "chikacka");
		

		List<String> res = names.stream().filter(x -> x.length() % 2 == 0)
                .collect(Collectors.toList());
		
		
		System.out.println("=====Origional List==========");
		names.forEach(x -> System.out.println(x.toUpperCase()));
		
		
		System.out.println("====Filtered with even character List==========");
		res.forEach(x -> System.out.println(x.toUpperCase()));
		
		
		System.out.println("====List in descending order using Lamda expression====");
		Collections.sort(res, (o1, o2) -> (o2.compareTo(o1)));
		res.forEach(x -> System.out.println(x.toUpperCase()));
	}

}

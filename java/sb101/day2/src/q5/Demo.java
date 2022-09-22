package q5;
import java.util.*;

public class Demo {

	public static void main(String[] args) {
		LinkedHashMap<String,String> l=new LinkedHashMap<>();
		
		l.put("haryana","chandigarh");
		l.put("Punjab", "Chandigarh");
		l.put("Gujarat","Gandhinagar");
		l.put("Maharastra", "Mumbai");
		l.put("Tamil nadu", "Chennai");
		
		for(Map.Entry<String, String> s:l.entrySet()) {
			System.out.println(s.getKey()+" "+s.getValue());
		}
	}
}

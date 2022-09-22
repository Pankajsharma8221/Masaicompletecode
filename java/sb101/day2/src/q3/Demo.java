package q3;
import java.util.*;
public class Demo {
	public static void main(String[] args) {
		
		
		HashMap<String,Student> hm = new HashMap<>();
		
		
		hm.put("Maharastra",new Student(10,"Ganesh",950));
		hm.put("Tamilnadu",new Student(12,"Surya",850));
		hm.put("Telangana",new Student(15,"Venkat",920));
		hm.put("Haryana",new Student(16,"Dinesh",910));
		hm.put("Kerla",new Student(18,"Srinu",880));
		
		Set<Map.Entry<String,Student>> set = hm.entrySet();
		
		for(Map.Entry<String,Student> me: set) {
		System.out.println(" Student of State is :" + me.getKey());
		
		System.out.println("*********************************");
		Student student = me.getValue();
		System.out.println("Roll :" + student.getRoll());
		System.out.println("Name :" + student.getName());
		System.out.println("Marks :" + student.getMarks());
		}

		}
}

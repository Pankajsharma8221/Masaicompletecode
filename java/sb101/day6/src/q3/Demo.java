package q3;

//Q3/- Sort the following Map by its value (by Student name in descending order), using
//Lambda expressions. In this Map key will be Country name and value will be the Student
//object.
//public Map<String, Student> sortMapUsingStudentName(Map<String, Student>
//originalMap);
//Student class
//roll
//name
//email
//marks
//● Call the above method by passing a HashMap object with 5 entries
//● Print all the student details belonging from each country.
//Note: to print the details make use of the Lambda expression
import java.util.*;

public class Demo {

	 public Map<String, Student> sortMapUsingStudentName(Map<String,Student> originalMap){
		
		 Set<Map.Entry<String,Student>> set = originalMap.entrySet();
		 
		 Set<Map.Entry<String, Student>> sortedSet = new TreeSet<>(new StudentComp());
		  sortedSet.addAll(set);
		  
		  
		  LinkedHashMap<String, Student> sortedMap = new LinkedHashMap<>();
		  
		  for(Map.Entry<String, Student> s:sortedSet) {
			  sortedMap.put(s.getKey(), s.getValue());
		  }
		return sortedMap;
	
	}
	
public static void main(String[] args) {
	HashMap<String,Student> map=new HashMap<>();
	
	map.put("Delhi", new Student(23,"Pankaj","Pankajsaraswatsharma@gmail.com",120));
	map.put("Noida", new Student(23,"Sundan","Sundan@gmail.com",120));
	map.put("Karnal", new Student(23,"Samu","Samu@gmail.com",120));
	map.put("Mumbai", new Student(23,"Shyamu","Shyamu@gmail.com",120));
	map.put("kolkata", new Student(23,"Dhanu","Dhanu@gmail.com",120));
	
	Demo d=new Demo();
	
Map<String,Student> fin=d.sortMapUsingStudentName(map);

for(Map.Entry<String, Student> l:fin.entrySet()) {
	
	System.out.println("Employee From: "+l.getKey());
	System.out.println("================================");
	Student em = l.getValue();
	
	
	System.out.println("student Name: "+em.getName());
	System.out.println("student email: "+em.getEmail());
	System.out.println("student roll: "+em.getRoll());
	System.out.println("student marks: "+em.getMarks());
	System.out.println("----------------------------------");
}

	
	
}
}

package q2;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Student,String> t=new TreeMap<>(new StudentMarksComparator());
t.put(new Student(10,"Pankaj",994), "Haryana");
t.put(new Student(40,"Pardeep",993), "punjab");
t.put(new Student(30,"hardeep",995), "Maharastra");
t.put(new Student(60,"Karambir",939), "bangal");
t.put(new Student(70,"Karan",100), "bihar");
Set<Map.Entry<Student, String>> s=t.entrySet();
for(Map.Entry<Student,String> mape:s) {
	System.out.println("name of state "+mape.getValue());
	System.out.println("---------------------------------------------------");
	System.out.println(mape.getKey().getRoll());
	System.out.println(mape.getKey().getName());
	System.out.println(mape.getKey().getMarks());
}

	}

}

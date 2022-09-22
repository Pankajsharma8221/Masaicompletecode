package q3;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class StudentComp implements Comparator<Map.Entry<String,Student>> {

	@Override
	public int compare(Entry<String, Student> o1, Entry<String, Student> o2) {
		// TODO Auto-generated method stub
		return o2.getValue().getName().compareTo(o1.getValue().getName());
	

}
}

package Q1;

public class Difference {

	public static void main(String[] args) {
		String s1=new String("Welcome"); // here two object is created
		
		String s2="Welcome";// here one object is created  // this is also recommended approach
		
		System.out.println(s1==s2); // false compare the reference
		System.out.println(s1.equals(s2));// true because it compare the content
		
		
		
//		there is difference because of below one created in sep area string constant pool area
//		 but in first one created new object it created in new heap area then it will assign to s2.
	}
}

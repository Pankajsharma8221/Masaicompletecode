package q2;
import java.util.function.Consumer;



public class Consumerd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		
		
Consumer<Student> c2=s->{
			
			System.out.println("Roll is :"+s.getRoll());
			System.out.println("Name is :"+s.getName());
			System.out.println("Marks is :"+s.getMarks());
			
    };
		
		 
		c2.accept(new Student(10, "N1", 500));		
      }
}

	




public class bean {

public static void main(String[] args) {

		
		Student s1=new Student();
		s1.setAge(22);
		s1.setMarks(44);
		s1.setName("kkd");
		
		System.out.println(s1.getAge());
		 
        Student s2=new Student("pankaj",33,22,4400);
      
//        System.out.println(s2.getName());
        
       int marks=s2.getMarks();
       int age= s2.getAge();
       
       if(age<60&&age>18&&0<marks&&marks<500) {
    	   System.out.println(s2.getName());
       }else {
    	   System.out.println("Galti h teri");
       }

}
}

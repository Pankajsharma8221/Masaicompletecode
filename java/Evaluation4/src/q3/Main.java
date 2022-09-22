package q3;


import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    Student st=new Student();
	    
	   
	    
	    
	    
	    TreeSet<Student> stud=new TreeSet<>(new totalMarks());
	    
	    
	   
	    	System.out.println("enter name");
	    	String name=sc.next();
	    	st.setName(name);
	    	
	    	System.out.println("enter rollNo");
	    	int roll=sc.nextInt();
	    	st.setRollNo(roll);
	    	
	    	System.out.println("enter mathsMarks");
	    	int math=sc.nextInt();
	    	st.setMathsMarks(math);
	    	
	    	
	    	System.out.println("enter scienceMarks");
	    	int scin=sc.nextInt();
	    	st.setScienceMarks(scin);
	    	
	    	System.out.println("enter engMarks");
	    	int eng=sc.nextInt();
	    	st.setEngMarks(eng);
	    	
	    	
	    	
	    	int total=math+scin+eng;
	    	 st.settotalMarks(total);
	    	stud.add(new Student(roll,name,math,scin,eng,total));
	    
	    
	       

	    	System.out.println("enter name");
	    	String name1=sc.next();
	    	st.setName(name1);
	    	
	    	System.out.println("enter rollNo");
	    	int roll1=sc.nextInt();
	    	st.setRollNo(roll1);
	    	
	    	System.out.println("enter mathsMarks");
	    	int math1=sc.nextInt();
	    	st.setMathsMarks(math1);
	    	
	    	
	    	System.out.println("enter scienceMarks");
	    	int scin1=sc.nextInt();
	    	st.setScienceMarks(scin1);
	    	
	    	System.out.println("enter engMarks");
	    	int eng1=sc.nextInt();
	    	st.setEngMarks(eng1);
	  
	    	int total1=math+scin+eng;
	    	 st.settotalMarks(total1);
	    	
	    	
	    	stud.add(new Student(roll1,name1,math1,scin1,eng1,total1));
	    
	    
        if(total == total1) {
        	new TreeSet<>(new Name());
        	
        	
        }else if(name==name1){
        	new TreeSet<>(new RollNo());
        }
        else {
        	new TreeSet<>(new totalMarks());
        }
	   
      for(Student ss:stud) {
    	  System.out.println(stud);
      }
        
     
	}

}
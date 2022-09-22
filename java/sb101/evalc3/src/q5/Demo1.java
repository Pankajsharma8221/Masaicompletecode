package q5;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo1 implements Serializable{

      public static void main(String[] args) throws FileNotFoundException {
    		Student s=new Student();
    		
    		
    		
    	 	List<Student> li=Arrays.asList(new Student(10,"Pankaj",100,"kundan10","1234")
    						,new Student(10,"pankaj",1001,"pankaj","123423"),
    						new Student(10,"pankaj1",1020,"pankaj1","12343234"),
    						new Student(10,"pankaj2",1030,"pankaj2","1234323"),
    						new Student(10,"pankaj3",1040,"pankaj3","1234233"));
    		

    		
    	 	FileOutputStream FileOutputStream = new FileOutputStream("studentdata.txt");
    		
    		
    	}
	}
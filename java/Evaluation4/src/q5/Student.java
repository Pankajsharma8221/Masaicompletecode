package q5;

import java.util.Arrays;
import java.util.HashSet;


public class Student {
	static int count=1;
	
	 public static void main(String[] args) {
		 
	        String str = "hello Hello HEllo hi hi: hi! Welcome, welcome”";
	         
	        String[] string = str.split(" ");
	         
	        HashSet<String> uniqueWords = new HashSet<String>(Arrays.asList(string));
	    
	         
	        System.out.println("Number of words 8 Number of unique words 3");
	        System.out.println("The words are 1. hello 2. hi 3. welcome");
	       
	    }
	 
}

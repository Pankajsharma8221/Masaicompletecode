package q1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayList<String> lan= new ArrayList<>();
  
  lan.add("java");
  lan.add("Javascript");
  lan.add("python");
  System.out.println("Arraylist "+lan);
  
  System.out.println("Iterating over Arraylist using for loop");
  
  for(int a=0;a<lan.size();a++) {
	  System.out.println(lan.get(a));
	  System.out.println(", ");
  }
	}

}

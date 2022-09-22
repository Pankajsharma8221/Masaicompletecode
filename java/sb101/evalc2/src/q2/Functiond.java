package q2;

import java.util.function.Function;

public class Functiond{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    
		
		Function<String,Integer> s1 = s-> Integer.parseInt(s);
		System.out.println(s1.apply("200")+200);
	

	}

}

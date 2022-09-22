package q1;
import java.util.*;

public class Main {

	public static List<? super Integer> fun1(List<? super Integer> l) {
	
		return l;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter random 4 number");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		int d= sc.nextInt();
		List<Integer> l= Arrays.asList(a,b,c,d);
		Object o=fun1(l);
		System.out.println(o);
	}
}

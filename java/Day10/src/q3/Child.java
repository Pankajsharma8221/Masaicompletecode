package q3;

import java.util.Scanner;

public class Child extends Parent {
	

public void method4() {

	System.out.println("inside the method 4 child");

}

 public static void main(String[] args) {
	 Child ch=new Child();
	 
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the postive number");
	 
	 int num=sc.nextInt();
		
	if(num>0&&11>num) {
		ch.method1(num);
		ch.method2();
		ch.method4();
		ch.method3();
	
	}else {
		System.out.println("Invalid number");
		
	}
	
}

}



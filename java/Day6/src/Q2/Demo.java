package Q2;

public class Demo {
	
	Demo() {
		this(5);
		System.out.println("in the empty constructor");
	
	}

	Demo(String s) {
		this(10.34f);
		System.out.println("in the string");
	

	}

	Demo(int i) {
		this("pankaj");
		System.out.println("in the int");
		
	}

	Demo(float f) {
		System.out.println("In the float");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo myobj = new Demo();
		



	}

}

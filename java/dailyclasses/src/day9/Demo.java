package day9;

public class Demo extends A{
	
	int x=100;
	
	void funX() {
		
		System.out.println("inside funX of Demo");
	}

	
	public static void main(String[] args) {
			
		Demo d1 = new Demo();
		
		System.out.println(d1.x);
		d1.funX();
		
		System.out.println(d1.i);
		d1.funA();
		
	}

}
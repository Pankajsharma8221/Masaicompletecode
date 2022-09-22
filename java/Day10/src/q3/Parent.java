package q3;

public class Parent {
	
	int number;
	
	public void method1(int number) {
		int num=this.number=number;
		System.out.println("inside a method1 in parent : "+num);
		
	}
	
	protected void method2() {
		this.number=number;
		System.out.println("inside a method2 in parent");
	}
	void method3() {
		System.out.println("method belongs to parent class 3");
	}

	
}

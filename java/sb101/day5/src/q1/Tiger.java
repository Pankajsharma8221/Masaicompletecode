package q1;

public class Tiger extends Animal {

	@Override
	public void eat() {
		System.out.println("Tiger is eating!!");
	}
	public Tiger() throws AnimalException{
		super();
	}
	public static void main(String[] args) {
		try {
			Animal a=new Tiger();
			a.eat();
		}catch(AnimalException an) {
			System.err.println(an.getMessage());
		}
		
	}
	
}

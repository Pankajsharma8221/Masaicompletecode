package Q3;
public class Main {
	public static void main(String[] args) {
		Car c1=new Car("Harrier","Tata","black",10000,110,"tata");
		Car c2=new Car();
	
		c2.model="S";
		c2.companyName="Tesla";
		c2.color="white";
		c2.engine.rpm=2000;
		c2.engine.power=300;
		c2.engine.manufacturer="Elon Musk";
		System.out.println("Car Model "+c1.model);
		System.out.println("Car companyName "+c1.companyName);
		System.out.println("Car color "+c1.color);
		System.out.println("Car RPM " + c1.engine.rpm);
		System.out.println("Car Power "+c1.engine.power);
		System.out.println("Car Engine Manufacture "+c1.engine.manufacturer);
		System.out.println("Car Has Turbo "+c1.engine.turbo());
		System.out.println("-------------------------------------------------");
		System.out.println("Car Model "+c2.model);
		System.out.println("Car companyName "+c2.companyName);
		System.out.println("Car color "+c2.color);
		System.out.println("Car RPM " + c2.engine.rpm);
		System.out.println("Car Power "+c2.engine.power);
		System.out.println("Car Engine Manufacture "+c2.engine.manufacturer);
		System.out.println("Car Has Turbo "+c2.engine.turbo());
	}
}

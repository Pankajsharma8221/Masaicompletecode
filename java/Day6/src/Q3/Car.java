package Q3;

public class Car {
	String model;
	String companyName;
	String color;
	Engine engine=new Engine();
	public Car() {
		
	}
	public Car(String model, String companyName, String color,int rpm,int power,String manufacturer) {
		super();
		this.model = model;
		this.companyName = companyName;
		this.color = color;
		this.engine.rpm=rpm;
		this.engine.power=power;
		this.engine.manufacturer=manufacturer;
	}
	
}

package eval;

public class OLA {

	public Car bookCar(int numberOfPassenger,int numberOfKm) {
		if(numberOfPassenger<=3) {
			HatchBack a=new HatchBack();
			return a;
		}else {
			Sedan b=new Sedan();
			
			return b;
		}
	}
	
	public int calculateBill(Car car) {
		
		Car c=new Car();
	int numberOfKms=	c.getNumberOfKms();

System.out.println(numberOfKms);
	Sedan s=new Sedan();

	if(car==s) {

int farePerKm=	s.farePerKm;
int Totalfare=numberOfKms*farePerKm;
return Totalfare;
	}else {
		HatchBack h= new HatchBack();

		int farePerKm=h.farePerKm;
		int Totalfare=numberOfKms*farePerKm;
		return Totalfare;
				
	}

	
	}
}

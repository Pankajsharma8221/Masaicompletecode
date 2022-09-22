package q1;

public class OLA {

	
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		if(numberOfPassenger<=3) {
			HatchBack h=new HatchBack();
			h.setNumberOfKms(numberOfKMs);
			return h;
		}else {
			Sedan s=new Sedan();
			s.setNumberOfKms(numberOfKMs);
			return s;
			
		}
		
	}
	public int calculateBill(Car car) {
		
	int total;
	 if(car instanceof HatchBack) {
		 HatchBack h=(HatchBack)car;
		 total=h.getNumberOfKms()*h.farePerKm;
	 }else {
		 Sedan s=(Sedan)car;
		 total = s.getNumberOfKms()*s.farePerKm;
	 }
	 return total;
		
	}

}



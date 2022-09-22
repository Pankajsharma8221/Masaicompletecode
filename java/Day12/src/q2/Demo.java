package q2;

public class Demo {
public Hotel provideFood(int amount) {
	if(amount>1000) {
		TajHotel t=new TajHotel();
		return t;
	}else {
		RoadSideHotel r=new RoadSideHotel();
return r;}
}

public static void main(String[] args) {
	
}
}

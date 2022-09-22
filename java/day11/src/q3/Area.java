package q3;

public class Area extends Shape{

	@Override
	public int  rectangleArea(int length, int breadth) {
		return length*breadth;
	}
	@Override
	public int squareArea(int side) {
		return side*side;
	}
	@Override
	public int circleArea(int radius) {
		double x=3.14*(Math.pow(radius,2));
		return (int)x;
	}
}

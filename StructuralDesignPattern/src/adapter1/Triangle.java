package adapter1;

public class Triangle implements GeometricShapes{

	@Override
	public void draw() {
		System.out.println("Triangle is drawn with a specified area and perimeter");
		
	}

	@Override
	public void area() {
		System.out.println("area of triangle is provided");
	}

}

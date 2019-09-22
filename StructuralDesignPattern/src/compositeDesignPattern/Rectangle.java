package compositeDesignPattern;

public class Rectangle extends Graphic{

	public Rectangle() {
		setName("Rectangle");
	}

	@Override
	public void draw() {
		System.out.println("Rectangle is drawn");
		
	}
}

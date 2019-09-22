package compositeDesignPattern;

public class Line extends Graphic{
	
	public Line() {
		setName("Line");
	}

	@Override
	public void draw() {
		System.out.println("Line is drawn");
		
	}
}

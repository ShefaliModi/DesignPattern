package compositeDesignPattern;

public class Circle extends Graphic{
	
	public Circle() {
		setName("Circle");
	}

	@Override
	public void draw() {
		System.out.println("Circle is drawn");
		
	}

}

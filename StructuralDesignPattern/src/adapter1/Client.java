package adapter1;

import adapter1.Shape;

public class Client {
	
	public static void main(String[] args) {
		Shape shape = new Circle();
		
		shape.boundary();
		shape.createManipulator();
		
		shape = (Shape) new Adapter(new Triangle());
		
		shape.boundary();
		shape.createManipulator();
		
	}
	
	

}

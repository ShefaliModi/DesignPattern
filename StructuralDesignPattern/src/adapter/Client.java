package adapter;

public class Client {
	
	public static void main(String[] args) {
		Shape shape = new Circle();
		
		shape.boundary();
		shape.createManipulator();
		
		shape = new TextBox();
		shape.boundary();
		shape.createManipulator();
		
	}
	
	

}

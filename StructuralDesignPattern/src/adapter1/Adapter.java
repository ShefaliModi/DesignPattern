package adapter1;

public class Adapter implements Shape{
	
	private GeometricShapes adaptee;
	
	public Adapter(GeometricShapes adaptee) {
		super();
		this.adaptee = adaptee;
	}

	@Override
	public void boundary() {
		adaptee.draw();
	}

	@Override
	public void createManipulator() {
		System.out.println("cann't be resized");
	}

}

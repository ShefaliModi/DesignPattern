package adapter1;

public class Circle implements Shape{

	@Override
	public void boundary() {
		System.out.println("Circle is drawn");
	}

	@Override
	public void createManipulator() {
		System.out.println("change the size of circle");
	}

}

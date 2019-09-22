package decoratorDesignPattern;

public class ColorDecorator extends Decorator{

	public ColorDecorator(VisualComponent comp) {
		super(comp);
	}
	
	@Override
	public void draw() {
		System.out.println("implementing color change of text");
		super.draw();
		
	}

}

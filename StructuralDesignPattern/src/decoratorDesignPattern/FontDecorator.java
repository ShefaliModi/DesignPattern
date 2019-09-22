package decoratorDesignPattern;

public class FontDecorator extends Decorator{

	public FontDecorator(VisualComponent comp) {
		super(comp);
	}

	@Override
	public void draw() {
		System.out.println("implementing font change of text");
		super.draw();
	}
}

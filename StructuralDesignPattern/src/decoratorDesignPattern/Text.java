package decoratorDesignPattern;

public class Text extends VisualComponent{

	public Text() {
		setName("Text");
	}
	
	@Override
	public void draw() {
		System.out.println("The text is displayed");
		
	}
}

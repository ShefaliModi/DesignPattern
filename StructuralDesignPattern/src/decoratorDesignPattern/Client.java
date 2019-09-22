package decoratorDesignPattern;

public class Client {
	
	public static void main(String[] args) {
		
		VisualComponent comp = new Text();
		Decorator dec = new ColorDecorator(comp);
		dec.draw();
	}

}

package bridgeDesignPattern;

public class Client {

	public static void main(String[] args) {
		// lets on PM system
		
		Window window = new IconWindow(new PMWindowImpl());
		
		window.drawText();
		window.drawRect();
		
	}
}

package bridgeDesignPattern;

public class IconWindow extends Window{

	public IconWindow(WindowImpl impl) {
		super(impl);
	}
	
	public void drawBorder() {
		System.out.println("Border is drawn");
	}
	
	public void drawText() {
		System.out.println("Hi this is an icon window");
	}

}

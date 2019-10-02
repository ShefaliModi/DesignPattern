package bridgeDesignPattern;

public class TransientWindow extends Window{

	public TransientWindow(WindowImpl impl) {
		super(impl);
	}

	public void drawCloseBox() {
		System.out.println("A close box is drawn");
	}
	
	
}

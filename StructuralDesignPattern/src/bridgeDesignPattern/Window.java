package bridgeDesignPattern;

public abstract class Window {

	private WindowImpl impl;
	
	public Window(WindowImpl impl) {
		this.impl = impl;
	}
	
	public void drawText() {
		
	}
	
	public void drawRect() {
		this.impl.devDrawLine();
		this.impl.devDrawLine();
		this.impl.devDrawLine();
		this.impl.devDrawLine();
		
	}
}

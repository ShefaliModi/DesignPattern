package abstractFactory;

public class DesktopWidgetFactory implements WidgetFactory{

	public Window createWindow() {
		Window win = new DesktopWindow();
		System.out.println("Desktop window cretaed");
		return win;
	}
	
	public ScrollBar createScrollBar() {
		ScrollBar sb = new DesktopScrollBar();
		System.out.println("Desktop Scroll bar created");
		return sb;
		
	}
}

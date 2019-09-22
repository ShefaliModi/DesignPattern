package abstractFactory;

public class MobileWidgetFactory implements WidgetFactory {

	public Window createWindow() {
		Window win = new MobileWindow();
		System.out.println("Mobile Window is created");
		return win;
	}
	
	public ScrollBar createScrollBar() {
		ScrollBar sb = new MobileScrollBar();
		System.out.println("Mobile Scroll bar created");
		return sb;
		
	}
	
}

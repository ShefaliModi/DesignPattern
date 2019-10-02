package abstractFactoryInTermsOfFactory;

public class MyApplication extends Application {
		
	public ScrollBar createScrollBar(String name) {
		ScrollBar sbar = null;
		
		if(name.equalsIgnoreCase("Mobile")) {
			sbar = (ScrollBar) new MobileScrollBar();
		} else if(name.equalsIgnoreCase("Desktop")) {
			sbar = new DesktopScrollBar();
		}
		return sbar;
	}
	
	public Window createWindow(String name) {
		Window window = null;
		
		if(name.equalsIgnoreCase("Mobile")) {
			window =  new MobileWindow();
		} else if(name.equalsIgnoreCase("Desktop")) {
			window = new DesktopWindow();
		}
		return window;
	}
}

package abstractFactory;

public class Client {

	public static void main(String[] args) {
		WidgetFactory wf = new FactoryProvider().getFactory("Mobile");
		
		wf.createWindow();
		wf.createScrollBar();
		
		wf = new FactoryProvider().getFactory("Desktop");
		wf.createWindow();
		wf.createScrollBar();
		
	}
}

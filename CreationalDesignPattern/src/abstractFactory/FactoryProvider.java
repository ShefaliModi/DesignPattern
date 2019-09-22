package abstractFactory;

public class FactoryProvider {
	
	public WidgetFactory getFactory(String name) {
		WidgetFactory wf = null;
		if(name.equalsIgnoreCase("Mobile")) {
			wf = new MobileWidgetFactory();
		} else if(name.equalsIgnoreCase("Desktop")) {
			wf = new DesktopWidgetFactory();
		}
		
		return wf;
	}

}

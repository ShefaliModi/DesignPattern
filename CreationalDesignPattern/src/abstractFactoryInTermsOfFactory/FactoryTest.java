package abstractFactoryInTermsOfFactory;

public class FactoryTest {

	public static void main (String[] args) {
		
		Application app = new MyApplication();
		
		app.createScrollBar("Mobile");
		app.createWindow("Mobile");
		
		
	}
}

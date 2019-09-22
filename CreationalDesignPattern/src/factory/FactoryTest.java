package factory;

public class FactoryTest {

	public static void main (String[] args) {
		
		Application app = new MyApplication();
		
		app.newDocument("ExcelDocument");
		
		
	}
}

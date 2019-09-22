package factory;

public class MyApplication extends Application {
		
	public Document createDocument(String name) {
		Document doc = null;
		
		if(name.equalsIgnoreCase("DrawingDocument")) {
			doc = (Document) new DrawingDocument();
		} else if(name.equalsIgnoreCase("ExcelDocument")) {
			doc = new ExcelDocument();
		}
		
		
		return doc;
	}
}

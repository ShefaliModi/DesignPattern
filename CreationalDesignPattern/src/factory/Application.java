package factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Application {

	private List<Document> docs = new ArrayList<>();
	
	public abstract Document createDocument(String name);
	
	public void newDocument(String name) {
		Document doc = createDocument(name);
		System.out.println(name + " is created");
		docs.add(doc);
		doc.open();
	}
	
	public void openDocument() {
		System.out.println("Document is opened");
	}
}

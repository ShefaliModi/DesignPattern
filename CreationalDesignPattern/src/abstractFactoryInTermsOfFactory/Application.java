package abstractFactoryInTermsOfFactory;



public abstract class Application {

	//private List<Document> docs = new ArrayList<>();
	
	public abstract ScrollBar createScrollBar(String name);
	
	public abstract Window createWindow(String name);
	
	
}

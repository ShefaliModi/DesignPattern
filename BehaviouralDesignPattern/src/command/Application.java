package command;

public class Application {

	private Menu menu;
	
	public void add(Document doc) {
		this.menu = new Menu(doc);
		menu.setMenuItem(new MenuItem("open"));
		menu.add();
		menu.setMenuItem(new MenuItem("paste"));
		menu.add();
		menu.setMenuItem(new MenuItem("copy"));
		menu.add();
		menu.setMenuItem(new MenuItem("close"));
		menu.add();
		
	}
	
	
	public static void main(String[] args) {
		Document doc = new Document("A");
		Application app = new Application();
		
		app.add(doc);
	}
}

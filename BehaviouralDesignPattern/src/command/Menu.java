package command;

public class Menu {
	
	private MenuItem menuItem ;
	private Document doc;
	
	public Menu(Document doc) {
		this.doc = doc;
	}
	
	public void add() {
		if(this.menuItem.getName().equalsIgnoreCase("open")) {
			this.menuItem.setCommand(new OpenCommand());
		} else if(this.menuItem.getName().equalsIgnoreCase("close")) {
			this.menuItem.setCommand(new CloseCommand(this.doc));
		} else if(this.menuItem.getName().equalsIgnoreCase("cut")) {
			this.menuItem.setCommand(new CutCommand());
		} else if(this.menuItem.getName().equalsIgnoreCase("copy")) {
			this.menuItem.setCommand(new CopyCommand());
		} else if(this.menuItem.getName().equalsIgnoreCase("paste")) {
			this.menuItem.setCommand(new PasteCommand());
		}
		this.menuItem.clicked();
	}

	public MenuItem getMenuItem() {
		return menuItem;
	}

	public void setMenuItem(MenuItem menuItem) {
		this.menuItem = menuItem;
	}

}

package command;

public class Document {
	
	private String name;
	
	public Document(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void open() {
		System.out.println("A Document is opened");
	}
	
	public void close() {
		System.out.println("Document is closed");
	}
	
	public void cut() {
		System.out.println("the data is cut");
	}
	
	public void copy() {
		System.out.println("the data is copied");
	}
	
	public void paste() {
		System.out.println("the data is pasted");
	}

}

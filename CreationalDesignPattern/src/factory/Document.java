package factory;

public abstract class Document {
	
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public void open() {
		System.out.println("Document is opened");
	}
	
	public void close() {
		System.out.println("Document is closed");
	}
	
	public void save() {
		System.out.println("Document is saved");
	}
	
	public void revert() {
		System.out.println("Document is reverted");
	}
}

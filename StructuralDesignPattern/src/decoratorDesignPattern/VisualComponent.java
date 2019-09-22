package decoratorDesignPattern;

public abstract class VisualComponent {
	
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public abstract void draw();
}

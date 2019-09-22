package decoratorDesignPattern;

public class Decorator extends VisualComponent{

	private VisualComponent comp ;
	
	public Decorator(VisualComponent comp) {
		this.comp = comp;
	}
	
	@Override
	public void draw() {
		this.comp.draw();
		
	}
	
}

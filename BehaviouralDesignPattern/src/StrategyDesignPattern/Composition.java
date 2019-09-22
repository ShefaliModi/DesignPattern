package StrategyDesignPattern;

public class Composition {
	
	private Compositor compositor;
	
	public void traverse() {
		System.out.println("data has been read");
		
	}
	
	public void repair() {
		compositor.compose();
	}
	
	
	public Compositor getCompositor() {
		return compositor;
	}

	public void setCompositor(Compositor compositor) {
		this.compositor = compositor;
	}

	public static void main(String[] args) {
		Composition comp = new Composition();
		
		Compositor compositor1 = new SimpleCompositor();
		Compositor compositor2 = new TeXCompositor();
		Compositor compositor3 = new ArrayCompositor();
		
		comp.setCompositor(compositor1);
		comp.traverse();
		comp.repair();
		
		comp.setCompositor(compositor2);
		comp.traverse();
		comp.repair();
		
		comp.setCompositor(compositor3);
		comp.traverse();
		comp.repair();
		
	}

}

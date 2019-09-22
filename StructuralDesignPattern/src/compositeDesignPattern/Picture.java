package compositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Picture extends Graphic{

	public Picture() {
		setName("Picture");
	}
	
	private List<Graphic> graphics = new ArrayList<>();
	
	@Override
	public void draw() {
		for(Graphic g : graphics) {
			g.draw();
		}	
	}
	
	@Override
	public void add(Graphic graphic) {
		System.out.println("the Graphic "+graphic.getName()+ " has added");
		graphics.add(graphic);
	}
	
	@Override
	public void remove(Graphic graphic) {
		super.remove(graphic);
		graphics.remove(graphic);
	}
	
	@Override
	public void getChild(int num) {
		Graphic g = graphics.get(num);
		System.out.println("At location "+num + " "+ g.getName()+" is there");
	}
}

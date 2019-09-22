package compositeDesignPattern;

public class Client {

	public static void main(String[] args) {
		Graphic line = new Line();
		Graphic circle = new Circle();
		//line.draw();
		
		Graphic pic = new Picture();
		pic.add(line);
		pic .draw();
		pic.getChild(0);
		pic.add(circle);
		pic.draw();
		pic.getChild(1);
	}
}

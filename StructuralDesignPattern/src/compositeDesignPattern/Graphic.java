package compositeDesignPattern;

public abstract class Graphic {
	
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	//Graphic declares 	operations like Draw that are specific to graphical objects
	public abstract void draw();
	
	//operations that all composite objects share
	public void add(Graphic graphic) {
		System.out.println("the Graphic "+this.name+ " has added");
	}
	
	public  void remove(Graphic graphic) {
		System.out.println("the Graphic "+this.name+ " has removed");
	}
	
	public  void getChild(int num) {
		System.out.println("the Graphic "+this.name+ " has child at "+ num);
	}
	

}

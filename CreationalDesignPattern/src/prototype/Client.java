package prototype;

public class Client {

	public static void main(String[] args) {
		Animal sheep = new Sheep();
		System.out.println(sheep.hashCode());
		
		Animal sheepcopy = (Sheep) sheep.makeCopy();
		System.out.println(sheepcopy.hashCode());
		
		
		Animal tiger = new Tiger();
		System.out.println(tiger.hashCode());
		
		tiger = tiger.makeCopy();
		System.out.println(tiger.hashCode());
		
	}
}

package prototype;

public class Sheep implements Animal{
	
	public Sheep() {
		System.out.println("This is a Sheep");
	}

	@Override
	public Animal makeCopy() {
		Animal sheepCopy = null;
		try {
			sheepCopy = (Animal) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return sheepCopy;
	}

}

package prototype;

public class Tiger implements Animal{
	
	public Tiger() {
		System.out.println("This is a Tiger");
	}

	@Override
	public Animal makeCopy() {
		Animal tigerCopy = null;
		try {
			tigerCopy = (Animal) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return tigerCopy;
	}

}

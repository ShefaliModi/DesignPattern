package singleton;

public class Singleton {
	
	private static Singleton uniqueInstance = new Singleton();
	
	private String singletonData = "Singleton class"; 
	
	private Singleton() {};
	
	public static Singleton getInstance() {
		return uniqueInstance;
	}

	public String getSingletonData() {
		return singletonData;
	}

	public void setSingletonData(String singletonData) {
		this.singletonData = singletonData;
	}
	
	

}

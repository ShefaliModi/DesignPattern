package singleton;

public class Client {

	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		System.out.println(s.getSingletonData());
		s.setSingletonData("changed singleton class");
		Singleton r = Singleton.getInstance();
		System.out.println(r.getSingletonData());
	}

}

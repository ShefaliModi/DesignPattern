package observerDesignPattern;


public class Client {

	public static void main(String[] args) {
		
		Observer obsA = new ConcreteObserverA();
		
		Subject subject = new ConcreteSubject();
		
		subject.attach(obsA);
		subject.notifyAllObservers();
		
		obsA.getUpdatedState();
	}
}

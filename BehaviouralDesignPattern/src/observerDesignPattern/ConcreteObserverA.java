package observerDesignPattern;

public class ConcreteObserverA implements Observer{

	private int x ;
		
	@Override
	public void update(int val) {
		this.x = val;
		
	}
	public void getUpdatedState() {
		System.out.println("Observer A state = "+ this.x);
	}
}

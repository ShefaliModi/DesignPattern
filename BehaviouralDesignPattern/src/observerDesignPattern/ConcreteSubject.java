package observerDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{

	private List<Observer> observers = new ArrayList<>();
	
	private int x = 10;
	/*private int y = 20;
	private int z = 30;*/
	
	public int getState() {
		return this.x;
	}
	
	public void setState(int x) {
		this.x = x;
	}
	
	public void attach(Observer observer) {
		this.observers.add(observer);
		System.out.println("Observer added successfully");
	}
	
	public void detach(Observer observer) {
		this.observers.remove(observer);
		System.out.println("observer detached successfully");
		
	}
	
	public void notifyAllObservers() {
		for(Observer o: observers) {
			o.update(this.x);
		}
	}
	
}

package bridgeDesignPattern;

public class XWindowImpl implements WindowImpl{

	@Override
	public void devDrawText() {
		System.out.println("text written in X window system");
		
	}

	@Override
	public void devDrawLine() {
		System.out.println("lines are drawn at X window system");
	}

}

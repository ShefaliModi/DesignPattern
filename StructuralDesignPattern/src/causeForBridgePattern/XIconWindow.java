package causeForBridgePattern;

public class XIconWindow extends IconWindow{

	@Override
	public void drawText() {
		System.out.println("text written at any icon window");
		
	}

	@Override
	public void drawRect() {
		System.out.println("rect drawn at any icon window");
	}

}

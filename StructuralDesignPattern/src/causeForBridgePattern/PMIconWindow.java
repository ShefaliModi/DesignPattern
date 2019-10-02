package causeForBridgePattern;

public class PMIconWindow extends IconWindow{

	@Override
	public void drawText() {
		System.out.println("text written at PM Icon window");
	}

	@Override
	public void drawRect() {
		System.out.println("rect drawn at PM Icon window");
	}

	
}

package causeForBridgePattern;

public class PMWindow extends Window
{

	@Override
	public void drawText() {
		System.out.println("text at PM window");
	}

	@Override
	public void drawRect() {
		System.out.println("rectangle at PM window");
	}

}

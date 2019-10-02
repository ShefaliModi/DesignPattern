package bridgeDesignPattern;

public class PMWindowImpl implements WindowImpl{

	@Override
	public void devDrawText() {
		System.out.println("Text is written at IBM's PM window system");
	}

	@Override
	public void devDrawLine() {
		System.out.println("Lines are drawn at IBM's PM window system");
	}

}

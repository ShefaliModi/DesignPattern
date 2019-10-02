package adapter;

public class TextBox implements Shape{
	TextView text = new TextView();

	@Override
	public void boundary() {
		
		text.getExtent();
	}

	@Override
	public void createManipulator() {
		text.textManipulator();
	}

}

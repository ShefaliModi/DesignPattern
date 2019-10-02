package builder;

public class TextWidgetConverter implements TextConverter{
	
	StringBuilder strbuilder = new StringBuilder("");

	@Override
	public void convertCharacter() {
		strbuilder.append("Text is converted to new format \n" );
		
	}

	@Override
	public void convertFontChanges() {
		strbuilder.append("Text font is changes to new format \n");
		
	}

	@Override
	public void convertParagraph() {
		strbuilder.append("Paragraph format is being changed \n");
		
	}
	
	public String getText() {
		return strbuilder.toString();
	}
}

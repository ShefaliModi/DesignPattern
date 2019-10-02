package builder;

public class TeXConverter implements TextConverter{
	
	StringBuilder strbuilder = new StringBuilder("");

	@Override
	public void convertCharacter() {
		strbuilder.append("Text is converted to TeX format \n");
		
	}

	@Override
	public void convertFontChanges() {
		strbuilder.append("Text font is changes to TeX format \n ");
		
	}

	@Override
	public void convertParagraph() {
		strbuilder.append("paragraph format is being changed \n");
		
	}
	
	public String getText() {
		return strbuilder.toString();
	}

}


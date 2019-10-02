package builder;

public class ASCIIConverter implements TextConverter {
	
	StringBuilder strbuilder = new StringBuilder("");

	@Override
	public void convertCharacter() {
		strbuilder.append("Plain text is converted to ASCII \n");
		
	}

	@Override
	public void convertFontChanges() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void convertParagraph() {
		// TODO Auto-generated method stub
		
	}
	
	public String getText() {
		return strbuilder.toString();
	}
	
	

}

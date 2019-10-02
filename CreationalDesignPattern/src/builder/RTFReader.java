package builder;

public class RTFReader {
	
	
	public void parseRTF(TextConverter builder) {
		builder.convertCharacter();
		builder.convertFontChanges();
		builder.convertParagraph();
		System.out.println(builder.getText());
	}
	
	public static void main(String[] args) {
		
		String conv = "ASCII";
		
		RTFReader director = new RTFReader();
		TextConverter builder = null;
		
		if(conv.equals("ASCII")) {
			builder = new ASCIIConverter();
			
		} else if(conv.equals("TeX")) {
			builder = new TeXConverter();
		}else if(conv.equals("TextWidget")) {
			builder = new TextWidgetConverter();
		}
		
		
		director.parseRTF(builder );
		
		
	}

}

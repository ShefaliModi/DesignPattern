package command;

public class CloseCommand implements Command{
	
	private Document doc ;
	
	public CloseCommand(Document doc) {
		this.doc = doc;
	}

	@Override
	public void execute() {
		System.out.println("close command is carried out on doument: "+ this.doc.getName());
	}

	public Document getDoc() {
		return doc;
	}

	public void setDoc(Document doc) {
		this.doc = doc;
	}

}

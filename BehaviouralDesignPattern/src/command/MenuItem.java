package command;

public class MenuItem {
	
	private Command command;
	private String name;
	
	public MenuItem(String name) {
		this.name = name;
	}
	

	public void clicked() {
		this.command.execute();
	}

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

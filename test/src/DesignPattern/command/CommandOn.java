package DesignPattern.command;

public class CommandOn implements Command {

	private TV myTv;
	
	
	public CommandOn(TV myTv) {
		this.myTv = myTv;
	}

	@Override
	public void execute() {
		myTv.turnOn();
	}

}

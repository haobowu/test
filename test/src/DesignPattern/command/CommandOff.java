package DesignPattern.command;

public class CommandOff implements Command {

	private TV myTv;
	
	
	public CommandOff(TV myTv) {
		this.myTv = myTv;
	}

	@Override
	public void execute() {
		myTv.turnOff();
	}

}

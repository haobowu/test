package DesignPattern.command;

public class CommandChange implements Command {

	private TV myTv;
	private int channel;
	
	public CommandChange(TV myTv,int channel) {
		this.myTv = myTv;
		this.channel=channel;
	}

	@Override
	public void execute() {
		myTv.changeChannel(channel);
	}

}

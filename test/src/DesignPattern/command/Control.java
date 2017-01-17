package DesignPattern.command;

/**
 * invoker
 */
public class Control {

	private Command commandOn,commandOff,commandChange;

	public Control(Command commandOn, Command commandOff, Command commandChange) {
		this.commandOn = commandOn;
		this.commandOff = commandOff;
		this.commandChange = commandChange;
	}
	
	public void turnOn(){
		commandOn.execute();
	}
		
	public void turnOff(){
		commandOff.execute();
	}
	
	public void change(){
		commandChange.execute();
	}
	
}

package DesignPattern.command;

public class TestCommand {

	public static void main(String[] args) {
		//命令接收者
		TV  myTv = new TV();
		//开机具体命令
		Command commandOn = new CommandOn(myTv);
		//关机具体命令
		Command commandOff = new CommandOff(myTv);
		//换台的具体命令
		Command commandChange = new CommandChange(myTv, 3);
		
		Control c = new Control(commandOn, commandOff, commandChange);
		
		c.turnOn();
		c.change();
		c.turnOff();
	}
	
}

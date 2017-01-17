package DesignPattern.command;

public class TV {

	public int currentChannel = 0;
	
	public void turnOff(){
		System.out.println("the TV is off");
	}
	
	public void turnOn(){
		System.out.println("the TV is on");
	}
	
	public void changeChannel(int channel){
		this.currentChannel = channel;
		System.out.println("now TV channel is " + currentChannel);
	}
}

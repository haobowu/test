package DesignPattern.observer;

public class Observer1 implements Observer{

	@Override
	public void update(String str) {
		System.out.println("observer1 收到了通知." + str);
	}
	
}

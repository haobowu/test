package DesignPattern.observer;

public class Observer2 implements Observer{

	@Override
	public void update(String str) {
		System.out.println("Observer2 收到了通知.!" + str);
	}

}

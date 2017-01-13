package DesignPattern.observer;

public class MySubject extends AbstractSubject{

	@Override
	public void operation() {
		System.out.println("通知到.");
		notifyObservers("22");
	}

	public static void main(String[] args) {
		MySubject sb = new MySubject();
		sb.add(new Observer1());
		sb.add(new Observer2());
		sb.operation();
	}
}

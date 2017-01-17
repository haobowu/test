package DesignPattern.chainOfResponsibility;


public abstract  class Handler {

	protected Handler nextHandler;

	public Handler getNextHandler() {
		return nextHandler;
	}

	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}
	
	protected abstract void doHandler(double money);
}

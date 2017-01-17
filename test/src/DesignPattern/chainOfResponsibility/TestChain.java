package DesignPattern.chainOfResponsibility;

public class TestChain {

	public static void main(String[] args) {
		Handler projectHandler = new ProjectManager();
		Handler depttHandler = new DeptManager();
		projectHandler.setNextHandler(depttHandler);
		projectHandler.doHandler(501);
	}
}

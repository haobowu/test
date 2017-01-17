package DesignPattern.chainOfResponsibility;

public class DeptManager extends Handler {

	@Override
	protected void doHandler(double money) {
		if (money<=1500) {
			System.out.println("部门经理给予报销");
		}else{
			if (getNextHandler()!=null) {
				getNextHandler().doHandler(money);
			}else{
				System.out.println("部门经理无权报销");
			}
		}
	}

}

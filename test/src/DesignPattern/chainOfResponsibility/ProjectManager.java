package DesignPattern.chainOfResponsibility;

public class ProjectManager extends Handler{

	@Override
	protected void doHandler(double money) {
		if (money<=500) {
			System.out.println("项目经理给予报销");
		}else{
			if (getNextHandler()!=null) {
				getNextHandler().doHandler(money);
			}else{
				System.out.println("项目经理无权报销");
			}
		}
	}

	
}

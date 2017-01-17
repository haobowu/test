package DesignPattern.visitor;

/**
 * 创建能够被添加到购物车中代表不同类型商品(itemElement)的类
 */
public interface ItemElement {
	
	//accept方法接受访问者作为参数。
	public int accept(ShoppingCartVisitor visitor);
	
}

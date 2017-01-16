package DesignPattern.iterator;

public class MyCollection implements Collection {

	public  String[] String  = {"A","B","C","D","E","F"};
		
	@Override
	public Iterator iterator() {
		return new MyIterator(this);
	}

	@Override
	public Object get(int i) {
		return String[i];
	}

	@Override
	public int size() {
		return String.length;
	}

}

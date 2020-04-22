package unl.cse.stacks;


import unl.cse.linked_list.LinkedList;

public class Stack<T> {

	private final LinkedList<T> list = new LinkedList<T>();
	
	public T pop() {
		//TODO: implement this method
		T item = list.removeElementFromHead();
		return item;
	}
	
	public void push(T item) {
		//TODO: implement this method
		list.addElementToHead(item);
	}

	public int size() {
		//TODO: implement this method
		 return list.size();
		
	}
	
	public boolean isEmpty() {
		//TODO: implement this method
		return list.isEmpty();
	}
	
}

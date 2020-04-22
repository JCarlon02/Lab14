package unl.cse.queues;

import unl.cse.linked_list.LinkedList;

public class Queue<T> {

	private final LinkedList<T> list = new LinkedList<T>();
	
	public T dequeue() {
		T item = list.removeElementFromTail();
		return item;
	}
	
	public void enqueue(T item) {
		list.addElementToHead(item);
	}

	public int size() {
		//TODO: implement this method
		return list.size();
	}
	
	public boolean isEmpty() {

		return list.isEmpty() ;
	}
	
}

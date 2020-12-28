package queue;

import linkedlist.Node;

public class QueueUsingLL<T> {
	
	// create two nodes in LL
	private Node<T> front;
	private Node<T> rear;
	int size;
	
	// own constructor
	public QueueUsingLL(){
		front = null;
		rear = null;
		size = 0;
	}
	
	// size operation
	public int size() {
		return size;
	}
	
	// isEmpty operation
	public boolean isEmpty() {
		return size==0;
	}
	
	// enqueue operation
	public void enqueue(T elem) {
		Node<T> newNode = new Node(elem);
		size++;
		if(rear == null) {
			front = newNode;
			rear = newNode;
		}else {
			rear.next = newNode;
			rear = newNode;
		}
	}
	
	// dequeue operation
	public T dequeue() throws QueueEmptyException {
		if(front == null) {
			throw new QueueEmptyException();
		}
		T TempData = front.data;
		front = front.next;
		if(front == null) {
			rear = null;
		}
		size--;
		return TempData;
	}
	
	// front operation
	public T front() throws QueueEmptyException {
		if(front == null) {
			throw new QueueEmptyException();
		}
		return front.data;
	}
}

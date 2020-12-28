package stack2;

public class StackUsingLinkedList<T> {
	
	private Node3<T> head;
	private int size;
	
	//own constructor
	public StackUsingLinkedList(){
		head = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}
		return false;
	}

	public T top() throws StackEmptyException {
		if(head == null) {
			throw new StackEmptyException();
		}
		return head.data;
		
	}
	
	public T pop() throws StackEmptyException {
		if(head == null) {
			throw new StackEmptyException();
		}
		size--;
		Node3<T> temp = head;
		head = head.next;
		return temp.data;
	}
	
	public void push(T elem) {
		Node3<T> newNode = new Node3<>(elem);
		Node3<T> temp = head;
		head = newNode;
		head.next = temp;
		size++;
	}
}
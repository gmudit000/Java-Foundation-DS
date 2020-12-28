package stack2;

public class Node3<T> {
	T data;
	Node3<T> next;
	
	// own constructor
	public Node3(T data){
		this.data = data;
	}
	
	
	//create function
	public static Node3<Integer> createLL(){
		
		Node3<Integer> n1 = new Node3<>(4);
		Node3<Integer> n2 = new Node3<>(7);
		Node3<Integer> n3 = new Node3<>(34);
		
		n1.next = n2;
		n2.next = n3;
		return n1;
	}
	
	public static void increment(Node3<Integer> head) {
		Node3<Integer> temp = head;
		
		while(temp != null) {
			temp.data++;
			temp = temp.next;
		}
	}
	
	public static void printData(Node3<Integer> head){
		Node3<Integer> temp = head;
		
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		
	}
	
	// main function
	public static void main(String args[]) {
		Node3<Integer> head = createLL();
		increment(head);
		printData(head);
	}

}

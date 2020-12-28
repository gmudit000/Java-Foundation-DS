package linkedlist;

public class LinkedList_Use {
	
	public static Node<Integer> createLinkedList(){
		Node<Integer> n1 = new Node<Integer>(10);
		Node<Integer> n2 = new Node<Integer>(20);
		Node<Integer> n3 = new Node<Integer>(30);
		Node<Integer> n4 = new Node<Integer>(40);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		
		return n1;
		
	}
	
	public static void main(String[] args) {
		// only reference is created
		// Node n1;          
		
		// new node
//		Node<Integer> n1 = new Node<>(10);
//		System.out.println(n1);
//		System.out.println(n1.data);
//		System.out.println(n1.next);
		
		Node<Integer> head = createLinkedList();
		
	}

}

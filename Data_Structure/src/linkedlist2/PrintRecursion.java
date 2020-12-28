package linkedlist2;

public class PrintRecursion {
	
	public static Node<Integer> createLinkedList(){
		Node<Integer> n1 = new Node<Integer>(10);
		Node<Integer> n2 = new Node<Integer>(15);
		Node<Integer> n3 = new Node<Integer>(13);
		Node<Integer> n4 = new Node<Integer>(100);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		return n1;	
	}
	
	public static void printRecursively(Node<Integer> head) {
		
		// base condition
		if(head == null) {
			return;
		}
		System.out.print(head.data + " ");
		printRecursively(head.next);
	}
	
	// insertion code
	public static Node<Integer> insertAtP_R(Node<Integer> head, int ele,int pos){

		if(head == null) {
			return head;
		}
		
		if(pos==0) {
			Node<Integer> newNode = new Node<>(ele);
			newNode.next = head;
			return newNode;
		}else {
			Node<Integer> smallHead = insertAtP_R(head.next, ele, pos-1);
			head.next = smallHead;
			return head;
		}
	}
	
	public static void main(String[] args) {
		Node<Integer> head = createLinkedList();
		Node<Integer> temo  = insertAtP_R(head, 39, 8);
		printRecursively(temo);
	}

}

package linkedlist;

public class PrintLinkedList2 {
	
	public static Node<Integer> createLinkedList(){
		Node<Integer> n1 = new Node<Integer>(10);
		Node<Integer> n2 = new Node<Integer>(20);
		Node<Integer> n3 = new Node<Integer>(30);
		Node<Integer> n4 = new Node<Integer>(-1);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		return n1;
		
	}
	
	public static void print(Node<Integer> head) {
		Node<Integer> temp = head;
		
		while(temp!=null) {
			System.out.println(temp.data);
			temp= temp.next;
		}
		System.out.println();
	}
	
	public static void increment(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp!=null) {
			temp.data++;
			temp = temp.next;
		}
	}
	
	public static int calLength(Node<Integer> head) {
		int count = 0;
		Node<Integer> temp = head;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		
		Node<Integer> head = createLinkedList();
//		increment(head);
		print(head);
		int ans = calLength(head);
		System.out.println(ans);
//		print(head);
	}

}

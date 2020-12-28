package temo;

public class linkedList2_use {
	
	public static Node2 createLinkedList() {
		
		Node2 n1 = new Node2(10);
		Node2 n2 = new Node2(20);
		Node2 n3 = new Node2(30);
		Node2 n4 = new Node2(40);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		
		return n1;
	}
	
	public static void print(Node2 head) {
		Node2 temp = head;
		
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		Node2 head = createLinkedList();
		print(head);
	}
}

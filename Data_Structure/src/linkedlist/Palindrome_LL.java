package linkedlist;

public class Palindrome_LL {
	
	public static Node<Integer> createLinkedList(){
		Node<Integer> n1 = new Node<Integer>(10);
		Node<Integer> n2 = new Node<Integer>(15);
		Node<Integer> n3 = new Node<Integer>(13);
		Node<Integer> n4 = new Node<Integer>(10);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		return n1;
		
	}
	
	public static boolean Palindrome(Node<Integer> head) {
		
		if(head == null || head.next == null) {
			return true;
		}
		// calculate length
				int len = 0;
				Node<Integer> temp2 = head;
				while(temp2!=null) {
					len++;
					temp2=temp2.next;
				}
		
		Node<Integer> temp = head;
		for(int i = 1; i<=len/2; i++) {
			Node<Integer> tail = head;
			
			for(int index = 0; index<len-i; index++) {
				tail = tail.next;
			}
//			System.out.println(temp.data + " space" + tail.data );
			if(temp.data != tail.data) {
				return false;
			}
			temp = temp.next;
		}
		
		return true;	
	}

	public static void main(String[] args) {
		Node<Integer> head = createLinkedList();
		System.out.println(Palindrome(head));

	}

}

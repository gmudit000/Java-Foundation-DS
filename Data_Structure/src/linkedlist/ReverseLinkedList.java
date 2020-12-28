package linkedlist;

public class ReverseLinkedList {
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
	
	// Time Complexity = O(n^2)
	public static void ReverseLL(Node<Integer> head) {

		// calculate length
		int len = 0;
		Node<Integer> temp2 = head;
		while(temp2!=null) {
			len++;
			temp2=temp2.next;
		}
		
		
		for(int i = 1; i<=len; i++) {
			Node<Integer> temp = head;
			int index = 0;
			while(index!=len-i) {
				temp=temp.next;
				index++;
			}
			System.out.println(temp.data);
		}
		
	}
	
	// Time complexity = O(n)
	public static void ReverseLLRecursion(Node<Integer> head) {	
		// base case
		if(head == null) {
			return;
		}
		ReverseLLRecursion(head.next);
		System.out.print(head.data + " ");
	}

	public static void main(String[] args) {
		Node<Integer> head = createLinkedList();
//		ReverseLL(head);
		ReverseLLRecursion(head);
	}

}

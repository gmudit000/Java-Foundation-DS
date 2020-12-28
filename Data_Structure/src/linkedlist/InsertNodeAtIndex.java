package linkedlist;

public class InsertNodeAtIndex {
	
	public static Node<Integer> createLinkedList(){
		Node<Integer> n1 = new Node<Integer>(2);
		Node<Integer> n2 = new Node<Integer>(8);
		Node<Integer> n3 = new Node<Integer>(10);
		Node<Integer> n4 = new Node<Integer>(15);
		Node<Integer> n5 = new Node<Integer>(25);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		return n1;		
	}
	
	public static void print(Node<Integer> head) {
		Node<Integer> temp = head;
		
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public static Node<Integer> InsertAt(Node<Integer> head, int data, int pos) {
		Node<Integer> newNode = new Node<Integer>(data);
		
		// when pos = 0
		if(pos == 0) {
			newNode.next = head;
			return newNode;
		}else {
			Node<Integer> temp = head;
			int i = 0 ;
			while( i != pos-1 && temp!=null) {
				temp = temp.next;
				i++;
			}
			
			if(temp!=null) {
				Node<Integer> previousNode = temp.next;
				temp.next = newNode;
				newNode.next = previousNode;
			}	
			return head;
		}
	}
	
	
	public static void main(String[] args) {
		Node<Integer> head = createLinkedList();
						//  InsertAt(head, data, pos)
		Node<Integer> ans = InsertAt(head, 10, 8);
		print(ans);
	}
}
package linkedlist;

public class EliminateDuplicateConsecutiveElem {
	
	public static void print(Node<Integer> head) {
		Node<Integer> temp = head;
		
		while(temp!=null) {
			System.out.println(temp.data);
			temp= temp.next;
		}
		System.out.println();
	}
	
	public static Node<Integer> createLinkedList(){
		Node<Integer> n1 = new Node<Integer>(10);
		Node<Integer> n2 = new Node<Integer>(20);
		Node<Integer> n3 = new Node<Integer>(30);
		Node<Integer> n4 = new Node<Integer>(30);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		return n1;
		
	}

	public static Node<Integer> RemoveIt(Node<Integer> head){
		if(head == null || head.next == null) {
			return head;
		}
		
		Node<Integer> t1 = head;
		Node<Integer> t2 = head.next;
		while(t2 != null) {
			if(t1.data.equals(t2.data)) {
				t2 = t2.next;
			}else {
				t1.next = t2; 
				t1= t1.next;
				t2 = t2.next;
			}
		}
		t1.next = t2; 
		return head;
	}
	
	public static void main(String[] args) {
		Node<Integer> head  = createLinkedList();
		Node<Integer> ans = RemoveIt(head);
		print(ans);

	}

}

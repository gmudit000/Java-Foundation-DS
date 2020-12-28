package linkedlist;

public class DeleteNodeAtPos {
	
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
		Node<Integer> n4 = new Node<Integer>(40);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		return n1;
		
	}

	public static Node<Integer> DeleteNode(Node<Integer> head, int pos){
		Node<Integer> temp = head;
		if(pos == 0) {
			head = temp.next;
			return head;
		}else {
			int i = 0;
			while(i<pos-1 && temp!=null) {
				temp=temp.next;
				i++;
			}
			if(temp!=null && temp.next != null) {
				temp.next = temp.next.next;
			}
			return head;
		}
	}
	
//	public static int findNode(Node<Integer> head, int n) {
//		Node<Integer> temp = head;
//		int count = 0;
//		
//		while(temp!=null) {
//			if(temp.data == n) {
//				 return count;
//			}
//			temp = temp.next;
//			count++;
//		}
//		return -1;
//	}
	
//	public static Node<Integer> appendLastNtoFirst(Node<Integer> head, int n){
//		Node<Integer> temp = head;
//		int count = 0;
//		while(temp!=null) {
//			count++;
//			temp =temp.next;
//		}
//		
//		if(n == 0 || n>=count) {
//			return head;
//		}
//		
//		temp = head;
//		int i = 0;
//		int c = count-n;
//		while(i<c-1 && temp!=null) {
//			temp = temp.next;
//			i++;
//		}
//		// new head
//		if(temp!=null) {
//			Node<Integer> head2 = temp.next;
//			temp.next = null;
//			
//			Node<Integer> tail = head2;
//			while(tail.next != null) {
//				tail = tail.next;
//			}
//			tail.next = head;
//			return head2;
//		}
//		return head;
//	}
	
	
	public static void main(String[] args) {
		Node<Integer> head  = createLinkedList();
//		Node<Integer> ans = DeleteNode(head,8);
//		print(ans);
//		System.out.println(findNode(head, 60));
		
	}

}

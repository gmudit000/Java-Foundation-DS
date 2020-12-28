package linkedlist;

public class CalDataAtIndex {
	// index start from 0
	
	public static Node<Integer> createLinkedList(){
		Node<Integer> n1 = new Node<Integer>(10);
		Node<Integer> n2 = new Node<Integer>(20);
		Node<Integer> n3 = new Node<Integer>(30);
		
		n1.next = n2;
		n2.next = n3;
		return n1;	
	}
	
	public static void calDataAtIndex(Node<Integer> head, int i) {
		int count = 0;
		Node<Integer> temp = head;
		
			while(temp!=null) {
				count++;
				if(i+1 == count) {
					System.out.println(temp.data);
					break;
				}
				temp = temp.next;	
			}
		
	}
	
	public static void main(String[] args) {
		Node<Integer> head = createLinkedList();
		int i = 1;
		calDataAtIndex(head, i);
	}

}

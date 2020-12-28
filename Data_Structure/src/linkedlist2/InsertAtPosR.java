package linkedlist2;

public class InsertAtPosR {
	
	
	
	public static Node<Integer> insertAtP_R(Node<Integer> OriginalHead, Node<Integer> head, int data,int pos){
		if(head == null) {
			return head;
		}
		
		Node<Integer> temp = insertAtP_R(OriginalHead.next,head.next, data, pos-1);
		OriginalHead.next = temp;
		return OriginalHead;
	}
	
	public static void main(String[] args) {
		
	}
	
	
}

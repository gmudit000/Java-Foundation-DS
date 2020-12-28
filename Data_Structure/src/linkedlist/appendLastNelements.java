package linkedlist;

public class appendLastNelements {
	
	// write createLL function and print function
	
	public static Node<Integer> appendLastNtoFirst(Node<Integer> head, int n){
		Node<Integer> temp = head;
		int count = 0;
		while(temp!=null) {
			count++;
			temp =temp.next;
		}
		
		if(n == 0 || n>=count) {
			return head;
		}
		
		temp = head;
		int i = 0;
		int c = count-n;
		while(i<c-1 && temp!=null) {
			temp = temp.next;
			i++;
		}
		// new head
		if(temp!=null) {
			Node<Integer> head2 = temp.next;
			temp.next = null;
			
			Node<Integer> tail = head2;
			while(tail.next != null) {
				tail = tail.next;
			}
			tail.next = head;
			return head2;
		}
		return head;
	}

	public static void main(String[] args) {
//		Node<Integer> ans = appendLastNtoFirst(head,3);
//		print(ans);

	}

}

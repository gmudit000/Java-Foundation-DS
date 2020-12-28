package linkedlist;

public class FindNodeAtLL {
	
	public static int findNode(Node<Integer> head, int n) {
		Node<Integer> temp = head;
		int count = 0;
		
		while(temp!=null) {
			if(temp.data == n) {
				 return count;
			}
			temp = temp.next;
			count++;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
	}

}

package linkedlist;
import java.util.Scanner;
public class TakeInputFromUser {
	
	public static Node<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		int data= s.nextInt();
		Node<Integer>  head = null;
		
		while(data != -1) {
			Node<Integer> currentNode = new Node<Integer>(data);
			if(head == null) {
				//make this node as head node
				head = currentNode;
			}else {
				Node<Integer> tail = head;
				while(tail.next != null) {
					tail = tail.next;
				}
				// Now tail will refer to last node
				// Connect current Node after last node
				tail.next = currentNode;
			}
			
			// take next input
			data = s.nextInt();
		}
		return head;
	}
	
	public static void print(Node<Integer> head) {
		Node<Integer> temp = head;
		
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		print(head);
	}

}

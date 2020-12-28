package stack2;
import java.util.Scanner;
public class TakeINput {
	
	public static Node3<Integer> takeIN(){
		
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		
		Node3<Integer> head = null;
		Node3<Integer> tail = null;
		
		while(data != -1) {
			Node3<Integer> newNode = new Node3<>(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			}else {
				tail.next = newNode;       // creating connection previous and current node
				tail = newNode;			  // updating tail
			}
			data = s.nextInt();				// next Input
		}
		return head;
	}
	
	public static void printData(Node3<Integer> head){
		Node3<Integer> temp = head;
		
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		
	}
	
	public static void main(String[] args) {
		Node3<Integer> head = takeIN();
		printData(head);
	}

}

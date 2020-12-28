package stack2;

public class StackUsingLLUse {
	public static void main(String[] args) throws StackEmptyException {
		
//		StackUsingLinkedList<Integer> s = new StackUsingLinkedList<>();
//		s.push(10);
//		s.push(20);
//		s.push(30);
//		System.out.println(s.pop());
//		System.out.println(s.top());
//		System.out.println(s.size());
//		System.out.println(s.isEmpty());
		
		StackUsingLinkedList<Character> s = new StackUsingLinkedList<>();
		s.push('m');
		System.out.println(s.pop());
	}

}

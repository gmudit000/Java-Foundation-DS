package stack2;

import java.util.Stack;

public class StackCollection {
	
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
			s.push(10);
			s.push(20);
			System.out.println(s.size());
			System.out.println(s.peek());   	// return top element
			System.out.println(s.pop());
			System.out.println(s.isEmpty());
			
	}
}

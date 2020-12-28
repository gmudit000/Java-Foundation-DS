package stack2;
import java.util.Stack;
public class Reverse_stack {
	
	public static void reverse_Stack(Stack<Integer> s1,Stack<Integer> helper ) {
//		With one more helper stack
//		Stack<Integer> helper2 = new Stack<>();
//		
//		while(!s1.isEmpty()) {
//			int pop_elem = s1.pop();
//			helper.push(pop_elem);
//		}
//		
//		while(!helper.isEmpty()) {
//			int pop_elem = helper.pop();
//			helper2.push(pop_elem);
//		}
//		
//		while(!helper2.isEmpty()) {
//			int pop_elem = helper2.pop();
//			s1.push(pop_elem);
//		}
		
		
		// with recursion
		// base case
		if(s1.size() <= 1) {
			return;
		}
		
		int x = s1.pop();
		reverse_Stack(s1, helper);
		while(!s1.isEmpty()) {
			int pop_elem = s1.pop();
			helper.push(pop_elem);
		}
		// now s1 is empty
		// push x to s1
		s1.push(x);
        // now push all elements of helper to s1
		while(!helper.isEmpty()) {
			int pop_elem = helper.pop();
			s1.push(pop_elem);
		}	
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> helper = new Stack<>();
		
		for(int elem : arr) {
			stack.push(elem);
		}
		
		reverse_Stack(stack,helper);
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
	}

}

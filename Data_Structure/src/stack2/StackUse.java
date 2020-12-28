package stack2;

public class StackUse {
	public static void main(String[] args) throws StackFullException, StackEmptyException {
		
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter size of Stack");
//		int size = s.nextInt();
		
		StackUsingArray stack = new StackUsingArray();
		
		int[] arr = {12,23,455,67,9};
		
		for(int i = 0; i<arr.length ; i++) {
			stack.push(arr[i]);
		}
		
		stack.print();

//		System.out.println("Elements poped ");
//		
//		while(!stack.isEmpty()) {
//			System.out.println(stack.pop());
//		}

		
//		stack.push(10);
//		stack.push(20);
//		System.out.println(stack.pop());
//		System.out.println(stack.top());
//		System.out.println(stack.size());
//		System.out.println(stack.isEmpty());
//		


	}
}

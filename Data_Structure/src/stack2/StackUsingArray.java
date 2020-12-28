package stack2;

public class StackUsingArray {
	private int[] data;
	private int topIndex;
	
	//  own constructor
	public StackUsingArray(int size) {
		data = new int[size];
		topIndex = -1;
	}
	
	public StackUsingArray() {
		data = new int[2];
		topIndex = -1;
	}
	
	// push function that throws error
	// TC - O(1)
//	public void push(int elem) throws StackFullException {
//		// If stack is full
//		if(topIndex == data.length - 1) {
////			StackFullException e = new StackFullException();
////			throw e;
//			throw new StackFullException();
//		}
//		
//		topIndex++;
//		data[topIndex] = elem;
//	}
	
	// another function that deal with size
	public void push(int elem){

	if(topIndex == data.length - 1) {
		doubleCapacity();
	}
		
	topIndex++;
	data[topIndex] = elem;
}
	
	// TC - O(n)
	private void doubleCapacity() {
		System.out.println("DoubleCapacity");
		int[] temp = data;
		data = new int[2*temp.length];
		
		for(int i = 0; i<temp.length; i++) {
			data[i] = temp[i];
		}
	}

	// TC - O(1)
	public int pop() throws StackEmptyException {
		if(topIndex == -1) {
			throw new StackEmptyException();
		}
		
		int temp = data[topIndex];
		topIndex--;
		return temp;
	}
	
	// TC - O(1)
	public int top() throws StackEmptyException {
		if(topIndex == -1) {
			throw new StackEmptyException();
		}
		return data[topIndex];
	}
	
	// TC - O(1)
	public int size() {
		return topIndex+1;
	}
	
	// TC - O(1)
	public boolean isEmpty() {
		if(topIndex == -1) {
			return true;
		}
		return false;
	}
	
	public void print() {
		for(int i = 0 ; i<=topIndex; i++) {
			System.out.println(data[i]);
		}
	}

}

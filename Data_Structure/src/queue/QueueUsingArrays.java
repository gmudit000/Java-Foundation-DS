package queue;

public class QueueUsingArrays {
	
		int arr[];
		int front;
		int rear;
		int size;
		
		// own constructor
		public QueueUsingArrays() {
			arr = new int[3];
			front = -1;
			rear = -1;
		}
		
		// dequeue operation
		public int dequeue() throws QueueEmptyException {
			if(size == 0) {
				throw new QueueEmptyException();
			}
			int temp = arr[front];
//			front++;
//			
//			// when front index is equal to arr.length and still space is left
//			if(front == arr.length) {
//				front = 0;
//			}
			
			front = (front + 1)%arr.length;  // ans will always in range 0 to arr.length-1
			
			size--;
			if(size == 0) {
				front = -1;
				rear = -1;
			}
			return temp;
		}
		
		// enqueue
		public void enqueue(int elem){
			// QueueFull exception
			if(size == arr.length) {
//				throw new QueueFullException();
				doubleCapacity();
			}
			
			// when I have to insert a first position
			if(size == 0) {
				front++;
			}
//			rear++;
//			
//			// when rear index is equal to arr.length and still space is left
//			if(rear == arr.length) {
//				rear = 0;
//			}
			
			rear = (rear + 1)%arr.length;  // ans will always in range 0 to arr.length-1
			
			arr[rear] = elem;
			size++;
		}
		
		private void doubleCapacity() {
			int[] temp = arr;
			arr = new int[2*temp.length];
			int index = 0;
			for(int i = front; i <temp.length; i++) {
				arr[index++] = temp[i];
			}
			for(int i = 0 ; i<= rear ; i++) {
				arr[index++] = temp[i];
			}
			
			front = 0;
			rear = temp.length - 1;
		}

		// front
		public int front() throws QueueEmptyException {
			if(size == 0) {
				throw new QueueEmptyException();
			}
			return arr[front];
		}
		
		//size
		public int size() {
			return size;
		}
		
		//isEmpty
		public boolean isEmpty() {
			return size==0;
		}
		
		// print
		public void print() {
			for(int i = front ;i <=rear; i++) {
				System.out.print(arr[i] + " ");
			}
		}
		

}

package queue;

public class QueueUsingLLUse {
	public static void main(String[] args) throws QueueEmptyException {
		
		QueueUsingLL<Integer> queue = new QueueUsingLL<>();
		queue.enqueue(10);
		queue.enqueue(20);
		
		System.out.println(queue.dequeue());
	}
}

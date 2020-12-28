package queue;

public class QueueUsingArraysUse {
	
	public static void main(String[] args) throws QueueFullException, QueueEmptyException {
		
		QueueUsingArrays queue = new QueueUsingArrays();
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(40);
		queue.enqueue(70);
		queue.enqueue(90);
		queue.enqueue(900);


		queue.print();
	}
}

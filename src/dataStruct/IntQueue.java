package dataStruct;

public class IntQueue {

	private int[] queue;
	private int front;
	private int rear;
	private int size;
	private int total;
	
	public IntQueue() {
		this.size = 3;
		this.front =0;
		this.rear = 0;
		this.total = 0;
		this.queue = new int[this.size];
	}
	
	public boolean enqueue(int item) {
		if(!isFull()) {
			queue[rear] = item;
			rear = (rear + 1) % size;
			total++;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isFull() {
		return this.total == this.size ? true : false ;
	}
	
	public int dequeue() {
		int item = 0;
		if(!isEmpty()) {
			item = queue[front];
			front = (front + 1) % size;
			total--;
		}
		return item;
	}
	
	public boolean isEmpty() {
		return total == 0 ? true : false;
	}
}

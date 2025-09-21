package in.queue.dsa;

public class Queue {
	int arr[];
	int front;
	int rear;
	int size;
	
	public Queue(int size) {
		this.size = size;
		arr = new int[size];
		front = -1;
		rear = -1;
	}
	
	boolean isempty() {
		return rear == -1;
	}
	
	boolean isfull() {
		return front == size-1;
	}
	
	public void push(int val) {
		if(rear > front) {
		rear++;
		arr[rear] = val;
		} 
		else {
			rear = -1;
			front = -1;
		}
	}
	
	public int pop() {
		if(front >=0) {
			int a = arr[front];
			arr[front] = 0;
			front++;
		}
		if(front > rear ) {
			front = -1;
			rear = -1;
		}
	}

}

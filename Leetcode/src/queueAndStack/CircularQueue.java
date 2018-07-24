package queueAndStack;

class MyCircularQueue {
	
	private int array[];
	private int front = -1;
	private int rear = -1;
	private int len = 0;
	int capacity = 0;
	
	
	public MyCircularQueue(int k) {
		array = new int[k];
		capacity = k;
	}
	
	public boolean enqueue(int value) {
		if(len == array.length) {
			return false;
		}
		else {
			rear = (rear +1) % capacity;
			len++;
			if(front < 0) {
				front = rear;
			}
			return true;
		}				
	}
	
	public boolean dequeue() {
		if(len == 0) {
			return false;
		}
		else {
			front = (front +1) % capacity;
			len--;
			return true;
		}
	}
	
	
	public int Front() {
		return len==0? -1 : array[front];
	}
	
	public int rear() {
		return len==0? -1: array[rear];
	}
	
	public boolean isEmpty(){
		return len == 0;
	}
	
	public boolean isFull() {
		return len == array.length;
	}
}
public class CircularQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyCircularQueue cq = new MyCircularQueue(3);
		System.out.println(cq.isEmpty());
		cq.enqueue(4);
		cq.enqueue(5);
		cq.dequeue();
		System.out.println(cq.isFull());
		System.out.println(cq.isEmpty());
	
		
		
		

	}

}

package day18_03;
class MyQueue{
	int size=5;
	int[] data=new int[size];
	int front=0;
	int rear=-1;
	boolean enqueue(int add) {
		if(rear==size-1) {
			System.out.println("Queue is full");
			return false;
		}
		else {
			rear++;
			data[rear]=add;
		}
		return true;
	}
	int dequeue() {
		if(rear<front) {
			System.out.println("Queue is empty");
			return 111;
		}
		else {
			int add=data[front];
			front++;
			return add;
		}	
	}
	void printQueue() {
		for(int k:data) 
			System.out.println(k);	
	}
	boolean isEmpty() {
		if(rear<=front) {
			return true;	
	}
	return false;
	}
	void printqueue() {
		for(int i=0;i<size;i++) {
			System.out.println("fifo="+data[i]);
		}
	}
}

public class QueueUsingArray {
	public static void main(String[] args) {
		MyQueue q1=new MyQueue();
		q1.enqueue(10);
		q1.enqueue(20);
		q1.enqueue(30);
		q1.enqueue(40);
		q1.enqueue(50);
		q1.enqueue(60);
		q1.printqueue();
		int ans=q1.dequeue();
		System.out.println(ans);
		
	}
	

}
